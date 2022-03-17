package hardcore_from_webdriver_pages.yop_mail;

import hardcore_from_webdriver_pages.GoogleCalculatorAbstractContainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YopMailHomePage extends GoogleCalculatorAbstractContainer {
    private static final String XPATH_FOR_RANDOM_EMAIL_BUTTON = "//a[@href='email-generator']";
    private final WebDriver DRIVER;

    @FindBy(xpath = XPATH_FOR_RANDOM_EMAIL_BUTTON)
    private WebElement randomEmailButton;

    public YopMailHomePage(WebDriver DRIVER) {
        this.DRIVER = DRIVER;
        PageFactory.initElements(DRIVER, this);
    }

    public YopMailGeneratedMailPage clickButtonCreateRandomEmail() {
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_RANDOM_EMAIL_BUTTON);
        randomEmailButton.click();
        return new YopMailGeneratedMailPage(DRIVER);
    }
}
