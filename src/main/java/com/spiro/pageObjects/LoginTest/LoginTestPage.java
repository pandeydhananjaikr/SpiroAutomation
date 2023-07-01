package com.spiro.pageObjects.LoginTest;

import com.spiro.managers.ReaderManager;
import com.spiro.utilsClass.UtilsClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;


public class LoginTestPage {
    private static WebDriver driver;

    public LoginTestPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement usernameTextBox;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordTextBox;
    @FindBy(xpath = "//button[text()='Log In']")
    private WebElement loginButton;

    @FindBy(xpath = "//h4[text()='Dashboard']")
    private WebElement dashboardOnLandingPage;

    Logger logger = LoggerFactory.getLogger(LoginTestPage.class);

    public void userIsOnHomePage() {
        LoginTestPage.driver.get(ReaderManager.getInstance().getPropertiesReaders().getUrl());
        LoginTestPage.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }

    public void enterUsernameAndPassword() {
        UtilsClass.waitUntilElementIsVisible(usernameTextBox, LoginTestPage.driver, 20);
        usernameTextBox.sendKeys(ReaderManager.getInstance().getPropertiesReaders().getUsername());
        UtilsClass.waitUntilElementIsVisible(passwordTextBox, LoginTestPage.driver, 20);
        passwordTextBox.sendKeys(ReaderManager.getInstance().getPropertiesReaders().getPassword());
    }

    public void clickOnLoginButton() {
        UtilsClass.waitUntilElementIsVisible(loginButton, LoginTestPage.driver, 20);
        loginButton.click();
        UtilsClass.waitUntilElementIsVisible(dashboardOnLandingPage, LoginTestPage.driver, 50);

    }

    public void userShouldBeAbleToLogin(String expectedText) {
        String actualText = dashboardOnLandingPage.getText();
        logger.info("expectedText " + expectedText);
        logger.info("actualText " + actualText);
        Assert.assertEquals("Validate Successful Login", expectedText, actualText);
    }


}
