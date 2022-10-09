package locators;

import org.openqa.selenium.By;

public interface RegisterUserLocator {

    By LINK_SIGNUPORLOGIN = By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");

    By INPUT_NAME = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]");

    By EMAIL_ADDRESS = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]");

    By BUTTON_SIGNUP = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]");

    By TITLE = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/label[1]/div[1]/span[1]/input[1]");

    By INPUT_PASSWORD = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/input[1]");

    By SELECT_DAYS = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/select[1]/option[12]");

    By SELECT_MONTH = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[2]/div[1]/select[1]/option[11]");

    By SELECT_YEAR = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[3]/div[1]/select[1]/option[37]");

    By CLICK_SIGNUP_FOR_OUR_NEWSLETTER = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/span[1]/input[1]");

    By CLICK_RECEIVE_SPECIAL_OFFERS_FROM_OUR_PARTNERS = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/span[1]/input[1]");

    By INPUT_FIRSTNAME = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]");

    By INPUT_LASTNAME = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]");

    By INPUT_COMPANY = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[3]/input[1]");

    By ADDRESS = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[4]/input[1]");

    By ADDRESS2 = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[5]/input[1]");

    By COUNTRY = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[6]/select[1]/option[1]");

    By INPUT_STATE = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[7]/input[1]");

    By INPUT_CITY = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[8]/input[1]");

    By INPUT_ZIPCODE = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[9]/input[1]");

    By INPUT_MOBILE_NUMBER = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[10]/input[1]");

    By BUTTON_CREATE_ACCOUNT = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]");

    By BUTTON_CONTINUE = By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]");

}