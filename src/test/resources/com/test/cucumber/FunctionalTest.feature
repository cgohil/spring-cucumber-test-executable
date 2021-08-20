Feature: Example Functional Test

  Scenario: Valid Kafka Message Processing
    Given following region exists in database
      | id | name        |
      | 1  | Europe      |
      | 2  | Americas    |
      | 3  | Asia        |
      | 4  | Middle East |
    And following country exists in database
      | id | name        | regionId |
      | NL | Netherlands | 1        |
      | BE | Belgium     | 1        |
      | IN | India       | 3        |
    When booking event pushed to kafka