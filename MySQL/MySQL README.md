# Mengting-Yang
NEU - Information System - Mengting Yang 

### Introduction
This is a supermarket management system to manage the SUPPLIER, INVENTORY and CUSTOMER of the supermarket. 
The supermarket first need to bought PRODUCTS from different suppliers through sales person and the products will be the inventory items of the supermarket. 
Then the supermarket will SELL the inventory items to different customers to complete the trade.

### Main Tables
One City must have at least one Territory
One Territory can have but not must have many Supermarkets
One Territory can have many Suppliers and one Supplier can serve many Territories

One Supplier has many Sales Person to sell the products to Supermarkets.
One Supplier has many Categories of the products and one Category has many Products in it.

One Supermarket has many Departments for different
responsibilities and in one Department there will be many Employees.
One Supermarket has many Customers and Some of the Customers will become the Membership 
so we can have the information for them.
One Supermarket has many Inventory Categories and each Category can belong to many Supermarkets. One Inventory Category can have many Inventory Item

### Relations
#### 1)Supplier and Supermarket
Supplier sells the products by Sales Person to Supermarket.
One Supermarket can have many Orders with many Sales Person. At the same time, one Sales Person can also sell many Products to many Supermarkets.

There are two kinds of Orders. One can be seen from Sales Person aspect, 
the other one can be seen from Supermarket aspect. So they can check and manage their own orders separately.
One Order must have one or more Order Item.

For the Order Item, from the Supplier aspect, one Order Item will be one Product of the Supplier.
From the Supermarket aspect, after bought these Order Item, they will become the Inventory Item of the Supermarket

#### 2)Supermarket and Customer
One Supermarket can have Orders with many Customers and one Customer can also have Orders with many different Supermarkets.
One Order must have at least one Order Item, and actually, the Order Item is the Inventory Item of the Supermarket.

### Views
1) show all the Customers who has any Order of any Product
2) show all the suppliers' all the products

### Procedures
1)Calculate the Total Price of the Market Supplier Order according to Order ID
2)Check specific day of customer 's order and order details

### Triggers
1) Record Product Information if it is updated
2) Record Employee Information if he/she left the supermarket
3) Reduce the Inventory Number if Customer buy new things
