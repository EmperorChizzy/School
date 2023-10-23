package org.example;
import org.example.department.enums.Position;
import org.example.department.serviceImplementation.LibraryServiceImpl;


import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

//
//        System.out.println(" ");
//        System.out.println("******Welcome to Chizzy International College CIC *********");
//        System.out.println(" ");
//
//        System.out.println("The CSV data fetched for students are as follows:");
//        System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________ ");
//
//        StudentServiceImpl studentService= new StudentServiceImpl();
//        studentService.readStudentServiceImpl(  "/Users/Emperor Chizzy/IdeaProjects/JAVA CLASS 1/OOP/School Project 2/src/main/java/org/example/department/file/Dataset for seeding Student.csv");
//        System.out.println(StudentServiceImpl.listOfStudents);
//        System.out.println(" ");
//
//        System.out.println("The CSV data fetched for Teachers are as follows:");
//        System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________ ");
//        TeacherServiceImpl teacherService = new TeacherServiceImpl();
//        teacherService.readTeacherServiceImpl("/Users/Emperor Chizzy/IdeaProjects/JAVA CLASS 1/OOP/School Project 2/src/main/java/org/example/department/file/teacher-data.csv");
//        System.out.println(TeacherServiceImpl.listOfTeachers);
//
//        /**
//         *
//         * Writing back the data into a file and storing in a location
//         */
//
//
//       StudentServiceImpl studentService1 = new StudentServiceImpl();
//       studentService1.writeStudentToFile("/Users/Emperor Chizzy/IdeaProjects/JAVA CLASS 1/OOP/School Project 2/src/main/java/org/example/department/file/StudentNew.csv");
//
//        TeacherServiceImpl teacherService1 = new TeacherServiceImpl();
//        teacherService1.writeTeacherToFile("/Users/Emperor Chizzy/IdeaProjects/JAVA CLASS 1/OOP/School Project 2/src/main/java/org/example/department/file/TeacherNew.csv");


        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        libraryService.addBook("Advanced Mathematics",4);
        libraryService.addBook("World Geography", 2);

        libraryService.stockUpBook("Advanced Mathematics",4);
        libraryService.stockUpBook("World Geography",4);

        libraryService.makeRequestFirstComeFirstServe("Advanced Mathematics", Position.SENIOR_STUDENT);
        libraryService.makeRequestFirstComeFirstServe("Advanced Mathematics", Position.TEACHER);
        libraryService.makeRequestFirstComeFirstServe("Advanced Mathematics", Position.SENIOR_STUDENT);
        libraryService.makeRequestFirstComeFirstServe("Advanced Mathematics", Position.TEACHER);
        libraryService.makeRequestFirstComeFirstServe("Advanced Mathematics", Position.JUNIOR_STUDENT);
        System.out.println("......................................................................................");

        libraryService.fulfillRequestsFirstComeFirstServe();
        System.out.println("......................................................................................");

        libraryService.displayBookAvailability();

       libraryService.makeRequestWithPriority("Advanced Mathematics", Position.SENIOR_STUDENT);
       libraryService.makeRequestWithPriority("Advanced Mathematics", Position.JUNIOR_STUDENT);
        libraryService.makeRequestWithPriority("World Geography", Position.TEACHER);
        libraryService.makeRequestWithPriority("Advanced Mathematics", Position.TEACHER);
        libraryService.makeRequestWithPriority("World Geography", Position.JUNIOR_STUDENT);
       libraryService.makeRequestWithPriority("World Geography", Position.SENIOR_STUDENT);
        System.out.println("......................................................................................");

        libraryService.fulfillRequestsWithPriority();
        System.out.println("......................................................................................");


        libraryService.displayBookAvailability();
        System.out.println("......................................................................................");

        libraryService.makeRequestWithPriority("Advanced Mathematics", Position.SENIOR_STUDENT);
        libraryService.makeRequestWithPriority("Advanced Mathematics", Position.JUNIOR_STUDENT);


    }
}