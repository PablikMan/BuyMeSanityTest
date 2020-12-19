package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import static org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class Elements {


    ////////////////////Elements that belong to the login/registration process///////////////////////////////////////////////////////////////////////////
    public static final By LOGIN_OR_REGISTRATION_BUTTON = By.xpath("//li[@data-ember-action='739']");
    public static final By REGISTRATION_BUTTON_IN_LOGIN_WINDOW = By.xpath("//span[@data-ember-action='1212']");
    public static final By FIRST_NAME_FIELD_IN_REGISTRATION_WINDOW = By.xpath("//input[@placeholder='שם פרטי']");
    public static final By EMAIL_FIELD_IN_REGISTRATION_WINDOW = By.xpath("//input[@placeholder='מייל']");
    public static final By PASSWORD_FIELD_IN_REGISTRATION_WINDOW = By.xpath("//input[@placeholder='סיסמה']");
    public static final By CONFIRM_PASSWORD_FIELD_IN_REGISTRATION_WINDOW = By.xpath("//input[@placeholder='אימות סיסמה']");
    public static final By REGISTER_BUTTON_IN_REGISTRATION_WINDOW = By.xpath("//button[@class='ui-btn orange large']");
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////Elements that belong to the filter option in home page////////////////////////////////////////////////////////////////////////
    public static final By PRICE_LIST = By.xpath("//div[@id='ember780_chosen']");
    public static final By UP_TO_99_IN_PRICE_LIST = By.xpath("//li[@data-option-array-index='1']");
    public static final By AREA_LIST = By.xpath("//div[@id='ember795_chosen']");
    public static final By JERUSALEM_IN_AREA_LIST = By.xpath("//li[@data-option-array-index='5']");
    public static final By CATEGORY_LIST = By.xpath("//div[@id='ember805_chosen']");
    public static final By TO_YOUR_DOORSTEP_IN_CATEGORY_LIST = By.xpath("//li[@data-option-array-index='1']");
    public static final By FIND_ME_A_GIFT_BUTTON = By.xpath("//a[@class='ui-btn search ember-view']");
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /////////////////////////Elements that belong to choosing a business////////////////////////////////////////////////////////////////////////////////////
    public static final By OPTICANA_STORE = By.xpath("//a[@href='https://buyme.co.il/supplier/352936']");
    public static final By PRICE_FIELD_IN_OPTICANA_STORE = By.xpath("//input[@placeholder='מה הסכום?']");
    public static final By CONFIRM_BUTTON_IN_OPTICANA_STORE = By.xpath("//button[@class='btn btn-theme']");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////Elements that belong to the gift cards details////////////////////////////////////////////////////////////////////////////////
    public static final By TO_SOMEONE_ELSE_OPTION = By.xpath("//label[@data='forSomeone']");
    public static final By TO_WHOM_THE_GIFT_IS_FOR_FIELD = By.xpath("//input[@data-parsley-required-message='מי הזוכה המאושר? יש להשלים את שם המקבל/ת']");
    public static final By FROM_WHOM_THE_GIFT_IS_FIELD = By.xpath("//input[@data-parsley-required-message='למי יגידו תודה? שכחת למלא את השם שלך']");
    public static final By EVENT_LIST = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[1]/div/div[3]/label[1]/div");
    public static final By BIRTHDAY_EVENT_FROM_THE_EVENT_LIST = By.xpath("//li[@data-option-array-index='2']");
    public static final By BLESSING_BOX = By.xpath("//textarea[@rows='4']");
    public static final By UPLOAD_A_PICTURE_OPTION = By.xpath("//input[@name='fileUpload']");
    public static final By SEND_RIGHT_AFTER_PAYMENT_OPTION = By.xpath("//label[@class='send-now']");
    public static final By SEND_BY_MAIL_OPTION = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[4]/div/div[1]/div[2]/div/button");
    public static final By MAIL_TEXT_FIELD_POPUP = By.xpath("//input[@placeholder='כתובת המייל של מקבל/ת המתנה']");
    public static final By SAVE_BUTTON_IN_MAIL_OPTION = By.xpath("//button[@type='submit']");
    public static final By TO_WHOM_THE_GIFT_ON_CARD_EXAMPLE = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[2]/div/div/div[2]/div[2]/span[2]");
    public static final By FROM_WHOM_THE_GIFT_IS_ON_CARD_EXAMPLE = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[2]/div/div/div[2]/div[3]/span[2]");
}
