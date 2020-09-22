@HomePage
Feature: feature to test HomePageSteps functionality
  
  I want to create channel,post a text and validate.

  Scenario Outline: I want to validate existence of channel ,create channel,created channel validate,delete channel,deleted
    channel validate .also i want post a text and validate.
     
    Given I want enter <userName> and <passWord> and click signin 
    And click the iconProfile
    When create a channel <channelName> under channels in homePage
    Then I validate  the <channelName> channelName in channels under homepage
    When i want to delete the channel and verify the channel name
    And i want write <post>on homepage
    Then i want to validate <post> under  homepage

    Examples: 
      | userName                 | passWord         | channelName | post |
      | "dewan_shahed@yahoo.com" | "Bangladesh2020" | "stardust"  | "Hi" |
