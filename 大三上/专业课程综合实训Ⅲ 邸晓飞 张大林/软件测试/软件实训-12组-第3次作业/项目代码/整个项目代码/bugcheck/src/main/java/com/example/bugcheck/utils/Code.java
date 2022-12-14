package com.example.bugcheck.utils;

public class Code {

    private String email;
    private String codeValue;

    public Code(String email, String codeValue) {
        this.email = email;
        this.codeValue = codeValue;
    }

    public Code() {
    }

    public String getUsername() {
        return email;
    }

    public void setUsername(String username) {
        this.email = username;
    }

    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}