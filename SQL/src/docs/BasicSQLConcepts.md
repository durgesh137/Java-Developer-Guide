# Basic SQL Concepts

This document covers fundamental SQL concepts used across multiple SQL 50 problems.

---

## 1. SELECT Statement

The `SELECT` statement is used to retrieve data from a database table.

### Syntax
```sql
SELECT column1, column2, ...
FROM table_name;
```

### Examples

**Select specific columns:**
```sql
SELECT product_id, product_name 
FROM Products;
```

**Select all columns:**
```sql
SELECT * 
FROM Products;
```

### Key Points
- SELECT specifies which columns to retrieve
- Use `*` to select all columns
- Column names are comma-separated
- Results form a result set (table)

---

## 2. WHERE Clause

The `WHERE` clause filters rows based on specified conditions.

### Syntax
```sql
SELECT column1, column2, ...
FROM table_name
WHERE condition;
```

### Examples

**Single condition:**
```sql
SELECT product_id 
FROM Products 
WHERE low_fats = 'Y';
```

**Multiple conditions:**
```sql
SELECT product_id 
FROM Products 
WHERE low_fats = 'Y' AND recyclable = 'Y';
```

### Key Points
- WHERE filters rows before they are returned
- Only rows where condition evaluates to TRUE are included
- Condition can use comparison operators: =, !=, <, >, <=, >=
- Can combine multiple conditions with AND/OR

---

## 3. AND Operator

The `AND` operator combines multiple conditions. **ALL** conditions must be TRUE.

### Syntax
```sql
WHERE condition1 AND condition2 AND condition3 ...
```

### Truth Table
```
Condition1 | Condition2 | Result
-----------|------------|-------
TRUE       | TRUE       | TRUE  ✓
TRUE       | FALSE      | FALSE ✗
FALSE      | TRUE       | FALSE ✗
FALSE      | FALSE      | FALSE ✗
```

### Examples

**Two conditions:**
```sql
SELECT product_id 
FROM Products 
WHERE low_fats = 'Y' AND recyclable = 'Y';
-- Returns products that are BOTH low fat AND recyclable
```

**Three conditions:**
```sql
SELECT product_id 
FROM Products 
WHERE low_fats = 'Y' 
  AND recyclable = 'Y' 
  AND price < 10;
-- All three conditions must be TRUE
```

### Key Points
- AND requires ALL conditions to be TRUE
- Evaluated left to right
- Use parentheses for complex conditions: `(A OR B) AND C`
- More conditions = more restrictive filter

---

## 4. OR Operator

The `OR` operator combines multiple conditions. **AT LEAST ONE** condition must be TRUE.

### Syntax
```sql
WHERE condition1 OR condition2 OR condition3 ...
```

### Truth Table
```
Condition1 | Condition2 | Result
-----------|------------|-------
TRUE       | TRUE       | TRUE  ✓
TRUE       | FALSE      | TRUE  ✓
FALSE      | TRUE       | TRUE  ✓
FALSE      | FALSE      | FALSE ✗
```

### Examples

**Two conditions:**
```sql
SELECT product_id 
FROM Products 
WHERE low_fats = 'Y' OR recyclable = 'Y';
-- Returns products that are low fat OR recyclable (or both)
```

**Combined with AND:**
```sql
SELECT product_id 
FROM Products 
WHERE (low_fats = 'Y' OR recyclable = 'Y') 
  AND price < 10;
-- Must satisfy price condition AND at least one of the other two
```

### Key Points
- OR requires AT LEAST ONE condition to be TRUE
- Less restrictive than AND
- Use parentheses when mixing AND/OR

---

## 5. Comparison Operators

Used in WHERE clause conditions to compare values.

### Operators

| Operator | Meaning | Example |
|----------|---------|---------|
| `=` | Equal to | `price = 10` |
| `!=` or `<>` | Not equal to | `status != 'Inactive'` |
| `<` | Less than | `price < 10` |
| `>` | Greater than | `price > 10` |
| `<=` | Less than or equal | `price <= 10` |
| `>=` | Greater than or equal | `price >= 10` |

### Examples

```sql
-- Equal
SELECT * FROM Products WHERE category = 'Electronics';

-- Not equal
SELECT * FROM Products WHERE status != 'Discontinued';

-- Greater than
SELECT * FROM Products WHERE price > 100;

-- Range check
SELECT * FROM Products WHERE price >= 10 AND price <= 50;
```

