package com.spiro.managers;

import com.spiro.pageObjects.LoginTest.LoginTestPage;
import com.spiro.pageObjects.SwappingStationPageObj.SwappingStationPage;
import org.openqa.selenium.WebDriver;

public class PageManager {
    private WebDriver driver;
    private LoginTestPage loginTest;
    private SwappingStationPage swappingStationPage;

    public PageManager(WebDriver driver){
        this.driver=driver;
    }

    public LoginTestPage getLoginTest(){
        loginTest = new LoginTestPage(driver);
        return loginTest;
    }

    public SwappingStationPage getSwappingStationPage(){
        swappingStationPage = new SwappingStationPage(driver);
        return swappingStationPage;

    }

}
