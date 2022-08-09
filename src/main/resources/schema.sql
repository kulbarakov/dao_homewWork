CREATE TABLE customers
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    surname VARCHAR(50),
    age INTEGER,
    phoneNumber VARCHAR(20)
);

CREATE TABLE orders
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    orderDate DATE,
    productName VARCHAR(150),
    amount real,
    customerid INTEGER,
    FOREIGN KEY (customerId) REFERENCES customers (id)
);