---

## 6. ENUM Data Type

ENUM is a data type that restricts column values to a predefined list.

### Definition
```sql
CREATE TABLE Products (
    product_id INT,
    low_fats ENUM('Y', 'N'),
    recyclable ENUM('Y', 'N')
);
```

### Key Points
- Stores one value from allowed list
- More efficient than VARCHAR for fixed choices
- Internally stored as integers
- Common for Yes/No, status flags, categories

### Usage in Queries
```sql
-- Compare with string literal
SELECT * FROM Products WHERE low_fats = 'Y';

-- Valid values only
INSERT INTO Products VALUES (1, 'Y', 'N');  -- Valid
INSERT INTO Products VALUES (2, 'Yes', 'N'); -- Invalid (not in ENUM)
```

---

## 7. Common Mistakes to Avoid

### ❌ Mistake 1: Confusing AND with OR
```sql
-- WRONG: Want products that are both low fat AND recyclable
SELECT product_id FROM Products 
WHERE low_fats = 'Y' OR recyclable = 'Y';
-- This returns products that are EITHER low fat OR recyclable

-- CORRECT:
SELECT product_id FROM Products 
WHERE low_fats = 'Y' AND recyclable = 'Y';
```

### ❌ Mistake 2: Wrong comparison syntax
```sql
-- WRONG: Can't compare one column to multiple values this way
WHERE low_fats = 'Y' OR 'N'  -- Syntax error

-- CORRECT:
WHERE low_fats = 'Y' OR low_fats = 'N'
-- Or use IN:
WHERE low_fats IN ('Y', 'N')
```

### ❌ Mistake 3: Comparing with wrong data type
```sql
-- WRONG: ENUM value 'Y', not boolean
WHERE low_fats = TRUE

-- CORRECT:
WHERE low_fats = 'Y'
```

### ❌ Mistake 4: Missing WHERE clause
```sql
-- WRONG: Returns ALL products
SELECT product_id FROM Products;

-- CORRECT: Filter with WHERE
SELECT product_id FROM Products 
WHERE low_fats = 'Y' AND recyclable = 'Y';
```

---

## 8. Performance Considerations

### Indexing
```sql
-- Create index on frequently filtered columns
CREATE INDEX idx_low_fats ON Products(low_fats);
CREATE INDEX idx_recyclable ON Products(recyclable);

-- Composite index for multiple columns
CREATE INDEX idx_product_filters ON Products(low_fats, recyclable);
```

### Time Complexity
- **Full table scan**: O(n) - without indexes
- **With index**: O(log n) - with B-tree indexes
- **Result set**: O(m) - where m is number of matching rows

### Best Practices
- ✅ Create indexes on columns used in WHERE clauses
- ✅ Use specific column names instead of SELECT *
- ✅ Filter early (WHERE before JOIN when possible)
- ✅ Use appropriate data types (ENUM vs VARCHAR)

---

## 9. Query Execution Order

SQL doesn't execute in the order you write it!

### Logical Execution Order
```sql
SELECT product_id           -- 5. Finally, select columns
FROM Products               -- 1. Start with this table
WHERE low_fats = 'Y'        -- 2. Filter rows
  AND recyclable = 'Y'      -- 3. Apply additional filters
ORDER BY product_id         -- 4. Sort results (if specified)
LIMIT 10;                   -- 6. Limit number of rows
```

**Actual execution:**
1. FROM - Identify source table(s)
2. WHERE - Filter rows
3. SELECT - Choose columns
4. ORDER BY - Sort results (if specified)
5. LIMIT - Restrict row count (if specified)

---

## 10. NULL Handling

NULL represents the absence of a value. It's NOT the same as zero, empty string, or false.

### What is NULL?

- **NULL** = Unknown or missing value
- NULL is NOT equal to anything, including NULL itself
- NULL in any arithmetic operation results in NULL
- NULL in any comparison (except IS NULL) results in NULL (not TRUE or FALSE)

### IS NULL and IS NOT NULL

Check if a value is NULL or not NULL.

#### Syntax
```sql
WHERE column IS NULL      -- Check if column is NULL
WHERE column IS NOT NULL  -- Check if column has a value
```

#### Examples

