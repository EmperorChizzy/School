package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.department.enums.Conduct;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentRecord {
    private User student;
    private Double averageScore;
    private Conduct behaviour;
}
