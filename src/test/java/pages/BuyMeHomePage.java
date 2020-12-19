package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BasePage;
import utilities.Elements;
import utilities.RandomEmailGen;

import java.time.Duration;

public class BuyMeHomePage extends BasePage {

    public void clickOnLoginOrRegistrationButton(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.LOGIN_OR_REGISTRATION_BUTTON));
        clickElement(Elements.LOGIN_OR_REGISTRATION_BUTTON);
    }

    public void clickOnTheRegistrationOption(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.REGISTRATION_BUTTON_IN_LOGIN_WINDOW));
        clickElement(Elements.REGISTRATION_BUTTON_IN_LOGIN_WINDOW);
    }

    public void submitForm(WebDriver driver){
        String firstName = "paul";
        String emailAddress = "paul6543219@gmail.com";
        String password = "Paul123456";

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.FIRST_NAME_FIELD_IN_REGISTRATION_WINDOW));
        sendKeysToElement(Elements.FIRST_NAME_FIELD_IN_REGISTRATION_WINDOW, firstName);
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.EMAIL_FIELD_IN_REGISTRATION_WINDOW));
        sendKeysToElement(Elements.EMAIL_FIELD_IN_REGISTRATION_WINDOW, RandomEmailGen.emailGen() + "@gmail.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.PASSWORD_FIELD_IN_REGISTRATION_WINDOW));
        sendKeysToElement(Elements.PASSWORD_FIELD_IN_REGISTRATION_WINDOW, password);
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.CONFIRM_PASSWORD_FIELD_IN_REGISTRATION_WINDOW));
        sendKeysToElement(Elements.CONFIRM_PASSWORD_FIELD_IN_REGISTRATION_WINDOW, password);
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.REGISTER_BUTTON_IN_REGISTRATION_WINDOW));
        clickElement(Elements.REGISTER_BUTTON_IN_REGISTRATION_WINDOW);
    }

    public void searchWithUsingTheFilters(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.presenceOfElementLocated((By) Elements.PRICE_LIST));
        clickElement((By) Elements.PRICE_LIST);
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.UP_TO_99_IN_PRICE_LIST));
        clickElement(Elements.UP_TO_99_IN_PRICE_LIST);

        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.AREA_LIST));
        clickElement(Elements.AREA_LIST);
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.JERUSALEM_IN_AREA_LIST));
        clickElement(Elements.JERUSALEM_IN_AREA_LIST);

        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.CATEGORY_LIST));
        clickElement(Elements.CATEGORY_LIST);
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.TO_YOUR_DOORSTEP_IN_CATEGORY_LIST));
        clickElement(Elements.TO_YOUR_DOORSTEP_IN_CATEGORY_LIST);

        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.FIND_ME_A_GIFT_BUTTON));
        clickElement(Elements.FIND_ME_A_GIFT_BUTTON);
    }
}
