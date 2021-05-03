Feature: MY ACCOUNT Verification

Background:
Given user is on login Page
|manisha2021@gmail.com|Test@12345|

Scenario: Account Header List count Validation
Given the user is on account Page
Then Verify the title of the Page "My account - My Store"
When the user collect the personal information of all orders
Then verify the Count of the  Account header should be 5

Scenario: Account Header List text Validation
Given the user is on account Page
Then Verify the title of the Page "My account - My Store"
When the user collect the personal information of all orders List
Then verify the text of the  Account header
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESSES|
|MY PERSONAL INFORMATION|
|MY WISHLISTS|
