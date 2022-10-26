package za.co.owfm.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "task")
public class Task {

    @PrimaryKey(autoGenerate = true)
    private Long key;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "summary")
    private String summary;

    @ColumnInfo(name = "notes")
    private String notes;

    @ColumnInfo(name = "priority")
    private String priority;

    @ColumnInfo(name = "task_id")
    private String taskId;

    @ColumnInfo(name = "type")
    private String type;

    @ColumnInfo(name = "status")
    private String status;

    @ColumnInfo(name = "status_reason")
    private String statusReason;

    @ColumnInfo(name = "ticket_id")
    private String ticketId;

    @ColumnInfo(name = "sync")
    private String sync;

    public Task(String name, String summary, String notes, String priority, String taskId, String type, String status, String statusReason, String ticketId, String sync) {
        this.name = name;
        this.summary = summary;
        this.notes = notes;
        this.priority = priority;
        this.taskId = taskId;
        this.type = type;
        this.status = status;
        this.statusReason = statusReason;
        this.ticketId = ticketId;
        this.sync = sync;
    }

    public Long getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }

    public String getNotes() {
        return notes;
    }

    public String getPriority() {
        return priority;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getType() {
        return type;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public void setType(String type) {
        this.type = type;
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
