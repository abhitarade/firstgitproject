Feature: Login function

Background: User is ready to login
When user opens "chrome" browser
When user opens "http://primusbank.qedgetech.com/" link

@SmokeTest
Scenario: validate login functionality using valid username and valid password
When user enters "Admin" as username
When user Enters "Admin" as password
When user click on login button
Then user will move on Admin page for validating "Login" functionality