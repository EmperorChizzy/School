package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Staff extends User{
    private BigDecimal salary;
    private Map<Long,String> accountDetails;
    private String specialization;
    private LocalDate employmentDate;
    private String lastPromotionDate;
    private String bvn;

    @Override
    public String toString() {
        return " Teacher { " +
                " userId: " + getUserId() +
                " | email: " + getEmail() +
                " | FirstName: " + getFirstName() +
                " | lastName: " + getLastName() +
                " } " + "\n";
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }
}
