# SQL Module - README

## Overview
This module is part of the **Java Developer Guide** and focuses on mastering SQL through LeetCode's curated **SQL 50** problems. This collection covers all essential SQL concepts from basic queries to advanced window functions, providing a solid foundation for database management and backend development.

## 📚 About LeetCode SQL 50

The **SQL 50** is a carefully curated list of SQL problems covering:
- Basic SELECT queries
- JOINs (INNER, LEFT, RIGHT, FULL)
- Aggregation functions (COUNT, SUM, AVG, MAX, MIN)
- GROUP BY and HAVING clauses
- Subqueries and CTEs (Common Table Expressions)
- Window Functions (ROW_NUMBER, RANK, DENSE_RANK)
- String and Date manipulation
- Advanced query optimization

## 📂 Module Structure

```
SQL/
├── SQL-README.md                    # This file
├── src/
│   ├── problems/
│   │   ├── easy/                    # Basic queries, simple JOINs
│   │   ├── medium/                  # Complex JOINs, subqueries, aggregations
│   │   └── hard/                    # Window functions, CTEs, advanced queries
│   ├── schemas/                     # Database schema definitions
│   └── docs/                        # Detailed problem explanations and concepts
```

## 🎯 SQL 50 Problems List

### Easy Problems (1-20)

| # | Problem | Topics | Status |
|---|---------|--------|--------|
| 1 | [[1757] Recyclable and Low Fat Products](src/problems/easy/RecyclableAndLowFlat.sql) | SELECT, WHERE, AND → [Basic SQL Concepts](src/docs/BasicSQLConcepts.md) | ✅ |
| 2 | [584] Find Customer Referee | SELECT, WHERE, NULL | 🔜 |
| 3 | [595] Big Countries | SELECT, WHERE, OR | 🔜 |
| 4 | [1148] Article Views I | SELECT, DISTINCT | 🔜 |
| 5 | [1683] Invalid Tweets | SELECT, LENGTH | 🔜 |
| 6 | [1378] Replace Employee ID | SELECT, JOIN | 🔜 |
| 7 | [1068] Product Sales Analysis I | SELECT, JOIN | 🔜 |
| 8 | [1581] Customer Who Visited | LEFT JOIN, COUNT | 🔜 |
| 9 | [197] Rising Temperature | SELF JOIN, DATE | 🔜 |
| 10 | [1661] Average Time of Process | JOIN, AVG | 🔜 |
| 11 | [577] Employee Bonus | LEFT JOIN, NULL | 🔜 |
| 12 | [1280] Students and Examinations | CROSS JOIN, LEFT JOIN | 🔜 |
| 13 | [570] Managers with 5+ Reports | GROUP BY, HAVING | 🔜 |
| 14 | [1934] Confirmation Rate | JOIN, ROUND, AVG | 🔜 |
| 15 | [620] Not Boring Movies | SELECT, WHERE, MOD | 🔜 |
| 16 | [1251] Average Selling Price | JOIN, SUM, ROUND | 🔜 |
| 17 | [1075] Project Employees I | JOIN, AVG, ROUND | 🔜 |
| 18 | [1633] Percentage of Users | COUNT, ROUND | 🔜 |
| 19 | [1211] Queries Quality and Percentage | AVG, CASE, ROUND | 🔜 |
| 20 | [1193] Monthly Transactions I | GROUP BY, DATE, SUM | 🔜 |

### Medium Problems (21-40)

