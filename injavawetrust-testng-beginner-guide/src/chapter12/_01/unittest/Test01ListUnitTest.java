package chapter12._01.unittest;

import java.util.List;
import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test01ListUnitTest {

	List<String> listObj = new ArrayList<>();

	@BeforeClass
	public void beforeClass() {
		listObj.add("Sample-0");
		listObj.add("Sample-1");
		listObj.add("Sample-2");
	}

	@Test
	public void verifyDataBasedOnIndex() {
		String data = listObj.get(0);
		Assert.assertEquals(data, "Sample-0", "Data dont match");
	}

	@Test(expectedExceptions = IndexOutOfBoundsException.class)
	public void verifyForWrongIndex() {
		listObj.get(4);
	}

	@Test
	public void verifySize() {
		Assert.assertTrue(listObj.size() == 3, "Size dont match");
	}

	/*
	 * The tests verify few of the conditions of the ArrayList class. If you noticed
	 * that there are different methods from the Assert class being used in the
	 * program. The assert helps in identifying the success and failure conditions
	 * of a test.
	 */
}
