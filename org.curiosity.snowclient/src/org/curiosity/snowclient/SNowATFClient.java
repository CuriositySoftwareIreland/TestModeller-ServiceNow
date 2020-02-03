package org.curiosity.snowclient;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.impl.httpclient4.HttpTransportPropertiesImpl;
import org.apache.axis2.transport.http.impl.httpclient4.HttpTransportPropertiesImpl.Authenticator;

public class SNowATFClient 
{
	public String SNowInstanceURL = "https://dev75196.service-now.com";
	public String SNowUsername = "admin";
	public String SNowPassword = "Nokia@!00";
	
	
	private ServiceNow_sys_atf_test_suiteStub testSuiteStub;
	private ServiceNow_sys_atf_testStub testCaseStub;
	private ServiceNow_sys_atf_test_suite_testStub testSuiteTestCaseStub;
	private ServiceNow_sys_atf_step_configStub testStepConfigStub;
	private ServiceNow_atf_input_variableStub inputVariableStub;
	private ServiceNow_sys_atf_stepStub testStepStub;
	private ServiceNow_sys_variable_valueStub sysVariableValueStub;
	
	public SNowATFClient(String instanceURL, String userName, String password) throws Exception
	{
		if (instanceURL != null && !instanceURL.isEmpty())
		{
			SNowInstanceURL = instanceURL;
		}
		
		if (userName != null && !userName.isEmpty())
		{
			SNowUsername = userName;
		}
		
		if (password != null && !password.isEmpty())
		{
			SNowPassword = password;
		}
		
		testSuiteStub = new ServiceNow_sys_atf_test_suiteStub(SNowInstanceURL + "/sys_atf_test_suite.do?SOAP");
		SetStubAuth(testSuiteStub);
		
		testCaseStub = new ServiceNow_sys_atf_testStub(SNowInstanceURL + "/sys_atf_test.do?SOAP");
		SetStubAuth(testCaseStub);
		
		testSuiteTestCaseStub = new ServiceNow_sys_atf_test_suite_testStub(SNowInstanceURL + "/sys_atf_test_suite_test.do?SOAP");
		SetStubAuth(testSuiteTestCaseStub);
		
		testStepConfigStub = new ServiceNow_sys_atf_step_configStub(SNowInstanceURL + "/sys_atf_step_config.do?SOAP");
		SetStubAuth(testStepConfigStub);
		
		inputVariableStub = new ServiceNow_atf_input_variableStub(SNowInstanceURL + "/atf_input_variable.do?SOAP");
		SetStubAuth(inputVariableStub);
		
		testStepStub = new ServiceNow_sys_atf_stepStub(SNowInstanceURL + "/sys_atf_step.do?SOAP");
		SetStubAuth(testStepStub);
		
		sysVariableValueStub = new ServiceNow_sys_variable_valueStub(SNowInstanceURL + "/sys_variable_value.do?SOAP");
		SetStubAuth(sysVariableValueStub);
	}
	
	private void SetStubAuth(org.apache.axis2.client.Stub stub)
	{
		HttpTransportPropertiesImpl.Authenticator basicAuthenticator = new HttpTransportPropertiesImpl.Authenticator();
		List<String> authSchemes = new ArrayList<String>();
		authSchemes.add(Authenticator.BASIC);
		basicAuthenticator.setAuthSchemes(authSchemes); 
		basicAuthenticator.setUsername(SNowUsername);
		basicAuthenticator.setPassword(SNowPassword);
		basicAuthenticator.setPreemptiveAuthentication(true);
		stub._getServiceClient().getOptions().setProperty(org.apache.axis2.transport.http.HTTPConstants.AUTHENTICATE, basicAuthenticator);
		stub._getServiceClient().getOptions().setProperty(org.apache.axis2.transport.http.HTTPConstants.CHUNKED, "false");
	}
	
	public String getModelDescription(String modelName, String modelGuid)
	{
		return modelName + " - " + modelGuid;
	}
	
