package org.example.department.services;
import org.example.department.entities.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface StudentServices<S,P> {

    S learn(Subject subject);
    P payFees(Payment payment);
    Set<Question> takeAssessment(Assessment assessment);
    Map<User, List<Subject>> registerSubject(User student, List<Subject> subjects);

}