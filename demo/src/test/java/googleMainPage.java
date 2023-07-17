import org.openqa.selenium.WebDriver;

public class googleMainPage {
    WebDriver driver;

    public googleMainPage(WebDriver driv) {
        driver = driv;
    }
    
    String getTitle() {
        return driver.getTitle();
    }

    void goToGoogleMain() {
        driver.get("https://www.google.com");
    }
}
