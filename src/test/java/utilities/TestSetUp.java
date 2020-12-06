package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TestSetUp {
    public static WebDriver driver;
    public static ExtentSparkReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;

    public static void testSetUp(){
        htmlReporter = new ExtentSparkReporter("C:\\Users\\פבליק\\IdeaProjects\\BuyMeSanityTest\\src\\test\\java\\main_test\\SanityTest.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        test = extent.createTest("Sanity Test", "BuyMe sanity test");
        extent.setSystemInfo("Tester", "Paul");
    }

    public static String takeScreenShot(String imagePath){
        TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
        File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(imagePath + ".jpg");
        try {
            FileUtils.copyFile(screenShotFile, destinationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imagePath + ".jpg";
    }

}
