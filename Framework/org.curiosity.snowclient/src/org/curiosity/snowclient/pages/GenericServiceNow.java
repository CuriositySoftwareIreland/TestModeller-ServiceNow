package org.curiosity.snowclient.pages;

import org.curiosity.snowclient.client.ServiceNowClient;
import org.curiosity.snowclient.client.ServiceNow_sys_atf_stepStub;

public class GenericServiceNow {
    private ServiceNowClient snClient;

    public GenericServiceNow(ServiceNowClient cl)
    {
        this.snClient = cl;
    }

    public void addStepVariable(String stepType, String variableName, String variableValue) throws Exception
    {
        snClient.addStepVariable(stepType, variableName, variableValue);
    }

    /**
     * @name Open a New Form
     * @param table Name of service now table
     */
    public void openForm(String table) throws Exception{
        snClient.openForm(table);

    }

    /**
     * @name Set Field Value
     * @param table Name of service now table
     * @param variable Field to set
     * @param value Value of field
     */
    public void setFieldValue(String table, String variable, String value) throws Exception {
        snClient.setFieldValue(table, variable, value);
    }

    /**
     * @name Click Submit
     * @param table Name of service now table
     */
    public void clickSubmit(String table, String button) throws Exception {
        snClient.clickButton(table, button);
    }

    /**
     * @name Click Button
     * @param table Name of service now table
     * @param button Id of the button
     */
    public void clickButton(String table, String button) throws Exception {
        snClient.clickButton(table, button);
    }

}
