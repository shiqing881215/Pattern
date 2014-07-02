Abstract Factory Pattern

Goal is to "Provide an interface for creating families of related or dependent objects without specifying their concrete classes."

Abstract factory defines the interface to how to create each of the family related objects. And each concrete factory extends abstract factory and decide the real concreate classes to instantiate.

When should I use this pattern?
When you see you have a bunch of factory classes and they instantiate a bunch of related classes, say circle and square. You can come up with another abstract layer which is the abstract factory and it creates the super class, say Shape, above theses concreate classes.

The benefit for this is :

(1) You can add any other concrete factory class very easily later, say oval

(2) With this new abstraction layer, when you add a new factory class, you don't need to chanage the logic interaction with the abstraction layer.
