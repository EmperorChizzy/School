package org.example.department.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Applicant extends User{
    private BigDecimal applicationFee;
    private LocalDate applicationDate;
    private String applicationCategory;

    public Applicant(BigDecimal applicationFee, LocalDate applicationDate, String applicationCategory) {
        this.applicationFee = applicationFee;
        this.applicationDate = applicationDate;
        this.applicationCategory = applicationCategory;
    }

    public Applicant() {
    }

    public BigDecimal getApplicationFee() {
        return applicationFee;
    }

    public void setApplicationFee(BigDecimal applicationFee) {
        this.applicationFee = applicationFee;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getApplicationCategory() {
        return applicationCategory;
    }

    public void setApplicationCategory(String applicationCategory) {
        this.applicationCategory = applicationCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Applicant applicant = (Applicant) o;
        return Objects.equals(applicationFee, applicant.applicationFee) && Objects.equals(applicationDate, applicant.applicationDate) && Objects.equals(applicationCategory, applicant.applicationCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationFee, applicationDate, applicationCategory);
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "applicationFee=" + applicationFee +
                ", applicationDate=" + applicationDate +
                ", applicationCategory='" + applicationCategory + '\'' +
                '}';
    }
}
