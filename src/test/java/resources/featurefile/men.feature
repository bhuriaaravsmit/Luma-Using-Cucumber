Feature: MenPage Test
  As user I want to add cronus yoga pant on Luma website

  @sanity
  Scenario:User should search pants on menMenu
    Given I am on HomePage
    When I mouseHover on men
    And I mouseHover on bottoms
    And I mouseHover and click on pants


  @sanity
  Scenario:User should add cronus yoga pant into shopping cart
    Given I am on HomePage
    When I mouseHover on men
    And I mouseHover on bottoms
    And I mouseHover and click on pants
    And I mouseHoverToCronus
    And I click On PantSize
    And I Click On BlackColour
    And I mouseHover and ClickTo Add To Cart
    Then verify the message "You added Cronus Yoga Pant to your shopping cart."

