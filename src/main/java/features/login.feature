Feature: Free CRM Login Feature

# without example keyword
Scenario: Free CRM Login Page Test

Given user should be on login page
When title name is FREE CRM
Then user enter username "naveenk"
And user enter password "test@123"
Then user click on Login Btn
Then user navigate to HomePage
Then user verify Title of HomePage
Then close the browser


