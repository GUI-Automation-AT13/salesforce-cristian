Feature: Create an Campaign

  @CreateCampaign
  Scenario: create a campaign with only required fields
    Given I login to salesforce site as an developer user
    And I navigate to Campaign page
    When I create a new campaign with required fields
      | Campaign Name           | New Campaign 222222 |
    Then I verify Campaign created with requirement fields

  @CreateCampaign
  Scenario: create a campaign with all fields
    Given I login to salesforce site as an developer user
    And I navigate to Campaign page
    When I create a new campaign with required fields
    | Campaign Name                 | New Campaign Created  |
    | Start Date                    | 7/24/2021             |
    | End Date                      | 8/24/2021             |
    | Expected Revenue in Campaign  | 200                   |
    | Budgeted Cost in Campaign     | 150                   |
    | Actual Cost in Campaign       | 180                   |
    | Num Sent in Campaign          | 100                   |
    Then I verify Campaign created with requirement fields
