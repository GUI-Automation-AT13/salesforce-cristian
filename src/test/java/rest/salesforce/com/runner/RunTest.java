package rest.salesforce.com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.apache.log4j.Logger;
import org.testng.annotations.*;

@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"html:target/site/cucumber-pretty.html", "json:target/cucumber.json"},
        glue = {"rest.salesforce.com"}
)
public class RunTest extends AbstractTestNGCucumberTests {
    public Logger LOGGER = Logger.getLogger(getClass());
    @BeforeTest
    public void beforeExecution() {
        LOGGER.info("----------- Before Execution -----------");
    }
    @AfterTest
    public void afterExecution() {
        LOGGER.info("----------- After Execution -----------");
    }

}
