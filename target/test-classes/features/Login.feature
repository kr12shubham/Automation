Feature: Application Login

Scenario:  Home page default login
Given User is on NetBanking landing
When User login into application with username "root1" and password "admin1"
Then Home page is populated
And Cards are displayed "true"

Scenario:  Home page default login
Given User is on NetBanking landing
When User login into application with username "root" and password "admin"
Then Home page is populated
And Cards are displayed "false"
