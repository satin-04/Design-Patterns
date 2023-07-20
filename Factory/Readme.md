## Factory

It is used for Creating objects without specifying the exact class of the object that will be created. <br>
Use Case: Can be used in getting Time where based on Location, one can get the time object of any location.

In this example, Operating System is an abstract class and is implemented by Windows and Linux.
The common methods can be defined in Operating System Class itself while changed methods can be implemented as abstract methods 
and can be implemented (@Override) in their respective classes. 

OS_Factory is the creation point where we can define what type of object we want and this class will take care of creating that object.

Using the same logic we can also add MAC Operating System.
