Feature: Login Test
Scenario Outline: login 
When user launches chrome in browser
When user navigates to application
And user enters username as <"UserName"> in un field
And user enters password as <"Password"> in pw field
Then user clicks on login button

Examples:
|UserName|Password|
|priya|12345|
|mercury|mercury|