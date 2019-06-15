package chapter06._01.factory;

import org.testng.annotations.Test;

public class Test02Parameter {

	private int param;

	public Test02Parameter(int param) {
		this.param = param;
	}

	@Test
	public void testMethodOne() {
		int opValue = param + 1;
		System.out.println("Test method one output: " + opValue);
	}

	@Test
	public void testMethodTwo() {
		int opValue = param + 2;
		System.out.println("Test method two output: " + opValue);
	}
}
