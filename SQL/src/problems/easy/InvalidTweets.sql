-- LeetCode #1683: Invalid Tweets
-- Difficulty: Easy
-- Topics: SELECT, WHERE, LENGTH function, String Functions
-- https://leetcode.com/problems/invalid-tweets/

-- Problem:
-- Find the IDs of invalid tweets.
-- A tweet is invalid if the number of characters in the content is strictly greater than 15.
-- Return the result table in any order.

-- Concepts Used:
-- - SELECT statement (Basic SQL Concepts)
-- - WHERE clause (Basic SQL Concepts)
-- - Comparison operators (>) (Basic SQL Concepts)
-- - LENGTH() function (Basic SQL Concepts - String Functions)
-- See: /SQL/src/docs/BasicSQLConcepts.md

-- Solution:
SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) > 15;

-- Explanation:
-- 1. SELECT tweet_id: Return only the tweet_id column
-- 2. FROM Tweets: Query the Tweets table
-- 3. WHERE LENGTH(content) > 15: Filter tweets with content length > 15 characters
-- LENGTH() function returns the number of characters in a string

-- Key Insight:
-- LENGTH() counts characters, not bytes
-- In MySQL: LENGTH() returns byte count, CHAR_LENGTH() returns character count
-- For alphanumeric + basic characters (this problem), both work the same

-- Performance:
-- Time Complexity: O(n * m) - where n = rows, m = avg string length
-- Space Complexity: O(1) - No additional data structures
-- Runtime: 603ms (LeetCode submission)

-- Test Case:
-- Input:
-- +----------+-----------------------------------+
-- | tweet_id | content                           |
-- +----------+-----------------------------------+
-- | 1        | Let us Code                       |
-- | 2        | More than fifteen chars are here! |
-- +----------+-----------------------------------+
-- Output:
-- +----------+
-- | tweet_id |
-- +----------+
-- | 2        |
-- +----------+
-- Explanation:
-- Tweet 1: LENGTH('Let us Code') = 11 ≤ 15 → Valid ✓
-- Tweet 2: LENGTH('More than fifteen chars are here!') = 33 > 15 → Invalid ✗
