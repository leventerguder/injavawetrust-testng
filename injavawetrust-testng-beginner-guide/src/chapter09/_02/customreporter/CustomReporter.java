package chapter09._02.customreporter;

import java.util.List;
import java.util.Map;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class CustomReporter implements IReporter {
	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// Iterating over each suite included in the test
		for (ISuite suite : suites) {
			// Following code gets the suite name
			String suiteName = suite.getName();
			// Getting the results for the said suite
			Map<String, ISuiteResult> suiteResults = suite.getResults();
			for (ISuiteResult sr : suiteResults.values()) {
				ITestContext tc = sr.getTestContext();
				System.out.println(
						"Passed tests for suite '" + suiteName + "' is:" + tc.getPassedTests().getAllResults().size());
				System.out.println(
						"Failed tests for suite '" + suiteName + "' is:" + tc.getFailedTests().getAllResults().size());
				System.out.println("Skipped tests for suite '" + suiteName + "' is:"
						+ tc.getSkippedTests().getAllResults().size());
			}
		}

		/*
		 * The method takes three arguments , the first being xmlSuite, which is the
		 * list suites mentioned in the testng XML being executed. The second one being
		 * suites which contains the suite information after the test execution; this
		 * object contains all the information about the packages, classes, test
		 * methods, and their test execution results. The third being the
		 * outputDirectory, which contains the information of the output folder path
		 * where the reports will be generated.
		 */
	}
}