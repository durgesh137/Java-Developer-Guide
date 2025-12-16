# JavaCore Interview Questions - Problem Set

**Purpose:** Collection of interview questions to test understanding of Java Core concepts  
**Format:** Questions only (no answers) - for self-assessment and practice  
**Last Updated:** December 16, 2025

---

## Table of Contents
1. [OOP (Object-Oriented Programming)](#oop-object-oriented-programming)
2. [Collections Framework](#collections-framework)
3. [Multithreading & Concurrency](#multithreading--concurrency)
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

[↑ Back to Table of Contents](#table-of-contents) | [↑ Encapsulation](#encapsulation)

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

[↑ Back to Table of Contents](#table-of-contents) | [↑ Inheritance](#inheritance)

---

### Polymorphism

[Next Section: Abstraction →](#abstraction)

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

[↑ Back to Table of Contents](#table-of-contents) | [↑ Polymorphism](#polymorphism)

---

### Abstraction

[Next Section: General OOP Questions →](#general-oop-questions)

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

[↑ Back to Table of Contents](#table-of-contents) | [↑ Abstraction](#abstraction)

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

[↑ Back to Table of Contents](#table-of-contents) | [↑ General OOP Questions](#general-oop-questions)

---

## Collections Framework

### Collection Interface & Hierarchy

**Basic Concepts (201-215)**

201. What is the Java Collections Framework?

202. What is the root interface of the Java Collections Framework?

203. What is the difference between Collection and Collections in Java?

204. What are the main interfaces in the Collections Framework?

205. Explain the hierarchy of the Collection interface.

206. What is the difference between Collection and Map interfaces?

207. What are the main sub-interfaces of the Collection interface?

208. Why doesn't the Map interface extend the Collection interface?

209. What is an Iterator? How does it work?

210. What is the difference between Iterator and Enumeration?

211. What is a ListIterator? How is it different from Iterator?

212. What is the fail-fast behavior in collections?

213. What is the fail-safe behavior in collections?

214. What is the difference between fail-fast and fail-safe iterators?

215. Can you modify a collection while iterating through it?

[↑ Back to Table of Contents](#table-of-contents) | [↑ Collection Interface & Hierarchy](#collection-interface--hierarchy)

---

### List Interface

**Basic Concepts (216-230)**

216. What is a List in Java?

217. What are the main implementations of the List interface?

218. What is an ArrayList?

219. What is the default initial capacity of an ArrayList?

220. How does ArrayList grow dynamically?

221. What is a LinkedList?

222. What is the difference between ArrayList and LinkedList?

223. When should you use ArrayList vs LinkedList?

224. What is a Vector?

225. What is the difference between ArrayList and Vector?

226. Is ArrayList thread-safe?

227. How can you make an ArrayList thread-safe?

228. What is a Stack in Java?

229. What are the main operations of a Stack?

230. Should you use Stack or Deque for stack operations? Why?

**Intermediate Concepts (231-250)**

231. What is the time complexity of adding an element to an ArrayList?

232. What is the time complexity of adding an element at a specific index in ArrayList?

233. What is the time complexity of removing an element from an ArrayList?

234. What is the time complexity of accessing an element by index in ArrayList?

235. What is the time complexity of searching for an element in an ArrayList?

236. What is the time complexity of adding an element to a LinkedList at the beginning?

237. What is the time complexity of adding an element to a LinkedList at the end?

238. What is the time complexity of accessing an element by index in LinkedList?

239. How do you reverse a List in Java?

240. How do you sort a List in Java?

241. How do you shuffle a List in Java?

242. How do you convert an Array to a List?

243. How do you convert a List to an Array?

244. What is the difference between `Arrays.asList()` and creating a new ArrayList?

245. Can you add or remove elements from a List created by `Arrays.asList()`?

246. What is a subList? What happens when you modify a subList?

247. How do you remove duplicates from a List?

248. How do you find the intersection of two Lists?

249. How do you find the union of two Lists?

250. What is CopyOnWriteArrayList? When should you use it?

**Advanced Concepts (251-260)**

251. Explain the internal implementation of ArrayList.

252. What happens when ArrayList capacity is exceeded?

253. How does LinkedList implement both List and Deque interfaces?

254. What is the difference between singly linked list and doubly linked list?

255. How would you implement your own ArrayList?

256. What is the memory overhead of ArrayList vs LinkedList?

257. How do you efficiently remove elements from an ArrayList while iterating?

258. What is the difference between `remove(Object)` and `remove(int)` in List?

259. How do you implement a circular buffer using List?

260. Compare the performance of ArrayList, LinkedList, and Vector for different operations.

[↑ Back to Table of Contents](#table-of-contents) | [↑ List Interface](#list-interface)

---

### Set Interface

**Basic Concepts (261-275)**

261. What is a Set in Java?

262. What are the main implementations of the Set interface?

263. What is a HashSet?

264. What is the difference between HashSet and List?

265. Can a Set contain duplicate elements?

266. Can a Set contain null elements?

267. What is a LinkedHashSet?

268. What is the difference between HashSet and LinkedHashSet?

269. What is a TreeSet?

270. What is the difference between HashSet and TreeSet?

271. Does TreeSet allow null elements?

272. What is a SortedSet?

273. What is a NavigableSet?

274. What are the main methods provided by NavigableSet?

275. How does TreeSet maintain sorted order?

**Intermediate Concepts (276-295)**

276. What is the time complexity of adding an element to a HashSet?

277. What is the time complexity of checking if an element exists in a HashSet?

278. What is the time complexity of removing an element from a HashSet?

279. What is the time complexity of adding an element to a TreeSet?

280. What is the time complexity of searching in a TreeSet?

281. How do you convert a List to a Set?

282. How do you convert a Set to a List?

283. How do you find the union of two Sets?

284. How do you find the intersection of two Sets?

285. How do you find the difference of two Sets?

286. What is the difference between `removeAll()` and `retainAll()` methods?

287. How does HashSet ensure uniqueness of elements?

288. What happens if you add an object to a HashSet and then change the object?

289. Can you iterate over a HashSet in insertion order?

290. How do you create an immutable Set?

291. What is EnumSet? When should you use it?

292. What is the difference between EnumSet and HashSet for enums?

293. What is CopyOnWriteArraySet? When should you use it?

294. How do you remove duplicates from a collection using Set?

295. What is the difference between `contains()` and `containsAll()` methods?

**Advanced Concepts (296-305)**

296. Explain the internal implementation of HashSet.

297. How does HashSet use HashMap internally?

298. Explain the internal implementation of TreeSet.

299. How does TreeSet use TreeMap internally?

300. What is the load factor in HashSet?

301. What is the initial capacity of a HashSet?

302. How do you implement a custom ordering in TreeSet?

303. What is the difference between Comparable and Comparator in the context of TreeSet?

304. How would you implement a Set that maintains elements in most-recently-used order?

305. Compare the performance of HashSet, LinkedHashSet, and TreeSet for different operations.

[↑ Back to Table of Contents](#table-of-contents) | [↑ Set Interface](#set-interface)

---

### Map Interface

**Basic Concepts (306-325)**

306. What is a Map in Java?

307. What are the main implementations of the Map interface?

308. What is a HashMap?

309. Can a HashMap have duplicate keys?

310. Can a HashMap have duplicate values?

311. Can a HashMap have null keys?

312. Can a HashMap have null values?

313. What is a LinkedHashMap?

314. What is the difference between HashMap and LinkedHashMap?

315. What is a TreeMap?

316. What is the difference between HashMap and TreeMap?

317. Does TreeMap allow null keys?

318. What is a Hashtable?

319. What is the difference between HashMap and Hashtable?

320. Is HashMap thread-safe?

321. What is a ConcurrentHashMap?

322. What is the difference between HashMap and ConcurrentHashMap?

323. What is a WeakHashMap?

324. What is an IdentityHashMap?

325. What is an EnumMap?

**Intermediate Concepts (326-355)**

326. What is the time complexity of `put()` operation in HashMap?

327. What is the time complexity of `get()` operation in HashMap?

328. What is the time complexity of `remove()` operation in HashMap?

329. What is the time complexity of `put()` operation in TreeMap?

330. What is the time complexity of `get()` operation in TreeMap?

331. How do you iterate over a Map?

332. What are the different ways to iterate over a HashMap?

333. What is the difference between `keySet()`, `values()`, and `entrySet()` methods?

334. How do you sort a HashMap by keys?

335. How do you sort a HashMap by values?

336. How do you convert a Map to a List?

337. How do you merge two Maps?

338. What is the `compute()` method in Map?

339. What is the `computeIfAbsent()` method? When would you use it?

340. What is the `computeIfPresent()` method? When would you use it?

341. What is the `merge()` method in Map?

342. What is the `putIfAbsent()` method?

343. What is the difference between `put()` and `putIfAbsent()`?

344. What is the `getOrDefault()` method?

345. How do you create an immutable Map?

346. What is the `replace()` method in Map?

347. What is the difference between `replace(K key, V value)` and `replace(K key, V oldValue, V newValue)`?

348. How do you check if a Map contains a specific key?

349. How do you check if a Map contains a specific value?

350. What is the difference between `containsKey()` and `containsValue()` in terms of performance?

351. How do you remove an entry from a Map based on a condition?

352. What is `forEach()` method in Map (Java 8+)?

353. What is `replaceAll()` method in Map (Java 8+)?

354. How do you create a Map with initial values in a single line (Java 9+)?

355. What is the Properties class? How is it related to Map?

**Advanced Concepts (356-380)**

356. Explain the internal implementation of HashMap.

357. What is hashing? How does it work in HashMap?

358. What is a hash collision? How does HashMap handle it?

359. What is the difference between separate chaining and open addressing?

360. How does HashMap resolve collisions?

361. What is the load factor in HashMap?

362. What is the default initial capacity of HashMap?

363. What is the default load factor of HashMap?

364. When does HashMap resize?

365. What is rehashing in HashMap?

366. What is the significance of making HashMap key immutable?

367. Why is String commonly used as HashMap key?

368. What happens if you use a mutable object as HashMap key?

369. Explain the importance of `hashCode()` and `equals()` methods in HashMap.

370. What is the contract between `hashCode()` and `equals()` for HashMap keys?

371. What happens if two objects have the same hashCode but are not equal?

372. What happens if two objects are equal but have different hashCodes?

373. How did HashMap implementation change in Java 8?

374. What is treeification in HashMap (Java 8+)?

375. When does a HashMap bucket convert from linked list to tree?

376. Explain the internal implementation of ConcurrentHashMap.

377. What is the difference between Hashtable, Collections.synchronizedMap(), and ConcurrentHashMap?

378. How does ConcurrentHashMap achieve thread-safety without locking the entire map?

379. What is the segment locking mechanism in ConcurrentHashMap (Java 7)?

380. How did ConcurrentHashMap change in Java 8?

[↑ Back to Table of Contents](#table-of-contents) | [↑ Map Interface](#map-interface)

---

### Queue & Deque Interfaces

**Basic Concepts (381-395)**

381. What is a Queue in Java?

382. What are the main implementations of the Queue interface?

383. What is the difference between Queue and Stack?

384. What is a Deque (Double-Ended Queue)?

385. What is a PriorityQueue?

386. How does PriorityQueue maintain order?

387. Does PriorityQueue allow null elements?

388. What is an ArrayDeque?

389. What is the difference between ArrayDeque and LinkedList?

390. What is a BlockingQueue?

391. What are the main implementations of BlockingQueue?

392. What is the difference between `offer()` and `add()` methods in Queue?

393. What is the difference between `poll()` and `remove()` methods in Queue?

394. What is the difference between `peek()` and `element()` methods in Queue?

395. When should you use Queue vs Deque?

**Intermediate Concepts (396-410)**

396. What is the time complexity of operations in PriorityQueue?

397. How do you create a PriorityQueue with custom ordering?

398. What is the underlying data structure of PriorityQueue?

399. What is a heap? How is it used in PriorityQueue?

400. What is the difference between min-heap and max-heap?

401. How do you implement a max-heap using PriorityQueue?

402. What is LinkedBlockingQueue?

403. What is ArrayBlockingQueue?

404. What is the difference between LinkedBlockingQueue and ArrayBlockingQueue?

405. What is PriorityBlockingQueue?

406. What is DelayQueue?

407. What is SynchronousQueue?

408. What is LinkedTransferQueue?

409. How do you use ArrayDeque as a stack?

410. How do you use ArrayDeque as a queue?

**Advanced Concepts (411-420)**

411. Explain the internal implementation of PriorityQueue.

412. How does the heapify operation work in PriorityQueue?

413. What is the difference between `offer()` and `put()` in BlockingQueue?

414. What is the difference between `poll()` and `take()` in BlockingQueue?

415. How does BlockingQueue implement producer-consumer pattern?

416. What is the capacity of an ArrayDeque?

417. How does ArrayDeque grow when capacity is exceeded?

418. Why is ArrayDeque preferred over Stack for stack operations?

419. What is the difference between ArrayDeque and ConcurrentLinkedDeque?

420. How would you implement a bounded queue using ArrayDeque?

[↑ Back to Table of Contents](#table-of-contents) | [↑ Queue & Deque Interfaces](#queue--deque-interfaces)

---

### Comparable & Comparator

**Basic Concepts (421-435)**

421. What is the Comparable interface?

422. What is the Comparator interface?

423. What is the difference between Comparable and Comparator?

424. When should you use Comparable vs Comparator?

425. What method does Comparable interface have?

426. What method does Comparator interface have?

427. How do you sort a List of custom objects?

428. How do you sort a List in reverse order?

429. How do you sort a List using multiple criteria?

430. What is natural ordering?

431. Can a class implement both Comparable and provide multiple Comparators?

432. What is the return value of `compareTo()` method?

433. What is the return value of `compare()` method?

434. How do you create a Comparator using lambda expression?

435. How do you create a Comparator using method reference?

**Intermediate Concepts (436-450)**

436. What is `Comparator.comparing()` method (Java 8+)?

437. What is `Comparator.thenComparing()` method?

438. What is `Comparator.reversed()` method?

439. What is `Comparator.nullsFirst()` method?

440. What is `Comparator.nullsLast()` method?

441. How do you sort a Map by keys using Comparator?

442. How do you sort a Map by values using Comparator?

443. What happens if `compareTo()` is inconsistent with `equals()`?

444. What is the contract of the `compareTo()` method?

445. Can you modify the objects being compared inside `compareTo()` or `compare()`?

446. How do you implement case-insensitive string comparison?

447. How do you compare objects based on multiple fields?

448. What is the difference between `Collections.sort()` and `List.sort()`?

449. What is `Comparator.naturalOrder()` method?

450. What is `Comparator.reverseOrder()` method?

[↑ Back to Table of Contents](#table-of-contents) | [↑ Comparable & Comparator](#comparable--comparator)

---

### Collections Utility Class

**Basic Concepts (451-470)**

451. What is the Collections class?

452. What is the difference between Collection and Collections?

453. What are the main methods provided by Collections class?

454. How do you sort a collection using Collections class?

455. How do you reverse a List using Collections class?

456. How do you shuffle a List using Collections class?

457. How do you find the maximum element in a collection?

458. How do you find the minimum element in a collection?

459. How do you search for an element in a sorted list?

460. What is the `Collections.binarySearch()` method?

461. How do you get a synchronized collection?

462. How do you get an unmodifiable collection?

463. What is the difference between synchronized and unmodifiable collections?

464. How do you create a singleton collection?

465. How do you create an empty collection?

466. What is `Collections.frequency()` method?

467. What is `Collections.disjoint()` method?

468. What is `Collections.fill()` method?

469. What is `Collections.copy()` method?

470. What is `Collections.swap()` method?

**Intermediate Concepts (471-485)**

471. What is `Collections.rotate()` method?

472. What is `Collections.replaceAll()` method?

473. What is `Collections.addAll()` method?

474. What is the difference between `Collections.synchronizedList()` and `CopyOnWriteArrayList`?

475. What is the difference between `Collections.unmodifiableList()` and immutable list?

476. Can you modify the underlying collection of an unmodifiable wrapper?

477. What is `Collections.checkedCollection()`? When would you use it?

478. What is `Collections.emptyList()` vs `new ArrayList()`?

479. What is `Collections.nCopies()` method?

480. How do you create a List with a single element using Collections?

481. What is the difference between `Collections.EMPTY_LIST` and `Collections.emptyList()`?

482. What is `Collections.reverseOrder()` method?

483. How do you find the index of a sublist within a list?

484. What is `Collections.indexOfSubList()` method?

485. What is `Collections.lastIndexOfSubList()` method?

**Advanced Concepts (486-495)**

486. Are synchronized collections from Collections class thread-safe for iteration?

487. What are the performance implications of synchronized collections?

488. Why are `Collections.emptyList()` and similar methods useful?

489. What is the difference between `Collections.synchronizedMap()` and `ConcurrentHashMap`?

490. How do you make a collection both synchronized and unmodifiable?

491. What is the algorithm used by `Collections.sort()`?

492. What is TimSort? How is it used in Java Collections?

493. What is the time complexity of `Collections.binarySearch()`?

494. What happens if you call `Collections.binarySearch()` on an unsorted list?

495. How would you implement a custom synchronized collection?

[↑ Back to Table of Contents](#table-of-contents) | [↑ Collections Utility Class](#collections-utility-class)

---

### Arrays Utility Class

**Basic Concepts (496-510)**

496. What is the Arrays class?

497. What are the main methods provided by Arrays class?

498. How do you sort an array using Arrays class?

499. How do you convert an array to a String?

500. What is `Arrays.toString()` method?

501. What is `Arrays.deepToString()` method?

502. How do you compare two arrays for equality?

503. What is the difference between `Arrays.equals()` and `Arrays.deepEquals()`?

504. How do you copy an array using Arrays class?

505. What is `Arrays.copyOf()` method?

506. What is `Arrays.copyOfRange()` method?

507. How do you fill an array with a specific value?

508. How do you search for an element in a sorted array?

509. What is `Arrays.binarySearch()` method?

510. How do you convert an array to a List?

**Intermediate Concepts (511-525)**

511. What is `Arrays.asList()` method? What are its limitations?

512. Can you add or remove elements from a List returned by `Arrays.asList()`?

513. How do you sort an array in descending order?

514. How do you sort a portion of an array?

515. What is `Arrays.parallelSort()` method (Java 8+)?

516. When should you use `parallelSort()` vs `sort()`?

517. What is `Arrays.stream()` method (Java 8+)?

518. How do you create a stream from an array?

519. What is `Arrays.setAll()` method (Java 8+)?

520. What is `Arrays.parallelSetAll()` method (Java 8+)?

521. What is `Arrays.parallelPrefix()` method (Java 8+)?

522. How do you compare arrays lexicographically?

523. What is `Arrays.compare()` method (Java 9+)?

524. What is `Arrays.mismatch()` method (Java 9+)?

525. How do you convert a primitive array to a stream?

**Advanced Concepts (526-535)**

526. What algorithm does `Arrays.sort()` use for primitive arrays?

527. What algorithm does `Arrays.sort()` use for object arrays?

528. What is Dual-Pivot Quicksort?

529. Why does Java use different algorithms for primitive and object arrays?

530. What is the time complexity of `Arrays.binarySearch()`?

531. What is the time complexity of `Arrays.sort()`?

532. What is the time complexity of `Arrays.parallelSort()`?

533. How does `Arrays.parallelSort()` work internally?

534. What is the threshold for using parallel sort?

535. How would you implement a custom array sorting algorithm?

[↑ Back to Table of Contents](#table-of-contents) | [↑ Arrays Utility Class](#arrays-utility-class)

---

### Best Practices & Design Patterns

**Best Practices (536-550)**

536. When should you use List vs Set vs Map?

537. When should you use ArrayList vs LinkedList?

538. When should you use HashSet vs TreeSet?

539. When should you use HashMap vs TreeMap?

540. When should you use HashMap vs ConcurrentHashMap?

541. How do you choose the right collection for your use case?

542. What are the guidelines for choosing initial capacity of collections?

543. What is the impact of load factor on HashMap performance?

544. Should you use Comparable or Comparator for sorting?

545. How do you handle null values in collections?

546. What are the best practices for using collections in multi-threaded environments?

547. How do you avoid ConcurrentModificationException?

548. What is the diamond operator (<>)? How does it help with collections?

549. Should you use raw types or generic types for collections?

550. What are the best practices for equals() and hashCode() when using collections?

[↑ Back to Table of Contents](#table-of-contents) | [↑ Best Practices & Design Patterns](#best-practices--design-patterns)

---

## Multithreading & Concurrency

### Thread Basics

**Basic Concepts (551-570)**

551. What is a thread in Java?

552. What is multithreading?

553. What is the difference between a process and a thread?

554. What are the advantages of multithreading?

555. What are the main states of a thread in Java?

556. What is the Thread class?

557. What is the Runnable interface?

558. What are the two ways to create a thread in Java?

559. What is the difference between extending Thread class and implementing Runnable interface?

560. Which approach is better: extending Thread or implementing Runnable? Why?

561. What is the `start()` method in Thread class?

562. What is the `run()` method in Thread class?

563. What is the difference between `start()` and `run()` methods?

564. What happens if you call `run()` directly instead of `start()`?

565. Can you start a thread twice?

566. What is the `Thread.currentThread()` method?

567. What is the `getName()` and `setName()` methods in Thread?

568. What is thread priority? How do you set it?

569. What are the default, minimum, and maximum priority values?

570. Does setting thread priority guarantee execution order?

**Intermediate Concepts (571-595)**

571. What is the `sleep()` method? What does it do?

572. What is the difference between `sleep()` and `wait()`?

573. What is the `yield()` method? When would you use it?

574. What is the `join()` method? What does it do?

575. What is the difference between `join()` and `join(long millis)`?

576. What is a daemon thread?

577. What is the difference between user threads and daemon threads?

578. How do you create a daemon thread?

579. Can you convert a user thread to a daemon thread after it has started?

580. What happens to daemon threads when all user threads finish?

581. What is the main thread in Java?

582. Can you run a Java program without creating any threads explicitly?

583. What is thread scheduling?

584. What is time-slicing in thread scheduling?

585. What is context switching?

586. What is the cost of context switching?

587. What is thread starvation?

588. What is thread livelock?

589. What is the `interrupt()` method?

590. What is the `isInterrupted()` method?

591. What is the `interrupted()` method? How is it different from `isInterrupted()`?

592. How do you handle thread interruption?

593. What is `InterruptedException`?

594. What is the `stop()` method? Why is it deprecated?

595. What are the recommended ways to stop a thread?

**Advanced Concepts (596-610)**

596. What is the Thread lifecycle? Explain all states.

597. What is the difference between NEW and RUNNABLE states?

598. What transitions a thread from RUNNABLE to BLOCKED state?

599. What transitions a thread from RUNNABLE to WAITING state?

600. What transitions a thread from RUNNABLE to TIMED_WAITING state?

601. What is the difference between WAITING and TIMED_WAITING states?

602. What is the `getState()` method?

603. Can you get the stack trace of a running thread?

604. What is `Thread.getAllStackTraces()` method?

605. What is thread dumping? How is it useful?

606. What is the `UncaughtExceptionHandler`?

607. How do you handle uncaught exceptions in threads?

608. What is the Thread Group?

609. What is the purpose of Thread Group?

610. Should you use Thread Groups in modern Java applications?

[↑ Back to Table of Contents](#table-of-contents) | [↑ Thread Basics](#thread-basics)

---

### Synchronization

**Basic Concepts (611-630)**

611. What is synchronization in Java?

612. Why is synchronization needed?

613. What is a race condition?

614. What is thread interference?

615. What is a critical section?

616. What is the `synchronized` keyword?

617. What are the two types of synchronization in Java?

618. What is synchronized method?

619. What is synchronized block?

620. What is the difference between synchronized method and synchronized block?

621. Which is better: synchronized method or synchronized block? Why?

622. Can a static method be synchronized?

623. What is the difference between synchronizing a static method and an instance method?

624. What object is locked when you synchronize a static method?

625. What object is locked when you synchronize an instance method?

626. Can you synchronize a constructor?

627. Can two threads execute two different synchronized methods of the same object simultaneously?

628. Can two threads execute the same synchronized method of different objects simultaneously?

629. What is mutual exclusion?

630. What is a monitor in Java?

**Intermediate Concepts (631-655)**

631. What is intrinsic lock (monitor lock)?

632. What is lock acquisition and release?

633. What happens if a thread tries to acquire a lock that's already held by another thread?

634. What is reentrant synchronization?

635. Can a thread acquire the same lock multiple times?

636. What is the `wait()` method? What does it do?

637. What is the `notify()` method? What does it do?

638. What is the `notifyAll()` method? What does it do?

639. What is the difference between `notify()` and `notifyAll()`?

640. Why must `wait()`, `notify()`, and `notifyAll()` be called from within a synchronized context?

641. What happens when you call `wait()` on an object?

642. Does `wait()` release all locks held by the thread?

643. What is spurious wakeup?

644. Why should `wait()` always be called in a loop?

645. What is the producer-consumer problem?

646. How do you implement producer-consumer using `wait()` and `notify()`?

647. What is the difference between `sleep()` and `wait()` in terms of lock holding?

648. Can you call `wait()` without synchronization? What happens?

649. Can you call `notify()` without synchronization? What happens?

650. What is the happens-before relationship?

651. What is visibility problem in multithreading?

652. What is the `volatile` keyword?

653. When should you use `volatile`?

654. What is the difference between `synchronized` and `volatile`?

655. Can `volatile` guarantee atomicity?

**Advanced Concepts (656-680)**

656. What is the Java Memory Model (JMM)?

657. What is main memory and working memory (thread cache)?

658. What is memory visibility issue?

659. How does `synchronized` ensure memory visibility?

660. How does `volatile` ensure memory visibility?

661. What is instruction reordering?

662. How does `volatile` prevent instruction reordering?

663. What is the double-checked locking problem?

664. How do you fix the double-checked locking problem?

665. What is the volatile variable write and read guarantee?

666. What is atomicity in the context of multithreading?

667. What operations are atomic in Java?

668. Is `i++` atomic? Why or why not?

669. What is the `synchronized` block performance overhead?

670. What is lock contention?

671. How can you reduce lock contention?

672. What is lock coarsening?

673. What is lock elision?

674. What is biased locking?

675. What is adaptive spinning?

676. What are the different types of locks in Java?

677. What is a deadlock?

678. What are the conditions for deadlock to occur?

679. How can you prevent deadlock?

680. How can you detect deadlock?

[↑ Back to Table of Contents](#table-of-contents) | [↑ Synchronization](#synchronization)

---

### Executor Framework

**Basic Concepts (681-700)**

681. What is the Executor framework?

682. Why was the Executor framework introduced?

683. What is the Executor interface?

684. What is the ExecutorService interface?

685. What is the difference between Executor and ExecutorService?

686. What is the `execute()` method in Executor?

687. What is the `submit()` method in ExecutorService?

688. What is the difference between `execute()` and `submit()`?

689. What is a thread pool?

690. What are the advantages of using thread pools?

691. What is the Executors factory class?

692. What is `Executors.newFixedThreadPool()`?

693. What is `Executors.newCachedThreadPool()`?

694. What is `Executors.newSingleThreadExecutor()`?

695. What is `Executors.newScheduledThreadPool()`?

696. What is the difference between FixedThreadPool and CachedThreadPool?

697. When should you use FixedThreadPool vs CachedThreadPool?

698. What is the ThreadPoolExecutor class?

699. What are the core parameters of ThreadPoolExecutor?

700. What is core pool size and maximum pool size?

**Intermediate Concepts (701-730)**

701. What is the queue in ThreadPoolExecutor?

702. What is keep-alive time in ThreadPoolExecutor?

703. What is the ThreadFactory?

704. What is RejectedExecutionHandler?

705. What are the different types of RejectedExecutionHandler?

706. What is AbortPolicy?

707. What is CallerRunsPolicy?

708. What is DiscardPolicy?

709. What is DiscardOldestPolicy?

710. When does a ThreadPoolExecutor reject a task?

711. What is the `shutdown()` method in ExecutorService?

712. What is the `shutdownNow()` method in ExecutorService?

713. What is the difference between `shutdown()` and `shutdownNow()`?

714. What is the `awaitTermination()` method?

715. What is the `isShutdown()` method?

716. What is the `isTerminated()` method?

717. What is the Future interface?

718. What is the `get()` method in Future?

719. What is the `get(long timeout, TimeUnit unit)` method in Future?

720. What is the `cancel()` method in Future?

721. What is the `isCancelled()` method in Future?

722. What is the `isDone()` method in Future?

723. Can you get the result of a Future multiple times?

724. What happens if you call `get()` on a Future that's not yet complete?

725. What is the Callable interface?

726. What is the difference between Runnable and Callable?

727. How do you submit a Callable to ExecutorService?

728. What is the ScheduledExecutorService?

729. What is the `schedule()` method?

730. What is the `scheduleAtFixedRate()` method?

**Advanced Concepts (731-750)**

731. What is the `scheduleWithFixedDelay()` method?

732. What is the difference between `scheduleAtFixedRate()` and `scheduleWithFixedDelay()`?

733. What is the ScheduledFuture interface?

734. How do you cancel a scheduled task?

735. What is the `invokeAll()` method in ExecutorService?

736. What is the `invokeAny()` method in ExecutorService?

737. What is the difference between `invokeAll()` and `invokeAny()`?

738. What is the CompletionService?

739. What is the ExecutorCompletionService?

740. When would you use CompletionService?

741. What is work stealing in thread pools?

742. What is the ForkJoinPool?

743. What is the difference between ThreadPoolExecutor and ForkJoinPool?

744. What are the best practices for sizing thread pools?

745. How do you calculate the optimal thread pool size?

746. What is the formula for CPU-bound vs I/O-bound thread pool sizing?

747. What are the common pitfalls when using thread pools?

748. Should you use `Executors` factory methods or create ThreadPoolExecutor directly?

749. How do you handle exceptions in ExecutorService tasks?

750. What is the `afterExecute()` hook in ThreadPoolExecutor?

[↑ Back to Table of Contents](#table-of-contents) | [↑ Executor Framework](#executor-framework)

---

### Locks & Concurrent Utilities

**Basic Concepts (751-770)**

751. What is the Lock interface?

752. What is the difference between Lock and synchronized?

753. What are the advantages of Lock over synchronized?

754. What is the ReentrantLock class?

755. What is reentrancy? How does ReentrantLock support it?

756. What is the `lock()` method in Lock?

757. What is the `unlock()` method in Lock?

758. What is the `tryLock()` method?

759. What is the `tryLock(long time, TimeUnit unit)` method?

760. What is the difference between `lock()` and `tryLock()`?

761. Why should you always unlock in a finally block?

762. What is the `lockInterruptibly()` method?

763. What is the difference between `lock()` and `lockInterruptibly()`?

764. What is a Condition in Lock?

765. What is the `newCondition()` method?

766. What are the `await()` and `signal()` methods in Condition?

767. What is the difference between `wait()`/`notify()` and `await()`/`signal()`?

768. Can you have multiple Conditions for a single Lock?

769. What is fair locking?

770. What is the difference between fair and non-fair locks?

**Intermediate Concepts (771-795)**

771. What is the ReadWriteLock interface?

772. What is the ReentrantReadWriteLock class?

773. What is the difference between read lock and write lock?

774. When should you use ReadWriteLock?

775. Can multiple threads hold read locks simultaneously?

776. Can multiple threads hold write locks simultaneously?

777. Can a thread hold both read and write locks simultaneously?

778. What is lock downgrading and upgrading?

779. Does ReentrantReadWriteLock support lock upgrading?

780. What is the StampedLock class (Java 8+)?

781. What are the three modes in StampedLock?

782. What is optimistic reading in StampedLock?

783. What is the difference between ReentrantReadWriteLock and StampedLock?

784. What is the Semaphore class?

785. What is a semaphore? How does it work?

786. What is the `acquire()` method in Semaphore?

787. What is the `release()` method in Semaphore?

788. What is the difference between binary semaphore and counting semaphore?

789. When would you use a Semaphore?

790. How do you implement a resource pool using Semaphore?

791. What is the CountDownLatch class?

792. How does CountDownLatch work?

793. What is the `await()` method in CountDownLatch?

794. What is the `countDown()` method in CountDownLatch?

795. Can you reset a CountDownLatch?

**Advanced Concepts (796-820)**

796. What is the CyclicBarrier class?

797. What is the difference between CountDownLatch and CyclicBarrier?

798. Can you reuse a CyclicBarrier?

799. What is the `await()` method in CyclicBarrier?

800. What is the barrier action in CyclicBarrier?

801. What is the Phaser class (Java 7+)?

802. What is the difference between CyclicBarrier and Phaser?

803. What is the Exchanger class?

804. When would you use an Exchanger?

805. What is the `exchange()` method in Exchanger?

806. What is the LockSupport class?

807. What are the `park()` and `unpark()` methods?

808. What is the difference between `wait()` and `park()`?

809. What is the AbstractQueuedSynchronizer (AQS)?

810. How do Lock implementations use AQS?

811. What is the difference between exclusive and shared modes in AQS?

812. How would you implement a custom synchronizer using AQS?

813. What is the performance difference between synchronized and ReentrantLock?

814. When should you use synchronized vs ReentrantLock?

815. What is lock-free programming?

816. What is wait-free programming?

817. What is obstruction-free programming?

818. What are the differences between lock-free, wait-free, and obstruction-free?

819. What is the compare-and-swap (CAS) operation?

820. How does CAS enable lock-free programming?

[↑ Back to Table of Contents](#table-of-contents) | [↑ Locks & Concurrent Utilities](#locks--concurrent-utilities)

---

### Atomic Variables

**Basic Concepts (821-840)**

821. What are atomic variables in Java?

822. What is the java.util.concurrent.atomic package?

823. What is the AtomicInteger class?

824. What is the AtomicLong class?

825. What is the AtomicBoolean class?

826. What is the AtomicReference class?

827. Why are atomic variables needed?

828. What is the advantage of atomic variables over synchronized?

829. What is the `get()` method in AtomicInteger?

830. What is the `set()` method in AtomicInteger?

831. What is the `getAndSet()` method?

832. What is the `getAndIncrement()` method?

833. What is the `getAndDecrement()` method?

834. What is the `incrementAndGet()` method?

835. What is the difference between `getAndIncrement()` and `incrementAndGet()`?

836. What is the `compareAndSet()` method?

837. How does `compareAndSet()` work?

838. What is the `weakCompareAndSet()` method?

839. What is the difference between `compareAndSet()` and `weakCompareAndSet()`?

840. Are atomic operations lock-free?

**Intermediate Concepts (841-860)**

841. What is the `addAndGet()` method?

842. What is the `getAndAdd()` method?

843. What is the `updateAndGet()` method (Java 8+)?

844. What is the `getAndUpdate()` method (Java 8+)?

845. What is the `accumulateAndGet()` method (Java 8+)?

846. What is the `getAndAccumulate()` method (Java 8+)?

847. What is the AtomicIntegerArray class?

848. What is the AtomicLongArray class?

849. What is the AtomicReferenceArray class?

850. How do atomic arrays work?

851. What is the AtomicMarkableReference class?

852. What is the AtomicStampedReference class?

853. What is the ABA problem?

854. How does AtomicStampedReference solve the ABA problem?

855. What is the DoubleAccumulator class (Java 8+)?

856. What is the LongAccumulator class (Java 8+)?

857. What is the DoubleAdder class (Java 8+)?

858. What is the LongAdder class (Java 8+)?

859. What is the difference between AtomicLong and LongAdder?

860. When should you use LongAdder instead of AtomicLong?

**Advanced Concepts (861-875)**

861. How do atomic variables use CAS internally?

862. What is the memory ordering guarantee of atomic variables?

863. What is the `lazySet()` method in atomic variables?

864. What is the difference between `set()` and `lazySet()`?

865. What is the VarHandle API (Java 9+)?

866. How does VarHandle relate to atomic variables?

867. What are the performance characteristics of atomic variables?

868. When should you use atomic variables vs synchronized?

869. When should you use atomic variables vs volatile?

870. What is the memory footprint of atomic variables?

871. Can atomic variables be used for compound operations safely?

872. How do you implement a lock-free stack using atomic variables?

873. How do you implement a lock-free queue using atomic variables?

874. What is the limitation of CAS-based algorithms?

875. What is the false sharing problem with atomic variables?

[↑ Back to Table of Contents](#table-of-contents) | [↑ Atomic Variables](#atomic-variables)

---

### Concurrent Collections

[Next Section: CompletableFuture & async-programming →](#completablefuture--async-programming)

**Basic Concepts (876-895)**

876. What are concurrent collections?

877. What is the difference between synchronized collections and concurrent collections?

878. What is the ConcurrentHashMap class?

879. What is the difference between HashMap and ConcurrentHashMap?

880. What is the difference between Hashtable and ConcurrentHashMap?

881. Is ConcurrentHashMap thread-safe?

882. Does ConcurrentHashMap allow null keys or values?

883. What is the ConcurrentLinkedQueue class?

884. What is the difference between LinkedList and ConcurrentLinkedQueue?

885. What is the ConcurrentLinkedDeque class?

886. What is the CopyOnWriteArrayList class?

887. What is the difference between ArrayList and CopyOnWriteArrayList?

888. When should you use CopyOnWriteArrayList?

889. What is the CopyOnWriteArraySet class?

890. What is the difference between HashSet and CopyOnWriteArraySet?

891. What is the ConcurrentSkipListMap class?

892. What is the difference between TreeMap and ConcurrentSkipListMap?

893. What is the ConcurrentSkipListSet class?

894. What is a skip list data structure?

895. What is the BlockingQueue interface?

**Intermediate Concepts (896-920)**

896. What is the difference between Queue and BlockingQueue?

897. What is the `put()` method in BlockingQueue?

898. What is the `take()` method in BlockingQueue?

899. What is the difference between `offer()` and `put()` in BlockingQueue?

900. What is the difference between `poll()` and `take()` in BlockingQueue?

901. What is the ArrayBlockingQueue class?

902. What is the LinkedBlockingQueue class?

903. What is the difference between ArrayBlockingQueue and LinkedBlockingQueue?

904. What is the PriorityBlockingQueue class?

905. What is the DelayQueue class?

906. What is the Delayed interface?

907. When would you use DelayQueue?

908. What is the SynchronousQueue class?

909. How does SynchronousQueue work?

910. When would you use SynchronousQueue?

911. What is the LinkedTransferQueue class?

912. What is the TransferQueue interface?

913. What is the `transfer()` method in TransferQueue?

914. What is the difference between `put()` and `transfer()`?

915. What is the BlockingDeque interface?

916. What is the LinkedBlockingDeque class?

917. How does ConcurrentHashMap achieve thread-safety?

918. What is segment locking in ConcurrentHashMap (Java 7)?

919. How did ConcurrentHashMap change in Java 8?

920. What is the default concurrency level in ConcurrentHashMap?

**Advanced Concepts (921-945)**

921. What is the `putIfAbsent()` method in ConcurrentHashMap?

922. What is the `remove(key, value)` method in ConcurrentHashMap?

923. What is the `replace(key, oldValue, newValue)` method?

924. Are the compound operations in ConcurrentHashMap atomic?

925. What is the `computeIfAbsent()` method in ConcurrentHashMap?

926. What is the `computeIfPresent()` method in ConcurrentHashMap?

927. What is the `compute()` method in ConcurrentHashMap?

928. What is the `merge()` method in ConcurrentHashMap?

929. Are the Java 8 ConcurrentHashMap methods thread-safe?

930. What is the `forEach()` method in ConcurrentHashMap?

931. What is the `search()` method in ConcurrentHashMap?

932. What is the `reduce()` method in ConcurrentHashMap?

933. What is the performance of ConcurrentHashMap vs synchronized HashMap?

934. What is the memory overhead of ConcurrentHashMap?

935. What is the write-through cost in CopyOnWriteArrayList?

936. Why is CopyOnWriteArrayList suitable for read-heavy scenarios?

937. What is the internal implementation of CopyOnWriteArrayList?

938. How does ConcurrentLinkedQueue achieve lock-free operations?

939. What is the algorithm used by ConcurrentLinkedQueue?

940. What is the difference between ConcurrentLinkedQueue and LinkedBlockingQueue?

941. When should you use ConcurrentSkipListMap vs ConcurrentHashMap?

942. What is the time complexity of operations in ConcurrentSkipListMap?

943. How do you choose the right concurrent collection?

944. What are the performance trade-offs of different concurrent collections?

945. How do you handle bulk operations in concurrent collections?

[↑ Back to Table of Contents](#table-of-contents) | [↑ Concurrent Collections](#concurrent-collections)

---

### CompletableFuture & Async Programming
[Next Section: Advanced-concurrency-topics →](#advanced-concurrency-topics)

**Basic Concepts (946-965)**

946. What is CompletableFuture (Java 8+)?

947. What is the difference between Future and CompletableFuture?

948. How do you create a CompletableFuture?

949. What is the `supplyAsync()` method?

950. What is the `runAsync()` method?

951. What is the difference between `supplyAsync()` and `runAsync()`?

952. What is the `complete()` method in CompletableFuture?

953. What is the `completeExceptionally()` method?

954. What is the `get()` method in CompletableFuture?

955. What is the `join()` method in CompletableFuture?

956. What is the difference between `get()` and `join()`?

957. What is the `getNow()` method?

958. What is the `thenApply()` method?

959. What is the `thenAccept()` method?

960. What is the `thenRun()` method?

961. What is the difference between `thenApply()`, `thenAccept()`, and `thenRun()`?

962. What is the `thenCompose()` method?

963. What is the `thenCombine()` method?

964. What is the difference between `thenCompose()` and `thenCombine()`?

965. What is the `allOf()` method?

**Intermediate Concepts (966-990)**

966. What is the `anyOf()` method?

967. What is the difference between `allOf()` and `anyOf()`?

968. What is the `exceptionally()` method?

969. What is the `handle()` method?

970. What is the `whenComplete()` method?

971. What is the difference between `exceptionally()`, `handle()`, and `whenComplete()`?

972. What are the `*Async` variants of methods (e.g., `thenApplyAsync()`)?

973. What is the difference between `thenApply()` and `thenApplyAsync()`?

974. Which thread executes non-async methods in CompletableFuture?

975. Which thread executes async methods in CompletableFuture?

976. Can you specify a custom Executor for CompletableFuture?

977. What is the default executor used by CompletableFuture?

978. What is the ForkJoinPool.commonPool()?

979. What is the `thenApplyAsync(Function, Executor)` method?

980. How do you chain multiple CompletableFutures?

981. What is the `thenAcceptBoth()` method?

982. What is the `runAfterBoth()` method?

983. What is the `applyToEither()` method?

984. What is the `acceptEither()` method?

985. What is the `runAfterEither()` method?

986. What is the `obtrudeValue()` method?

987. What is the `obtrudeException()` method?

988. What is the `isDone()` method in CompletableFuture?

989. What is the `isCancelled()` method in CompletableFuture?

990. What is the `isCompletedExceptionally()` method?

**Advanced Concepts (991-1010)**

991. How do you handle exceptions in CompletableFuture chains?

992. What happens if an exception occurs in the middle of a CompletableFuture chain?

993. How do you timeout a CompletableFuture (Java 9+)?

994. What is the `orTimeout()` method (Java 9+)?

995. What is the `completeOnTimeout()` method (Java 9+)?

996. What is the difference between `orTimeout()` and `completeOnTimeout()`?

997. What is the `copy()` method in CompletableFuture (Java 9+)?

998. What is the `minimalCompletionStage()` method (Java 9+)?

999. What are the best practices for using CompletableFuture?

1000. How do you convert a callback-based API to CompletableFuture?

1001. How do you implement retry logic with CompletableFuture?

1002. How do you implement timeout with fallback using CompletableFuture?

1003. What is the performance overhead of CompletableFuture?

1004. When should you use CompletableFuture vs regular Future?

1005. What are common pitfalls when using CompletableFuture?

1006. How do you test code that uses CompletableFuture?

1007. What is the difference between CompletableFuture and RxJava?

1008. What is the difference between CompletableFuture and Project Reactor?

1009. How does CompletableFuture relate to reactive programming?

1010. How would you implement parallel processing using CompletableFuture?

[↑ Back to Table of Contents](#table-of-contents) | [↑ CompletableFuture & Async Programming](#completablefuture--async-programming)

---

### Advanced Concurrency Topics

**Thread-Safe Design Patterns (1011-1030)**

1011. What is the Thread-Safe Singleton pattern?

1012. How do you implement a thread-safe singleton using double-checked locking?

1013. How do you implement a thread-safe singleton using enum?

1014. What is the Immutable Object pattern?

1015. How does immutability help with thread safety?

1016. What is the Thread-Local Storage pattern?

1017. What is the ThreadLocal class?

1018. How does ThreadLocal work?

1019. When should you use ThreadLocal?

1020. What are the pitfalls of using ThreadLocal?

1021. How do you prevent memory leaks with ThreadLocal?

1022. What is the InheritableThreadLocal class?

1023. What is the Thread-Specific Storage pattern?

1024. What is the Active Object pattern?

1025. What is the Monitor Object pattern?

1026. What is the Half-Sync/Half-Async pattern?

1027. What is the Leader/Followers pattern?

1028. What is the Producer-Consumer pattern?

1029. What is the Reader-Writer pattern?

1030. What is the Balking pattern?

**Performance & Optimization (1031-1050)**

1031. What is Amdahl's Law?

1032. How does Amdahl's Law apply to multithreading?

1033. What is thread pool tuning?

1034. How do you monitor thread pool performance?

1035. What metrics should you track for thread pools?

1036. What is thread starvation? How do you detect it?

1037. What is thread contention? How do you measure it?

1038. What tools can you use to detect deadlocks?

1039. What is the Java VisualVM? How does it help with concurrency?

1040. What is the Java Mission Control?

1041. What is thread dump analysis?

1042. How do you interpret a thread dump?

1043. What is lock contention profiling?

1044. What is the false sharing problem?

1045. How do you prevent false sharing?

1046. What is the `@Contended` annotation (Java 8+)?

1047. What is cache line padding?

1048. What is the cost of synchronization?

1049. What are the alternatives to synchronization?

1050. How do you reduce synchronization overhead?

**Testing & Debugging (1051-1070)**

1051. How do you test multithreaded code?

1052. What is a race condition test?

1053. How do you reproduce race conditions in tests?

1054. What is the CountDownLatch testing technique?

1055. What is the CyclicBarrier testing technique?

1056. How do you test for deadlocks?

1057. How do you test for thread safety?

1058. What is stress testing for concurrent code?

1059. What tools can help with concurrency testing?

1060. What is the Java Concurrency Stress Test (jcstress)?

1061. What is the Thread Sanitizer?

1062. How do you debug race conditions?

1063. How do you debug deadlocks?

1064. What is the `jstack` tool?

1065. What is the `jconsole` tool?

1066. How do you use breakpoints in multithreaded debugging?

1067. What is the happens-before debugging technique?

1068. How do you log effectively in multithreaded applications?

1069. What is thread naming? Why is it important?

1070. What are common concurrency bugs and how to avoid them?

**Modern Java Concurrency (1071-1100)**

1071. What is the Flow API (Java 9+)?

1072. What is reactive programming?

1073. What is backpressure in reactive streams?

1074. What are the main interfaces in Flow API?

1075. What is Flow.Publisher?

1076. What is Flow.Subscriber?

1077. What is Flow.Subscription?

1078. What is Flow.Processor?

1079. How does Flow API relate to Reactive Streams specification?

1080. What is virtual threads (Project Loom - Java 19+)?

1081. What is the difference between platform threads and virtual threads?

1082. How do virtual threads improve scalability?

1083. What is structured concurrency (Java 19+)?

1084. What is the StructuredTaskScope class?

1085. What are the benefits of structured concurrency?

1086. What is the Thread.ofVirtual() method?

1087. What is the Thread.ofPlatform() method?

1088. How do virtual threads change concurrency patterns?

1089. Should you still use thread pools with virtual threads?

1090. What is pinning in virtual threads?

1091. What operations can pin virtual threads?

1092. How do you avoid pinning virtual threads?

1093. What is the ScopedValue API (Java 20+)?

1094. How does ScopedValue differ from ThreadLocal?

1095. What are the benefits of ScopedValue over ThreadLocal?

1096. What is the future of concurrency in Java?

1097. How does Java concurrency compare to other languages?

1098. What is the Actor model? How does it relate to Java?

1099. What is Software Transactional Memory (STM)?

1100. What are the trends in concurrent programming?

[↑ Back to Table of Contents](#table-of-contents) | [↑ Advanced Concurrency Topics](#advanced-concurrency-topics)

---

## Quick Reference

**Total Questions by Topic:**
- **OOP:** 200 questions (1-200)
  - Encapsulation: 25 questions (1-25)
  - Inheritance: 35 questions (26-60)
  - Polymorphism: 35 questions (61-95)
  - Abstraction: 45 questions (96-140)
  - General OOP: 60 questions (141-200)

- **Collections Framework:** 350 questions (201-550)
  - Collection Interface & Hierarchy: 15 questions (201-215)
  - List Interface: 45 questions (216-260)
  - Set Interface: 45 questions (261-305)
  - Map Interface: 75 questions (306-380)
  - Queue & Deque: 40 questions (381-420)
  - Comparable & Comparator: 30 questions (421-450)
  - Collections Utility: 45 questions (451-495)
  - Arrays Utility: 40 questions (496-535)
  - Best Practices: 15 questions (536-550)

- **Multithreading & Concurrency:** 550 questions (551-1100)
  - Thread Basics: 60 questions (551-610)
  - Synchronization: 70 questions (611-680)
  - Executor Framework: 70 questions (681-750)
  - Locks & Concurrent Utilities: 70 questions (751-820)
  - Atomic Variables: 55 questions (821-875)
  - Concurrent Collections: 70 questions (876-945)
  - CompletableFuture & Async: 65 questions (946-1010)
  - Advanced Topics: 90 questions (1011-1100)
    - Thread-Safe Design Patterns: 20 questions (1011-1030)
    - Performance & Optimization: 20 questions (1031-1050)
    - Testing & Debugging: 20 questions (1051-1070)
    - Modern Java Concurrency: 30 questions (1071-1100)

**Total:** 1100 Interview Questions (200 OOP + 350 Collections + 550 Multithreading)

**Difficulty Levels:**
- Basic: Foundation concepts, syntax, basic operations
- Intermediate: Performance, use cases, comparisons, implementation details
- Advanced: Internal implementations, algorithms, design decisions, optimization

---

**Note:** These questions are designed for self-assessment. Practice answering them without looking at external resources first, then verify your understanding by researching and coding examples.

**Study Tip:** For best results:
1. Try to answer the question without any resources
2. Write code examples to demonstrate your answer
3. Verify your understanding with official documentation
4. Revisit questions you struggled with
5. Practice implementing concurrent solutions from scratch
6. Analyze thread safety and performance implications
7. Use visualization tools for understanding concurrency
8. Test your multithreaded code thoroughly

**Related Resources:**
- [Encapsulation Examples](../src/oop/encapsulation/)
- [Inheritance Examples](../src/oop/inheritance/)
- [Polymorphism Examples](../src/oop/polymorphism/)
- [Abstraction Examples](../src/oop/abstraction/)
- [Collections Examples](../src/collections/)
- [Multithreading Examples](../src/multithreading/)

---

*Part of JavaCore Module - Interview Preparation*

