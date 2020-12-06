package utilities;

import org.openqa.selenium.By;

public class Elements {

    ////////////////////Elements that belong to the login/registration process///////////////////////////////////////////////////////////////////////////
    public static final By LOGIN_OR_REGISTRATION_BUTTON = By.xpath("/html/body/div[2]/div/header/div[1]/div/ul[1]/li[3]");
    public static final By REGISTRATION_BUTTON_IN_LOGIN_WINDOW = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/p/span");
    public static final By FIRST_NAME_FIELD_IN_REGISTRATION_WINDOW = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/div/div[3]/form/div[1]/label/input");
    public static final By EMAIL_FIELD_IN_REGISTRATION_WINDOW = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/div/div[3]/form/div[2]/label/input");
    public static final By PASSWORD_FIELD_IN_REGISTRATION_WINDOW = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/div/div[3]/form/div[3]/label/input");
    public static final By CONFIRM_PASSWORD_FIELD_IN_REGISTRATION_WINDOW = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/div/div[3]/form/div[4]/label/input");
    public static final By REGISTER_BUTTON_IN_REGISTRATION_WINDOW = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[3]/div/div[3]/form/button");
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////Elements that belong to the filter option in home page////////////////////////////////////////////////////////////////////////
    public static final By PRICE_LIST = By.xpath("/html/body/div[2]/div/header/div[3]/div/form/div[1]/a");
    public static final By UP_TO_99_IN_PRICE_LIST = By.xpath("/html/body/div[2]/div/header/div[3]/div/form/div[1]/div/ul/li[2]");
    public static final By AREA_LIST = By.xpath("/html/body/div[2]/div/header/div[3]/div/form/div[2]/a");
    public static final By JERUSALEM_IN_AREA_LIST = By.xpath("/html/body/div[2]/div/header/div[3]/div/form/div[2]/div/ul/li[6]");
    public static final By CATEGORY_LIST = By.xpath("/html/body/div[2]/div/header/div[3]/div/form/div[3]/a");
    public static final By TO_YOUR_DOORSTEP_IN_CATEGORY_LIST = By.xpath("/html/body/div[2]/div/header/div[3]/div/form/div[3]/div/ul/li[2]");
    public static final By FIND_ME_A_GIFT_BUTTON = By.xpath("/html/body/div[2]/div/header/div[3]/div/form/a");
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /////////////////////////Elements that belong to choosing a business////////////////////////////////////////////////////////////////////////////////////
    public static final By OPTICANA_STORE = By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div[2]/a");
    public static final By PRICE_FIELD_IN_OPTICANA_STORE = By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/form/div[1]/div[1]/div/div/div/input");
    public static final By CONFIRM_BUTTON_IN_OPTICANA_STORE = By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/form/div[2]/div/button");
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////Elements that belong to the gift cards details////////////////////////////////////////////////////////////////////////////////
    public static final By TO_SOMEONE_ELSE_OPTION = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[1]/div/div[1]/label[1]");
    public static final By TO_WHOM_THE_GIFT_IS_FOR_FIELD = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[1]/div/div[2]/label[1]/input");
    public static final By FROM_WHOM_THE_GIFT_IS_FIELD = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[1]/div/div[2]/label[2]/input");
    public static final By EVENT_LIST = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[1]/div/div[3]/label[1]/div/a");
    public static final By BIRTHDAY_EVENT_FROM_THE_EVENT_LIST = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[1]/div/div[3]/label[1]/div/div/ul/li[2]");
    public static final By BLESSING_BOX = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[1]/div/div[3]/label[2]/textarea");
    public static final By UPLOAD_A_PICTURE_OPTION = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[2]/div/label[1]/input");
    public static final By SEND_RIGHT_AFTER_PAYMENT_OPTION = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[3]/div/div[1]/label[1]");
    public static final By SEND_BY_MAIL_OPTION = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[4]/div/div[1]/div[2]/div/button");
    public static final By MAIL_TEXT_FIELD_POPUP = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[4]/div/div[4]/div/div[1]/div/div/input");
    public static final By SAVE_BUTTON_IN_MAIL_OPTION = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[1]/div/div[2]/div[4]/div/div[4]/div/div[2]/button[2]");
    public static final By TO_WHOM_THE_GIFT_ON_CARD_EXAMPLE = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[2]/div/div/div[2]/div[2]/span[2]");
    public static final By FROM_WHOM_THE_GIFT_IS_ON_CARD_EXAMPLE = By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/div[2]/div/div/div[2]/div[3]/span[2]");
}
