package org.example.department.services;

import org.example.department.entities.Assessment;
import org.example.department.entities.User;
import org.example.department.entities.StudentRecord;
import org.example.department.entities.Subject;
import org.example.department.enums.AssessmentType;
import org.example.department.enums.SubjectName;

import java.util.Map;

public interface TeacherServices<S,L> {
    S teach(Subject subject);

    L assess(Assessment assessment, User student);

    S teach(SubjectName subject);
    L assess(AssessmentType assessment, User student);


    Map<User, StudentRecord> promoteStudent(User student, StudentRecord studentReport);
}