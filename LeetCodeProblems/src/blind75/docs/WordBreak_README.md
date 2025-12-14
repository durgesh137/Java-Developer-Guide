# Problem 139: Word Break

[← Back to Blind 75 Problems](../BLIND75_README.md)

---

## Problem Statement

**LeetCode Problem #139** - [Word Break](https://leetcode.com/problems/word-break/)

Given a string `s` and a dictionary of strings `wordDict`, return `true` if `s` can be segmented into a space-separated sequence of one or more dictionary words.

**Note:** The same word in the dictionary may be reused multiple times in the segmentation.

**Constraints:**
- `1 <= s.length <= 300`
- `1 <= wordDict.length <= 1000`
- `1 <= wordDict[i].length <= 20`
- `s` and `wordDict[i]` consist of only lowercase English letters
- All the strings of `wordDict` are unique

---

## Examples

### Example 1:
```
Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: "leetcode" can be segmented as "leet code".
```

### Example 2:
```
Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: "applepenapple" can be segmented as "apple pen apple".
Note: Dictionary words can be reused multiple times.
```

### Example 3:
```
Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false
Explanation: Cannot form a valid segmentation. 
"cat sand og" leaves "og" unmatched.
"cats and og" leaves "og" unmatched.
No valid combination exists.
```

### Example 4:
```
Input: s = "abcdefg", wordDict = ["ab","abc","cd","def","abcd"]
Output: true
Explanation: Can be segmented as "abc def g" or "abcd ef g" (if "ef" and "g" were in dict).
Actually: "ab cd ef g" requires "ef" and "g" to be in dictionary.
Valid: Need to check if complete segmentation possible.
```

---

## Algorithm: Dynamic Programming (Bottom-Up)

### Core Idea
Use **dynamic programming** to build up the solution. Create a boolean array `dp` where `dp[i]` represents whether the substring `s[0...i-1]` can be segmented using the dictionary words.

### Key Insight
For each position `i` in the string, check all words in the dictionary. If a word ends at position `i` and the substring before the word can be segmented (i.e., `dp[i - wordLength]` is true), then `dp[i]` should also be true.

**Base case:** `dp[0] = true` (empty string can always be segmented)

### Why Dynamic Programming?

**Problem has optimal substructure:**
- If `s[0...i]` can be segmented, and `s[i+1...j]` is a dictionary word, then `s[0...j]` can be segmented
- We can build the solution from smaller subproblems

**Problem has overlapping subproblems:**
- Same substring positions are checked multiple times
- DP avoids recalculating by storing results

### Step-by-Step Algorithm

1. **Initialize DP Array:**
   - Create `dp[s.length() + 1]` with all values `false`
   - Set `dp[0] = true` (empty string is always valid)

2. **Iterate Through String Positions:** For each position `i` from 1 to s.length():
   - For each word in `wordDict`:
     - Get `wordLength = word.length()`
     - Check if word can fit: `i >= wordLength`
     - Check if word matches: `s.substring(i - wordLength, i).equals(word)`
     - Check if previous part is valid: `dp[i - wordLength]` is true
     - If all conditions met: `dp[i] = true`

3. **Return Result:** `dp[s.length()]` indicates if entire string can be segmented

---

## Pseudocode

```
function wordBreak(s, wordDict):
    n = s.length
    dp = new boolean[n + 1]
    dp[0] = true  // Base case: empty string
    
    for i from 1 to n:
        for each word in wordDict:
            wordLength = word.length
            
            // Check if word can end at position i
            if i >= wordLength:
                // Extract substring ending at i
                substring = s.substring(i - wordLength, i)
                
                // If substring matches word AND previous part is valid
                if substring == word AND dp[i - wordLength] == true:
                    dp[i] = true
                    break  // Can optimize by breaking here
    
    return dp[n]
```

---

## Complexity Analysis

### Time Complexity: **O(n² × m)** or **O(n × m × k)**

**Where:**
- `n` = length of string `s`
- `m` = number of words in dictionary
- `k` = average length of dictionary words

**Breakdown:**
- Outer loop: O(n) - iterate through each position
- Inner loop: O(m) - check each dictionary word
- Substring comparison: O(k) - worst case for `equals()`
- **Total: O(n × m × k)**

**Optimized view:** O(n²) if we consider dictionary lookup as O(1) with HashSet and fixed word lengths.

### Space Complexity: **O(n)**
- DP array of size `n + 1`: O(n)
- No other significant space used
- **O(n)** linear space

---

## DP Array Walkthrough

**Input:** `s = "leetcode"`, `wordDict = ["leet", "code"]`

### DP Array Construction:

