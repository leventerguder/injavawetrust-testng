package chapter03._03.testannotation;

import java.io.IOException;

import org.testng.annotations.Test;

public class Test03ExpectedExceptions {

	/*
	 * As you can see from the test results, exceptionTestTwo was marked as failed
	 * by TestNG during execution. The test failed because the exception thrown by
	 * the said method does not match the exception list provided in the
	 * expectedExceptions list.
	 */

	@Test(expectedExceptions = { IOException.class })
	public void exceptionTestOne() throws Exception {
		throw new IOException();
	}

	@Test(expectedExceptions = { IOException.class, NullPointerException.class })
	public void exceptionTestTwo() throws Exception {
		throw new Exception();
	}
}
