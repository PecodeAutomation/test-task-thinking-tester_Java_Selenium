package tests;

import base.BaseTest;
import base.TestAllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;

@Listeners(TestAllureListener.class)
public class DeleteContactTest extends BaseTest {
    private LoginTests loginTests = new LoginTests();

    @Test
    public void deleteExistingContactTest() {
        loginTests.validLoginTest();

        new MainPage()
                .assertPageIsOpened()
                .assertContactIsDisplayedByText("Mykola Plakhotnik")
                .clickToOpenContactByText("Mykola Plakhotnik")
                .clickDelete()
                .clickConfirmDeleteContact()
                .assertPageIsOpened()
                .assertContactIsNotDisplayedByText("Mykola Plakhotnik");
    }
}
