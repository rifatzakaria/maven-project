Feature: homepage test

As a user of multicart.com i should be able to launch multicart webpage see  homepage features and a successful sign up.


Background: go to browser and launch multicart.com

Given i open browser "chrome"
And i go to "https://www.demo.iscripts.com/multicart/demo/"



Scenario: verify search

Then  i see text box "SEARCH"




Scenario: successful sign up

When i click logIn button
And i click signUp button
And i enter user info
And i click CREATE ACCOUNT
Then  i see text box "MR. AKM"
