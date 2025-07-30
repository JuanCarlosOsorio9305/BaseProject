package runners.saucedemo;

import io.cucumber.core.options.Constants;
import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/saucedemo/login.feature")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME,
        value = "stepsdefinitions/saucedemo"
)
@ConfigurationParameter(
        key = Constants.SNIPPET_TYPE_PROPERTY_NAME,
        value = "camelcase"
)
@IncludeTags("@smokeTest")
public class LoginRunner {
}
