package pages;

import base.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import pages.elements.ContactDetailsPageElements;

public class ContactDetailsPage extends BasePage implements ContactDetailsPageElements {
    private static final Logger logger = LogManager.getLogger(ContactDetailsPage.class.getName());

    public ContactDetailsPage() {
        super();
    }

    private WebElement getEditContactBtn() {
        return getElementByID(EDIT_CONTACT_BTN_ID);
    }

    private WebElement getDeleteBtn() {
        return getElementByID(DELETE_CONTACT_BTN_ID);
    }

    private WebElement getReturnToContactList() {
        return getElementByID(RETURN_TO_CONTACT_LIST_ID);
    }

    public EditContactPage clickEditContact() {
        getEditContactBtn().click();
        logger.info("Edit contact button clicked");
        return new EditContactPage();
    }

    public ContactDetailsPage clickDelete() {
        getDeleteBtn().click();
        logger.info("Delete button clicked");
        return this;
    }

    public MainPage clickConfirmDeleteContact() {
        driver.switchTo().alert().accept();
        logger.info("Confirm delete contact clicked");
        return new MainPage();
    }

    public ContactDetailsPage clickCancelDeleteContact() {
        driver.switchTo().alert().dismiss();
        logger.info("Cancel delete contact clicked");
        return this;
    }

    public MainPage clickReturnToContactList() {
        getReturnToContactList().click();
        logger.info("Return to Contact List button clicked");
        return new MainPage();
    }
}
