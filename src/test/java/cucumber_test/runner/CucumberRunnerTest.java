package cucumber_test.runner;

import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasspathResource("src/test/java/resources/cucumber_test")
public class CucumberRunnerTest {
}
