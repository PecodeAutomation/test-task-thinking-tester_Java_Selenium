package pages;

import base.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.elements.MainPageElements;

public class MainPage extends BasePage implements MainPageElements {

    private static final Logger logger = LogManager.getLogger(MainPage.class.getName());

    public MainPage() {
        super();
    }

    private WebElement getLogout() {
        return getElementByID(LOGOUT_ID);
    }

    private WebElement getAddNewContact() {
        return getElementByID(ADD_NEW_CONTACT_ID);
    }

    private WebElement getContactByText(String text) {
        return  getElementByXpath(String.format(CONTACT_BY_TEXT_XPATH, text));
    }

    public LoginPage clickLogoutBtn() {
        getLogout().click();
        logger.info("Logout button clicked");
        return new LoginPage();
    }

    public AddNewContactPage clickAddNewContact() {
        getAddNewContact().click();
        logger.info("Add new contact button clicked");
        return new AddNewContactPage();
    }

    public ContactDetailsPage clickToOpenContactByText(String text) {
        getContactByText(text).click();
        logger.info("Open contact by text: " + text);
        return new ContactDetailsPage();
    }

    public MainPage assertPageIsOpened() {
        Assert.assertTrue(getAddNewContact().isDisplayed(), "Page is not opened");
        logger.info("Assert check: page is opened");
        return this;
    }

    public MainPage assertContactIsDisplayedByText(String text) {
        Assert.assertTrue(getContactByText(text).isDisplayed(), "Contact is not displayed");
        logger.info("Assert check: contact is displayed");
        return this;
    }

    public MainPage assertContactIsNotDisplayedByText(String text) {
        Assert.assertTrue(getElementsByXpath(String.format(CONTACT_BY_TEXT_XPATH, text)).isEmpty(), "Contact is still displayed");
        logger.info("Assert check: contact is not displayed");
        return this;
    }
}
