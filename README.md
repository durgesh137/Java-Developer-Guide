# Java Developer Guide

## 📚 Overview
This repository is a comprehensive guide for **Java Developers**, covering a wide range of topics from **Data Structures and Algorithms** to **backend technologies** and **cloud infrastructure**. Currently featuring DSA problems organized from **beginner to advanced levels**, with plans to expand into Java frameworks, databases, microservices, and DevOps tools. Each module focuses on specific topics with detailed implementations, multiple approaches, complexity analysis, and test cases.

## 🎯 Repository Goals
- Provide clean, well-documented solutions to DSA problems and Java development concepts
- Cover multiple approaches (naive, optimized, alternative methods)
- Include time and space complexity analysis for algorithms
- Serve as a comprehensive learning resource for Java developers
- Cover modern Java technologies: Spring, Spring Boot, Microservices, JPA, Hibernate
- Include database concepts: SQL, NoSQL
- Provide DevOps and cloud infrastructure guidance: Docker, Kubernetes, Cloud platforms
- Support learning through progressive difficulty levels
- Maintain modular organization for easy navigation

## 📂 Project Structure

```
Java-Developer-Guide/
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
├── LeetCodeProblems/            # LeetCode problem collections
│   ├── LeetCodeProblems-README.md  # Detailed module documentation
│   └── src/
│       ├── problems/            # 94 LeetCode sorting problems
│       ├── patterns/            # Reusable patterns
│       ├── blind75/             # Blind 75 curated problems
│       │   ├── easy/            # Easy difficulty
│       │   ├── medium/          # Medium difficulty
│       │   └── hard/            # Hard difficulty
│       └── samples/             # Helper utilities
├── SQL/                         # SQL Module
│   ├── SQL50-README.md          # Detailed module documentation
│   └── src/
│       ├── problems/            # SQL solutions by difficulty
│       │   ├── easy/            # Easy SQL problems
│       │   ├── medium/          # Medium SQL problems
│       │   └── hard/            # Hard SQL problems
│       ├── schemas/             # Database schemas & test data
│       └── docs/                # Problem documentation & concepts
├── JavaCore/                    # Core Java Concepts ⭐ NEW
│   ├── JavaCore-README.md       # Detailed module documentation
│   ├── concepts/                # Theoretical explanations
│   └── src/
│       ├── oop/                 # OOP fundamentals
│       │   ├── encapsulation/   # Data hiding & access control
│       │   ├── inheritance/     # Code reusability & hierarchy
│       │   ├── polymorphism/    # Runtime & compile-time
│       │   └── abstraction/     # Abstract classes & interfaces
│       ├── solid/               # SOLID principles
│       ├── design-patterns/     # Gang of Four patterns
│       │   ├── creational/      # Singleton, Factory, Builder
│       │   ├── structural/      # Adapter, Decorator, Proxy
│       │   └── behavioral/      # Strategy, Observer, Template
│       ├── collections/         # Collections Framework
│       ├── streams/             # Java 8+ Streams API
│       ├── multithreading/      # Concurrency & Threading
│       ├── generics/            # Generic programming
│       └── exceptions/          # Exception handling
└── [Future Modules]
    ├── LinkedLists/
    ├── Stacks/
    ├── Queues/
    ├── Trees/
    ├── Graphs/
    ├── DynamicProgramming/
    ├── SpringBoot/             # Spring Boot concepts & examples
    ├── Microservices/          # Microservices architecture
    ├── Docker/                 # Containerization
    ├── Kubernetes/             # Container orchestration
    └── Cloud/                  # Cloud platforms (AWS, Azure, GCP)
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

### 3. **LeetCodeProblems Module**
*Status: ✅ Active - 94 LeetCode Problems + Blind 75*

Comprehensive collection of LeetCode problems including sorting problems and curated Blind 75 interview problems, organized by difficulty.

**Topics Covered:**
- **LeetCode Problems**: All 94 easy-level sorting problems from LeetCode
- **Blind 75**: Curated collection organized by difficulty (easy/medium/hard)
  - 5 Easy problems (Two Sum, Linked List Cycle, Reverse Linked List, Merge Two Sorted Lists, Missing Number)
  - 9 Medium problems (3Sum, Reorder List, Word Break, and more)
  - 1 Hard problem (Merge k Sorted Lists)
  - Professional package structure for progressive learning
- **Pattern Library**: Reusable sorting patterns and techniques extracted from solutions
- **Problem-Solving Strategies**: Two-pointer, frequency counting, greedy, custom comparators, divide and conquer
- **Helper Utilities**: LinkedListUtils, testing and debugging tools

**Key Features:**
- Sequential problem solving (Problems 1-94)
- Blind 75 problems organized by difficulty with crisp algorithms
- Pattern documentation for reusable techniques
- Multiple approaches with complexity analysis
- Dedicated patterns package for high-level problem-solving strategies

📖 [View LeetCodeProblems Module Documentation](./LeetCodeProblems/LeetCodeProblems-README.md)  
🎯 [View Blind 75 Problems](./LeetCodeProblems/src/blind75/BLIND75_README.md)

---

### 4. **SQL Module** 
*Status: 🚀 Active - LeetCode SQL 50*

Master SQL through LeetCode's curated **SQL 50** problems, covering all essential database concepts from basic queries to advanced window functions.

**Topics Covered:**
- **Basic Queries** (1-5): SELECT, WHERE, AND/OR, DISTINCT, String functions
- **JOINs** (6-14): INNER JOIN, LEFT JOIN, SELF JOIN, CROSS JOIN
- **Aggregation** (15-20): COUNT, SUM, AVG, GROUP BY, HAVING, Date functions
- **Subqueries** (21-30): Scalar, correlated subqueries, IN, EXISTS
- **Window Functions** (31-40): ROW_NUMBER, RANK, DENSE_RANK, LAG, LEAD, partitioning
- **Advanced Topics** (41-50): CTEs, UNION, CASE, REGEX, DELETE, UPDATE, complex queries

**Key Features:**
- Complete LeetCode SQL 50 problem collection organized by difficulty
- Comprehensive documentation with detailed concept explanations
- Database schemas with test data for each problem
- Detailed documentation with multiple solution approaches
- Step-by-step query explanations and performance analysis
- MySQL 8.0 syntax with PostgreSQL compatibility notes

**Module Structure:**
- **Problems**: 50 total (20 Easy, 20 Medium, 10 Hard)
- **Schemas**: DDL and test data for all problems
- **Documentation**: Detailed README for each problem with concept explanations

📖 [View SQL Module Documentation](SQL/SQL50-README.md)

---

### 5. **JavaCore Module** ⭐ NEW
*Status: 🚀 Active - OOP Fundamentals in Progress*

Comprehensive coverage of **Core Java concepts** essential for technical interviews at top-tier companies. Focus on Object-Oriented Programming, SOLID principles, Design Patterns, Collections, Multithreading, and Java 8+ features.

**Topics Covered:**
- **OOP Fundamentals**: 
  - ✅ Encapsulation (Completed - 3 examples: PasswordManager, UserProfile, BankAccount)
  - 🔜 Inheritance
  - 🔜 Polymorphism
  - 🔜 Abstraction
- **SOLID Principles**: Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion
- **Design Patterns**: 
  - Creational (Singleton, Factory, Builder, Prototype)
  - Structural (Adapter, Decorator, Proxy, Facade)
  - Behavioral (Strategy, Observer, Template, Command)
- **Collections Framework**: List, Set, Map implementations, HashMap internals, ConcurrentHashMap
- **Java 8+ Features**: Lambda expressions, Streams API, Functional interfaces, Method references
- **Multithreading**: Thread creation, Synchronization, ExecutorService, Concurrent utilities
- **Generics**: Generic classes, Bounded types, Wildcards
- **Exception Handling**: Try-catch, Custom exceptions, Best practices

**Key Features:**
- Structured learning path for freshers to senior developers
- Real-world examples with practical applications
- Interview-focused preparation with Q&A sections
- Progressive difficulty levels
- Clean, well-documented code examples
- Defensive programming and best practices

**Implementation Roadmap:**
- **Phase 1** (Current): OOP Fundamentals
  - ✅ Encapsulation: Data hiding, validation, defensive copying
  - 🔜 Inheritance: Class hierarchies, method overriding
  - 🔜 Polymorphism: Method overloading, dynamic dispatch
  - 🔜 Abstraction: Abstract classes, interfaces
- **Phase 2**: SOLID Principles
- **Phase 3**: Design Patterns
- **Phase 4**: Collections Framework
- **Phase 5**: Multithreading & Concurrency
- **Phase 6**: Java 8+ Features (Streams, Lambda)

**Completed Components:**
- **Encapsulation**: 3 practical examples with full documentation
  - PasswordManager: Secure password validation and management
  - UserProfile: User management with roles, preferences, timestamps
  - BankAccount: Banking operations with balance protection
  - Complete README with interview questions and best practices

**Module Structure:**
- **Concepts**: Theoretical explanations and documentation
- **Code Examples**: Practical implementations for each topic
- **Interview Questions**: Curated Q&A for interview preparation
- **Best Practices**: Industry-standard coding patterns

📖 [View JavaCore Module Documentation](./JavaCore/JavaCore-README.md)

---

### 6. **Future Modules** 
*Status: 🔜 Planned*

#### Coming Soon - DSA Modules:
- **Linked Lists**: Singly, Doubly, Circular lists, reversal, cycle detection
- **Stacks & Queues**: Implementations, balanced parentheses, next greater element
- **Trees**: Binary trees, BST, traversals, height, diameter
- **Graphs**: BFS, DFS, shortest path, cycle detection
- **Dynamic Programming**: Knapsack, LCS, Matrix chain multiplication
- **Hashing**: Hash maps, collision handling, frequency problems
- **Searching & Sorting**: Binary search variants, Quick sort, Merge sort
- **Greedy Algorithms**: Activity selection, Huffman coding
- **Backtracking**: N-Queens, Sudoku solver, Permutations

#### Planned - Java & Backend Technologies:
- **Core Java**: OOP, Collections, Generics, Streams, Concurrency
- **Spring Framework**: IoC, DI, AOP, Spring MVC
- **Spring Boot**: Auto-configuration, REST APIs, Actuator, Profiles
- **JPA & Hibernate**: Entity mapping, Relationships, Queries, Caching
- **Microservices**: Service design, Communication patterns, API Gateway
- **Spring Security**: Authentication, Authorization, JWT, OAuth2
- **Databases**: SQL (MySQL, PostgreSQL), NoSQL (MongoDB, Redis)
- **Docker**: Containerization, Docker Compose, Multi-stage builds
- **Kubernetes**: Pods, Services, Deployments, ConfigMaps, Secrets
- **Cloud Platforms**: AWS, Azure, GCP essentials

## 🚀 Getting Started

### Prerequisites
- **Java Development Kit (JDK)**: Version 8 or higher
- **IDE**: IntelliJ IDEA (recommended), Eclipse, or any Java IDE
- **Build Tool**: Maven or Gradle (optional)

### Running the Code

#### Option 1: Using IntelliJ IDEA
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/Java-Developer-Guide.git
   ```
