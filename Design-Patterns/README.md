# Head First Design Patterns

## Design Toolbox
* OO Basics
    * Abstraction
        * Abstraction is a process of hiding the implementation details from the user, only the functionality will be provided to the user. In other words, the user will have the information on what the object does instead of how it does it. In Java, abstraction is achieved using Abstract classes and interfaces.
    * Encapsulation
        * Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding. To achieve encapsulation in Java −
            * Declare the variables of a class as private.
            * Provide public setter and getter methods to modify and view the variables values.
    * Polymorphism
        * Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object. Any Java object that can pass more than one *IS-A* test is considered to be polymorphic. 
    * Inheritance
        * Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another. With the use of inheritance the information is made manageable in a hierarchical order. The class which inherits the properties of other is known as subclass (derived class, child class) and the class whose properties are inherited is known as superclass (base class, parent class).
        * **extends** is the keyword used to inherit the properties of a class. 
* OO Principles
    * Encapsulate what varies
    * Favor composition over inheritance
    * Program to interfaces, not implementations.
    * Strive for loosely coupled designs between objects that interact.
    * Open-Closed: Classes should be open for extension but closed for modification.
* OO Patterns
    * Strategy - defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
    * Observer - defines a one-to-many relationship between a set of objects. When the state of one object changes, all of its dependents are notified.
    * Decorator - Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.