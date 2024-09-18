Feature: Add the product on Swag lab website



@endtoend
Scenario: End to End testing on Swag lab

Given user1 should be able to login the application
When user1 able to add prodcuts from excel "TestdataforSwagLAbs.xlsx" into the cart
And user1 should be able to checkout the product
Then validate the products added successfully on cart