	public void getTestSuites(String modelName, String modelGuid) throws RemoteException
	{
		ServiceNow_sys_atf_test_suiteStub.GetRecords getRecords = new ServiceNow_sys_atf_test_suiteStub.GetRecords();
		getRecords.setDescription(getModelDescription(modelName, modelGuid));
		
		ServiceNow_sys_atf_test_suiteStub.GetRecordsResponse response = testSuiteStub.getRecords(getRecords);
		
		if (response != null && response.getGetRecordsResult() != null && response.getGetRecordsResult().length > 0) 
		{	
			for (int i = 0; i < response.getGetRecordsResult().length; i++) {
				org.curiosity.snowclient.ServiceNow_sys_atf_test_suiteStub.DeleteMultiple deleteMultiple = new org.curiosity.snowclient.ServiceNow_sys_atf_test_suiteStub.DeleteMultiple();
				deleteMultiple.setSys_id(response.getGetRecordsResult()[i].getSys_id());
				testSuiteStub.deleteMultiple(deleteMultiple);
			}
		}
	}
	
	public ServiceNow_sys_atf_test_suiteStub.InsertResponse addTestSuite(String testSuiteName, String modelName, String modelGuid) throws RemoteException
	{		
		ServiceNow_sys_atf_test_suiteStub.Insert insert = new ServiceNow_sys_atf_test_suiteStub.Insert();
		insert.setActive(true);
		insert.setName(testSuiteName);
		insert.setDescription(getModelDescription(modelName, modelGuid));
		
		ServiceNow_sys_atf_test_suiteStub.InsertResponse response = testSuiteStub.insert(insert);
		
		return response;
	}
	
	public ServiceNow_sys_atf_testStub.InsertResponse addTestCase(String suite_sys_id, String testCaseName, String pathGUID) throws RemoteException
	{	
		ServiceNow_sys_atf_testStub.Insert insert = new ServiceNow_sys_atf_testStub.Insert();
		insert.setActive(true);
		insert.setName(testCaseName);
		insert.setDescription(testCaseName + " - " + pathGUID);
		
		ServiceNow_sys_atf_testStub.InsertResponse response = testCaseStub.insert(insert);
		
		ServiceNow_sys_atf_test_suite_testStub.Insert suiteCaseMap = new ServiceNow_sys_atf_test_suite_testStub.Insert();
		
		suiteCaseMap.setTest_suite(suite_sys_id);
		suiteCaseMap.setTest(response.getSys_id());
		
		testSuiteTestCaseStub.insert(suiteCaseMap);
		
		return response;
	}
	
	private ServiceNow_sys_atf_step_configStub.GetResponse getSysAtfStepConfig(String stepName) throws Exception
	{
		ServiceNow_sys_atf_step_configStub.GetKeys getKeys = new ServiceNow_sys_atf_step_configStub.GetKeys();
		getKeys.setName(stepName);
		
		ServiceNow_sys_atf_step_configStub.GetKeysResponse response = testStepConfigStub.getKeys(getKeys);
		
		if (response.getSys_id().length > 0)
		{
			ServiceNow_sys_atf_step_configStub.Get get = new ServiceNow_sys_atf_step_configStub.Get();
			get.setSys_id(response.getSys_id()[0]);
			
			ServiceNow_sys_atf_step_configStub.GetResponse getResponse = testStepConfigStub.get(get);
			
			if (getResponse != null)
			{
				System.out.println("Got " + getResponse.getName() + " with sys_id " + getResponse.getSys_id());
				return getResponse;
			}
			else
			{
				throw new Exception("Cannot load step " + stepName + " with sys_id" + response.getSys_id()[0] + ". Step configuration cannot be loaded from ServiceNow instance");
			}
		}
		else
		{
			throw new Exception("Invalid step " + stepName + " provided. Step configuration cannot be found in ServiceNow instance");
		}
	}
	
	public ServiceNow_atf_input_variableStub.GetRecordsResponse getTestStepInputVariable(String stepName) throws Exception
	{
		ServiceNow_sys_atf_step_configStub.GetResponse stepConfigResponse = getSysAtfStepConfig(stepName);
		
		ServiceNow_atf_input_variableStub.GetRecords getRecords = new ServiceNow_atf_input_variableStub.GetRecords();
		getRecords.setModel_id(stepConfigResponse.getSys_id());
		ServiceNow_atf_input_variableStub.GetRecordsResponse response = inputVariableStub.getRecords(getRecords);

		
		for (int i = 0; i < response.getGetRecordsResult().length; i++) {
			System.out.println("Sys_name " + response.getGetRecordsResult()[i].getSys_name());
			System.out.println("Sys_id " + response.getGetRecordsResult()[i].getSys_id());
			System.out.println("Attributes " + response.getGetRecordsResult()[i].getAttributes());
			System.out.println("Column_Label " + response.getGetRecordsResult()[i].getColumn_label());
			System.out.println("Internal_Type " + response.getGetRecordsResult()[i].getInternal_type());
			System.out.println("Label " + response.getGetRecordsResult()[i].getLabel());
			System.out.println("Class Name " + response.getGetRecordsResult()[i].getSys_class_name());
			System.out.println("Model ID " + response.getGetRecordsResult()[i].getModel_id());
			System.out.println("Reference " + response.getGetRecordsResult()[i].getReference());
			System.out.println("Foreign_database " + response.getGetRecordsResult()[i].getForeign_database());
			System.out.println("Function_definition " + response.getGetRecordsResult()[i].getFunction_definition());
			System.out.println("******************************************");
		}
		
		return response;
	}
	
