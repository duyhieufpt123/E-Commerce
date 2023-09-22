package com.ecommerce.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.util.Objects;

@Table(name = "payment_infomation")
public class PaymentInfomation {

    @Column(nullable = true, unique = false, length = 4000) //auto add id when add new product (unique id)
    private String cardholderName;

    private String cardNumber;

    private LocalDate expirationDate;

    private String cvv;


    public PaymentInfomation() {
    }

    public PaymentInfomation(String cardholderName, String cardNumber, LocalDate expirationDate, String cvv) {
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public String getCardholderName() {
        return this.cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCvv() {
        return this.cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public PaymentInfomation cardholderName(String cardholderName) {
        setCardholderName(cardholderName);
        return this;
    }

    public PaymentInfomation cardNumber(String cardNumber) {
        setCardNumber(cardNumber);
        return this;
    }

    public PaymentInfomation expirationDate(LocalDate expirationDate) {
        setExpirationDate(expirationDate);
        return this;
    }

    public PaymentInfomation cvv(String cvv) {
        setCvv(cvv);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PaymentInfomation)) {
            return false;
        }
        PaymentInfomation paymentInfomation = (PaymentInfomation) o;
        return Objects.equals(cardholderName, paymentInfomation.cardholderName) && Objects.equals(cardNumber, paymentInfomation.cardNumber) && Objects.equals(expirationDate, paymentInfomation.expirationDate) && Objects.equals(cvv, paymentInfomation.cvv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardholderName, cardNumber, expirationDate, cvv);
    }

    @Override
    public String toString() {
        return "{" +
            " cardholderName='" + getCardholderName() + "'" +
            ", cardNumber='" + getCardNumber() + "'" +
            ", expirationDate='" + getExpirationDate() + "'" +
            ", cvv='" + getCvv() + "'" +
            "}";
    }
    
}
