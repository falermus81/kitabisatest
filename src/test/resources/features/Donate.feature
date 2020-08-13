Feature: Donate
  User select a campaign then make a donation

  Background: Initial Condition
    Given User opened "http://kitabisa.com" website

  Scenario: User makes a donation for any campaign
    When User in Home Page taps on any campaign
    And User in Campaign Page donates immediately
    And User donates IDR 10000
    And using Transfer BCA method
    And with name "Jaka Sembung"
    And with email "jakasembung@gmail.com"
    And User in Identity Page clicks Lanjutkan Pembayaran