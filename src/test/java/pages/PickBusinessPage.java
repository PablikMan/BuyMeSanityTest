package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BasePage;
import utilities.Elements;

import java.time.Duration;

public class PickBusinessPage extends BasePage {

    public void chooseBusiness(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.OPTICANA_STORE));
        clickElement(Elements.OPTICANA_STORE);
    }

    public void enterAPriceAndClickOnTheConfirmButton(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.PRICE_FIELD_IN_OPTICANA_STORE));
        sendKeysToElement(Elements.PRICE_FIELD_IN_OPTICANA_STORE, "22");
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.CONFIRM_BUTTON_IN_OPTICANA_STORE));
        clickElement(Elements.CONFIRM_BUTTON_IN_OPTICANA_STORE);
    }

    public void toWhomToSendBlock(WebDriver driver){
        String forWhom = "mom";
        String fromWhom = "paul";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.TO_SOMEONE_ELSE_OPTION));
        clickElement(Elements.TO_SOMEONE_ELSE_OPTION);
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.TO_WHOM_THE_GIFT_IS_FOR_FIELD));
        sendKeysToElement(Elements.TO_WHOM_THE_GIFT_IS_FOR_FIELD, forWhom);
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.FROM_WHOM_THE_GIFT_IS_FIELD));
        sendKeysToElement(Elements.FROM_WHOM_THE_GIFT_IS_FIELD, fromWhom);
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.EVENT_LIST));
        clickElement(Elements.EVENT_LIST);
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.BIRTHDAY_EVENT_FROM_THE_EVENT_LIST));
        clickElement(Elements.BIRTHDAY_EVENT_FROM_THE_EVENT_LIST);
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.BLESSING_BOX)).clear();
        sendKeysToElement(Elements.BLESSING_BOX, "happy birthday :)");
    }

    public void uploadAPicture(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.UPLOAD_A_PICTURE_OPTION)).sendKeys("C:\\Users\\פבליק\\IdeaProjects\\BuyMeSanityTest\\src\\test\\java\\images\\wings.png");
    }

    public void chooseWhenToSend(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.SEND_RIGHT_AFTER_PAYMENT_OPTION));
        clickElement(Elements.SEND_RIGHT_AFTER_PAYMENT_OPTION);
    }

    public void sendByMailOption(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.SEND_BY_MAIL_OPTION));
        clickElement(Elements.SEND_BY_MAIL_OPTION);
        wait.until(ExpectedConditions.presenceOfElementLocated(Elements.MAIL_TEXT_FIELD_POPUP));
        sendKeysToElement(Elements.MAIL_TEXT_FIELD_POPUP, "paul123456@gmail.com");
        driver.findElement(Elements.SAVE_BUTTON_IN_MAIL_OPTION);
        clickElement(Elements.SAVE_BUTTON_IN_MAIL_OPTION);
    }

}
