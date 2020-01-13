Feature: Login
  As a CRM user
  I want to login with my details
  Scenario: As a CRM user I want to Login successfully
    Given I am on CRM homepage
    And I login with valid details username as "trillium@trilliumxdev.onmicrosoft.com" and password as "Tr1!!ium"
    Then I should see Membership Dashboard

