# Design Patterns
## Description
I created this repository to upload code snippets which i wrote while learning about some of the most popular design patterns. All examples are implemented in Java. Some of them are variations or they are directly from [Design Gurus](https://refactoring.guru/design-patterns/java). Besides that i added some important notes for each of the design patterns. At the end of the README section i have provided links for these design patterns.

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
* `Decorator`: Adds behavior to objects dynamically, while Adapter changes the interface of an existing object.
* `Facade`: Provides a simplified interface to a complex subsystem, while Adapter makes one interface compatible with another.

## Best Practices
* Use the Adapter pattern when you need to integrate existing classes with incompatible interfaces.
* Prefer composition over inheritance when implementing the Adapter pattern.
* Ensure that the Adapter class adheres to the Single Responsibility Principle by separating the interface conversion logic from the primary business logic.

## Common Pitfalls
* `Overuse`: Overusing the Adapter pattern can lead to a proliferation of adapter classes, increasing complexity.
* `Tight Coupling`: Failing to properly encapsulate the Adaptee can lead to tight coupling between the Adapter and the Adaptee.

# 6) Bridge
## Definition
* The `Bridge Design Pattern` is a `structural design pattern` that separates an object’s `abstraction` from its `implementation`, allowing both to vary independently.
* It decouples the abstraction (high-level logic) from the implementation (low-level details), enabling them to evolve independently.

## Purpose
* To `decouple` an abstraction from its implementation so that the two can vary independently.
* To `avoid a permanent binding` between an abstraction and its implementation.
* To `improve extensibility` by allowing both abstractions and implementations to be extended independently.

## Key Components
* `Abstraction`: Defines the high-level control logic and maintains a reference to the Implementor.
* `Refined Abstraction`: Extends the Abstraction to provide additional features or variations.
* `Implementor`: Defines the interface for the implementation classes. This is the low-level interface.
* `Concrete Implementor`: Implements the Implementor interface and provides the actual implementation details.

## How It Works
* The `Abstraction` contains a reference to the `Implementor` and delegates the low-level work to it.
* The `Refined Abstraction` extends the `Abstraction` to provide additional functionality.
* The `Concrete Implementor` implements the `Implementor` interface and provides the specific implementation details.
* The `Client` interacts with the `Abstraction`, which in turn uses the `Implementor` to perform the low-level operations.

## Advantages
* `Decoupling`: Separates the abstraction from its implementation, allowing them to vary independently.
* `Extensibility`: Both abstractions and implementations can be extended independently.
* `Single Responsibility Principle`: Separates the high-level logic from the low-level details.
* `Open/Closed Principle`: New abstractions and implementations can be introduced without modifying existing code.

## Disadvantages
* `Complexity`: Introduces additional classes and can increase the complexity of the code.
* `Overhead`: May introduce some overhead due to the additional layer of indirection.

## When To Use
* When you want to avoid a permanent binding between an abstraction and its implementation.
* When both the abstractions and their implementations need to be extended independently.
* When you want to share an implementation among multiple objects.

## Example Use Cases
* GUI frameworks where the abstraction (e.g., Window) can have different implementations (e.g., Windows, macOS, Linux).
* Device drivers where the abstraction (e.g., Printer) can have different implementations (e.g., Laser Printer, Inkjet Printer).
* Remote controls where the abstraction (e.g., Remote Control) can control different devices (e.g., TV, Radio).

## Comparision with Other Patterns
* `Adapter`: Makes unrelated classes work together, while Bridge separates an object’s abstraction from its implementation.
* `Decorator`: Adds behavior to objects dynamically, while Bridge separates the abstraction from the implementation.
* `Facade`: Provides a simplified interface to a complex subsystem, while Bridge separates the high-level logic from the low-level details.

## Best Practices
* Use the Bridge pattern when you want to avoid a permanent binding between an abstraction and its implementation.
* Ensure that the abstraction and implementation are truly independent and can vary independently.
* Prefer composition over inheritance when implementing the Bridge pattern.

## Common Pitfalls
* `Overuse`: Overusing the Bridge pattern can lead to a proliferation of classes, increasing complexity.
* `Tight Coupling`: Failing to properly decouple the abstraction from the implementation can lead to tight coupling.

# 7) Observer
## Definition
* The `Observer Design Pattern` is a behavioral design pattern that defines a `one-to-many dependency` between objects so that when one object (the `subject`) changes state, all its dependents (`observers`) are notified and updated automatically.
* It is also known as the `Publish-Subscribe` pattern.

## Purpose
* To `decouple` the subject from its observers, allowing them to interact without being tightly coupled.
* To provide a mechanism for `automatic notification` and `updating` of dependent objects when the state of the subject changes.
* To support `broadcast communication` between objects.

## Key Components
* `Subject`: The object that maintains a list of observers and notifies them of state changes. It provides methods to attach, detach, and notify observers.
* `Observer`: An interface or abstract class that defines the `update` method, which is called by the subject to notify the observer of a state change.
* `Concrete Subject`: Implements the Subject interface and maintains the state. It sends notifications to observers when its state changes.
* `Concrete Observer`: Implements the Observer interface and defines the specific actions to be taken when notified of a state change.

## How It Works
* The `Concrete Subject` maintains a list of `Observers` and provides methods to attach and detach observers.
* When the state of the `Concrete Subject` changes, it calls the `notify` method to inform all registered observers.
* Each `Concrete Observer` implements the `update` method, which is called by the `Concrete Subject` to notify the observer of the state change.
* The `Concrete Observer` can then query the `Concrete Subject` for the updated state and perform any necessary actions.

## Advantages
* `Decoupling`: Separates the subject from its observers, reducing dependencies between them.
* `Flexibility`: Allows dynamic addition and removal of observers at runtime.
* `Broadcast Communication`: Supports one-to-many communication, making it easy to notify multiple observers of state changes.
* `Reusability`: Observers can be reused across different subjects.

## Disadvantages
* `Performance Overhead`: Notifying a large number of observers can introduce performance overhead.
* `Complexity`: Can introduce complexity, especially when dealing with multiple subjects and observers.
* `Unexpected Updates`: Observers may receive updates they are not interested in, leading to unnecessary processing.

## When To Use
* When a change to one object requires changing other objects, and you don’t know how many objects need to be changed.
* When an object should be able to notify other objects without making assumptions about who those objects are.
* When you need to support broadcast communication between objects.

## Example Use Cases
* `Event Handling Systems`: Notifying multiple event handlers of an event.
* `Model-View-Controller (MVC) Architecture`: Updating views when the model changes.
* `Stock Market Applications`: Notifying investors of stock price changes.
* `Weather Monitoring Systems`: Updating displays when weather data changes.

## Comparision with Other Patterns
* `Mediator`: Centralizes complex communication between objects, while Observer decentralizes communication by allowing objects to notify each other directly.
* `Chain of Responsibility`: Passes a request along a chain of handlers, while Observer notifies multiple observers of a state change.
* `Event Aggregator`: Collects events from multiple sources and distributes them to interested parties, while Observer directly notifies observers of state changes.

## Best Practices
* Use the Observer pattern when you need to decouple the subject from its observers and allow them to interact without being tightly coupled.
* Ensure that the subject and observers are properly decoupled to avoid tight coupling.
* Consider using an event bus or message queue for more complex scenarios involving multiple subjects and observers.

## Common Pitfalls
* `Memory Leaks`: Failing to detach observers can lead to memory leaks, especially in long-running applications.
* `Performance Issues`: Notifying a large number of observers can introduce performance overhead.
* `Unexpected Updates`: Observers may receive updates they are not interested in, leading to unnecessary processing.

# 8) Iterator
## Definition
* The `Iterator Design Pattern` is a `behavioral design pattern` that provides a way to access the elements of a collection (or aggregate object) sequentially without exposing its underlying representation.
* It decouples the traversal logic from the collection, allowing the collection to change its internal structure without affecting the client code.

## Purpose
* To provide a `standard way to traverse` a collection without exposing its internal structure.
* To `separate the traversal logic` from the collection, promoting `single responsibility` and loose coupling.
* To support `multiple traversals` of the same collection simultaneously.

## Key Components
* `Iterator`: An interface or abstract class that defines the methods for traversing a collection (e.g., `next()`, `hasNext()`).
* `Concrete Iterator`: Implements the Iterator interface and provides the actual traversal logic for a specific collection.
* `Aggregate`: An interface or abstract class that defines a method to create an Iterator (e.g., createIterator()).
* `Concrete Aggregate`: Implements the Aggregate interface and provides a collection of objects. It also creates a Concrete Iterator for traversing the collection.

## How It Works
* The `Concrete Aggregate` maintains a collection of objects and provides a method to create an `Iterator`.
* The `Concrete Iterator` implements the traversal logic and keeps track of the current position in the collection.
* The `Client` uses the `Iterator` to traverse the collection without needing to know its internal structure.

## Advantages
* `Decoupling`: Separates the traversal logic from the collection, promoting loose coupling.
* `Flexibility`: Allows different traversal algorithms to be implemented and used interchangeably.
* `Single Responsibility Principle`: The collection is responsible for storing elements, while the iterator is responsible for traversing them.
* `Multiple Iterators`: Supports multiple simultaneous traversals of the same collection.

## Disadvantages
* `Complexity`: Introduces additional classes and can increase the complexity of the code.
* `Overhead`: May introduce some overhead due to the additional layer of indirection.

## When To Use
* When you need to `traverse a collection` without exposing its internal structure.
* When you want to `support multiple traversal algorithms` for the same collection.
* When you want to `provide a uniform interface` for traversing different types of collections.

## Example Use Cases
* `Collections Framework`: Traversing lists, sets, and maps in a uniform way.
* `File Systems`: Iterating over files and directories in a file system.
* `Database Query Results`: Iterating over the results of a database query.
* `Tree Structures`: Traversing nodes in a tree structure (e.g., in-order, pre-order, post-order).

## Comparision with Other Patterns
* `Visitor`: Encapsulates operations to be performed on elements of a collection, while Iterator encapsulates the traversal logic.
* `Composite`: Represents part-whole hierarchies, while Iterator focuses on traversing collections.
* `Chain of Responsibility`: Passes a request along a chain of handlers, while Iterator focuses on sequential access to elements.

## Best Practices
* Use the Iterator pattern when you need to traverse a collection without exposing its internal structure.
* Ensure that the iterator is properly encapsulated and adheres to the Single Responsibility Principle.
* Prefer composition over inheritance when implementing the Iterator pattern.

## Common Pitfalls
* `Overuse`: Overusing the Iterator pattern can lead to a proliferation of classes, increasing complexity.
* `Tight Coupling`: Failing to properly encapsulate the iterator can lead to tight coupling between the collection and the traversal logic.

# 9) Strategy
## Definition
* The `Strategy Design Pattern` is a `behavioral design pattern` that enables an algorithm's behavior to be selected at runtime.
* It defines a family of algorithms, encapsulates each one, and makes them interchangeable, allowing the algorithm to vary independently from the clients that use it.

## Purpose
* To `encapsulate` different algorithms or behaviors and make them `interchangeable`.
* To allow the `algorithm` to vary independently from the `client` that uses it.
* To promote `flexibility` and `reusability` by separating the algorithm's implementation from the client code.

## Key Components
* `Strategy`: An interface or abstract class that defines the method(s) for the algorithm.
* `Concrete Strategy`: Implements the Strategy interface and provides the actual implementation of the algorithm.
* `Context`: Maintains a reference to a Strategy object and uses it to execute the algorithm. It may also provide an interface for clients to set or change the strategy.

## How It Works
* The `Context` class contains a reference to a Strategy object.
* The `Context` delegates the execution of the algorithm to the `Strategy` object.
* The `Client` can configure the `Context` with a specific `Concrete Strategy` at runtime.
* The `Context` executes the algorithm using the configured `Strategy`.

## Advantages
* `Flexibility`: Allows algorithms to be selected and changed at runtime.
* `Reusability`: Encapsulates algorithms, making them reusable across different contexts.
* `Separation of Concerns`: Separates the algorithm's implementation from the client code.
* `Open/Closed Principle`: New strategies can be introduced without modifying existing code.

## Disadvantages
* `Complexity`: Introduces additional classes and can increase the complexity of the code.
* `Overhead`: May introduce some overhead due to the additional layer of indirection.

## When To Use
* When you need to `switch between different algorithms` or behaviors at runtime.
* When you have multiple related classes that differ only in their behavior.
* When you want to isolate the implementation details of an algorithm from the code that uses it.

## Example Use Cases
* `Sorting Algorithms`: Switching between different sorting algorithms (e.g., QuickSort, MergeSort) at runtime.
* `Payment Methods`: Supporting multiple payment methods (e.g., Credit Card, PayPal, Bitcoin) in an e-commerce application.
* `Compression Algorithms`: Choosing between different compression algorithms (e.g., ZIP, RAR) based on user preference.
* `Navigation Systems`: Switching between different routing algorithms (e.g., shortest path, fastest route) in a GPS application.

## Comparision with Other Patterns
* `State`: Encapsulates state-specific behavior and allows an object to change its behavior when its state changes, while Strategy encapsulates algorithms and allows them to be selected at runtime.
* `Template Method`: Defines the skeleton of an algorithm in a method, deferring some steps to subclasses, while Strategy encapsulates the entire algorithm.
* `Command`: Encapsulates a request as an object, allowing parameterization of clients with different requests, while Strategy encapsulates an algorithm.

## Best Practices
* Use the Strategy pattern when you need to switch between different algorithms or behaviors at runtime.
* Ensure that the strategies are properly encapsulated and adhere to the Single Responsibility Principle.
* Prefer composition over inheritance when implementing the Strategy pattern.

## Common Pitfalls
* `Overuse`: Overusing the Strategy pattern can lead to a proliferation of classes, increasing complexity.
* `Tight Coupling`: Failing to properly encapsulate the strategies can lead to tight coupling between the context and the strategies.

# 10) Facade
## Definition
* The `Facade Design Pattern` is a `structural design pattern` that provides a `simplified` interface to a complex subsystem or set of interfaces.
* It acts as a `higher-level interface` that makes the subsystem easier to use by hiding its complexities.

## Purpose
* To `simplify the interaction` with a complex system by providing a unified and easy-to-use interface.
* To `decouple` the client code from the subsystem, making the system more modular and easier to maintain.
* To `reduce dependencies` between the client and the subsystem, promoting loose coupling.

## Key Components
* `Facade`: A class that provides a simplified interface to a complex subsystem. It delegates client requests to appropriate objects within the subsystem.
* `Subsystem Classes`: A set of classes that implement the functionality of the subsystem. These classes are not aware of the Facade and work independently.
* `Client`: The class or code that interacts with the Facade to access the subsystem's functionality.

## How It Works
* The `Facade` class provides a `single entry point` to the subsystem, encapsulating its complexity.
* The `Client` interacts with the `Facade` instead of directly interacting with the subsystem classes.
* The `Facade` delegates the client's requests to the appropriate classes within the subsystem and coordinates their interactions.

## Advantages
* `Simplified Interface`: Provides a simple and easy-to-use interface to a complex system.
* `Decoupling`: Reduces dependencies between the client and the subsystem, promoting loose coupling.
* `Improved Readability`: Makes the client code more readable and maintainable by hiding the subsystem's complexity.
* `Flexibility`: Allows the subsystem to evolve independently of the client code.

## Disadvantages
* `Limited Flexibility`: The Facade may not expose all the functionality of the subsystem, limiting flexibility for advanced users.
* `Potential Bottleneck`: The Facade can become a bottleneck if it is overused or not properly designed.

## When To Use
* When you want to provide a `simple interface` to a complex subsystem.
* When you need to `decouple` the client code from the subsystem, making the system more modular and easier to maintain.
* When you want to `layer` a system, providing a clear entry point for each layer.

## Example Use Cases
* `Libraries and Frameworks`: Providing a simplified API for complex libraries or frameworks.
* `Home Automation Systems`: Offering a unified interface to control various home devices (e.g., lights, thermostat, security system).
* `E-commerce Platforms`: Simplifying the process of placing an order by handling inventory, payment, and shipping in the background.
* `Operating Systems`: Providing a high-level interface for file system operations, hiding the complexities of low-level system calls.

## Comparision with Other Patterns
* `Adapter`: Converts one interface to another, while Facade provides a simplified interface to a complex subsystem.
* `Proxy`: Controls access to an object, while Facade simplifies the interaction with a set of objects.
* `Mediator`: Centralizes complex communication between objects, while Facade simplifies the interaction with a subsystem.

## Best Practices
* Use the Facade pattern when you want to provide a simple and unified interface to a complex subsystem.
* Ensure that the Facade properly encapsulates the subsystem's complexity and provides a clear and easy-to-use interface.
* Avoid overloading the Facade with too many responsibilities, as it can become a bottleneck.

## Common Pitfalls
* `Overuse`: Overusing the Facade pattern can lead to a monolithic interface that is difficult to maintain.
* `Limited Flexibility`: The Facade may not expose all the functionality of the subsystem, limiting flexibility for advanced users.

### Articles
* [Abstract Factory](https://refactoring.guru/design-patterns/abstract-factory)
* [Builder](https://refactoring.guru/design-patterns/builder)
* [Prototype](https://refactoring.guru/design-patterns/prototype)
* [Singleton](https://refactoring.guru/design-patterns/singleton)
* [Adapter](https://refactoring.guru/design-patterns/adapter)
* [Bridge](https://refactoring.guru/design-patterns/bridge)
* [Observer](https://refactoring.guru/design-patterns/observer)
* [Iterator](https://refactoring.guru/design-patterns/iterator)
* [Strategy](https://refactoring.guru/design-patterns/strategy)
* [Facade](https://refactoring.guru/design-patterns/facade)
