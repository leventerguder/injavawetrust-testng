package chapter12._02.jmock;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.Sequence;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test01JmockAreaFinder {

	/*
	 * Jmock was one of the initial mocking frameworks that were developed to
	 * support unit testing and TDD based development approach. It provides all the
	 * basic features required for mocking, such as mocking objects, methods, return
	 * values and so on. It was developed initially for JUnit but with recent
	 * modifications it can be used with any unit test framework.
	 */
	
	// Creating a context object for mocking purpose
	private final Mockery context = new Mockery();

	private AreaFinder areaFinder;

	/*
	 * Creating a mock object using mocking context earlier created for the
	 * Calculator interface as there is no implementation for it existing.
	 */

	private Calculator calculator = context.mock(Calculator.class);

	@BeforeMethod
	public void setUp() {
		areaFinder = new AreaFinder(calculator);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void getAreaOfCircleShouldThrowIllegalArgumentExceptionForNegativeRadius() {

		areaFinder.getAreaOfCircle(-1.2);
	}

	/*
	 * Jmock is used to mock the calls to the methods of the Circle interface and
	 * return particular values based on certain value arguments. These methods are
	 * internally called inside the AreaFinder class, such as the getAreaOfCircle
	 * method. When a call is made to these mocked methods Jmock returns the
	 * configured values to the calling function, in this case it�s the
	 * getAreaOfCircle method.
	 */

	@Test
	public void getAreaOfSquareShouldReturnExpectedValue() {
		final double radius = 4.1;
		final double radiusSquare = 5.3;
		final double expectedArea = 10.9;

		/*
		 * Mocking the return values for the calculator methods using the context object
		 */

		context.checking(new Expectations() {

			final Sequence sequence = context.sequence("circle-areasequence");
			{
				// Mocking the square method in calculator and returning a particular value
				oneOf(calculator).square(radius);
				will(returnValue(radiusSquare));
				inSequence(sequence);
			}

			{

				oneOf(calculator).multiply(Math.PI, radiusSquare);
				will(returnValue(expectedArea));
				inSequence(sequence);
			}
		});

		Assert.assertEquals(areaFinder.getAreaOfCircle(radius), expectedArea, 0);
	}

}
