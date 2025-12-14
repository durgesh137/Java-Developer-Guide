# Problem 647: Palindromic Substrings

[← Back to Blind 75 Problems](../BLIND75_README.md)

---

## Problem Statement

**LeetCode Problem #647** - [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/)

Given a string `s`, return the **number of palindromic substrings** in it.

A string is a **palindrome** when it reads the same backward as forward.

A **substring** is a contiguous sequence of characters within the string.

**Constraints:**
- `1 <= s.length <= 1000`
- `s` consists of lowercase English letters

---

## Examples

### Example 1:
```
Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
```

### Example 2:
```
Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
```

### Example 3:
```
Input: s = "abba"
Output: 6
Explanation: Palindromic strings: "a", "b", "b", "a", "bb", "abba".
```

### Example 4:
```
Input: s = "a"
Output: 1
Explanation: Single character is always a palindrome.
```

---

## Algorithm: Expand Around Center (Count Version)

### Core Idea
Use the **expand around center** technique to find and **count** all palindromic substrings. For each possible center position (both odd and even length), expand outward while characters match and increment the count for each valid palindrome found.

### Key Insight
There are **2n - 1** possible centers in a string of length n:
- **n centers** for odd-length palindromes (single character centers)
- **n - 1 centers** for even-length palindromes (between two characters)

By iterating through all centers and counting palindromes as we expand, we can find all palindromic substrings in O(n²) time.

### Why 2n - 1 Centers?

**For string "abc" (length 3):**
```
Centers:
0: 'a' (index 0)           → odd center
1: between 'a' and 'b'     → even center
2: 'b' (index 1)           → odd center
3: between 'b' and 'c'     → even center
4: 'c' (index 2)           → odd center

Total: 2(3) - 1 = 5 centers
```

**Formula:**
- Odd centers: n
- Even centers: n - 1
- Total: n + (n - 1) = **2n - 1**

### Step-by-Step Algorithm

1. **Initialize Variables:**
   - `count = 0` (tracks total palindromic substrings)
   - `n = s.length()`

2. **Iterate Through All Centers:** For each center from 0 to 2n-2:
   - Calculate `left = center / 2`
   - Calculate `right = left + center % 2`
   - Call `expandAroundCenter(s, left, right)` and add result to count

3. **Helper: expandAroundCenter(s, left, right):**
   - Initialize `count = 0`
   - While `left >= 0` AND `right < s.length` AND `s[left] == s[right]`:
     - Increment `count` (found a palindrome)
     - Expand: `left--`, `right++`
   - Return `count`

4. **Return Result:** Total `count`

---

## Pseudocode

```
function countSubstrings(s):
    count = 0
    n = s.length
    
    // There are 2n-1 possible centers
    for center from 0 to 2*n - 2:
        left = center / 2
        right = left + center % 2
        count += expandAroundCenter(s, left, right)
    
    return count

function expandAroundCenter(s, left, right):
    count = 0
    
    while left >= 0 AND right < s.length AND s[left] == s[right]:
        count++           // Found a palindrome
        left--            // Expand left
        right++           // Expand right
    
    return count
```

---

## Complexity Analysis

### Time Complexity: **O(n²)**
- Outer loop through all centers: O(2n - 1) = O(n)
- For each center, expansion: O(n) in worst case
- Total: O(n) × O(n) = **O(n²)**

### Space Complexity: **O(1)**
- Only using constant extra space for variables
- No additional data structures
- **O(1)** constant space

---

## Understanding Center Calculation

### Center Indexing Formula:

```java
left = center / 2
right = left + center % 2
```

**How it maps:**

| center | center/2 | center%2 | left | right | Type | Example in "abc" |
|--------|----------|----------|------|-------|------|------------------|
| 0      | 0        | 0        | 0    | 0     | Odd  | 'a'              |
| 1      | 0        | 1        | 0    | 1     | Even | between 'a','b'  |
| 2      | 1        | 0        | 1    | 1     | Odd  | 'b'              |
| 3      | 1        | 1        | 1    | 2     | Even | between 'b','c'  |
| 4      | 2        | 0        | 2    | 2     | Odd  | 'c'              |

