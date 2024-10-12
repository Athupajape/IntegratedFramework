package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTPMethodForDummy;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestCase10_DeleteMethodDummy {

	@Test
	public void testcase8() throws IOException {
		Properties pro=PropertiesHandle.readPropertiesFile("../JavaAPIFW/Test Data/URI.properties");
		HTTPMethodForDummy http=new HTTPMethodForDummy(pro);
		Response res=http.DeleteDummyMethod("DUMMY_URI", "KW");
		Boolean statusCode=validateResponse.validateStatusCode(204, res);
	}
}
