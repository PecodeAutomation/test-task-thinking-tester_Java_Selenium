package pages;

import base.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import pages.elements.EditContactPageElements;

public class EditContactPage extends BasePage implements EditContactPageElements {

    private static final Logger logger = LogManager.getLogger(EditContactPage.class.getName());
    public EditContactPage() {
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

    public EditContactPage inputFirstName(String firstName) {
        getFirstName().clear();
        getFirstName().sendKeys(firstName);
        logger.info("Input first name: " + firstName);
        return this;
    }

    public EditContactPage inputLastName(String lastName) {
        getLastName().clear();
        getLastName().sendKeys(lastName);
        logger.info("Input last name: " + lastName);
        return this;
    }

    public EditContactPage inputBirthday(String birthday) {
        getBirthday().clear();
        getBirthday().sendKeys(birthday);
        logger.info("Input birthday: " + birthday);
        return this;
    }

    public EditContactPage inputEmail(String email) {
        getEmail().clear();
        getEmail().sendKeys(email);
        logger.info("Input email: " + email);
        return this;
    }

    public EditContactPage inputPhone(String phone) {
        getPhone().clear();
        getPhone().sendKeys(phone);
        logger.info("Input phone: " + phone);
        return this;
    }

    public EditContactPage inputStreetAddress1(String streetAddress) {
        getStreetAddress1().clear();
        getStreetAddress1().sendKeys(streetAddress);
        logger.info("Input street address1: " + streetAddress);
        return this;
    }

    public EditContactPage inputStreetAddress2(String streetAddress) {
        getStreetAddress2().clear();
        getStreetAddress2().sendKeys(streetAddress);
        logger.info("Input street address2: " + streetAddress);
        return this;
    }

    public EditContactPage inputCity(String city) {
        getCity().clear();
        getCity().sendKeys(city);
        logger.info("Input city: " + city);
        return this;
    }

    public EditContactPage inputStateOrProvince(String stateOrProvince) {
        getStateOrProvince().clear();
        getStateOrProvince().sendKeys(stateOrProvince);
        logger.info("Input state or province: " + stateOrProvince);
        return this;
    }

    public EditContactPage inputPostalCode(String postalCode) {
        getPostalCode().clear();
        getPostalCode().sendKeys(postalCode);
        logger.info("Input postal code: " + postalCode);
        return this;
    }

    public EditContactPage inputCountry(String country) {
        getCountry().clear();
        getCountry().sendKeys(country);
        logger.info("Input country: " + country);
        return this;
    }

    public ContactDetailsPage clickSubmitBtn() {
        getSubmitBtn().click();
        logger.info("Submit button is clicked");
        return new ContactDetailsPage();
    }

    public ContactDetailsPage clickCancelBtn() {
        getCancelBtn().click();
        logger.info("Cancel button is clicked");
        return new ContactDetailsPage();
    }
}
