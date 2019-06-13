package chapter03._04.parameterization;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test02Optional {

	@Parameters({ "optional-value" })
	@Test
	public void optionTest(@Optional("optional value") String value) {
		System.out.println("This is: " + value);
	}

	/*
	The preceding class file contains a single test method that takes one parameter
	as input. The said test method on execution prints the parameter value that is
	passed onto the console using the System.out.println method. The Parameter
	value is passed to the test method using the parameter named optional-value
	from the XML file. An optional value for the said parameter is defined using the
	Optional annotation against the said parameter.
	 */
}
