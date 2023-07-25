Feature: I am on Gear Page
  As User I want to select overnight duffle in shopping cart

  @smoke
  Scenario:User should select overnight duffle in the shopping cart
    Given I am on gearMenu
    When I click on gearMenu
    And I click on productName overnightDuffle
    Then verify the gearPage productName "Overnight Duffle"

  @smoke
  Scenario:User should change the qty and add to cart details
    Given I am on gearMenu
    When I click on gearMenu
    And I click on productName overnightDuffle
    And I sentTextToElement to "<3>"
    And I click on AddToCart Button
    Then verify the gearpage message "You added Overnight Duffle to your shopping cart."

  @smoke
  Scenario:User should change the qty and add to cart and add quantity
    Given I am on gearMenu
    When I click on gearMenu
    And I click on productName overnightDuffle
    And I sentTextToElement to "<3>"
    And I click on AddToCart Button
    Then verify the product name  "Overnight Duffle"
    Then verify the Qty "3"
    Then verify Total Price "$135.00"

  @smoke
  Scenario:User should change the qty and add to cart and update Quantity
    Given I am on gearMenu
    When I click on gearMenu
    And I click on productName overnightDuffle
    And I sentTextToElement to "<3>"
    And I click on AddToCart Button
    And I update the Quantity to "5"
    Then verify Total Price "$225.00"