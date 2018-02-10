-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- VIEW 1: Create a view that show all the customers who has any order of any product
select * from product_customer;

-- select the specific customer's order
select ItemName,ItemNumber,OrderID,TotalPrice
from
product_customer
where CustomerID=1;

-- select specific order's total price
select OrderID,sum(TotalPrice) as OrderTotalPrice
from 
product_customer
where OrderID=2;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- VIEW 2: Create a view that shows all the suppliers' all the products
select * from prodcut_supplier;

-- select all the products of specific supplier
select ProductCategoryName,ProductName
from prodcut_supplier
where SupplierID=1;

-- select distinct products of all supplier
select distinct ProductName
from prodcut_supplier;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- PROCEDURE 1: Calculate the total price of the MarketSupplierOrder according to OrderID
select * from MarketSupplierOrderItem;
-- select order total price which orderID=1
call product_pricing(1,@sum);
select @sum;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- PROCEDURE 2: Check specific day of customer 's  order and order details

delimiter ;
-- SELECT @@SESSION.sql_mode;
-- SET SESSION sql_mode = 'STRICT_TRANS_TABLES,NO_ZERO_IN_DATE';
select * from OrderDetailsDate;

-- show create procedure customer_date which is 2017-05-12
call customer_date('2017-05-12',@OrderID,@totalPriceOfDate);
select @OrderID,@totalPriceOfDate;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- TRIGGER 1: Record Product Information if it is updated

update Product
set ProductNumber=150
where
ProductID=1;

select * from product_update;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- TRIGGER 2: Record Employee Information if he/she left the supermarket

select * from Employee;

INSERT INTO Employee (`EmployeeID`, `EmployeeName`, `EmployeeSalary`, `EmployeePhone`, `Department_DepartmentID`) 
VALUES (9, 'Mengting Yang', 5000, '857-209-1386', 1);
delete from Employee where EmployeeID=9;

INSERT INTO Employee (`EmployeeID`, `EmployeeName`, `EmployeeSalary`, `EmployeePhone`, `Department_DepartmentID`) 
VALUES (10, 'Chiwen Shi', 6000, '857-744-1222', 2);
delete from Employee where EmployeeID=10;

select * from leave_employee;

-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- TRIGGER 3: Reduce the Inventory Number if Customer buy new things

select *  from CustomerSupermarketOrderItem;

INSERT INTO `mydb`.`CustomerSupermarketOrderItem` 
(`CustomerSupermarketOrder_CustomerSupermarketOrderID`, `InventoryItem_InventoryItemID`, `CustomerSupermarketOrderItemSaleNumber`) 
VALUES (8, 1, 2);

INSERT INTO `mydb`.`CustomerSupermarketOrderItem` 
(`CustomerSupermarketOrder_CustomerSupermarketOrderID`, `InventoryItem_InventoryItemID`, `CustomerSupermarketOrderItemSaleNumber`) 
VALUES (7, 2, 1);

select *  from InventoryItem;