**Pattern:**
- **Even centers** (0, 2, 4...): `center % 2 == 0` → `left == right` (single char)
- **Odd centers** (1, 3, 5...): `center % 2 == 1` → `right = left + 1` (between chars)

---

## Walkthrough Example

**Input:** `s = "aaa"`

### All Centers and Expansions:

| center | left | right | Expansion Process | Palindromes Found | Count |
|--------|------|-------|-------------------|-------------------|-------|
| 0      | 0    | 0     | 'a'               | "a"               | 1     |
|        |      |       | -1,1 (out)        | -                 |       |
| 1      | 0    | 1     | 'a'=='a' ✓        | "aa"              | 1     |
|        |      |       | -1,2 (out)        | -                 |       |
| 2      | 1    | 1     | 'a'               | "a"               | 1     |
|        |      |       | 'a'=='a' ✓        | "aaa"             | +1    |
|        |      |       | -1,3 (out)        | -                 | = 2   |
| 3      | 1    | 2     | 'a'=='a' ✓        | "aa"              | 1     |
|        |      |       | 0,3 (out)         | -                 |       |
| 4      | 2    | 2     | 'a'               | "a"               | 1     |
|        |      |       | 1,3 (out)         | -                 |       |

**Total Count:** 1 + 1 + 2 + 1 + 1 = **6**

**Palindromes identified:**
1. "a" (index 0)
2. "aa" (indices 0-1)
3. "a" (index 1)
4. "aaa" (indices 0-2)
5. "aa" (indices 1-2)
6. "a" (index 2)

---

## Detailed Walkthrough: Center = 2 (s = "aaa")

**Center 2:** `left = 2/2 = 1`, `right = 1 + 0 = 1`

### Expansion Steps:

```
Step 1: left=1, right=1
        s[1]='a' (single character)
        Valid palindrome: "a"
        count = 1
        Expand: left=0, right=2

Step 2: left=0, right=2
        s[0]='a' == s[2]='a' ✓
        Valid palindrome: "aaa"
        count = 2
        Expand: left=-1, right=3

Step 3: left=-1, right=3
        left < 0 → STOP

Return: count = 2
```

**Palindromes from this center:** "a" (at index 1) and "aaa"

---

## Why This Works

1. **Every Palindrome Has a Center:**
   - Single character palindromes center on that character
   - Multi-character palindromes center on a character or between two characters

2. **Counting While Expanding:**
   - Each valid expansion represents a palindromic substring
   - We count as we expand, capturing all sizes

3. **No Duplicates:**
   - Each center position is unique
   - Each expansion level from a center is unique
   - Together they uniquely identify each palindromic substring

4. **Complete Coverage:**
   - 2n-1 centers ensure we check all possible palindrome positions
   - Expansion captures all sizes from each center

---

## Comparison with Problem 5 (Longest Palindromic Substring)

| Aspect | Problem 5 | Problem 647 (This) |
|--------|-----------|-------------------|
| **Goal** | Find longest palindrome | Count all palindromes |
| **Return** | String | Integer count |
| **Expansion** | Find max length | Count each valid palindrome |
| **Tracking** | `start`, `end` indices | `count` |
| **Helper Return** | Length of palindrome | Count of palindromes |
| **Complexity** | O(n²) time, O(1) space | O(n²) time, O(1) space |
| **Pattern** | Expand Around Center | Expand Around Center |

**Key Difference:** Problem 5 tracks the **longest** palindrome found, while this problem **counts all** palindromes found.

---

## Alternative Approaches

### Approach 1: Brute Force
```java
// Check every possible substring
for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {
        if (isPalindrome(s.substring(i, j+1))) {
            count++;
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
// Count all true values
```
- **Time:** O(n²) ✓
- **Space:** O(n²) ❌ (Large DP table)

