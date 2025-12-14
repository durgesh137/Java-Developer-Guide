# Problem 3: Longest Substring Without Repeating Characters

[← Back to Blind 75 Problems](../BLIND75_README.md)

---

## Problem Statement

**LeetCode Problem #3** - [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

Given a string `s`, find the length of the **longest substring** without repeating characters.

**Constraints:**
- `0 <= s.length <= 5 * 10^4`
- `s` consists of English letters, digits, symbols and spaces

---

## Examples

### Example 1:
```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```

### Example 2:
```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

### Example 3:
```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

### Example 4:
```
Input: s = ""
Output: 0
Explanation: Empty string has no characters.
```

---

## Algorithm: Sliding Window with Character Index Array

### Core Idea
Use **sliding window** technique with an **array to track last seen position** of each character. The window expands when no duplicates are found and contracts when a duplicate is detected.

### Key Insight
Instead of using a HashMap, use an `int[128]` array where the character's ASCII value serves as the index. This provides O(1) lookup with minimal space overhead.

**📚 Concept:** This technique leverages the fact that `char` is a numeric type in Java. See detailed explanation: [char as Array Index](../concepts/char_as_array_index_explained.md)

### Step-by-Step Algorithm

1. **Initialize Variables:**
   - `maxLength = 0` (stores the maximum substring length found)
   - `start = 0` (left pointer of the sliding window)
   - `index[128]` (stores the last seen position + 1 for each character)

2. **Iterate with Right Pointer (`end`):** For each character at position `end`:
   - Get `currentChar = s.charAt(end)`
   - Check if character was seen: `start = max(index[currentChar], start)`
   - Calculate current window length: `end - start + 1`
   - Update `maxLength` if current window is longer
   - Store next valid position: `index[currentChar] = end + 1`

3. **Return Result:** Return `maxLength`

---

## Pseudocode

```
function lengthOfLongestSubstring(s):
    maxLength = 0
    start = 0
    index = new int[128]  // All initialized to 0
    
    for end from 0 to s.length - 1:
        currentChar = s[end]
        
        // Move start if character was seen in current window
        start = max(index[currentChar], start)
        
        // Update max length
        maxLength = max(maxLength, end - start + 1)
        
        // Store position for next occurrence
        index[currentChar] = end + 1
    
    return maxLength
```

---

## Complexity Analysis

### Time Complexity: **O(n)**
- Single pass through the string: O(n)
- Array operations (read/write): O(1)
- Overall: **O(n)**

### Space Complexity: **O(1)**
- Fixed size array `int[128]`: constant space
- Not dependent on input size
- **O(1)** constant space

---

## Walkthrough Example

**Input:** `s = "abcabcbb"`

**Execution:**

| end | char | ASCII | start (before) | index[char] | start (after) | window | length | maxLength |
|-----|------|-------|----------------|-------------|---------------|--------|--------|-----------|
| 0   | 'a'  | 97    | 0              | 0           | 0             | "a"    | 1      | **1**     |
| 1   | 'b'  | 98    | 0              | 0           | 0             | "ab"   | 2      | **2**     |
| 2   | 'c'  | 99    | 0              | 0           | 0             | "abc"  | 3      | **3**     |
| 3   | 'a'  | 97    | 0              | 1           | **1**         | "bca"  | 3      | 3         |
| 4   | 'b'  | 98    | 1              | 2           | **2**         | "cab"  | 3      | 3         |
| 5   | 'c'  | 99    | 2              | 3           | **3**         | "abc"  | 3      | 3         |
| 6   | 'b'  | 98    | 3              | 5           | **5**         | "b"    | 2      | 3         |
| 7   | 'b'  | 98    | 5              | 7           | **7**         | "b"    | 1      | 3         |

**After each iteration, we store:** `index[currentChar] = end + 1`

**Output:** `3` (substrings "abc", "bca", "cab" all have length 3)

---

## Why This Works

1. **Sliding Window Efficiency:** The window dynamically adjusts without nested loops, ensuring single-pass O(n) time

