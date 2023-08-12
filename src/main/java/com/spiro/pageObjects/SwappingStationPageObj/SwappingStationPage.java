package com.spiro.pageObjects.SwappingStationPageObj;
import com.spiro.pageObjects.LoginTest.LoginTestPage;
import com.spiro.utilsClass.UtilsClass;
import io.opentelemetry.api.internal.Utils;
import jdk.jshell.execution.Util;
import org.junit.Assert;
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

    @FindBy(xpath = "//div[@class='col-md-6']//div[@class='dropify-wrapper']")
    private WebElement stationImageUpload;
    @FindBy(xpath = "//input[@id='uploaded_file']")
    private WebElement fileUpload;

    @FindBy(xpath = "//button[normalize-space()='Upload']")
    private WebElement uploadButton;
    @FindBy(xpath = "//input[@id='station_code']")
    private WebElement stationCodeInputField;
    @FindBy(xpath = "//input[@id='station_name']")
    private WebElement stationNameInputField;
    @FindBy(xpath = "//input[@type='date']")
    private WebElement installationDateInputField;
    @FindBy(xpath = "//select[@id='service_location']")
    private WebElement serviceLocationDropDown;

    @FindBy(xpath = "//input[@id='geolocation']")
    private WebElement addressInputField;
    @FindBy(xpath = "//input[@id='station_capacity']")
    private WebElement storageCapacityInputField;
    @FindBy(xpath = "//input[@id='charging_capacity']")
    private WebElement chargingCapacityInputField;

    @FindBy(xpath = "//input[@id='model_number']")
    private WebElement modelNumberInputField;

    @FindBy(xpath = "//input[@id='lat' and @placeholder='Latitude']")
    private WebElement latitudeInputField;
    @FindBy(xpath = "//input[@id='lng' and @placeholder='Longitude']")
    private WebElement longitudeInputField;

    @FindBy(xpath = "//select[@id='status']")
    private WebElement statusDropDown;
    @FindBy(xpath = "//button[@id='sbmtBtn']")
    private WebElement stationSubmitButton;

