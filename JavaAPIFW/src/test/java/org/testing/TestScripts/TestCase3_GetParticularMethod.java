package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestCase3_GetParticularMethod {
	
	@Test
	public void testcase3() throws IOException {
		Properties pro=PropertiesHandle.readPropertiesFile("../JavaAPIFW/Test Data/URI.properties");
		//String jsondata=JsonHandling.readJsonData("../APIFWJuly/src/test/java/org/testing/resources/RequestBody.json");
		HTTPMethods http=new HTTPMethods(pro);
		Response res=http.GetParticularMethod("REAL_URI", "2");
		Boolean statusCode=validateResponse.validateStatusCode(200, res);
	}
}
