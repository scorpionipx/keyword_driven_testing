package com.qualityhouse.course.automation.keyworddriventesting.pageobjects;

import com.qualityhouse.course.automation.keyworddriventesting.support.Utils;
import com.qualityhouse.course.automation.keyworddriventesting.testdata.BooksTestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BooksPageObject {

    private WebDriver driver;

    public BooksPageObject(WebDriver webDriver) {
        driver = webDriver;
    }

    private CommonPageObjects common = new CommonPageObjects(driver);

    /* list of page components */

    public String booksPageURL = "?page=books";

    public String booksCategoryURL(String category) { return "&category=" + BooksTestData.getBooksCategoryURLParameter(category); }

    public By listOfBooksInCategory = By.cssSelector("#product-list .item");

    public By lblBookTitle = By.cssSelector("#product-list .item b");

    public By lblBookPrice = By.cssSelector("#product-list .item .buy-info-b span");

    // search for book(s) fields

    public By txtAuthor = By.name("Author");

    public By txtTitle = By.name("Title");

    public By txtPublisher = By.name("Publisher");

    public By txtISBN = By.name("ISBN");

    public By btnSearchSubmit = By.cssSelector("input[type='submit']");


    /* list of page actions */

    public void openBooks() {
        Utils.waitForClicableElement(driver, common.menuBooks).click();
    }

    public void openBooksCategory(String category) {
        driver.get(common.applicationURL + booksPageURL + booksCategoryURL(category));
    }

    public List<WebElement> booksInCategory(String category) {
        return driver.findElements(listOfBooksInCategory);
    }

    public List<WebElement> listOfBooks() {
        return driver.findElements(listOfBooksInCategory);
    }


    /* list of keywords */

    public void clearSearchForm() {
        driver.findElement(txtTitle).clear();
        driver.findElement(txtAuthor).clear();
        driver.findElement(txtPublisher).clear();
        driver.findElement(txtISBN).clear();
    }

    public void search() {
        driver.findElement(btnSearchSubmit).click();
    }

    public void populateSearchTitle(String author) {
        driver.findElement(txtTitle).clear();
        driver.findElement(txtTitle).sendKeys(author);
    }

    public void populateSearchAuthor(String title) {
        driver.findElement(txtAuthor).clear();
        driver.findElement(txtAuthor).sendKeys(title);
    }

    public void populateSearchPublisher(String publisher) {
        driver.findElement(txtPublisher).clear();
        driver.findElement(txtPublisher).sendKeys(publisher);
    }

    public void populateSearchISBN(String isbn) {
        driver.findElement(txtISBN).clear();
        driver.findElement(txtISBN).sendKeys(isbn);
    }

    public void searchForBook(String title) {
        clearSearchForm();
        populateSearchISBN(BooksTestData.getBookISBN(title));
        search();
    }

    public void searchForBook(String author, String title, String publisher, String isbn) {
        clearSearchForm();

        if (!author.equals("")) { populateSearchAuthor(author); }

        if (!title.equals("")) { populateSearchTitle(title); }

        if (!publisher.equals("")) { populateSearchPublisher(publisher); }

        if (!isbn.equals("")) { populateSearchISBN(isbn); }

        search();
    }

    public Boolean isBookInList(String title) {
        List<WebElement> listedBooks = listOfBooks();

        Boolean bookFound = false;

        for (WebElement b : listedBooks) {
            if (b.findElement(lblBookTitle).getText().equals(title)) {bookFound = true; }
        }
        return bookFound;
    }

    public WebElement getBookInList(String title) {
        List<WebElement> listedBooks = listOfBooks();

        WebElement bookFound = null;

        for (WebElement b : listedBooks) {
            if (b.findElement(lblBookTitle).getText().equals(title)) {
                bookFound = b;
                bookFound.click();
            }
        }

        return bookFound;
    }

}
