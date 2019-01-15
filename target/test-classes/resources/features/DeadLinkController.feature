Feature: User tries to controll the dead links under shop by department amazon.com 

Scenario: Dead links under shop by department amazon.com 
Given I am a user of amazon.com
And I get into departments
When I log in using valid credentials
Then I should be logged in 

