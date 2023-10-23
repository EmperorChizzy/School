package org.example.department.entities;

import lombok.*;
import org.example.department.enums.PayMethod;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payment{
    private User user;
    private Long paymentId;
    private BigDecimal amount;
    private String Description;
    private LocalDate paymentDate;
    private PayMethod payMethod;
    private Boolean isCleared;
}