package runners;


import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("/features/iterations/iterations.feature")
@ConfigurationParameter(
        key = GLUE_PROPERTY_NAME,
        value = "stepsdefinitions"
)
@ConfigurationParameter(
        key = PLUGIN_PROPERTY_NAME, value = "io.cucumber.core.plugin.SerenityReporterParallel,pretty,timeline:build/test-results/timeline"
)
@ConfigurationParameter(
        key = SNIPPET_TYPE_PROPERTY_NAME,
        value = "camelcase")
@ConfigurationParameter(key = SNIPPET_TYPE_PROPERTY_NAME, value = "camelcase")
public class IterarionRunner {
}
