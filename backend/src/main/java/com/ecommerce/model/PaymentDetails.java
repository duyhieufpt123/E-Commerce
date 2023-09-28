package com.ecommerce.model;

public class PaymentDetails {

    private String paymentMethod;
    private String status;
    private String paymentId;
    private String razorPaymentLinkId;
    private String razorPaymentLinkReferenceId;
    private String razorpayPaymentLinkStatus;
    private String razorpayPaymentId;

    public PaymentDetails() {
    }

    public PaymentDetails(String paymentMethod, String status, String paymentId, String razorPaymentLinkId,
            String razorPaymentLinkReferenceId, String razorpayPaymentLinkStatus, String razorpayPaymentId) {
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.paymentId = paymentId;
        this.razorPaymentLinkId = razorPaymentLinkId;
        this.razorPaymentLinkReferenceId = razorPaymentLinkReferenceId;
        this.razorpayPaymentLinkStatus = razorpayPaymentLinkStatus;
        this.razorpayPaymentId = razorpayPaymentId;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentId() {
        return this.paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getRazorPaymentLinkId() {
        return this.razorPaymentLinkId;
    }

    public void setRazorPaymentLinkId(String razorPaymentLinkId) {
        this.razorPaymentLinkId = razorPaymentLinkId;
    }

    public String getRazorPaymentLinkReferenceId() {
        return this.razorPaymentLinkReferenceId;
    }

    public void setRazorPaymentLinkReferenceId(String razorPaymentLinkReferenceId) {
        this.razorPaymentLinkReferenceId = razorPaymentLinkReferenceId;
    }

    public String getRazorpayPaymentLinkStatus() {
        return this.razorpayPaymentLinkStatus;
    }

    public void setRazorpayPaymentLinkStatus(String razorpayPaymentLinkStatus) {
        this.razorpayPaymentLinkStatus = razorpayPaymentLinkStatus;
    }

    public String getRazorpayPaymentId() {
        return this.razorpayPaymentId;
    }

    public void setRazorpayPaymentId(String razorpayPaymentId) {
        this.razorpayPaymentId = razorpayPaymentId;
    }

    public PaymentDetails paymentMethod(String paymentMethod) {
        setPaymentMethod(paymentMethod);
        return this;
    }

    public PaymentDetails status(String status) {
        setStatus(status);
        return this;
    }

    public PaymentDetails paymentId(String paymentId) {
        setPaymentId(paymentId);
        return this;
    }

    public PaymentDetails razorPaymentLinkId(String razorPaymentLinkId) {
        setRazorPaymentLinkId(razorPaymentLinkId);
        return this;
    }

    public PaymentDetails razorPaymentLinkReferenceId(String razorPaymentLinkReferenceId) {
        setRazorPaymentLinkReferenceId(razorPaymentLinkReferenceId);
        return this;
    }

    public PaymentDetails razorpayPaymentLinkStatus(String razorpayPaymentLinkStatus) {
        setRazorpayPaymentLinkStatus(razorpayPaymentLinkStatus);
        return this;
    }

    public PaymentDetails razorpayPaymentId(String razorpayPaymentId) {
        setRazorpayPaymentId(razorpayPaymentId);
        return this;
    }

}
