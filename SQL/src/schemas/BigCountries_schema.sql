-- Schema for LeetCode #595: Big Countries
-- https://leetcode.com/problems/big-countries/

-- Drop table if exists
DROP TABLE IF EXISTS World;

-- Create table
CREATE TABLE World (
    name VARCHAR(50) PRIMARY KEY,
    continent VARCHAR(50) NOT NULL,
    area INT NOT NULL,
    population INT NOT NULL,
    gdp BIGINT NOT NULL
);

-- Insert test data
INSERT INTO World (name, continent, area, population, gdp) VALUES
('Afghanistan', 'Asia', 652230, 25500100, 20343000000),
('Albania', 'Europe', 28748, 2831741, 12960000000),
('Algeria', 'Africa', 2381741, 37100000, 188681000000),
('Andorra', 'Europe', 468, 78115, 3712000000),
('Angola', 'Africa', 1246700, 20609294, 100990000000);

-- Verify data
SELECT * FROM World;

-- Expected output from solution query:
-- +-------------+------------+---------+
-- | name        | population | area    |
-- +-------------+------------+---------+
-- | Afghanistan | 25500100   | 652230  |
-- | Algeria     | 37100000   | 2381741 |
-- +-------------+------------+---------+

