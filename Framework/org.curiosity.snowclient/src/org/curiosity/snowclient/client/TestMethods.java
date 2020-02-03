package org.curiosity.snowclient.client;

public class TestMethods {

	public static void main(String[] args) throws Exception 
	{
		SNowATFClient client = new SNowATFClient("", "", "");
		//client.listAllAtfInputVariable("Open a New Form");
		//return;

		ServiceNow_sys_atf_test_suiteStub.InsertResponse suite = client.addTestSuite("My test suite 22", "Model Name", "aaa-bbb-ccc-dddd");
		
		ServiceNow_sys_atf_testStub.InsertResponse testCase = client.addTestCase(suite.getSys_id(), "My test case", "");

		String stepType = "Open a New Form";

		ServiceNow_sys_atf_stepStub.InsertResponse testStep = client.addTestStep(testCase.getSys_id(), stepType, "sys_user", stepType);
		
		client.setTestStepVariable(testStep.getSys_id(), stepType, "Table", "sys_user");
		
		ServiceNow_sys_atf_stepStub.InsertResponse testStepEnterFirstName = client.addTestStep(testCase.getSys_id(), "Set Field Values", "sys_user", "Set first_name");
		client.setTestStepVariable(testStepEnterFirstName.getSys_id(), "Set Field Values", "Table", "sys_user");
		client.setTestStepVariable(testStepEnterFirstName.getSys_id(), "Set Field Values", "Field values", "first_name=SHASHANK^EQ");
		
		ServiceNow_sys_atf_stepStub.InsertResponse testStepEnterLastName = client.addTestStep(testCase.getSys_id(), "Set Field Values", "sys_user", "Set last_name");
		client.setTestStepVariable(testStepEnterLastName.getSys_id(), "Set Field Values", "Table", "sys_user");
		client.setTestStepVariable(testStepEnterLastName.getSys_id(), "Set Field Values", "Field values", "last_name=MISHRA^EQ");
		
		ServiceNow_sys_atf_stepStub.InsertResponse testStepClickSubmit = client.addTestStep(testCase.getSys_id(), "Click a UI Action", "sys_user", "Click submit");
		client.setTestStepVariable(testStepClickSubmit.getSys_id(), "Click a UI Action", "Table", "sys_user");
		client.setTestStepVariable(testStepClickSubmit.getSys_id(), "Click a UI Action", "UI action", "Submit");
		
		//System.out.println(testCase.getSys_id());
		//System.out.println(testStep.getSys_id());
	}
}
