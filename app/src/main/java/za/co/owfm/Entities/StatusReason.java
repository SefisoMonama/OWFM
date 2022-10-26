package za.co.owfm.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "status_reason")
public class StatusReason {

    @PrimaryKey(autoGenerate = true)
    private Long key;

    @ColumnInfo(name = "status_reason")
    private String statusReason;

    @ColumnInfo(name = "ticket_id")
    private String ticketId;

    @ColumnInfo(name = "status")
    private String status;

    @ColumnInfo(name = "sync")
    private String sync;

    public StatusReason(String status, String statusReason, String ticketId, String sync) {
        this.status = status;
        this.statusReason = statusReason;
        this.ticketId = ticketId;
        this.sync = sync;
    }

    public Long getKey() {
        return key;
    }

    public String getStatus() {
        return status;
    }

    public String getStatusReason() {
        return statusReason;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getSync() {
        return sync;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setSync(String sync) {
        this.sync = sync;
    }
}
