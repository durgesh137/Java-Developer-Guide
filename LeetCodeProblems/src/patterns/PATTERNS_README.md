# Sorting Patterns Library

A comprehensive guide to common patterns used in solving LeetCode sorting problems.

**Quick Links:**  
🎯 [Blind 75 Problems](../blind75/BLIND75_README.md) | 📚 [Sorting Module](../../../Sorting-README.md) | 💡 [Problem Solutions](../problems/)

---

## Table of Contents

1. [Pattern 001: Two Pointer](#pattern-001-two-pointer)
2. [Pattern 002: Frequency Counting](#pattern-002-frequency-counting)
3. [Pattern 003: Custom Comparator](#pattern-003-custom-comparator)
4. [Pattern 004: Greedy Approach](#pattern-004-greedy-approach)
5. [Pattern 005: Bucket Sort](#pattern-005-bucket-sort)
6. [Pattern 006: Partition](#pattern-006-partition)
7. [Pattern 007: Merge](#pattern-007-merge)
8. [Pattern 008: Binary Search](#pattern-008-binary-search)
9. [Pattern 009: In-Place Transform](#pattern-009-in-place-transform)
10. [Pattern 010: Math Optimization](#pattern-010-math-optimization)

---

## Pattern 001: Two Pointer

### Description
Uses two pointers to traverse the array from different positions or at different speeds.

### When to Use
- ✅ Working with sorted arrays
- ✅ Need to compare elements from both ends
- ✅ Removing duplicates or elements
- ✅ Partitioning arrays
- ✅ Palindrome checking

### Two Variations

#### Variation A: Left-Right Pointer

**Use Case:** Comparing elements from opposite ends

**Template:**
```java
public static void leftRightPattern(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    
    while (left < right) {
        // Process elements at arr[left] and arr[right]
        
        if (/* condition met */) {
            // Found answer or process elements
            break;
        } else if (/* need to move left */) {
            left++;
        } else {
            right--;
        }
    }
}
```

**Example Problems:**
- Problem 001: Merge Sorted Array
- Two Sum in Sorted Array
- Reverse Array
- Palindrome Check

**Sample Implementations:**

See `Pattern001_TwoPointerPattern.java` for complete implementations:

1. **`twoSumSorted()`** - Two Sum in Sorted Array
   - Find two numbers that add up to target
   - Time: O(n), Space: O(1)

2. **`reverseArray()`** - Reverse Array In-Place
   - Swap elements from both ends moving towards center
   - Time: O(n), Space: O(1)

3. **`isPalindrome()`** - Check if String is Palindrome
   - Compare characters from both ends
   - Time: O(n), Space: O(1)

4. **`removeElement()`** - Remove All Instances of Value
   - Left pointer for valid elements, right for scanning
   - Time: O(n), Space: O(1)

#### Variation B: Slow-Fast Pointer

**Use Case:** Removing duplicates, filtering, partitioning

**Template:**
```java
public static int slowFastPattern(int[] arr) {
    int slow = 0; // Points to position for next valid element
    
    for (int fast = 0; fast < arr.length; fast++) {
        if (/* arr[fast] is valid */) {
            arr[slow] = arr[fast];
            slow++;
        }
    }
    
    return slow; // New length of valid portion
}
```

**Example Problems:**
- Remove Duplicates from Sorted Array
- Move Zeros to End
- Remove Element
- Sort Array by Parity

**Sample Implementations:**

See `Pattern001_TwoPointerPattern.java` for complete implementations:

1. **`removeDuplicates()`** - Remove Duplicates from Sorted Array
   - Slow tracks last unique element position
   - Time: O(n), Space: O(1)

2. **`moveZeros()`** - Move All Zeros to End
   - Slow for non-zero position, fast scans array
   - Time: O(n), Space: O(1)

3. **`sortByParity()`** - Sort Array by Parity (Even Before Odd)
   - Slow for even position, swap when even found
   - Time: O(n), Space: O(1)

4. **`findMiddle()`** - Find Middle Element
   - Fast moves 2 steps, slow moves 1 step
   - Time: O(n), Space: O(1)

### Complexity
- **Time:** O(n) - Single pass through array
- **Space:** O(1) - In-place modification

### Full Implementation
See: `Pattern001_TwoPointerPattern.java` - Contains 8 complete working examples with test cases

---

## Pattern 002: Frequency Counting

### Description
Count occurrences of elements using HashMap or array-based counting.

### When to Use
- ✅ Finding duplicates
- ✅ Counting occurrences
- ✅ Finding majority element
- ✅ Checking anagrams
- ✅ First unique character

### Template
```java
public static void frequencyCountPattern(int[] arr) {
    // Option 1: Using HashMap (for any range)
    Map<Integer, Integer> freq = new HashMap<>();
    for (int num : arr) {
        freq.put(num, freq.getOrDefault(num, 0) + 1);
    }
    
    // Option 2: Using Array (for limited range)
    int[] count = new int[101]; // If range is 0-100
    for (int num : arr) {
        count[num]++;
    }
    
    // Process based on frequencies
    for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
        if (entry.getValue() > /* some threshold */) {
            // Element appears frequently
        }
    }
}
```

### Example Problems
- Problem 002: Majority Element
- Contains Duplicate
- Valid Anagram
- Find the Difference

### Sample Implementation

See: `Pattern002_FrequencyCountPattern.majorityElement()` method (To be created)

Example: Find Majority Element (appears > n/2 times)
- Uses HashMap to count frequencies
- Returns element as soon as it exceeds n/2 threshold
- Early termination optimization
- Time: O(n), Space: O(n)

### Complexity
- **Time:** O(n) - Single pass
- **Space:** O(n) for HashMap, O(k) for array (k = range)

---

## Pattern 003: Custom Comparator

### Description
Define custom sorting logic using Comparator interface.

### When to Use
- ✅ Need non-default sorting order
- ✅ Sorting based on multiple criteria
- ✅ Sorting custom objects
- ✅ Complex sorting rules

### Template
```java
public static void customComparatorPattern(int[] arr) {
    // For primitive arrays, convert to Integer[]
    Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
    
    // Define custom comparator
    Arrays.sort(boxed, new Comparator<Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            // Return negative if a should come before b
            // Return positive if b should come before a
            // Return 0 if equal
            
            // Example: Sort by absolute value
            return Math.abs(a) - Math.abs(b);
        }
    });
    
    // Lambda version
    Arrays.sort(boxed, (a, b) -> Math.abs(a) - Math.abs(b));
}
```

### Example Problems
- Sort Array by Increasing Frequency
- Relative Ranks
- Sort Integers by The Number of 1 Bits
- Sort the People

### Sample Implementation

See: `Pattern003_CustomComparatorPattern.frequencySort()` method (To be created)

Example: Sort by frequency, if same frequency then by value
- Step 1: Count frequencies using HashMap
- Step 2: Convert to Integer[] for custom sorting
- Step 3: Sort with custom comparator (frequency first, then value)
- Time: O(n log n), Space: O(n)

### Complexity
- **Time:** O(n log n) - Sorting dominates
- **Space:** O(n) - For boxed array and sorting

---

## Pattern 004: Greedy Approach

### Description
Make locally optimal choice at each step to find global optimum.

### When to Use
- ✅ Activity selection problems
- ✅ Interval scheduling
- ✅ Minimum/maximum with constraints
- ✅ Assignment problems

### Template
```java
public static int greedyPattern(int[] arr) {
    // Step 1: Sort array (usually required)
    Arrays.sort(arr);
    
    // Step 2: Initialize result
    int result = 0;
    
    // Step 3: Iterate and make greedy choice
    for (int i = 0; i < arr.length; i++) {
        if (/* greedy condition met */) {
            // Take this element
            result += arr[i];
        }
    }
    
    return result;
}
```

### Example Problems
- Assign Cookies
- Maximum Units on a Truck
- Minimum Cost of Buying Candies With Discount
- Longest Subsequence With Limited Sum

### Sample Implementation
```java
// Example: Assign Cookies (maximize satisfied children)
public static int assignCookies(int[] children, int[] cookies) {
    Arrays.sort(children);
    Arrays.sort(cookies);
    
    int child = 0, cookie = 0;
    
    while (child < children.length && cookie < cookies.length) {
        if (cookies[cookie] >= children[child]) {
            child++; // Satisfied, move to next child
        }
        cookie++; // Try next cookie
    }
    
    return child; // Number of satisfied children
}
```

### Complexity
- **Time:** O(n log n) - Due to sorting
- **Space:** O(1) - If sorting in-place

---

## Pattern 005: Bucket Sort

### Description
Distribute elements into buckets, then sort within buckets.

### When to Use
- ✅ Limited range of values
- ✅ Uniform distribution expected
- ✅ Need linear time sorting
- ✅ Counting sort scenarios

### Template
```java
public static void bucketSortPattern(int[] arr) {
    // Step 1: Create buckets
    int min = Arrays.stream(arr).min().getAsInt();
    int max = Arrays.stream(arr).max().getAsInt();
    int bucketCount = max - min + 1;
    int[] buckets = new int[bucketCount];
    
    // Step 2: Count elements in each bucket
    for (int num : arr) {
        buckets[num - min]++;
    }
    
    // Step 3: Reconstruct sorted array
    int index = 0;
    for (int i = 0; i < bucketCount; i++) {
        while (buckets[i] > 0) {
            arr[index++] = i + min;
            buckets[i]--;
        }
    }
}
```

### Example Problems
- Relative Sort Array
- Sort Colors (Dutch National Flag)
- Squares of a Sorted Array

### Complexity
- **Time:** O(n + k) where k is range
- **Space:** O(k) for buckets

---

## Pattern 006: Partition

### Description
Rearrange array such that elements are partitioned based on criteria.

### When to Use
- ✅ Separate even/odd elements
- ✅ Partition by sign (positive/negative)
- ✅ Quick select algorithm
- ✅ Dutch National Flag problem

### Template
```java
public static void partitionPattern(int[] arr, int pivot) {
    int left = 0, right = arr.length - 1;
    
    while (left <= right) {
        while (left <= right && /* arr[left] belongs to left partition */) {
            left++;
        }
        while (left <= right && /* arr[right] belongs to right partition */) {
            right--;
        }
        
        if (left < right) {
            // Swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
```

### Example Problems
- Sort Array By Parity
- Sort Array By Parity II
- Partition Array

### Complexity
- **Time:** O(n) - Single pass
- **Space:** O(1) - In-place

---

## Pattern 007: Merge

### Description
Combine two or more sorted sequences into one sorted sequence.

### When to Use
- ✅ Merging sorted arrays
- ✅ Merge sort algorithm
- ✅ K-way merge
- ✅ Merge intervals

### Template
```java
public static int[] mergePattern(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];
    int i = 0, j = 0, k = 0;
    
    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] <= arr2[j]) {
            result[k++] = arr1[i++];
        } else {
            result[k++] = arr2[j++];
        }
    }
    
    // Copy remaining elements
    while (i < arr1.length) result[k++] = arr1[i++];
    while (j < arr2.length) result[k++] = arr2[j++];
    
    return result;
}
```

### Example Problems
- Problem 001: Merge Sorted Array
- Merge Similar Items
- Intersection of Two Arrays

### Complexity
- **Time:** O(n + m) - Linear merge
- **Space:** O(n + m) - Result array

---

## Pattern 008: Binary Search

### Description
Search in sorted array using divide and conquer.

### When to Use
- ✅ Array is sorted
- ✅ Finding target element
- ✅ Finding insertion position
- ✅ Finding boundary conditions

### Template
```java
public static int binarySearchPattern(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2; // Avoid overflow
        
        if (arr[mid] == target) {
            return mid; // Found
        } else if (arr[mid] < target) {
            left = mid + 1; // Search right half
        } else {
            right = mid - 1; // Search left half
        }
    }
    
    return -1; // Not found
}
```

### Example Problems
- Find Target Indices After Sorting Array
- Special Array With X Elements Greater Than or Equal X
- Check If N and Its Double Exist

### Complexity
- **Time:** O(log n) - Halves search space
- **Space:** O(1) - Iterative approach

---

## Pattern 009: In-Place Transform

### Description
Modify array in-place without using extra space.

### When to Use
- ✅ Space constraint O(1)
- ✅ Modifying original array
- ✅ Swapping elements
- ✅ Cyclic replacements

### Template
```java
public static void inPlaceTransformPattern(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        // Transform element at position i
        arr[i] = /* new value based on old value */;
        
        // Or swap with another position
        if (/* swap condition */) {
            int temp = arr[i];
            arr[i] = arr[/* other index */];
            arr[/* other index */] = temp;
        }
    }
}
```

### Example Problems
- Reverse Array
- Rotate Array
- Sort Even and Odd Indices Independently

### Complexity
- **Time:** O(n) - Single pass
- **Space:** O(1) - In-place

---

## Pattern 010: Math Optimization

### Description
Use mathematical formulas to avoid sorting or reduce complexity.

### When to Use
- ✅ Can derive answer mathematically
- ✅ Pattern in numbers
- ✅ Arithmetic/geometric sequences
- ✅ Sum formulas applicable

### Template
```java
public static int mathOptimizationPattern(int[] arr) {
    // Instead of sorting, use math
    
    // Example: Find missing number using sum formula
    int n = arr.length;
    int expectedSum = n * (n + 1) / 2;
    int actualSum = 0;
    
    for (int num : arr) {
        actualSum += num;
    }
    
    return expectedSum - actualSum;
}
```

### Example Problems
- Missing Number
- Average Salary Excluding Min and Max
- Minimum Sum of Four Digit Number After Splitting Digits

### Complexity
- **Time:** O(n) or better - Avoids sorting
- **Space:** O(1) - Usually constant space

---

## Quick Pattern Selection Guide

| Problem Characteristic | Recommended Pattern |
|------------------------|---------------------|
| Sorted array, find pair | Two Pointer (Left-Right) |
| Remove duplicates/elements | Two Pointer (Slow-Fast) |
| Count occurrences | Frequency Counting |
| Custom sorting order | Custom Comparator |
| Maximize/minimize with constraints | Greedy Approach |
| Limited value range | Bucket Sort |
| Separate elements by criteria | Partition |
| Combine sorted sequences | Merge |
| Find element in sorted array | Binary Search |
| Modify without extra space | In-Place Transform |
| Can calculate result | Math Optimization |

---

## Pattern Combination Examples

Many problems use **multiple patterns**:

### Example 1: Sort Array by Increasing Frequency
1. **Frequency Counting** - Count occurrences
2. **Custom Comparator** - Sort by frequency then value

### Example 2: Find Kth Smallest
1. **Bucket Sort** - Count frequencies
2. **Linear Scan** - Find kth element

### Example 3: Merge and Remove Duplicates
1. **Merge** - Combine arrays
2. **Two Pointer** - Remove duplicates

---

## Pattern Implementation Files

- `Pattern001_TwoPointerPattern.java` - Complete implementation with 8 examples
- `Pattern002_FrequencyCountPattern.java` - (To be created)
- `Pattern003_CustomComparatorPattern.java` - (To be created)
- `Pattern004_GreedyApproachPattern.java` - (To be created)
- `Pattern005_BucketSortPattern.java` - (To be created)
- `Pattern006_PartitionPattern.java` - (To be created)
- `Pattern007_MergePattern.java` - (To be created)
- `Pattern008_BinarySearchPattern.java` - (To be created)
- `Pattern009_InPlaceTransformPattern.java` - (To be created)
- `Pattern010_MathOptimizationPattern.java` - (To be created)

---

## How to Use This Guide

1. **Read problem** statement carefully
2. **Identify characteristics** (sorted? duplicates? constraints?)
3. **Check Quick Selection Guide** above
4. **Review pattern template** for that pattern
5. **Adapt template** to your specific problem
6. **Implement solution** using the pattern
7. **Test with examples** from pattern file
8. **Document pattern used** in your solution

---

**Last Updated:** November 30, 2024  
**Problems Solved Using Patterns:** 1 / 94  
**Patterns Fully Documented:** 1 / 10
