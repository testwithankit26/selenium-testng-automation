import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Broswertest {

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
    public void testSearch() {
        driver.get("https://accelerator.escindia.in/");
        WebElement searchInput = driver.findElement(By.xpath("//input[@id='looking_filterKL']"));
        searchInput.clear();
        searchInput.sendKeys("search");
        

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hero\"]/div/div/div[1]/form/button")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
        submitButton.click();
    }

    @AfterMethod
    public void tearDown() {
    	driver.close();
    	driver.quit();
        
    }


		
		

}
