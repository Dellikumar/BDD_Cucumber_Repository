Feature: Create New Deal Feature 

# with DataTable concept
Scenario: Create New DEAL Scenario

Given user should be on login page
When title name is FREE CRM
Then user enter username
| naveenk |
And user enter password
| test@123 |
Then user click on Login Btn
Then user navigate to HomePage
Then user verify Title of HomePage
Then user move mouse to Deals link
Then user click on New Deals link
Then user fills deals deatails
| dealsTitle | Google | 50 | 20 |
Then click on save contactBtn
Then close the browser 