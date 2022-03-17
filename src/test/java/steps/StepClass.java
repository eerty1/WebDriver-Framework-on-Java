package steps;

import hardcore_from_webdriver_pages.calculator.GoogleCloudCalculatorInitialSettings;
import hardcore_from_webdriver_pages.calculator.GoogleCloudHomePage;
import hardcore_from_webdriver_pages.calculator.GoogleCloudSearchResults;
import hardcore_from_webdriver_pages.yop_mail.YopMailBox;
import hardcore_from_webdriver_pages.yop_mail.YopMailGeneratedMailPage;
import hardcore_from_webdriver_pages.yop_mail.YopMailHomePage;
import model.NumberOfInstancesAndPurpose;
import org.openqa.selenium.WebDriver;
import service.NumberOfInstancesAndPurposeCreator;
import utility.BrowserSettings;
import utility.KeyboardImitations;

import java.util.List;

public class StepClass {

    public void openCalculator(WebDriver driver) {
        GoogleCloudHomePage googleCloudHomePage = new GoogleCloudHomePage(driver);
        GoogleCloudSearchResults googleCloudSearchResults = new GoogleCloudSearchResults(driver);
        googleCloudHomePage.searchInputAction();
        googleCloudSearchResults.enquiryAction();
    }

    public void implementGoogleCalculatorSettings(WebDriver driver) {
        GoogleCloudCalculatorInitialSettings googleCloudCalculatorInitialSettings = new GoogleCloudCalculatorInitialSettings(driver);
        googleCloudCalculatorInitialSettings.changeFrame();
        NumberOfInstancesAndPurpose numberOfInstancesAndPurpose = NumberOfInstancesAndPurposeCreator.withCredentialsFromProperty();
        googleCloudCalculatorInitialSettings.setNumberOfInstancesAndPurpose(numberOfInstancesAndPurpose);
        googleCloudCalculatorInitialSettings.setSeries();
        googleCloudCalculatorInitialSettings.setMachineType();
        googleCloudCalculatorInitialSettings.addGPU();
        googleCloudCalculatorInitialSettings.setGPUType();
        googleCloudCalculatorInitialSettings.setNumberOfGPUs();
        googleCloudCalculatorInitialSettings.setLocalSSD();
        googleCloudCalculatorInitialSettings.setDatacenterLocation();
        googleCloudCalculatorInitialSettings.setCommittedUsage();
        googleCloudCalculatorInitialSettings.addToEstimate();
    }

    public void createTemporaryEmail(WebDriver driver) {
        YopMailHomePage yopMailHomePage = new YopMailHomePage(driver);
        YopMailGeneratedMailPage yopMailGeneratedMailPage = new YopMailGeneratedMailPage(driver);
        yopMailHomePage.clickButtonCreateRandomEmail();
        yopMailGeneratedMailPage.generateEmailAndOpenBox();
    }

    public void inputTheEmailInCalculatorPage(WebDriver driver) {
        GoogleCloudCalculatorInitialSettings googleCloudCalculatorInitialSettings = new GoogleCloudCalculatorInitialSettings(driver);
        googleCloudCalculatorInitialSettings.changeFrame();
        googleCloudCalculatorInitialSettings.emailButtonClick();
        googleCloudCalculatorInitialSettings.fillTheEmailInputAndSendEmail();
    }

    public void receiveTheEmail(WebDriver driver) {
        YopMailBox yopMailBox = new YopMailBox(driver);
        yopMailBox.refreshButtonClick();
        yopMailBox.framesChange();
    }

    public void openNewTab() {
        KeyboardImitations keyboardImitations = new KeyboardImitations();
        keyboardImitations.openNewTab();
        keyboardImitations.switchToFirstTab();
    }

    public void switchTheBrowserToTheSecondTab(WebDriver driver, List<String> tabsContainer) {
        KeyboardImitations keyboardImitations = new KeyboardImitations();
        keyboardImitations.switchToSecondTab();
        driver.switchTo().window(tabsContainer.get(1));
    }

    public void switchTheBrowserToTheFirstTab(WebDriver driver, List<String> tabsContainer) {
        KeyboardImitations keyboardImitations = new KeyboardImitations();
        keyboardImitations.switchToFirstTab();
        driver.switchTo().window(tabsContainer.get(0));
    }

    public void setupBrowser(WebDriver driver, String URL) {
        BrowserSettings browserSettings = new BrowserSettings();
        browserSettings.retrieveURL(driver, URL);
    }
}
