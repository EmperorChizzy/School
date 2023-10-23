package org.example.department.services;
import org.example.department.entities.Payment;

public interface ReceiptServices {
    void printReceipt(Long transactionId, Payment payment);

}