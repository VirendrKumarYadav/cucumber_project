@tag1
Feature: Withdraw cash from account
  In order to pay for my daily expenses
  As an account holder
  I want to withdraw cash

  Scenario Outline: Withdraw cash from account in credit
    Given I have a balance of $<balance> in my account
    When I request $<requestedAmount>
    Then $<expectedAmount> should be dispensed

  Examples:
    | balance | requestedAmount | expectedAmount |
    | 100     | 20              | 20             |
    | 200     | 50              | 50             |
