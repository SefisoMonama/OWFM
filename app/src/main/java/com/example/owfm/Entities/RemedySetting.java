package com.example.owfm.Entities;

public class RemedySetting {

    private Long id;
    private String username;
    private String fullName;
    private String password;
    private String server;
    private String port;
    private String webserver;
    private String webserverPort;
    private String geolocation;
    private String ssl;
    private String interval;
    private String vehicle;
    private String intervalGPSCheck;
    private String intervalGetWOCheck;
    private String intervalGPSDistanceCheck;
    private String gpsDistanceCheck;
    private String syncType;
    private String syncValue;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassword() {
        return password;
    }

    public String getServer() {
        return server;
    }

    public String getPort() {
        return port;
    }

    public String getWebserver() {
        return webserver;
    }

    public String getWebserverPort() {
        return webserverPort;
    }

    public String getGeolocation() {
        return geolocation;
    }

    public String getSsl() {
        return ssl;
    }

    public String getInterval() {
        return interval;
    }

    public String getVehicle() {
        return vehicle;
    }

    public String getIntervalGPSCheck() {
        return intervalGPSCheck;
    }

    public String getIntervalGetWOCheck() {
        return intervalGetWOCheck;
    }

    public String getIntervalGPSDistanceCheck() {
        return intervalGPSDistanceCheck;
    }

    public String getGpsDistanceCheck() {
        return gpsDistanceCheck;
    }

    public String getSyncType() {
        return syncType;
    }

    public String getSyncValue() {
        return syncValue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setWebserver(String webserver) {
        this.webserver = webserver;
    }

    public void setWebserverPort(String webserverPort) {
        this.webserverPort = webserverPort;
    }

    public void setGeolocation(String geolocation) {
        this.geolocation = geolocation;
    }

    public void setSsl(String ssl) {
        this.ssl = ssl;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void setIntervalGPSCheck(String intervalGPSCheck) {
        this.intervalGPSCheck = intervalGPSCheck;
    }

    public void setIntervalGetWOCheck(String intervalGetWOCheck) {
        this.intervalGetWOCheck = intervalGetWOCheck;
    }

    public void setIntervalGPSDistanceCheck(String intervalGPSDistanceCheck) {
        this.intervalGPSDistanceCheck = intervalGPSDistanceCheck;
    }

    public void setGpsDistanceCheck(String gpsDistanceCheck) {
        this.gpsDistanceCheck = gpsDistanceCheck;
    }

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    public void setSyncValue(String syncValue) {
        this.syncValue = syncValue;
    }

}
