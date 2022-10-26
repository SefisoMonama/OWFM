package za.co.owfm.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "geo_connection")
public class GeoConnection {

    @PrimaryKey(autoGenerate = true)
    private Long key;

    @ColumnInfo(name = "longitude")
    private String longitude;

    @ColumnInfo(name = "latitude")
    private String latitude;

    @ColumnInfo(name = "altitude")
    private String altitude;

    @ColumnInfo(name = "heading")
    private String heading;

    @ColumnInfo(name = "accuracy")
    private String accuracy;

    @ColumnInfo(name = "speed")
    private String speed;

    @ColumnInfo(name = "timestamp")
    private String timestamp;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = "altitude_accuracy")
    private String altitudeAccuracy;

    @ColumnInfo(name = "source")
    private String source;

    public Long getKey() {
        return key;
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

    public void setKey(Long id) {
        this.key = key;
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
