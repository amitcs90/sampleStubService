Feature: To test sampleStubService API services

@customer
Scenario: To Test ListAllCustomer API response
	Given I set listallCustomer api endpoint
	And I send ListAllCustomer get API request
	Then I receive status code as "404"
	Then I validate the response body

@customer
Scenario: To Test CustomerFound1 API response
	Given I set CustomerFound1 api endpoint
	And I send CustomerView get API request
	Then I receive status code as "200"
	Then I validate the response body for "1111"
	Then I validate the response body for "testerA@abc.com"
	Then I validate the response body for "testerBFirst"
	Then I validate the response body for "testerBLast"

@customer
Scenario: To Test CustomerFound2 API response
	Given I set CustomerFound2 api endpoint
	And I send CustomerView get API request
	Then I receive status code as "200"
	Then I validate the response body for "2222"
	Then I validate the response body for "testerB@abc.com"
	Then I validate the response body for "testerBFirst"
	Then I validate the response body for "testerBLast"

@customer
Scenario: To Test CustomerFound3 API response
	Given I set CustomerFound3 api endpoint
	And I send CustomerView get API request
	Then I receive status code as "200"
	Then I validate the response body for "3333"
	Then I validate the response body for "testerC@abc.com"
	Then I validate the response body for "testerCFirst"
	Then I validate the response body for "testerCLast"

@customer
Scenario: To Test CustomerFound4 API response
	Given I set CustomerFound4 api endpoint
	And I send CustomerView get API request
	Then I receive status code as "200"
	Then I validate the response body for "3333"
	Then I validate the response body for "testerD@abc.com"
	Then I validate the response body for "testerDFirst"
	Then I validate the response body for "testerDLast"

@customer
Scenario: To Test CustomerFound5 API response
	Given I set CustomerFound5 api endpoint
	And I send CustomerView get API request
	Then I receive status code as "200"
	Then I validate the response body for "5555"
	Then I validate the response body for "testerE@abc.com"
	Then I validate the response body for "testerEFirst"
	Then I validate the response body for "testerELast"

@customer
Scenario: To Test CustomerFound6 API response
	Given I set CustomerFound6 api endpoint
	And I send CustomerView get API request
	Then I receive status code as "200"
	Then I validate the response body for "6666"
	Then I validate the response body for "testerF@abc.com"
	Then I validate the response body for "testerFFirst"
	Then I validate the response body for "testerFLast"

@customer
Scenario: To Test list CustomerNotFound API response
	Given I set UnknownCustomer api endpoint
	And I send CustomerView get API request
	Then I receive status code as "404"
	Then I validate the response body for "fail"
	Then I validate the response body for "Customer details not found."
