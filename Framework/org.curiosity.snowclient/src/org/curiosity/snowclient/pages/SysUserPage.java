package org.curiosity.snowclient.pages;

import org.curiosity.snowclient.client.ServiceNowClient;

public class SysUserPage {
    private ServiceNowClient snClient;

    private String formName = "sys_user";

    private String firstNameField = "first_name";

    private String lastNameField = "last_name";

    private String titleField = "title";

    private String departmentField = "department";

    private String passwordResetField = "password_needs_reset";

    private String lockedOutField = "locked_out";

    private String passwordField = "user_password";

    private String phoneField = "phone";

    private String mobileField = "mobile_phone";

    private String submitButton = "Submit";

    public SysUserPage(ServiceNowClient cl)
    {
        this.snClient = cl;
    }

    public void OpenForm() throws Exception {
        snClient.openForm(formName);
    }

    public void EnterFirstName(String firstName) throws Exception {
        snClient.setFieldValue(formName, firstNameField, firstName);
    }

    public void EnterLastName(String lastName) throws Exception {
        snClient.setFieldValue(formName, lastNameField, lastName);
    }

    public void EnterTitle(String title) throws Exception {
        snClient.setFieldValue(formName, titleField, title);
    }

    public void EnterDepartment(String department) throws Exception {
        snClient.setFieldValue(formName, departmentField, department);
    }

    public void SetPasswordReset(Boolean password) throws Exception {
        snClient.setFieldValue(formName, passwordResetField, password.toString());
    }

    public void SetLockedOut(Boolean lockedout) throws Exception {
        snClient.setFieldValue(formName, lockedOutField, lockedout.toString());
    }

    public void EnterPassword(String password) throws Exception {
        snClient.setFieldValue(formName, passwordField, password);
    }

    public void EnterBusinessPhone(String phoneNumber) throws Exception {
        snClient.setFieldValue(formName, phoneField, phoneNumber);
    }

    public void EnterMobilePhone(String mobilePhone) throws Exception {
        snClient.setFieldValue(formName, mobileField, mobilePhone);
    }

    public void ClickSubmit() throws Exception {
        snClient.clickSubmit(formName);
    }
}
