Feature: Login flow test for saucedemo project

  Scenario Outline: Login Validation
    Given user navigate to login to the url
    When user enters username "<username>" and password "<password>"
    And click on LOGIN button
    Then verify the first landing page
    When click on logout button
    Then verify the default home page

    Examples: 
      | username                | password     |     
      | standard_user           | secret_sauce |
     
     
     

