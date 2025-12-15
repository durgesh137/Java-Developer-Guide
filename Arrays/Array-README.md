# Arrays Module - README

## Overview
This module is part of the **Java Developer Guide** and focuses on comprehensive coverage of array manipulation, searching, and algorithmic problems in Java. It is organized into different levels based on problem complexity, from basic operations to advanced algorithms, providing a solid foundation in Data Structures and Algorithms.

## Problems covered so far

### Basic Array Operations

1. **Reverse an Array**
   - Description: Reverse the elements of an array in-place using two-pointer approach
   - Implementation: `problems.Reverse.java`
   - Example: Input `[1, 2, 3, 4, 5]` → Output `[5, 4, 3, 2, 1]`
   - Time Complexity: O(n)
   - Space Complexity: O(1)

2. **Find Frequency of Element**
   - Description: Count the number of occurrences of a specific element in an array
   - Implementation: `problems.FrequencyOfElement.java`
   - Example: Input `[1, 2, 3, 1, 1, 2, 2, 3]`, Element `2` → Output `3`
   - Time Complexity: O(n)
   - Space Complexity: O(1)

3. **Find Minimum and Maximum Element**
   - Description: Find both minimum and maximum elements in a single traversal
   - Implementation: `problems.MinMaxElementInArray.java`
   - Example: Input `[1, 345, 234, 21, 56789]` → Min: `1`, Max: `56789`
   - Time Complexity: O(n)
   - Space Complexity: O(1)

### Array Rearrangement Problems

4. **Move All Negatives to End**
   - Description: Place all negative elements at the end while maintaining the relative order of positive and negative elements
   - Implementation: `problems.MoveAllNegativesToEnd.java`
   - Example: Input `[1, -1, 3, 2, -7, -5, 11, 6]` → Output `[1, 3, 2, 11, 6, -1, -7, -5]`
   - Time Complexity: O(n)
   - Space Complexity: O(n)

### Searching Problems

5. **Find Peak Element**
   - Description: An element is a peak if it's not smaller than its adjacent elements. Find the index of any peak element
   - Implementation: `problems.PeakElement.java`
   - Example: Input `[1, 2, 3]` → Output `2` (index of element `3`)
   - Time Complexity: O(n)
   - Space Complexity: O(1)

6. **Subarray with Given Sum**
   - Description: Find a continuous subarray which adds to a given sum (array contains only non-negative integers)
   - Implementation: `problems.SubArrayWithGivenSum.java`
   - Example: Input `[1, 2, 3, 7, 5]`, Sum `12` → Output `[2, 4]` (subarray from index 2 to 4)
   - Time Complexity: O(n)
   - Space Complexity: O(1)

### Level 2 - Advanced Problems

7. **Find Missing Number**
   - Description: Given an array of size N-1 with integers in range [1, N], all distinct. Find the missing number
   - Implementation: `problems.level2.FindMissingNumber.java`
   - Example: Input `[1, 2, 4, 5, 6]`, N=6 → Output `3`
   - Approach: Using sum formula - Sum of N numbers minus sum of array elements
   - Time Complexity: O(n)
   - Space Complexity: O(1)