| i | Substring s[0...i-1] | Check Words | Match Found | dp[i] | Explanation |
|---|----------------------|-------------|-------------|-------|-------------|
| 0 | "" (empty)           | -           | -           | **true** | Base case |
| 1 | "l"                  | "leet", "code" | No       | false | No match |
| 2 | "le"                 | "leet", "code" | No       | false | No match |
| 3 | "lee"                | "leet", "code" | No       | false | No match |
| 4 | "leet"               | "leet" ✓     | Yes       | **true** | "leet" matches, dp[0]=true |
| 5 | "leetc"              | "leet", "code" | No       | false | No valid segmentation |
| 6 | "leetco"             | "leet", "code" | No       | false | No valid segmentation |
| 7 | "leetcod"            | "leet", "code" | No       | false | No valid segmentation |
| 8 | "leetcode"           | "code" ✓     | Yes       | **true** | "code" matches, dp[4]=true |

**Result:** `dp[8] = true` ✓

**Segmentation:** "leet" (0-3) + "code" (4-7) = "leetcode"

---

## Detailed Step-by-Step: Position i=8

**String:** `s = "leetcode"`, **Position:** `i = 8` (checking s[0...7])

### Checking Each Word:

**Word 1: "leet" (length 4)**
```
i >= wordLength? → 8 >= 4 ✓
substring = s.substring(8-4, 8) = s.substring(4, 8) = "code"
substring == "leet"? → "code" == "leet" ✗
Skip this word
```

**Word 2: "code" (length 4)**
```
i >= wordLength? → 8 >= 4 ✓
substring = s.substring(8-4, 8) = s.substring(4, 8) = "code"
substring == "code"? → "code" == "code" ✓
dp[i - wordLength]? → dp[8-4] = dp[4] = true ✓

Conditions met! Set dp[8] = true
```

**Result:** `dp[8] = true` (entire string can be segmented)

---

## Why This Works

1. **Bottom-Up Building:**
   - Start from empty string (dp[0] = true)
   - Build up to larger substrings
   - Each position depends only on previous positions

2. **Optimal Substructure:**
   - If s[0...i] can be segmented and s[i...j] is a word, then s[0...j] can be segmented
   - Solution combines optimal solutions to subproblems

3. **Handles Reuse:**
   - Same word can appear multiple times
   - Each position checks independently
   - No restriction on word reuse

4. **Correctness:**
   - dp[i] is true ⟺ there exists a valid segmentation of s[0...i-1]
   - Final answer dp[n] correctly represents if entire string can be segmented

---

## Edge Cases Handled

✅ **Single character word:** `s = "a"`, `wordDict = ["a"]` → `true`  
✅ **No segmentation possible:** `s = "catsandog"`, `wordDict = ["cats","dog","sand","and","cat"]` → `false`  
✅ **Word reuse required:** `s = "aaaa"`, `wordDict = ["a","aa"]` → `true`  
✅ **Multiple valid segmentations:** `s = "abcd"`, `wordDict = ["a","ab","abc","cd"]` → `true`  
✅ **Empty dictionary:** `s = "a"`, `wordDict = []` → `false`  
✅ **Long string:** `s.length = 300` → handles efficiently  
✅ **Many words in dict:** `wordDict.length = 1000` → handles all  
✅ **Entire string is one word:** `s = "apple"`, `wordDict = ["apple"]` → `true`  

---

## Example: Word Reuse

**Input:** `s = "aaaa"`, `wordDict = ["a", "aa"]`

| i | Substring | Check "a" | Check "aa" | dp[i] | Explanation |
|---|-----------|-----------|------------|-------|-------------|
| 0 | ""        | -         | -          | true  | Base case |
| 1 | "a"       | Match ✓   | No fit     | **true** | dp[0]=true, "a" matches |
| 2 | "aa"      | Match ✓   | Match ✓    | **true** | dp[1]=true, "a" matches OR dp[0]=true, "aa" matches |
| 3 | "aaa"     | Match ✓   | Match ✓    | **true** | dp[2]=true, "a" matches OR dp[1]=true, "aa" matches |
| 4 | "aaaa"    | Match ✓   | Match ✓    | **true** | dp[3]=true, "a" matches OR dp[2]=true, "aa" matches |

**Valid Segmentations:**
- "a" + "a" + "a" + "a"
- "aa" + "aa"
- "a" + "aa" + "a"
- "aa" + "a" + "a"

**Result:** `true` ✓

---

## Alternative Approaches

