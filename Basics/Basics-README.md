# Basics Module - README

## Overview
This module is part of the **Java Developer Guide** and contains fundamental programming problems covering essential concepts in Java. It serves as the starting point for developers to build a strong foundation before diving into advanced topics like Data Structures, Algorithms, and Java backend technologies.

## Problems covered so far

### Number-based Problems

1. **Reverse a Number**
   - Description: Reverse the digits of an integer
   - Implementation: `problems.numbers.ReverseNumber.java`
   - Example: Input `12345` → Output `54321`
   - Time Complexity: O(log n) where n is the number
   - Space Complexity: O(1)

2. **Palindrome Number**
   - Description: Check if a number reads the same forwards and backwards
   - Implementation: `problems.numbers.PalindromeNumber.java`
   - Example: Input `121` → Output `true`, Input `123` → Output `false`
   - Time Complexity: O(log n)
   - Space Complexity: O(1)

3. **Sum and Count of Digits**
   - Description: Calculate the sum and count of digits in a number
   - Implementation: `problems.numbers.FindSumAndDigitCount.java`
   - Example: Input `12345` → Sum `15`, Count `5`
   - Time Complexity: O(log n)
   - Space Complexity: O(1)

4. **Armstrong Number**
   - Description: Check if a number equals the sum of its digits raised to the power of the number of digits
   - Implementation: `problems.numbers.ArmstrongNumber.java`
   - Example: `153 = 1³ + 5³ + 3³ = 153` (Armstrong), `123` (Not Armstrong)
   - Time Complexity: O(log n)
   - Space Complexity: O(1)

5. **Factorial**
   - Description: Calculate factorial using iterative and recursive approaches
   - Implementation: `problems.recursion.Factorial.java`
   - Example: Input `5` → Output `120`
   - Time Complexity: O(n)
   - Space Complexity: O(1) iterative, O(n) recursive

6. **Prime Check**
   - Description: Check if a number is prime (naive and optimized methods)
   - Implementation: `problems.numbers.PrimeNumber.java`
   - Example: Input `17` → Output `true`, Input `18` → Output `false`
   - Time Complexity: O(√n) optimized
   - Space Complexity: O(1)

7. **GCD and LCM**
   - Description: Find Greatest Common Divisor and Least Common Multiple using Euclidean algorithm
   - Implementation: `problems.operations.GcdLcm.java`
   - Example: GCD(12, 18) = 6, LCM(12, 18) = 36
   - Time Complexity: O(log min(a,b))
   - Space Complexity: O(1)

8. **Fibonacci Sequence**
   - Description: Generate Fibonacci numbers using iterative, recursive, and DP approaches
   - Implementation: `problems.recursion.FibonacciSequence.java`
   - Example: 0, 1, 1, 2, 3, 5, 8, 13, 21...
   - Time Complexity: O(n) iterative/DP, O(2ⁿ) naive recursive
   - Space Complexity: O(1) iterative, O(n) DP

9. **Power Check**
   - Description: Check if a number is a power of 2 or not
   - Implementation: `problems.operations.PowerCheck.java`
   - Example: `16` is power of 2, `27` is power of 3
   - Time Complexity: O(log n) or O(1) for power of 2 using bit tricks
   - Space Complexity: O(1)

### String-based Problems

10. **Reverse a String**
    - Description: Reverse a string using different approaches (StringBuilder, char array, recursion)
    - Implementation: `problems.strings.ReverseString.java`
    - Example: Input `"hello"` → Output `"olleh"`
    - Time Complexity: O(n)
    - Space Complexity: O(n)

11. **Palindrome String**
    - Description: Check if a string is a palindrome (ignoring case and special characters)
    - Implementation: `problems.strings.PalindromeString.java`
    - Example: `"A man a plan a canal Panama"` → `true`
    - Time Complexity: O(n)
    - Space Complexity: O(1)

12. **Character Frequency / Count Characters**
    - Description: Count frequency of each character in a string
    - Implementation: `problems.strings.CharacterFrequency.java`
    - Example: Input `"hello"` → h:1, e:1, l:2, o:1
    - Time Complexity: O(n)
    - Space Complexity: O(k) where k is unique characters

13. **Count Vowels and Consonants**
    - Description: Count number of vowels and consonants in a string
    - Implementation: `problems.strings.VowelConsonantCount.java`
    - Example: Input `"Hello World"` → Vowels: 3, Consonants: 7
    - Time Complexity: O(n)
    - Space Complexity: O(1)

