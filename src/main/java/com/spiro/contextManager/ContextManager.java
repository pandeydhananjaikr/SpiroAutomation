package com.spiro.contextManager;
import com.spiro.managers.DriverManager;
import com.spiro.managers.PageManager;

public class ContextManager {
    private DriverManager driverManager;
    private PageManager pageManager;

    public ContextManager() {
        driverManager = new DriverManager();
        pageManager = new PageManager(driverManager.getDriver());
    }

    public DriverManager getDriverManager() {
        return driverManager;
    }

    public PageManager getPageManager() {
        return pageManager;
    }

}
