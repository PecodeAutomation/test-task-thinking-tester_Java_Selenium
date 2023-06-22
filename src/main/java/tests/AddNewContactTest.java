package tests;

import base.BaseTest;
import base.TestAllureListener;
import com.github.javafaker.Faker;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;

import java.text.SimpleDateFormat;

@Listeners(TestAllureListener.class)
public class AddNewContactTest extends BaseTest {
    private LoginTests loginTests = new LoginTests();
    private Faker faker = new Faker();
    private String firstName = faker.name().firstName();
    private String lastName = faker.name().lastName();
    private String email = faker.internet().emailAddress();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private String birthday = dateFormat.format(faker.date().birthday());
    private String phone = faker.phoneNumber().cellPhone();
    private String streetAddress1 = faker.address().streetAddress();
    private String streetAddress2 = faker.address().streetAddress();
    private String city = faker.address().city();
    private String region = faker.address().state();
    private String zipCode = faker.address().zipCode();
    private String country = faker.address().country();


    @Test
    public void addContactWithRequiredFieldsOnly() {

        loginTests.validLoginTest();
        new MainPage()
                .clickAddNewContact()
                .inputFirstName(firstName)
                .inputLastName(lastName)
                .clickSubmitBtn()
                .assertPageIsOpened()
                .assertContactIsDisplayedByText(firstName.concat(" ").concat(lastName));
    }

    @Test
    public void addContact() {
        loginTests.validLoginTest();

        new MainPage()
                .clickAddNewContact()
                .inputFirstName(firstName)
                .inputLastName(lastName)
                .inputBirthday(birthday)
                .inputEmail(email)
                .inputPhone(phone)
                .inputStreetAddress1(streetAddress1)
                .inputStreetAddress2(streetAddress2)
                .inputCity(city)
                .inputStateOrProvince(region)
                .inputPostalCode(zipCode)
                .inputCountry(country)
                .clickSubmitBtn()
                .assertPageIsOpened()
                .assertContactIsDisplayedByText(firstName.concat(" ").concat(lastName));
    }
}
