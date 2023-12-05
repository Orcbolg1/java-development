-- Exercise 1

-- Question 1
SELECT MIN(Price)
FROM Products;

-- Question 2
SELECT COUNT(CustomerID), Country
FROM Customers
GROUP BY Country;

-- Exercise 2

-- Question 1
select count(SupplierID) as SupplierCount
from northwind.suppliers;

-- Question 2
select sum(salary) as TotalSalary
from northwind.employees;

-- Question 3
select  min(unitPrice) as CheapestItem
from northwind.products;

-- Question 4
select avg(unitprice) as AvgPrice
from northwind.products;

-- Question 5
select  max(unitPrice) as ExpensiveItem
from northwind.products;

-- Question 6
SELECT supplierid, count(ProductID) AS item_count
FROM northwind.products
GROUP BY supplierid;

-- Question 7
select CategoryID, avg(unitPrice) as AvgPrice
FROM northwind.products
GROUP BY CategoryID;

-- question 8
SELECT SupplierID, COUNT(*) AS item_count
FROM northwind.products
group by supplierID
having COUNT(*) >= 5;

-- Question 9
select productID, productname, (UnitPrice * UnitsInStock) AS InventoryValue
FROM northwind.products
order by inventoryValue desc, ProductName asc;





