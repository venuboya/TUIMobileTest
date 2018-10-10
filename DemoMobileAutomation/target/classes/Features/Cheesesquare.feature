Feature: Cheesesquare categories are selectable


Scenario: select category1 and validate category text
	Given user launches cheesesquare app
	And select category1
	Then verify category1 item is present

