# Write your MySQL query statement below
SELECT Name As Customers
FROM customers
WHERE ID NOT IN(
    SELECT customerId
    FROM Orders
);