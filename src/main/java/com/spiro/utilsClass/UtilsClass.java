package com.spiro.utilsClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UtilsClass {
    static WebDriver driver;
    public UtilsClass(WebDriver driver) {
        UtilsClass.driver = driver;
        PageFactory.initElements(driver, null);
    }

    public static void waitUntilElementIsVisible(WebElement element, WebDriver driver, int duration){
        new WebDriverWait(driver, Duration.ofSeconds(duration)).until(ExpectedConditions.visibilityOf(element));

    }

    public static void waitForGivenTime(int duration){
        try{
            Thread.sleep(duration);
        }
        catch(Exception e){

        }

    }

    public static void clickOperationUsingJavaScript(WebDriver driver, WebElement element){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click();", element);
    }

    public static void selectDropDownByVisibleText(WebDriver driver, WebElement element, String visibleText){
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }


}
