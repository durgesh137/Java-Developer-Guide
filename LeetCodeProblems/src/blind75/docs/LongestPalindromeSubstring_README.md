# Problem 5: Longest Palindromic Substring

[← Back to Blind 75 Problems](../BLIND75_README.md)

---

## Problem Statement

**LeetCode Problem #5** - [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)

Given a string `s`, return the **longest palindromic substring** in `s`.

**Note:** A palindrome is a string that reads the same backward as forward.

**Constraints:**
- `1 <= s.length <= 1000`
- `s` consists of only digits and English letters

---

## Examples

### Example 1:
```
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
```

### Example 2:
```
Input: s = "cbbd"
Output: "bb"
Explanation: "bb" is the longest palindromic substring.
```

### Example 3:
```
Input: s = "a"
Output: "a"
Explanation: Single character is always a palindrome.
```

### Example 4:
```
Input: s = "ac"
Output: "a" or "c"
Explanation: No multi-character palindrome exists.
```

---

## Algorithm: Expand Around Center

### Core Idea
For each possible center position in the string, **expand outward** while characters match to find the longest palindrome centered at that position. Check both **odd-length** (single center) and **even-length** (two centers) palindromes.

### Key Insight
Instead of checking every possible substring (O(n³)), we use each position as a potential palindrome center and expand outward. This reduces time complexity to O(n²) by avoiding redundant checks.

### Why Two Types of Centers?

**Odd-length palindromes:** Center is a single character
- Example: "aba" has center at 'b' (index 1)
- Center positions: `(i, i)`

**Even-length palindromes:** Center is between two characters  
- Example: "abba" has center between two 'b's
- Center positions: `(i, i+1)`

### Step-by-Step Algorithm

