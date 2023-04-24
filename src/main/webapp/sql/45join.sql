DROP DATABASE w3schools;
USE w3schools;
SELECT * FROM Products;
DESC Products;
SELECT * FROM Categories;
ALTER TABLE Products
ADD FOREIGN KEY (CategoryId)
REFERENCES Categories(CategoryId);
DESC Products;
ALTER TABLE Products
ADD FOREIGN KEY (SupplierId)
REFERENCES Suppliers(SupplierId);
DESC OrderDetails;
ALTER TABLE OrderDetails
ADD FOREIGN KEY (OrderId) REFERENCES Orders(OrderId);
ALTER TABLE OrderDetails
ADD FOREIGN KEY (ProductId) REFERENCES Products(ProductId);
DESC Orders;
ALTER TABLE Orders
ADD FOREIGN KEY (CustomerID)
REFERENCES Customers(CustomerId);
ALTER TABLE Orders
ADD FOREIGN KEY (EmployeeID)
REFERENCES Employees(EmployeeId);
ALTER TABLE Orders
ADD FOREIGN KEY (ShipperID)
REFERENCES Shippers(ShipperId);
DESC Shippers;
DESC Suppliers;
