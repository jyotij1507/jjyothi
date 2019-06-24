
Feature: Add Tariff Functionality
  
Scenario Outline: Add Tariff plan
		Given The user is in telecom home page
		And   The user click on add tariff plan
		When  The user is filling the valid detail"<MR>","<FLC>","<FIN>","<FSM>","<LC>","<IC>","<SMS>"                        
		And   The user click on submit buttons
		Then  The user should display congratulations you added tariff successfully.
	
     Examples: 
     |MR|FLC|FIN|FSM|LC|IC|SMS|
     |100|200|300|400|590|600|700|
     |200|300|400|500|690|700|701|
  