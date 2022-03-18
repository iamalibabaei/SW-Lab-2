@tag
Feature: Divide and Sqrt

  Scenario: divide and sqrt two numbers
    Given Two input values are, 9 and 1
    When We divide a to b and sqrt
    Then We expect the result 3

  Scenario Outline: divide and sqrt two numbers
    Given Two input values are, <a> and <b>
    When We divide a to b and sqrt
    Then We expect the result <result>
    Examples:
      | a  | b | result |
      | 4  | 1 | 2      |
      | 36 | 4 | 3      |
      | 6  | 1 | 2.449  |
