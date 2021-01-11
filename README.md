Pattern
=======

Design Pattern

Don't try to remember them. Instead, you might already use them in your daily life. <br/>
It's the way how you can make your code more scalable and flexiable for any potential future changes. <br/>
I feel it's easier to link each pattern with a real example I work before. This is the best way for me to understand why we use it and how it helps to solve the problem in that situation. <br/><br/>

Design Pattern
- Creation Pattern
    - How to create object ?
    - Factory
        - You have a few similar object and you don't want client create them by calling new
        - So usually you will have a generic interface say Car, then you have individual concrete class implements Car. Finally you have a Factory which might have a static method takes an input parameter and based on this input return the proper concrete underneath object
        - java.util.Calendar.getInstance()
    - Singleton 
        - One object per JVM 
        - java.lang.Runtime.getRuntime() / java.lang.System.getSecurityManager()
    - Builder
        - Try to avoid put a long list of input parameters here 
    - Prototype
        - Object.clone
- Structure Pattern
    - How to organize/structure your object ?
    - Inheritence / Interface / Abstract Class / Composition
    - Adapter
        - Convert from one format into another format
        - Arrays.asList() / List.toArray() / marshall / unmarshall
- Behavior Pattern
    - How the object interact with each other during runtime
    - Chain of responsibility
        - Multiple try catch in exception handling
    - Command
        - Request / Response : servlet use request as the command to do the processing 
    - Iterator
        - We don't want to know how array is implemented internally, just give me a way to iterate it 
    - Strategy
        - Comparator : I want to pass different comparator to my sort alogrithm 
    - Template 
        - Orchestration service : it defines the flow (template) with a lot of abstract methods. Individual object will extends the template and do the implementation 




