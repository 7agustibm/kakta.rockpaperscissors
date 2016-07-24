Feature: Paper Beats Rock
  As a player
  I want paper to beat rock
  So that I can play with rules I'm familiar with

  Scenario: Paper vs Rock
    Given I have chosen paper
    When the opponent chooses rock
    Then I should win

  Scenario: Rock vs Paper
    Given I have chosen rock
    When the opponent chooses paper
    Then they should win