# Amazon_Login_Cucumber

Acceptance criteria implementation
Using Cucumber (Java) and Selenium/Webdriver, implement the following tests
on the Chrome browser.
Scenario: Valid login
Given I am a user of amazon.com
When I log in using valid credentials
Then I should be logged in

Scenario: Invalid login
Given I am a user of amazon.com
When I log in using invalid credentials
Then I should not be logged in
