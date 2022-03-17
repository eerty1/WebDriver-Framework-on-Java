package hardcore_from_webdriver_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleCalculatorAbstractContainer {
    protected final int WAIT_TIMEOUT_SECONDS = 10;

    protected void makeTheProgramWaitPresenceOfElementLocated(WebDriver driver, int time, String xpath) {
        new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    protected void makeTheProgramWaitElementToBeClickable(WebDriver driver, int time, String xpath) {
        new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }
}
