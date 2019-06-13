package chapter03._04.parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test01Parameter {

	/*
	 * One of the important features of TestNG is parameterization. This feature
	 * allows user to pass parameter values to test methods as arguments. This is
	 * supported by using the Parameters and DataProvider annotations.
	 * 
	 * There are mainly two ways through which we can provide parameter values to
	 * test-methods: Through testng XML configuration file Through DataProviders
	 */

	/**
	 * Following method takes one parameter as input. Value of the said parameter is
	 * defined at suite level.
	 */
	@Parameters({ "suite-param" })
	@Test
	public void prameterTestOne(String param) {
		System.out.println("Test one suite param is: " + param);
	}

	/**
	 * Following method takes one parameter as input. Value of the said parameter is
	 * defined at test level.
	 */
	@Parameters({ "test-two-param" })
	@Test
	public void prameterTestTwo(String param) {
		System.out.println("Test two param is: " + param);
	}

	/**
	 * Following method takes two parameters as input. Value of the test parameter
	 * is defined at test level. The suite level parameter is overridden at the test
	 * level.
	 */
	@Parameters({ "suite-param", "test-three-param" })
	@Test
	public void prameterTestThree(String param, String paramTwo) {
		System.out.println("Test three suite param is: " + param);
		System.out.println("Test three param is: " + paramTwo);
	}

}
