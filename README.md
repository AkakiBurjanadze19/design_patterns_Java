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
* The `Client` interacts with the `Abstract Factory` to create objects.
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

# 3) Prototype
## Definition
* The `Prototype Design Pattern` is a `creational design pattern` that allows you to create new objects by copying an existing object, known as the `prototype`.
* It is used when the creation of an object is costly or complex, and you want to avoid repeating the same initialization process.

## Purpose
* To `reduce the cost of creating objects` by cloning an existing instance.
* To `simplify object creation` when the construction process is complex or resource-intensive.
* To `provide a flexible way to create new objects` without specifying their exact class.

## Key Components
* `Prototype`: An interface or abstract class that declares a method for cloning itself (e.g., `clone()`).
* `Concrete Prototype`: Implements the Prototype interface and provides the actual cloning logic.
* `Client`: Creates new objects by copying the prototype.

## Advantages
* `Reduced Overhead`: Avoids the cost of initializing an object from scratch.
* `Flexibility`: Allows dynamic addition and removal of objects at runtime.
* `Simplified Object Creation`: Simplifies the creation of complex objects by copying existing instances.
* `Performance Improvement`: Can improve performance by avoiding costly construction processes.

## Disadvantages
* `Complexity`: Introduces additional complexity, especially when dealing with deep copies.
* `Cloning Issues`: Requires careful handling of deep and shallow copies to avoid unintended side effects.

## When To Use
* When the creation of an object is more expensive or complex than copying an existing instance.
* When you want to avoid building a class hierarchy of factories that parallels the class hierarchy of products.
* When you need to create instances of a class that are similar to existing instances, with only a few differences.

## Example Use Cases
* Creating multiple instances of a complex object with similar initial states (e.g., game characters, document templates).
* Implementing undo/redo functionality by storing and restoring object states.
* Configuring objects with default settings and then customizing them as needed.

## Comparision with Other Patterns
* `Factory Method`: Focuses on creating a single product, while Prototype focuses on cloning existing instances.
* `Abstract Factory`: Creates families of related objects, while Prototype creates new objects by copying existing ones.
* `Builder`: Focuses on constructing complex objects step-by-step, while Prototype focuses on copying existing objects.

## Best Practices
* Use the Prototype pattern when the creation of an object is costly or complex, and you want to avoid repeating the same initialization process.
* Ensure that the cloning logic is properly implemented to handle deep and shallow copies as needed.
* Avoid overusing the pattern, as it can introduce unnecessary complexity if not needed.

## Common Pitfalls
* `Shallow Copy Issues`: Creating shallow copies that share references to mutable objects, leading to unintended side effects.
* `Complex Cloning Logic`: Implementing complex cloning logic that can be difficult to maintain and debug.

# 4) Singleton
## Definition
* The `Singleton Design Pattern` is a `creational design pattern` that ensures a class has only `one instance` and provides a `global point of access` to that instance.
* It is used when exactly one object is needed to coordinate actions across a system.

## Purpose
* To `control object creation`, ensuring that only one instance of a class exists.
* To provide a `global access point` to that instance.
* To `manage shared resources` or centralized control logic, such as configuration settings, logging, or connection pools.

## Key Components
* `Singleton Class`: The class that implements the Singleton pattern.
* A `private constructor` to prevent instantiation from outside the class.
* A `static instance` of itself.
* A `static method` (e.g., `getInstance()`) to provide access to the single instance.

## Advantages
* `Single Instance`: Ensures that only one instance of the class exists, which is useful for managing shared resources.
* `Global Access`: Provides a global point of access to the instance.
* `Lazy Initialization`: The instance is created only when it is needed, saving resources.
* `Thread Safety`: Can be implemented to ensure thread-safe access to the instance.

## Disadvantages
* `Global State`: Introduces a global state, which can make the system harder to test and maintain.
* `Scalability Issues`: Can become a bottleneck in a distributed system if overused.
* `Violation of Single Responsibility Principle`: Combines the responsibility of managing its lifecycle and its primary functionality.

## When To Use
* When you need to ensure that only one instance of a class exists (e.g., configuration managers, logging systems, connection pools).
* When you need a global point of access to that instance.
* When you want to control shared resources or centralized logic.

