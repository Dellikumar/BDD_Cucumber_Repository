Feature: send email to friend Test
@First
Scenario: email functionality testing

Given user should be on email page
When send email is visible
Then enter the recepient adress
Then click on send button

@Second
Scenario: contact functionality testing

Given user should be on contact page
When save contact  is visible
Then enter the contact name
Then click on save button

@Third
Scenario: contact functionality testing

Given user should be on contact page
When save contact  is visible
Then enter the contact name
Then click on save button
