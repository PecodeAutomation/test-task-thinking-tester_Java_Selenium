package pages;

import base.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import pages.elements.SingUpPageElements;

public class SingUpPage extends BasePage implements SingUpPageElements {

    private static final Logger logger = LogManager.getLogger(SingUpPage.class.getName());
    public SingUpPage() {
        super();
    }

    private WebElement getFirstName() {
        return getElementByID(FIRST_NAME_ID);
    }

    private WebElement getLastName() {
        return getElementByID(LAST_NAME_ID);
    }

    private WebElement getEmail() {
        return getElementByID(EMAIL_ID);
    }

    private WebElement getPassword() {
        return getElementByID(PASSWORD_ID);
    }

    private WebElement getSubmit() {
        return getElementByID(SUBMIT_ID);
    }

    private WebElement getCancel() {
        return getElementByID(CANCEL_ID);
    }

    public SingUpPage inputFirstName(String firstName) {
        getFirstName().sendKeys(firstName);
        logger.info("Input first name: " + firstName);
        return this;
    }

    public SingUpPage inputLastName(String lastName) {
        getLastName().sendKeys(lastName);
        logger.info("Input last name: " + lastName);
        return this;
    }

    public SingUpPage inputEmail(String email) {
        getEmail().sendKeys(email);
        logger.info("Input email: " + email);
        return this;
    }

    public SingUpPage inputPassword(String password) {
        getPassword().sendKeys(password);
        logger.info("Input password");
        return this;
    }

    public MainPage clickSubmit() {
        getSubmit().click();
        logger.info("Submit button clicked");
        return new MainPage();
    }

    public LoginPage clickCancel() {
        getCancel().click();
        logger.info("Cancel button clicked");
        return new LoginPage();
    }
}
