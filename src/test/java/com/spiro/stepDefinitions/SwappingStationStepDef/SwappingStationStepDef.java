package com.spiro.stepDefinitions.SwappingStationStepDef;
import com.spiro.contextManager.ContextManager;
import com.spiro.pageObjects.LoginTest.LoginTestPage;
import com.spiro.pageObjects.SwappingStationPageObj.SwappingStationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwappingStationStepDef {

    ContextManager contextManager;
    SwappingStationPage swappingStationPage;

    public SwappingStationStepDef(ContextManager contextManager) {
        this.contextManager = contextManager;
        swappingStationPage = contextManager.getPageManager().getSwappingStationPage();
    }

    @When("User navigates to add swapping station page")
    public void user_navigates_to_add_swapping_station_page() {
        swappingStationPage.userNavigateToSwappingStation();

    }

    @And("User clicks on Add new swapping station button to create new swapping station")
    public void user_clicks_on_add_new_swapping_station_button_to_create_new_swapping_station() {
        swappingStationPage.userClicksOnAddNewButton();
    }
    @And("User selects station image")
    public void user_selects_station_image() {
        swappingStationPage.userSelectsStationImage();

    }

    @And("User enters station code as {string} and station name as {string}")
    public void user_enters_station_code_as_and_station_name_as(String stationCode, String stationName) {
        swappingStationPage.userEntersStationCodeAndStationName(stationCode,stationName);
    }

    @And("User enters installation date as {string} and service location as {string}")
    public void user_enters_installation_date_as_and_service_location_as(String installationDate, String serviceLocation) {
    swappingStationPage.userEntersInstallationDateAndServiceLocation(installationDate, serviceLocation);
    }

    @And("User enters Address as {string}")
    public void user_enters_address_as(String address) {

    }

    @And("User enters storage capacity as {string} and charging capacity as {string}")
    public void user_enters_storage_capacity_as_and_charging_capacity_as(String storageCapacity, String chargingCapacity) {

    }

    @And("User enters model number as {string}")
    public void user_enters_model_number_as(String modelNumber) {

    }

    @And("User enters latitude as {string} and longitude as {string}")
    public void user_enters_latitude_as_and_longitude_as(String latitude, String longitude) {

    }

    @And("User selects the checkbox of status as {string}")
    public void user_selects_the_checkbox_of_status_as(String status) {

    }

    @And("User clicks on the submit button to create a new swapping station")
    public void user_clicks_on_the_submit_button_to_create_a_new_swapping_station() {

    }

    @Then("User should be able to create a new swapping station")
    public void user_should_be_able_to_create_a_new_swapping_station() {


    }

}
