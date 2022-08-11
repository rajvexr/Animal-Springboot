package cats;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
                features = "src/test/resources/cucumber",
                glue = "src/test/java/cats/FeedCatSteps.java")

public class RunCucumberTest {
}
