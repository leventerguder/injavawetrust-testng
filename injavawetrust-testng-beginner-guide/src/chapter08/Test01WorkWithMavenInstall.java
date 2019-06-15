package chapter08;

import org.testng.annotations.Test;

public class Test01WorkWithMavenInstall {

	@Test
	public void testMethodOne() {
		System.out.println("Test01WorkWithMavenInstall#testMethodOne");
	}
	

	@Test
	public void testMethodTwo() {
		System.out.println("Test01WorkWithMavenInstall#testMethodTwo");
	}
}

/*
			<plugin>
				<!-- the plugin maven-surefire-plugin is used to configure and execute the tests. -->
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.0.0-M3</version>
				<configuration>

					<!-- Suite testng xml file to consider for test execution -->
					<suiteXmlFiles>
						<suiteXmlFile>src/chapter08/testng01-work-with-maven-install.xml</suiteXmlFile>
					</suiteXmlFiles>
				</configuration>
			</plugin>

*/