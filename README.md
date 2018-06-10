# Java Reflection
       
![image](https://user-images.githubusercontent.com/9217947/41124981-d7475e8a-6aa3-11e8-9cf6-512318299805.PNG)

4th year Software Development project. The project is a Java application that uses reflection to analyse an arbitrary Java Application Archive (JAR). Java Reflection is an API that can inspect classes, interfaces, fields and methods at run-time. In this project the Java Reflection API is used to calculate the positional stability of each of the component classes in its object graph (Afferent/Efferent Couplings).

Afferent Couplings (Ca): measures how many classes depend on a given class. Classes with high afferent coupling will affect other classes when changes are made.                                

Efferent Couplings (Ce): measures the number of classes on which a given class depends. Classes with high efferent coupling will receive the effects of changes or defects in other classes.   

Languages, Technologies and Implementation Architecture used for this project:
* Java, Java Reflection, Java Swing, Eclipse.

## Getting Started

Download and extract the zip folder here [JavaReflection](https://github.com/seanJosephFitzpatrick/JavaReflection/archive/master.zip)            

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

This project is licensed under the [MIT](https://github.com/seanJosephFitzpatrick/JavaReflection/blob/master/LICENSE) License
