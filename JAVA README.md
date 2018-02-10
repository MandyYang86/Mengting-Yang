# Mengting-Yang
## JAVA : NetBeans
### Homework 1
This homework is to build a form that will create and display user profile information. 
The system must have 1) Person 2) License data 3) Credit card 4) Address 5) Financial accounts

### Homework 2
This homework is an application to manage a fleet of airplanes for an airliner to answer these questions:
1. Find me the first available airplane.
2. How many airplanes are currently available. How many are, otherwise.
3. List all airplanes that are made by Boeing.
4. List all airplanes that were manufactured in a given year, ‘x’.
5. Find an available airplane with a minimum of x seats but no more than y seats.
6. Find an airplane with the given serial number. List the attributes of the found airplane.
7. List all airplanes given the model number.
8. List all the airplane manufacturers used by the (this) airliner.
9. When was the last time the fleet catalog was updated.
10. List all airplanes that are available in a given airport
11. List all airplanes that have expired maintenance certificate.

### Homework 3
This homework is to practice how to populate a complex model with data. 
Consider the travel agency model we discussed in class. I define the java classes associated with all the elements in the model. That includes the customer side, the physical airplanes, as well as the scheduling of flights. 
1)	Create the travel agency object, 
2)	For each airliner, define a fleet of airplanes
3)	For each airplane define its attributes and that include the number of seats (Seats and Seat Assignments will be accounted for on Flight for this homework assignment.) 
Prices will be assigned to the seats. The total review per flight will be the sum of the prices on the seats. 
4)	For each flight create associated seats. Seats come into 2 columns where each row is made up of three seats (window, middle, and Aisle). 
Assume each airplane will have 25 rows. 
5)	For the customer directory create customers where some are assigned seats on flights. 

### Homework 4
This homework is to build an application for Xerox’s mediated sales.The system must allow for dynamic range pricing (floor, target, ceiling). In this case, the range prices you show to the sales person will be different depending on market the customer belongs to. 
System does this by categorizing customers by the market they are in. For example, from Xerox’ view point, NU is in the higher education market. The price ranges for NU are very different from those of a bank in the financial services market.

Use cases of this homework:
• Manage persons and user accounts
• Configure markets and customer types
• Register customers
• Manage suppliers and their product catalogs
• Manage Market Offer Catalog: Configure market offers with range pricing per specific markets (the industry the customer is a member of). Must allow for updates to range prices per market.
• Order products
• Range prices for the customer are shown to the sales person. Actual prices agreed to pay are recorded and accumulated sums are displayed as well.
• Monitor Sales performance
Revenue totals for Xerox
Product sales revenues by market
Top 10 sales persons by revenues broken down by market
Sales persons with consist above target sales
Sales person with below total order target sales
Top 3 products consistently sold above market target price
In all of the cases above calculate the gap between target and actual


### Homework 5
This homework is to complete system structure that include all of the components below. Inventory view must be included at the provider level as well as the satellite clinic levels. 
1) Manage system
2) Create the system
• Define disease catalog
• Define vaccine catalog (vaccine could be to protect against disease)
• Create organizations. Enterprises have organizations in charge of different responsibilities Organizations have staff who are persons selected from the person directory Organizations have work areas 
3) Manage persons
• Each enterprise manages its own person directory. Persons belong to different organization’s staff directory.
4) Manage user accounts
• User accounts are connected to persons belonging to organizations and assigned particular work
areas.
5) Manage distributor inventory showing vaccines in stock with status. 
• The distributor is an enterprise as well and includes multiple organizations. One of these organizations will be responsible for inventory.
6) Manage state-level providers (maintains vaccine inventory)
• Add/update provider
• Manage provider inventory
• Create and update satellite clinics
• Clinics are organizations so they have staff and work areas as well ii. Clinics manage their own inventory
• Clinics order from providers not the state, iv. Etc.

### Final Project - Homeless People Management System
##### Introduction
Our system helps the homeless people to find shelters from spare spaces of library, church and so on. This can improve the resource utilization to a great extent. 
We also provide physical examination for every homeless people, in this way can we control the infection rate of diseases 
and once we find shelters for homeless people, the crime rates can be reduced, it has great value for social security. 

##### Approach
###### 1)Find shelters for homeless people
We found there are a lot of spaces which are free in some specific time slots. For example, the church will close in the evening and there will be spare spaces in it. So what we think is to make good use of such spaces to help homeless people find shelters. 

###### 2)Monitor the physical health problems of homeless people
There is an organization named hospital that monitors the physical health status of homeless people. We can not only help the homeless people find shelters, but also can track their physical status to  help them get vaccination.  

##### Use Cases
###### Government Role:
Register for homeless people
Send Request to Agency to ask them to find allocate shelters for homeless people.
Data Analysis.

###### Supplier Role:
Manage disease catalog and vaccine catalog.
Provide vaccines for hospitals

###### Agency Role:
Allocate shelters for homeless people according to the request sent by government.
Register for new available shelters.

###### Hospital Role:
Physical Examination Role collect (blood) sample for homeless people.
Lab Assistant test the sample and give the examination result for homeless people.
Doctor give diagnosed result to nurse.
Nurse take vaccination for every homeless people according to the diagnosis made by doctor.