### Approach 1: Recursion with Memoization (Top-Down DP)
```java
public boolean wordBreak(String s, List<String> wordDict, int start, Boolean[] memo) {
    if (start == s.length()) return true;
    if (memo[start] != null) return memo[start];
    
    for (String word : wordDict) {
        if (s.startsWith(word, start)) {
            if (wordBreak(s, wordDict, start + word.length(), memo)) {
                return memo[start] = true;
            }
        }
    }
    return memo[start] = false;
}
```
- **Time:** O(n² × m) or O(n × m × k)
- **Space:** O(n) for recursion stack + memoization
- **Similar complexity, but uses recursion**

### Approach 2: BFS/DFS with HashSet
```java
// Use BFS to explore all possible segmentations
// Use HashSet to convert wordDict for O(1) lookup
```
- **Time:** O(n²) with optimizations
- **Space:** O(n) for queue + visited set
- **More complex implementation**

### Approach 3: Dynamic Programming with HashSet (Optimized)
```java
// Convert wordDict to HashSet for O(1) lookup
Set<String> wordSet = new HashSet<>(wordDict);
boolean[] dp = new boolean[s.length() + 1];
dp[0] = true;

for (int i = 1; i <= s.length(); i++) {
    for (int j = 0; j < i; j++) {
        if (dp[j] && wordSet.contains(s.substring(j, i))) {
            dp[i] = true;
            break;
        }
    }
}
```
- **Time:** O(n³) worst case (nested loops + substring)
- **Space:** O(n + m) for dp array + HashSet
- **Better for large dictionaries**

### Approach 4: Bottom-Up DP (Current Implementation) ✓
- **Time:** O(n × m × k)
- **Space:** O(n)
- **Clear and straightforward**

**Recommended:** Current implementation is clean and efficient. Use HashSet optimization for very large dictionaries.

---

## Optimization: Using HashSet

**For better performance with large dictionaries:**

```java
public boolean wordBreak(String s, List<String> wordDict) {
    Set<String> wordSet = new HashSet<>(wordDict);  // O(1) lookup
    boolean[] dp = new boolean[s.length() + 1];
    dp[0] = true;
    
    for (int i = 1; i <= s.length(); i++) {
        for (int j = 0; j < i; j++) {
            if (dp[j] && wordSet.contains(s.substring(j, i))) {
                dp[i] = true;
                break;  // Early termination
            }
        }
    }
    return dp[s.length()];
}
```

**Improvements:**
- ✅ O(1) dictionary lookup instead of O(m)
- ✅ Early break when dp[i] is set to true
- ✅ Better for large dictionaries (m > 100)

---

## Code Implementation

See: [`WordBreak.java`](../WordBreak.java)

**Key Method:**

```java
public static boolean wordBreak(String s, List<String> wordDict) {
    boolean[] dp = new boolean[s.length() + 1];
    dp[0] = true;  // Base case: empty string
    
    for (int i = 1; i <= s.length(); i++) {
        for (String word : wordDict) {
            int wordLength = word.length();
            
            // Check if word can fit and matches
            if (i >= wordLength && 
                s.substring(i - wordLength, i).equals(word)) {
                // Update dp[i] if previous part is valid
                dp[i] = dp[i] || dp[i - wordLength];
            }
        }
    }
    
    return dp[s.length()];
}
```

---

## Related Problems

- **140. Word Break II** (Return all possible segmentations) - Harder
- **472. Concatenated Words** (Words formed by concatenating other words)
- **1048. Longest String Chain** (Word chain with one character difference)
- **91. Decode Ways** (Similar DP pattern)
- **131. Palindrome Partitioning** (Segmentation with constraints)

---

## Pattern Recognition

**Pattern:** Dynamic Programming - String Segmentation

**When to use:**
- String can be broken into parts with certain properties
- Need to check if entire string satisfies a condition
- Subproblems overlap (DP characteristic)
- Building solution from smaller subproblems

**Related Patterns:**
- [Dynamic Programming Pattern](../../patterns/PATTERNS_README.md)
- [String Manipulation](../../patterns/PATTERNS_README.md)

---

## Key Takeaways

1. ✅ **DP Array Size:** `n + 1` to include empty string (base case)
2. ✅ **Base Case:** `dp[0] = true` (empty string is always valid)
3. ✅ **Transition:** `dp[i] = true` if any word ends at `i` and `dp[i - wordLength] = true`
4. ✅ **Word Reuse:** Naturally handled by checking each position independently
5. ✅ **Optimization:** Use HashSet for O(1) dictionary lookup with large dictionaries

---

## Tags
`String` `Dynamic Programming` `Hash Table` `Memoization` `Blind 75` `Medium` `O(n²) Time`

---

[← Back to Blind 75 Problems](../BLIND75_README.md) | [View DP Pattern](../../patterns/PATTERNS_README.md)

