package za.co.owfm.Entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "work_info")
public class WorkInfo {

    @PrimaryKey(autoGenerate = true)
    private Long key;

    @ColumnInfo(name = "notes")
    @NonNull
    private String notes;

    @ColumnInfo(name = "ticket_id")
    @NonNull
    private String ticketId;

    @ColumnInfo(name = "module")
    @NonNull
    private String module;


    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    @NonNull
    public String getNotes() {
        return notes;
    }

    public void setNotes(@NonNull String notes) {
        this.notes = notes;
    }

    @NonNull
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(@NonNull String ticketId) {
        this.ticketId = ticketId;
    }

    @NonNull
    public String getModule() {
        return module;
    }

    public void setModule(@NonNull String module) {
        this.module = module;
    }
}
