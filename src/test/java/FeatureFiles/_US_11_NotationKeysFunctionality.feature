Feature: _US_11_ functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
  Scenario: create a new Notation Keys
  When navigate to Notation Keys  page
 Then create a new Notation Keys
   And success message  should be displayed
    Then edit a Notation Keys
    And  success message should be  displayed
    Then delete a Notation Keys account
    And  success  message  should be displayed