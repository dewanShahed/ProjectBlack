
@withdraw
Feature: Withdro
  I want to use this Withdrow method to take out some money

  Scenario Outline: verify the current balance after withdrawing.
    Given I have <initialBalance>balance
    When I withdrow <withdrowAmount> in my account
    Then I verify the <currentAmount> will be in my account

    Examples: 
      | withdraw | withdrowAmount | currentAmount |
      |     1000 |            200 |           800 |
      |     1200 |            200 |          1000 |
