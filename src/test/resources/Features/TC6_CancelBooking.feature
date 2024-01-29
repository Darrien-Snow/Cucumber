@CancelBooking
Feature: Verify OMR Branch hotel login,seach hotel,booking and edit booking

  # Test scenario 1
  @EndToEnd
  Scenario Outline: User books hotel and edit/change the booked hotel
    Given User is on the OMR Branch Login page
    When User login with "<username>","<password>"
    Then User verifies the logged in user profile name "Welcome Darrien"
    When User enters all searching details "<state Name>", "<city Name>", "<select Room Type>", "<check in date>","<check out date>","<No of Rooms>", "<No of Adults>", "<No of Childers>"
    Then User verifies search result "Select Hotel"
    When User saves first "<hotel Name>", "total Price" and select first "<hotel Name>"
    And User accept alert
    Then User verifies "Book Hotel" and "<hotel Name>"
    When User verifies "hotel Name","total Price"
    And User enters guest details "myself","<Salutation>","<First Name>","<Last Name>","<Mobile NO>","<Email id>" and GST details "<GST mobile No>", "<GST company name>","<GST address>"
    And User select "<Special request>" and "special request comment"
    When User enters Payment details "<Credit/Debit/ATM Card>","<Debit Card>","<Visa>", "<5555555555552222>", "<Snow>", "< 08>", "<2027>", "<100>"
      #dataTable
      | Payment Type          | Card Type   | Card Name | Card No          | CardHolder Name | Card Month | Card Year | Card CVV |
      | Credit/Debit/ATM Card | Debit Card  | Visa      | 5555555555552222 | Snow            |         08 |      2027 |      100 |
      | Credit/Debit/ATM Card | Credit Card | Visa      | 5555555555552223 | Snow            |         07 |      2024 |      101 |
      | Credit/Debit/ATM Card | Debit Card  | Amex      | 5555555555552223 | Snow            |         09 |      2029 |      150 |
      | Credit/Debit/ATM Card | Credit Card | Amex      | 5555555555552223 | Snow            |         08 |      2025 |      109 |
    Then User verifies success message "Booking is Confirmed", "<Hotel Name>" and saves "<order Id>",
    When User navigate to Mybooking/MyAccount
    Then User verifies success message "Bookings"
    When User searches "<order id>"
    And User verifies "<order id>","<hotel Name>", "<total Price>" and edit booking
    Then User verifies selected edit booking "<order Id>"
    When User changes booking "checkIn","checkOut" dates
    Then User verifies booking update success message "Booking updated successfully"
    When User verifies success message "Bookings"
    And User searches "<order id>"
    And User verifies "<order id>","<hotel Name>", "<total Price>" and cancel booking upon accept "cancel" alert
    Then User verifies cancel success message "Your booking cancelled successfully"

    Examples: 
      | username             | password    | state Name | city Name       | select Room Type     | check in date | check out date         | No of Rooms  | No of Adults | No of Childers |
      | dassdowney@gmail.com | Testing@12 | Tamil Nadu | Tiruchirappalli | Luxury               | 2023-12-19    | 2023-12-29             | 4-Four       | 2-Two        |              2 |
      | Salutation           | First Name  | Last Name  | Mobile No       | Email id             | GST Mobile No | GST Company Name       | GST Address  |              |                |
      | Mr                   | Darrien     | Snow       |      9751080759 | dassdowney@gmail.com |    9043592058 | Greens Tech OMR Branch | Thoraipakkam |              |                |

  # Test scenario 2
  @CancelFirstBooking
  Scenario Outline: Verify OMR branch Login with valid credentials
    Given User is on the OMR Branch Login page
    When User login with "<username>","<password>"
    Then User verifies the logged in user profile name "Welcome Darrien"
    When User navigate to Mybooking/MyAccount
    Then User verifies success message "Bookings"
    When User select first result and and cancel booking upon accept "cancel" alert
    Then User verifies cancel success message "Your booking cancelled successfully"

    Examples: 
      | username             | password    |
      | dassdowney@gmail.com | Testing@12 |

  # Test scenario 3
  @CancelExampleBooking
  Scenario Outline: Verify OMR branch Login with valid credentials
    Given User is on the OMR Branch Login page
    When User login with "<username>","<password>"
    Then User verifies the logged in user profile name "Welcome Darrien"
    When User navigate to Mybooking/MyAccount
    Then User verifies success message "Bookings"
    When User searches "example order id" and cancel booking upon accept "cancel" alert
    Then User verifies cancel success message "Your booking cancelled successfully"

    Examples: 
      | username             | password    |
      | dassdowney@gmail.com | Testing@12 |
