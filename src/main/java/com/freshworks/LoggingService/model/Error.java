package com.freshworks.LoggingService.model;

public class Error {
    private int code;
    private String errorMessage;
    private String exception;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    @Override
    public String toString() {
        return "Error{" +
                "code=" + getCode() +
                ", errorMessage='" + getErrorMessage() + '\'' +
                ", exception='" + getException() + '\'' +
                '}';
    }
}

