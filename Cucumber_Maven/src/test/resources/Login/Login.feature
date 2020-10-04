#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
@Login      
 Feature: Login Feature
 This feature includes scenario that would validate the following logins.
 1. Admin Login
 2. linda.anderson
 3. Negative login
 
 
 
 Background: 
 Given I am able to view/navigate to login page
 
 
 Scenario Outline: Login with different users
 When I update the user name as "<user>"
 And I update the pass word as "<password>"
 And I click on the login button 
 Then I should see the user name as "<name>"
 
 Examples: 
 |user            |password      |name               |
 |linda.anderson           |linda.anderson      |Welcome Linda      |
 |linda.anderson  |linda.anderson|Welcome Linda      |
 #|kuchbhi         |kuchbhi       |Invalid credentials|
 
 
 
 #Scenario: Admin Login
 #When I update the user name as "Admin"
 #And I update the pass word as "admin123"
 #And I click on the login button 
 #Then I should see the user name as "Welcome Linda" 
      #
 #Scenario: linda.anderson Login
 #Given I am able to view/navigate to login page
 #When I update the user name as "linda.anderson"
 #And I update the pass word as "linda.anderson"
 #And I click on the login button 
 #Then I should see the user name as "Welcome Linda"     
 
 
      
 Scenario: Negative Login
 #Given I am able to view/navigate to login page
 When I update the user name as "kuchbhi"
 And I update the pass word as "kuchbhi"
 And I click on the login button 
 Then I should see the error message as "Invalid credentials"  
