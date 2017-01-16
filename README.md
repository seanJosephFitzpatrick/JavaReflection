# Java Reflection
        
A Java application that uses reflection to analyse an arbitrary Java
Application Archive (JAR) and calculates the positional stability of each of the component
classes in its object graph.     
[The Reflection API](https://docs.oracle.com/javase/tutorial/reflect/) - The Java Tutorials      

Afferent Couplings (Ca): The number of classes in other packages that depend upon classes within the package is an indicator of the package's responsibility. Afferent = incoming.                       

Efferent Couplings (Ce): The number of classes in other packages that the classes in the package depend upon is an indicator of the package's dependence on externalities. Efferent = outgoing.                                        

## Getting Started

Download and extract the zip folder here [JavaReflection](https://github.com/seanJosephFitzpatrick/JavaReflection)            

### Prerequisites

Eclipse Neon. You can download here [Eclipse Neon](http://www.eclipse.org/neon/)                 
Java 8. You can download the latest version of Java here [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)    

### Installing

Insall Java JDK/JRE                
Video tutorial of How to Install Java JDK/JRE here [Install Java](https://www.youtube.com/watch?v=FzKcJK68z2k)      

Install Eclipse Neon              
Video tutorial of How to Install Eclipse Neon on Windows 10 here [Install Eclipse Neon](https://www.youtube.com/watch?v=9EghTHWx1Ng)       

## Deployment

There are two methods of deployment **Eclipse IDE  or CMD line**. The command line method is faster because you only need to install java.

* **Eclipse**          
Launch Eclipse and set the workspace as the root folder that was extracted from the GitHub project. Select the folder using the Eclipse popup window browse button. Create a new project File tab --> New --> Project --> Java Project and name it **Reflection**. This is the name of the folder containing the project, Eclipse will pull in the files into the created project. Run the project by selecting the Run tab --> Run.

* **Command Line**          
Launch the command Line and navigate to the src folder inside the project folder. Root folder --> Reflection --> src. Once inside the src folder run the command **javac ie/gmit/sw/*.java** to compile all the java classes. Then run the application with the command **java ie.gmit.sw.Runner**.

1) Select the Jar file using the browse button.                            
2) click the Calculate Stability button to run the process.

## Built With

* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - JDK
* [Eclipse Neon](http://www.eclipse.org/neon/)  - Eclipse Java EE IDE for Web Developers. Version: Neon.1a Release (4.6.1)

## Authors

[Sean Fitzpatrick](https://github.com/seanJosephFitzpatrick)

## License

This project is licensed under the MIT License