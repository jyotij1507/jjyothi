Feature: Adding customer functionality
  This is a add new customer into telecome

  Scenario: Add customer
    Given The user is in telecom home pages
    And   The user click on add customer
    When  The user is filling the valid details
    And   The user click on submit button
    Then  The user should display with customer id
	