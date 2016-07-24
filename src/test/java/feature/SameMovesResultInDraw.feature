Feature: Same Moves Result in Draw
  As a player
  I want the same moves to draw
  So that I can play with rules I'm familiar with

  Scenario: Rock vs Rock
    Given I have chosen rock
    When the opponent chooses rock
    Then it should be a draw

  Scenario: Scissors vs Scissors
    Given I have chosen scissors
    When the opponent chooses scissors
    Then it should be a draw

  Scenario: Paper vs Paper
    Given I have chosen paper
    When the opponent chooses paper
    Then it should be a draw