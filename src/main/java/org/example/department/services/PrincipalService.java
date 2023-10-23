package org.example.department.services;

import org.example.department.entities.Staff;
import org.example.department.entities.Student;
import org.example.department.entities.Teacher;
import org.example.department.entities.User;

public interface PrincipalService {
    String admit(Student student);

    void suspended(User user);

    void employ(Staff staff);

    void expel(Student student);
    void promote(Teacher teacher);
    void award(User user);
}
