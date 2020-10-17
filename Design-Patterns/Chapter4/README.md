# The Factory Pattern
**Definition:** The *Factory Pattern* defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantation to subclasses.

## Design Principles
* **Dependency Inversion Principle**
    * Depend upon abstractions. Do not depend upon concrete classes.
    * Guidelines to help avoid )) designs that violate the Dependency Inversion Principle:
        * No variable should hold a reference to a concrete class. 
            * If you use `new`, you'll be holding a reference to a concrete class. Use a factory to get around that!
        * No class should derive from a concrete class
            * If you derive from a concrete class, you're depending on a concrete class. Derive from an abstraction, like an interface or an abstract class.
        * No method should override an implemented method of any of its base classes.
            * If you override an implemented method, then your base class wasn't really an abstraction to start with. Those methods implemented in the base class are meant to be shared by all your subclasses.


## Notes
* The phrase "implement an interface": a concrete class implementing a method from a supertype (which could be a class OR interface) is still considered to be "implementing the interface" of that supertype
* `abstract Product factoryMethod(String type)`
    * A factory method is `abstract` so the subclasses are counted on to handle object creation
    * A factory method returns a `Product` that is typically used within methods defined in the superclass.
    * A factory method isolates the client (the code in the superclass, like `orderPizza()`) from knowing what kind of concrete Product is actually created.
    * A factory method may be parameterized (or not) to select among several variations of a product.
* The Factory Method Pattern gives us a way to encapsulate the instantiations of concrete types.
    * The Creator is a class that contains the implementations for all of the methods to manipulate products, except for the factory method.
        * The abstract `factoryMethod()` is what all Creator subclasses must implement
        * The *ConcreteCreator* implements the `factoryMethod()`, which is the method that actually produces products.
        * The *ConcreteCreator* is responsible for creating one or more concrete products. it is the only class that has the knowledge of how to create these products.
    * All products must implement the same *Product* interface so that the classes that use the products can refer to the interface, not the concrete class.
* What's the difference between Simple Factory and Factory Method?
    * The *Simple Factory* can be thought of as a one-shot deal, while with the *Factory Method* you are creating a framework that lets the subclasses decide which implementation will be used.
        * Example: The `orderPizza()` method in the Factory Method provides a general framework for creating pizzas that relies on a factory method to actually create the concrete classes that go into making a pizza. By subclassing the `PizzaStore` class, you decide what concrete products go into making the pizza that `orderPizza()` returns. Compare that with the SimpleFactory, which gives you a way to encapsulate object creation, but doesn't give you the flexibility of the Factory method because there is no way to vary the products you're creating.
* A "high-level" component is a class with behavior defined in terms of other, "low-level" components.
    * Example: `PizzaStore` is a high-level component because its behavior is defined in terms of pizzas - it creates all the different pizza objects, and prepares, bakes, cuts, and boxes them, while the pizzas it uses are low level components.

# The Abstract Factory Pattern
**Definition:** The *Abstract Factory Pattern* provides an interface for creating families of related or dependent objects without specifying their concrete classes.

### Using an Abstract Factory
* An **Abstract Factory** gives us an interface for creating a family of products. By writing code that uses this interface, we decouple our code from the actual factory that creates the products. That allows us to implement a variety of factories that produce products meant for different contexts - such as different regions, different operating systems, or different look and feels. Because our code is decoupled from the actual products, we can substitute different factories to get different behaviors (like getting marinara instead of plum tomatoes)

#### Application
An Abstract Factory provides an interface for a family of products.
* In our case, the family consists of all the things we need to make a pizza: dough, sauce, cheese, meats, and veggies.

From the Abstract Factory, we derive one or more concrete factories that produce the same products, but with different implementations.
We then write our code so that it uses the factory to create products. By passing in a variety of factories, we get a variety of implementations of those products. But our client code stays the same.

# General Notes
* All factories encapsulate object creation
* Simple Factory, while not a bona fide design pattern, is a simple way to decouple your clients from concrete classes.
* Factory Method relies on inheritance: object creation is delegated to subclasses, which implement the factory method to create objects.
* Abstract Factory relies on object composition: object creation is implemented in methods exposed in the factory interface.
* All factory patterns promote loose coupling by reducing the dependency of your application on concrete classes.
* The intent of Factory Method is to allow a class to defer instantiation to its subclasses.
* The intent of Abstract Factory is to create families of related objects without having to depend on their concrete classes.
* The Dependency Inversion Principle guides us to avoid dependencies on concrete types and to strive for abstractions.
* Factories are a powerful technique for coding to abstractions, not concrete classes.