Feature: Test Login actitime02

   Scenario Outline: Check login is successful for actitime02
   Given open browser and navigate to url actitime02
   When enter valid <username> and <password> actitime02
   And click on login button actitime02                     
   Then click on logout actitime02
   
   Examples: 
            | username | password |
            | admin    | manager  |
            | trainee  | trainee  |
            | test     | test     | 