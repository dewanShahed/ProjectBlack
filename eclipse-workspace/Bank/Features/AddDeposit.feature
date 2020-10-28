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
@deposit
Feature: Deposite
  I want to use this deposite method to add some amount to my account

  Scenario Outline: verify the  balance after deposit.
    Given I have  <deposit>balance
    When I deposit <depositAmount> in my account
    Then I verify the <currentAmount> will be in my account.

    Examples: 
      | deposit | depositAmount | currentAmount |
      |     100 |          1000 |          1100 |
      |     500 |           700 |          1200 |
