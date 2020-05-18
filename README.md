# **Product Requirements Document**

Online Class Management System

1. Objective
2. Release
3. Features
4. User flow and design
5. Class Topics

### 1. 1.Objective

| Vision | _Class Manager for university courses, complete with classes, schedules, and grade calculators._ |
| --- | --- |
| Goals | _To use data structures in relation with Java apis to create a functional web based management system._ |
| Initiatives | _Facilitate organization and management for classes&#39; experience_ |
| Persona(s) | _Students_ |

### 1. 2.Release

| Release | _Parcial 1_ |
| --- | --- |
| Date | _Week of first midterm_ |
| Milestones | _Completed homepage and added some basic features._ |
| Features | _Basic add/remove classes feature and add class information. HTML draft design._ |
| Dependencies | _Release dependencies_ |

| Release | _Parcial 2_ |
| --- | --- |
| Date | _Week of second midterm_ |
| Milestones | _Completed features from previous release and added the schedule feature._ |
| Features | _Completed add/remove classes and info, Schedule._ |
| Dependencies | _Release dependencies_ |

| Release | _Entrega Final_ |
| --- | --- |
| Date | _Week of final exams._ |
| Milestones | _Completed features from previous release and added the grade manager._ |
| Features | _Grade Manager._ |
| Dependencies | _Release dependencies_ |

### 1. 3.Features

| Feature | _Add/Remove classes_ |
| --- | --- |
| Description | _The user will be able to add and remove classes, which in turn will be added to the class manager. This is the primary tool and primary data structure where all other features will be derived from. Apart from class information and grades, this is the main user input interaction with the program._ |
| Purpose | _Assign classes to the class manager._ |
| User problem | _Students need a system to view all classes and their information in a single page._ |
| User value | _The feature will allow a user to add or remove certain classes along with their information._ |
| Assumptions | _Users will have course information at hand._ |
| Not doing | _Not managing the information yet just having the ability to add or remove._ |
| Acceptance criteria | _A user is able to easily and effectively add or remove a specific class._ |

| Feature | _Schedule_ |
| --- | --- |
| Description | _The user will be able to see all courses in a single diagram depending on the date and time of each course. It will also be able to check class times so as to not have two classes in one spot. Additionally, each separate class will be presented in a different colour for the users&#39; ease of access._ |
| Purpose | _The ability to view all courses in a week on a single page._ |
| User problem | _Students need a system to view which classes they have and at what time._ |
| User value | _The user will be able to visually see which classes they have and at what time._ |
| Assumptions | _Users will have the date and time of each course._ |
| Not doing | _Not managing the information yet just having the ability to view classes in a week._ |
| Acceptance criteria | _A diagram is shown which contains all classes depending on their time._ |

| Feature | _Add/Remove class information_ |
| --- | --- |
| Description | _The user will be able to add and remove class information including student and teacher names, description of course, class content, etc. It will function through various data structures but in general will be one text box where the user will be able to input any type of data they want._ |
| Purpose | _Assign class information to the manager._ |
| User problem | _Students want an organized way to view all classes and their content._ |
| User value | _The feature will allow a user to view class information and which students they have a class with._ |
| Assumptions | _Users will have course information at hand._ |
| Not doing | _Not managing the information yet just adding context to each class._ |
| Acceptance criteria | _A user is able to easily and effectively add or remove a variety of data for each class including students, teachers and at least a description._ |

| Feature | _Grade Manager_ |
| --- | --- |
| Description | _The user will be able to add or remove grades for homework and projects, the page will calculate the total grade based on percentages and even weighted average and a calculator where students will be able to see what grade they need on something for a specific class grade. More calculations may be added if needed to give the user a better understanding of their grades._ |
| Purpose | _Assign and manage grades for each class._ |
| User problem | _Students need a system to view all their grades and even be able to calculate them._ |
| User value | _The feature will allow a user to add or remove grades on assignments and check various calculations._ |
| Assumptions | _Users will have grades at hand._ |
| Not doing | _Not affecting class content or data just managing grades for each class._ |
| Acceptance criteria | _A user is able to easily and effectively add or remove grades and at least be able to see their weighted average._ |

