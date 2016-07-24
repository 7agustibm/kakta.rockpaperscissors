Feature: Rock Beats Scissors
  As a player
  I want rock to beat scissors
  So that I can play with rules I'm familiar with

  Scenario: Rock vs Scissors
    Given I have chosen rock
    When the opponent chooses scissors
    Then I should win

  Scenario: Scissors vs Rock
    Given I have chosen scissors
    When the opponent chooses rock
    Then they should win