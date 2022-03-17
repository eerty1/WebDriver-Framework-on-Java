package hardcore_from_webdriver_pages.calculator;

import hardcore_from_webdriver_pages.GoogleCalculatorAbstractContainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleCloudSearchResults extends GoogleCalculatorAbstractContainer {
    private static final String XPATH_FOR_REQUIRED_ENQUIRY = "//a[@class='gs-title']";
    private final WebDriver DRIVER;

    @FindBy(xpath = XPATH_FOR_REQUIRED_ENQUIRY)
    private WebElement requiredEnquiry;

    public GoogleCloudSearchResults(WebDriver DRIVER) {
        PageFactory.initElements(DRIVER, this);
        this.DRIVER = DRIVER;
    }

    public GoogleCloudCalculatorInitialSettings enquiryAction() {
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_REQUIRED_ENQUIRY);
        requiredEnquiry.click();
        return new GoogleCloudCalculatorInitialSettings(DRIVER);
    }
}
