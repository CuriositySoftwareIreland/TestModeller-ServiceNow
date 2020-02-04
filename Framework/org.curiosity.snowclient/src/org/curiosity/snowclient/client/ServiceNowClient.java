/**
 * 
 */
package org.curiosity.snowclient.client;

import java.io.InputStream;
import java.io.IOException;
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
		try (InputStream input = ServiceNowClient.class.getClassLoader().getResourceAsStream("resources/config.properties")) {

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

	/**
	 * @name Open a New Form
	 * @param table Name of service now table
	 */
	public void openForm(String table) throws Exception{
		String stepType = "Open a New Form";

		ServiceNow_sys_atf_stepStub.InsertResponse testStep = client.addTestStep(currentTestCaseSysId, stepType, table, stepType);

		client.setTestStepVariable(testStep.getSys_id(), stepType, "Table", table);

	}

	/**
	 * @name Set Field Value
	 * @param table Name of service now table
	 * @param variable Field to set
	 * @param value Value of field
	 */
	public void setFieldValue(String table, String variable, String value) throws Exception {
		ServiceNow_sys_atf_stepStub.InsertResponse testStepEnterLastName = client.addTestStep(currentTestCaseSysId, "Set Field Values", table, "Set field " + variable + " with value " + value);

		client.setTestStepVariable(testStepEnterLastName.getSys_id(), "Set Field Values", "Table", table);

		client.setTestStepVariable(testStepEnterLastName.getSys_id(), "Set Field Values", "Field values", variable + "=" + value);
	}

	/**
	 * @name Click Submit
	 * @param table Name of service now table
	 */
	public void clickSubmit(String table) throws Exception {
		ServiceNow_sys_atf_stepStub.InsertResponse testStepClickSubmit = client.addTestStep(currentTestCaseSysId, "Click a UI Action", table, "Click submit");
		client.setTestStepVariable(testStepClickSubmit.getSys_id(), "Click a UI Action", "Table", table);

		client.setTestStepVariable(testStepClickSubmit.getSys_id(), "Click a UI Action", "UI Action", "Submit");
	}

	/**
	 * @name Click Button
	 * @param table Name of service now table
	 * @param button Button name
	 */
	public void clickButton(String table, String button) throws Exception {
		ServiceNow_sys_atf_stepStub.InsertResponse testStepClickSubmit = client.addTestStep(currentTestCaseSysId, "Click a UI Action", table, "Click " + button);
		client.setTestStepVariable(testStepClickSubmit.getSys_id(), "Click a UI Action", "Table", table);

		client.setTestStepVariable(testStepClickSubmit.getSys_id(), "Click a UI Action", "UI Action", button);
	}
}
