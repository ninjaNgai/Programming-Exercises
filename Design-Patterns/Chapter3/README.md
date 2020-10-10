# The Decorator Pattern
**Definition:** The *Decorator Pattern* attaches additional responsibilities to an object dynamically. Decorates provide a flexible alternative to subclassing for extending functionality.
* Each component can be used on its own, or wrapped by a decorator.
    * Each decorator HAS-A (wraps) a component which means the decorator has an instance variable that holds a reference to a component.

* Decorators have the same supertype as the objects they decorate.
* You can use one or more decorators to wrap an object.
* Given that the decorator has the same supertype as the object it decorates, we can pass around a decorated object in place of the original (wrapped) object.
* Objects can be decorated at any time, so we can decorate objects dynamically at runtime with as many decorators as we like.
* **KEY POINT**: The decorator adds its own behavior either before and/or after delegating to the object it decorates to do the rest of the job. 

## Design Principles
* **Open-Closed Principle**
    * Classes should be open for extension, but closed for modification.

### Notes
* In the Starbuzz example, subtype polymorphism is used. 
    * **Subtype polymorphism** gives a single term many types using the subsumption rule. For example, a function with argument τ can operate on any value with a type that is a subtype of τ.
    * Example: `Beverage beverage2 = new DarkRoast();` DarkRoast is a subtype of Beverage.

#### Takeaways
* Inheritance is one form of extension, but not necessarily the best way to achieve flexibility in our designs.
* In our designs we should allow behavior to be extended without the need to modify existing code
* Composition and delegation can often be used to add new behaviors at runtime.
* The Decorator Pattern provides an alternative to subclassing for extending behavior
* The Decorator Pattern involves a set of decorator classes that are used to wrap concreate components
* Decorator classes mirror the type of components they decorate. (In fact, they are the same type as the components they decorate, either through inheritance or interface implementation.)
* Decorators change the behavior of the components by adding new functionality before and/or after (or even in place of) method calls to the component.
* You can wrap a component with any number of decorators
* Decorators are typically transparent to the client of the component; that is, unless the client is relying the component's concrete type.
* Decorators can result in many small objects in our design, and overuse can be complex.