### Approach 3: Expand Around Center (Current) ✓
- **Time:** O(n²) ✓
- **Space:** O(1) ✓
- **Best balance: optimal time with minimal space**

### Approach 4: Manacher's Algorithm
```java
// Advanced algorithm for finding all palindromes
// Processes string with separators
```
- **Time:** O(n) ✓✓ (Best possible)
- **Space:** O(n)
- **Complex implementation, overkill for this problem**

**Recommended:** Expand Around Center (clean and efficient)

---

## Edge Cases Handled

✅ **Single character:** `s = "a"` → `1`  
✅ **Two same characters:** `s = "aa"` → `3` ("a", "aa", "a")  
✅ **Two different characters:** `s = "ab"` → `2` ("a", "b")  
✅ **All same characters:** `s = "aaaa"` → `10`  
✅ **No multi-char palindromes:** `s = "abc"` → `3` (only singles)  
✅ **Even-length palindrome:** `s = "abba"` → `6`  
✅ **Mixed palindromes:** `s = "aaa"` → `6`  
✅ **Maximum length:** `s.length = 1000` → handles efficiently  

---

## Counting Formula for All Same Characters

**For string of n same characters:**

```
Total palindromes = n + (n-1) + (n-2) + ... + 1
                  = n(n+1)/2

Example: "aaa" (n=3)
= 3(3+1)/2 = 3(4)/2 = 6 ✓
```

**Breakdown:**
- Length 1: 3 palindromes ("a", "a", "a")
- Length 2: 2 palindromes ("aa", "aa")
- Length 3: 1 palindrome ("aaa")
- Total: 3 + 2 + 1 = 6

---

## Code Implementation

See: [`PalindromicSubstrings.java`](../PalindromicSubstrings.java)

**Key Methods:**

```java
public int countSubstrings(String s) {
    int count = 0;
    int n = s.length();
    
    // There are 2n-1 centers for palindromes
    for (int center = 0; center < 2 * n - 1; center++) {
        int left = center / 2;
        int right = left + center % 2;
        count += expandAroundCenter(s, left, right);
    }
    return count;
}

private int expandAroundCenter(String s, int left, int right) {
    int count = 0;
    while (left >= 0 && right < s.length() && 
           s.charAt(left) == s.charAt(right)) {
        count++;
        left--;
        right++;
    }
    return count;
}
```

---

## Related Problems

- **5. Longest Palindromic Substring** (Find longest instead of count) ✓ Completed
- **516. Longest Palindromic Subsequence** (Subsequence vs substring)
- **131. Palindrome Partitioning** (Partition into palindromes)
- **214. Shortest Palindrome** (Add characters to make palindrome)
- **1930. Unique Length-3 Palindromic Subsequences** (Specific length palindromes)

---

## Pattern Recognition

**Pattern:** Expand Around Center / Two Pointers (Outward)

**When to use:**
- Counting palindromes in strings
- Finding all palindromic patterns
- Center-based expansion problems
- Symmetric pattern detection

**Related Patterns:**
- [Two Pointer Technique](../../patterns/PATTERNS_README.md)
- [Expand Around Center Pattern](../../patterns/PATTERNS_README.md)

---

## Key Takeaways

1. ✅ **2n-1 centers** cover all possible palindrome positions
2. ✅ **Count while expanding** captures all palindromic substrings
3. ✅ **No duplicates** as each center and expansion level is unique
4. ✅ **O(n²) time, O(1) space** - optimal for this problem
5. ✅ **Similar to Problem 5** but counts instead of finding longest

---

## Tags
`String` `Two Pointers` `Dynamic Programming` `Palindrome` `Blind 75` `Medium` `O(n²) Time`

---

[← Back to Blind 75 Problems](../BLIND75_README.md) | [Related: Problem 5 - Longest Palindromic Substring](./LongestPalindromeSubstring_README.md)

