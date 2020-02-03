package org.curiosity.snowclient.tests;

import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.curiosity.snowclient.ServiceNowClient;

//http://modeller.dev.testinsights.io/app/#!/model-engine/guid/bae67d9b-a842-475c-bcc3-cedaef077792
@TestModellerSuite(id = 96, profileId = 100056)
public class Model_DefaultProfile
{
    private ServiceNowClient snClient;

    public Model_DefaultProfile() throws Exception
    {
        snClient = new ServiceNowClient();

        snClient.createTestSuite("Model_DefaultProfile", "Model_DefaultProfile", "http://modeller.dev.testinsights.io/app/#!/model-engine/guid/bae67d9b-a842-475c-bcc3-cedaef077792");
    }

    @TestModellerPath(guid = "cf863480-d6d5-4287-8072-b67717cafe94")
    public void PositivesetFieldValue() throws Exception
    {
        snClient.createTestCase("PositivesetFieldValue", "cf863480-d6d5-4287-8072-b67717cafe94");

        snClient.setFieldValue("sys_user", "first_name", "james");
    }
}
