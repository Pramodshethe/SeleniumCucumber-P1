Feature: Filling Student Registration Form Form

Background:
	Given I am on DEMOQA site
	
  Scenario: Successfully enter all the details in the form
    Given I Enter all default values in the form
    When I click on submit
    Then a window appears with "Thanks for submitting the form" message
