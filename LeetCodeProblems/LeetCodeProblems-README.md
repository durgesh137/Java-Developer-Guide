# LeetCodeProblems Module - README

## Overview
This module is part of the **Java Developer Guide** and contains comprehensive LeetCode problem collections including sorting problems, Blind 75 curated interview problems, and pattern libraries. Problems are organized sequentially and by difficulty, with detailed explanations, multiple approaches, and pattern identification to help understand common problem-solving techniques essential for technical interviews and DSA mastery.

## Module Structure

The module is organized into four main packages:

### 📁 **problems/**
Contains all 94 LeetCode sorting problems numbered sequentially (1-94). Each problem includes:
- Problem description and constraints
- Multiple solution approaches (naive, optimized)
- Time and space complexity analysis
- Pattern identification
- Test cases with expected outputs

### 📁 **patterns/**
High-level reusable patterns and techniques used across sorting problems:
- Common sorting algorithms (Quick Sort, Merge Sort, etc.)
- Two-pointer technique patterns
- Frequency counting patterns
- Custom comparator patterns
- Greedy approach patterns
- Mathematical optimization patterns
- In-place transformation patterns

### 📁 **blind75/**
[Blind 75 LeetCode Problems](src/blind75/BLIND75_README.md) - A curated collection of 75 must-do problems for technical interview preparation:
- Essential problems covering all major patterns
- Detailed algorithmic explanations with crisp logic
- Step-by-step walkthroughs with examples
- Pattern recognition and problem-solving strategies
- Optimized O(n) and O(log n) solutions where applicable

### 📁 **samples/**
Helper utilities and sample code:
- Array utility functions
- Common test data generators
- Input/output helpers
- Debugging utilities

## Problems List (94 Total)

### Problems 1-10
1. [88] Merge Sorted Array
2. [169] Majority Element
3. [217] Contains Duplicate
4. [242] Valid Anagram
5. [252] Meeting Rooms (Premium)
6. [268] Missing Number
7. [349] Intersection of Two Arrays
8. [350] Intersection of Two Arrays II
9. [389] Find the Difference
10. [414] Third Maximum Number

### Problems 11-20
11. [455] Assign Cookies
12. [506] Relative Ranks
13. [561] Array Partition
14. [594] Longest Harmonious Subsequence
15. [628] Maximum Product of Three Numbers
16. [645] Set Mismatch
17. [747] Largest Number At Least Twice of Others
18. [888] Fair Candy Swap
19. [905] Sort Array By Parity
20. [922] Sort Array By Parity II

### Problems 21-30
21. [976] Largest Perimeter Triangle
22. [977] Squares of a Sorted Array
23. [1005] Maximize Sum Of Array After K Negations
24. [1030] Matrix Cells in Distance Order
25. [1051] Height Checker
26. [1065] Index Pairs of a String (Premium)
27. [1086] High Five (Premium)
28. [1099] Two Sum Less Than K (Premium)
29. [1122] Relative Sort Array
30. [1133] Largest Unique Number (Premium)

### Problems 31-40
31. [1160] How Many Apples Can You Put into the Basket (Premium)
32. [1200] Minimum Absolute Difference
33. [1331] Rank Transform of an Array
34. [1337] The K Weakest Rows in a Matrix
35. [1346] Check If N and Its Double Exist
36. [1356] Sort Integers by The Number of 1 Bits
37. [1365] How Many Numbers Are Smaller Than the Current Number
38. [1385] Find the Distance Value Between Two Arrays
39. [1403] Minimum Subsequence in Non-Increasing Order
40. [1460] Make Two Arrays Equal by Reversing Subarrays

### Problems 41-50
41. [1464] Maximum Product of Two Elements in an Array
42. [1491] Average Salary Excluding the Minimum and Maximum Salary
43. [1502] Can Make Arithmetic Progression From Sequence
44. [1608] Special Array With X Elements Greater Than or Equal X
45. [1619] Mean of Array After Removing Some Elements
46. [1636] Sort Array by Increasing Frequency
47. [1637] Widest Vertical Area Between Two Points Containing No Points
48. [1710] Maximum Units on a Truck
49. [1859] Sorting the Sentence
50. [1913] Maximum Product Difference Between Two Pairs

### Problems 51-60
51. [1984] Minimum Difference Between Highest and Lowest of K Scores
52. [2037] Minimum Number of Moves to Seat Everyone
53. [2089] Find Target Indices After Sorting Array
54. [2094] Finding 3-Digit Even Numbers
55. [2099] Find Subsequence of Length K With the Largest Sum
56. [2105] Minimum Cost of Buying Candies With Discount
57. [2148] Count Elements With Strictly Smaller and Greater Elements
58. [2154] Keep Multiplying Found Values by Two
59. [2160] Minimum Sum of Four Digit Number After Splitting Digits
60. [2164] Sort Even and Odd Indices Independently

### Problems 61-70
61. [2229] Check if an Array Is Consecutive (Premium)
62. [2231] Largest Number After Digit Swaps by Parity
63. [2248] Intersection of Multiple Arrays
64. [2273] Find Resultant Array After Removing Anagrams
65. [2335] Minimum Amount of Time to Fill Cups
66. [2357] Make Array Zero by Subtracting Equal Amounts
67. [2353] Merge Similar Items
68. [2389] Longest Subsequence With Limited Sum
69. [2418] Sort the People
70. [2441] Largest Positive Integer That Exists With Its Negative

