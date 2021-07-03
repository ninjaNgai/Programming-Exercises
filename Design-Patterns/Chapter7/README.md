# The Adapter and Facade Patterns
**Definition:** *The Adapter Pattern* converts the interface of the class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

**Definition:** *The Facade Pattern* makes an interface simpler by hiding all of the complexity of one or more classes behind a clean, well-lit facade.

## Design Principles

### Object Adapter
- The Adapter Pattern uses object composition to wrap the adaptee with an altered interface.
  - An added advantage is that we can use an adapter with any subclass of the adaptee.
  - The object Adapter uses composition to pass requests to an Adaptee.
  - The composition is achieved by using an instance variable that refers to other objects. We have to favor Composition over Inheritance.
	
### Class Adapter
- The Class Adapter pattern needs multiple inheritance to implement this pattern which isn't possible in Java. Instead of using composition to adapt the Adaptee, the Adapter now subclasses the Adaptee and the Target classes.

# General Notes

## How the client uses the Object Adapter pattern
1. The client makes a request to the adapter by calling a method on it using the target interface

2. The adapter translates the request into one or more calls on the adaptee using the adaptee interface.

3. The client receives the results of the call and never knows there is an adapter doing the translation

Note: The Client and Adaptee are **decoupled** -- neither knows about the other. 

### Application
We have a MIDI controller with a USB port and the Macbook Pro has a USB-C port.

We need to use a USB to USB-C adapter to make multiple requests. The requests are in the form of transporting the key commands from the controller to the music software on the Macbook Pro.

Our client: MIDI controller
The USB to USB-C adapter implements the target interface (USB) and holds an instance of the Adaptee (USB-C).