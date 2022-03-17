package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import service.GoogleCloudCalculatorTestMethods;
import steps.StepClass;

import java.util.LinkedList;
import java.util.List;

public class testIfTheCostsCoincide extends CommonConditions {
    public static StepClass stepClass;
    public static GoogleCloudCalculatorTestMethods googleCloudCalculatorTestMethods;
    public static List<String> tabs;

    @BeforeMethod
    public void beforeMethodSetUp() {
        stepClass = new StepClass();
        googleCloudCalculatorTestMethods = new GoogleCloudCalculatorTestMethods(driver);
    }

    @Test
    public void ifCostsFromEmailAndCalculatorEqual() {
        stepClass.setupBrowser(driver, "https://cloud.google.com/");
        stepClass.openNewTab();
        stepClass.openCalculator(driver);
        stepClass.implementGoogleCalculatorSettings(driver);
        googleCloudCalculatorTestMethods.saveCalculatorCost();
        tabs = new LinkedList<>(driver.getWindowHandles());
        stepClass.switchTheBrowserToTheSecondTab(driver, tabs);
        stepClass.setupBrowser(driver, "https://yopmail.com/");
        stepClass.createTemporaryEmail(driver);
        stepClass.switchTheBrowserToTheFirstTab(driver, tabs);
        stepClass.inputTheEmailInCalculatorPage(driver);
        stepClass.switchTheBrowserToTheSecondTab(driver, tabs);
        stepClass.receiveTheEmail(driver);
        googleCloudCalculatorTestMethods.saveEmailCost();
        Assert.assertTrue(googleCloudCalculatorTestMethods.checkIfTheCostsSimilar());
    }
}
