package runners.saucedemo;

import io.cucumber.core.options.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/saucedemo/checkout.feature")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME,
        value = "stepsdefinitions/saucedemo"
)
@ConfigurationParameter(
        key = Constants.SNIPPET_TYPE_PROPERTY_NAME,
        value = "camelcase"
)
@ConfigurationParameter(
        key = PLUGIN_PROPERTY_NAME, value = "io.cucumber.core.plugin.SerenityReporterParallel,pretty,timeline:build/test-results/timeline"
)
public class CheckoutRunner {
}
