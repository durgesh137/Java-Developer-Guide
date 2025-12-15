-- LeetCode #584: Find Customer Referee
-- Difficulty: Easy
-- Topics: SELECT, WHERE, OR, IS NULL
-- https://leetcode.com/problems/find-customer-referee/

-- Problem:
-- Find the names of customers that are either:
-- 1. Not referred by any customer (referee_id is NULL)
-- 2. Referred by a customer with id != 2
-- Return the result table in any order.

-- Concepts Used:
-- - SELECT statement (Basic SQL Concepts)
-- - WHERE clause (Basic SQL Concepts)
-- - OR operator (Basic SQL Concepts)
-- - IS NULL operator (Basic SQL Concepts - NULL Handling)
-- See: /SQL/src/docs/BasicSQLConcepts.md

-- Solution:
SELECT name
FROM Customer
WHERE referee_id IS NULL OR referee_id != 2;

-- Explanation:
-- 1. SELECT name: We only need the customer name
-- 2. FROM Customer: Query the Customer table
-- 3. WHERE referee_id IS NULL: Include customers with no referee
-- 4. OR referee_id != 2: Also include customers referred by anyone except customer 2
-- Either condition being TRUE will include the row in results

-- Key Insight:
-- Must use "IS NULL" not "= NULL" because NULL is not equal to anything, including NULL
-- NULL != 2 evaluates to NULL (not TRUE), so it won't match without the "IS NULL" check

-- Performance:
-- Time Complexity: O(n) - Full table scan
-- Space Complexity: O(1) - No additional data structures
-- Runtime: 513ms (LeetCode submission)

-- Test Case:
-- Input:
-- +----+------+------------+
-- | id | name | referee_id |
-- +----+------+------------+
-- | 1  | Will | null       |
-- | 2  | Jane | null       |
-- | 3  | Alex | 2          |
-- | 4  | Bill | null       |
-- | 5  | Zack | 1          |
-- | 6  | Mark | 2          |
-- +----+------+------------+
-- Output:
-- +------+
-- | name |
-- +------+
-- | Will |
-- | Jane |
-- | Bill |
-- | Zack |
-- +------+
-- Explanation:
-- Will (null) ✓, Jane (null) ✓, Alex (2) ✗, Bill (null) ✓, Zack (1) ✓, Mark (2) ✗
