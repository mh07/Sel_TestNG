package mason1;

import com.hp.lft.report.Reporter;
import com.hp.lft.reportbuilder.*;
import com.hp.lft.report.Status;
import com.hp.lft.sdk.internal.common.MessageFieldNames;
import jdk.internal.org.jline.terminal.TerminalBuilder;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.util.concurrent.SimpleTimeLimiter;
import com.hpe.leanft.selenium.*;
import com.hpe.leanft.selenium.By;
import com.hpe.leanft.selenium.ByEach;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import com.hp.lft.verifications.*;
import com.hp.lft.*;


public class SeleniumTest {


    @BeforeClass
    public void beforeClass() throws Exception {

    }

    @AfterClass
    public void afterClass() throws Exception {
    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
    }

    @AfterMethod
    public void afterMethod() throws Exception {
    }

    @Test
    public void test() throws Exception {

        // Set the path to the ChromeDriver executable
        //System.setProperty("chromedriver.chrome.driver", "C:/Users/demo/Desktop/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://advantageonlineshopping.com");
        while (true) {
            try {
                if (driver.findElement(By.xpath("//*[@id='speakersImg']")).isDisplayed()) {
                    break; // Exit the loop if the element is found
                }
            } catch (NoSuchElementException e) {
                // Element not found, keep looping
            }
        }
        driver.findElement(By.xpath("//*[@id='speakersImg']")).click();

        while (true) {
            try {
                if (driver.findElement(By.xpath("//*[@id='speakersImg']")).isDisplayed()) {
                    break; // Exit the loop if the element is found
                }
            } catch (NoSuchElementException e) {
                // Element not found, keep looping
            }
        }
        while (true) {
            try {
                if (driver.findElement(By.visibleText("BUY NOW")).isDisplayed()) {
                    break; // Exit the loop if the element is found
                }
            } catch (NoSuchElementException e) {
                // Element not found, keep looping
            }
        }

         if (driver.findElement(By.visibleText("BUY NOW")).isDisplayed()) {

             Assert.assertTrue(true);
         } else {
             Assert.fail();
         }
         // close the browser
          driver.close();





    }
}