-- Schema for LeetCode #1757: Recyclable and Low Fat Products
-- https://leetcode.com/problems/recyclable-and-low-fat-products/

-- Drop table if exists
DROP TABLE IF EXISTS Products;

-- Create table
CREATE TABLE Products (
    product_id INT PRIMARY KEY,
    low_fats ENUM('Y', 'N') NOT NULL,
    recyclable ENUM('Y', 'N') NOT NULL
);

-- Insert test data
INSERT INTO Products (product_id, low_fats, recyclable) VALUES
(0, 'Y', 'N'),
(1, 'Y', 'Y'),
(2, 'N', 'Y'),
(3, 'Y', 'Y'),
(4, 'N', 'N');

-- Verify data
SELECT * FROM Products;

-- Expected output from solution query:
-- +-------------+
-- | product_id  |
-- +-------------+
-- | 1           |
-- | 3           |
-- +-------------+

