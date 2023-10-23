package org.example.department.entities;

import java.util.*;

public class Teacher extends Staff{
    private String Specialization;
    private String Qualification;
    private Set<Course> courses = new HashSet<>();
    private List<Classes> classes = new ArrayList<>();

    public Teacher() {
    }

    public Teacher(String specialization, String qualification, Set<Course> courses, List<Classes> classes) {
        Specialization = specialization;
        Qualification = qualification;
        this.courses = courses;
        this.classes = classes;
    }

    @Override
    public String getSpecialization() {
        return Specialization;
    }

    @Override
    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(Specialization, teacher.Specialization) && Objects.equals(Qualification, teacher.Qualification) && Objects.equals(courses, teacher.courses) && Objects.equals(classes, teacher.classes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Specialization, Qualification, courses, classes);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Specialization='" + Specialization + '\'' +
                ", Qualification='" + Qualification + '\'' +
                ", courses=" + courses +
                ", classes=" + classes +
                '}';
    }
}
