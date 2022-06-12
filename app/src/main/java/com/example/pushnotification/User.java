package com.example.pushnotification;

public class User {
    private String token;
    private String deviceName;
    private String deviceId;

    public User(String token, String deviceName, String deviceId) {
        this.token = token;
        this.deviceName = deviceName;
        this.deviceId = deviceId;
    }

    public User() { }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
