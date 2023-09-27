package com.ecommerce.response;

public class AuthResponse {
    private String jwt;
    private String message;

    public AuthResponse(String token, String string) {
        this.jwt = jwt;
        this.message = message;
    }

    public AuthResponse() {
    }

    public String getJwt() {
        return this.jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
