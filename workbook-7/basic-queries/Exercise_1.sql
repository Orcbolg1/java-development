-- Exercise 1

-- Question 1
select * From Customers;

-- Question 2
SELECT * FROM Customers
ORDER BY City;

-- Question 3
SELECT * FROM Customers
WHERE City = 'Berlin';

-- Question 4
SELECT * FROM Customers
WHERE City LIKE 'a%';

-- Question 5
SELECT * FROM Products
WHERE Price 
BETWEEN 10 AND 20;