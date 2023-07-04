package com.spiro.pageObjects.SwappingStationPageObj;

import com.spiro.pageObjects.LoginTest.LoginTestPage;
import com.spiro.utilsClass.UtilsClass;
import jdk.jshell.execution.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

public class SwappingStationPage {

    private static WebDriver driver;

    public SwappingStationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    Logger logger = LoggerFactory.getLogger(SwappingStationPage.class);

    @FindBy(xpath = "//span[text()=' Swapping Station ']/../i")
    private WebElement swappingStation;

    @FindBy(xpath = "//a[@href='stations/add']/i")
    private WebElement addStationTab;

    @FindBy(xpath = "//a[@href='stations/list']/i")
    private WebElement swappingStationListsTab;


    @FindBy(xpath = "//a[@data-original-title='Click here to add new']")
    private WebElement addNewButton;

    @FindBy(xpath = "//div[@class='col-md-6']//div[@class='dropify-message']//span[@class='file-icon']")
    private WebElement stationImageUpload;

    @FindBy(xpath = "/input[@id='uploaded_file']")
    private WebElement fileUpload;

    @FindBy(xpath = "//input[@id='station_code']")
    private WebElement stationCodeInputField;

    @FindBy(xpath = "//input[@id='station_name']")
    private WebElement stationNameInputField;

    @FindBy(xpath = "//input[@type='date']")
    private WebElement installationDateInputField;

    @FindBy(xpath = "//select[@id='service_location']")
    private WebElement serviceLocationDropDown;


    public void userNavigateToSwappingStation(){
        UtilsClass.waitUntilElementIsVisible(swappingStation,SwappingStationPage.driver,20);
        swappingStation.click();
        UtilsClass.waitUntilElementIsVisible(swappingStationListsTab,SwappingStationPage.driver,20);
        swappingStationListsTab.click();
    }

    public void userClicksOnAddNewButton(){
        UtilsClass.waitUntilElementIsVisible(addNewButton,SwappingStationPage.driver,20);
        UtilsClass.clickOperationUsingJavaScript(SwappingStationPage.driver,addNewButton);
    }

    public void userSelectsStationImage(){
//        UtilsClass.waitUntilElementIsVisible(stationImageUpload,SwappingStationPage.driver,20);
//        stationImageUpload.click();
//       UtilsClass.waitForGivenTime(2000);
//        UtilsClass.clickOperationUsingJavaScript(SwappingStationPage.driver,stationImageUpload);

//        UtilsClass.waitUntilElementIsVisible(fileUpload,SwappingStationPage.driver,20);
//        fileUpload.click();
//        UtilsClass.clickOperationUsingJavaScript(SwappingStationPage.driver, fileUpload);

    }

    public void userEntersStationCodeAndStationName(String stationCode, String stationName){
        UtilsClass.waitUntilElementIsVisible(stationCodeInputField, SwappingStationPage.driver,20);
        stationCodeInputField.sendKeys(stationCode);
        UtilsClass.waitUntilElementIsVisible(stationNameInputField, SwappingStationPage.driver,20);
        stationNameInputField.sendKeys(stationName);

    }

    public void userEntersInstallationDateAndServiceLocation(String date, String serviceLocation){

        UtilsClass.waitUntilElementIsVisible(installationDateInputField, SwappingStationPage.driver, 20);
        installationDateInputField.sendKeys(date);
        UtilsClass.waitUntilElementIsVisible(serviceLocationDropDown, SwappingStationPage.driver, 20);
        UtilsClass.selectDropDownByVisibleText(SwappingStationPage.driver, serviceLocationDropDown,serviceLocation);
        UtilsClass.waitForGivenTime(10000);
    }





}
