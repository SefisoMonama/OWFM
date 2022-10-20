package com.example.owfm.Entities;

public class Task {

    private Long id;
    private String name;
    private String summary;
    private String notes;
    private String priority;
    private String taskId;
    private String type;
    private String status;
    private String statusReason;
    private String ticketId;
    private String sync;

    public Long getId() {
        return id;
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

    public void setId(Long id) {
        this.id = id;
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
