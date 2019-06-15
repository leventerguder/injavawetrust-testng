package chapter07._01.multithread;

import org.testng.annotations.Test;

public class Test01Parallel {

	@Test
	public void testMethodsOne() {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method One. Thread id is:" + id);
	}

	@Test
	public void testMethodsTwo() {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method Two. Thread id is:" + id);
	}
}
