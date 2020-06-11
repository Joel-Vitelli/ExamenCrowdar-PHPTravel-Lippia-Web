#User Story:
#
#Como: Usuario
#Quiero: Buscar hoteles disponibles
#Para: Realizar una reserva en un hotel

Feature: As a user i need to find hotels in the web PHP Travels to make a reservation

  @Smoke
  Scenario Outline: The user find a hotel and make a reservation
    Given The user is in PHP Travel page
    When The user click the destination imput
    And The user search for <search>
    And The user select the date of checkin in <checkIn>
    And The user select the date of check out in <checkOut>
    And The user select <adults> adults and <child> childs
    And The user click the search button
    Then The user navigate to the search page of hotels

    When The user select the <hotelResult> hotel of the list clicking the "Details" button
    Then The user navigate to the detail of the selected hotel

    When The user select the <roomResult> room of the hotel clicking the "Book Now" button
    And The user complete the fields whit title of: <title> whit <titleCode> code, First Name: <name>, Last Name: <lName>, Email: <email>, Country: <country>, Phone: <phone>
    And The user click the "Complete Booking" button
    Then The user navigate to the paiment page

    When The user complete the field of email whit <email>
    And The user click the "Continue button"
    And The user select <ddCountry> country whit <countryCode> country code
    And The user click on the "Pay Whit Credit Card" button
    And The user complete the fields Number of card: <cardNumber>, Name of holder: <holderName> Expiration month: <emonth>, Expiration year: <eyear>, CVV: <cvv>
    And The user click the "Paid now" button
    Then The user recive a error messaje display
    Examples:
      |     search     |  checkIn  | checkOut | adults | child | hotelResult | roomResult | title  | titleCode | name | lName |      email       |  country  |    phone    | ddCountry | countryCode|    cardNumber    |    holderName    | emonth | eyear | cvv |
      |Buenos Aires    | 19-6-2020 | 26-6-2020|   3    |  0    |      1      |      2     |   Mr.  |     1     |Dante | Vitel | test@test.com    | Argentina | 1234567895  | Argentina |     AR     | 4263982640269299 |  DANTE VITELL    |   02   | 2023  | 837 |
      |Berlin          | 19-6-2020 | 26-6-2020|   2    |  2    |      3      |      3     |   Ms.  |     2     |Pamel | Vazqu | test2@test.com   | Brasil    | 1475896321  |  Brasil   |     BR     | 4532220195616274 |  DANIEL GARRISONl|   12   | 2020  | 348 |










