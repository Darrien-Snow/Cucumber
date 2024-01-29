@SearchHotel
Feature: Verify OMR Branch hotel login credentials and search hotel

  # Test scenario 1
  @SearchHotelAllOptions
  Scenario Outline: Verify OMR branch Login with valid credentials
    Given User is on the OMR Branch Login page
    When User login with "<username>","<password>"
    Then User verifies the logged in user profile name "Welcome Darrien"
    When User enters searching details "<state Name>", "<city Name>", "<select Room Type>", "<check in date>","<check out date>","<No of Rooms>", "<No of Adults>", "<No of Childers>"
    Then User verifies search result "Select Hotel"

    Examples: 
      | username             | password   | state Name | city Name       | select Room Type | check in date | check out date | No of Rooms | No of Adults | No of Childers |
      | dassdowney@gmail.com | Testing@12 | Tamil Nadu | Tiruchirappalli | Luxury           | 2024-12-19    | 2024-12-29     | 4-Four      | 2-Two        |              2 |

  #Test Scenario 2
  @SearchHotelMantatoryOptions
  Scenario Outline: Verify OMR branch Login with valid credentials and only mantatory search fields
    Given User is on the OMR Branch Login page
    When User login with "<username>","<password>"
    Then User verifies the logged in user profile name "Welcome Darrien"
    When User enters searching details "<state Name>", "<city Name>", "<check in date>","<check out date>","<No of Rooms>", "<No of Adults>"
    Then User verifies search result "Select Hotel"

    Examples: 
      | username             | password   | state Name | city Name       | check in date | check out date | No of Rooms | No of Adults |
      | dassdowney@gmail.com | Testing@12 | Tamil Nadu | Tiruchirappalli | 2024-12-19    | 2024-12-29     | 4-Four      | 2-Two        |

  #Test Scenario 3
  @WithSearchField_ErrorMsg
  Scenario Outline: Verify OMR branch Login with valid credentials and only mantatory search fields
    Given User is on the OMR Branch Login page
    When User login with "<username>","<password>"
    Then User verifies the logged in user profile name "Welcome Darrien"
    When User clicks search button
    Then User verifies error message "<state error message>",  "<city error message>","<checkIn error message>","<checkOut error message>","<NoofRoom error message>","<NoofAdults error message>",

    Examples: 
      | username             | password   | state error message | city error message | checkIn error message       | checkOut error message       | NoofRoom error message     | NoofAdults error message    |
      | dassdowney@gmail.com | Testing@12 | Please select state | Please select city | Please select Check-in date | Please select Check-out date | Please select no. of rooms | Please select no. of adults |

  #TestScenario 4
  @MultipleRoomType
  Scenario Outline: Verify OMR branch Login with valid credentials
    Given User is on the OMR Branch Login page
    When User login with "<username>","<password>"
    Then User verifies the logged in user profile name "Welcome Darrien"
    When User enters searching details "<state Name>", "<city Name>", "<select Room Type>", "<check in date>","<check out date>","<No of Rooms>", "<No of Adults>", "<No of Childers>"
    Then User verifies search result "Select Hotel"
    And User verifies "<select Room Type>"

    Examples: 
      | username             | password   | state Name | city Name       | select Room Type                    | check in date | check out date | No of Rooms | No of Adults | No of Childers |
      | dassdowney@gmail.com | Testing@12 | Tamil Nadu | Tiruchirappalli | Standard/Deluxe/Suite/Luxury/Studio | 2024-12-19    | 2024-12-29     | 4-Four      | 2-Two        |              2 |
