package com.freshworks.LoggingService.model;

public  class Browser {
    private String name;

    private String versionx;

    private String os;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersionx() {
        return versionx;
    }

    public void setVersionx(String versionx) {
        this.versionx = versionx;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Browser{" +
                "name='" + getName() + '\'' +
                ", versionx='" + getVersionx() + '\'' +
                ", os='" + getOs() + '\'' +
                '}';
    }
}
