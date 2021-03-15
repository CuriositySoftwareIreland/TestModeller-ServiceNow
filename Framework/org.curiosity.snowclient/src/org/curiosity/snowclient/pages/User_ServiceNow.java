package org.curiosity.snowclient.pages;

import org.curiosity.snowclient.client.ServiceNowClient;

// http://modeller.dev.testinsights.io/app/#!/module-collection/guid/6c9cf2f9-7de5-4cc6-b499-f962d76e3c35
public class User_ServiceNow 
{
	
	
	private String First_nameElem = "first_name";

	private String Last_nameElem = "last_name";

	private String TitleElem = "title";

	private String DepartmentElem = "department";

	private String PasswordElem = "user_password";

	private String SubmitElem = "sysverb_insert";

    private ServiceNowClient snClient;

	public User_ServiceNow (ServiceNowClient cl)
	{
        this.snClient = cl;
	}

	
	
    public void OpenForm () throws Exception {
        snClient.openForm("sys_user");
    }
    public void ClickSubmit() throws Exception {
        snClient.clickSubmit("sys_user");
    }

    public void Enter_First_name(String First_name) throws Exception {
        snClient.setFieldValue("sys_user", First_nameElem, First_name);
    }

    public void Enter_Last_name(String Last_name) throws Exception {
        snClient.setFieldValue("sys_user", Last_nameElem, Last_name);
    }

    public void Enter_Title(String Title) throws Exception {
        snClient.setFieldValue("sys_user", TitleElem, Title);
    }

    public void Enter_Department(String Department) throws Exception {
        snClient.setFieldValue("sys_user", DepartmentElem, Department);
    }

    public void Enter_Password(String Password) throws Exception {
        snClient.setFieldValue("sys_user", PasswordElem, Password);
    }

    public void Click_Submit() throws Exception {
    
        snClient.clickButton("sys_user", SubmitElem);
    }
}