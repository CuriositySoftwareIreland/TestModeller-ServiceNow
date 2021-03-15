package org.curiosity.snowclient.tests;

import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.curiosity.snowclient.client.ServiceNowClient;

import java.lang.reflect.Method;

//http://modeller.dev.testinsights.io/app/#!/model-engine/guid/7304197d-95dd-439d-b3d8-1ea9dd88f66d
@TestModellerSuite(id = 110, profileId = 100072)
public class UserServiceNowForm_DefaultProfile
{
    private ServiceNowClient driver;
    
    public UserServiceNowForm_DefaultProfile() throws Exception
    {
        driver = new ServiceNowClient();
    
        driver.createTestSuite("UserServiceNowForm_DefaultProfile", "UserServiceNowForm_DefaultProfile", "http://modeller.dev.testinsights.io/app/#!/model-engine/guid/7304197d-95dd-439d-b3d8-1ea9dd88f66d");
    }
    
	
	
@TestModellerPath(guid = "a87de71e-bc62-4239-83b1-72e970d5cb1c")
public void OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositiveDepartmentPositivePasswordClick1() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositiveDepartmentPositivePasswordClick1", "a87de71e-bc62-4239-83b1-72e970d5cb1c");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("nisi");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("James");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Title("Mrs");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Department("HR");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Password("kMlNZ_j_dU");

		_orgcuriositysnowclientpagesUser_ServiceNow.ClickSubmit();

}

@TestModellerPath(guid = "48e0de6c-7fb4-4aab-8e03-aff6163ae176")
public void OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositiveDepartmentNegativePasswordError2() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositiveDepartmentNegativePasswordError2", "48e0de6c-7fb4-4aab-8e03-aff6163ae176");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("quam");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("Hessel");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Title("Mrs");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Department("HR");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Password("#!_ @");

}

@TestModellerPath(guid = "24b1efc6-b353-4280-97ec-c709b71a00f9")
public void OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositiveDepartmentPositivePasswordClick3() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositiveDepartmentPositivePasswordClick3", "24b1efc6-b353-4280-97ec-c709b71a00f9");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("ab");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("Langosh");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Title("Mrs");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Department("Engineering");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Password("OX0EckM3uJ");

		_orgcuriositysnowclientpagesUser_ServiceNow.ClickSubmit();

}

@TestModellerPath(guid = "e8e97340-e816-4c7a-b6c1-49c5098456ec")
public void OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositiveDepartmentPositivePasswordClick4() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositiveDepartmentPositivePasswordClick4", "e8e97340-e816-4c7a-b6c1-49c5098456ec");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("sunt");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("Mohr");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Title("Mrs");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Department("Payroll");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Password("b3bFNnBcLs");

		_orgcuriositysnowclientpagesUser_ServiceNow.ClickSubmit();

}

@TestModellerPath(guid = "c155ffde-3b66-4acc-8495-e5f558c09039")
public void OpenFormPositiveFirstnamePositiveLastnamePositiveTitleNegativeDepartmentError5() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnamePositiveLastnamePositiveTitleNegativeDepartmentError5", "c155ffde-3b66-4acc-8495-e5f558c09039");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("excepturi");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("Cruickshank");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Title("Mrs");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Department("");

}

@TestModellerPath(guid = "e8e5e91f-5851-49f6-9bcf-fb9e7f7a1638")
public void OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositiveDepartmentPositivePasswordClick6() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositiveDepartmentPositivePasswordClick6", "e8e5e91f-5851-49f6-9bcf-fb9e7f7a1638");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("at");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("Gleichner");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Title("Miss");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Department("HR");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Password("n4lw1JKcfG");

		_orgcuriositysnowclientpagesUser_ServiceNow.ClickSubmit();

}

@TestModellerPath(guid = "384717c3-e593-4935-a084-08e992b3fd50")
public void OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositiveDepartmentPositivePasswordClick7() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositiveDepartmentPositivePasswordClick7", "384717c3-e593-4935-a084-08e992b3fd50");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("quisquam");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("Morissette");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Title("Ms");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Department("HR");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Password("DCh4EPcwDQ");

		_orgcuriositysnowclientpagesUser_ServiceNow.ClickSubmit();

}

@TestModellerPath(guid = "dbe9bf2b-ba2c-4191-a6cb-c117a1d77746")
public void OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositiveDepartmentPositivePasswordClick8() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositiveDepartmentPositivePasswordClick8", "dbe9bf2b-ba2c-4191-a6cb-c117a1d77746");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("rerum");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("Bailey");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Title("Dr");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Department("HR");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Password("zjASwqvtbC");

		_orgcuriositysnowclientpagesUser_ServiceNow.ClickSubmit();

}

@TestModellerPath(guid = "b3a984fd-062b-484c-8ebf-473001972004")
public void OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositiveDepartmentPositivePasswordClick9() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositiveDepartmentPositivePasswordClick9", "b3a984fd-062b-484c-8ebf-473001972004");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("amet");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("Skiles");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Title("Mr");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Department("HR");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Password("ntkOztmwnT");

		_orgcuriositysnowclientpagesUser_ServiceNow.ClickSubmit();

}

@TestModellerPath(guid = "e2b3faae-3064-4bb6-927d-b427f8b587d7")
public void OpenFormPositiveFirstnameNegativeLastnameError10() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnameNegativeLastnameError10", "e2b3faae-3064-4bb6-927d-b427f8b587d7");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("et");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("");

}

@TestModellerPath(guid = "9932512f-ac06-4531-b2eb-917fcaf550ca")
public void OpenFormPositiveFirstnameNegativeLastnameError11() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnameNegativeLastnameError11", "9932512f-ac06-4531-b2eb-917fcaf550ca");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("voluptatem");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("#!_ @");

}

@TestModellerPath(guid = "75d9d18f-3321-4e72-b5d1-4d56ac5d6b8a")
public void OpenFormNegativeFirstnameError12() throws Exception
{
    driver.createTestCase("OpenFormNegativeFirstnameError12", "75d9d18f-3321-4e72-b5d1-4d56ac5d6b8a");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("389348");

}

	
    public static void main(String[] args)
    {
        try {
            Method[] methods = UserServiceNowForm_DefaultProfile.class.getDeclaredMethods();

            UserServiceNowForm_DefaultProfile o = new UserServiceNowForm_DefaultProfile();
            for (Method method : methods) {
                if (method.getName().equals("main"))
                    continue;

                System.out.println("Invoking Method: " + method.getName());

                method.invoke(o);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }	
}
