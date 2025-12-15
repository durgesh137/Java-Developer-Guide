-- Schema for LeetCode #1683: Invalid Tweets
-- https://leetcode.com/problems/invalid-tweets/

-- Drop table if exists
DROP TABLE IF EXISTS Tweets;

-- Create table
CREATE TABLE Tweets (
    tweet_id INT PRIMARY KEY,
    content VARCHAR(255) NOT NULL
);

-- Insert test data
INSERT INTO Tweets (tweet_id, content) VALUES
(1, 'Let us Code'),                        -- Length 11 (valid)
(2, 'More than fifteen chars are here!');  -- Length 33 (invalid)

-- Verify data
SELECT tweet_id, content, LENGTH(content) as length FROM Tweets;

-- Expected output from solution query:
-- +----------+
-- | tweet_id |
-- +----------+
-- | 2        |
-- +----------+

