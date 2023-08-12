Feature: Validate the functionality of swapping station

  Background:
    Given User is on the homepage
    When User enters the login email and password
    And User click on the login button
    Then User should be able to login

  @swap
  Scenario Outline: TC-1001 Verify User should be able to add a swapping station
    When User navigates to add swapping station page
    And User clicks on Add new swapping station button to create new swapping station
    And User selects station image
    And User enters station code as "<station code>" and station name as "<station name>"
    And User enters installation date as "<installation date>" and service location as "<service location>"
    And User enters Address as "<Address>"
    And User enters storage capacity as "<Storage Capacity>" and charging capacity as "<Charging Capacity>"
    And User enters model number as "<Model Number>"
    And User enters latitude as "<latitude>" and longitude as "<longitude>"
    And User selects the status as "<status>"
    And User clicks on the submit button to create a new swapping station
    Then User should be able to create a new swapping station with details as "<service location>" "<station code>" "<station name>" "<Address>" "<Storage Capacity>" "<Charging Capacity>" "<latitude>" "<longitude>" "<Model Number>" "<installation date>" "<status>"
    Examples:
      | station code | station name | installation date | service location | Address | Storage Capacity | Charging Capacity | Model Number | latitude | longitude | status   |
      | abcd1234     | abcstation   | 07/04/2023        | Togo             | Chennai | 15               | 10                | abcd         | 10.3     | 10.3      | Inactive |

