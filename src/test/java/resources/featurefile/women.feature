Feature: WomenPage Test
  As user I want to search product and sort by price
@smoke
  Scenario:User should sort product by name
    Given I am on HomePage
    When I women mouseHover on WomenMenu
    And I women mouseHover on Tops
    And I women mouseHover and click on jackets
    And the product should sort by product name
    Then verify the product is displayed in alphabetical order

  @smoke

  Scenario:User should sort product by price
    Given I am on HomePage
    When I women mouseHover on WomenMenu
    And I women mouseHover on Tops
    And I women mouseHover and click on jackets
    And the product should sort price
    Then verify the product is displayed in low to high order
