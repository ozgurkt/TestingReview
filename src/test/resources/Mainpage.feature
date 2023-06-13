@main
Feature: Mainpage Function Test

#As a user I want to navigate to all main and sub-menu items

    #ACCEPTANCE CRITERIA:
    #User should be able to see main navigation menu options
    #Main navigation menu items should be 4
    #Submenu items pageTitles should be as expected
    #Submenu items pageURL should be as expected

  Scenario: Main Navigation Menu and Sub Menu Items
    Given User goes to main page
    Then User should see following options on Main Navigation Bar
      | Technology |
      | Services   |
      | Resources  |
      | Company    |
    Then Verify Mainmenu Options count is 4
    #When User navigates to "<mainMenu>" "<subMenu>"
    #Then Verify actual title is "<expectedTitle>"
    #And verify actualURL is "<expectedURL>"

    #Examples:
    #  | subMenu   | mainMenu   | expectedTitle                   | expectedURL                              |
    #  | Dashboard | Technology | Dashboards - Basis Technologies | https://basis.com/technology/dashboards/ |
