package org.example.department.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Payment {
    private int paymentID;
    private BigDecimal amount;
    private LocalDate paymentDate;

    public Payment(){

    }
    public Payment(int paymentID, BigDecimal amount, LocalDate paymentDate){
        this.paymentID = paymentID;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID=" + paymentID +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
