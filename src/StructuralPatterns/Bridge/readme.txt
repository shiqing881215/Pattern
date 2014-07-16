Bridge Pattern

Goal : 
De-couple an abstraction from its implementaion, so both of them can VARY INDENPENDENTLY.

Two core idea in bridge pattern :
1. Find what varies and encapsulate it 
   (encapsulate doesn't only mean hide data, it also means hide the variable parts behinds an abstract class)
2. Favor composition over inheritence
   (Yes, inheritence can provide a lot of benefits, but also it has high cohesion and tightly coupled,
    composition makes de-couple more easily)
    
Above example explanation :
Two parts - shape and drawing program

What changes?
shape maybe different, drawing programm maybe different

How to abstract?
shape as an abstract class represents all the different shape (rectangular, circle)
drawing program as an abstract class represents all diffrenet drawing API

How does composition be used?
Instead of including drawing in the hierarchy of shape, shape maintain a reference to drawing abstract class, 
not care about what's the real type of drawing API it is.

What's the benefit?
If you have some new shape or new drawing API in the future, you don't need to change the other part of the system, 
what you need to do is just simply add a new concrete class.

            Abstraction                       Implementation 
         
               Shape    ----------------- >     Drawing          
      Rectangular  Circle ...                 API1  API2  .......
             









