
 
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSel {
    WebDriver driver;
    @Test
    public void test() {
        String setProperty = System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        googleMainPage mainPage = new googleMainPage(driver);
        mainPage.goToGoogleMain();
        Assert.assertEquals("Google", mainPage.getTitle());
    }
 
    @After
    public void afterTest() {
        driver.quit();
    }
}

