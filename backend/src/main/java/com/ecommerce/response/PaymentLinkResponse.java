package com.ecommerce.response;

public class PaymentLinkResponse {

    private String paymentLink_id;
    private String paymentLink_url;

    public PaymentLinkResponse() {
    }

    public PaymentLinkResponse(String paymentLink_id, String paymentLink_url) {
        this.paymentLink_id = paymentLink_id;
        this.paymentLink_url = paymentLink_url;
    }

    public String getPaymentLink_id() {
        return this.paymentLink_id;
    }

    public void setPaymentLink_id(String paymentLink_id) {
        this.paymentLink_id = paymentLink_id;
    }

    public String getPaymentLink_url() {
        return this.paymentLink_url;
    }

    public void setPaymentLink_url(String paymentLink_url) {
        this.paymentLink_url = paymentLink_url;
    }

    public PaymentLinkResponse paymentLink_id(String paymentLink_id) {
        setPaymentLink_id(paymentLink_id);
        return this;
    }

    public PaymentLinkResponse paymentLink_url(String paymentLink_url) {
        setPaymentLink_url(paymentLink_url);
        return this;
    }

}
