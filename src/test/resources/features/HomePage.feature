Feature: HomePage feature test
  As a user I want to verify different scenario on homepage

  Background: User is on homepage

    Given I am on home page

    @sanity
    Scenario: Verify I am  abel to select DataProducts
      When I click on cookie
      And I mouse hover on "DataProducts" and click
      And Select our data product