@smoke
Feature: registration page

  Background: User in Main page
    Given user is on main page

  Scenario: register on web site

   Given create new user with following data
   |firstName | lastName | address | city  |state | zipCode | phoneNumber | ssn | userName | password | confirmPassword |
   | jennie   | Pennie   | PeongchonDeiro   | Seoul | Pomge | 7878 | 82707070 | rhjve| jennie-pennie13| Qwerty123|Qwerty123 |
    Then user clicks register btn





