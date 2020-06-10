Feature: As a user i need to change the lenguage of the web to visualize the site in other idiom.

  @Smoke
    Scenario Outline: The user change the idiom of the site
      Given The user is in PHP Travel page
      When The user click the dropdown list of lenguages
      And The user select a <lenguage> of the list whit <code>
      Then The user verify that the web is displayed in selected <lenguage>
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










