package org.curiosity.snowclient.tests;

import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.curiosity.snowclient.client.ServiceNowClient;

import java.lang.reflect.Method;

//http://modeller.dev.testinsights.io/app/#!/model-engine/guid/1f28ba73-9d41-4b74-9ec3-60000e161ed6
@TestModellerSuite(id = 107, profileId = 100071)
public class UserSubmission_DefaultProfile
{
    private ServiceNowClient driver;
    
    public UserSubmission_DefaultProfile() throws Exception
    {
        driver = new ServiceNowClient();
    
        driver.createTestSuite("UserSubmission_DefaultProfile", "UserSubmission_DefaultProfile", "http://modeller.dev.testinsights.io/app/#!/model-engine/guid/1f28ba73-9d41-4b74-9ec3-60000e161ed6");
    }
    
	
	
@TestModellerPath(guid = "56592712-a7f5-40a5-820b-17df43ce32f6")
public void OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositivePasswordSubmitSuccess1() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositivePasswordSubmitSuccess1", "56592712-a7f5-40a5-820b-17df43ce32f6");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("quam");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("Dibbert");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Title("Mrs");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Password("aEreOhjkSd");

		_orgcuriositysnowclientpagesUser_ServiceNow.Click_Submit();

}

@TestModellerPath(guid = "df4ea79b-0e7c-4fce-b0c6-32eced1a2494")
public void OpenFormPositiveFirstnamePositiveLastnamePositiveTitleNegativePasswordError2() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnamePositiveLastnamePositiveTitleNegativePasswordError2", "df4ea79b-0e7c-4fce-b0c6-32eced1a2494");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("rerum");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("Huels");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Title("Mrs");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Password("#!_ @");

}

@TestModellerPath(guid = "63faf9b4-4f2c-4e4e-bf98-843d0b6029b5")
public void OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositivePasswordSubmitSuccess3() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositivePasswordSubmitSuccess3", "63faf9b4-4f2c-4e4e-bf98-843d0b6029b5");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("aut");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("Bashirian");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Title("Mr");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Password("k2lIiqSnoj");

		_orgcuriositysnowclientpagesUser_ServiceNow.Click_Submit();

}

@TestModellerPath(guid = "d73e20fc-223f-4db2-9914-d8a2bc134697")
public void OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositivePasswordSubmitSuccess4() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositivePasswordSubmitSuccess4", "d73e20fc-223f-4db2-9914-d8a2bc134697");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("similique");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("Kutch");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Title("Miss");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Password("FLz_Mw9Qt0");

		_orgcuriositysnowclientpagesUser_ServiceNow.Click_Submit();

}

@TestModellerPath(guid = "2214bb3b-5eb8-4dee-93f9-272bfc5a7f51")
public void OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositivePasswordSubmitSuccess5() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositivePasswordSubmitSuccess5", "2214bb3b-5eb8-4dee-93f9-272bfc5a7f51");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("voluptatem");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("Casper");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Title("Ms");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Password("fTOFQLSlaz");

		_orgcuriositysnowclientpagesUser_ServiceNow.Click_Submit();

}

@TestModellerPath(guid = "1f04ee0d-aa8f-4380-9048-a0553f244512")
public void OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositivePasswordSubmitSuccess6() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnamePositiveLastnamePositiveTitlePositivePasswordSubmitSuccess6", "1f04ee0d-aa8f-4380-9048-a0553f244512");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("quia");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("Reynolds");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Title("Dr");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Password("cMfzpQ9otI");

		_orgcuriositysnowclientpagesUser_ServiceNow.Click_Submit();

}

@TestModellerPath(guid = "9fdcbcdd-5122-46fd-b2d4-675cac606b62")
public void OpenFormPositiveFirstnameNegativeLastnameError7() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnameNegativeLastnameError7", "9fdcbcdd-5122-46fd-b2d4-675cac606b62");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("eos");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("");

}

@TestModellerPath(guid = "6f83e348-23fb-4a6f-9117-65d8680523f8")
public void OpenFormPositiveFirstnameNegativeLastnameError8() throws Exception
{
    driver.createTestCase("OpenFormPositiveFirstnameNegativeLastnameError8", "6f83e348-23fb-4a6f-9117-65d8680523f8");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("recusandae");

		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_Last_name("#!_ @");

}

@TestModellerPath(guid = "aacd7572-8b03-4104-94d7-bc078b55dede")
public void OpenFormNegativeFirstnameError9() throws Exception
{
    driver.createTestCase("OpenFormNegativeFirstnameError9", "aacd7572-8b03-4104-94d7-bc078b55dede");
    
	
	org.curiosity.snowclient.pages.User_ServiceNow _orgcuriositysnowclientpagesUser_ServiceNow = new org.curiosity.snowclient.pages.User_ServiceNow(driver);
		_orgcuriositysnowclientpagesUser_ServiceNow.OpenForm();


		_orgcuriositysnowclientpagesUser_ServiceNow.Enter_First_name("389348");

}

	
    public static void main(String[] args)
    {
        try {
            Method[] methods = UserSubmission_DefaultProfile.class.getDeclaredMethods();

            UserSubmission_DefaultProfile o = new UserSubmission_DefaultProfile();
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
