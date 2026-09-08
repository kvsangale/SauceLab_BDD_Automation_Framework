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
    When user selects "Name (A to Z)" from the sort dropdown
    Then products should be displayed in alphabetical order

  @regression
  Scenario: Verify user can sort products by Name Z to A
    When user selects "Name (Z to A)" from the sort dropdown
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
  Scenario: Verify user can view product details
    When user clicks on a product name
    Then product details page should be displayed
    And product name should be displayed
    And product price should be displayed
    And product description should be displayed
    And product image should be displayed

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