Feature: Test Login actitime03
   
   @Regression
   Scenario: Check login is successful for actitime03
   Given open browser and navigate to url "https://demo.actitime.com/login.do"
   When enter valid username as "admin" and password as "manager"
   Then click on login button actitime03                     
  