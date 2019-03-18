# Java Introducing #
## Class Content  ##
- [cadastre-se no curso](https://canvas.instructure.com/enroll/K34RK8)
## History ##
- creator: James Gosling
- purpose: `write once, run anywhere`
- born: 1991
- curiosities: [James Gosling Q&A](https://www.youtube.com/watch?v=9ei-rbULWoA)
## About the Language ##
- use cases: web, cloud, mobile, embedded, eletronics, auto
- oop
  - abstraction, classes, construction, interaction, encapsulation, relation
- flux
  - write -> compile(javac) -> load class(java/ram) -> bytecode checker(sercurity check/cpu) -> execute(jvm)
- class: details of an object and his features
- object: made from class configuration
## OOP
### Principles
**High cohesion**
- a Class should be good in doing just one thing
**Code coupling**
- think always API-first, make a reusable interface for your code
**Shadowing**
- avoid same name variables in same context, make code readability better
**Constructors**
- interface for Class instantiations

**Class**
```java
	public class Dog {
	   String breed;
	   int age;
	   String color;

	   void barking() {
	   }

	   void hungry() {
	   }

	   void sleeping() {
	   }
	}
```
**Object**
```bash
	Snuffles, 7 years old, white
```
