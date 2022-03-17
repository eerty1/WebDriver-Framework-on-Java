package hardcore_from_webdriver_pages.yop_mail;

import hardcore_from_webdriver_pages.GoogleCalculatorAbstractContainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YopMailGeneratedMailPage extends GoogleCalculatorAbstractContainer {
    private static final String XPATH_FOR_COPY_TO_CLIPBOARD_BUTTON = "//button[@id='cprnd']//span[@class='notmobile']";
    private static final String XPATH_FOR_OPEN_MAIL_BOX_PAGE = "//button[@class='md but text f24 egenbut' and @onclick='egengo();']//i[@class='material-icons-outlined']";
    private final WebDriver DRIVER;

    @FindBy(xpath = XPATH_FOR_COPY_TO_CLIPBOARD_BUTTON)
    private WebElement copyToClipboardButton;

    @FindBy(xpath = XPATH_FOR_OPEN_MAIL_BOX_PAGE)
    private WebElement openMailBoxPage;

    public YopMailGeneratedMailPage(WebDriver DRIVER) {
        this.DRIVER = DRIVER;
        PageFactory.initElements(DRIVER, this);
    }

    public YopMailBox generateEmailAndOpenBox() {
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_COPY_TO_CLIPBOARD_BUTTON);
        copyToClipboardButton.click();
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_OPEN_MAIL_BOX_PAGE);
        openMailBoxPage.click();
        return new YopMailBox(DRIVER);
    }
}
