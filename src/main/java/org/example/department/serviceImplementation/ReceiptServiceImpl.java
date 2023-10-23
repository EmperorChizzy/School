package org.example.department.serviceImplementation;
import org.example.department.entities.Payment;

import java.util.Objects;

public class ReceiptServiceImpl {
    public void printReceipt(Long transactionId, Payment payment){
        if (Objects.equals(transactionId, payment.getPaymentId())){
            System.out.println("Name: " + payment.getUser().getFirstName()+
                    payment.getUser().getLastName()+
                    "Description: "+ payment.getDescription()+
                    "Amount: "+ payment.getAmount());
        }
    }
}
