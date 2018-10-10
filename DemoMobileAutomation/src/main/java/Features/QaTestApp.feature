Feature: Demo app login feature

Scenario Outline: login test with different first name and last name

Given user launches QaTestApp
And enters "<firstName>" and "<lastName>" to login
Then verify user firstName is present

Examples:
	|	firstName	|	lastName	|
	| DemoFirstName	|	DemoLastName|
	|  123456		|	123456		|
	|  ab@cd_EF		|	ab@cd_EF	|