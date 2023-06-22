package tests;

import base.BaseTest;
import base.TestAllureListener;
import builder.UserBuilder;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;

@Listeners(TestAllureListener.class)
public class LoginTests extends BaseTest {

    @Test
    public void validLoginTest() {
        new LoginPage()
                .inputEmail(UserBuilder.getDefaultUser().getEmail())
                .inputPassword(UserBuilder.getDefaultUser().getPassword())
                .clickSubmitBtn()
                .assertPageIsOpened();
    }
}
