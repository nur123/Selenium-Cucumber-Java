Feature: Register to website
  Background:
    Given user open automationexercise.com website

    Scenario: Register to website with email successfully
      When user click SignUpOrLogin
      When user fill name "Testing Cucumber New"
      When user fill email address "sukamdanieko123@gmail.com"
      When user click button SignUp
      When user click title "Mr"
      When user fill password field "Satria123"
      When user click day "11"
      When user click month "10"
      When user click year "1986"
      When user click sign up for our newsletter!
      When user click receive special offers from our partners!
      When user fill first name "Testing"
      When user fill last name "Cucumberku"
      When user fill company "abcok123"
      When user fill address "Jl abcdeku"
      When user fill address2 "Jl kauaia2"
      When user click country "india"
      When user fill state "New Delhi"
      When user fill city "Mumbai"
      When user fill zipcode "3415161"
      When user fill mobilenumber "01811918718191"
      When user click button create account
      When user click button continue