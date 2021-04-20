Feature: login to something

Scenario Outline:  login of a customer with valid credentials
Given navigate to something page
When user provide valid <username> and <password>
Then user should logged in successfully

Examples:
|username|password|
|sudhakar|hosmani|
|chetan|sharma|
