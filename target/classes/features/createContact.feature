Feature: Create New Contact Feature 

# with Examples KeyWord
Scenario Outline: Create New Contact Scenario

Given user should be on login page
When title name is FREE CRM
Then user enter username "<userName>"
And user enter password "<password>"
Then user click on Login Btn
Then user navigate to HomePage
Then user verify Title of HomePage
Then user move mouse to contacts link
Then user click on New Contact link
Then user fills "<firstname>" and "<lastname>" and "<company>"
Then click on save contactBtn
Then close the browser

Examples:
 | userName | password | firstname    | lastname      | company           |
 | naveenk  | test@123 | rajaramnn123 | mohnannn pandu| IndoBritanAmrivca |
 | naveenk  | test@123 | Alluri mithun| sitarama john | BritanIndioAfrica |