package hardcore_from_webdriver_pages.calculator;

import hardcore_from_webdriver_pages.GoogleCalculatorAbstractContainer;
import model.NumberOfInstancesAndPurpose;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleCloudCalculatorInitialSettings extends GoogleCalculatorAbstractContainer {
    private static final String XPATH_FOR_FRAME_1 = "//devsite-iframe//iframe[@allow='clipboard-write https://cloud-dot-devsite-v2-prod.appspot.com']";
    private static final String XPATH_FOR_FRAME_2 = "//div[@class='cp-header']//iframe[@id='myFrame']";
    private static final String XPATH_FOR_NUMBER_OF_INSTANCES = "//input[@ng-model='listingCtrl.computeServer.quantity']";
    private static final String XPATH_FOR_WHAT_ARE_THESE_INSTANCES_FOR = "//input[@ng-model='listingCtrl.computeServer.label']";
    private static final String XPATH_FOR_SERIES = "//md-select[@placeholder = 'Series']";
    private static final String XPATH_FOR_SERIES_N1 = "//md-option[@value='n1']";
    private static final String XPATH_FOR_MACHINE_TYPE = "//md-select[@placeholder='Instance type']";
    private static final String XPATH_FOR_CURRENT_MACHINE_TYPE_TYPE_N1_STANDARD_D8 = "//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']";
    private static final String XPATH_FOR_GPU_CHECK_BOX = "//md-checkbox[@ng-model='listingCtrl.computeServer.addGPUs']//div[@class='md-label']";
    private static final String XPATH_FOR_GPU_TYPE = "//md-select[@placeholder='GPU type']";
    private static final String XPATH_FOR_CURRENT_GPU_TYPE_NVIDIA_V100 = "//md-option[@value='NVIDIA_TESLA_V100']";
    private static final String XPATH_FOR_NUMBER_OF_GPUS = "//md-select[@placeholder='Number of GPUs']";
    private static final String XPATH_FOR_GPU_1 = "//md-option[@ng-disabled='item.value != 0 && item.value < listingCtrl.minGPU' and @value='1']";
    private static final String XPATH_FOR_LOCAL_SSD = "//md-select[@placeholder='Local SSD']";
    private static final String XPATH_FOR_X375_GB = "//md-option[@ng-repeat='item in listingCtrl.dynamicSsd.computeServer' and @value='4']";
    private static final String XPATH_FOR_DATACENTER_LOCATION = "//md-select[@placeholder='Datacenter location' and @ng-model='listingCtrl.computeServer.location']";
    private static final String XPATH_FOR_FRANKFURT_DATACENTER_LOCATION = "//md-option[@value='europe-west3' and @ng-repeat='item in listingCtrl.fullRegionList | filter:listingCtrl.inputRegionText.computeServer']";
    private static final String XPATH_FOR_COMMITTED_USAGE = "//md-select[@placeholder='Committed usage' and @ng-disabled='listingCtrl.isCudDisabled']";
    private static final String XPATH_FOR_YEAR_OF_USAGE_1 = "//div[@class='md-select-menu-container md-active md-clickable']//md-option[@ng-value='1']//div[text()='1 Year']";
    private static final String XPATH_FOR_ESTIMATE_BUTTON = "//button[@class='md-raised md-primary cpc-button md-button md-ink-ripple']";
    private static final String XPATH_FOR_EMAIL_ESTIMATE_BUTTON = "//*[@id=\"email_quote\"]";
    private static final String XPATH_FOR_EMAIL_INPUT = "//input[@name='description' and @ng-model='emailQuote.user.email']";
    private static final String XPATH_FOR_SEND_EMAIL_BUTTON = "//button[@class='md-raised md-primary cpc-button md-button md-ink-ripple' and contains(text(),'Send Email')]";
    private static final String XPATH_FOR_TOTAL_ESTIMATE = "//h2[@class='md-title']//b[@class='ng-binding' and contains(text(),'Total Estimated Cost')]";
    private final WebDriver DRIVER;
    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = XPATH_FOR_FRAME_1)
    private WebElement frame1;

    @FindBy(xpath = XPATH_FOR_FRAME_2)
    private WebElement frame2;

    @FindBy(xpath = XPATH_FOR_NUMBER_OF_INSTANCES)
    private WebElement numberOfInstances;

    @FindBy(xpath = XPATH_FOR_WHAT_ARE_THESE_INSTANCES_FOR)
    private WebElement whatAreTheseInstancesFor;

    @FindBy(xpath = XPATH_FOR_SERIES)
    private WebElement series;

    @FindBy(xpath = XPATH_FOR_SERIES_N1)
    private WebElement seriesN1;

    @FindBy(xpath = XPATH_FOR_MACHINE_TYPE)
    private WebElement machineType;

    @FindBy(xpath = XPATH_FOR_CURRENT_MACHINE_TYPE_TYPE_N1_STANDARD_D8)
    private WebElement currentMachineTypeN1Standard8;

    @FindBy(xpath = XPATH_FOR_GPU_CHECK_BOX)
    private WebElement GPUCheckBox;

    @FindBy(xpath = XPATH_FOR_GPU_TYPE)
    private WebElement GPUType;

    @FindBy(xpath = XPATH_FOR_CURRENT_GPU_TYPE_NVIDIA_V100)
    private WebElement currentGPUTypeNVIDIAV100;

    @FindBy(xpath = XPATH_FOR_NUMBER_OF_GPUS)
    private WebElement numberOfGPUs;

    @FindBy(xpath = XPATH_FOR_GPU_1)
    private WebElement GPU1;

    @FindBy(xpath = XPATH_FOR_LOCAL_SSD)
    private WebElement localSSD;

    @FindBy(xpath = XPATH_FOR_X375_GB)
    private WebElement x375GB;

    @FindBy(xpath = XPATH_FOR_DATACENTER_LOCATION)
    private WebElement datacenterLocation;

    @FindBy(xpath = XPATH_FOR_FRANKFURT_DATACENTER_LOCATION)
    private WebElement frankfurtDatacenterLocation;

    @FindBy(xpath = XPATH_FOR_COMMITTED_USAGE)
    private WebElement committedUsage;

    @FindBy(xpath = XPATH_FOR_YEAR_OF_USAGE_1)
    private WebElement yearOfUsage1;

    @FindBy(xpath = XPATH_FOR_ESTIMATE_BUTTON)
    private WebElement estimateButton;

    @FindBy(xpath = XPATH_FOR_EMAIL_ESTIMATE_BUTTON)
    private WebElement emailEstimateButton;

    @FindBy(xpath = XPATH_FOR_EMAIL_INPUT)
    private WebElement emailInput;

    @FindBy(xpath = XPATH_FOR_SEND_EMAIL_BUTTON)
    private WebElement sendEmailButton;

    @FindBy(xpath = XPATH_FOR_TOTAL_ESTIMATE)
    private WebElement totalEstimate;

    public GoogleCloudCalculatorInitialSettings(WebDriver DRIVER) {
        PageFactory.initElements(DRIVER, this);
        this.DRIVER = DRIVER;
    }

    public GoogleCloudCalculatorInitialSettings changeFrame() {
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_FRAME_1);
        DRIVER.switchTo().defaultContent();
        DRIVER.switchTo().frame(frame1);
        DRIVER.switchTo().frame(frame2);
        return this;
    }

    public GoogleCloudCalculatorInitialSettings setNumberOfInstancesAndPurpose(NumberOfInstancesAndPurpose numberOfInstancesAndPurpose) {
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_NUMBER_OF_INSTANCES);
        numberOfInstances.sendKeys(numberOfInstancesAndPurpose.getNumberOfInstance());
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_WHAT_ARE_THESE_INSTANCES_FOR);
        whatAreTheseInstancesFor.sendKeys(numberOfInstancesAndPurpose.getWhatAreTheseInstancesFor());
        return this;
    }

    public GoogleCloudCalculatorInitialSettings setSeries() {
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_SERIES);
        series.click();
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_SERIES_N1);
        seriesN1.click();
        return this;

    }

    public GoogleCloudCalculatorInitialSettings setMachineType() {
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_MACHINE_TYPE);
        machineType.click();
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_CURRENT_MACHINE_TYPE_TYPE_N1_STANDARD_D8);
        currentMachineTypeN1Standard8.click();
        return this;
    }

    public GoogleCloudCalculatorInitialSettings addGPU() {
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_GPU_CHECK_BOX);
        GPUCheckBox.click();
        return this;
    }

    public GoogleCloudCalculatorInitialSettings setGPUType() {
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_GPU_TYPE);
        GPUType.click();
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_CURRENT_GPU_TYPE_NVIDIA_V100);
        currentGPUTypeNVIDIAV100.click();
        return this;
    }

    public GoogleCloudCalculatorInitialSettings setNumberOfGPUs() {
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_NUMBER_OF_GPUS);
        numberOfGPUs.click();
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_GPU_1);
        GPU1.click();
        return this;
    }

    public GoogleCloudCalculatorInitialSettings setLocalSSD() {
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_LOCAL_SSD);
        localSSD.click();
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_X375_GB);
        x375GB.click();
        return this;
    }

    public GoogleCloudCalculatorInitialSettings setDatacenterLocation() {
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_DATACENTER_LOCATION);
        datacenterLocation.click();
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_FRANKFURT_DATACENTER_LOCATION);
        frankfurtDatacenterLocation.click();
        return this;
    }

    public GoogleCloudCalculatorInitialSettings setCommittedUsage() {
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_COMMITTED_USAGE);
        committedUsage.click();
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_YEAR_OF_USAGE_1);
        yearOfUsage1.click();
        return this;
    }

    public GoogleCloudCalculatorInitialSettings addToEstimate() {
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_ESTIMATE_BUTTON);
        estimateButton.click();
        logger.info("Calculator Estimate Created");
        return this;
    }


    public GoogleCloudCalculatorInitialSettings emailButtonClick() {
        makeTheProgramWaitElementToBeClickable(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_EMAIL_ESTIMATE_BUTTON);
        emailEstimateButton.click();
        return this;
    }

    public GoogleCloudCalculatorInitialSettings fillTheEmailInputAndSendEmail() {
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_EMAIL_INPUT);
        emailInput.click();
        emailInput.sendKeys(Keys.CONTROL + "v");
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_SEND_EMAIL_BUTTON);
        sendEmailButton.click();
        return this;
    }

    public String takeTotalEstimateText() {
        makeTheProgramWaitPresenceOfElementLocated(DRIVER, WAIT_TIMEOUT_SECONDS, XPATH_FOR_TOTAL_ESTIMATE);
        return totalEstimate.getText();
    }
}
