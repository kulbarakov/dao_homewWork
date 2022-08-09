SELECT productName FROM orders
INNER JOIN customers ON orders.customerId = customers.id
WHERE name like :name
