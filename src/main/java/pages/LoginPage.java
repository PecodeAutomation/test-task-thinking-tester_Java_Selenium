package pages;

import base.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import pages.elements.LoginPageElements;

public class LoginPage extends BasePage implements LoginPageElements {
    private static final Logger logger = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        super();
    }

    private WebElement getEmail() {
        return getElementByID(EMAIL_ID);
    }

    private WebElement getPassword() {
        return getElementByID(PASSWORD_ID);
    }

    private WebElement getSubmitBtn() {
        return getElementByID(SUBMIT_BTN_ID);
    }

    private WebElement getSingUPBtn() {
        return getElementByID(SING_UP_BTN_ID);
    }

    public LoginPage inputEmail(String email) {
        getEmail().sendKeys(email);
        logger.info("Input username filled: " + email);
        return this;
    }

    public LoginPage inputPassword(String password) {
        getPassword().sendKeys(password);
        logger.info("Input password");
        return this;
    }

    public MainPage clickSubmitBtn() {
        getSubmitBtn().click();
        logger.info("Submit button clicked");
        return new MainPage();
    }

    public SingUpPage clickSingUp() {
        getSingUPBtn().click();
        logger.info("Sing Up button clicked");
        return new SingUpPage();
    }
}
