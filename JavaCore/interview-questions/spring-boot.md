# Spring Boot - Interview Questions

[← Back to Problem Set](problem-set.md)

## Table of Contents
1. [Spring Boot Basics](#spring-boot-basics)
2. [Auto-Configuration](#auto-configuration)
3. [Spring Boot Annotations](#spring-boot-annotations)
4. [Spring Boot Starters](#spring-boot-starters)
5. [Configuration & Properties](#configuration--properties)
6. [Spring Boot Actuator](#spring-boot-actuator)
7. [REST APIs](#rest-apis)
8. [Error Handling & Validation](#error-handling--validation)

---

## Spring Boot Basics

1. [What is Spring Boot?](./solutions/springboot-solutions.md#q1-what-is-spring-boot)

2. [What are the advantages of Spring Boot over Spring?](./solutions/springboot-solutions.md#q2-what-are-the-advantages-of-spring-boot-over-spring)

3. [What are the main features of Spring Boot?](./solutions/springboot-solutions.md#q3-what-are-the-main-features-of-spring-boot)

4. [What is the difference between Spring and Spring Boot?](./solutions/springboot-solutions.md#q4-what-is-the-difference-between-spring-and-spring-boot)

5. [What is convention over configuration?](./solutions/springboot-solutions.md#q5-what-is-convention-over-configuration)

6. [What is the entry point of a Spring Boot application?](./solutions/springboot-solutions.md#q6-what-is-the-entry-point-of-a-spring-boot-application)

7. [What is `@SpringBootApplication` annotation?](./solutions/springboot-solutions.md#q7-what-is-springbootapplication-annotation)

8. [What annotations does `@SpringBootApplication` combine?](./solutions/springboot-solutions.md#q8-what-annotations-does-springbootapplication-combine)

9. [How do you create a Spring Boot application?](./solutions/springboot-solutions.md#q9-how-do-you-create-a-spring-boot-application)

10. [What is Spring Initializr?](./solutions/springboot-solutions.md#q10-what-is-spring-initializr)

11. [What is the default embedded server in Spring Boot?](./solutions/springboot-solutions.md#q11-what-is-the-default-embedded-server-in-spring-boot)

12. [Can you change the embedded server? How?](./solutions/springboot-solutions.md#q12-can-you-change-the-embedded-server-how)


[↑ Back to Table of Contents](#table-of-contents)

---

## Auto-Configuration

13. [What is auto-configuration in Spring Boot?](./solutions/springboot-solutions.md#q13-what-is-auto-configuration-in-spring-boot)

14. [How does Spring Boot auto-configuration work?](./solutions/springboot-solutions.md#q14-how-does-spring-boot-auto-configuration-work)

15. [What is `@EnableAutoConfiguration` annotation?](./solutions/springboot-solutions.md#q15-what-is-enableautoconfiguration-annotation)

16. [How do you disable specific auto-configuration classes?](./solutions/springboot-solutions.md#q16-how-do-you-disable-specific-auto-configuration-classes)

17. [What is the `spring.factories` file?](./solutions/springboot-solutions.md#q17-what-is-the-springfactories-file)

18. [How do you create custom auto-configuration?](./solutions/springboot-solutions.md#q18-how-do-you-create-custom-auto-configuration)

19. [What is `@Conditional` annotation?](./solutions/springboot-solutions.md#q19-what-is-conditional-annotation)

20. [What are conditional annotations (`@ConditionalOnClass`, `@ConditionalOnBean`, etc.)?](./solutions/springboot-solutions.md#q20-what-are-conditional-annotations-conditionalonclass-conditionalonbean-etc)

21. [How do you view all auto-configured beans?](./solutions/springboot-solutions.md#q21-how-do-you-view-all-auto-configured-beans)

22. [What is the order of configuration sources in Spring Boot?](./solutions/springboot-solutions.md#q22-what-is-the-order-of-configuration-sources-in-spring-boot)

[↑ Back to Table of Contents](#table-of-contents)

---

## Spring Boot Annotations

23. [What is `@RestController` annotation?](./solutions/springboot-solutions.md#q23-what-is-restcontroller-annotation)

24. [What is `@RequestMapping` and its variants?](./solutions/springboot-solutions.md#q24-what-is-requestmapping-and-its-variants)

25. [What is `@Value` annotation?](./solutions/springboot-solutions.md#q25-what-is-value-annotation)

26. [What is `@ConfigurationProperties` annotation?](./solutions/springboot-solutions.md#q26-what-is-configurationproperties-annotation)

27. [What is the difference between `@Value` and `@ConfigurationProperties`?](./solutions/springboot-solutions.md#q27-what-is-the-difference-between-value-and-configurationproperties)

28. [What is `@Profile` annotation?](./solutions/springboot-solutions.md#q28-what-is-profile-annotation)

29. [How do you activate a profile?](./solutions/springboot-solutions.md#q29-how-do-you-activate-a-profile)

30. [What is `@EnableScheduling` annotation?](./solutions/springboot-solutions.md#q30-what-is-enablescheduling-annotation)

31. [What is `@Scheduled` annotation?](./solutions/springboot-solutions.md#q31-what-is-scheduled-annotation)

32. [What is `@Async` annotation?](./solutions/springboot-solutions.md#q32-what-is-async-annotation)

33. [What is `@EnableAsync` annotation?](./solutions/springboot-solutions.md#q33-what-is-enableasync-annotation)

34. [What is `@Transactional` annotation?](./solutions/springboot-solutions.md#q34-what-is-transactional-annotation)

[↑ Back to Table of Contents](#table-of-contents)

---

## Spring Boot Starters

35. [What are Spring Boot Starters?](./solutions/springboot-solutions.md#q35-what-are-spring-boot-starters)

36. [What is the naming convention for starters?](./solutions/springboot-solutions.md#q36-what-is-the-naming-convention-for-starters)

37. [What is `spring-boot-starter-web`?](./solutions/springboot-solutions.md#q37-what-is-spring-boot-starter-web)

38. [What is `spring-boot-starter-data-jpa`?](./solutions/springboot-solutions.md#q38-what-is-spring-boot-starter-data-jpa)

39. [What is `spring-boot-starter-security`?](./solutions/springboot-solutions.md#q39-what-is-spring-boot-starter-security)

40. [What is `spring-boot-starter-test`?](./solutions/springboot-solutions.md#q40-what-is-spring-boot-starter-test)

41. [Can you create a custom starter?](./solutions/springboot-solutions.md#q41-can-you-create-a-custom-starter)

42. [What dependencies are included in `spring-boot-starter-web`?](./solutions/springboot-solutions.md#q42-what-dependencies-are-included-in-spring-boot-starter-web)

[↑ Back to Table of Contents](#table-of-contents)

---

## Configuration & Properties

43. [What is `application.properties` file?](./solutions/springboot-solutions.md#q43-what-is-applicationproperties-file)

44. [What is `application.yml` file?](./solutions/springboot-solutions.md#q44-what-is-applicationyml-file)

45. [What is the difference between `.properties` and `.yml` files?](./solutions/springboot-solutions.md#q45-what-is-the-difference-between-properties-and-yml-files)

46. [How do you define custom properties?](./solutions/springboot-solutions.md#q46-how-do-you-define-custom-properties)

47. [How do you access properties in code?](./solutions/springboot-solutions.md#q47-how-do-you-access-properties-in-code)

48. [What is the property resolution hierarchy in Spring Boot?](./solutions/springboot-solutions.md#q48-what-is-the-property-resolution-hierarchy-in-spring-boot)

49. [What is `@PropertySource` annotation?](./solutions/springboot-solutions.md#q49-what-is-propertysource-annotation)

50. [How do you externalize configuration?](./solutions/springboot-solutions.md#q50-how-do-you-externalize-configuration)

51. [What are profile-specific properties files?](./solutions/springboot-solutions.md#q51-what-are-profile-specific-properties-files)

52. [How do you override properties?](./solutions/springboot-solutions.md#q52-how-do-you-override-properties)

53. [What is Spring Cloud Config?](./solutions/springboot-solutions.md#q53-what-is-spring-cloud-config)

54. [How do you encrypt sensitive properties?](./solutions/springboot-solutions.md#q54-how-do-you-encrypt-sensitive-properties)

[↑ Back to Table of Contents](#table-of-contents)

---

## Spring Boot Actuator

55. [What is Spring Boot Actuator?](./solutions/springboot-solutions.md#q55-what-is-spring-boot-actuator)

56. [How do you enable Actuator?](./solutions/springboot-solutions.md#q56-how-do-you-enable-actuator)

57. [What are actuator endpoints?](./solutions/springboot-solutions.md#q57-what-are-actuator-endpoints)

58. [What is the `/health` endpoint?](./solutions/springboot-solutions.md#q58-what-is-the-health-endpoint)

59. [What is the `/info` endpoint?](./solutions/springboot-solutions.md#q59-what-is-the-info-endpoint)

60. [What is the `/metrics` endpoint?](./solutions/springboot-solutions.md#q60-what-is-the-metrics-endpoint)

61. [How do you enable or disable specific endpoints?](./solutions/springboot-solutions.md#q61-how-do-you-enable-or-disable-specific-endpoints)

62. [How do you secure actuator endpoints?](./solutions/springboot-solutions.md#q62-how-do-you-secure-actuator-endpoints)

63. [What is the `/env` endpoint?](./solutions/springboot-solutions.md#q63-what-is-the-env-endpoint)

64. [What is the `/beans` endpoint?](./solutions/springboot-solutions.md#q64-what-is-the-beans-endpoint)

65. [How do you create custom actuator endpoints?](./solutions/springboot-solutions.md#q65-how-do-you-create-custom-actuator-endpoints)

66. [What is the difference between management port and server port?](./solutions/springboot-solutions.md#q66-what-is-the-difference-between-management-port-and-server-port)

[↑ Back to Table of Contents](#table-of-contents)

---

## REST APIs

67. [How do you create a REST API in Spring Boot?](./solutions/springboot-solutions.md#q67-how-do-you-create-a-rest-api-in-spring-boot)

68. [What is `@RestController` vs `@Controller`?](./solutions/springboot-solutions.md#q68-what-is-restcontroller-vs-controller)

69. [How do you handle different HTTP methods?](./solutions/springboot-solutions.md#q69-how-do-you-handle-different-http-methods)

70. [What is content negotiation?](./solutions/springboot-solutions.md#q70-what-is-content-negotiation)

71. [How do you produce and consume JSON?](./solutions/springboot-solutions.md#q71-how-do-you-produce-and-consume-json)

72. [How do you produce and consume XML?](./solutions/springboot-solutions.md#q72-how-do-you-produce-and-consume-xml)

73. [What is `ResponseEntity`?](./solutions/springboot-solutions.md#q73-what-is-responseentity)

74. [How do you set HTTP status codes?](./solutions/springboot-solutions.md#q74-how-do-you-set-http-status-codes)

75. [How do you set custom headers?](./solutions/springboot-solutions.md#q75-how-do-you-set-custom-headers)

76. [What is HATEOAS?](./solutions/springboot-solutions.md#q76-what-is-hateoas)

77. [How do you implement pagination?](./solutions/springboot-solutions.md#q77-how-do-you-implement-pagination)

78. [How do you implement sorting?](./solutions/springboot-solutions.md#q78-how-do-you-implement-sorting)

79. [How do you version REST APIs?](./solutions/springboot-solutions.md#q79-how-do-you-version-rest-apis)

80. [What is API documentation? How do you use Swagger/OpenAPI?](./solutions/springboot-solutions.md#q80-what-is-api-documentation-how-do-you-use-swaggeropenapi)

[↑ Back to Table of Contents](#table-of-contents)

---

## Error Handling & Validation

81. [How do you handle exceptions in Spring Boot?](./solutions/springboot-solutions.md#q81-how-do-you-handle-exceptions-in-spring-boot)

82. [What is `@ExceptionHandler` annotation?](./solutions/springboot-solutions.md#q82-what-is-exceptionhandler-annotation)

83. [What is `@ControllerAdvice`?](./solutions/springboot-solutions.md#q83-what-is-controlleradvice)

84. [What is `@RestControllerAdvice`?](./solutions/springboot-solutions.md#q84-what-is-restcontrolleradvice)

85. [How do you create custom error responses?](./solutions/springboot-solutions.md#q85-how-do-you-create-custom-error-responses)

86. [What is the default error handling in Spring Boot?](./solutions/springboot-solutions.md#q86-what-is-the-default-error-handling-in-spring-boot)

87. [How do you customize error pages?](./solutions/springboot-solutions.md#q87-how-do-you-customize-error-pages)

88. [What is Bean Validation (JSR-303)?](./solutions/springboot-solutions.md#q88-what-is-bean-validation-jsr-303)

89. [What is `@Valid` annotation?](./solutions/springboot-solutions.md#q89-what-is-valid-annotation)

90. [What are common validation annotations (`@NotNull`, `@Size`, `@Email`, etc.)?](./solutions/springboot-solutions.md#q90-what-are-common-validation-annotations-notnull-size-email-etc)

91. [How do you create custom validators?](./solutions/springboot-solutions.md#q91-how-do-you-create-custom-validators)

92. [How do you handle validation errors?](./solutions/springboot-solutions.md#q92-how-do-you-handle-validation-errors)

93. [What is `BindingResult`?](./solutions/springboot-solutions.md#q93-what-is-bindingresult)

94. [How do you validate request parameters?](./solutions/springboot-solutions.md#q94-how-do-you-validate-request-parameters)

95. [How do you validate path variables?](./solutions/springboot-solutions.md#q95-how-do-you-validate-path-variables)

96. [What is `@Validated` annotation?](./solutions/springboot-solutions.md#q96-what-is-validated-annotation)

97. [How do you perform cross-field validation?](./solutions/springboot-solutions.md#q97-how-do-you-perform-cross-field-validation)

98. [What is the difference between `@Valid` and `@Validated`?](./solutions/springboot-solutions.md#q98-what-is-the-difference-between-valid-and-validated)

99. [How do you test validation logic?](./solutions/springboot-solutions.md#q99-how-do-you-test-validation-logic)

100. [How do you internationalize error messages?](./solutions/springboot-solutions.md#q100-how-do-you-internationalize-error-messages)

[↑ Back to Table of Contents](#table-of-contents)

---

[← Back to Problem Set](problem-set.md)

