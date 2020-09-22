@SignInPage
Feature: feature to test signIn functionality
  I want to signIn slack

  Scenario Outline: check signIn is successful with valid credentials
    Given I am in slack login page
    When I want enter <userName> and <passWord> and click signin button
    And click the iconProfile
    Then I verify the <status> in step

    Examples: 
      | userName                 | passWord         | status         |
      | "dewan_shahed@yahoo.com" | "Bangladesh2020" | "dewan_shahed" |