## Example Use Cases
* `Configuration Managers`: Managing application settings that need to be accessed globally.
* `Logging Systems`: Centralizing logging functionality across an application.
* `Database Connection Pools`: Managing a pool of database connections.
* `Caching Mechanisms`: Implementing a global cache for frequently accessed data.

## Comparision with Other Patterns
* `Factory Method`: Focuses on creating objects, while Singleton ensures only one instance exists.
* `Abstract Factory`: Creates families of related objects, while Singleton ensures a single instance of a class.
* `Prototype`: Focuses on cloning objects, while Singleton focuses on controlling object creation.

## Best Practices
* Use the Singleton pattern sparingly and only when absolutely necessary.
* Ensure thread safety if the Singleton is accessed by multiple threads.
* Avoid using Singleton for managing state that needs to be shared across different parts of the application, as it can lead to tight coupling.

## Common Pitfalls
* `Global State`: Introducing global state can make the system harder to test and maintain.
* `Overuse`: Overusing the Singleton pattern can lead to scalability issues and tight coupling.
* `Thread Safety`: Failing to implement thread safety can lead to multiple instances being created in a multi-threaded environment.

# 5) Adapter
## Definition
* The `Adapter Design Pattern` is a `structural design pattern` that allows incompatible interfaces to work together.
* It acts as a bridge between two incompatible interfaces by converting the interface of a class into another interface that a client expects.

## Purpose
* To `enable collaboration` between classes with incompatible interfaces.
* To `reuse existing classes` without modifying their code.
* To provide a `unified interface` for a set of interfaces in a subsystem.

## Key Components
* `Target`: The interface that the client expects or uses.
* `Adaptee`: The existing class with an incompatible interface that needs to be adapted.
* `Adapter`: A class that implements the Target interface and wraps the Adaptee, translating requests from the Target interface to the Adaptee's interface.
* `Client`: The class that interacts with the Target interface.

## How It Works
* The `Client` interacts with the Target interface.
* The `Adapter` implements the `Target` interface and contains a reference to the `Adaptee`.
* The `Adapter` translates requests from the `Client` into a form that the `Adaptee` can understand.

## Types of Adapters
* `Class Adapter`: Uses multiple inheritance to adapt one interface to another. This is not possible in languages like Java that do not support multiple inheritance.
* `Object Adapter`: Uses composition to wrap the Adaptee and implement the Target interface. This is the more common approach.

## Advantages
* `Reusability`: Allows existing classes to be reused without modification.
* `Flexibility`: Enables collaboration between classes with incompatible interfaces.
* `Single Responsibility Principle`: Separates the interface conversion logic from the primary business logic.
* `Open/Closed Principle`: Introduces new adapters without changing existing code.

## Disadvantages
* `Complexity`: Introduces additional classes and can increase the complexity of the code.
* `Overhead`: May introduce some overhead due to the additional layer of indirection.

## When To Use
* When you want to use an existing class, but its interface does not match the one you need.
* When you want to create a reusable class that cooperates with classes that have incompatible interfaces.
* When you need to integrate multiple third-party libraries with different interfaces.

## Example Use Cases
* Integrating legacy code with new systems.
* Adapting third-party libraries to work with your application.
* Providing a unified interface for a set of interfaces in a subsystem.

## Comparision with Other Patterns
* `Bridge`: Separates an object’s abstraction from its implementation, while Adapter makes unrelated classes work together.
* `Decorato`r: Adds behavior to objects dynamically, while Adapter changes the interface of an existing object.
* `Facade`: Provides a simplified interface to a complex subsystem, while Adapter makes one interface compatible with another.

## Best Practices
* Use the Adapter pattern when you need to integrate existing classes with incompatible interfaces.
* Prefer composition over inheritance when implementing the Adapter pattern.
* Ensure that the Adapter class adheres to the Single Responsibility Principle by separating the interface conversion logic from the primary business logic.

## Common Pitfalls
* `Overuse`: Overusing the Adapter pattern can lead to a proliferation of adapter classes, increasing complexity.
* `Tight Coupling`: Failing to properly encapsulate the Adaptee can lead to tight coupling between the Adapter and the Adaptee.
