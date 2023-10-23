package org.example.department.entities;

import java.util.*;

public class Course {
    public static Set<Course> listOfCourses = new HashSet<>();
    private String title;
    private Teacher teacher;

    public Course(String title, Teacher teacher) {
        this.title = title;
        this.teacher = teacher;
    }

    public Course() {
    }

    public static Set<Course> getListOfCourses() {
        return listOfCourses;
    }

    public static void setListOfCourses(Set<Course> listOfCourses) {
        Course.listOfCourses = listOfCourses;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(title, course.title) && Objects.equals(teacher, course.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, teacher);
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}