package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class BasePage {

    private static WebDriver driver;

    private WebElement getWebElement(By locator){
        return Driver.getChromeDriverInstance().findElement(locator);
    }

    public void clickElement(By locator){
        getWebElement(locator).click();
    }

    public void sendKeysToElement(By locator, String text){
        getWebElement(locator).sendKeys(text);
    }

}
