package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.department.enums.SubjectName;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Subject {

    private SubjectName subject;
    private int subjectId;
    private String subjectContent;
}