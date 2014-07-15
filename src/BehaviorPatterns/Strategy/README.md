<h1>Stratege Pattern</h1>

Allow you to use different algorithm based on the current context.

Solution :
Separate the selection of the algorithm from the implementation of the algorithm. 
Allows the selection to be made based on the context.

You can have an abstract layer to represent the algorithm, in this example, it's the context. <br/>
And every concrete algorithm will implement their own behavior. <br/>
And in the run time, it will use the context to determine which algorithm to be used. <br/>

This kind of pattern, I think, is quite often be used everywhere, we just not realize it.
