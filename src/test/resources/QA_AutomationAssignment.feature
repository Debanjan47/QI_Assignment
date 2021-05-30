#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file


  @tag1 @QI
  Scenario Outline: Test case to find COVID19 centers with name TOA PAYOH APEX
    Given I want launch url "<url>"
    When I click on COVID19 Test Providers
    And I search for name "<name>"
    Then I fetch the coordinates of the location

    Examples: 
      |url|name|
      |https://www.onemap.gov.sg|TOA PAYOH|
      
   @tag2 @QI
  Scenario Outline: Test case to find nearby parks in PA Staff club
    Given I want launch url "<url>"
    When I click on Nearby parks
    And I search for name "<name>"
    Then I fetch the coordinates of the location

    Examples: 
      |url|name|
      |https://www.onemap.gov.sg|PA STAFF CLUB|
      
      @tag3 @QI
  Scenario Outline: Test case to find ATM and Bank Branches
    Given I want launch url "<url>"
    When I click on Essential Amenities
    And I click on ATMs, Bank Branches buttons
    Then I fetch the coordinates of the location

    Examples: 
      |url|
      |https://www.onemap.gov.sg|
      
      @tag4 @QI
  Scenario Outline: Test case to find Secondary School Information - negative test case
    Given I want launch url "<url>"
    When I click on School Query
    And I click on Find Secondary School information
    And I click on I Agree
    Then I validate whether No location selected error message is visible

    Examples: 
      |url|
      |https://www.onemap.gov.sg|
      
      @tag5 @QI
  Scenario Outline: Test case to download parks
    Given I want launch url "<url>"
    When I click on nearby parks
    And I select the option and click download
    Then I validate whether file is downloaded

    Examples: 
      |url|
      |https://www.onemap.gov.sg|