| Feature | _Assign Classes Simulation_ |
| --- | --- |
| Description | _The user will be able to participate in a simulated recreation of assigning classes in a similar way to UFM&#39;s own Assign Classes function. The user will be able to comprehend just how the system works, how to quickly choose between the required classes, and organizing schedules before a semester._ |
| Purpose | _Assign or drop specific classes in a simulation._ |
| User problem | _Students don&#39;t know how to use MiU&#39;s own Assign Class feature._ |
| User value | _This simulation will give more context and a better idea of what to expect when getting assigned to classes at the start of a semester._ |
| Assumptions | _Users will have already inputted classes before using the feature._ |
| Not doing | _Not affecting class content or data just creating a simulation based on user input._ |
| Acceptance criteria | _A user will be able to experience a way to get assigned to classes similar to the existing feature in MiU. Though the hope is to improve the system already in place, The feature must at least complete the main purpose._ |

### 1. 4.User flow and design

(Images in file sent over Slack)

### 1. 5.Class Topics

|  Class Topic |  Feature |
| --- | --- |
| Arrays |  Class Information |
| Strings |  Classes and Class Information |
| Structures and Unions |  Classes |
| Linked Lists |  Classes |
| Stacks |  Class Information (add/remove students) |
| Queues |  Class Information (class topics) |
| Trees |  Schedule or Class Information |
| Efficient Binary Trees |  Schedule or Class Information |
| Multi-way Search Trees |  Schedule or Class Information |
| Heaps |  Schedule or Class Information |
| Graphs |  Schedule |
| Hashing and Collision |  Classes |
| Searching and Sorting |  Classes |
| Files and Their Organization |  Folders within Classes containing Class Information |

# Load testing
## /addAssignment
![](./profiling&load/results_images/addAssignment/Graph_Results.PNG)
![](./profiling&load/results_images/addAssignment/Results_Tree.PNG)

## /addClass
![](./profiling&load/results_images/addClass/Graph_Results.PNG)
![](./profiling&load/results_images/addClass/Results_Tree.PNG)

## /addNewAssignment
![](./profiling&load/results_images/addNewAssignment/Graph_Results.PNG)
![](./profiling&load/results_images/addNewAssignment/Results_Tree.PNG)

## /addNewClass
![](./profiling&load/results_images/addNewClass/Graph_Results.PNG)
![](./profiling&load/results_images/addNewClass/Results_Tree.PNG)

## /classInformation
![](./profiling&load/results_images/classInformation/Graph_Results.PNG)
![](./profiling&load/results_images/classInformation/Results_Tree.PNG)

## /dash
![](./profiling&load/results_images/dash/Graph_Results.PNG)
![](./profiling&load/results_images/dash/Results_Tree.PNG)

## /deleteAssignment
![](./profiling&load/results_images/deleteAssignment/Graph_Results.PNG)
![](./profiling&load/results_images/deleteAssignment/Results_Tree.PNG)

## /deleteClass
![](./profiling&load/results_images/deleteClass/Graph_Results.PNG)
![](./profiling&load/results_images/deleteClass/Results_Tree.PNG)

![](./profiling&load/results_images/saveClass/Graph_Results.PNG)
![](./profiling&load/results_images/saveClass/Results_Tree.PNG)

## /gradeManager
![](./profiling&load/results_images/gradeManager/GraphResults.PNG)
![](./profiling&load/results_images/gradeManager/ResultsTree.PNG)


## /schedule
![](./profiling&load/results_images/schedule/Graph_results.png)
![](./profiling&load/results_images/schedule/Results_tree.png)



# Profiling
Directory -> profiling&load\Profiling.jps
![](./profiling&load/results_images/profilingImages/profile.jpeg)
![](./profiling&load/results_images/profilingImages/profiler.jpeg)

# Unit Testing
Todos los métodos y objetos se probaron en el método contextloads() que retornó un valor satisfactorio.

![](./unit/unit_test.PNG)

# Diagrama de objetos
## Assignment Object
Este se encarga de almacenar tareas académicas en la applicación, almacena:
1. Instrucciones 
2. Fecha de entrega & fecha agregada 
3. Nota media vez este disponible 

## Class Object
Este es el objeto curso, almacena el numbre del catedrático, auxiliar, nombre del curso, calificación, etc.  

## AssingmentLinkedList Object 
Este es una linked list particular con métodos pertinentes al objeto assignment. Es una linked list queue entonces tiene cola.  

## CoursesLinkedList Object 
Es un objeto particular para almacenar las instancias de los objetos Class en memoria, este es una linked list también. 

# Estructuras de datos empleadas
Se hizo uso de arrays y linked lists para la primera entrega. 

