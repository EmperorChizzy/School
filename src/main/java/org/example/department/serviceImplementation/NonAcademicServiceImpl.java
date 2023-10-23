package org.example.department.serviceImplementation;

import org.example.department.entities.Payment;
import org.example.department.entities.Staff;
import org.example.department.entities.User;
import org.example.department.enums.Position;
import org.example.department.services.NonAcademicServices;

import java.math.BigDecimal;

public class NonAcademicServiceImpl implements NonAcademicServices {
    @Override
    public BigDecimal paysSalary(User accountant, Staff staff, Payment payment){
        if(accountant.getRole().equals(Position.ACCOUNTANT)) {
            staff.setSalary(payment.getAmount());
            return payment.getAmount();
        }
        return null;
    }
}