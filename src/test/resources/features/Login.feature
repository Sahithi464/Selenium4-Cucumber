Feature: Login functionality
@test @Smoke
Scenario Outline: Login with valid credentials
  Given User has navigated to the page
  And  User enters "<username>" and "<password>"

  Examples:
    | username | password |
    | admin    | test@123 |


