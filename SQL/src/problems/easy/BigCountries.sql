-- LeetCode #595: Big Countries
-- Difficulty: Easy
-- Topics: SELECT, WHERE, OR, Comparison Operators
-- https://leetcode.com/problems/big-countries/

-- Problem:
-- A country is big if:
-- 1. It has an area of at least three million (>= 3000000 km2), OR
-- 2. It has a population of at least twenty-five million (>= 25000000)
-- Find the name, population, and area of the big countries.
-- Return the result table in any order.

-- Concepts Used:
-- - SELECT statement (Basic SQL Concepts)
-- - WHERE clause (Basic SQL Concepts)
-- - OR operator (Basic SQL Concepts)
-- - Comparison operators (>=) (Basic SQL Concepts)
-- See: /SQL/src/docs/BasicSQLConcepts.md

-- Solution:
SELECT name, population, area
FROM World
WHERE area >= 3000000 OR population >= 25000000;

-- Explanation:
-- 1. SELECT name, population, area: Return these three columns
-- 2. FROM World: Query the World table
-- 3. WHERE area >= 3000000: First condition - area at least 3 million
-- 4. OR population >= 25000000: Second condition - population at least 25 million
-- At least ONE condition must be TRUE for a row to be included

-- Key Insight:
-- OR operator means "at least one condition must be true"
-- A country can satisfy either condition (or both) to be considered "big"

-- Performance:
-- Time Complexity: O(n) - Full table scan
-- Space Complexity: O(1) - No additional data structures
-- Runtime: 278ms (LeetCode submission)

-- Test Case:
-- Input:
-- +-------------+-----------+---------+------------+--------------+
-- | name        | continent | area    | population | gdp          |
-- +-------------+-----------+---------+------------+--------------+
-- | Afghanistan | Asia      | 652230  | 25500100   | 20343000000  |
-- | Albania     | Europe    | 28748   | 2831741    | 12960000000  |
-- | Algeria     | Africa    | 2381741 | 37100000   | 188681000000 |
-- | Andorra     | Europe    | 468     | 78115      | 3712000000   |
-- | Angola      | Africa    | 1246700 | 20609294   | 100990000000 |
-- +-------------+-----------+---------+------------+--------------+
-- Output:
-- +-------------+------------+---------+
-- | name        | population | area    |
-- +-------------+------------+---------+
-- | Afghanistan | 25500100   | 652230  |  (population >= 25M)
-- | Algeria     | 37100000   | 2381741 |  (both area >= 3M AND population >= 25M)
-- +-------------+------------+---------+
-- Explanation:
-- Afghanistan: area < 3M but population >= 25M ✓
-- Albania: area < 3M and population < 25M ✗
-- Algeria: area < 3M but population >= 25M ✓
-- Andorra: area < 3M and population < 25M ✗
-- Angola: area < 3M and population < 25M ✗
