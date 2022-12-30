package ru.yandex.praktikum;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static ru.yandex.praktikum.MainPageElements.*;
import static ru.yandex.praktikum.OrderForPage.*;
import static ru.yandex.praktikum.RentAboutPage.*;

public class MainPage {
    public static String ActualText;
    public static String ExpectedText;
    public static WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //----------Открытие сайта
    public static void openSamokat() {
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
    }

    //----------Клик на кнопки

    //клик на верхнюю кнопку "Заказать"
    public static void clickMakeOrderUpperButton() {
        webDriver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        webDriver.findElement(makeOrderUpperButton).click();
    }

    //клик на нижнюю кнопку "Заказать"
    public static void clickMakeOrderLowerButton() {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

        webDriver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        webDriver.findElement(makeOrderLowerButton).click();
    }

    public static void fillOrderPageFields(String name, String surname, String address, String phoneNumber){
        webDriver.findElement(firstNameField).sendKeys(name);
        webDriver.findElement(secondNameField).sendKeys(surname);
        webDriver.findElement(addressField).sendKeys(address);
        webDriver.findElement(metroStationField).click();
        webDriver.findElement(sokolnikiStationButton).click();
        webDriver.findElement(phoneNumberField).sendKeys(phoneNumber);
        webDriver.findElement(goAheadButton).click();
    }

     public static void fillRentAboutPage(String comment, String date){
        webDriver.findElement(rentalPeriodField).click();
        webDriver.findElement(rentalThreeDays).click();
        webDriver.findElement(blackColourCheckBox).click();
        webDriver.findElement(commentForCourierField).sendKeys(comment);
        webDriver.findElement(dateField).sendKeys(date);
        webDriver.findElement(clickOrderLowerButton).click();
        webDriver.findElement(yesButton).click();

     }

     public static void orderMadeCheck(){
         String isDisplayed = webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[1]")).getText();
         MatcherAssert.assertThat(isDisplayed, startsWith(isExpected));
     }

    public static void fillRentAboutPageNegative(String comment, String date){
        assertTrue(webDriver.findElements(rentalPeriodField).size() == 0);
    }

    public static void orderNotMadeCheck(){
        assertTrue(webDriver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div[1]")).size() == 0);
    }

    public static class FirstText {
        public static void dropDownFirstButtonClick() {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            webDriver.findElement(dropDownFirstButton);
            webDriver.findElement(dropDownFirstButton).click();
        }

        public static void firstActualTextGetting() {
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            ActualText = webDriver.findElement(firstActualText).getText();
            ExpectedText = getFirstExpectedText();
        }

        public static void assertEqualFirst() {
            assertEquals(ExpectedText, ActualText);
        }
    }

    public static class SecondText {
        public static void dropDownSecondButtonClick() {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            webDriver.findElement(dropDownSecondButton);
            webDriver.findElement(dropDownSecondButton).click();
        }

        public static void secondActualTextGetting() {
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            ActualText = webDriver.findElement(secondActualText).getText();
            ExpectedText = getSecondExpectedText();
        }

        public static void assertEqualSecond() {
            assertEquals(ExpectedText, ActualText);
        }
    }

    public static class ThirdText {
        public static void dropDownThirdButtonClick() {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            webDriver.findElement(dropDownThirdButton);
            webDriver.findElement(dropDownThirdButton).click();
        }

        public static void thirdActualTextGetting() {
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            ActualText  = webDriver.findElement(thirdActualText).getText();
            ExpectedText = getThirdExpectedText();
        }

        public static void assertEqualThird() {
            //webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            assertEquals(ExpectedText, ActualText);
        }
    }

    public static class FourthText {
        public static void dropDownFourthButtonClick() {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            webDriver.findElement(dropDownFourthButton);
            webDriver.findElement(dropDownFourthButton).click();
        }

        public static void fourthActualTextGetting() {
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            ActualText = webDriver.findElement(fourthActualText).getText();
            ExpectedText = getFourthExpectedText();
        }

        public static void assertEqualFourth() {
            assertEquals(ExpectedText, ActualText);
        }
    }

    public static class FifthText {
        public static void dropDownFifthButtonClick() {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            webDriver.findElement(dropDownFifthButton);
            webDriver.findElement(dropDownFifthButton).click();
        }

        public static void fifthActualTextGetting() {
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            ActualText = webDriver.findElement(fifthActualText).getText();
            ExpectedText = getFifthExpectedText();
        }

        public static void assertEqualFifth() {
            assertEquals(ExpectedText, ActualText);
        }
    }

    public static class SixthText {
        public static void dropDownSixthButtonClick() {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            webDriver.findElement(dropDownSixthButton);
            webDriver.findElement(dropDownSixthButton).click();
        }

        public static void sixthActualTextGetting() {
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            ActualText = webDriver.findElement(sixthActualText).getText();
            ExpectedText = getSixthExpectedText();
        }

        public static void assertEqualSixth() {
            assertEquals(ExpectedText, ActualText);
        }
    }

    public static class SeventhText {
        public static void dropDownSeventhButtonClick() {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            webDriver.findElement(dropDownSeventhButton);
            webDriver.findElement(dropDownSeventhButton).click();
        }

        public static void seventhActualTextGetting() {
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            ActualText = webDriver.findElement(seventhActualText).getText();
            ExpectedText = getSeventhExpectedText();
        }

        public static void assertEqualSeventh() {
            assertEquals(ExpectedText, ActualText);
        }
    }

    public static class EighthText {
        public static void dropDownEighthButtonClick() {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            webDriver.findElement(dropDownEighthButton);
            webDriver.findElement(dropDownEighthButton).click();
        }

        public static void eighthActualTextGetting() {
            webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            ActualText = webDriver.findElement(eighthActualText).getText();
            ExpectedText = getEighthExpectedText();
        }

        public static void assertEqualEighth() {
            assertEquals(ExpectedText, ActualText);
        }
    }

}

