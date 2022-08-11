Feature: feed the cat
  AS AN owner
  I WANT TO feed my cat
  SO THAT it isn't hungry

  Scenario: The cat successfully eats
    Given the cat is hungry
    And there is food in the bowl
    And the cat likes the food on offer
    When i want to feed the cat
    Then the cat should eat the food
    And the cat should no longer be hungry
    And the amount of food in the bowl decreases

  Scenario: Cat is not hungry
      Given the cat is not hungry
      When i try to feed the cat
      Then the cat refuses to eat the food

  Scenario: Cat does not even like the food
    Given the cat does not even like the food
    When i try feed to feed the cat
    And the cat try's the food
    Then the cat decides they don't want the food