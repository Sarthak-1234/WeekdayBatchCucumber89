Feature: RedBus Homepage Sceanrios

Scenario: Verify Title of Homepage
Given Launch URL of homepage
Then I verify title of homepage


Scenario: Verify Header Tabs
Given Launch URL of homepage
Then I verify below mentioned header tabs:
	|		Demos				|
	|		Download			|
	|		API Documentation	|
	|		Themes				|
	|		Development			|
	|		Support				|
	|		Blog				|
	|		About				|
	
@run
Scenario: Verify Learning Center link under Support Tab on the top
Given Launch URL of homepage
And I hover mouse cursor over "Support" tab
And I click on "Learning Center"
Then I verify the url which contains "learn"

@run
Scenario: Verify CLA link under Contribute on the top
Given Launch URL of homepage
And I hover mouse cursor over "Contribute" tab
And I click on "CLA"
Then I verify the url which contains "openjsf"