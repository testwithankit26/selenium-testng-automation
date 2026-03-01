import java.time.Duration;

import browser.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reader.ConfigReader;

public class Broswertest {

    private WebDriver driver;
    private static final Logger logger = LoggerFactory.getLogger(Broswertest.class);

    @BeforeMethod
    public void setUp() {
        DriverManager.initDriver();
        driver = DriverManager.getWebDriver();
    }

    @Test(priority = 0)
    public void verifyLandingPageLoading() {
        driver.get(ConfigReader.getProperty("url"));
        Assert.assertEquals(driver.getTitle(), "Best Software Testing Services|Test Automation Services - Thoughtcoders");
        logger.info("Website Loading Successfully");

    }
    @Test(priority = 1)
    public void verifyQATools(){
        driver.get(ConfigReader.getProperty("url"));
        driver.findElement(By.xpath("//a[text()='QA Tools']")).click();
        Assert.assertEquals(driver.getTitle(), "QA Tools Dashboard - Professional Testing Tools & Utilities | ThoughtCoders");
        logger.info("Website QA Tools Successfully");
    }

    @AfterMethod
    public void tearDown() {
    	DriverManager.quitDriver();
    }


		
		

}
