package org.example.department.serviceImplementation;
import org.example.department.entities.*;
import org.example.department.enums.Conduct;
import org.example.department.enums.Performance;
import org.example.department.enums.Position;
import org.example.department.services.PrincipalServices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrincipalServiceImpl implements PrincipalServices<User> {
    public static List<User> studentRegister = new ArrayList<>();
    public static List<User> staffRegister = new ArrayList<>();
    public static HashMap<Position, List<User>> allStaffs =  new HashMap<>();
    @Override
    public User admit(User applicant){
        if (applicant.getAge() <= 20 && applicant.getAge() >=8) {
            studentRegister.add(applicant);
            return applicant;
        }
        return null;
    }
    @Override
    public User expel(StudentRecord studentRecord){
        if(studentRecord.getBehaviour().equals(Conduct.GROSS_MISCONDUCT)){
            return studentRegister.remove(studentRegister.indexOf(studentRecord.getStudent()));
        }
        return null;
    }
    @Override
    public User employ(User principal, User staffApplicant){
        if(principal.getRole().equals(Position.PRINCIPAL)){
            staffRegister.add(staffApplicant);
            return staffApplicant;
        }
        return null;
    }
    @Override
    public User retrench(User staff){
        if(staff.getPerformance().equals(Performance.POOR)){
            staffRegister.remove(staff);
            return staff;
        }
        return null;
    }
    @Override
    public void assignsDuties(User staff, Position role){
        staff.setRole(role);
    }
    @Override
    public List<User> viewAllStudents() {
        return studentRegister;
    }
    @Override
    public List<User> viewAllStaff() {
        return staffRegister;
    }
}
