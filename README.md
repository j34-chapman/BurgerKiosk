
# Burger Kiosk Refactoring Project

Welcome to the Burger Kiosk Refactoring Project repository. This project highlights the refactoring of the Burger Kiosk code, driven by design pattern principles and object-oriented programming techniques. Serving as a focal point of the L5 Software Design & Architecture course assessment, this project illustrates the benefits of applying these design pattern principles, leading to enhanced software design and maintainability. For a insight into the Burger Kiosk codebase, please watch the video below. In this video, I outline the initial challenges posed by the original code and demonstrate how a well-considered design pattern approach fosters a maintainable and highly cohesive codebase.


**Watch the Video Demonstration**:  [Watch the Video](https://youtu.be/TbXCT4L7WUk)


## Understanding the Code

#### Original UML

![Original UML](https://github.com/j34-chapman/BurgerKiosk/assets/93520494/c6124dae-0c9e-4bd1-b564-8f4751b058f2)

To appreciate the rationale behind adopting the Bridge Design Pattern, let's start with the original BurgerKiosk UML. The original diagram is intricate, featuring numerous classes heavily reliant on inheritance. However, this approach leads to challenges when extending functionality and adhering to key design principles.

#### Bridge UML

![Bridge UML](https://github.com/j34-chapman/BurgerKiosk/assets/93520494/86ddf5f3-6c6f-4f5f-9069-4e597d1232af)

Recognizing the complexities of the original code, I identified the need for abstraction and implementation hierarchies. This structural shift involves defining interfaces for bread and filling types, while implementing concrete classes for specific variants. This modular approach allows for easier expansion and modification.

The Bridge pattern enhances flexibility by enabling the integration of new bread and filling options without altering existing code. This is achieved through the creation of distinct concrete classes adhering to established interfaces.

In summary, the adoption of the Bridge pattern brings improved maintainability, flexibility, and scalability to the codebase, aligning with fundamental design principles.



## Knowledge from Study Materials

In preparation for this project, I undertook a comprehensive study of design patterns and their application in software design. By exploring various resources, I gained insights into the significance of design patterns in crafting maintainable and adaptable software systems.

I engaged with a variety of reading materials that collectively enriched my understanding of software design concepts:

- A collection of literature introduced me to the world of design patterns, emphasizing their role in solving recurring software design challenges.

- Additional resources highlighted the importance of clear roles, responsibilities, and collaborations within software components, fostering a holistic understanding of effective software design.

- Through timeless principles of software architecture, I learned how to create software systems that endure and adapt.

## Refactored Code

The refactored code can be explored in the [src](src/) directory. It reflects the successful application of design patterns and object-oriented principles, resulting in a more organized, maintainable, and flexible codebase.

## Getting Started

For instructions on running the refactored code and experiencing the improvements firsthand, please refer to the [Getting Started](#getting-started) section of this README.

## Conclusion

This project represents the culmination of my exploration of design patterns and object-oriented principles. By applying these concepts, I was able to not only address concerns in the original code but also enhance its architecture and long-term viability.
