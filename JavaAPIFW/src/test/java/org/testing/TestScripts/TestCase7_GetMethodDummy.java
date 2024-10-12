package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTPMethodForDummy;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestCase7_GetMethodDummy {

	@Test
	public void testcase7() throws IOException {
		Properties pro=PropertiesHandle.readPropertiesFile("../JavaAPIFW/Test Data/URI.properties");
		HTTPMethodForDummy http=new HTTPMethodForDummy(pro);
		Response res=http.DummyGetMethod("DUMMY_URI");
		Boolean statusCode=validateResponse.validateStatusCode(200, res);
	}
	
}
