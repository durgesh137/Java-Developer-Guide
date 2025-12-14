# DSA_Java - Data Structures and Algorithms in Java

## 📚 Overview
This repository contains a comprehensive collection of **Data Structures and Algorithms** problems implemented in Java, organized from **beginner to advanced levels**. Each module focuses on specific topics with detailed implementations, multiple approaches, complexity analysis, and test cases.

## 🎯 Repository Goals
- Provide clean, well-documented solutions to common DSA problems
- Cover multiple approaches (naive, optimized, alternative methods)
- Include time and space complexity analysis
- Support learning through progressive difficulty levels
- Maintain modular organization for easy navigation

## 📂 Project Structure

```
DSA_Java/
├── README.md                    # Main project documentation
├── Basics/                      # Fundamental programming concepts
│   ├── Basics-README.md         # Detailed module documentation
│   └── src/
│       ├── problems/
│       │   ├── numbers/         # Number manipulation (20 problems)
│       │   ├── strings/         # String manipulation (20 problems)
│       │   ├── operations/      # Mathematical operations
│       │   └── recursion/       # Recursion-based problems
│       └── samples/
├── Arrays/                      # Array-based problems
│   ├── Array-README.md          # Detailed module documentation
│   └── src/
│       ├── problems/            # Core array problems
│       │   └── level2/          # Advanced array problems
│       ├── samples/
│       └── sorting/             # Sorting algorithms
├── Sorting/                     # LeetCode Sorting Problems
│   ├── Sorting-README.md        # Detailed module documentation
│   └── src/
│       ├── problems/            # 94 LeetCode sorting problems
│       ├── patterns/            # Reusable sorting patterns
│       └── samples/             # Helper utilities
└── [Future Modules]
    ├── LinkedLists/
    ├── Stacks/
    ├── Queues/
    ├── Trees/
    ├── Graphs/
    └── DynamicProgramming/
```

## 📦 Modules

### 1. **Basics Module** 
*Status: ✅ Active - 20 Problems*

Foundational programming problems covering fundamental concepts essential for any programmer.

**Topics Covered:**
- **Numbers** (9 problems): Reverse, Palindrome, Armstrong, Prime Check, Factorial, Fibonacci, GCD/LCM, Power Check, Sum of Digits
- **Strings** (11 problems): Reverse, Palindrome, Character Frequency, Vowel/Consonant Count, Anagram Check, Remove Duplicates, String Compression, Reverse Words, Digit Validation, String Rotation
- **Recursion**: Factorial, Fibonacci sequences
- **Mathematical Operations**: GCD, LCM, Power of 2/3

**Key Features:**
- Multiple implementation approaches for each problem
- Includes both iterative and recursive solutions
- Optimized algorithms with complexity analysis

📖 [View Basics Module Documentation](./Basics/Basics-README.md)

---

### 2. **Arrays Module**
*Status: ✅ Active - 11 Problems*

Comprehensive coverage of array manipulation, searching, and algorithmic problems.

