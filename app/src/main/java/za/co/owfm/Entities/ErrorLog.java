package za.co.owfm.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "error_log")
public class ErrorLog {

    @PrimaryKey(autoGenerate = true)
    private Long key;

    @ColumnInfo(name = "type")
    private String type;

    @ColumnInfo(name = "error")
    private String error;

    @ColumnInfo(name = "source")
    private String source;

    @ColumnInfo(name = "ticket_id")
    private String ticketId;

    public ErrorLog(String type, String error, String source, String ticketId) {
        this.type = type;
        this.error = error;
        this.source = source;
        this.ticketId = ticketId;
    }

    public Long getKey() {
        return key;
    }

    public String getType() {
        return type;
    }

    public String getError() {
        return error;
    }

    public String getSource() {
        return source;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
}
