Feature: Search function

Background: User should open chrome browser and login successfully 
When user opens "chrome" browser
When user opens "http://primusbank.qedgetech.com/" link
When user enters "Admin" as username
When user Enters "Admin" as password
When user click on login button

@SmokeTest
Scenario: Verify bank branch search function
When user click on branches button
When user select "INDIA" as country
When user select "GOA" as state
When user select "GOA" as city
When user click on search button
Then user get branchest at that location