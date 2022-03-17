package hardcore_from_webdriver_pages.yop_mail;

import hardcore_from_webdriver_pages.GoogleCalculatorAbstractContainer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YopMailBox extends GoogleCalculatorAbstractContainer {
    private static final String XPATH_FOR_REFRESH_BUTTON = "//button[@class='md but textu f36']";
    private static final String XPATH_FOR_MAIL_MAKER = "//div[@class='flexcxy']//div[@id='nbmail']";
    private static final String XPATH_FOR_FRAME_1 = "//iframe[@name='ifmail']";
    private static final String XPATH_FOR_ESTIMATE_COST_EMAIL = "//tr//td//h3[contains(text(),'USD')]";
    private final WebDriver DRIVER;
    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = XPATH_FOR_REFRESH_BUTTON)
    private WebElement refreshButton;

    @FindBy(xpath = XPATH_FOR_MAIL_MAKER)
    private WebElement mailMarker;

    @FindBy(xpath = XPATH_FOR_FRAME_1)
    private WebElement frame1;

    @FindBy(xpath = XPATH_FOR_ESTIMATE_COST_EMAIL)
    private WebElement estimateCostEmail;

    public YopMailBox(WebDriver DRIVER) {
        this.DRIVER = DRIVER;
        PageFactory.initElements(DRIVER, this);
    }

    public YopMailBox refreshButtonClick() {
        while (mailMarker.getText().contains("0")) {
            makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_REFRESH_BUTTON);
            refreshButton.click();
        }
        logger.info("The email has come!!!");
        return this;
    }

    public YopMailBox framesChange() {
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_FRAME_1);
        DRIVER.switchTo().defaultContent();
        DRIVER.switchTo().frame(frame1);
        return this;
    }

    public String takeEstimateCostEmail() {
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_ESTIMATE_COST_EMAIL);
        return estimateCostEmail.getText();
    }
}
