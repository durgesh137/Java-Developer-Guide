# JavaCore Interview Questions - Problem Set

**Purpose:** Collection of interview questions to test understanding of Java Core concepts  
**Format:** Questions only (no answers) - for self-assessment and practice  
**Last Updated:** December 16, 2025

---

## Table of Contents
1. [OOP (Object-Oriented Programming)](#oop-object-oriented-programming)
2. [Collections Framework](#collections-framework) (Coming Soon)
3. [Multithreading & Concurrency](#multithreading--concurrency) (Coming Soon)
4. [Java 8+ Features](#java-8-features) (Coming Soon)
5. [Exception Handling](#exception-handling) (Coming Soon)
6. [Design Patterns](#design-patterns) (Coming Soon)

---

## OOP (Object-Oriented Programming)

### Encapsulation

**Basic Concepts (1-10)**

1. What is encapsulation in Java?

2. Why should fields be declared as private in a class?

3. What is the difference between `private`, `protected`, `public`, and default (package-private) access modifiers?

4. What are getters and setters? Why do we use them instead of making fields public?

5. Explain data hiding. How does it relate to encapsulation?

6. What is defensive copying? When and why should you use it?

7. Why should you return unmodifiable collections from getter methods?

8. What is the benefit of using `Objects.requireNonNull()` in setters?

9. How does encapsulation improve code maintainability?

10. Can you access private members of a class from outside the class? If yes, how?

**Intermediate Concepts (11-20)**

11. What happens if a subclass tries to access a private field of its parent class?

12. Explain the difference between encapsulation and abstraction.

13. How do you encapsulate a collection field properly in a class?

14. What is field shadowing? How can you resolve it using encapsulation principles?

15. Why is it recommended to validate input in constructors and setters?

16. What is the purpose of making fields `final`? How does it relate to encapsulation?

17. How would you design a class to be immutable? What role does encapsulation play?

18. Explain the concept of "tight encapsulation" vs "loose encapsulation".

19. What are the trade-offs between using direct field access vs getters/setters within the same class?

20. How does encapsulation support the Single Responsibility Principle?

**Advanced Concepts (21-25)**

21. How would you implement a read-only property in Java?

22. Can you change the return type of a getter method in a subclass? What are the implications?

23. How do you handle encapsulation when dealing with mutable objects like `Date` or `List`?

24. Explain how encapsulation helps with unit testing and mocking.

25. Design a class that demonstrates proper encapsulation with validation, defensive copying, and audit trail (timestamps).

---

### Inheritance

**Basic Concepts (26-35)**

26. What is inheritance in Java? Why is it useful?

27. What keyword is used to inherit a class in Java?

28. What is the purpose of the `super` keyword?

29. Can you call a parent class constructor from a child class? How?

30. What is the rule about calling `super()` in a constructor?

31. What happens if you don't explicitly call `super()` in a child class constructor?

32. Can a class extend multiple classes in Java? Why or why not?

33. What is the difference between `this` and `super` keywords?

34. How do you call a parent class method from a child class?

35. What is the root class of all classes in Java?

**Intermediate Concepts (36-50)**

36. What is method overriding? How is it different from method overloading?

37. What is the significance of the `@Override` annotation?

38. Can you override a private method? Why or why not?

39. Can you override a static method? What happens if you try?

40. Can you override a final method?

41. What is constructor chaining? Explain with an example scenario.

42. How does the `protected` access modifier behave in inheritance, especially across different packages?

43. What is the difference between IS-A and HAS-A relationships?

44. Can a child class reduce the visibility of an overridden method?

45. What are the rules for method overriding in terms of return types?

46. Explain covariant return types in Java.

47. What is the difference between inheritance and composition? When would you choose one over the other?

48. Can you access a parent's parent class method directly (skip a level)?

49. What happens to parent class constructors when you create a child class object?

50. How do instance initializer blocks behave in inheritance?

**Advanced Concepts (51-60)**

51. What is the diamond problem? How does Java handle it?

52. Explain the difference between compile-time binding and runtime binding in inheritance.

53. How does inheritance affect memory allocation in Java?

54. What is the Liskov Substitution Principle? How does it relate to inheritance?

55. Can you prevent a class from being inherited? How?

56. What are the disadvantages of using inheritance extensively?

57. How would you refactor code that has deep inheritance hierarchies?

58. Explain how inheritance works with static members and static methods.

59. What is the fragile base class problem? How can you avoid it?

60. Design a multi-level inheritance hierarchy demonstrating proper use of `super`, access modifiers, and method overriding.

---

### Polymorphism

**Basic Concepts (61-70)**

61. What is polymorphism in Java?

62. What are the two types of polymorphism in Java?

63. What is compile-time polymorphism? Give an example.

64. What is runtime polymorphism? Give an example.

65. What is method overloading?

66. Can you overload methods by only changing the return type?

67. What is method overriding?

68. How does the JVM determine which overridden method to call at runtime?

69. What is dynamic method dispatch?

70. Can you achieve polymorphism without inheritance?

**Intermediate Concepts (71-85)**

71. What is the difference between static binding and dynamic binding?

72. Can you overload static methods?

73. Can you override static methods?

74. What happens if you try to call an overloaded method with arguments that don't exactly match any method signature?

75. Explain type promotion in method overloading.

76. Can constructors be overloaded? Can they be overridden?

77. What is the difference between early binding and late binding?

78. How does polymorphism help in achieving loose coupling?

79. Can you override a method and change its access modifier?

80. What is the relationship between polymorphism and interfaces?

81. Explain upcasting and downcasting with examples.

82. When would you use `instanceof` operator in polymorphic scenarios?

83. Can you overload methods with different exception declarations?

84. What happens when you call an overridden method from a parent class constructor?

85. How do generics interact with polymorphism?

**Advanced Concepts (86-95)**

86. What is the difference between ad-hoc polymorphism and parametric polymorphism?

87. Explain how virtual method invocation works in Java.

88. What is the vtable (virtual method table)? How does it relate to polymorphism?

89. Can you achieve polymorphism with private methods? Why or why not?

90. What are the performance implications of polymorphism?

91. How does polymorphism support the Open/Closed Principle?

92. Explain the strategy pattern and how it uses polymorphism.

93. What is method hiding vs method overriding?

94. How would you design a payment processing system using polymorphism?

95. What are the trade-offs between using inheritance-based polymorphism vs interface-based polymorphism?

---

### Abstraction

**Basic Concepts (96-105)**

96. What is abstraction in Java?

97. What is an abstract class?

98. What is an interface?

99. Can you create an object of an abstract class?

100. Can an abstract class have constructors?

101. Can abstract classes have static methods?

102. Can abstract classes have final methods?

103. What is the difference between an abstract class and a concrete class?

104. Can you declare abstract methods without an abstract class?

105. Can interfaces have constructors?

**Intermediate Concepts (106-125)**

106. What is the difference between an abstract class and an interface?

107. When should you use an abstract class vs an interface?

108. Can an abstract class implement an interface without implementing its methods?

109. Can an interface extend another interface?

110. Can a class extend an abstract class and implement an interface at the same time?

111. Can abstract methods be private?

112. Can abstract methods be static?

113. Can abstract methods be final?

114. What are default methods in interfaces (Java 8+)? Why were they introduced?

115. What are static methods in interfaces (Java 8+)?

116. Can you override default methods from an interface?

117. What happens if a class implements two interfaces with the same default method?

118. Can abstract classes have instance variables? Can interfaces have them?

119. What is a marker interface? Give examples.

120. What is a functional interface?

121. Can an abstract class be declared final?

122. What is the purpose of the `@FunctionalInterface` annotation?

123. Can interfaces have private methods (Java 9+)?

124. How many abstract classes can a single class extend?

125. How many interfaces can a single class implement?

**Advanced Concepts (126-140)**

126. What is the diamond problem in multiple inheritance? How do Java interfaces solve it?

127. Explain the evolution of interfaces from Java 7 to Java 9+.

128. How does abstraction help in achieving loose coupling?

129. What is the difference between abstraction and encapsulation in terms of design goals?

130. Can you have protected methods in interfaces?

131. What are the best practices for designing abstract classes?

132. How do abstract classes and interfaces support the Dependency Inversion Principle?

133. When would you choose an abstract class over an interface in modern Java (Java 8+)?

134. Explain how the Template Method pattern uses abstraction.

135. Can you serialize an interface reference? What actually gets serialized?

136. How do you handle versioning of interfaces without breaking existing implementations?

137. What is the role of abstraction in API design?

138. Design a plugin architecture using abstract classes and interfaces.

139. Compare abstraction in Java vs other languages (e.g., abstract classes in C++ vs Java).

140. What are sealed classes (Java 17+)? How do they relate to abstraction?

---

### General OOP Questions

**Fundamental Principles (141-155)**

141. What are the four pillars of Object-Oriented Programming?

142. Explain the concept of a class in Java.

143. What is an object? How is it different from a class?

144. What is the difference between a class and an object?

145. What is the purpose of a constructor?

146. Can you overload constructors?

147. What is a default constructor?

148. What is a parameterized constructor?

149. What is a copy constructor?

150. Can you have a class without any constructor?

151. What is the `this` keyword? What are its uses?

152. Can you call one constructor from another in the same class?

153. What is constructor chaining?

154. What is the difference between instance variables and class variables?

155. What is the purpose of the `static` keyword?

**Design & Best Practices (156-175)**

156. What is the difference between composition and aggregation?

157. Why is "composition over inheritance" often recommended?

158. What is tight coupling vs loose coupling?

159. How do you achieve loose coupling in Java?

160. What is the Law of Demeter (Principle of Least Knowledge)?

161. What is cohesion? How does it relate to OOP?

162. Explain the DRY (Don't Repeat Yourself) principle.

163. What is the SOLID principle? Briefly explain each letter.

164. What is the Single Responsibility Principle?

165. What is the Open/Closed Principle?

166. What is the Liskov Substitution Principle?

167. What is the Interface Segregation Principle?

168. What is the Dependency Inversion Principle?

169. What is method chaining? How do you implement it?

170. What is a fluent interface?

171. What is the difference between association, aggregation, and composition?

172. How do you design for testability in OOP?

173. What are code smells related to OOP?

174. What is object cloning? What are shallow copy and deep copy?

175. How do you implement deep cloning in Java?

**Advanced OOP Concepts (176-200)**

176. What is reflection in Java? How does it relate to OOP?

177. What is introspection?

178. What are anonymous classes? When would you use them?

179. What are nested classes? What are the different types?

180. What is a static nested class?

181. What is an inner class?

182. What is a local class?

183. What is the difference between a nested class and an inner class?

184. Can static nested classes access instance members of the outer class?

185. What is a lambda expression? How does it relate to OOP?

186. How do method references work in Java 8+?

187. What is the `Object` class? What methods does it provide?

188. Why should you override `equals()` and `hashCode()` together?

189. What is the contract between `equals()` and `hashCode()`?

190. What is the purpose of the `toString()` method?

191. What is the `finalize()` method? Should you use it?

192. What are records (Java 14+)? How do they simplify OOP?

193. What is the difference between mutable and immutable objects?

194. How do you create an immutable class in Java?

195. What is object pooling? When would you use it?

196. What is the prototype pattern? How does it use cloning?

197. What is multiple inheritance? Why doesn't Java support it for classes?

198. How can you achieve multiple inheritance behavior in Java?

199. What is the difference between has-a, is-a, and uses-a relationships?

200. Design a complete OOP system (e.g., library management, parking lot) demonstrating all four OOP principles.

---

## Quick Reference

**Total Questions by Topic:**
- Encapsulation: 25 questions (1-25)
- Inheritance: 35 questions (26-60)
- Polymorphism: 35 questions (61-95)
- Abstraction: 45 questions (96-140)
- General OOP: 60 questions (141-200)

**Total:** 200 OOP Interview Questions

**Difficulty Levels:**
- Basic: Questions 1-10, 26-35, 61-70, 96-105, 141-155
- Intermediate: Questions 11-20, 36-50, 71-85, 106-125, 156-175
- Advanced: Questions 21-25, 51-60, 86-95, 126-140, 176-200

---

**Note:** These questions are designed for self-assessment. Practice answering them without looking at external resources first, then verify your understanding by researching and coding examples.

**Study Tip:** For best results:
1. Try to answer the question without any resources
2. Write code examples to demonstrate your answer
3. Verify your understanding with official documentation
4. Revisit questions you struggled with

**Related Resources:**
- [Encapsulation Examples](../src/oop/encapsulation/)
- [Inheritance Examples](../src/oop/inheritance/)
- [Polymorphism Examples](../src/oop/polymorphism/)
- [Abstraction Examples](../src/oop/abstraction/)

---

*Part of JavaCore Module - Interview Preparation*

