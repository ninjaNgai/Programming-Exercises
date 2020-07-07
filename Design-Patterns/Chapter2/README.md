# The Observer Pattern
**Definition:** The *Observer Pattern* defines a 1 to Many dependency between objects so that when one object changes the state, all of its dependents are notified and updated automatically.

* The Observer Pattern defines a one-to-many relationship between a set of objects. When the state of one object changes, all of its dependents are notified.

#### The power of loose coupling
* When two objects are loosely coupled, they can interact, but have very little knowledge of each other.
* The Observer Pattern provides an object design where subjects and observers are loosely coupled. The only thing the subject knows about an observer is that it implements a certain interface (the Observer interface).

## Design Principles
1. Strive for loosely coupled designs between objects that interact
    * Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects.
