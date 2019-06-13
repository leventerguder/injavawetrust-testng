package chapter03._05.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "data-provider")
	public static Object[][] dataProviderMethod() {
		return new Object[][] { { "data one" }, { "data two" } };
	}
	// It is mandatory for a DataProvider method to return the data in the form of
	// double
	// array of Object class (Object [][]). The first array represents a data set
	// where as the
	// second array contains the parameter values.
}
