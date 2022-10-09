package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.RegisterUser;

public class RegisterUserSteps {

    RegisterUser registerUser = new RegisterUser();

    @Given("user open automationexercise.com website")
    public void userOpenAutomationexerciseComWebsite() {
        registerUser.openRegisterUserPage();
    }

    @When("user click SignUpOrLogin")
    public void userClickSignUpOrLogin() {
        registerUser.clickSignupOrLogin();
    }

    @When("user fill name {string}")
    public void userFillName(String text) {
        registerUser.typeName(text);
    }

    @When("user fill email address {string}")
    public void userFillEmailAddress(String text) {
        registerUser.inputEmailAddress(text);
    }

    @When("user click button SignUp")
    public void userClickButtonSignUp() throws InterruptedException {
        registerUser.clickButtonSignUp();
    }

    @When("user click title {string}")
    public void userClickTitle(String text) {
        registerUser.inputTitle();
    }

    @When("user fill password field {string}")
    public void userFillPasswordField(String text) {
        registerUser.typePassword(text);
    }

    @When("user click day {string}")
    public void userClickDay(String text) {
        registerUser.clickSelectDayDateOfBird();
    }

    @When("user click month {string}")
    public void userClickMonth(String text) {
        registerUser.clickSelectMonthDateOfBird();
    }

    @When("user click year {string}")
    public void userClickYear(String text) {
        registerUser.clickYearMonthDateOfBird();
    }

    @When("user click sign up for our newsletter!")
    public void userClickSignUpForOurNewsletter() {
        registerUser.clickInputSignUpForOurNewsletter();
    }

    @When("user click receive special offers from our partners!")
    public void userClickReceiveSpecialOffersFromOurPartners() {
        registerUser.clickInputReceiveSpecialOffersFromOurPartners();
    }

    @When("user fill first name {string}")
    public void userFillFirstName(String text) {
        registerUser.typeFirstName(text);
    }

    @When("user fill last name {string}")
    public void userFillLastName(String text) {
        registerUser.typeLastName(text);
    }

    @When("user fill company {string}")
    public void userFillCompany(String text) {
        registerUser.typeCompany(text);
    }

    @When("user fill address {string}")
    public void userFillAddress(String text) {
        registerUser.typeAddress(text);
    }

    @When("user fill address{int} {string}")
    public void userFillAddress(int address, String text) {
        registerUser.typeAddress2(text);
    }

    @When("user click country {string}")
    public void userClickCountry(String text) {
        registerUser.clickSelectCountry();
    }

    @When("user fill state {string}")
    public void userFillState(String text) {
        registerUser.typeState(text);
    }

    @When("user fill city {string}")
    public void userFillCity(String text) {
        registerUser.typeCity(text);
    }

    @When("user fill zipcode {string}")
    public void userFillZipcode(String text) {
        registerUser.typeZipCode(text);
    }

    @When("user fill mobilenumber {string}")
    public void userFillMobilenumber(String text) {
        registerUser.typeMobileNumber(text);
    }

    @When("user click button create account")
    public void userClickButtonCreateAccount() throws InterruptedException {
        registerUser.clickButtonCreateAccount();
    }

    @When("user click button continue")
    public void userClickButtonContinue() throws InterruptedException {
        registerUser.clickButtonContinue();
    }
}