1. **Initialize Variables:**
   - `start = 0, end = 0` (track the longest palindrome's boundaries)
   
2. **Iterate Through Each Position:** For each index `i` from 0 to n-1:
   - **Expand around single center:** `len1 = expandAroundCenter(s, i, i)` for odd-length
   - **Expand around double center:** `len2 = expandAroundCenter(s, i, i+1)` for even-length
   - **Get maximum length:** `len = max(len1, len2)`
   - **Update boundaries if longer:** If `len > end - start`:
     - Calculate `start = i - (len - 1) / 2`
     - Calculate `end = i + len / 2`

3. **Helper: expandAroundCenter(s, left, right):**
   - While `left >= 0` AND `right < s.length` AND `s[left] == s[right]`:
     - Expand: `left--`, `right++`
   - Return length: `right - left - 1`

4. **Return Result:** `s.substring(start, end + 1)`

---

## Pseudocode

```
function longestPalindrome(s):
    if s is null or empty:
        return ""
    
    start = 0
    end = 0
    
    for i from 0 to s.length - 1:
        len1 = expandAroundCenter(s, i, i)       // Odd length
        len2 = expandAroundCenter(s, i, i + 1)   // Even length
        len = max(len1, len2)
        
        if len > (end - start):
            start = i - (len - 1) / 2
            end = i + len / 2
    
    return s.substring(start, end + 1)

function expandAroundCenter(s, left, right):
    while left >= 0 AND right < s.length AND s[left] == s[right]:
        left--
        right++
    
    return right - left - 1
```

---

## Complexity Analysis

### Time Complexity: **O(n²)**
- Outer loop iterates through each position: O(n)
- For each position, expand operation: O(n) in worst case
- Total: O(n) × O(n) = **O(n²)**

### Space Complexity: **O(1)**
- Only using constant extra space for variables
- No additional data structures
- Substring return doesn't count towards space complexity
- **O(1)** constant space

---

## Walkthrough Example

**Input:** `s = "babad"`

### Iteration Details:

| i | Center Type | left, right | Expansion | Palindrome | Length | Updated start, end |
|---|-------------|-------------|-----------|------------|--------|-------------------|
| 0 | Odd (0,0)   | 0, 0        | "b"       | "b"        | 1      | start=0, end=0    |
| 0 | Even (0,1)  | 0, 1        | b≠a       | -          | 0      | -                 |
| 1 | Odd (1,1)   | 1, 1        | "a" → "bab" | "bab"    | **3**  | start=0, end=2    |
| 1 | Even (1,2)  | 1, 2        | a≠b       | -          | 0      | -                 |
| 2 | Odd (2,2)   | 2, 2        | "b" → "aba" | "aba"    | **3**  | (same)            |
| 2 | Even (2,3)  | 2, 3        | b≠a       | -          | 0      | -                 |
| 3 | Odd (3,3)   | 3, 3        | "a"       | "a"        | 1      | -                 |
| 3 | Even (3,4)  | 3, 4        | a≠d       | -          | 0      | -                 |
| 4 | Odd (4,4)   | 4, 4        | "d"       | "d"        | 1      | -                 |

**Final Result:** `s.substring(0, 2+1)` = `"bab"`

**Note:** "aba" is also valid (found at i=2), but we return the first found with max length.

---

## Detailed Walkthrough: Expand Around Center at i=1

**Input:** `s = "babad"`, **Center:** i=1 (character 'a')

### Odd-length expansion (i, i):
```
Initial: left=1, right=1
Step 1: s[1]='a' == s[1]='a' ✓ → expand
        left=0, right=2
Step 2: s[0]='b' == s[2]='b' ✓ → expand
        left=-1, right=3
Step 3: left < 0 → STOP
Return: right - left - 1 = 3 - (-1) - 1 = 3

Palindrome found: "bab" (length 3)
```

### Update boundaries:
```
len = 3
len > (end - start) → 3 > 0 ✓
start = i - (len - 1) / 2 = 1 - (3 - 1) / 2 = 1 - 1 = 0
end = i + len / 2 = 1 + 3 / 2 = 1 + 1 = 2
```

---

## Why This Works

1. **Every Palindrome Has a Center:** 
   - Odd-length: single character center (e.g., "aba" centers on 'b')
   - Even-length: between two characters (e.g., "abba" centers between two 'b's)

2. **Expanding is Efficient:**
   - We only expand while characters match
   - No need to check all substrings independently
   - Early termination when mismatch occurs

3. **Handles All Cases:**
   - Single character strings (always palindrome)
   - No palindromes > length 1 (returns first character)
   - Multiple palindromes (returns longest, first found)
   - Entire string is palindrome (will be found)

4. **Index Calculation Math:**
   - For odd palindrome of length `len` centered at `i`:
     - `start = i - len/2`, `end = i + len/2`
   - For even palindrome of length `len` centered between `i` and `i+1`:
     - `start = i - (len/2 - 1)`, `end = i + len/2`
   - Unified formula: `start = i - (len - 1) / 2`, `end = i + len / 2`

---

## Expand Around Center Explained

### Why return `right - left - 1`?

When the loop exits:
- `left` is one position **before** the palindrome start
- `right` is one position **after** the palindrome end

**Example:** Palindrome "bab"
```
Valid range: left=0, right=2 (both inclusive)
After exit: left=-1, right=3 (both out of bounds)
Length = right - left - 1 = 3 - (-1) - 1 = 3 ✓
```

**Visual:**
```
String:  b  a  b
Index:   0  1  2
         ↑     ↑
      left=0 right=2  (valid palindrome)
      
After expansion fails:
         ↑        ↑
      left=-1  right=3
      
Length = 3 - (-1) - 1 = 3
```

---

## Alternative Approaches

### Approach 1: Brute Force (Not Optimal)
```java
// Check every possible substring
for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {
        if (isPalindrome(s.substring(i, j+1))) {
            // Update max
        }
    }
}
```
- **Time:** O(n³) ❌ (Two nested loops + palindrome check)
- **Space:** O(1)

### Approach 2: Dynamic Programming
```java
// dp[i][j] = true if s[i...j] is palindrome
boolean[][] dp = new boolean[n][n];
// Fill diagonal, then expand
```
- **Time:** O(n²) ✓
- **Space:** O(n²) ❌ (Large space for DP table)

### Approach 3: Expand Around Center (Current) ✓
- **Time:** O(n²) ✓
- **Space:** O(1) ✓
- **Best balance of time and space**

### Approach 4: Manacher's Algorithm (Most Optimal)
```java
// Specialized algorithm for palindromes
// Processes string with separators
```
- **Time:** O(n) ✓✓ (Best possible)
- **Space:** O(n)
- **Complex implementation**

**Recommended:** Expand Around Center (good balance of simplicity and efficiency)

---

## Edge Cases Handled

✅ **Single character:** `s = "a"` → `"a"`  
✅ **Two characters (same):** `s = "aa"` → `"aa"`  
✅ **Two characters (different):** `s = "ab"` → `"a"` or `"b"`  
✅ **No palindrome > 1:** `s = "abcd"` → `"a"`  
✅ **Entire string palindrome:** `s = "racecar"` → `"racecar"`  
✅ **Multiple palindromes:** `s = "babad"` → `"bab"` (or `"aba"`)  
✅ **Even-length palindrome:** `s = "cbbd"` → `"bb"`  
✅ **Odd-length palindrome:** `s = "babad"` → `"bab"`  

---

## Index Calculation Deep Dive

### For Odd-Length Palindrome:
**Example:** `"bab"` (length 3) centered at index 1

```
Palindrome: b a b
Index:      0 1 2
Center: i = 1
Length: len = 3

start = i - (len - 1) / 2
      = 1 - (3 - 1) / 2
      = 1 - 2 / 2
      = 1 - 1 = 0 ✓

end = i + len / 2
    = 1 + 3 / 2
    = 1 + 1 = 2 ✓

Result: s.substring(0, 3) = "bab" ✓
```

### For Even-Length Palindrome:
**Example:** `"abba"` (length 4) centered between indices 1 and 2

```
Palindrome: a b b a
Index:      0 1 2 3
Center: i = 1 (left of the two 'b's)
Length: len = 4

start = i - (len - 1) / 2
      = 1 - (4 - 1) / 2
      = 1 - 3 / 2
      = 1 - 1 = 0 ✓

end = i + len / 2
    = 1 + 4 / 2
    = 1 + 2 = 3 ✓

Result: s.substring(0, 4) = "abba" ✓
```

**Why this formula works for both:**
- Integer division naturally handles odd/even differences
- Centers the palindrome correctly around index `i`

---

## Code Implementation

See: [`LongestPalindromeSubstring.java`](../LongestPalindromeSubstring.java)

**Key Methods:**

```java
public static String longestPalindrome(String s) {
    if (s == null || s.isEmpty()) return "";
    int start = 0, end = 0;
    
    for (int i = 0; i < s.length(); i++) {
        int len1 = expandAroundCenter(s, i, i);     // Odd
        int len2 = expandAroundCenter(s, i, i + 1); // Even
        int len = Math.max(len1, len2);
        
        if (len > end - start) {
            start = i - (len - 1) / 2;
            end = i + len / 2;
        }
    }
    return s.substring(start, end + 1);
}

private static int expandAroundCenter(String s, int left, int right) {
    while (left >= 0 && right < s.length() && 
           s.charAt(left) == s.charAt(right)) {
        left--;
        right++;
    }
    return right - left - 1;
}
```

---

## Related Problems

- **647. Palindromic Substrings** (Count all palindromic substrings)
- **516. Longest Palindromic Subsequence** (Subsequence vs substring)
- **214. Shortest Palindrome** (Add characters to make palindrome)
- **131. Palindrome Partitioning** (Partition into palindromes)
- **336. Palindrome Pairs** (Find palindrome pairs in array)

---

## Pattern Recognition

**Pattern:** Expand Around Center / Two Pointers (Outward)

**When to use:**
- Finding palindromes in strings
- Symmetric pattern detection
- Center-based expansion problems

**Related Patterns:**
- [Two Pointer Technique](../../patterns/PATTERNS_README.md)
- [String Manipulation Patterns](../../patterns/PATTERNS_README.md)

---

## Concepts Used

**Key Technique:** Expand Around Center
- No new concept documentation needed
- Standard two-pointer expansion technique
- Checking both odd and even length centers

---

## Tags
`String` `Two Pointers` `Dynamic Programming` `Palindrome` `Blind 75` `Medium` `O(n²) Time`

---

[← Back to Blind 75 Problems](../BLIND75_README.md) | [Next: Problem 15 - 3Sum →](../BLIND75_README.md)

