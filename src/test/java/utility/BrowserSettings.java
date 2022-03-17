package utility;

import org.openqa.selenium.WebDriver;

public class BrowserSettings {
    public void retrieveURL(WebDriver driver, String link) {
        driver.get(link);
    }
}
