Feature: As a user
  I want to get ability to use dropdown menu at 'Auto flea market' and 'Houses and flats' sections
  So that i can navigate to needed resources

  Background:
    Given the user opens Onliner website

  Scenario: Dropdown menu at 'Auto flea market' should have sections such as 'Cities','Cars' and "Sections divided by price"
    When the user hover on Auto flea market section
    Then dropdown menu with Auto sections are displayed

  Scenario: Dropdown menu at 'Houses and flats' should have sections such as 'Count of rooms','Flat price' and "Cities"
    When the user hover on Houses and flats section
    Then dropdown menu with Houses and rooms sections are displayed