**Topics Covered:**
- **Basic Operations**: Frequency count, Min/Max elements, Array reversal
- **Rearrangement**: Move negatives to end, Rotate array
- **Searching**: Peak element, Subarray with given sum, Missing number
- **Advanced**: Largest sum contiguous subarray (Kadane's Algorithm)
- **Sorting Algorithms**: Bubble Sort, Selection Sort

**Key Features:**
- Progressive difficulty levels (basic → level2)
- Multiple sorting algorithm implementations
- Efficient space and time optimized solutions

📖 [View Arrays Module Documentation](./Arrays/Array-README.md)

---

### 3. **Sorting Module**
*Status: ✅ Active - 94 LeetCode Problems + Blind 75*

Comprehensive collection of LeetCode sorting problems solved sequentially with pattern identification, plus curated Blind 75 interview problems.

**Topics Covered:**
- **LeetCode Problems**: All 94 easy-level sorting problems from LeetCode
- **Blind 75**: Curated collection of must-do interview problems with detailed algorithmic explanations
- **Pattern Library**: Reusable sorting patterns and techniques extracted from solutions
- **Problem-Solving Strategies**: Two-pointer, frequency counting, greedy, custom comparators
- **Helper Utilities**: Testing and debugging tools

**Key Features:**
- Sequential problem solving (Problems 1-94)
- Blind 75 problems with crisp algorithms and step-by-step walkthroughs
- Pattern documentation for reusable techniques
- Multiple approaches with complexity analysis
- Dedicated patterns package for high-level problem-solving strategies

📖 [View Sorting Module Documentation](./Sorting/Sorting-README.md)  
🎯 [View Blind 75 Problems](./Sorting/src/blind75/BLIND75_README.md)

---

### 4. **Future Modules** 
*Status: 🔜 Planned*

#### Coming Soon:
- **Linked Lists**: Singly, Doubly, Circular lists, reversal, cycle detection
- **Stacks & Queues**: Implementations, balanced parentheses, next greater element
- **Trees**: Binary trees, BST, traversals, height, diameter
- **Graphs**: BFS, DFS, shortest path, cycle detection
- **Dynamic Programming**: Knapsack, LCS, Matrix chain multiplication
- **Hashing**: Hash maps, collision handling, frequency problems
- **Searching & Sorting**: Binary search variants, Quick sort, Merge sort
- **Greedy Algorithms**: Activity selection, Huffman coding
- **Backtracking**: N-Queens, Sudoku solver, Permutations

## 🚀 Getting Started

### Prerequisites
- **Java Development Kit (JDK)**: Version 8 or higher
- **IDE**: IntelliJ IDEA (recommended), Eclipse, or any Java IDE
- **Build Tool**: Maven or Gradle (optional)

### Running the Code

#### Option 1: Using IntelliJ IDEA
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/DSA_Java.git
   ```
2. Open the project in IntelliJ IDEA
3. Navigate to any problem file (e.g., `Basics/src/problems/numbers/ReverseNumber.java`)
4. Right-click on the file → **Run 'ClassName.main()'**
5. View output in the console

#### Option 2: Command Line
```bash
# Navigate to module directory
cd DSA_Java/Basics

# Compile a Java file
javac -d out src/problems/numbers/ReverseNumber.java

# Run the compiled class
java -cp out problems.numbers.ReverseNumber
```

## 📝 Code Structure

Each problem implementation follows a consistent pattern:

```java
/**
 * Problem Title
 * Description and explanation
 */
public class ProblemName {
    
    /**
     * Method description
     * Time Complexity: O(...)
     * Space Complexity: O(...)
     */
    public static ReturnType methodName(Parameters params) {
        // Implementation
    }
    
    // Multiple approaches when applicable
    
    public static void main(String[] args) {
        // Test cases with formatted output
    }
}
```

## 📊 Progress Tracking

| Module | Problems Solved | Status | Difficulty Range |
|--------|----------------|--------|------------------|
| Basics | 20 | ✅ Active | Beginner |
| Arrays | 11 | ✅ Active | Beginner → Medium |
| Sorting (LeetCode) | 0 / 94 | ✅ Active | Easy |
| Blind 75 | 12 / 75 | ✅ Active | Easy → Hard |
| Linked Lists | 0 | 🔜 Planned | Beginner → Advanced |
| Stacks & Queues | 0 | 🔜 Planned | Beginner → Medium |
| Trees | 0 | 🔜 Planned | Medium → Advanced |
| Graphs | 0 | 🔜 Planned | Medium → Advanced |
| Dynamic Programming | 0 | 🔜 Planned | Medium → Advanced |

**Total Problems Solved: 43**  
**LeetCode Problems: 0 / 94**  
**Blind 75 Problems: 12 / 75** ⭐

## 🎓 Learning Path

### For Beginners:
1. Start with **Basics Module** - Numbers section
2. Move to **Basics Module** - Strings section
3. Practice **Arrays Module** - Basic problems
4. Continue with **Arrays Module** - Sorting algorithms
5. Attempt **Sorting Module** - LeetCode problems sequentially

### For Intermediate:
1. Complete **Basics Module** level1 string problems
2. Work through **Arrays Module** level2 problems
3. Tackle **Sorting Module** LeetCode problems
4. Move to **Linked Lists** and **Stacks/Queues** (when available)

### For Advanced:
1. Focus on **Trees** and **Graphs** modules
2. Master **Dynamic Programming** patterns
3. Solve **Backtracking** and **Greedy** problems

## 🤝 Contributing

Contributions are welcome! To add new problems:

1. Fork the repository
2. Create a new branch: `git checkout -b feature/new-problem`
3. Add your problem file in the appropriate module
4. Follow the existing code structure and documentation style
5. Include:
   - Problem description and examples
   - Multiple approaches (when applicable)
   - Time and space complexity analysis
   - Test cases in main method
6. Update the module's README.md
7. Commit your changes: `git commit -m 'Add: Problem Name'`
8. Push to the branch: `git push origin feature/new-problem`
9. Submit a pull request

### 🔒 Branch Protection

The `main` branch is protected with **4 layers of security**:

1. **GitHub Branch Protection Rules** - Prevents deletion, direct pushes, and force pushes
2. **CODEOWNERS File** - Requires @durgesh137 approval for all changes
3. **Automated Workflow** - Validates code compilation and file integrity
4. **Pull Request Template** - Ensures quality standards are met

**What's Protected:**
- ✅ Main branch **cannot be deleted** by anyone
- ✅ All changes **must go through Pull Requests** 
- ✅ Code owner (@durgesh137) **approval required** before merging
- ✅ Automated checks **must pass** (compilation, file validation)
- ❌ Direct pushes, force pushes, and deletions are **blocked**

**Your Control:**
- Only **you can approve** Pull Requests
- Only **you can merge** approved PRs
- You control **all changes** to the main branch

📖 [How Branch Protection Works (Detailed)](./.github/PROTECTION_EXPLAINED.md)  
⚡ [Quick Setup Guide](./.github/QUICK_SETUP.md)  
📚 [Full Documentation](./.github/BRANCH_PROTECTION.md)

## 📖 Resources

- [GeeksforGeeks - DSA](https://www.geeksforgeeks.org/data-structures/)
- [LeetCode](https://leetcode.com/)
- [HackerRank](https://www.hackerrank.com/domains/data-structures)
- [Introduction to Algorithms (CLRS)](https://mitpress.mit.edu/books/introduction-algorithms-third-edition)

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 👤 Author

**Durgesh Kumar**

- GitHub: [@durgesh137](https://github.com/durgesh137)
- LinkedIn: [Durgesh Kumar](https://www.linkedin.com/in/durgesh-kumar-480814133/)

## ⭐ Show Your Support

Give a ⭐️ if this project helped you learn DSA!

---

**Last Updated:** November 29, 2025  
**Version:** 1.0.0

