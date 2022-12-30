package webDrivers.mozillaDriver.samokatTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.praktikum.MainPage;

import java.util.concurrent.TimeUnit;

import static ru.yandex.praktikum.MainPage.EighthText.*;
import static ru.yandex.praktikum.MainPage.FifthText.*;
import static ru.yandex.praktikum.MainPage.FirstText.*;
import static ru.yandex.praktikum.MainPage.FourthText.*;
import static ru.yandex.praktikum.MainPage.SecondText.*;
import static ru.yandex.praktikum.MainPage.SeventhText.*;
import static ru.yandex.praktikum.MainPage.SixthText.*;
import static ru.yandex.praktikum.MainPage.ThirdText.*;
import static ru.yandex.praktikum.MainPage.openSamokat;

public class DropDownTextsTests {
    WebDriver webDriver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/Users/artembragin/Documents/geckodriver");
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
        webDriver.quit();
    }


    @Test
    public void firstDropDownTextCheck() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();
        dropDownFirstButtonClick();
        firstActualTextGetting();
        assertEqualFirst();
    }

    @Test
    public void secondDropDownTextCheck() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();
        dropDownSecondButtonClick();
        secondActualTextGetting();
        assertEqualSecond();
    }

    @Test
    public void thirdDropDownTextCheck() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();
        dropDownThirdButtonClick();
        thirdActualTextGetting();
        assertEqualThird();
    }

    @Test
    public void fourthDropDownTextCheck() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();
        dropDownFourthButtonClick();
        fourthActualTextGetting();
        assertEqualFourth();
    }

    @Test
    public void fifthDropDownTextCheck() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();
        dropDownFifthButtonClick();
        fifthActualTextGetting();
        assertEqualFifth();
    }

    @Test
    public void sixthDropDownTextCheck() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();
        dropDownSixthButtonClick();
        sixthActualTextGetting();
        assertEqualSixth();
    }

    @Test
    public void seventhDropDownTextCheck() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();
        dropDownSeventhButtonClick();
        seventhActualTextGetting();
        assertEqualSeventh();
    }

    @Test
    public void eighthDropDownTextCheck() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();
        dropDownEighthButtonClick();
        eighthActualTextGetting();
        assertEqualEighth();
    }
}