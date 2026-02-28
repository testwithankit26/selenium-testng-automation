import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.time.Duration; // Import the Duration class

public class SeleniumTestWithScreenshot {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
    	String chromeBinaryPath = "\"C:\\Users\\shubh\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe\"";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary(chromeBinaryPath);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @Test
    public void exampleTest() {
        driver.get("https://auth-stg.lumyri.com/auth/signIn");
        WebElement element = driver.findElement(By.xpath("//a[@class='Auth_linkName__TJpHw']"));
        String actualText = element.getText();
        String expectedText = "Welcome to Example.com";
        Assert.assertEquals(actualText, expectedText, "Text doesn't match the expected value.");

 
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            
            try {
                TakesScreenshot screenshot = (TakesScreenshot) driver;
                File source = screenshot.getScreenshotAs(OutputType.FILE);
                String screenshotName = result.getName() + "_" + System.currentTimeMillis() + ".png";
                String screenshotDirectory = "screenshots/";
                File target = new File(screenshotDirectory + screenshotName);
                FileUtils.copyFile(source, target);
                System.out.println("Screenshot saved: " + screenshotName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

       
        if (driver != null) {
            driver.quit();
        }
    }
}
