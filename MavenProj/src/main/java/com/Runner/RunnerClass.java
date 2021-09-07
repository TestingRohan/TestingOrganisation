package main.java.com.Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\Resource"},
		plugin = {"junit:Reports/JunitReports/Report.xml"},
		glue = {"main.java.com.StepDefinition"},
		monochrome = true,
		tags= {"@test"}
		//,dryRun = true
		)

public class RunnerClass extends AbstractTestNGCucumberTests {

//	@Test
//	public void test()
//	{
//		System.out.println("Hello World");
//	}
}
