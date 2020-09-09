This is the final project that I had to make to finish successfully the Java 1 Associate Course held by Telecom Academy.<br> 
Here you can see the certificate obtained: https://drive.google.com/file/d/1Wj9wf-EV209NhC67WJ0U3oTwZYrU9A2u/view?usp=sharing <br>
The description of the exam was: <br>
An institution offers two types of courses: programming courses and foreign languages courses. <br>
A course, any course, has the following: an id, a name and a price. The id is a number that represents the order number of the added course.<br>
The insitution can offer 30 courses (programming and foreign languages) max and has the following functionalities:<br>
- addCourse / adaugaCurs - which adds a new course to all the courses affered ( if  there is enough space, otherwise an exception will be thrown called TooManyCoursesException/PreaMulteCursuriException - defined by the programmer) <br>
- showCourses / afiseazaCursuri - show all the courses available with all their details<br>
- showProgrammingCourses / afiseazaCursuriProgramare - show only the programming courses available with all their details <br>
- deleteCourse / stergeCurs - delete a course by the id received as a parameter <br>
<br>
This app receives the following commands from the console and operates with a single institution: <br>
- exit - close the app <br>
- add_course <type><name><price> / adauga_curs <tip><denumire><pret> - add a course to the institution offer <br>
- show / afisare - show all the courses available<br>
- show_programming_courses / afisare_cursuri_programare - show all the programming courses available <br>
- delete_course <course_id> / sterge_curs <id_curs> - delete a course by the id received as a parameter <br>
- in the background a thread of execution will be running which will show the total number of courses; this thread will update once every two minutes <br>
  <br>
Observations: <br>
1. The classes will be properly encapsulated and the whole architecture of the classes will be done right.<br>
2. A Singleton Pattern will be used when necessary. <br>
3. Will be used streams and lambda expressions anywhere possible.<br>
Time available: 2h
  

