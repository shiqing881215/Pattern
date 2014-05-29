Adapter patten is used when you already have some existing class can finish your task, 
but you need to fit it into your pre-defined hierarchy (meet the already existing interface)

It is implemented by creating a new class implements all the desired interface, but also WRAP the original class. 
So when user call this new class with the desired method, in the background it does call the original class method.

This pattern is often used in other pattern which needs the polymorphism.
You can think we ADAPT one class to meet some interface requirement and use this class to do the real stuff.

Simple example

class Original {
  void doSomthingOriginal() {....}
  void writeSomethingOriginal() {....}
}

interface DoThings {
  void doSomthing();
  void writeSomething();
}

class Adapter implements DoThings{
  Original original;
  
  void doSomthing() {
    original.doSomethingOriginal();
  }
  
  void writeSomething() {
    original.writeSomethingOriginal();
  }
}


You also need to understand the difference between Facade Pattern and Adapter Patten
                                                Facade       Adapter
Are there preexisting classes?                    yes          yes
Is there an interface we must design?             yes          no
Does an object need to behave polymorphically?    no           probably
Is a simple interface needed?                     yes          no
