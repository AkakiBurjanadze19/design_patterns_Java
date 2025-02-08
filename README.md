# Design Pattern Notes

# Abstract Factory
## Definition
* The Abstract Factory Design Pattern is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.
* It is often used when a system needs to be independent of how its objects are created, composed, and represented.
  
## Purpose
* To create families of related objects without specifying their concrete classes.
* To ensure that the created objects are compatible and work together.
* To promote loose coupling by abstracting the creation process.

## Key Components
* `Abstract Factory`: An interface or abstract class that declares a set of methods for creating each of the related objects (e.g., `createProductA()`, `createProductB()`).
* `Concrete Factory`: Implements the Abstract Factory interface to produce a family of related objects (e.g., `ConcreteFactory1`, `ConcreteFactory2`).
* `Abstract Product`: Declares an interface for a type of product object (e.g., `AbstractProductA`, `AbstractProductB`).
* `Concrete Product`: Implements the Abstract Product interface to define a specific product (e.g., `ProductA1`, `ProductB1`).
* `Client`: Uses the Abstract Factory and Abstract Product interfaces to create and interact with objects.

## How It Works
* The `Clien` interacts with the `Abstract Factory` to create objects.
* The `Concrete` Factory determines the actual objects to be created.
* The `Client` is unaware of the specific classes of the objects being created, as it works with the `Abstract Product` interfaces.

## Advantages
* `Encapsulation`: Hides the implementation details of object creation.
* `Flexibility`: Allows easy switching between families of related objects.
* `Consistency`: Ensures that the created objects are compatible and work together.
* `Scalability`: New families of products can be added without modifying existing code.

## Disadvantages
* `Complexity`: Introduces additional classes and interfaces, which can increase complexity.
* `Rigidity`: Adding new types of products may require modifying the Abstract Factory interface and all its implementations.

## When To Use
* When the system needs to be independent of how its objects are created, composed, and represented.
* When the system needs to be configured with multiple families of objects.
* When a family of related objects is designed to be used together, and this constraint needs to be enforced.

## Example Use Cases
* GUI libraries where different operating systems require different implementations of buttons, menus, and dialogs.
* Cross-platform applications that need to support multiple platforms (e.g., Windows, macOS, Linux) with consistent behavior.
* Database access layers that need to support multiple database systems (e.g., MySQL, PostgreSQL, Oracle).

## Comparision with Other Patterns
* `Factory Method`: Focuses on creating a single product, while Abstract Factory creates families of related products.
* `Builder`: Focuses on constructing complex objects step-by-step, while Abstract Factory focuses on creating families of objects.
* `Prototype`: Focuses on cloning objects, while Abstract Factory focuses on creating new objects from scratch.

## Best Practices
* Use the Abstract Factory pattern when the system needs to support multiple families of related objects.
* Ensure that the Abstract Factory interface is designed to be flexible and extensible.
* Avoid overusing the pattern, as it can introduce unnecessary complexity if not needed.

## Common Pitfalls
* Creating too many factories, which can lead to a bloated codebase.
* Failing to properly encapsulate the creation logic, leading to tight coupling.
