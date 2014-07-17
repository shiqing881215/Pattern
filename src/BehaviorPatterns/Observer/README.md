<h1> Observer Patter </h1>
<h4> Intent </h4>
Define a one-to-many dependency between objects so that when one object changes, all the dependencies are notified and updated automatically. <br/>

<h4> When to use? </h4>
If you will have a dynamically changing dependency, this pattern is a good choice. But if you know there is just a fixed number dependencies, or the dependencies may not be changing, this pattern is just adding complexity. <br/>

<h4> How to implement? </h4>
You actually have two ways : <br/>
1. Do by yourself from scratch : <br/>
   (1) Have a subject which is observed, and maintain a list of observer <br/>
   (2) Have a notify method, in that method call all the observers' update method in the list <br/>
   (3) Have attach/detach method to add observer and remove observer from the list <br/>
   (4) Have an observer interface/abstract class, with an update method not implemented <br/>
   (5) Have different conrete observer class to implement different update method <br/>
2. Use Java internal built Observer/Observable <br/>
   (1) The subject which is observed needs to extends Observable - notifyObservers, addObverser, deleteObserver <br/>
   (2) The observer implements the Observer class - update <br/>