	public ServiceNow_sys_atf_stepStub.InsertResponse addTestStep(String test_sys_id, String stepType, String tableName, String displayName) throws Exception
	{
		ServiceNow_sys_atf_step_configStub.GetResponse sysAtfConfigStep = getSysAtfStepConfig(stepType);
		
		ServiceNow_sys_atf_stepStub.Insert insert = new ServiceNow_sys_atf_stepStub.Insert();
		insert.setActive(true);
		insert.setDisplay_name(displayName);
		insert.setDescription(displayName);
		insert.setTable(tableName);
		insert.setStep_config(sysAtfConfigStep.getSys_id());
		insert.setInputs(sysAtfConfigStep.getInputs());
		insert.setTest(test_sys_id);
		ServiceNow_sys_atf_stepStub.InsertResponse testStep = testStepStub.insert(insert);
		
		return testStep;
	}
	
	public void setTestStepVariable(String testStepSysId, String stepType, String variableName, String variableValue) throws Exception
	{
		try
		{
			ServiceNow_sys_variable_valueStub.GetRecordsResponse linkedVariables = getTestStepLinkedVariable(testStepSysId);
			
			ServiceNow_atf_input_variableStub.GetRecordsResponse stepVariables = getTestStepInputVariable(stepType);
			
			if (stepVariables.getGetRecordsResult() != null)
			{	
				for (int i = 0; i < stepVariables.getGetRecordsResult().length; i++) 
				{	
					if (stepVariables.getGetRecordsResult()[i].getSys_name() != null)
					{
						System.out.println("Sys name - " + stepVariables.getGetRecordsResult()[i].getSys_name());
						if (stepVariables.getGetRecordsResult()[i].getSys_name().equalsIgnoreCase(variableName))
						{
							String linkedVariableSysID = "";
							for (int j = 0; j < linkedVariables.getGetRecordsResult().length; j++) 
							{
								if (linkedVariables.getGetRecordsResult()[j].getVariable().equalsIgnoreCase(stepVariables.getGetRecordsResult()[i].getSys_id()))
								{
									linkedVariableSysID = linkedVariables.getGetRecordsResult()[j].getSys_id();
									break;
								}
							}
							
							if (!linkedVariableSysID.equals(""))
							{
								ServiceNow_sys_variable_valueStub.Update update = new ServiceNow_sys_variable_valueStub.Update();
								update.setSys_id(linkedVariableSysID);
								System.out.println("Linked Variable Sys ID - " + linkedVariableSysID);

								update.setValue(variableValue);
								update.setDocument_key(testStepSysId);
								update.setDocument("sys_atf_step");
								//update.setOrder(new BigDecimal("1"));
								update.setVariable(stepVariables.getGetRecordsResult()[i].getSys_id());
								
								sysVariableValueStub.update(update);	
							}
							else
							{
								System.out.println("Invalid sys_id detected for variable. Please check.");
							}
							
							break;
						}
						else
						{
							System.out.println("Ignore " + stepVariables.getGetRecordsResult()[i].getSys_name());
						}
					}
					else
					{
						System.out.println("Sys_name cannot be retrieved.");
					}	
				}
			}
			else
			{
				System.out.println("No variable found to set value for test step");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.getStackTrace());
			throw ex;
		}
	}
	
	public ServiceNow_sys_variable_valueStub.GetRecordsResponse getTestStepLinkedVariable(String testStepSysId) throws Exception
	{
		ServiceNow_sys_variable_valueStub.GetRecords getRecords = new ServiceNow_sys_variable_valueStub.GetRecords();
		
		getRecords.setDocument_key(testStepSysId);
		getRecords.setDocument("sys_atf_step");
		
		ServiceNow_sys_variable_valueStub.GetRecordsResponse response = sysVariableValueStub.getRecords(getRecords);
		
		return response;
	}
}