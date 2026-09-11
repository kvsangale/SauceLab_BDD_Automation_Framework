Feature: Products page functionality

  Background:
    Given user is logged into SauceDemo application

  @smoke
  Scenario: Verify Products page is displayed successfully
    Given user is on the Products page
    Then Products page should be displayed
    And Products page title should be "Products"
    And product list should be displayed

  @regression
  Scenario: Verify all products are displayed on Products page
    Then all available products should be displayed
    And each product should have a product name
    And each product should have a product price
    And each product should have an Add to cart button

  @regression
  Scenario: Verify product price is displayed correctly
    When user views the product list
    Then each product should display its correct price

  @regression
  Scenario: Verify user can sort products by Name A to Z
    When user selects "Name (A to Z)" from the sort dropdownAtoZ
    Then products should be displayed in alphabetical order

  @regression
  Scenario: Verify user can sort products by Name Z to A
    When user selects "Name (Z to A)" from the sort dropdownZtoA
    Then products should be displayed in reverse alphabetical order

  @regression
  Scenario: Verify user can sort products by Price low to high
    When user selects "Price (low to high)" from the sort dropdown
    Then products should be displayed in ascending order of price

  @regression
  Scenario: Verify user can sort products by Price high to low
    When user selects "Price (high to low)" from the sort dropdown
    Then products should be displayed in descending order of price

  @regression
  Scenario Outline: Verify user can view product details
    When user clicks on a product name "<product>"
    Then product details page should be displayed 
    And product name should be displayed "<product>"
    And product price should be displayed "<price>"
    And product description should be displayed "<description>"
    And product image should be displayed "<image>"
    Examples:
    | product                | price  | description                                                               |
    | Sauce Labs Backpack    | $29.99 | carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.        |
    | Sauce Labs Bike Light  | $9.99  |A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included|
    | Sauce Labs Bolt T-Shirt | $15.99 | Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt. | 
    | Sauce Labs Fleece Jacket | $49.99 | It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office| 
    | Sauce Labs Onesie | $7.99 | Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel. | 
    | Test.allTheThings() T-Shirt (Red) | $15.99 | This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton. |
 
  @smoke
  Scenario: Verify user can add a product to cart
    When user clicks Add to cart for "Sauce Labs Backpack"
    Then the product should be added to the cart
    And cart badge should display "1"

  @regression
  Scenario: Verify user can add multiple products to cart
    When user adds "Sauce Labs Backpack" to the cart
    And user adds "Sauce Labs Bike Light" to the cart
    Then cart badge should display "2"

  @regression
  Scenario: Verify Add to cart button changes to Remove button
    When user clicks Add to cart for "Sauce Labs Backpack"
    Then the button for "Sauce Labs Backpack" should change to "Remove"

  @regression
  Scenario: Verify user can remove a product from cart from Products page
    Given "Sauce Labs Backpack" is added to the cart
    When user clicks Remove for "Sauce Labs Backpack"
    Then the product should be removed from the cart
    And cart badge should not be displayed

  @regression
  Scenario: Verify cart badge displays correct product count
    When user adds "Sauce Labs Backpack" to the cart
    And user adds "Sauce Labs Bike Light" to the cart
    And user adds "Sauce Labs Bolt T-Shirt" to the cart
    Then cart badge should display "3"

  @smoke
  Scenario: Verify user can navigate to Cart page
    When user clicks on the shopping cart icon
    Then user should be navigated to the Cart page
    And Cart page should be displayed