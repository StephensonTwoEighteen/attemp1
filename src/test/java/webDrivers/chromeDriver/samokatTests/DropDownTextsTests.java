package webDrivers.chromeDriver.samokatTests;

import org.junit.Test;
import ru.yandex.praktikum.MainPage;
import samokatTests.TestBase;

import static ru.yandex.praktikum.MainPage.EighthText.*;
import static ru.yandex.praktikum.MainPage.FifthText.*;
import static ru.yandex.praktikum.MainPage.FirstText.*;
import static ru.yandex.praktikum.MainPage.FourthText.*;
import static ru.yandex.praktikum.MainPage.SecondText.*;
import static ru.yandex.praktikum.MainPage.SeventhText.*;
import static ru.yandex.praktikum.MainPage.SixthText.*;
import static ru.yandex.praktikum.MainPage.openSamokat;

public class DropDownTextsTests extends TestBase {
    //public WebDriver webDriver;
    /*@Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @After
    public void tearDown() {
        webDriver.quit();
    }*/

    @Test
    public void firstDropDownTextCheck() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();    //открытие сайта
        dropDownFirstButtonClick();   //клик на выпадающий список "Как рассчитывается время аренды?"
        firstActualTextGetting();
        assertEqualFirst();
    }

    @Test
    public void secondDropDownTextCheck() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();    //открытие сайта
        dropDownSecondButtonClick();   //клик на выпадающий список "Как рассчитывается время аренды?"
        secondActualTextGetting();
        assertEqualSecond();
    }

    @Test
    public void thirdDropDownTextCheck() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();    //открытие сайта
        dropDownSecondButtonClick();   //клик на выпадающий список "Как рассчитывается время аренды?"
        secondActualTextGetting();
        assertEqualSecond();
    }

    @Test
    public void fourthDropDownTextCheck() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();    //открытие сайта
        dropDownFourthButtonClick();   //клик на выпадающий список "Как рассчитывается время аренды?"
        fourthActualTextGetting();
        assertEqualFourth();
    }

    @Test
    public void fifthDropDownTextCheck() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();    //открытие сайта
        dropDownFifthButtonClick();   //клик на выпадающий список "Как рассчитывается время аренды?"
        fifthActualTextGetting();
        assertEqualFifth();
    }

    @Test
    public void sixthDropDownTextCheck() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();    //открытие сайта
        dropDownSixthButtonClick();   //клик на выпадающий список "Как рассчитывается время аренды?"
        sixthActualTextGetting();
        assertEqualSixth();
    }

    @Test
    public void seventhDropDownTextCheck() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();    //открытие сайта
        dropDownSeventhButtonClick();   //клик на выпадающий список "Как рассчитывается время аренды?"
        seventhActualTextGetting();
        assertEqualSeventh();
    }

    @Test
    public void eighthDropDownTextCheck() {
        MainPage mainPage = new MainPage(webDriver);

        openSamokat();    //открытие сайта
        dropDownEighthButtonClick();   //клик на выпадающий список "Как рассчитывается время аренды?"
        eighthActualTextGetting();
        assertEqualEighth();
    }
}