package com.spiro.stepDefinition.LoginTestStepDef;

import com.spiro.contextManager.ContextManager;
import com.spiro.pageObjects.LoginTest.LoginTestPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogintestStepdef {
    ContextManager contextManager;
    LoginTestPage loginTest;
    public LogintestStepdef(ContextManager contextManager){
        this.contextManager=contextManager;
        loginTest = contextManager.getPageManager().getLoginTest();
    }

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        loginTest.userIsOnHomePage();
    }
    @When("User enters the login email and password")
    public void user_enters_the_login_email_and_password() {
        loginTest.enterUsernameAndPassword();
    }
    @And("User click on the login button")
    public void user_click_on_the_login_button() {
        loginTest.clickOnLoginButton();
    }
    @Then("User should be able to login")
    public void user_should_be_able_to_login() {
        loginTest.userShouldBeAbleToLogin("dashboard");
    }


}
