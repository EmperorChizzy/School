package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Student extends User {
    private String gradeLevel;
    private String guardianEmail1;
    private String guardianEmail2;
    private String isArchived;
    private String isDeleted;

    @Override
    public String toString() {
        return  " Student { " +
                " userId:  " + getUserId() +
                " | firstName: " + getFirstName() +
                " | lastName: " + getLastName() +
                " | email: " + getEmail() +
                " | gradeLevel: " + gradeLevel +
                " | guardianEmail1: " + guardianEmail1 +
                " | guardianEmail2: " + guardianEmail2 +
                " | isArchived: " + isArchived +
                " | isDeleted: " + isDeleted +
                " } " + "\n";
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }
}
