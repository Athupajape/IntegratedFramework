package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTPMethodForDummy;
import org.testing.utilities.JsonHandling;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestCase9_PutMethodDummy {

	@Test
	public void testcase9() throws IOException {
		Properties pro=PropertiesHandle.readPropertiesFile("../JavaAPIFW/Test Data/URI.properties");
		String jsondata=JsonHandling.readJsonData("../JavaAPIFW/src/test/java/org/testing/resources/UpdateDummyRequestBody.json");
		HTTPMethodForDummy http=new HTTPMethodForDummy(pro);
		Response res=http.DummyPutMethod(jsondata, "DUMMY_URI","AP");
		Boolean statusCode=validateResponse.validateStatusCode(201, res);
	}
}
