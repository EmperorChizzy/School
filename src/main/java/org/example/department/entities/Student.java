package org.example.department.entities;

import java.util.*;

public class Student extends User {
        public static List<Student> ListOfStudents = new ArrayList<>();
        private static Long enrollmentID;
        private Classes classesLevel;
        private Set<Course> courses;
        private String teacherName;

        public Student(){

        }

        public Student(Long enrollmentID, Classes ClassLevel, Set<Course> courses, String teacherName) {
            this.enrollmentID = enrollmentID;
            this.classesLevel = classesLevel;
            this.courses = courses;

        }

        public static List<Student> getListOfStudents() {
            return ListOfStudents;
        }

        public static void setListOfStudents(List<Student> listOfStudents) {
            ListOfStudents = listOfStudents;
        }

    public static void enrollmentID(String concat) {
    }

    public Long getEnrollmentID() {
            return enrollmentID;
        }

        public void setEnrollmentID(Long enrollmentID) {
            this.enrollmentID = enrollmentID;
        }

        public Classes getClassesLevel() {
            return classesLevel;
        }

        public void setClassesLevel(Classes classesLevel) {
            this.classesLevel = classesLevel;
        }


        public Set<Course> getCourses() {
            return courses;
        }

        public void setCourses(Set<Course> courses) {
            this.courses = courses;
        }

        public String getTeacherName() {
            return teacherName;
        }

        public void setTeacherName(String teacherName) {
            this.teacherName = teacherName;
        }

    @Override
    public String toString() {
        return "Student{" +
                "enrollmentID=" + enrollmentID +
                ", classesLevel=" + classesLevel +
                ", courses=" + courses +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}

