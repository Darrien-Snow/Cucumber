@selectHotel
Feature: Verify OMR Branch hotel login credentials,search hotel and select hotel

  #Test Scenario 1
  @AcceptAlert
  Scenario Outline: Select hotel and verify navigate to book hotel upon accepting the alert
    Given User is on the OMR Branch Login page
    When User login with "<username>","<password>"
    Then User verifies the logged in user profile name "Welcome Darrien"
    When User enters searching details "<state Name>", "<city Name>", "<select Room Type>", "<check in date>","<check out date>","<No of Rooms>", "<No of Adults>", "<No of Childers>"
    Then User verifies search result "Select Hotel"
    When User saves first "<hotel Name>", "total price" and select first "<hotel Name>"
    And User accept alert
    Then User verifies "Book Hotel" and "<hotel Name>"

    Examples: 
      | username             | password    | state Name | city Name       | select Room Type | check in date | check out date | No of Rooms | No of Adults | No of Childers |
      | dassdowney@gmail.com | Testing@12 | Tamil Nadu | Tiruchirappalli | Luxury           | 2023-12-19    | 2023-12-29     | 4-Four      | 2-Two        |              2 |

  #Test Scenario 2
  @CancelAlert
  Scenario Outline: Select hotel and verify navigate to book hotel upon cancel/ignore the alert
    Given User is on the OMR Branch Login page
    When User login with "<username>","<password>"
    Then User verifies the logged in user profile name "Welcome Darrien"
    When User enters searching details "<state Name>", "<city Name>", "<select Room Type>", "<check in date>","<check out date>","<No of Rooms>", "<No of Adults>", "<No of Childers>"
    Then User verifies search result "Select Hotel"
    When User saves first "<hotel Name>", "total price" and select first "<hotel Name>"
    And User cancel/ignore alert
    Then User verifies "Select Hotel"

    Examples: 
      | username             | password    | state Name | city Name       | select Room Type | check in date | check out date | No of Rooms | No of Adults | No of Childers |
      | dassdowney@gmail.com | Testing@12 | Tamil Nadu | Tiruchirappalli | Luxury           | 2023-12-19    | 2023-12-29     | 4-Four      | 2-Two        |              2 |

  #Test Scenario 3
  @SortingPriceAscending
  Scenario Outline: Verify sorting functionality based on hotel price from low to high
    Given User is on the OMR Branch Login page
    When User login with "<username>","<password>"
    Then User verifies the logged in user profile name "Welcome Darrien"
    When User enters searching details "<state Name>", "<city Name>", "<select Room Type>", "<check in date>","<check out date>","<No of Rooms>", "<No of Adults>", "<No of Childers>"
    Then User verifies search result "Select Hotel"
    When User select sort by "Price low to high"
    Then User verifies listed hotel price sorted low to high

    Examples: 
      | username             | password    | state Name | city Name       | select Room Type | check in date | check out date | No of Rooms | No of Adults | No of Childers |
      | dassdowney@gmail.com | Testing@12 | Tamil Nadu | Tiruchirappalli | Luxury           | 2023-12-19    | 2023-12-29     | 4-Four      | 2-Two        |              2 |

  #Test Scenario 4
  @SortingHotelNameDecending
  Scenario Outline: Verify sorting functionality based on hotel price from low to high
    Given User is on the OMR Branch Login page
    When User login with "<username>","<password>"
    Then User verifies the logged in user profile name "Welcome Darrien"
    When User enters searching details "<state Name>", "<city Name>", "<select Room Type>", "<check in date>","<check out date>","<No of Rooms>", "<No of Adults>", "<No of Childers>"
    Then User verifies search result "Select Hotel"
    When User select sort by "Name Descending"
    Then User verifies listed hotel name sorted in decending order

    Examples: 
      | username             | password    | state Name | city Name       | select Room Type | check in date | check out date | No of Rooms | No of Adults | No of Childers |
      | dassdowney@gmail.com | Testing@12 | Tamil Nadu | Tiruchirappalli | Luxury           | 2023-12-19    | 2023-12-29     | 4-Four      | 2-Two        |              2 |