### Problems 71-80
71. [2465] Number of Distinct Averages
72. [2475] Number of Unequal Triplets in Array
73. [2500] Delete Greatest Value in Each Row
74. [2578] Split with Minimum Sum
75. [2706] Buy Two Chocolates
76. [2733] Neither Minimum nor Maximum
77. [2744] Check if Array is Good
78. [2824] Count Pairs Whose Sum is Less than Target
79. [2974] Minimum Number Game
80. [2996] Smallest Missing Integer Greater Than Sequential Prefix Sum

### Problems 81-94
81. [3010] Divide an Array Into Subarrays With Minimum Cost I
82. [3024] Type of Triangle
83. [3074] Apple Redistribution Into Boxes
84. [3194] Minimum Average of Smallest and Largest Elements
85. [3467] Transform Array by Parity
86. [3491] Phone Number Prefix (Premium)
87. [3536] Maximum Product of Two Digits
88. [3545] Minimum Deletions for At Most K Distinct Characters
89. [3606] Coupon Code Validator
90. [3633] Earliest Finish Time for Land and Water Rides I
91. [3667] Sort Array by Absolute Value (Premium)
92. [3684] Maximize Sum of At Most K Distinct Elements
93. [3731] Find Missing Elements
94. [3745] Maximize Expression of Three Elements

## Patterns to be Documented

The following patterns will be identified and documented in the `patterns/` package as problems are solved:

### Core Sorting Patterns
- **Built-in Sort**: When to use Arrays.sort() vs custom implementation
- **Custom Comparators**: Defining custom sorting logic
- **Stable vs Unstable Sorting**: Understanding sorting stability requirements

### Problem-Solving Patterns
- **Two Pointer Technique**: For sorted arrays
- **Frequency Counting**: Using HashMap/array for element counting
- **Greedy Approach**: Making locally optimal choices
- **Mathematical Optimization**: Using formulas to avoid sorting
- **Bucket Sort Pattern**: For limited range problems
- **Partition Pattern**: Segregating elements based on criteria
- **Merge Pattern**: Combining sorted sequences
- **Binary Search on Sorted**: Finding elements efficiently

### Common Techniques
- **In-place Transformations**: Modifying array without extra space
- **Index Manipulation**: Using indices as keys
- **Parity-based Operations**: Even/odd number handling
- **Min-Max Problems**: Finding extreme values efficiently
- **Sliding Window**: For subarray/substring problems
- **Prefix Sum**: For range query optimization

## How to Use This Module

### Solving Problems Sequentially
1. Start with Problem 1 in `problems/` package
2. Understand the problem requirements
3. Identify applicable patterns from `patterns/` package
4. Implement solution(s)
5. Test with provided test cases
6. Document pattern usage and complexity

### Adding Pattern Documentation
When you identify a reusable pattern:
1. Create a new file in `patterns/` package
2. Document the pattern with:
   - Pattern description
   - When to use it
   - Implementation template
   - Example problems using this pattern
   - Time/space complexity implications

### File Naming Convention
- Problems: `Problem001_MergeSortedArray.java` to `Problem094_MaximizeExpression.java`
- Patterns: `TwoPointerPattern.java`, `FrequencyCountPattern.java`, etc.
- Samples: `SortingUtils.java`, `TestDataGenerator.java`, etc.

## Progress Tracking

- **Total Problems**: 94
- **Solved**: 0
- **In Progress**: 0
- **To Do**: 94

*Note: 11 problems require LeetCode Premium subscription*

## How to Run

### From IntelliJ IDEA
1. Navigate to the specific problem file under `src/problems/`
2. Right-click on the file and select "Run 'ProblemXXX.main()'"
3. View output in the console

### From Command Line
```bash
# Compile
javac -d out src/problems/Problem001_MergeSortedArray.java

# Run
java -cp out problems.Problem001_MergeSortedArray
```

## Learning Approach

### Recommended Strategy:
1. **Understand the Problem**: Read carefully, identify constraints
2. **Identify Pattern**: Check if similar to solved problems
3. **Brute Force First**: Implement naive solution if unclear
4. **Optimize**: Look for better time/space complexity
5. **Document Pattern**: Add to patterns package if reusable
6. **Test Thoroughly**: Cover edge cases
7. **Review**: Understand why the solution works

### Tips:
- Don't rush - understand each problem deeply
- Try to solve without looking at solutions first
- If stuck, review similar patterns in `patterns/` package
- Document your learnings for future reference
- Some problems may use multiple patterns

## Contributing

When solving a problem:
1. Follow the established file naming convention
2. Include comprehensive comments and JavaDoc
3. Provide multiple approaches when applicable
4. Add detailed test cases
5. Document time and space complexity
6. Update this README with progress
7. Add any new patterns to the patterns package

## Resources

- LeetCode Sorting Problem List: https://leetcode.com/problem-list/sorting/
- Original problem references in `leetCode_Problems.todo`
- Patterns documentation in `patterns/` package

---

**Module Created**: November 30, 2024  
**Last Updated**: November 30, 2024  
**Status**: Ready for problem solving  
**Target**: Solve all 94 LeetCode sorting problems systematically


## Topic wise
- [LeetCode TopicWise - ProblemSet - README](src/problemset/greedy/medium/Topic-wise-problemset.md)