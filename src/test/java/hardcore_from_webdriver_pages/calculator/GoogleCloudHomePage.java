package hardcore_from_webdriver_pages.calculator;

import hardcore_from_webdriver_pages.GoogleCalculatorAbstractContainer;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleCloudHomePage extends GoogleCalculatorAbstractContainer {
    private static final String XPATH_FOR_SEARCH_INPUT = "//input[@placeholder='Search']";
    private final WebDriver DRIVER;

    @FindBy(xpath = XPATH_FOR_SEARCH_INPUT)
    private WebElement searchInput;

    public GoogleCloudHomePage(WebDriver DRIVER) {
        PageFactory.initElements(DRIVER, this);
        this.DRIVER = DRIVER;
    }

    public GoogleCloudSearchResults searchInputAction() {
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_SEARCH_INPUT);
        searchInput.click();
        searchInput.sendKeys("Google Cloud Platform Pricing Calculator");
        searchInput.sendKeys(Keys.ENTER);
        return new GoogleCloudSearchResults(DRIVER);
    }
}
