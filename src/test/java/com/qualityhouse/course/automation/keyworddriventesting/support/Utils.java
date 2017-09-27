package com.qualityhouse.course.automation.keyworddriventesting.support;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

    private static final int elementLocatingTimeout = 10;

    public static boolean isPresent(WebDriver webdriver, By selector) {
        // try to find element by specified selector
        try {
            webdriver.findElement(selector);
        } catch (NoSuchElementException e) {
            // if element not exist return false
            return false;
        }
        return true;
    }

    // wait for element to be present on page
    public static WebElement waitForElement(WebDriver webDriver, By selector) {
        return waitForElement(webDriver, selector, elementLocatingTimeout);
    }

    public static WebElement waitForElement(WebDriver webDriver, By selector, int seconds) {
        return new WebDriverWait(webDriver, seconds).until(ExpectedConditions.presenceOfElementLocated(selector));
    }

    // wait for element on page to become clickable
    public static WebElement waitForClicableElement(WebDriver webDriver, By selector) {
        return waitForClicableElement(webDriver, selector, elementLocatingTimeout);
    }

    public static WebElement waitForClicableElement(WebDriver webDriver, By selector, int seconds) {
        return new WebDriverWait(webDriver, seconds).until(ExpectedConditions.elementToBeClickable(selector));
    }
}
