# How `char` is Used as Array Index in Java 🔍

## The Key Concept

**In Java, `char` is actually a numeric type!** It's a 16-bit value that represents Unicode characters, and when used in a numeric context (like as an array index), Java automatically converts it to its ASCII/Unicode integer value.

---

## ASCII Value Examples

```java
char c = 'a';
int value = (int) c;  // value = 97

// Common characters and their ASCII values:
'a' → 97
'b' → 98
'c' → 99
...
'z' → 122

'A' → 65
'B' → 66
...
'Z' → 90

'0' → 48
'1' → 49
...
'9' → 57

' ' (space) → 32
```

---

## How It Works in the Code

### Declaration:
```java
int[] index = new int[128];  // Array to hold data for ASCII characters 0-127
```

### Usage:
```java
char currentChar = 'a';

// These two lines are EQUIVALENT:
index[currentChar] = end + 1;
index[97] = end + 1;  // Java converts 'a' to 97 automatically
```

---

## Visual Example: "abc" String

Let's trace through how the algorithm uses char as index:

```
String s = "abc";
int[] index = new int[128];  // All values initialized to 0

Step 1: end=0, currentChar='a' (ASCII 97)
        index[97] = 0 + 1 = 1
        
Step 2: end=1, currentChar='b' (ASCII 98)
        index[98] = 1 + 1 = 2
        
Step 3: end=2, currentChar='c' (ASCII 99)
        index[99] = 2 + 1 = 3

Array state after processing "abc":
index[0] to index[96] = 0
index[97] = 1  ← stores position for 'a'
index[98] = 2  ← stores position for 'b'
index[99] = 3  ← stores position for 'c'
index[100] to index[127] = 0
```

---

## Why This is Efficient

### ✅ **Direct Access - O(1)**
```java
// Using char as index (FAST)
index[currentChar] = value;  // O(1) - direct array access

// vs. Using HashMap (SLOWER)
map.put(currentChar, value);  // O(1) average, but with overhead
```

### ✅ **Memory Efficient**
```java
int[128]     → 128 * 4 bytes = 512 bytes
HashMap<>    → Much more overhead (entries, buckets, etc.)
```

---

## Complete Code Flow Example

```java
// Input: "abca"
int[] index = new int[128];
String s = "abca";

end=0, char='a'(97):
  start = max(index[97], 0) = max(0, 0) = 0
  maxLength = max(0, 0-0+1) = 1
  index[97] = 1  // Store: "if you see 'a' again, start from position 1"

end=1, char='b'(98):
  start = max(index[98], 0) = max(0, 0) = 0
  maxLength = max(1, 1-0+1) = 2
  index[98] = 2  // Store: "if you see 'b' again, start from position 2"

end=2, char='c'(99):
  start = max(index[99], 0) = max(0, 0) = 0
  maxLength = max(2, 2-0+1) = 3
  index[99] = 3  // Store: "if you see 'c' again, start from position 3"

end=3, char='a'(97):  ← DUPLICATE FOUND!
  start = max(index[97], 0) = max(1, 0) = 1  // Jump to position 1
  maxLength = max(3, 3-1+1) = 3  // Length stays 3
  index[97] = 4  // Update: "if you see 'a' again, start from position 4"

Result: maxLength = 3 (substring "abc")
```

---

## Why Use int[128] Instead of int[256]?

**Standard ASCII uses only 0-127 (7 bits)**
- 128 values cover all standard ASCII characters
- Extended ASCII (128-255) is rarely needed
- Saves memory: 128 slots vs 256 slots

**If input includes extended characters, use int[256]**

---

## Key Takeaways

1. ✅ **`char` is numeric** - It's a 16-bit integer representing a character
2. ✅ **Automatic conversion** - Java converts char to int when used as array index
3. ✅ **Direct mapping** - Character's ASCII value = Array index
4. ✅ **Fast lookup** - O(1) constant time access
5. ✅ **Memory efficient** - Fixed 512 bytes for int[128]

---

## Common Pitfall

```java
// ❌ WRONG - Trying to use char directly without understanding
char c = 'a';
System.out.println(c);  // Prints: a (as character)

// ✅ CORRECT - Understanding the numeric value
char c = 'a';
System.out.println((int)c);  // Prints: 97 (as integer)
System.out.println(c + 0);   // Prints: 97 (implicit conversion)
```

---

## Verification Code

```java
// Test case added in LongestSubstringWithoutRepeatingChars.java
Display.printTestCase(4);
System.out.println("=== Understanding char as array index ===");
System.out.println("Character 'a' has ASCII value: " + (int)'a' + " (used as index[97])");
System.out.println("Character 'b' has ASCII value: " + (int)'b' + " (used as index[98])");
System.out.println("Character 'A' has ASCII value: " + (int)'A' + " (used as index[65])");
System.out.println("Character '0' has ASCII value: " + (int)'0' + " (used as index[48])");
System.out.println("Character ' ' has ASCII value: " + (int)' ' + " (used as index[32])");
System.out.println("\nThis is why we use int[128] to cover all ASCII characters (0-127)");
```

---

## Related Problems Using This Technique

- **Problem 3:** Longest Substring Without Repeating Characters
- **Problem 76:** Minimum Window Substring
- **Problem 438:** Find All Anagrams in a String
- **Problem 567:** Permutation in String

---

**Now you understand how `index[currentChar] = end + 1` works!** 🎉

The character `currentChar` is automatically converted to its ASCII integer value and used as the array index to store the position information.

---

[← Back to Blind 75 Problems](../BLIND75_README.md) | [View All Concepts](./README.md)

