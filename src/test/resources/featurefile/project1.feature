Feature: Project 1 – Testing Website Using Selenium WebDriver

  @tc1 @url @tc6-1
  Scenario: Test the login screen with username and password in alert
    Given user selects Basic Auth
    When user enters user and password (user: "admin" and pass: "admin")
    Then verify login

  @tc2 @url2 @tc6-2
  Scenario: Test online widgets like date pickers, sliders
    Given user selects date pickers
    When user selects date day"1" month"1" and year "2020"
    Then user gets to main page and select sliders and get to "75" percent

  @tc3 @url
  Scenario: Test interactive actions like draggable, selectable etc.
    Given select Drag and Drop
    When select Box A and drag and drop on Box B

  @tc4 @url1
  Scenario: Test the filling up of registration form and submission
    Given select Create new Account on facebook
    When fill the details and click Submit

  @tc5 @url2
  Scenario: Test frames and windows
    Given select frames and windows
    When user clicks iframe tab
    Then user clicks the any option inside frame