2. **Array vs HashMap:** Using `int[128]` is faster than `HashMap<Character, Integer>` because:
   - No hashing overhead
   - Direct array access via ASCII value
   - Better cache locality

3. **Handles All Cases:**
   - Empty strings (returns 0)
   - Single character (returns 1)
   - All unique characters (returns length)
   - All duplicate characters (returns 1)
   - Mixed duplicates (finds longest valid window)

4. **Why store `end + 1`?** 
   - When we see a duplicate, we want to start **after** its last occurrence
   - Storing `end + 1` allows direct assignment: `start = max(index[char], start)`

---

## Detailed Concept Explanation

### Understanding `index[currentChar]`

```java
char currentChar = 'a';  // ASCII value is 97
index[currentChar] = 5;  // Equivalent to: index[97] = 5
```

This works because Java automatically converts `char` to its integer ASCII value when used as an array index.

**For complete explanation with examples, see:** [char as Array Index Concept](../concepts/char_as_array_index_explained.md)

---

## Alternative Approaches

### Approach 1: HashMap + Sliding Window
```java
Map<Character, Integer> map = new HashMap<>();
// Similar logic but using map.get() and map.put()
```
- **Time:** O(n) ✓
- **Space:** O(min(n, charset)) 
- **Overhead:** HashMap operations are slower than array access

### Approach 2: Brute Force (Not Optimal)
```java
// Check every possible substring
for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {
        if (hasNoRepeats(s.substring(i, j+1))) {
            maxLength = max(maxLength, j - i + 1);
        }
    }
}
```
- **Time:** O(n³) ❌ (Too slow)
- **Space:** O(min(n, charset))

### Approach 3: Set + Sliding Window
```java
Set<Character> set = new HashSet<>();
// Remove characters from left until no duplicate
```
- **Time:** O(2n) = O(n) ✓ (but slower in practice)
- **Space:** O(min(n, charset))

**Optimal:** Array-based sliding window (current implementation) ✓

---

## Edge Cases Handled

✅ **Empty string:** `s = ""` → `0`  
✅ **Single character:** `s = "a"` → `1`  
✅ **All unique:** `s = "abcdef"` → `6`  
✅ **All same:** `s = "aaaaa"` → `1`  
✅ **Duplicates at start:** `s = "aab"` → `2` ("ab")  
✅ **Duplicates at end:** `s = "abc"` → `3` ("abc")  
✅ **Complex pattern:** `s = "dvdf"` → `3` ("vdf")  
✅ **Special characters:** `s = "a b!c"` → Works for all ASCII  

---

## Code Implementation

See: [`LongestSubstringWithoutRepeatingChars.java`](../LongestSubstringWithoutRepeatingChars.java)

**Key Method:**
```java
public static int lengthOfLongestSubstring(String s) {
    int maxLength = 0;
    int start = 0;
    int[] index = new int[128];  // ASCII character tracking
    
    for (int end = 0; end < s.length(); end++) {
        char currentChar = s.charAt(end);
        start = Math.max(index[currentChar], start);
        maxLength = Math.max(maxLength, end - start + 1);
        index[currentChar] = end + 1;
    }
    return maxLength;
}
```

---

## Related Problems

- **76. Minimum Window Substring** (Harder sliding window)
- **159. Longest Substring with At Most Two Distinct Characters** (Similar technique)
- **340. Longest Substring with At Most K Distinct Characters** (Extension)
- **438. Find All Anagrams in a String** (Sliding window with frequency)
- **567. Permutation in String** (Similar window technique)

---

## Pattern Recognition

**Pattern:** Sliding Window with Character Tracking

**When to use:**
- Finding longest/shortest substring with certain properties
- Contiguous sequence problems
- Need to track character occurrences

**Related Patterns:**
- [Sliding Window Pattern](../../patterns/PATTERNS_README.md)
- [Two Pointer Technique](../../patterns/PATTERNS_README.md)

---

## Tags
`String` `Sliding Window` `Hash Table` `Two Pointers` `Blind 75` `Medium` `O(n) Time`

---

[← Back to Blind 75 Problems](../BLIND75_README.md) | [View Concept: char as Array Index](../concepts/char_as_array_index_explained.md)

