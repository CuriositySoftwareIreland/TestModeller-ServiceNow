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

    @TestModellerPath(guid = "e5df89ff-14bd-4fc8-841f-401178db51fe")
    public void OpenFormPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterTitlePositiveEnterPasswordPosi2() throws Exception
    {
        driver.createTestCase("OpenFormPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterTitlePositiveEnterPasswordPosi2", "e5df89ff-14bd-4fc8-841f-401178db51fe");


        org.curiosity.snowclient.pages.SysUserPage _orgcuriositysnowclientpagesSysUserPage = new org.curiosity.snowclient.pages.SysUserPage(driver);
        _orgcuriositysnowclientpagesSysUserPage.OpenForm();


        _orgcuriositysnowclientpagesSysUserPage.EnterFirstName("aut");

        _orgcuriositysnowclientpagesSysUserPage.EnterLastName("Treutel");

        _orgcuriositysnowclientpagesSysUserPage.EnterTitle("mr");

        _orgcuriositysnowclientpagesSysUserPage.EnterPassword("yEFqmaJvdQ");

        _orgcuriositysnowclientpagesSysUserPage.EnterMobilePhone("782.549.2342 x8362");

        _orgcuriositysnowclientpagesSysUserPage.SetLockedOut(false);

        _orgcuriositysnowclientpagesSysUserPage.ClickSubmit();

    }

    @TestModellerPath(guid = "5e36e068-7b17-4cb0-bc9d-c45df3f0f2b4")
    public void OpenFormPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterTitlePositiveEnterPasswordNega3() throws Exception
    {
        driver.createTestCase("OpenFormPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterTitlePositiveEnterPasswordNega3", "5e36e068-7b17-4cb0-bc9d-c45df3f0f2b4");


        org.curiosity.snowclient.pages.SysUserPage _orgcuriositysnowclientpagesSysUserPage = new org.curiosity.snowclient.pages.SysUserPage(driver);
        _orgcuriositysnowclientpagesSysUserPage.OpenForm();


        _orgcuriositysnowclientpagesSysUserPage.EnterFirstName("sequi");

        _orgcuriositysnowclientpagesSysUserPage.EnterLastName("Kuhn");

        _orgcuriositysnowclientpagesSysUserPage.EnterTitle("mr");

        _orgcuriositysnowclientpagesSysUserPage.EnterPassword("fgVU2f9ZFR");

        _orgcuriositysnowclientpagesSysUserPage.EnterMobilePhone("");

    }

    @TestModellerPath(guid = "655f4c41-1caa-49a1-9888-34c4259cf6e8")
    public void OpenFormPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterTitlePositiveEnterPasswordNega4() throws Exception
    {
        driver.createTestCase("OpenFormPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterTitlePositiveEnterPasswordNega4", "655f4c41-1caa-49a1-9888-34c4259cf6e8");


        org.curiosity.snowclient.pages.SysUserPage _orgcuriositysnowclientpagesSysUserPage = new org.curiosity.snowclient.pages.SysUserPage(driver);
        _orgcuriositysnowclientpagesSysUserPage.OpenForm();


        _orgcuriositysnowclientpagesSysUserPage.EnterFirstName("dolorum");

        _orgcuriositysnowclientpagesSysUserPage.EnterLastName("Johnson");

        _orgcuriositysnowclientpagesSysUserPage.EnterTitle("mr");

        _orgcuriositysnowclientpagesSysUserPage.EnterPassword("9b8aIHIJXI");

        _orgcuriositysnowclientpagesSysUserPage.EnterMobilePhone("#!_ @");

    }

    @TestModellerPath(guid = "cb9f20b7-6605-41ea-adc3-5df09c80b2e9")
    public void OpenFormPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterTitleNegativeEnterPasswordErro5() throws Exception
    {
        driver.createTestCase("OpenFormPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterTitleNegativeEnterPasswordErro5", "cb9f20b7-6605-41ea-adc3-5df09c80b2e9");


        org.curiosity.snowclient.pages.SysUserPage _orgcuriositysnowclientpagesSysUserPage = new org.curiosity.snowclient.pages.SysUserPage(driver);
        _orgcuriositysnowclientpagesSysUserPage.OpenForm();


        _orgcuriositysnowclientpagesSysUserPage.EnterFirstName("qui");

        _orgcuriositysnowclientpagesSysUserPage.EnterLastName("Torp");

        _orgcuriositysnowclientpagesSysUserPage.EnterTitle("mr");

        _orgcuriositysnowclientpagesSysUserPage.EnterPassword("#!_ @");

    }

    @TestModellerPath(guid = "f30b0b3f-f664-4ffb-b137-af847a12b46f")
    public void OpenFormPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterTitlePositiveEnterPasswordPosi6() throws Exception
    {
        driver.createTestCase("OpenFormPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterTitlePositiveEnterPasswordPosi6", "f30b0b3f-f664-4ffb-b137-af847a12b46f");


        org.curiosity.snowclient.pages.SysUserPage _orgcuriositysnowclientpagesSysUserPage = new org.curiosity.snowclient.pages.SysUserPage(driver);
        _orgcuriositysnowclientpagesSysUserPage.OpenForm();


        _orgcuriositysnowclientpagesSysUserPage.EnterFirstName("voluptatem");

        _orgcuriositysnowclientpagesSysUserPage.EnterLastName("Weimann");

        _orgcuriositysnowclientpagesSysUserPage.EnterTitle("miss");

        _orgcuriositysnowclientpagesSysUserPage.EnterPassword("crWYvjC79b");

        _orgcuriositysnowclientpagesSysUserPage.EnterMobilePhone("1-637-745-3111 x4039");

        _orgcuriositysnowclientpagesSysUserPage.SetLockedOut(true);

        _orgcuriositysnowclientpagesSysUserPage.ClickSubmit();

    }

    @TestModellerPath(guid = "cf4e69fc-aba3-4d22-878c-5de82e95719c")
    public void OpenFormPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterTitlePositiveEnterPasswordPosi7() throws Exception
    {
        driver.createTestCase("OpenFormPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterTitlePositiveEnterPasswordPosi7", "cf4e69fc-aba3-4d22-878c-5de82e95719c");


        org.curiosity.snowclient.pages.SysUserPage _orgcuriositysnowclientpagesSysUserPage = new org.curiosity.snowclient.pages.SysUserPage(driver);
        _orgcuriositysnowclientpagesSysUserPage.OpenForm();


        _orgcuriositysnowclientpagesSysUserPage.EnterFirstName("quibusdam");

        _orgcuriositysnowclientpagesSysUserPage.EnterLastName("Bahringer");

        _orgcuriositysnowclientpagesSysUserPage.EnterTitle("mrs");

        _orgcuriositysnowclientpagesSysUserPage.EnterPassword("utffpBbbcI");

        _orgcuriositysnowclientpagesSysUserPage.EnterMobilePhone("1-652-353-3310");

        _orgcuriositysnowclientpagesSysUserPage.SetLockedOut(true);

        _orgcuriositysnowclientpagesSysUserPage.ClickSubmit();

    }

    @TestModellerPath(guid = "f1fb7500-eded-4d59-bbb6-593a0c204801")
    public void OpenFormPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterTitlePositiveEnterPasswordPosi8() throws Exception
    {
        driver.createTestCase("OpenFormPositiveEnterFirstNamePositiveEnterLastNamePositiveEnterTitlePositiveEnterPasswordPosi8", "f1fb7500-eded-4d59-bbb6-593a0c204801");


        org.curiosity.snowclient.pages.SysUserPage _orgcuriositysnowclientpagesSysUserPage = new org.curiosity.snowclient.pages.SysUserPage(driver);
        _orgcuriositysnowclientpagesSysUserPage.OpenForm();


        _orgcuriositysnowclientpagesSysUserPage.EnterFirstName("possimus");

        _orgcuriositysnowclientpagesSysUserPage.EnterLastName("Effertz");

        _orgcuriositysnowclientpagesSysUserPage.EnterTitle("ms");

        _orgcuriositysnowclientpagesSysUserPage.EnterPassword("6PWbDSAp7M");

        _orgcuriositysnowclientpagesSysUserPage.EnterMobilePhone("(604) 204-8431");

        _orgcuriositysnowclientpagesSysUserPage.SetLockedOut(true);

        _orgcuriositysnowclientpagesSysUserPage.ClickSubmit();

    }

    @TestModellerPath(guid = "fee874e9-7325-4a83-9246-dd8eb51e6f69")
    public void OpenFormPositiveEnterFirstNameNegativeEnterLastNameError9() throws Exception
    {
        driver.createTestCase("OpenFormPositiveEnterFirstNameNegativeEnterLastNameError9", "fee874e9-7325-4a83-9246-dd8eb51e6f69");


        org.curiosity.snowclient.pages.SysUserPage _orgcuriositysnowclientpagesSysUserPage = new org.curiosity.snowclient.pages.SysUserPage(driver);
        _orgcuriositysnowclientpagesSysUserPage.OpenForm();


        _orgcuriositysnowclientpagesSysUserPage.EnterFirstName("modi");

        _orgcuriositysnowclientpagesSysUserPage.EnterLastName("");

    }

    @TestModellerPath(guid = "0d2f04a4-90e6-44fc-b2b5-b86652709efc")
    public void OpenFormPositiveEnterFirstNameNegativeEnterLastNameError10() throws Exception
    {
        driver.createTestCase("OpenFormPositiveEnterFirstNameNegativeEnterLastNameError10", "0d2f04a4-90e6-44fc-b2b5-b86652709efc");


        org.curiosity.snowclient.pages.SysUserPage _orgcuriositysnowclientpagesSysUserPage = new org.curiosity.snowclient.pages.SysUserPage(driver);
        _orgcuriositysnowclientpagesSysUserPage.OpenForm();


        _orgcuriositysnowclientpagesSysUserPage.EnterFirstName("distinctio");

        _orgcuriositysnowclientpagesSysUserPage.EnterLastName("#!_ @");

    }

    @TestModellerPath(guid = "a0e03682-3927-4ff4-b4a0-49e25a5a695f")
    public void OpenFormNegativeEnterFirstNameError11() throws Exception
    {
        driver.createTestCase("OpenFormNegativeEnterFirstNameError11", "a0e03682-3927-4ff4-b4a0-49e25a5a695f");


        org.curiosity.snowclient.pages.SysUserPage _orgcuriositysnowclientpagesSysUserPage = new org.curiosity.snowclient.pages.SysUserPage(driver);
        _orgcuriositysnowclientpagesSysUserPage.OpenForm();


        _orgcuriositysnowclientpagesSysUserPage.EnterFirstName("389348");

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