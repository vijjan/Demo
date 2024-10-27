Feature: Shetty Practice Test

	Scenario Outline: 
		Given user is on greencart landing page
		When user searched with shortname and extracted actual <name> of product
		Then user searched for same shortname in offers <name> page 
		And user validate both match
		Examples: 
		|name|
		|Tom |
		|carr|