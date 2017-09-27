package com.qualityhouse.course.automation.keyworddriventesting.pageobjects;

import com.qualityhouse.course.automation.keyworddriventesting.testdata.LoginTestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {

    private WebDriver driver;

    public LoginPageObject(WebDriver webDriver) {
        driver = webDriver;
    }

    private CommonPageObjects common = new CommonPageObjects(driver);

    /* list of page components */

    public String loginPageURL = "?page=login";

    public By txtUsername = By.id("username");

    public By txtPassword = By.name("userpass");

    public By btnLogin = By.name("ses_login");


    /* list of page actions */

    public void open() {
        driver.get(common.applicationURL + loginPageURL);
    }

    public void populateUsername(String username) {
        driver.findElement(txtUsername).sendKeys(username);
    }

    public void populatePassword(String pwd) {
        driver.findElement(txtPassword).sendKeys(pwd);
    }

    public void login() {
        driver.findElement(btnLogin).click();
    }


    /* list of keywords */

    public void loginAs(String username, String password) {
        open();

        populateUsername(username);

        populatePassword(password);

        login();
    }

    public void loginWithValidCredentials() {
        loginAs(LoginTestData.validUsers.get(0).getUsername(), LoginTestData.validUsers.get(0).getPassword());
    }

    public void loginWithInvalidCredentials() {
        loginAs(LoginTestData.invalidUsers.get(2).getUsername(), LoginTestData.invalidUsers.get(2).getPassword());
    }

}