// InfoPage Elements
    @FindBy(xpath = "//th[text()='Service Location']/../td")
    private WebElement serviceLocationInfo;
    @FindBy(xpath = "//th[text()='Station Code']/../td")
    private WebElement stationCodeInfo;
    @FindBy(xpath = "//th[text()='Station Name']/../td")
    private WebElement stationNameInfo;

    @FindBy(xpath = "//th[text()='Address']/../td")
    private WebElement addressInfo;
    @FindBy(xpath = "//th[text()='Station Capacity']/../td")
    private WebElement stationCapacityInfo;
    @FindBy(xpath = "//th[text()='Charging capacity']/../td")
    private WebElement chargingCapacityInfo;
    @FindBy(xpath = "//th[text()='GPS Coordinates']/../td")
    private WebElement gpsCoordinatesInfo;
    @FindBy(xpath = "//th[text()='Installation date']/../td")
    private WebElement modelNumberInfo;
    @FindBy(xpath = "//th[text()='Installation date']/../td")
    private WebElement installationDateInfo;
    @FindBy(xpath = "//th[text()='Status']/../td")
    private WebElement statusInfo;








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

    String imagePath = System.getProperty("user.dir")+"\\src\\test\\resources\\uploadFIle\\stationImage.jpg";
    public void userSelectsStationImage(){
        UtilsClass.waitForGivenTime(2000);
        stationImageUpload.click();
        UtilsClass.waitForGivenTime(2000);
        fileUpload.sendKeys(imagePath);
        UtilsClass.waitForGivenTime(2000);
        uploadButton.click();
        UtilsClass.waitForGivenTime(3000);
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

    }

    public  void userEntersAddress(String address){
        UtilsClass.waitUntilElementIsVisible(addressInputField, SwappingStationPage.driver, 20);
        addressInputField.sendKeys(address);
        UtilsClass.waitForGivenTime(2000);
        UtilsClass.downArrowOperationUsingRobotClass(1);
        UtilsClass.enterOperationUsingRobotClass();

    }
    public void userEntersStorageAndChargingCapacity(String storageCapacity, String chargingCapacity){
        UtilsClass.waitUntilElementIsVisible(storageCapacityInputField,SwappingStationPage.driver,20);
        storageCapacityInputField.sendKeys(storageCapacity);

        UtilsClass.waitUntilElementIsVisible(chargingCapacityInputField,SwappingStationPage.driver,20);
        chargingCapacityInputField.sendKeys(chargingCapacity);
    }
    public void userEntersModelNumber(String modelNumber){
        UtilsClass.waitUntilElementIsVisible(modelNumberInputField,SwappingStationPage.driver,20);
        modelNumberInputField.sendKeys(modelNumber);
    }
    public void userEntersLatitudeAndLongitude(String latitude, String longitude){
        UtilsClass.waitUntilElementIsVisible(latitudeInputField,SwappingStationPage.driver,20);
        latitudeInputField.sendKeys(latitude);
        UtilsClass.waitUntilElementIsVisible(latitudeInputField,SwappingStationPage.driver,20);
        longitudeInputField.sendKeys(longitude);
    }

    public void userSelectsTheStatus(String status){
        UtilsClass.waitUntilElementIsVisible(statusDropDown, SwappingStationPage.driver,20);
        UtilsClass.selectDropDownByVisibleText(SwappingStationPage.driver, statusDropDown, status);
    }

    public void userClicksOnStationSubmitButton(){
       UtilsClass.waitForGivenTime(2000);
       UtilsClass.clickOperationUsingJavaScript(SwappingStationPage.driver, stationSubmitButton);
//       stationSubmitButton.click();
        UtilsClass.waitForGivenTime(4000);
    }

    public void validateIfStationIsCreatedSuccessfully(String expectedServiceLocation, String expectedStationCode
    ,String expectedStationName, String expectedAddress, String expectedStationCapacity
            ,String expectedChargingCapacity, String expectedLatitude, String expectedLongitude
    , String expectedModelNumber, String expectedInstallationDate, String expectedStatus){

        String actualServiceLocation = serviceLocationInfo.getText();
        System.out.println("expectedServiceLocation : " + expectedServiceLocation);
        System.out.println("actualServiceLocation : "+ actualServiceLocation);
        Assert.assertEquals("Validate Service Location", expectedServiceLocation, actualServiceLocation );

        String actualStationCode = stationCodeInfo.getText();
        System.out.println("expectedStationCode : " + expectedStationCode);
        System.out.println("actualStationCode : "+ actualStationCode);
        Assert.assertEquals("Validate Station Code", expectedStationCode, actualStationCode );

        String actualStationName = stationNameInfo.getText();
        System.out.println("expectedStationName : " + expectedStationName);
        System.out.println("actualStationName : "+ actualStationName);
        Assert.assertEquals("Validate Station Name", expectedStationName, actualStationName );

        String actualAddress = addressInfo.getText();
        System.out.println("expectedAddress : " + expectedAddress);
        System.out.println("actualAddress : "+ actualAddress);
        Assert.assertTrue("Validate Station Address", actualAddress.contains(expectedAddress));

        String actualStationCapacity = stationCapacityInfo.getText();
        System.out.println("expectedStationCapacity : " + expectedStationCapacity);
        System.out.println("actualStationCapacity : "+ actualStationCapacity);
        Assert.assertEquals("Validate Station Capacity", expectedStationCapacity, actualStationCapacity );

        String actualChargingCapacity = chargingCapacityInfo.getText();
        System.out.println("expectedChargingCapacity : " + expectedChargingCapacity);
        System.out.println("actualChargingCapacity : "+ actualChargingCapacity);
        Assert.assertEquals("Validate Charging Capacity", expectedChargingCapacity, actualChargingCapacity );

        String actualCoordinates = gpsCoordinatesInfo.getText();
        System.out.println("actualCoordinates : "+ actualCoordinates);
        System.out.println("expectedLatitude : "+ expectedLatitude);
        System.out.println("expectedLongitude : "+ expectedLongitude);

        String actualModelNumber = modelNumberInfo.getText();
        System.out.println("expectedModelNumber : " + expectedModelNumber);
        System.out.println("actualModelNumber : "+ actualModelNumber);
        Assert.assertEquals("Validate Model Number", expectedModelNumber, actualModelNumber );

        String actualInstallationDate = installationDateInfo.getText();
        System.out.println("expectedInstallationDate : " + expectedInstallationDate);
        System.out.println("actualInstallationDate : "+ actualInstallationDate);
//        Assert.assertEquals("Validate installation date", expectedInstallationDate, actualInstallationDate );

        String actualStatus = statusInfo.getText();
        System.out.println("expectedStatus : " + expectedStatus);
        System.out.println("actualStatus : "+ actualStatus);
        Assert.assertEquals("Validate status", expectedStatus, actualStatus );


    }












}
