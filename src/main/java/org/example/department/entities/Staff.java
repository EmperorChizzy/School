package org.example.department.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Staff extends User {

    public static List<Staff> listOfStaff = new ArrayList<>();

    private Long StaffID;
    private String Level;
    @lombok.Setter
    private static final BigDecimal salary = null;
    public static final BigDecimal Salary_1 = new BigDecimal(500000);
    public static final BigDecimal Salary_2 = new BigDecimal(400000);
    public static final BigDecimal Salary_3 = new BigDecimal(300000);
    public static final BigDecimal Salary_4 = new BigDecimal(200000);

    private String role;
    private String specialization;
    private LocalDate employmentDate;
    private String BVN;

    public Staff(){

    }

    public static List<Staff> getListOfStaff() {
        return listOfStaff;
    }

    public static void setListOfStaff(List<Staff> listOfStaff) {
        Staff.listOfStaff = listOfStaff;
    }

    public Long getStaffID() {
        return StaffID;
    }

    public void setStaffID(Long staffID) {
        StaffID = staffID;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public String getBVN() {
        return BVN;
    }

    public void setBVN(String BVN) {
        this.BVN = BVN;
    }
}
