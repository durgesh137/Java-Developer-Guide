-- Schema for LeetCode #1148: Article Views I
-- https://leetcode.com/problems/article-views-i/

-- Drop table if exists
DROP TABLE IF EXISTS Views;

-- Create table
CREATE TABLE Views (
    article_id INT NOT NULL,
    author_id INT NOT NULL,
    viewer_id INT NOT NULL,
    view_date DATE NOT NULL
);
-- Note: No primary key - table can have duplicate rows

-- Insert test data
INSERT INTO Views (article_id, author_id, viewer_id, view_date) VALUES
(1, 3, 5, '2019-08-01'),
(1, 3, 6, '2019-08-02'),
(2, 7, 7, '2019-08-01'),   -- Author 7 views own article
(2, 7, 6, '2019-08-02'),
(4, 7, 1, '2019-07-22'),
(3, 4, 4, '2019-07-21'),   -- Author 4 views own article
(3, 4, 4, '2019-07-21');   -- Author 4 views own article (duplicate)

-- Verify data
SELECT * FROM Views ORDER BY article_id, author_id, viewer_id;

-- Expected output from solution query:
-- +------+
-- | id   |
-- +------+
-- | 4    |
-- | 7    |
-- +------+

