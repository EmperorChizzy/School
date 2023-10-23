package org.example.department.services;
import org.example.department.entities.Payment;
import org.example.department.entities.Staff;
import org.example.department.entities.User;

import java.math.BigDecimal;

public interface NonAcademicServices {
    BigDecimal paysSalary(User accountant, Staff staff, Payment payment);
}