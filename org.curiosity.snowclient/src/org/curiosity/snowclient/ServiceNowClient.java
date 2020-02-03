/**
 * 
 */
package org.curiosity.snowclient;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.rmi.RemoteException;
import java.util.Properties;

/**
 * @author Curiosity Software Ireland Ltd.
 *
 */
public class ServiceNowClient 
{
	private String testSuiteSysId;
	private String currentTestCaseSysId;
	private String currentTestStepSysId;
	
	private SNowATFClient client;
	
	public ServiceNowClient() throws Exception
	{
		try (InputStream input = ServiceNowClient.class.getClassLoader().getResourceAsStream("config.properties")) {

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }

            //load a properties file from class path, inside static method
            prop.load(input);

            //get the property value and print it out
            String instanceURL = prop.getProperty("SNowInstanceURL");
            String username = prop.getProperty("SNowUsername");
            String password = prop.getProperty("SNowPassword");
            
            client = new SNowATFClient(instanceURL, username, password);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	
	public void createTestSuite(String testSuiteName, String modelName, String modelGuid) throws Exception
	{
		 testSuiteSysId = client.addTestSuite(testSuiteName, modelName, modelGuid).getSys_id();
	}
	
	public void createTestCase(String testCaseName, String pathGuid) throws Exception
	{
		 currentTestCaseSysId = client.addTestCase(testSuiteSysId, testCaseName, pathGuid).getSys_id();
	}
	
	public void createTestStep(String stepType, String displayName, String tableName) throws Exception
	{
		currentTestStepSysId = client.addTestStep(currentTestCaseSysId, stepType, tableName, displayName).getSys_id();
	}
	
	public void addStepVariable(String stepType, String variableName, String variableValue) throws Exception
	{
		client.setTestStepVariable(currentTestStepSysId, stepType, variableName, variableValue);
	}

	public void setFieldValue(String table, String variable, String value) throws Exception {
		ServiceNow_sys_atf_stepStub.InsertResponse testStepEnterLastName = client.addTestStep(currentTestCaseSysId, "Set Field Values", table, "Set field");

		client.setTestStepVariable(testStepEnterLastName.getSys_id(), "Set Field Values", "Table", table);

		client.setTestStepVariable(testStepEnterLastName.getSys_id(), "Set Field Values", "Field values", variable + "=" + value);
	}

	public void clickSubmit(String table) throws Exception {
		ServiceNow_sys_atf_stepStub.InsertResponse testStepClickSubmit = client.addTestStep(currentTestCaseSysId, "Click a UI Action", "sys_user", "Click submit");
		client.setTestStepVariable(testStepClickSubmit.getSys_id(), "Click a UI Action", "Table", table);
	}
}
