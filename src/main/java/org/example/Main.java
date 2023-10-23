package org.example;

import org.example.department.entities.Applicant;
import org.example.department.entities.Classes;
import org.example.department.entities.Course;
import org.example.department.entities.Student;

import java.util.Scanner;


public class Main {
    private static String randomString() {
        return null;
    }
    private static final Scanner keyboard = new Scanner(System.in);

    private void displayInfo(Student[] studentList)
    {
        for (Student student : studentList) {
            System.out.println("Student Name: " + student.getFirstName()+ " " + student.getLastName());
            System.out.println("Student ID: " + student.getEnrollmentID());

            if (student.getCourses().size() > 0) {
                System.out.println("Student's Current Courses:" + student.getCourses());
            } else {
                System.out.println("Student's Current Courses: The student isn't enrolled in any courses");
            }

            System.out.println("------------------------------------------------------");
        }
    }



    public static void main(String[] args) {
        try {
            int size;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter the number of students you wish to add to the system");
            size = keyboard.nextInt();
            keyboard.nextLine();

            Student[] students = new Student[size];
            Student student;
            String firstName = "";
            String lastName = "";

            for (int i = 0; i < size; i++) {
                student = new Student();
                students[i] = student;

                System.out.println("Please enter your first name for Student ");
                firstName = keyboard.nextLine();
                student.setFirstName(firstName);

                System.out.println("Please enter your last name");
                lastName = keyboard.nextLine();
                student.setLastName(lastName);


                student.getEnrollmentID();
                student.getCourses();
//                if (i==size - 1){
//                    student.displayInfo(Student);
//                }
            }

        } catch (NegativeArraySizeException e) {
            System.out.println("You can't use a negative number for size");

        }

        Applicant applicant = new Applicant();

        if (applicant.getAge()<=20){
            System.out.println("you have been Admitted");
        }else {
            System.out.println("We regret to inform you that you are Ineligible");
        }


//        private void EnrollmentID(){
//            String grade;
//            boolean checked = false;
//
//            while (!checked) {
//                System.out.println("Enter your school year 1. Junior High, 2. Senior Arts, 3.Senior Science");
//                grade = keyboard.nextLine();
//                if (grade.length() == 1 && Integer.parseInt(grade) > 0 && Integer.parseInt(grade) < 4) {
//                    assert randomString() != null;
//                    Student.enrollmentID(grade.concat(randomString()));
//                    checked = true;
//                } else {
//                    System.out.println("The input you enter is incorrect please try again");
//                }
//            }
//        }
    }


}