package cucumber_test.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPageSteps {
    MainPage mainPage = new MainPage();

    @Given("the user opens Onliner website")
    public void theUserOpensOnlinerWebsite() {
        mainPage.navigateToOnliner();
    }

    @When("the user hover on Auto flea market section")
    public void theUserHoverOnAutoFleaMarketSection() {
        mainPage.hoverOnAutoFleaMarket();
    }

    @Then("dropdown menu with Auto sections are displayed")
    public void dropdownMenuWithSectionsAreDisplayed() {
        mainPage.isDropdownMenuOnAutoFleaMarketVisible();
    }

    @When("the user hover on Houses and flats section")
    public void theUserHoverOnHousesAndFlatsSection() {
        mainPage.hoverOnHousesAndFlats();
    }

    @Then("dropdown menu with Houses and rooms sections are displayed")
    public void dropdownMenuWithHousesAndRoomsSectionsAreDisplayed() {
        mainPage.isDropdownMenuOnHousesAndFlatsVisible();
    }
}
