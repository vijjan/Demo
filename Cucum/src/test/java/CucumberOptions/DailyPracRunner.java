
package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
glue="stepDefi",
monochrome=true,
plugin= {"pretty", "html:target/efg.html"},
tags="@prac")
public class DailyPracRunner extends AbstractTestNGCucumberTests {
	
	
	
}