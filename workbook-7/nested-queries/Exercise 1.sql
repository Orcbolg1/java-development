-- Nested Exercise
-- Exercise 1 (find the expensive product)
select ProductName
FROM northwind.products
where unitPrice IN (select max(unitPrice) from northwind.products);

-- Exercise 2 (find the orderID, ship name, ship adress using ship via that uses "Federal Shipping")
select orderID, shipName, shipAddress, ShipVia
from northwind.orders
where ShipVia = (select shipperID from northwind.shippers where ShipperID = 3);

-- Exercise 3 (find the order IDs that contain the product Sasquatch Ale)
select OrderID
from northwind.`order details`
where productID = 34;

-- Exercise 4 (FInd the name of the employee who sold order 10266)
select firstname, lastname
from northwind.employees
where EmployeeID = (select employeeID from northwind.orders where OrderID =10266);

-- Exercise 5 (Find the name of the company that bought order 10266)
select CompanyName
from northwind.customers
where CustomerID = (select CustomerID from northwind.orders where OrderID = 10266);
