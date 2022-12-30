package UI_tests.chromeTests;

import org.junit.Test;
import ru.yandex.praktikum.MainPage;
import ru.yandex.praktikum.OrderForPage;
import samokatTests.TestBase;

import static ru.yandex.praktikum.MainPage.*;

public class makeOrderTests extends TestBase {

@Test
public void makeOrderTestPositiveUpperButton() {
    MainPage mainPage = new MainPage(webDriver);

    openSamokat();
    clickMakeOrderUpperButton();
    fillOrderPageFields(OrderForPage.namePetya, OrderForPage.surnamePetya, "Рябиновая 57", "79563327766");
    fillRentAboutPage("Привезите утром или в обед", "29.02.2023");
    orderMadeCheck();
}

    @Test
    public void makeOrderTestPositiveLowerButton() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();
        clickMakeOrderLowerButton();
        fillOrderPageFields(OrderForPage.namePetya, OrderForPage.surnamePetya, "Рябиновая 57", "79563327766");
        fillRentAboutPage("Привезите утром или в обед", "29.02.2023");
        orderMadeCheck();
    }

    @Test
    public void makeOrderTestNegativeUpperButton() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();
        clickMakeOrderUpperButton();
        fillOrderPageFields(OrderForPage.nameVasya, OrderForPage.surnameVasya, "Рябиновая 57", "79563327766");
        fillRentAboutPageNegative("Привезите утром или в обед", "29.02.2023");
        orderNotMadeCheck();
    }

    @Test
    public void makeOrderTestNegativeLowerButton() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();
        clickMakeOrderLowerButton();
        fillOrderPageFields(OrderForPage.nameVasya, OrderForPage.surnameVasya, "Рябиновая 57", "79563327766");
        fillRentAboutPageNegative("Привезите вечером", "00.02.2023");
        orderNotMadeCheck();
    }
}