# Singleton
Ensures a class has only one instance and provides a global point of access to it.

### SimpleSingleton
Simply does the basic task of creating an instance of the specified class and checks if its already created then return that instance or else creates and then sends.
<br>
Cons - <br>
In case of a Multi-Threaded Application, two threads may call the getInstance() method simultaneously, thus creating two instances of the same class.
<br>
Soln <br>
Synchronize the Multi-Threaded application so that all threads may use that instance one at a time.

### HeavySingleton
Creates the instance of the class during the class initialization (loading) itself. This ensures that the instance is already created and ready to serve.
<br>
Cons - <br>
The instance of the class is created even if we do not use/need the class. 
