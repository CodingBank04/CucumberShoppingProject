Feature: User is going to search for vegetable and proceed to checkout
  Scenario:Search for Items and validate the Results
    Given user will navigate to the website
    When user searches for "Cucumber"
    Then "Cucumber" result is displayed


    @last
  Scenario Outline: Search for items and then move to the checkOut
    Given user will navigate to the website
    When User searched for "<Name>" Vegetable
    And  Added items to the cart
    And  User proceed to the checkOut Page
    Then Verify selected "<Name>" items are displayed in the Checkout Page
    Examples:
      |Name|
      |Brinjal|
      |Beetroot|







