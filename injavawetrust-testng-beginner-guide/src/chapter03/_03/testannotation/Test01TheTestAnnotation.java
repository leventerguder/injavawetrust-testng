package chapter03._03.testannotation;

import org.testng.annotations.Test;

@Test
public class Test01TheTestAnnotation {

	public void testMethodOne() {
		System.out.println("Test method one.");
	}

	public void testMethodTwo() {
		System.out.println("Test method two.");
	}

	@SuppressWarnings("unused")
	private void testMethodThree() {
		System.out.println("Test method three.");
	}

	/*
	
	The preceding class contains three methods out of which two are public
	methods and one is a private method. The class has been annotated with
	the Test annotation.
	 */

	/*
	If a class is annotated by the Test annotation, TestNG will
	consider only the methods with public access modifiers as test methods. All the methods
	with other access modifiers will be neglected by TestNG.
	 */
}
