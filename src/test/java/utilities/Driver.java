package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver extends XMLSetUp {

    private static WebDriver driver;

    public static WebDriver getChromeDriverInstance(){
        if (driver == null){
            String browser = getData("browserType");
            if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\פבליק\\Documents\\ChromeDriver\\chromedriver.exe");
                driver = new ChromeDriver();
            }
        }
        return driver;
    }

    public static WebDriver openURL(String website){
        if (website.equals("BuyMe")){
            website = getData("url");
            driver.get("https://buyme.co.il/");
        }
        return driver;
    }
}
