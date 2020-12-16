package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Connection;

public class Driver extends DataBaseSetup {

    private static WebDriver driver;
    private static Connection con;

    public static WebDriver getChromeDriverInstance(){
        if (driver == null){
            con = getConnection();
            //createConfigTable(con);
            String urlString = getConfigTableURL(con);
            String typeOfBrowser = getConfigTableBrowser(con);
            if (typeOfBrowser.equals("chrome")){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\פבליק\\Documents\\ChromeDriver\\chromedriver.exe");
                driver = new ChromeDriver();
            }
            if (urlString.equals("https://buyme.co.il/")) {
                driver.get(urlString);
            }

        }
        return driver;
    }

}
