-- Exercise 1
-- Question 1

SELECT *
FROM Orders
LEFT JOIN Customers
ON Orders.CustomerID = Customers.CustomerID;

-- Exercise 2
-- Question 1
SELECT ProductID, ProductName, UnitPrice, CategoryName
FROM northwind.products
JOIN northwind.categories ON products.CategoryID = categories.CategoryID
ORDER BY CategoryName ASC, ProductName ASC;

-- Question 2
select  ProductID, ProductName, UnitPrice, CompanyName
FROM northwind.products
join northwind.suppliers on products.supplierID = suppliers.supplierID
where unitPrice >= 75
order by ProductName;

-- Question 3
select ProductID, ProductName, UnitPrice, CategoryName, CompanyName
FROM northwind.products
JOIN northwind.categories ON products.CategoryID = categories.CategoryID
join northwind.suppliers on products.supplierID = suppliers.supplierID
order by ProductName;

-- Question 4
select ProductName, CategoryName
FROM northwind.products
join northwind.categories ON products.CategoryID = categories.CategoryID
where unitPrice IN (select max(unitPrice) from northwind.products);

-- Question 5
Select OrderID, ShipName, ShipAddress, CompanyName
from northwind.orders
JOIN northwind.shippers ON orders.ShipVia = shippers.ShipperID
where ShipCountry = "Germany";

-- QUestion 6
select orders.orderID, orders.OrderDate, orders.ShipName, orders.ShipAddress
from northwind.orders
join northwind.`order details` On orders.OrderID = `order details`.OrderID
where `order details`.ProductID = 34;
