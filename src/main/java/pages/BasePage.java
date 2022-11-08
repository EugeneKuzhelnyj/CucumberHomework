package pages;

import com.codeborne.selenide.Configuration;

public class BasePage {

    public BasePage(){
        Configuration.browser = "chrome";
        Configuration.pageLoadTimeout = 20000;
    }
}
