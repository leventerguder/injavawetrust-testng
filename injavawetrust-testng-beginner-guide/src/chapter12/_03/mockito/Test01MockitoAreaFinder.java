package chapter12._03.mockito;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test01MockitoAreaFinder {

	/*
	 * Mockito is another mocking framework, which provides similar capabilities to
	 * Jmock and is written in much a similar way to Jmock. The tests using Mockito
	 * as a mocking framework are much more clean and readable
	 */

	@InjectMocks
	private AreaFinder areaFinder;

	@Mock
	private Calculator calculator;

	@BeforeMethod
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		areaFinder = new AreaFinder(calculator);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void getAreaOfCircleShouldThrowIllegalArgumentExceptionForNegativeRadius() {
		areaFinder.getAreaOfCircle(-1.2);
	}

	@Test
	public void getAreaOfSquareShouldReturnExpectedValue() {

		// there are internal calls to the Calculator interface methods, such as square
		// and multiple, these methods are
		// mocked to return specified values using Mockito.
		final double radius = 4.1;
		final double radiusSquare = 5.3;
		final double expectedArea = 10.9;

		// Mocking the Calculator methods and returning particular values.
		when(calculator.square(radius)).thenReturn(radiusSquare);
		when(calculator.multiply(Math.PI, radiusSquare)).thenReturn(expectedArea);
		Assert.assertEquals(areaFinder.getAreaOfCircle(radius), expectedArea, 0);
	}

}
