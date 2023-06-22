package pages;

import base.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import pages.elements.AddNewContactPageElements;

public class AddNewContactPage extends BasePage implements AddNewContactPageElements {
    private static final Logger logger = LogManager.getLogger(AddNewContactPage.class.getName());

    public AddNewContactPage() {
        super();
    }

    private WebElement getFirstName() {
        return getElementByID(FIRST_NAME_ID);
    }
    private WebElement getLastName() {
        return getElementByID(LAST_NAME_ID);
    }
    private WebElement getBirthday() {
        return getElementByID(BIRTHDATE_ID);
    }
    private WebElement getEmail() {
        return getElementByID(EMAIL_ID);
    }
    private WebElement getPhone() {
        return getElementByID(PHONE_ID);
    }
    private WebElement getStreetAddress1() {
        return getElementByID(STREET_ADDRESS_1_ID);
    }
    private WebElement getStreetAddress2() {
        return getElementByID(STREET_ADDRESS_2_ID);
    }
    private WebElement getCity() {
        return getElementByID(CITY_ID);
    }
    private WebElement getStateOrProvince() {
        return getElementByID(STATE_OR_PROVINCE_ID);
    }
    private WebElement getPostalCode() {
        return getElementByID(POSTAL_CODE_ID);
    }
    private WebElement getCountry() {
        return getElementByID(COUNTRY_ID);
    }
    private WebElement getSubmitBtn() {
        return getElementByID(SUBMIT_BTN_ID);
    }
    private WebElement getCancelBtn() {
        return getElementByID(CANCEL_BTN_ID);
    }

    public AddNewContactPage inputFirstName(String firstName) {
        getFirstName().sendKeys(firstName);
        logger.info("Input first name: " + firstName);
        return this;
    }

    public AddNewContactPage inputLastName(String lastName) {
        getLastName().sendKeys(lastName);
        logger.info("Input last name: " + lastName);
        return this;
    }

    public AddNewContactPage inputBirthday(String birthday) {
        getBirthday().sendKeys(birthday);
        logger.info("Input birthday: " + birthday);
        return this;
    }

    public AddNewContactPage inputEmail(String email) {
        getEmail().sendKeys(email);
        logger.info("Input email: " + email);
        return this;
    }

    public AddNewContactPage inputPhone(String phone) {
        getPhone().sendKeys(phone);
        logger.info("Input phone: " + phone);
        return this;
    }

    public AddNewContactPage inputStreetAddress1(String streetAddress) {
        getStreetAddress1().sendKeys(streetAddress);
        logger.info("Input street address1: " + streetAddress);
        return this;
    }

    public AddNewContactPage inputStreetAddress2(String streetAddress) {
        getStreetAddress2().sendKeys(streetAddress);
        logger.info("Input street address2: " + streetAddress);
        return this;
    }

    public AddNewContactPage inputCity(String city) {
        getCity().sendKeys(city);
        logger.info("Input city: " + city);
        return this;
    }

    public AddNewContactPage inputStateOrProvince(String stateOrProvince) {
        getStateOrProvince().sendKeys(stateOrProvince);
        logger.info("Input state or province: " + stateOrProvince);
        return this;
    }

    public AddNewContactPage inputPostalCode(String postalCode) {
        getPostalCode().sendKeys(postalCode);
        logger.info("Input postal code: " + postalCode);
        return this;
    }

    public AddNewContactPage inputCountry(String country) {
        getCountry().sendKeys(country);
        logger.info("Input country: " + country);
        return this;
    }

    public MainPage clickSubmitBtn() {
        getSubmitBtn().click();
        logger.info("Submit button is clicked");
        return new MainPage();
    }

    public MainPage clickCancelBtn() {
        getCancelBtn().click();
        logger.info("Cancel button is clicked");
        return new MainPage();
    }
}
