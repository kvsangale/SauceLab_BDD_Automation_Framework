Feature: Login Functionality

Scenario: Validate the Title
Given User is on the Login page
Then User should see the login page title
Scenario Outline:Login with valid credentials
Given User is on the Login page
When User Enters valid user name "<Username>"
And User Enters valid password "<Password>"
And User Clicks on login button
Then User should see "<ExpectedResult>"
Examples:

        |Username                  | Password      | ExpectedResult |
        |standard_user             | secret_sauce  | Products |
        |problem_user              | secret_sauce  | Products |
        |performance_glitch_user   | secret_sauce  | Products |
        |error_user                | secret_sauce  | Products |
        |visual_user               | secret_sauce  | Products |