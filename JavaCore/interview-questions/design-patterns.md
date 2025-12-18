# Design Patterns - Interview Questions

[← Back to Problem Set](problem-set.md)

## Table of Contents
1. [Design Patterns Fundamentals](#design-patterns-fundamentals)
2. [Creational Patterns](#creational-patterns)
3. [Structural Patterns](#structural-patterns)
4. [Behavioral Patterns](#behavioral-patterns)
5. [Advanced Topics](#advanced-topics)

---

## Design Patterns Fundamentals

1. [What is a design pattern?](./solutions/designpattern-solutions.md#q1-what-is-a-design-pattern)

2. [Why are design patterns important?](./solutions/designpattern-solutions.md#q2-why-are-design-patterns-important)

3. [What are the main categories of design patterns?](./solutions/designpattern-solutions.md#q3-what-are-the-main-categories-of-design-patterns)

4. [Who are the Gang of Four (GoF)?](./solutions/designpattern-solutions.md#q4-who-are-the-gang-of-four-gof)

5. [What is the difference between design patterns and design principles?](./solutions/designpattern-solutions.md#q5-what-is-the-difference-between-design-patterns-and-design-principles)

6. [How do design patterns relate to SOLID principles?](./solutions/designpattern-solutions.md#q6-how-do-design-patterns-relate-to-solid-principles)

7. [When should you use design patterns?](./solutions/designpattern-solutions.md#q7-when-should-you-use-design-patterns)

8. [What are the risks of overusing design patterns?](./solutions/designpattern-solutions.md#q8-what-are-the-risks-of-overusing-design-patterns)

[↑ Back to Table of Contents](#table-of-contents)

---

## Creational Patterns

**Singleton Pattern (9-14)**

9. [What is the Singleton pattern?](./solutions/designpattern-solutions.md#q9-what-is-the-singleton-pattern)

10. [How do you implement a thread-safe Singleton?](./solutions/designpattern-solutions.md#q10-how-do-you-implement-a-thread-safe-singleton)

11. [What is the double-checked locking pattern?](./solutions/designpattern-solutions.md#q11-what-is-the-double-checked-locking-pattern)

12. [What is the Bill Pugh Singleton implementation?](./solutions/designpattern-solutions.md#q12-what-is-the-bill-pugh-singleton-implementation)

13. [What are the drawbacks of the Singleton pattern?](./solutions/designpattern-solutions.md#q13-what-are-the-drawbacks-of-the-singleton-pattern)

14. [How does the Singleton pattern violate SOLID principles?](./solutions/designpattern-solutions.md#q14-how-does-the-singleton-pattern-violate-solid-principles)

**Factory Pattern (15-20)**

15. [What is the Factory pattern?](./solutions/designpattern-solutions.md#q15-what-is-the-factory-pattern)

16. [What is the difference between Factory Method and Abstract Factory?](./solutions/designpattern-solutions.md#q16-what-is-the-difference-between-factory-method-and-abstract-factory)

17. [When should you use the Factory pattern?](./solutions/designpattern-solutions.md#q17-when-should-you-use-the-factory-pattern)

18. [How does the Factory pattern promote loose coupling?](./solutions/designpattern-solutions.md#q18-how-does-the-factory-pattern-promote-loose-coupling)

19. [Can you give a real-world example of the Factory pattern?](./solutions/designpattern-solutions.md#q19-can-you-give-a-real-world-example-of-the-factory-pattern)

20. [What are the advantages of the Factory pattern?](./solutions/designpattern-solutions.md#q20-what-are-the-advantages-of-the-factory-pattern)

**Builder Pattern (21-25)**

21. [What is the Builder pattern?](./solutions/designpattern-solutions.md#q21-what-is-the-builder-pattern)

22. [When should you use the Builder pattern?](./solutions/designpattern-solutions.md#q22-when-should-you-use-the-builder-pattern)

23. [How does the Builder pattern differ from constructor telescoping?](./solutions/designpattern-solutions.md#q23-how-does-the-builder-pattern-differ-from-constructor-telescoping)

24. [What is a fluent interface in the Builder pattern?](./solutions/designpattern-solutions.md#q24-what-is-a-fluent-interface-in-the-builder-pattern)

25. [Can you implement the Builder pattern with method chaining?](./solutions/designpattern-solutions.md#q25-can-you-implement-the-builder-pattern-with-method-chaining)

**Prototype Pattern (26-28)**

26. [What is the Prototype pattern?](./solutions/designpattern-solutions.md#q26-what-is-the-prototype-pattern)

27. [How does the Prototype pattern use cloning?](./solutions/designpattern-solutions.md#q27-how-does-the-prototype-pattern-use-cloning)

28. [What is the difference between shallow copy and deep copy?](./solutions/designpattern-solutions.md#q28-what-is-the-difference-between-shallow-copy-and-deep-copy)

[↑ Back to Table of Contents](#table-of-contents)

---

## Structural Patterns

**Adapter Pattern (29-32)**

29. [What is the Adapter pattern?](./solutions/designpattern-solutions.md#q29-what-is-the-adapter-pattern)

30. [What is the difference between class adapter and object adapter?](./solutions/designpattern-solutions.md#q30-what-is-the-difference-between-class-adapter-and-object-adapter)

31. [When should you use the Adapter pattern?](./solutions/designpattern-solutions.md#q31-when-should-you-use-the-adapter-pattern)

32. [Can you give a real-world example of the Adapter pattern?](./solutions/designpattern-solutions.md#q32-can-you-give-a-real-world-example-of-the-adapter-pattern)

**Decorator Pattern (33-37)**

33. [What is the Decorator pattern?](./solutions/designpattern-solutions.md#q33-what-is-the-decorator-pattern)

34. [How does the Decorator pattern add functionality dynamically?](./solutions/designpattern-solutions.md#q34-how-does-the-decorator-pattern-add-functionality-dynamically)

35. [What is the difference between Decorator and Inheritance?](./solutions/designpattern-solutions.md#q35-what-is-the-difference-between-decorator-and-inheritance)

36. [How is the Decorator pattern used in Java I/O streams?](./solutions/designpattern-solutions.md#q36-how-is-the-decorator-pattern-used-in-java-io-streams)

37. [What are the advantages of the Decorator pattern?](./solutions/designpattern-solutions.md#q37-what-are-the-advantages-of-the-decorator-pattern)

**Proxy Pattern (38-41)**

38. [What is the Proxy pattern?](./solutions/designpattern-solutions.md#q38-what-is-the-proxy-pattern)

39. [What are the different types of proxies (Virtual, Remote, Protection)?](./solutions/designpattern-solutions.md#q39-what-are-the-different-types-of-proxies-virtual-remote-protection)

40. [How does dynamic proxy work in Java?](./solutions/designpattern-solutions.md#q40-how-does-dynamic-proxy-work-in-java)

41. [What is the difference between Proxy and Decorator patterns?](./solutions/designpattern-solutions.md#q41-what-is-the-difference-between-proxy-and-decorator-patterns)

**Facade Pattern (42-44)**

42. [What is the Facade pattern?](./solutions/designpattern-solutions.md#q42-what-is-the-facade-pattern)

43. [When should you use the Facade pattern?](./solutions/designpattern-solutions.md#q43-when-should-you-use-the-facade-pattern)

44. [How does the Facade pattern simplify complex subsystems?](./solutions/designpattern-solutions.md#q44-how-does-the-facade-pattern-simplify-complex-subsystems)

**Bridge Pattern (45-47)**

45. [What is the Bridge pattern?](./solutions/designpattern-solutions.md#q45-what-is-the-bridge-pattern)

46. [How does the Bridge pattern decouple abstraction from implementation?](./solutions/designpattern-solutions.md#q46-how-does-the-bridge-pattern-decouple-abstraction-from-implementation)

47. [When should you use the Bridge pattern?](./solutions/designpattern-solutions.md#q47-when-should-you-use-the-bridge-pattern)

**Composite Pattern (48-50)**

48. [What is the Composite pattern?](./solutions/designpattern-solutions.md#q48-what-is-the-composite-pattern)

49. [How does the Composite pattern handle tree structures?](./solutions/designpattern-solutions.md#q49-how-does-the-composite-pattern-handle-tree-structures)

50. [Can you give an example of the Composite pattern?](./solutions/designpattern-solutions.md#q50-can-you-give-an-example-of-the-composite-pattern)

**Flyweight Pattern (51-52)**

51. [What is the Flyweight pattern?](./solutions/designpattern-solutions.md#q51-what-is-the-flyweight-pattern)

52. [How does the Flyweight pattern optimize memory usage?](./solutions/designpattern-solutions.md#q52-how-does-the-flyweight-pattern-optimize-memory-usage)

[↑ Back to Table of Contents](#table-of-contents)

---

## Behavioral Patterns

**Strategy Pattern (53-57)**

82. [What is the Mediator pattern?](./solutions/designpattern-solutions.md#q82-what-is-the-mediator-pattern)

83. [How does the Mediator pattern reduce coupling between objects?](./solutions/designpattern-solutions.md#q83-how-does-the-mediator-pattern-reduce-coupling-between-objects)

84. [When should you use the Mediator pattern?](./solutions/designpattern-solutions.md#q84-when-should-you-use-the-mediator-pattern)

56. [How does the Strategy pattern relate to the Open/Closed Principle?](./solutions/designpattern-solutions.md#q56-how-does-the-strategy-pattern-relate-to-the-openclosed-principle)

57. [Can you implement the Strategy pattern with lambda expressions in Java 8?](./solutions/designpattern-solutions.md#q57-can-you-implement-the-strategy-pattern-with-lambda-expressions-in-java-8)

**Observer Pattern (58-62)**

58. [What is the Observer pattern?](./solutions/designpattern-solutions.md#q58-what-is-the-observer-pattern)

59. [How does the Observer pattern implement the publish-subscribe model?](./solutions/designpattern-solutions.md#q59-how-does-the-observer-pattern-implement-the-publish-subscribe-model)

60. [What is the difference between push and pull models in Observer?](./solutions/designpattern-solutions.md#q60-what-is-the-difference-between-push-and-pull-models-in-observer)

61. [How is the Observer pattern used in Java (Observable, Observer)?](./solutions/designpattern-solutions.md#q61-how-is-the-observer-pattern-used-in-java-observable-observer)

62. [What are the drawbacks of the Observer pattern?](./solutions/designpattern-solutions.md#q62-what-are-the-drawbacks-of-the-observer-pattern)

**Command Pattern (63-66)**

63. [What is the Command pattern?](./solutions/designpattern-solutions.md#q63-what-is-the-command-pattern)

64. [How does the Command pattern encapsulate requests?](./solutions/designpattern-solutions.md#q64-how-does-the-command-pattern-encapsulate-requests)

65. [How does the Command pattern support undo/redo operations?](./solutions/designpattern-solutions.md#q65-how-does-the-command-pattern-support-undoredo-operations)

66. [Can you give a real-world example of the Command pattern?](./solutions/designpattern-solutions.md#q66-can-you-give-a-real-world-example-of-the-command-pattern)

**Template Method Pattern (67-70)**

67. [What is the Template Method pattern?](./solutions/designpattern-solutions.md#q67-what-is-the-template-method-pattern)

68. [How does the Template Method pattern define algorithm skeletons?](./solutions/designpattern-solutions.md#q68-how-does-the-template-method-pattern-define-algorithm-skeletons)

69. [What is the difference between Template Method and Strategy patterns?](./solutions/designpattern-solutions.md#q69-what-is-the-difference-between-template-method-and-strategy-patterns)

70. [When should you use the Template Method pattern?](./solutions/designpattern-solutions.md#q70-when-should-you-use-the-template-method-pattern)

**Iterator Pattern (71-73)**

71. [What is the Iterator pattern?](./solutions/designpattern-solutions.md#q71-what-is-the-iterator-pattern)

72. [How is the Iterator pattern used in Java Collections?](./solutions/designpattern-solutions.md#q72-how-is-the-iterator-pattern-used-in-java-collections)

73. [What is the difference between Iterator and Iterable?](./solutions/designpattern-solutions.md#q73-what-is-the-difference-between-iterator-and-iterable)

**State Pattern (74-77)**

74. [What is the State pattern?](./solutions/designpattern-solutions.md#q74-what-is-the-state-pattern)

75. [How does the State pattern manage state transitions?](./solutions/designpattern-solutions.md#q75-how-does-the-state-pattern-manage-state-transitions)

76. [What is the difference between State and Strategy patterns?](./solutions/designpattern-solutions.md#q76-what-is-the-difference-between-state-and-strategy-patterns)

77. [When should you use the State pattern?](./solutions/designpattern-solutions.md#q77-when-should-you-use-the-state-pattern)

**Chain of Responsibility Pattern (78-81)**

78. [What is the Chain of Responsibility pattern?](./solutions/designpattern-solutions.md#q78-what-is-the-chain-of-responsibility-pattern)

79. [How does the Chain of Responsibility pattern process requests?](./solutions/designpattern-solutions.md#q79-how-does-the-chain-of-responsibility-pattern-process-requests)

80. [Can you give a real-world example of this pattern?](./solutions/designpattern-solutions.md#q80-can-you-give-a-real-world-example-of-this-pattern)

81. [What are the advantages and disadvantages of this pattern?](./solutions/designpattern-solutions.md#q81-what-are-the-advantages-and-disadvantages-of-this-pattern)

**Mediator Pattern (82-84)**

82. [What is the Mediator pattern?](./solutions/designpattern-solutions.md#q82-what-is-the-mediator-pattern)

83. [How does the Mediator pattern reduce coupling between objects?](./solutions/designpattern-solutions.md#q83-how-does-the-mediator-pattern-reduce-coupling-between-objects)

84. [When should you use the Mediator pattern?](./solutions/designpattern-solutions.md#q84-when-should-you-use-the-mediator-pattern)

**Memento Pattern (85-87)**

85. [What is the Memento pattern?](./solutions/designpattern-solutions.md#q85-what-is-the-memento-pattern)

86. [How does the Memento pattern implement undo functionality?](./solutions/designpattern-solutions.md#q86-how-does-the-memento-pattern-implement-undo-functionality)

87. [What are the three roles in the Memento pattern?](./solutions/designpattern-solutions.md#q87-what-are-the-three-roles-in-the-memento-pattern)

**Visitor Pattern (88-90)**

88. [What is the Visitor pattern?](./solutions/designpattern-solutions.md#q88-what-is-the-visitor-pattern)

89. [How does the Visitor pattern add operations to objects without modifying them?](./solutions/designpattern-solutions.md#q89-how-does-the-visitor-pattern-add-operations-to-objects-without-modifying-them)

90. [What is double dispatch in the Visitor pattern?](./solutions/designpattern-solutions.md#q90-what-is-double-dispatch-in-the-visitor-pattern)

[↑ Back to Table of Contents](#table-of-contents)

---

## Advanced Topics

91. [What are anti-patterns? Give examples.](./solutions/designpattern-solutions.md#q91-what-are-anti-patterns-give-examples)

92. [What is dependency injection? Is it a design pattern?](./solutions/designpattern-solutions.md#q92-what-is-dependency-injection-is-it-a-design-pattern)

93. [How do design patterns relate to microservices architecture?](./solutions/designpattern-solutions.md#q93-how-do-design-patterns-relate-to-microservices-architecture)

94. [What is the MVC pattern?](./solutions/designpattern-solutions.md#q94-what-is-the-mvc-pattern)

95. [What is the difference between MVC and MVP patterns?](./solutions/designpattern-solutions.md#q95-what-is-the-difference-between-mvc-and-mvp-patterns)

96. [What is the MVVM pattern?](./solutions/designpattern-solutions.md#q96-what-is-the-mvvm-pattern)

97. [What are architectural patterns vs design patterns?](./solutions/designpattern-solutions.md#q97-what-are-architectural-patterns-vs-design-patterns)

98. [How do you choose the right design pattern for a problem?](./solutions/designpattern-solutions.md#q98-how-do-you-choose-the-right-design-pattern-for-a-problem)

99. [Can multiple design patterns be combined? Give examples.](./solutions/designpattern-solutions.md#q99-can-multiple-design-patterns-be-combined-give-examples)

100. [What are the limitations of design patterns?](./solutions/designpattern-solutions.md#q100-what-are-the-limitations-of-design-patterns)

[↑ Back to Table of Contents](#table-of-contents)

---

[← Back to Problem Set](problem-set.md)

