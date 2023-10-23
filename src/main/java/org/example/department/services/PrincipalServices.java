package org.example.department.services;
import org.example.department.entities.User;
import org.example.department.entities.StudentRecord;
import org.example.department.enums.Position;

import java.util.List;

public interface PrincipalServices <U>{
    U admit(User applicant);
    U expel(StudentRecord studentReport);
    U employ(User principal, User staffApplicant);
    U retrench(User staff);

    void assignsDuties(User staff, Position role);
    List<User> viewAllStudents();
    List<User> viewAllStaff();
}
