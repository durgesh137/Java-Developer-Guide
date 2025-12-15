-- LeetCode #1757: Recyclable and Low Fat Products
-- Difficulty: Easy
-- Topics: SELECT, WHERE, AND
-- https://leetcode.com/problems/recyclable-and-low-fat-products/

-- Problem:
-- Write a solution to find the ids of products that are both low fat and recyclable.
-- Return the result table in any order.

-- Concepts Used:
-- - SELECT statement (Basic SQL Concepts)
-- - WHERE clause (Basic SQL Concepts)
-- - AND operator (Basic SQL Concepts)
-- See: /SQL/src/docs/BasicSQLConcepts.md

-- Solution:
SELECT product_id
FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y';

-- Explanation:
-- 1. SELECT product_id: We only need the product_id column
-- 2. FROM Products: Query the Products table
-- 3. WHERE low_fats = 'Y': First condition - product must be low fat
-- 4. AND recyclable = 'Y': Second condition - product must be recyclable
-- Both conditions must be TRUE for a row to be included in results

-- Performance:
-- Time Complexity: O(n) - Full table scan
-- Space Complexity: O(1) - No additional data structures
-- Runtime: 661ms (LeetCode submission)

-- Test Case:
-- Input:
-- +-------------+----------+------------+
-- | product_id  | low_fats | recyclable |
-- +-------------+----------+------------+
-- | 0           | Y        | N          |
-- | 1           | Y        | Y          |
-- | 2           | N        | Y          |
-- | 3           | Y        | Y          |
-- | 4           | N        | N          |
-- +-------------+----------+------------+
-- Output:
-- +-------------+
-- | product_id  |
-- +-------------+
-- | 1           |
-- | 3           |
-- +-------------+
