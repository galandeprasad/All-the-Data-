Feature: Test the Login Page



Scenario: Home page Default login
Given User is on NetBanking page
When User login into application with username and password
Then Home page is populated
And Cards are displayed