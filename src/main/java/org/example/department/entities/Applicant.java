package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Applicant extends Student{
    private LocalDate applicationDate;
    private Boolean applicationStatus;
    private BigDecimal applicationFee;
    private Boolean isAdmitted;
}
