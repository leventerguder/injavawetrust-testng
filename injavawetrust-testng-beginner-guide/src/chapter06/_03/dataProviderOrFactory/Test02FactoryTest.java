package chapter06._03.dataProviderOrFactory;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test02FactoryTest {

	private String param = "";

	public Test02FactoryTest(String param) {
		this.param = param;
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class executed.");
	}

	@Test
	public void testMethod() {
		System.out.println("The the parameter value is: " + param);
	}
}
