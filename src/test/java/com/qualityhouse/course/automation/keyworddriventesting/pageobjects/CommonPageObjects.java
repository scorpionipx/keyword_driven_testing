package com.qualityhouse.course.automation.keyworddriventesting.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonPageObjects {

    private WebDriver driver;

    public CommonPageObjects (WebDriver driver) { this.driver = driver; }

    /* list of page components */

    public String applicationURL = "http://acme.qualityhouse.bg/build3/index.php";

    public By applicationLogo = By.cssSelector("a img[src='./application/i/logo.png']");

    // main application menu
    public By menuHome = By.cssSelector("#main-menu a[href='index.php?page=home']");

    public By menuBooks = By.cssSelector("#main-menu a[href='index.php?page=books']");

    public By menuCDs = By.cssSelector("#main-menu a[href='index.php?page=cds']");

    public By menuBasket = By.cssSelector("#main-menu a[href='index.php?page=basket']");

    public By menuRegister = By.cssSelector("#main-menu a[href='index.php?page=register']");

    public By menuLogin = By.cssSelector("#main-menu a[href='index.php?page=login']");

    public By menuEditProfile = By.cssSelector("#main-menu a[href='index.php?page=edit-profile']");

    public By menuLogout = By.cssSelector("#main-menu a[href='index.php?page=logout']");

    public By menuBasketImage = By.cssSelector("a[href='index.php?page=basket'] [src='./application/i/basket.png']");

    // common page components
    public By pageTitle = By.cssSelector("h3");

    // logout page components
    public By btnLogout = By.cssSelector("a.big-btn[href='index.php?ses_logout=1']");


    /* list of page actions */

    public void openApplication() {
        driver.get(applicationURL);
    }

    public void closeApplication() { driver.close(); }

    public void logout() {
        driver.findElement(menuLogout).click();
        driver.findElement(btnLogout).click();
    }

}
