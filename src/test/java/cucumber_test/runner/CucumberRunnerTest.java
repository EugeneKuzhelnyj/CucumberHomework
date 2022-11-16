package cucumber_test.runner;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasspathResource("cucumber_test")
@IncludeEngines("cucumber")
public class CucumberRunnerTest {

}
