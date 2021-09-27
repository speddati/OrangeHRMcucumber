#Author: ABC
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
Feature: Application Login Feature
  I want to use this feature file to verify application Login and Logout Functionality

  Background: Get the Application
    When Launch the Application

  @Sanity
  Scenario: Verify Application Title
    Then Verify Application Title

  @Regression
  Scenario Outline: Verify Application Login
    When I Enter <Username> and <Password>
    And Click on Login button
    Then Application Login Should be Successful

    Examples: 
      | Username | Password |
      | admin    | admin123 |
      | abcde    | admin123 |

  @Regression
  Scenario Outline: Verify Application Logout
    When I Enter <Username> and <Password>
    And Click on Login button
    Then Application Login Should be Successful
    And Click on Logout
    Then Logout Should be Successful

    Examples: 
      | Username | Password |
      | admin    | admin123 |
