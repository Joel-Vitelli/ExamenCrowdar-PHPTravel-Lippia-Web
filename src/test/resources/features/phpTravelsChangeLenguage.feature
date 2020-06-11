#User Story:
#
#Como: Usuario
#Quiero: Cambiar el idioma de la web
#Para: Visualizar la web en otro idioma

Feature: As a user i need to change the lenguage of the web to visualize the site in other idiom.

  @Smoke
  Scenario Outline: The user change the lenguage of the site
    Given The user is in PHP Travel page
    When The user click the dropdown list of lenguages
    And The user select <lenguage> of the list whit <code> code
    Then The user verify that the web is displayed in <lenguage> whit <code> code
    Examples:
      | lenguage  | code |
      | Vietnamese|  vi  |
      | Russian   |  ru  |
      | English   |  en  |
      | Arabic    |  ar  |
      | Farsi     |  fa  |
      | Turkish   |  tr  |
      | French    |  fr  |
      | Spanish   |  es  |
      | German    |  de  |