8. **Largest Sum Contiguous Subarray (Kadane's Algorithm)**
   - Description: Find the sum of the contiguous subarray with the largest sum
   - Implementation: `problems.level2.LargestSumContiguousSubArray.java`
   - Example: Input `[-2, -3, 4, -1, -2, 1, 5, -3]` → Output `7` (subarray `[4, -1, -2, 1, 5]`)
   - Algorithm: Kadane's Algorithm
   - Time Complexity: O(n)
   - Space Complexity: O(1)

9. **Rotate Array**
   - Description: Rotate the array clockwise (cyclic) or anticlockwise by one position
   - Implementation: `problems.level2.RotateArray.java`
   - Example (Clockwise): Input `[1, 2, 3, 4, 5]` → Output `[5, 1, 2, 3, 4]`
   - Example (Anticlockwise): Input `[10, 20, 30, 40, 50]` → Output `[20, 30, 40, 50, 10]`
   - Time Complexity: O(n)
   - Space Complexity: O(1)

### Sorting Algorithms

10. **Bubble Sort**
    - Description: Sort array using bubble sort algorithm (comparison-based sorting)
    - Implementation: `sorting.BubbleSort.java`
    - Example: Input `[5, 4, 3, 2, 1]` → Output `[1, 2, 3, 4, 5]`
    - Time Complexity: O(n²) worst/average, O(n) best case
    - Space Complexity: O(1)

11. **Selection Sort**
    - Description: Sort array using selection sort algorithm (finds minimum element and places it at the beginning)
    - Implementation: `sorting.SelectionSort.java`
    - Example: Input `[5, 4, 3, 2, 1]` → Output `[1, 2, 3, 4, 5]`
    - Time Complexity: O(n²)
    - Space Complexity: O(1)


## How to Run

### From IntelliJ IDEA
1. Navigate to the specific problem file under `src/problems/` or `src/sorting/`
2. Right-click on the file and select "Run 'ClassName.main()'"
3. View output in the console

### From Command Line
```bash
# Compile
javac -d out src/problems/ClassName.java

# Run
java -cp out problems.ClassName

# For sorting algorithms
javac -d out src/sorting/ClassName.java
java -cp out sorting.ClassName
```

## Project Structure
```
Arrays/
├── Array-README.md
├── Arrays.iml
└── src/
    ├── problems/              # Core array problems
    │   ├── FrequencyOfElement.java
    │   ├── MinMaxElementInArray.java
    │   ├── MoveAllNegativesToEnd.java
    │   ├── PeakElement.java
    │   ├── Reverse.java
    │   ├── SubArrayWithGivenSum.java
    │   └── level2/            # Advanced array problems
    │       ├── FindMissingNumber.java
    │       ├── LargestSumContiguousSubArray.java
    │       └── RotateArray.java
    ├── sorting/               # Sorting algorithms
    │   ├── BubbleSort.java
    │   └── SelectionSort.java
    └── samples/
        └── ArraySamples.java  # Helper utility methods
```

## Package Organization

- **`problems`** - Basic array manipulation problems (frequency, min/max, reverse, peak element, rearrangement, subarray problems)
- **`problems.level2`** - Advanced problems requiring algorithmic thinking (Kadane's algorithm, mathematical approach, rotation)
- **`sorting`** - Various sorting algorithm implementations (Bubble Sort, Selection Sort, and more to come)
- **`samples`** - Utility helper methods for array operations (random array generation, printing, etc.)

## Key Algorithms & Techniques

### Techniques Used:
- **Two Pointer Approach** - Array reversal, rearrangement
- **Sliding Window** - Subarray with given sum
- **Mathematical Approach** - Finding missing number using sum formula
- **Kadane's Algorithm** - Maximum subarray sum
- **Comparison-based Sorting** - Bubble sort, Selection sort

### Problem Categories:
- **Basic Operations**: Reverse, frequency, min/max
- **Rearrangement**: Move negatives, rotate array
- **Searching**: Peak element, subarray sum, missing number
- **Optimization**: Kadane's algorithm for maximum sum
- **Sorting**: Bubble sort, selection sort

## Coming Soon

### Planned Problems:
- Merge two sorted arrays
- Find duplicates in array
- Array rotation by K positions
- Leaders in an array
- Stock buy and sell problem
- Trapping rain water
- Majority element
- Longest consecutive subsequence

### Planned Sorting Algorithms:
- Insertion Sort
- Merge Sort
- Quick Sort
- Heap Sort
- Counting Sort
- Radix Sort

## Contributing
When adding new problems:
1. Create a new Java file in `src/problems/` or `src/problems/level2/` based on difficulty
2. Include problem description, examples, and complexity analysis in comments
3. Implement multiple approaches when applicable (naive and optimized)
4. Add test cases in the main method
5. Update this README with proper documentation including:
   - Problem description
   - Implementation file path
   - Example with input/output
   - Time and space complexity
   - Algorithm/technique used (if applicable)

## Notes
- All problems include detailed comments explaining the approach
- Test cases are provided in main methods for verification
- Helper utility methods are available in `samples.ArraySamples` class
- Problems are organized by difficulty: basic problems in `problems/` package, advanced in `problems.level2/`



