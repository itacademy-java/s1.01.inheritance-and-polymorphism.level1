## Inheritance andpolimorphism
### Level 1

#### Exercise 1:

In a music group, there are different types of musical instruments: wind instruments, string instruments, and percussion instruments.

All instruments have attributes: name and price. They also have a method called play(). This method is abstract in the base class Instrument, and therefore must be implemented in each subclass.

- If a wind instrument is being played, the method must print: "A wind instrument is playing".
- If it is a string instrument: "A string instrument is playing".
- If it is a percussion instrument: "A percussion instrument is playing".

The class loading process only happens once. Demonstrate that loading can be triggered either by creating the first instance of the class or by accessing a static member.

Information about initialization blocks and static blocks in Java:
https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html

#### Technical goal:

Understand and apply:

- Abstract classes.
- Inheritance.
- Polymorphism (overridden methods).
- Learn how and when a class is loaded in Java.
- Use static blocks and instance initialization blocks to observe class loading behavior.

