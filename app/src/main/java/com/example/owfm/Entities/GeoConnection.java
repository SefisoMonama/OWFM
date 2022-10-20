package com.example.owfm.Entities;

public class GeoConnection {

    private Long id;
    private String longitude;
    private String latitude;
    private String altitude;
    private String heading;
    private String accuracy;
    private String speed;
    private String timestamp;
    private String timezone;
    private String altitudeAccuracy;
    private String source;

    public Long getId() {
        return id;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getAltitude() {
        return altitude;
    }

    public String getHeading() {
        return heading;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public String getSpeed() {
        return speed;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getAltitudeAccuracy() {
        return altitudeAccuracy;
    }

    public String getSource() {
        return source;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public void setAltitudeAccuracy(String altitudeAccuracy) {
        this.altitudeAccuracy = altitudeAccuracy;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
