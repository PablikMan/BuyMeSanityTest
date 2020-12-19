package utilities;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class BasePage extends TestSetUp {

    private static WebDriver driver;

    private WebElement getWebElement(By locator){
        return Driver.getChromeDriverInstance().findElement(locator);
    }

    public void clickElement(By locator){
        try {
            getWebElement(locator).click();
        }catch (NoSuchElementException e){
            test.log(Status.FAIL, "could not find locator" + locator);
            takeScreenShot("C:\\Users\\פבליק\\IdeaProjects\\BuyMeSanityTest\\src\\test\\java\\images\\screenshot");
        }
    }

    public void sendKeysToElement(By locator, String text){
        try{
            getWebElement(locator).sendKeys(text);
        }catch (NoSuchElementException e){
            test.log(Status.FAIL, "could not find locator" + locator);
            takeScreenShot("C:\\Users\\פבליק\\IdeaProjects\\BuyMeSanityTest\\src\\test\\java\\images\\screenshot");
        }
    }

}
