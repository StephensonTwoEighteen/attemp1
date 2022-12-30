package ru.yandex.praktikum;

import org.openqa.selenium.By;

public class OrderForPage {

    public static String namePetya = "Петя";
    public static String surnamePetya = "Сидоров";
    public static String nameVasya = "Vasya";
    public static String surnameVasya = "Ivanov";
    public static String isExpected = "Заказ оформлен";
    protected static By firstNameField = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(1) > input");
    protected static By secondNameField = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(2) > input");
    protected static By addressField = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(3) > input");
    protected static By metroStationField = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(4) > div > div > input");
    protected static By sokolnikiStationButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[4]");
    protected static By phoneNumberField = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(5) > input");
    protected static By goAheadButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button");
    }
