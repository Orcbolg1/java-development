-- Exercise 2
-- Question 1
select *
FROM northwind.products;

-- Question 2
select ProductID, ProductName, UnitPrice
FROM northwind.products;

-- Question 3
select ProductID, ProductName, UnitPrice
FROM northwind.products
order by UnitPrice asc;

-- Question 4
select *
FROM northwind.products
where UnitPrice <= 7.50;

-- Question 5
select *
FROM northwind.products
where UnitsInStock >= 100
order by UnitsInStock desc;

-- Question 6
select *
FROM northwind.products
where UnitsInStock >= 100
order by UnitPrice desc, ProductName asc;

-- Question 7
select ProductName, UnitsInStock, UnitsOnOrder
from northwind.products
Where UnitsInStock = 0 and UnitsOnOrder > 0
order by ProductName asc;

-- Question 8 
select *
From northwind.categories;

-- question 9
select *
From northwind.categories
where CategoryID = 8;

-- Question 10
select *
from northwind.products
where CategoryID = 8;

-- Question 11
select FirstName, LastName
from northwind.employees;

-- Question 12
select *
from northwind.employees
where Title Like '%manager%';

-- Question 13
select distinct Title
from northwind.employees;

-- Question 14
select *
from northwind.employees
where Salary between 2000 and 2500;

-- Question 15
select *
from northwind.suppliers;

-- Question 16
select *
from northwind.products
where SupplierID = 4;



