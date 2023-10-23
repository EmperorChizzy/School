package org.example.department.services;

import org.example.department.entities.Student;
import org.example.department.entities.Teacher;

public interface TeacherService {
    void teach(Teacher teacher);

    void promote(Student student);
    void assessment(Student student);
}
