Feature: HomePage Test
  As user I want to search products on Luma website

  @smoke
  Scenario:User should search Jackets on womenMenu
    Given I am on HomePage
    When I mouseHover on WomenMenu
    And I mouseHover on Tops
    And I mouseHover and click on jackets

  @smoke
  Scenario:User should search pants on menMenu
    Given I am on HomePage
    When I mouseHover on men
    And I mouseHover on bottoms
    And I mouseHover and click on pants

  @smoke
  Scenario:User should search duffleBag on gearMenu
    Given I am on HomePage
    When I mouseHover on gearMenu
    And I mouseHover and click on bags