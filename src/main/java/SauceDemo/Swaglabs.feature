Feature: SwagLabs
  Scenario: User able to open url
    Given user should open url

  Scenario: User login
    When user able to login

  Scenario: user buy product
    Given user choose a product
    When user give the details
    Then User should overview order

  Scenario: user logout
    When User back to homepage
    Then User can logout

  Scenario: close browser
    Given User able to close the browser