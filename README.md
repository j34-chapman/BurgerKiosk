
# Burger Kiosk Refactoring Project

Welcome to the Burger Kiosk Refactoring Project repository. This project highlights the refactoring of the Burger Kiosk code, driven by design pattern principles and object-oriented programming techniques. Serving as a focal point of the L5 Software Design & Architecture course assessment, this project illustrates the benefits of applying these design pattern principles, leading to enhanced software design and maintainability. For a insight into the Burger Kiosk codebase, please watch the video below. In this video, I outline the initial challenges posed by the original code and demonstrate how a well-considered design pattern approach fosters a maintainable and highly cohesive codebase. Please excuse the poor commentation I am not very confident on video.


**Watch the Video Demonstration**:  [Watch the Video](https://youtu.be/TbXCT4L7WUk)


## Understanding the Code

#### Original UML

![Original UML](https://github.com/j34-chapman/BurgerKiosk/assets/93520494/c6124dae-0c9e-4bd1-b564-8f4751b058f2)

To appreciate the rationale behind adopting the Bridge Design Pattern, let's start with the original BurgerKiosk UML. The original diagram is intricate, featuring numerous classes heavily reliant on inheritance. However, this approach leads to challenges when extending functionality and adhering to key design principles.

#### Bridge UML
<img width="1244" alt="Screenshot 2023-08-16 at 15 56 26" src="https://github.com/j34-chapman/BurgerKiosk/assets/93520494/a91302ae-968e-4c9b-8faf-75fae4506424">

Recognizing the complexities of the original code, I identified the need for abstraction (BreadType) and implementation (Fillings) hierarchies. This structural shift involves defining interfaces for various bread and filling types, while implementing distinct classes for specific variants. This modular approach fosters easier expansion and modification, aligning with the principles of low coupling and the Open-Closed Principle (OCP).

The Bridge pattern takes center stage here, enhancing flexibility by facilitating the integration of new bread and filling options without the need to alter the existing codebase, with the use of concrete implementations (filling variations) and refined abstractions (bread variations) . This is achieved through the creation of dedicated classes adhering to established interfaces, which promotes high cohesion and supports the Single Responsibility Principle (SRP).

In summary, these advancements not only make the codebase more organized and maintainable but also adhere to fundamental design principles like SRP, high cohesion, low coupling, and the OCP.


## Knowledge from Study Materials

In preparation for this project, I undertook a comprehensive study of design patterns and their application in software design. By exploring various resources, I gained insights into the significance of design patterns in crafting maintainable and adaptable software systems.

I engaged with a variety of reading materials that collectively enriched my understanding of software design concepts:

- A collection of literature introduced me to the world of design patterns, emphasizing their role in solving recurring software design challenges.

- Additional resources highlighted the importance of clear roles, responsibilities, and collaborations within software components, fostering a holistic understanding of effective software design.

- Through timeless principles of software architecture, I learned how to create software systems that endure and adapt.

## Refactored Code

The refactored code aswell as the original code can be explored in the [src](src/) directory. It reflects the successful application of design patterns and object-oriented principles, resulting in a more organized, maintainable, and flexible codebase.

## Conclusion

This project marks the culmination of my journey through design patterns and object-oriented principles. Applying these concepts enabled me to not only address concerns in the original code but also elevate its architecture and long-term sustainability. Through this process, I've come to appreciate that coding isn't just about knowing how to write it; it's about designing it for scalability, so that others can contribute effectively—just like in real-world scenarios. Equally vital is ensuring that code remains comprehensible and modifiable for years to come.
