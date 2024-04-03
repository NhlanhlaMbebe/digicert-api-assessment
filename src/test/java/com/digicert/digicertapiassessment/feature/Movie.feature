Feature: Movie list

  Scenario: Get list of movies and check if the movie count is 6
    Given I access the api "/films/"
    When i call then service
    Then I am able to assert that movie count is 6

  Scenario: Get the 3rd movie and check if the director of the movie is "Richard Marquand"
    Given I access the api "/films/3"
    When i call then service
    Then I assert that the director is "Richard Marquand"

  Scenario: Get the 3rd movie and check if the producer of the movie is not "Gary Kurtz, George Lucas"
    Given I access the api "/films/5"
    When i call then service
    Then I assert that the producer is "Gary Kurtz, George Lucas"