**Find rows with NULL values:**
```sql
SELECT name 
FROM Customer 
WHERE referee_id IS NULL;
-- Returns customers with no referee
```

**Find rows with non-NULL values:**
```sql
SELECT name 
FROM Customer 
WHERE referee_id IS NOT NULL;
-- Returns customers who have a referee
```

**Combined with other conditions:**
```sql
SELECT name 
FROM Customer 
WHERE referee_id IS NULL OR referee_id != 2;
-- Returns customers with no referee OR referred by someone other than customer 2
```

### Key Points About NULL

#### ❌ Common Mistake: Using = NULL
```sql
-- WRONG: This will NOT work
WHERE referee_id = NULL   -- Always evaluates to NULL (not TRUE)

-- CORRECT: Use IS NULL
WHERE referee_id IS NULL  -- Correctly checks for NULL
```

#### NULL in Comparisons

```sql
-- All these evaluate to NULL (not TRUE or FALSE):
NULL = NULL    -- NULL (not TRUE!)
NULL != 5      -- NULL (not TRUE!)
NULL > 0       -- NULL (not TRUE!)
NULL < 10      -- NULL (not TRUE!)

-- Only these work correctly:
referee_id IS NULL      -- TRUE if referee_id is NULL
referee_id IS NOT NULL  -- TRUE if referee_id is not NULL
```

### Truth Table with NULL

```
Expression       | Result
-----------------|-------
TRUE AND NULL    | NULL
FALSE AND NULL   | FALSE
TRUE OR NULL     | TRUE
FALSE OR NULL    | NULL
NOT NULL         | NULL
```

### Examples from Real Problems

#### Problem: Find Customer Referee (#584)
```sql
-- Find customers NOT referred by customer 2
-- Must handle NULL (no referee) separately

-- WRONG: This misses customers with NULL referee_id
SELECT name FROM Customer WHERE referee_id != 2;
-- NULL != 2 evaluates to NULL (not TRUE), so NULL rows are excluded

-- CORRECT: Explicitly include NULL
SELECT name FROM Customer 
WHERE referee_id IS NULL OR referee_id != 2;
-- Now we get customers with NULL AND customers referred by others
```

### NULL in Arithmetic

```sql
-- All result in NULL:
NULL + 5        -- NULL
NULL * 10       -- NULL
NULL / 2        -- NULL
```

### COALESCE Function

Replace NULL with a default value.

```sql
-- Syntax
COALESCE(column, default_value)

-- Example: Replace NULL with 0
SELECT 
    name,
    COALESCE(referee_id, 0) as referee_id_or_zero
FROM Customer;
```

### IFNULL / ISNULL Functions

**MySQL:**
```sql
IFNULL(column, default_value)

SELECT name, IFNULL(referee_id, 'No Referee') 
FROM Customer;
```

**SQL Server:**
```sql
ISNULL(column, default_value)
```

### NULL-Safe Comparison (MySQL)

```sql
-- <=> is NULL-safe equality operator (MySQL only)
SELECT * FROM Customer WHERE referee_id <=> NULL;
-- Same as: WHERE referee_id IS NULL
```

---

## 11. Related Concepts

- **IN operator**: `WHERE column IN (value1, value2, ...)`
- **BETWEEN**: `WHERE column BETWEEN value1 AND value2`
- **LIKE**: `WHERE column LIKE 'pattern%'`
- **IS NULL**: `WHERE column IS NULL`
- **DISTINCT**: `SELECT DISTINCT column FROM table`
- **ORDER BY**: `ORDER BY column ASC/DESC`

---

## Problems Using These Concepts

| Problem | Concepts Used |
|---------|---------------|
| [#1757 Recyclable and Low Fat Products](../problems/easy/RecyclableAndLowFlat.sql) | SELECT, WHERE, AND |
| [#584 Find Customer Referee](../problems/easy/FindCustomerReferee.sql) | SELECT, WHERE, OR, IS NULL |
| [#595 Big Countries](../problems/easy/BigCountries.sql) | SELECT, WHERE, OR, >= |
| [#1148 Article Views I](../problems/easy/ArticleViewsI.sql) | SELECT, WHERE, DISTINCT |

---

**Last Updated**: December 15, 2025  
**Difficulty**: Beginner  

[← Back to SQL 50 Problems](../../SQL50-README.md)

