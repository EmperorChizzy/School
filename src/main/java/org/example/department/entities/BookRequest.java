package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.department.enums.Position;

@Data
public class BookRequest {
    private Position requesterType;
    private String bookTitle;


    public BookRequest(Position requesterType, String bookTitle) {
        this.requesterType = requesterType;
        this.bookTitle = bookTitle;
    }

    public Position getRequesterType() {
        return requesterType;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPriority() {
        return switch (requesterType) {
            case PRINCIPAL -> 1;
            case ACCOUNTANT -> 2;
            case TEACHER -> 3;
            case SENIOR_STUDENT -> 4;
            case JUNIOR_STUDENT -> 5;
            case APPLICANT -> 6;
            case SECURITY -> 7;
        };
    }
}