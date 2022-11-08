package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static java.time.Duration.ofSeconds;

public class MainPage extends BasePage {
    private final String ONLINER_URL = "https://www.onliner.by/";
    private final SelenideElement AUTO_FLEA_MARKET = $x("//span[@class ='b-main-navigation__text' and text() ='Автобарахолка']");
    private final ElementsCollection CITIES_FOR_AUTO = $$x("//a[contains(@href,'https://ab.onliner.by/city')]");
    private final ElementsCollection ELEMENTS_DIVIDED_BY_PRICE = $$x("//a[contains(@href,'https://ab.onliner.by/city')]" +
            "/../../../preceding-sibling::div//a");
    private final ElementsCollection CARS = $$x("//a[contains(@href,'https://ab.onliner.by/city')]" +
            "/../../../following-sibling::div//a");
    private final SelenideElement HOUSES_AND_FLATS = $x("//span[@class ='b-main-navigation__text' and contains(text(),'Дома и квартиры')]");
    private final ElementsCollection COUNT_ROOMS = $$x("//a[contains(@href,'number_of_rooms')]");
    private final ElementsCollection FLAT_PRICE = $$x("//a[contains(@href,'number_of_rooms')]/../../../following-sibling::div//a");
    private  final ElementsCollection CITIES_FOR_FLATS = $$x("//a[contains(@href,'number_of_rooms')]/../../../preceding-sibling::div//a");

    public void navigateToOnliner() {
        open(ONLINER_URL);
    }

    public void hoverOnAutoFleaMarket() {
        AUTO_FLEA_MARKET.hover().shouldBe(visible);
    }

    public void isDropdownMenuOnAutoFleaMarketVisible(){
        ELEMENTS_DIVIDED_BY_PRICE.shouldHave(sizeGreaterThan(0),ofSeconds(15));
        CITIES_FOR_AUTO.shouldHave(sizeGreaterThan(0),ofSeconds(15));
        CARS.shouldHave(sizeGreaterThan(0),ofSeconds(15));
    }

    public void hoverOnHousesAndFlats(){
        HOUSES_AND_FLATS.hover().shouldBe(visible);
    }

    public void isDropdownMenuOnHousesAndFlatsVisible(){
        COUNT_ROOMS.shouldHave(sizeGreaterThan(0),ofSeconds(15));
        FLAT_PRICE.shouldHave(sizeGreaterThan(0),ofSeconds(15));
        CITIES_FOR_FLATS.shouldHave(sizeGreaterThan(0),ofSeconds(15));
    }

}
