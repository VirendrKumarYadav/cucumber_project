package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to feature files
        glue = "stepdefinitions",                // Path to step definitions
//        tags = "@smoke and not @regression",     // Tags to include/exclude
        plugin = {                               // Plugins for reporting
                "pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json"
        },
        monochrome = true  
//        dryRun = true
        // Makes console output readable
)
public class TestRunner {
}
