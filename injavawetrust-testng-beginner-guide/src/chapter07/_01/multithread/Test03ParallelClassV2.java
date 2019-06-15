package chapter07._01.multithread;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test03ParallelClassV2 {

	@BeforeClass
	public void beforeClass() {
		long id = Thread.currentThread().getId();
		System.out.println("Test03ParallelClassV2#beforeClass Thread id is: " + id);
	}

	@Test
	public void testMethodOne() {
		long id = Thread.currentThread().getId();
		System.out.println("Test03ParallelClassV2#testMethodOne Thread id is: " + id);
	}

	@Test
	public void testMethodTwo() {
		long id = Thread.currentThread().getId();
		System.out.println("Test03ParallelClassV2#testMethodTwo Thread id is: " + id);
	}

	@AfterClass
	public void afterClass() {
		long id = Thread.currentThread().getId();
		System.out.println("Test03ParallelClassV2#afterClass Thread id is: " + id);
	}
}
