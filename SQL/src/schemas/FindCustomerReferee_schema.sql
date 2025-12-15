-- Schema for LeetCode #584: Find Customer Referee
-- https://leetcode.com/problems/find-customer-referee/

-- Drop table if exists
DROP TABLE IF EXISTS Customer;

-- Create table
CREATE TABLE Customer (
    id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    referee_id INT NULL
);

-- Insert test data
INSERT INTO Customer (id, name, referee_id) VALUES
(1, 'Will', NULL),
(2, 'Jane', NULL),
(3, 'Alex', 2),
(4, 'Bill', NULL),
(5, 'Zack', 1),
(6, 'Mark', 2);

-- Verify data
SELECT * FROM Customer;

-- Expected output from solution query:
-- +------+
-- | name |
-- +------+
-- | Will |
-- | Jane |
-- | Bill |
-- | Zack |
-- +------+

