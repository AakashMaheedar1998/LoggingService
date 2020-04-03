package com.freshworks.LoggingService.model;

import com.google.gson.Gson;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
//remove xml
//change class name

public class LoggingInfo implements Serializable {

    private Error error;

    private long appID;

    private Browser browser;

    private String UserAlias;

    Gson gson = new Gson();

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public long getAppID() {
        return appID;
    }

    public void setAppID(long appID) {
        this.appID = appID;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public String getUserAlias() {
        return UserAlias;
    }

    public void setUserAlias(String userAlias) {
        UserAlias = userAlias;
    }

    @Override
    public String toString() {
        return "LoggingInfo{" +
                "error=" + getError() +
                ", appID=" + getAppID() +
                ", browser=" + getBrowser() +
                ", UserAlias='" + getUserAlias() + '\'' +
                '}';
    }
}