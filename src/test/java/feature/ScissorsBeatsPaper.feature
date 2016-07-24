Feature: Scissors Beats Paper
  Rock Beats Scissors
  As a player
  I want rock to beat scissors
  So that I can play with rules I'm familiar with

  Scenario: Scissors vs Paper
    Given I have chosen scissors
    When the opponent chooses paper
    Then I should win

  Scenario: Paper vs Scissors
    Given I have chosen paper
    When the opponent chooses scissors
    Then they should win
