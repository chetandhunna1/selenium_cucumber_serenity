Feature: GUI Automation Demonstration


  Scenario: UI Automation Demonstration Task2

    Given I open the NSW motor vehicle stamp duty page
    And The user clicks on Check Online button to assert the subsequent page opens
    When User clicks on Yes and enter a vehicle amount as "45000" and click the calculate button
    And User Assert the contents of the popup window