14. **First Non-Repeating Character**
    - Description: Find the first unique character in a string
    - Implementation: `problems.strings.FirstUniqueChar.java`
    - Example: Input `"leetcode"` → Output `'l'`, Input `"loveleetcode"` → Output `'v'`
    - Time Complexity: O(n)
    - Space Complexity: O(1) - fixed alphabet size

15. **Anagram Check**
    - Description: Check if two strings are anagrams (same characters, different order)
    - Implementation: `problems.strings.AnagramCheck.java`
    - Example: `"listen"` and `"silent"` → `true`
    - Time Complexity: O(n log n) sorting, O(n) using frequency count
    - Space Complexity: O(1) or O(n)

16. **Remove Duplicates from String**
    - Description: Remove duplicate characters while preserving order
    - Implementation: `problems.strings.level1.RemoveDuplicates.java`
    - Example: Input `"programming"` → Output `"progamin"`
    - Time Complexity: O(n)
    - Space Complexity: O(n)

17. **String Compression**
    - Description: Compress string using character counts (e.g., aabbbcccc → a2b3c4)
    - Implementation: `problems.strings.level1.StringCompression.java`
    - Example: Input `"aaabbcccc"` → Output `"a3b2c4"`
    - Time Complexity: O(n)
    - Space Complexity: O(n)

18. **Reverse Words in a Sentence**
    - Description: Reverse the order of words in a sentence
    - Implementation: `problems.strings.level1.ReverseWords.java`
    - Example: Input `"Hello World Java"` → Output `"Java World Hello"`
    - Time Complexity: O(n)
    - Space Complexity: O(n)

19. **Check if String Contains Only Digits**
    - Description: Validate if a string contains only numeric characters
    - Implementation: `problems.strings.level1.DigitValidator.java`
    - Example: Input `"12345"` → `true`, Input `"123a45"` → `false`
    - Time Complexity: O(n)
    - Space Complexity: O(1)

20. **String Rotation Check**
    - Description: Check if one string is a rotation of another
    - Implementation: `problems.strings.level1.StringRotation.java`
    - Example: `"waterbottle"` is rotation of `"erbottlewat"` → `true`
    - Time Complexity: O(n)
    - Space Complexity: O(n)



## How to Run

### From IntelliJ IDEA
1. Navigate to the specific problem file under `src/problems/`
2. Right-click on the file and select "Run 'ClassName.main()'"
3. View output in the console

### From Command Line
```bash
# Compile
javac -d out src/problems/ClassName.java

# Run
java -cp out problems.ClassName
```

## Project Structure
```
Basics/
├── Basics-README.md
├── Basics.iml
└── src/
    ├── problems/
    │   ├── numbers/              # Number manipulation problems
    │   │   ├── ReverseNumber.java
    │   │   ├── PalindromeNumber.java
    │   │   ├── ArmstrongNumber.java
    │   │   ├── PrimeNumber.java
    │   │   └── FindSumAndDigitCount.java
    │   ├── strings/              # String manipulation problems
    │   │   ├── ReverseString.java
    │   │   ├── PalindromeString.java
    │   │   ├── CharacterFrequency.java
    │   │   ├── VowelConsonantCount.java
    │   │   ├── FirstUniqueChar.java
    │   │   ├── AnagramCheck.java
    │   │   └── level1/           # Intermediate string problems
    │   │       ├── RemoveDuplicates.java
    │   │       ├── StringCompression.java
    │   │       ├── ReverseWords.java
    │   │       ├── DigitValidator.java
    │   │       └── StringRotation.java
    │   ├── operations/           # Mathematical operations
    │   │   ├── GcdLcm.java
    │   │   └── PowerCheck.java
    │   └── recursion/            # Recursion-based problems
    │       ├── Factorial.java
    │       └── FibonacciSequence.java
    └── samples/
        └── BasicSamples.java     # Helper utility methods
```

## Package Organization

- **`problems.numbers`** - Basic number manipulation and digit-based problems (reverse, palindrome, Armstrong, prime check, sum of digits)
- **`problems.strings`** - String manipulation problems from beginner to medium level (reverse, palindrome, anagrams, compression, validation, etc.)
- **`problems.operations`** - Mathematical operations and algorithms (GCD, LCM, power checks)
- **`problems.recursion`** - Recursion-based implementations (factorial, Fibonacci)
- **`samples`** - Utility helper methods and sample code


## Contributing
When adding new problems:
1. Create a new Java file in `src/problems/`
2. Include problem description, examples, and complexity analysis in comments
3. Implement multiple approaches when applicable
4. Add the problem to this README with proper documentation

