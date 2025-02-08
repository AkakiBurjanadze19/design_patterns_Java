# Design Pattern Notes

# 1) Abstract Factory
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

# 2) Builder
## Definition
* The Builder Design Pattern is a creational design pattern that separates the construction of a complex object from its representation.
* It allows the same construction process to create different representations of the object.

## Purpose
* To `simplify the creation of complex objects` by breaking down the construction process into smaller, more manageable steps.
* To `encapsulate` the construction logic and allow the same process to create different representations of the object.
* To `improve readability and maintainability` of the code, especially when dealing with objects that require many parameters or configurations.

## Key Components
* `Builder`: An interface or abstract class that defines the steps required to build the complex object (e.g., `buildPartA()`, `buildPartB()`).
* `Concrete Builder`: Implements the Builder interface to provide specific implementations for each step of the construction process.
* `Director`: Controls the construction process by using the Builder interface. It defines the order in which the construction steps are executed.
* `Product`: The complex object being constructed. It is the final output of the construction process.
* `Client`: Initiates the construction process by creating a Director and a Builder, and then requesting the Director to construct the product.

## How It Works
* The `Client` creates a `Director` and a `Concrete Builder`.
* The `Director` uses the `Builder` to construct the `Product` step-by-step.
* The `Client` retrieves the final `Product` from the `Builder` once the construction is complete.

## Advantages
* `Separation of Concerns`: Separates the construction logic from the representation, making the code easier to understand and maintain.
* `Flexibility`: Allows different representations of the object to be created using the same construction process.
* `Reusability`: The same construction process can be reused to create different products.
* `Improved Readability`: Reduces the need for complex constructors with many parameters.

## Disadvantages
* `Complexity`: Introduces additional classes and interfaces, which can increase the complexity of the code.
* `Overhead`: May introduce some overhead due to the need to create and manage multiple builder objects.

## When To Use
* When the construction process of an object is complex and involves multiple steps.
* When the object being constructed has many optional parameters or configurations.
* When you want to create different representations of the same object using the same construction process.
* When you want to ensure that the construction process is consistent and reusable.

## Example Use Cases
* Constructing complex documents, such as HTML or XML documents.
* Building complex user interfaces with multiple components.
* Creating meal plans in a restaurant application, where each meal can have different components (e.g., main course, side dish, drink).

## Comparision with Other Patterns
* `Factory Method`: Focuses on creating a single product, while Builder focuses on constructing a complex object step-by-step.
* `Abstract Factory`: Creates families of related objects, while Builder constructs a single complex object.
* `Prototype`: Focuses on cloning objects, while Builder focuses on constructing new objects from scratch.

## Best Practices
* Use the Builder pattern when the construction process of an object is complex and involves multiple steps.
* Ensure that the Builder interface is designed to be flexible and extensible.
* Avoid overusing the pattern, as it can introduce unnecessary complexity if not needed.

## Common Pitfalls
* Creating too many builders, which can lead to a bloated codebase.
* Failing to properly encapsulate the construction logic, leading to tight coupling.
