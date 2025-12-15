-- LeetCode #1148: Article Views I
-- Difficulty: Easy
-- Topics: SELECT, WHERE, DISTINCT, ORDER BY, Column Alias
-- https://leetcode.com/problems/article-views-i/

-- Problem:
-- Find all the authors that viewed at least one of their own articles.
-- Return the result table sorted by id in ascending order.
-- Note: author_id = viewer_id indicates the author viewed their own article.

-- Concepts Used:
-- - SELECT statement (Basic SQL Concepts)
-- - WHERE clause (Basic SQL Concepts)
-- - DISTINCT keyword (Basic SQL Concepts)
-- - ORDER BY clause (Basic SQL Concepts)
-- - Column aliases (AS) (Basic SQL Concepts)
-- See: /SQL/src/docs/BasicSQLConcepts.md

-- Solution:
SELECT DISTINCT author_id AS id
FROM Views
WHERE author_id = viewer_id
ORDER BY id;

-- Explanation:
-- 1. SELECT DISTINCT author_id: Get unique author IDs (removes duplicates)
-- 2. AS id: Rename the column to 'id' in the result
-- 3. FROM Views: Query the Views table
-- 4. WHERE author_id = viewer_id: Filter rows where author viewed their own article
-- 5. ORDER BY id: Sort results in ascending order by id

-- Key Insights:
-- 1. DISTINCT is crucial - authors can view their own articles multiple times
-- 2. Without DISTINCT, author 4 would appear twice (rows 6 and 7)
-- 3. ORDER BY ensures results are sorted as required
-- 4. Column alias (AS id) renames author_id to match expected output

-- Performance:
-- Time Complexity: O(n log n) - WHERE scan O(n) + sorting O(n log n)
-- Space Complexity: O(k) - where k is number of distinct authors
-- Runtime: 401ms (LeetCode submission)

-- Test Case:
-- Input:
-- +------------+-----------+-----------+------------+
-- | article_id | author_id | viewer_id | view_date  |
-- +------------+-----------+-----------+------------+
-- | 1          | 3         | 5         | 2019-08-01 |
-- | 1          | 3         | 6         | 2019-08-02 |
-- | 2          | 7         | 7         | 2019-08-01 |  ← author 7 views own
-- | 2          | 7         | 6         | 2019-08-02 |
-- | 4          | 7         | 1         | 2019-07-22 |
-- | 3          | 4         | 4         | 2019-07-21 |  ← author 4 views own
-- | 3          | 4         | 4         | 2019-07-21 |  ← author 4 views own (duplicate!)
-- +------------+-----------+-----------+------------+
-- Output:
-- +------+
-- | id   |
-- +------+
-- | 4    |
-- | 7    |
-- +------+
-- Explanation:
-- Row 3: author 7 = viewer 7 ✓
-- Row 6 & 7: author 4 = viewer 4 ✓ (DISTINCT removes duplicate)
-- Other rows: author ≠ viewer ✗