| # | Problem | Topics | Status |
|---|---------|--------|--------|
| 21 | [1174] Immediate Food Delivery II | Subquery, DATE | 🔜 |
| 22 | [550] Game Play Analysis IV | Window Function, LAG | 🔜 |
| 23 | [2356] Number of Unique Subjects | COUNT DISTINCT, GROUP BY | 🔜 |
| 24 | [1141] User Activity Past 30 Days | WHERE, DATE, COUNT DISTINCT | 🔜 |
| 25 | [1070] Product Sales Analysis III | Window Function, FIRST_VALUE | 🔜 |
| 26 | [596] Classes More Than 5 Students | GROUP BY, HAVING | 🔜 |
| 27 | [1729] Find Followers Count | GROUP BY, COUNT | 🔜 |
| 28 | [619] Biggest Single Number | MAX, SUBQUERY | 🔜 |
| 29 | [1045] Customers Who Bought All | GROUP BY, HAVING, COUNT | 🔜 |
| 30 | [1731] Number of Employees | SELF JOIN, COUNT | 🔜 |
| 31 | [1789] Primary Department | CASE, GROUP BY | 🔜 |
| 32 | [610] Triangle Judgement | CASE, LOGIC | 🔜 |
| 33 | [180] Consecutive Numbers | WINDOW FUNCTION, LAG/LEAD | 🔜 |
| 34 | [1164] Product Price at Given Date | SUBQUERY, DATE | 🔜 |
| 35 | [1204] Last Person to Fit | Window Function, SUM | 🔜 |
| 36 | [1907] Count Salary Categories | CASE, COUNT, UNION | 🔜 |
| 37 | [1978] Employees Whose Manager Left | LEFT JOIN, NULL | 🔜 |
| 38 | [626] Exchange Seats | CASE, MOD, MAX | 🔜 |
| 39 | [1341] Movie Rating | UNION, SUBQUERY, ORDER BY | 🔜 |
| 40 | [1321] Restaurant Growth | Window Function, SUM OVER | 🔜 |

### Hard Problems (41-50)

| # | Problem | Topics | Status |
|---|---------|--------|--------|
| 41 | [602] Friend Requests II | GROUP BY, UNION | 🔜 |
| 42 | [585] Investments in 2016 | Window Function, HAVING | 🔜 |
| 43 | [185] Department Top Three Salaries | Window Function, DENSE_RANK | 🔜 |
| 44 | [1667] Fix Names in a Table | CONCAT, UPPER, LOWER | 🔜 |
| 45 | [1527] Patients With a Condition | LIKE, REGEX | 🔜 |
| 46 | [196] Delete Duplicate Emails | DELETE, SELF JOIN | 🔜 |
| 47 | [176] Second Highest Salary | SUBQUERY, LIMIT, OFFSET | 🔜 |
| 48 | [1484] Group Sold Products By Date | GROUP BY, GROUP_CONCAT | 🔜 |
| 49 | [1327] List Products Ordered | JOIN, GROUP BY, HAVING | 🔜 |
| 50 | [1517] Find Users With Valid Emails | REGEX, LIKE | 🔜 |

## 🚀 Getting Started

### Prerequisites
- **Database**: MySQL 8.0+ (recommended) or PostgreSQL
- **SQL Client**: MySQL Workbench, pgAdmin, DBeaver, or any SQL IDE
- **Optional**: Docker for isolated database environment

### Setting Up Test Environment

#### Option 1: Using MySQL Locally
```bash
# Install MySQL (macOS)
brew install mysql
brew services start mysql

# Create database
mysql -u root -p
CREATE DATABASE leetcode_sql50;
USE leetcode_sql50;
```

#### Option 2: Using Docker
```bash
# Run MySQL in Docker
docker run --name mysql-sql50 \
  -e MYSQL_ROOT_PASSWORD=password \
  -e MYSQL_DATABASE=leetcode_sql50 \
  -p 3306:3306 \
  -d mysql:8.0

# Connect to database
docker exec -it mysql-sql50 mysql -u root -p
```

### Running SQL Problems

1. **Load Schema**: Execute schema file for the problem
   ```bash
   mysql -u root -p leetcode_sql50 < src/schemas/RecyclableAndLowFatProducts_schema.sql
   ```

2. **Run Solution**: Execute your SQL query
   ```bash
   mysql -u root -p leetcode_sql50 < src/problems/easy/RecyclableAndLowFatProducts.sql
   ```

3. **Verify Output**: Compare with expected results in docs

## 📖 Problem Format

Each problem follows this structure:

### SQL File (`RecyclableAndLowFatProducts.sql`)
```sql
-- Problem: Recyclable and Low Fat Products
-- Difficulty: Easy
-- Topics: SELECT, WHERE
-- LeetCode: #1757

-- Write your MySQL query statement below
SELECT product_id
FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y';
```

### Documentation File (`docs/RecyclableAndLowFatProducts_README.md`)
- Problem statement
- Schema definition
- Input/Output examples
- Solution explanation
- Key concepts
- Time/Space complexity

