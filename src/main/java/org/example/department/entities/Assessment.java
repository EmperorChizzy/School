package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.department.enums.AssessmentType;
import org.example.department.enums.GradeLevel;

import java.util.Set;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Assessment {
    private User student;
    private Subject subject;
    private Set<Question> questions;
    private GradeLevel classes;
    private AssessmentType report;
    private Integer score;

}