2. Open the project in IntelliJ IDEA
3. Navigate to any problem file (e.g., `Basics/src/problems/numbers/ReverseNumber.java`)
4. Right-click on the file → **Run 'ClassName.main()'**
5. View output in the console

#### Option 2: Command Line
```bash
# Navigate to module directory
cd Java-Developer-Guide/Basics

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
| LeetCodeProblems | 0 / 94 | ✅ Active | Easy |
| Blind 75 | 13 / 75 | ✅ Active | Easy → Hard |
| SQL | 5 / 50 | ✅ Active | Easy → Hard |
| JavaCore | 0 / 60+ | ✅ Active | Beginner → Advanced |
| Linked Lists | 0 | 🔜 Planned | Beginner → Advanced |
| Stacks & Queues | 0 | 🔜 Planned | Beginner → Medium |
| Trees | 0 | 🔜 Planned | Medium → Advanced |
| Graphs | 0 | 🔜 Planned | Medium → Advanced |
| Dynamic Programming | 0 | 🔜 Planned | Medium → Advanced |

**Total Problems Solved: 49**  
**LeetCode Problems: 0 / 94**  
**Blind 75 Problems: 13 / 75** ⭐  
**SQL Problems: 5 / 50** (10%) ⭐  
**JavaCore Topics: Structure Ready** ⭐ NEW

## 🎓 Learning Path

### For Beginners:
1. Start with **Basics Module** - Numbers section
2. Move to **Basics Module** - Strings section
3. Begin **JavaCore Module** - OOP Fundamentals
4. Practice **Arrays Module** - Basic problems
5. Continue with **Arrays Module** - Sorting algorithms
6. Practice **SQL Module** - Easy problems (1-5)
7. Attempt **LeetCodeProblems Module** - Sequential problems

### For Intermediate:
1. Complete **Basics Module** level1 string problems
2. Master **JavaCore Module** - SOLID principles and Collections
3. Work through **Arrays Module** level2 problems
4. Practice **SQL Module** - Medium problems with JOINs
5. Tackle **LeetCodeProblems Module** - Blind 75 problems
6. Study **JavaCore Module** - Design Patterns
7. Move to **Linked Lists** and **Stacks/Queues** (when available)

### For Advanced:
1. Complete **JavaCore Module** - Multithreading and advanced topics
2. Master **SQL Module** - Window functions and complex queries
3. Focus on **Trees** and **Graphs** modules (when available)
4. Master **Dynamic Programming** patterns
5. Solve **Backtracking** and **Greedy** problems
6. Apply **Design Patterns** from JavaCore in real projects

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

**Last Updated:** December 16, 2025  
**Version:** 1.1.0

