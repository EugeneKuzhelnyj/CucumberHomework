package cucumber_test.hooks;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;

public class ScreenshotHook {
    public static final String PNG_FILE_EXTENSION = "image/png";

@AfterAll
    public void takeScreenshot(Scenario scenario){
        byte[] screenshot = Selenide.screenshot(OutputType.BYTES);
        scenario.attach(screenshot,PNG_FILE_EXTENSION,scenario.getName());
    }

}
