package pages;

import base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static locators.RegisterUserLocator.*;

public class RegisterUser extends BasePageObject {

    public void openRegisterUserPage() {
        openPage("https://automationexercise.com/");
    }

    public void clickSignupOrLogin() {
        click(LINK_SIGNUPORLOGIN);
    }

    public void typeName(String text) {
        WebElement element = find(INPUT_NAME);
        element.clear();
        element.sendKeys(text);
    }

    public void inputEmailAddress(String text) {
        WebElement element = find(EMAIL_ADDRESS);
        element.clear();
        element.sendKeys(text);
    }

    public void clickButtonSignUp() throws InterruptedException {
        click(BUTTON_SIGNUP);
        Thread.sleep(3000);
    }

    public void inputTitle() {
        click(TITLE);
    }

    public void typePassword(String text) {
        WebElement element = find(INPUT_PASSWORD);
        element.clear();
        element.sendKeys(text);
    }

    public void clickSelectDayDateOfBird() {
        click(SELECT_DAYS);
    }

    public void clickSelectMonthDateOfBird() {
        click(SELECT_MONTH);
    }

    public void clickYearMonthDateOfBird() {
        click(SELECT_YEAR);
    }

    public void clickInputSignUpForOurNewsletter() {
        click(CLICK_SIGNUP_FOR_OUR_NEWSLETTER);
    }

    public void clickInputReceiveSpecialOffersFromOurPartners() {
        click(CLICK_RECEIVE_SPECIAL_OFFERS_FROM_OUR_PARTNERS);
    }

    public void typeFirstName(String text) {
        WebElement element = find(INPUT_FIRSTNAME);
        element.clear();
        element.sendKeys(text);
    }

    public void typeLastName(String text) {
        WebElement element = find(INPUT_LASTNAME);
        element.clear();
        element.sendKeys(text);
    }

    public void typeCompany(String text) {
        WebElement element = find(INPUT_COMPANY);
        element.clear();
        element.sendKeys(text);
    }

    public void typeAddress(String text) {
        WebElement element = find(ADDRESS);
        element.clear();
        element.sendKeys(text);
    }

    public void typeAddress2(String text) {
        WebElement element = find(ADDRESS2);
        element.clear();
        element.sendKeys(text);
    }

    public void clickSelectCountry() {
        click(COUNTRY);
    }

    public void typeState(String text) {
        WebElement element = find(INPUT_STATE);
        element.clear();
        element.sendKeys(text);
    }

    public void typeCity(String text) {
        WebElement element = find(INPUT_CITY);
        element.clear();
        element.sendKeys(text);
    }

    public void typeZipCode(String text) {
        WebElement element = find(INPUT_ZIPCODE);
        element.clear();
        element.sendKeys(text);
    }

    public void typeMobileNumber(String text) {
        WebElement element = find(INPUT_MOBILE_NUMBER);
        element.clear();
        element.sendKeys(text);
    }

    public void clickButtonCreateAccount() throws InterruptedException {
        click(BUTTON_CREATE_ACCOUNT);
        Thread.sleep(3000);
    }

    public void clickButtonContinue() throws InterruptedException {
        click(BUTTON_CONTINUE);
        Thread.sleep(3000);
    }
}