package com.spiro.stepDefinition;

import com.spiro.contextManager.ContextManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    ContextManager contextManager;

    public Hooks(ContextManager contextManager) {
        this.contextManager = contextManager;
    }

    @Before
    public void beforeScenario() {

    }

    @After
    public void afterScenario() {
        contextManager.getDriverManager().shutDownBrowser();
    }

    @AfterStep
    public void takeScreeShot(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) contextManager.
                    getDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screeShot");
        }

    }
}
