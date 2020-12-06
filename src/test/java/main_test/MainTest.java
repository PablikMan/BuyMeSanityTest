package main_test;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BuyMeHomePage;
import pages.PickBusinessPage;
import utilities.Driver;
import utilities.TestSetUp;

import static utilities.XMLSetUp.getData;

public class MainTest extends TestSetUp {

    private static WebDriver driver;

    @BeforeClass
    public static void setDriverAndOpenWebsite(){
        testSetUp();
        driver = Driver.getChromeDriverInstance();
        driver.manage().window().maximize();
        Driver.openURL("BuyMe");
        test.log(Status.INFO, "beginning of the test");
    }

    @Test(priority = 1)
    public static void test_01(){
        BuyMeHomePage buyMeHomePage = new BuyMeHomePage();
        buyMeHomePage.clickOnLoginOrRegistrationButton(driver);
        test.log(Status.PASS, "Clicking on the login/register button in homepage");
    }

    @Test(priority = 2)
    public static void test_02(){
        BuyMeHomePage buyMeHomePage = new BuyMeHomePage();
        buyMeHomePage.clickOnTheRegistrationOption(driver);
        test.log(Status.PASS, "Clicking on the registration button inside the login window");
    }

    @Test(priority = 3)
    public static void test_03(){
        BuyMeHomePage buyMeHomePage = new BuyMeHomePage();
        buyMeHomePage.submitForm(driver);
        test.log(Status.PASS, "Filling all the required fields and clicking on the register button");
    }

    @Test(priority = 4)
    public static void test_04(){
        BuyMeHomePage buyMeHomePage = new BuyMeHomePage();
        buyMeHomePage.searchWithUsingTheFilters(driver);
        test.log(Status.PASS, "Using the search function with the filters");
    }

    @Test(priority = 5)
    public static void test_05(){
        PickBusinessPage pickBusinessPage = new PickBusinessPage();
        pickBusinessPage.chooseBusiness(driver);
        test.log(Status.PASS, "Choosing a business from the results of the filters");
    }

    @Test(priority = 6)
    public static void test_06(){
        PickBusinessPage pickBusinessPage = new PickBusinessPage();
        pickBusinessPage.enterAPriceAndClickOnTheConfirmButton(driver);
        test.log(Status.PASS, "Entering a desired price, and clicking on the confirm button");
    }

    @Test(priority = 7)
    public static void test_07(){
        PickBusinessPage pickBusinessPage = new PickBusinessPage();
        pickBusinessPage.toWhomToSendBlock(driver);
        test.log(Status.PASS, "Filling the required fields in the 'whom to send' block");
    }

    @Test(priority = 8)
    public static void test_08(){
        PickBusinessPage pickBusinessPage = new PickBusinessPage();
        pickBusinessPage.uploadAPicture(driver);
        test.log(Status.PASS, "Uploading a picture to the site, so it will show on the gift card");
    }

    @Test(priority = 9)
    public static void test_09(){
        PickBusinessPage pickBusinessPage = new PickBusinessPage();
        pickBusinessPage.chooseWhenToSend(driver);
        test.log(Status.PASS, "Choosing the 'immediately after payment' option for when will the gift card arrives");
    }

    @Test(priority = 10)
    public static void test_10(){
        PickBusinessPage pickBusinessPage = new PickBusinessPage();
        pickBusinessPage.sendByMailOption(driver);
        test.log(Status.PASS, "Choosing the 'mail' option, and filling in an email. The gift card will be send to that email");
    }

    @AfterClass
    public static void closeDriverAndWebsite(){
        driver.close();
        test.log(Status.INFO, "end of test");
        extent.flush();
    }


}
