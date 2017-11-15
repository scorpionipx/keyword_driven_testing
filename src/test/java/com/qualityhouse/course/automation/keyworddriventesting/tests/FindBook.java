package com.qualityhouse.course.automation.keyworddriventesting.tests;

import com.qualityhouse.course.automation.keyworddriventesting.pageobjects.BooksPageObject;
import com.qualityhouse.course.automation.keyworddriventesting.pageobjects.CommonPageObjects;
import com.qualityhouse.course.automation.keyworddriventesting.pageobjects.LoginPageObject;
import org.junit.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBook {

    private WebDriver driver = new ChromeDriver();

    private LoginPageObject loginPage = new LoginPageObject(driver);

    private CommonPageObjects common = new CommonPageObjects(driver);

    private BooksPageObject bookPage = new BooksPageObject(driver);


    @Before
    public void setup() { common.openApplication(); }

    @After
    public void tearDown() {
        common.closeApplication();
    }

    @Test
    public void tcVerifyIfBookIsInSearchResult() {
        loginPage.loginWithValidCredentials();

        bookPage.openBooks();

        bookPage.searchForBook("", "", "Nature Books Ltd.", "");

        Assert.assertEquals("Book is not in the list!", bookPage.isBookInList("Autumn Colors"), true);
    }

    @Test
    public void tcVerifyDetailsOfFoundBook() {
        // todo: Exercise - search for a book with title "The miracles of the Nature" and list its details

    }

    @Test
    public void tcVerifyBookPrice() {
        // todo: Exercise - develop keyword to easy verify given book price
    }
}
