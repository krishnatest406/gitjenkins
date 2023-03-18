Feature: facebook

  Scenario: validate title
    Given open browser
    When launch "https://www.facebook.com" site
    Then get title of page is equal to "Facebook"
    When close the site

   