### Schema File (`schemas/RecyclableAndLowFatProducts_schema.sql`)
- Table definitions
- Sample data insertion
- Test case setup

## 📚 SQL Topics Covered

### 1. **Basic Queries** (Problems 1-5)
- SELECT, WHERE, AND, OR
- String functions (LENGTH, CONCAT)
- DISTINCT, ORDER BY, LIMIT

### 2. **JOINs** (Problems 6-14)
- INNER JOIN
- LEFT JOIN, RIGHT JOIN
- SELF JOIN
- CROSS JOIN

### 3. **Aggregation** (Problems 15-20)
- COUNT, SUM, AVG, MAX, MIN
- GROUP BY, HAVING
- ROUND, DATE functions

### 4. **Subqueries** (Problems 21-30)
- Scalar subqueries
- Correlated subqueries
- IN, EXISTS, NOT IN

### 5. **Window Functions** (Problems 31-40)
- ROW_NUMBER(), RANK(), DENSE_RANK()
- LAG(), LEAD()
- SUM() OVER, AVG() OVER
- PARTITION BY

### 6. **Advanced Topics** (Problems 41-50)
- CTEs (Common Table Expressions)
- UNION, UNION ALL
- CASE statements
- String manipulation (REGEX, LIKE)
- Data modification (DELETE, UPDATE)

## 🎯 Learning Path

### Phase 1: Foundation (Problems 1-10)
**Goal**: Master basic SQL syntax
- Simple SELECT queries
- WHERE clause conditions
- Basic JOINs

### Phase 2: Intermediate (Problems 11-30)
**Goal**: Understand aggregation and grouping
- GROUP BY and HAVING
- Aggregate functions
- Subqueries

### Phase 3: Advanced (Problems 31-50)
**Goal**: Master complex queries
- Window functions
- CTEs
- Query optimization
- Advanced string/date manipulation

## 💡 Best Practices

1. **Write Clean SQL**
   - Use meaningful aliases
   - Indent for readability
   - Comment complex logic

2. **Optimize Queries**
   - Avoid SELECT *
   - Use indexes wisely
   - Minimize subqueries when possible

3. **Test Thoroughly**
   - Test with edge cases
   - Verify NULL handling
   - Check performance with large datasets

## 🔗 Additional Resources

- [LeetCode SQL Study Plan](https://leetcode.com/studyplan/top-sql-50/)
- [MySQL Documentation](https://dev.mysql.com/doc/)
- [PostgreSQL Documentation](https://www.postgresql.org/docs/)
- [SQL Tutorial - W3Schools](https://www.w3schools.com/sql/)
- [SQL Performance Explained](https://use-the-index-luke.com/)

## 📊 Progress Tracking

| Difficulty | Total | Completed | Percentage |
|------------|-------|-----------|------------|
| Easy       | 20    | 0         | 0%         |
| Medium     | 20    | 0         | 0%         |
| Hard       | 10    | 0         | 0%         |
| **Total**  | **50**| **0**     | **0%**     |

## 🎓 What You'll Learn

By completing SQL 50, you will:
- ✅ Master fundamental SQL operations
- ✅ Understand database relationships and JOINs
- ✅ Write efficient aggregation queries
- ✅ Use advanced features like window functions
- ✅ Optimize query performance
- ✅ Prepare for SQL technical interviews
- ✅ Build foundation for Spring Data JPA and Hibernate

## 📚 Concept Documentation

Core SQL concepts are documented in reusable concept files:

- **[Basic SQL Concepts](src/docs/BasicSQLConcepts.md)** - SELECT, WHERE, AND, OR, Comparison Operators
- More concept files will be added as we solve more problems

## 📝 Notes

- Solutions are written for **MySQL 8.0** syntax
- PostgreSQL alternatives provided where syntax differs
- Focus on understanding concepts, not just solving problems
- Practice writing queries before looking at solutions
- Concepts are documented in generic files and linked from problems

---

**Module Status**: 🚀 In Progress  
**Last Updated**: December 15, 2025  
**Total Problems**: 50  
**Completion**: 1/50 (2%)

---

[← Back to Main README](../README.md)

