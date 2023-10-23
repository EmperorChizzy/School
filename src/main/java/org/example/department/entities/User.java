package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.department.enums.Gender;
import org.example.department.enums.Performance;
import org.example.department.enums.Position;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;


@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor

public abstract class User implements Comparable<User>{
    private String userId;
    private String firstName;
    private String lastName;
    private Integer age;
    private Gender gender;
    private Long phoneNumber;
    private String email;
    private Position role;
    private Performance performance;



    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
