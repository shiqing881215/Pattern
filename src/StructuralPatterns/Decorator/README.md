<h1> Decorator Pattern </h1>

<h4>When to use?</h4> </br>
Attach additional functionality to an object dynamically. <br/>

<h4>How to implement?</h4> 
1. First have an interface, indicate all the api these classes needed to do. <br/>
   In this case, is Window <br/>
2. Have a class which has the function added to it by the Decorators. <br/>
   This class usually have the basic functionality, <br/>
   and also the chain of instantiation always ends with this class. see DecoratorTest <br/>
   In this case, is SimpleWindow <br/>
3. Have an abstract Decorator, which should have an interface type field, and constructor using that field <br/>
4. Concrete decorators, extends the Decorator, add the featured stuff on the basic feature.<br/>
5. Instantiate the chain (Important)
