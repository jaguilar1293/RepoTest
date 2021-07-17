package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/Shopping/ShoppingCart.feature",
        glue = "StepDefinitions",
        snippets = SnippetType.CAMELCASE
)

public class TestRunner {
}
