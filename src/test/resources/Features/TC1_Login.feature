@Login
Feature: Verify OMR Branch hotel login credentials

  #Testscenario1
  @ValidLogin
  Scenario Outline: Verify OMR branch Login with valid credentials
    Given User is on the OMR Branch Login page
    When User login with "<username>","<password>"
    Then User verifies the logged in user profile name "Welcome Darrien"

    Examples: 
      | username             | password   |
      | dassdowney@gmail.com | Testing@12 |

  # Test scenario 2
  @ValidLogin_EnterKey
  Scenario Outline: Verify OMR branch Login with valid credentials and Enter key
    Given User is on the OMR Branch Login page
    When User login with "<username>","<password>" and enter
    Then User verifies the logged in user profile name "Welcome Darrien"

    Examples: 
      | username             | password    |
      | dassdowney@gmail.com | Testing@12 |

  # Test scenario 2
  @InvalidLogin
  Scenario Outline: Verify OMR branch Login with invalid credentials
    Given User is on the OMR Branch Login page
    When User login with "<username>",invalid "<password>"
    Then User verifies the error masg "Invalid Login details or Your Password might have expired."

    Examples: 
      | username             | password    |
      | dassdowney@gmail.com | Testing@789 |
