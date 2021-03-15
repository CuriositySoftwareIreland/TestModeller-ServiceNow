package org.curiosity.snowclient.tests;

import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.curiosity.snowclient.client.ServiceNowClient;

import java.lang.reflect.Method;

//http://modeller.dev.testinsights.io/app/#!/model-engine/guid/061a220e-42d5-44ac-8096-2f8b4a411da9
@TestModellerSuite(id = 99, profileId = 100058)
public class SysUserForm_DefaultProfile
{
    private ServiceNowClient driver;

    public SysUserForm_DefaultProfile() throws Exception
    {
        driver = new ServiceNowClient();

        driver.createTestSuite("SysUserForm_DefaultProfile", "SysUserForm_DefaultProfile", "http://modeller.dev.testinsights.io/app/#!/model-engine/guid/061a220e-42d5-44ac-8096-2f8b4a411da9");
    }



    @TestModellerPath(guid = "046453c0-44f9-4513-9aba-c1093414876c")
    public void OpenFormPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterTitlePositiveEnterPasswordPosi1() throws Exception
    {
        driver.createTestCase("OpenFormPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterTitlePositiveEnterPasswordPosi1", "046453c0-44f9-4513-9aba-c1093414876c");


        org.curiosity.snowclient.pages.SysUserPage _orgcuriositysnowclientpagesSysUserPage = new org.curiosity.snowclient.pages.SysUserPage(driver);
        _orgcuriositysnowclientpagesSysUserPage.OpenForm();


        _orgcuriositysnowclientpagesSysUserPage.EnterFirstName("consequatur");

        _orgcuriositysnowclientpagesSysUserPage.EnterLastName("Doyle");

        _orgcuriositysnowclientpagesSysUserPage.EnterTitle("mr");

        _orgcuriositysnowclientpagesSysUserPage.EnterPassword("ih1WfoviOk");

        _orgcuriositysnowclientpagesSysUserPage.EnterMobilePhone("1-742-711-9071");

        _orgcuriositysnowclientpagesSysUserPage.SetLockedOut(true);

        _orgcuriositysnowclientpagesSysUserPage.ClickSubmit();

    }
    public static void main(String[] args)
    {
        try {
            Method[] methods = SysUserForm_DefaultProfile.class.getDeclaredMethods();

            SysUserForm_DefaultProfile o = new SysUserForm_DefaultProfile();
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