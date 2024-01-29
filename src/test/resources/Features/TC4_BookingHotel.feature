@BookHotel
Feature: Verify Login credentials, search hotel and book hotel

  #Test Scenario 1
  @EndToEnd @DebitcardPayment
  Scenario Outline: Book hotel with GST, special request and debit card payment
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
    When User enters Payment details "<Credit/Debit/ATM Card>","<Debit Card>","<Visa>", "<5555555555552222>", "<Snow>", "<08>", "<2027>", "<100>"
      #dataTable
      | Payment Type          | Card Type   | Card Name | Card No          | CardHolder Name | Card Month | Card Year | Card CVV |
      | Credit/Debit/ATM Card | Debit Card  | Visa      | 5555555555552222 | Snow            |         08 |      2027 |      100 |
      | Credit/Debit/ATM Card | Credit Card | Visa      | 5555555555552223 | Snow            |         07 |      2024 |      101 |
      | Credit/Debit/ATM Card | Debit Card  | Amex      | 5555555555552223 | Snow            |         09 |      2029 |      150 |
      | Credit/Debit/ATM Card | Credit Card | Amex      | 5555555555552223 | Snow            |         08 |      2025 |      109 |
    Then User verifies success message "Booking is Confirmed", "<Hotel Name>" and saves "<Order Id>",

    Examples: 
      | username             | password    | state Name | city Name       | select Room Type     | check in date | check out date         | No of Rooms  | No of Adults | No of Childers |
      | dassdowney@gmail.com | Testing@12 | Tamil Nadu | Tiruchirappalli | Luxury               | 2023-12-19    | 2023-12-29             | 4-Four       | 2-Two        |              2 |
      | Salutation           | First Name  | Last Name  | Mobile No       | Email id             | GST Mobile No | GST Company Name       | GST Address  |              |                |
      | Mr                   | Darrien     | Snow       |      9751080759 | dassdowney@gmail.com |    9043592058 | Greens Tech OMR Branch | Thoraipakkam |              |                |

  #Test Scenario 2
  @EndToEnd @CreditCardPayment
  Scenario Outline: Book hotel with GST, special request and Credit card payment
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
    When User enters Payment details "<Credit/Debit/ATM Card>","< Credit Card >","<Visa>", "<5555555555552223>", "<Snow>", "<07>", "<2024>", "<101>"
      #dataTable
      | Payment Type          | Card Type   | Card Name | Card No          | CardHolder Name | Card Month | Card Year | Card CVV |
      | Credit/Debit/ATM Card | Debit Card  | Visa      | 5555555555552222 | Snow            |         08 |      2027 |      100 |
      | Credit/Debit/ATM Card | Credit Card | Visa      | 5555555555552223 | Snow            |         07 |      2024 |      101 |
      | Credit/Debit/ATM Card | Debit Card  | Amex      | 5555555555552223 | Snow            |         09 |      2029 |      150 |
      | Credit/Debit/ATM Card | Credit Card | Amex      | 5555555555552223 | Snow            |         08 |      2025 |      109 |
    Then User verifies success message "Booking is Confirmed", "<Hotel Name>" and saves "<Order Id>",

    Examples: 
      | username             | password    | state Name | city Name       | select Room Type     | check in date | check out date         | No of Rooms  | No of Adults | No of Childers |
      | dassdowney@gmail.com | Testing@12 | Tamil Nadu | Tiruchirappalli | Luxury               | 2023-12-19    | 2023-12-29             | 4-Four       | 2-Two        |              2 |
      | Salutation           | First Name  | Last Name  | Mobile No       | Email id             | GST Mobile No | GST Company Name       | GST Address  |              |                |
      | Mr                   | Darrien     | Snow       |      9751080759 | dassdowney@gmail.com |    9043592058 | Greens Tech OMR Branch | Thoraipakkam |              |                |

  #Test Scenario 3
  @EndToEndWithoutSpecialRequest @DebitcardPayment
  Scenario Outline: Book hotel with GST and debit card payment
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
    When User enters Payment details "<Credit/Debit/ATM Card>","<Debit Card>","<Visa>", "<5555555555552222>", "<Snow>", "< 08>", "<2027>", "<100>"
      #dataTable
      | Payment Type          | Card Type   | Card Name | Card No          | CardHolder Name | Card Month | Card Year | Card CVV |
      | Credit/Debit/ATM Card | Debit Card  | Visa      | 5555555555552222 | Snow            |         08 |      2027 |      100 |
      | Credit/Debit/ATM Card | Credit Card | Visa      | 5555555555552223 | Snow            |         07 |      2024 |      101 |
      | Credit/Debit/ATM Card | Debit Card  | Amex      | 5555555555552223 | Snow            |         09 |      2029 |      150 |
      | Credit/Debit/ATM Card | Credit Card | Amex      | 5555555555552223 | Snow            |         08 |      2025 |      109 |
    Then User verifies success message "Booking is Confirmed", "<Hotel Name>" and saves "<Order Id>",

    Examples: 
      | username             | password    | state Name | city Name       | select Room Type     | check in date | check out date         | No of Rooms  | No of Adults | No of Childers |
      | dassdowney@gmail.com | Testing@12 | Tamil Nadu | Tiruchirappalli | Luxury               | 2023-12-19    | 2023-12-29             | 4-Four       | 2-Two        |              2 |
      | Salutation           | First Name  | Last Name  | Mobile No       | Email id             | GST Mobile No | GST Company Name       | GST Address  |              |                |
      | Mr                   | Darrien     | Snow       |      9751080759 | dassdowney@gmail.com |    9043592058 | Greens Tech OMR Branch | Thoraipakkam |              |                |

  #Test Scenario 4
  @EndToEndWithoutSpecialRequest @CreditCardPayment
  Scenario Outline: Book hotel with GST and credit card payment
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
    When User enters Payment details "<Credit/Debit/ATM Card>","< Credit Card >","<Visa>", "<5555555555552223>", "<Snow>", "<07>", "<2024>", "<101>"
      #dataTable
      | Payment Type          | Card Type   | Card Name | Card No          | CardHolder Name | Card Month | Card Year | Card CVV |
      | Credit/Debit/ATM Card | Debit Card  | Visa      | 5555555555552222 | Snow            |         08 |      2027 |      100 |
      | Credit/Debit/ATM Card | Credit Card | Visa      | 5555555555552223 | Snow            |         07 |      2024 |      101 |
      | Credit/Debit/ATM Card | Debit Card  | Amex      | 5555555555552223 | Snow            |         09 |      2029 |      150 |
      | Credit/Debit/ATM Card | Credit Card | Amex      | 5555555555552223 | Snow            |         08 |      2025 |      109 |
    Then User verifies success message "Booking is Confirmed", "<Hotel Name>" and saves "<Order Id>",

    Examples: 
      | username             | password    | state Name | city Name       | select Room Type     | check in date | check out date         | No of Rooms  | No of Adults | No of Childers |
      | dassdowney@gmail.com | Testing@12 | Tamil Nadu | Tiruchirappalli | Luxury               | 2023-12-19    | 2023-12-29             | 4-Four       | 2-Two        |              2 |
      | Salutation           | First Name  | Last Name  | Mobile No       | Email id             | GST Mobile No | GST Company Name       | GST Address  |              |                |
      | Mr                   | Darrien     | Snow       |      9751080759 | dassdowney@gmail.com |    9043592058 | Greens Tech OMR Branch | Thoraipakkam |              |                |

  #Test Scenario 5
  @EndToEndWithoutGST @DeboitcardPayment
  Scenario Outline: Book hotel with special request and debit card payment
    Given User is on the OMR Branch Login page
    When User login with "<username>","<password>"
    Then User verifies the logged in user profile name "Welcome Darrien"
    When User enters all searching details "<state Name>", "<city Name>", "<select Room Type>", "<check in date>","<check out date>","<No of Rooms>", "<No of Adults>", "<No of Childers>"
    Then User verifies search result "Select Hotel"
    When User saves first "<hotel Name>", "total Price" and select first "<hotel Name>"
    And User accept alert
    Then User verifies "Book Hotel" and "<hotel Name>"
    When User verifies "hotel Name","total Price"
    And User enters guest details "myself","<Salutation>","<First Name>","<Last Name>","<Mobile NO>","<Email id>"
    And User select "<Special request>" and "special request comment"
    When User enters Payment details "<Credit/Debit/ATM Card>","<Debit Card>","<Visa>", "<5555555555552222>", "<Snow>", "< 08>", "<2027>", "<100>"
      #dataTable
      | Payment Type          | Card Type   | Card Name | Card No          | CardHolder Name | Card Month | Card Year | Card CVV |
      | Credit/Debit/ATM Card | Debit Card  | Visa      | 5555555555552222 | Snow            |         08 |      2027 |      100 |
      | Credit/Debit/ATM Card | Credit Card | Visa      | 5555555555552223 | Snow            |         07 |      2024 |      101 |
      | Credit/Debit/ATM Card | Debit Card  | Amex      | 5555555555552223 | Snow            |         09 |      2029 |      150 |
      | Credit/Debit/ATM Card | Credit Card | Amex      | 5555555555552223 | Snow            |         08 |      2025 |      109 |
    Then User verifies success message "Booking is Confirmed", "<Hotel Name>" and saves "<Order Id>",

    Examples: 
      | username             | password    | state Name | city Name       | select Room Type     | check in date | check out date         | No of Rooms  | No of Adults | No of Childers |
      | dassdowney@gmail.com | Testing@12 | Tamil Nadu | Tiruchirappalli | Luxury               | 2023-12-19    | 2023-12-29             | 4-Four       | 2-Two        |              2 |
      | Salutation           | First Name  | Last Name  | Mobile No       | Email id             | GST Mobile No | GST Company Name       | GST Address  |              |                |
      | Mr                   | Darrien     | Snow       |      9751080759 | dassdowney@gmail.com |    9043592058 | Greens Tech OMR Branch | Thoraipakkam |              |                |
              
  #Test Scenario 6
  @EndToEndW/oGST,SpecialRequest @CreditCardPayment
  Scenario Outline: Book hotel with credit card payment
    Given User is on the OMR Branch Login page
    When User login with "<username>","<password>"
    Then User verifies the logged in user profile name "Welcome Darrien"
    When User enters all searching details "<state Name>", "<city Name>", "<select Room Type>", "<check in date>","<check out date>","<No of Rooms>", "<No of Adults>", "<No of Childers>"
    Then User verifies search result "Select Hotel"
    When User saves first "<hotel Name>", "total Price" and select first "<hotel Name>"
    And User accept alert
    Then User verifies "Book Hotel" and "<hotel Name>"
    When User verifies "hotel Name","total Price"
    And User enters guest details "myself","<Salutation>","<First Name>","<Last Name>","<Mobile NO>","<Email id>"
    When User enters Payment details "<Credit/Debit/ATM Card>","< Credit Card >","<Visa>", "<5555555555552223>", "<Snow>", "<07>", "<2024>", "<101>"
      #dataTable
      | Payment Type          | Card Type   | Card Name | Card No          | CardHolder Name | Card Month | Card Year | Card CVV |
      | Credit/Debit/ATM Card | Debit Card  | Visa      | 5555555555552222 | Snow            |         08 |      2027 |      100 |
      | Credit/Debit/ATM Card | Credit Card | Visa      | 5555555555552223 | Snow            |         07 |      2024 |      101 |
      | Credit/Debit/ATM Card | Debit Card  | Amex      | 5555555555552223 | Snow            |         09 |      2029 |      150 |
      | Credit/Debit/ATM Card | Credit Card | Amex      | 5555555555552223 | Snow            |         08 |      2025 |      109 |
    Then User verifies success message "Booking is Confirmed", "<Hotel Name>" and saves "<Order Id>",

    Examples: 
       | username             | password    | state Name | city Name       | select Room Type     | check in date | check out date         | No of Rooms  | No of Adults | No of Childers |
      | dassdowney@gmail.com | Testing@12 | Tamil Nadu | Tiruchirappalli | Luxury               | 2023-12-19    | 2023-12-29             | 4-Four       | 2-Two        |              2 |
      | Salutation           | First Name  | Last Name  | Mobile No       | Email id             | GST Mobile No | GST Company Name       | GST Address  |              |                |
      | Mr                   | Darrien     | Snow       |      9751080759 | dassdowney@gmail.com |    9043592058 | Greens Tech OMR Branch | Thoraipakkam |              |                |
  #Test Scenario 7
  @W/oanyFields_ErrorMsg
  Scenario Outline: Book hotel without entering any field
    Given User is on the OMR Branch Login page
    When User login with "<username>","<password>"
    Then User verifies the logged in user profile name "Welcome Darrien"
    When User enters all searching details "<state Name>", "<city Name>", "<select Room Type>", "<check in date>","<check out date>","<No of Rooms>", "<No of Adults>", "<No of Childers>"
    Then User verifies search result "Select Hotel"
    When User saves first "<hotel Name>", "total Price" and select first "<hotel Name>"
    And User accept alert
    Then User verifies "Book Hotel" and "<hotel Name>"
    When User verifies "hotel Name","total Price" and book hotel without entering anything
    Then User Verifies error meaage in guest information field "Let us know for whom you are booking the hotel","Please select Salutation of the user","Please provide First Name of the user","Please provide Last Name of the user", "Please provide Contact Number of the user to ease the communication (if required)","Please provide Email ID of the user to ease the communication (if required)"
    
    Examples: 
       | username             | password    | state Name | city Name       | select Room Type     | check in date | check out date         | No of Rooms  | No of Adults | No of Childers |
      | dassdowney@gmail.com | Testing@12 | Tamil Nadu | Tiruchirappalli | Luxury               | 2023-12-19    | 2023-12-29             | 4-Four       | 2-Two        |              2 |
      | Salutation           | First Name  | Last Name  | Mobile No       | Email id             | GST Mobile No | GST Company Name       | GST Address  |              |                |
      | Mr                   | Darrien     | Snow       |      9751080759 | dassdowney@gmail.com |    9043592058 | Greens Tech OMR Branch | Thoraipakkam |              |                |