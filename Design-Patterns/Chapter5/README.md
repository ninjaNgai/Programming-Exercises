# The Singleton Pattern
**Definition:** The Singleton Pattern* ensures a class has only one instance, and provides a global point of access to it.

## Design Principles

# General Notes
* The Singleton Pattern ensures you have at most one instance of a class in your application
* The Singleton Pattern also provides a global access point to that instance
* Java's implementation of the Singleton Pattern makes use of a private constructor, a static method combined with a static variable
* Examine your performance and resource constraints and carefully choose an appropriate Singleton implementation for multi-threaded applications (and we should consider all applications multithreaded!)
* Beware of the double-checked locking implementation; it is not thread-safe in version before Java 2, version 5
* Be careful if you are using multiple class loaders; this could defeat the Singleton implementation and result in multiple instances
* If you are using a JVM earlier than 1.2, you'll need to create a registry of Singletons to defeat the garbage collector.