package com.example.owfm.Entities;

public class StatusReason {

    private Long id;
    private String status;
    private String statusReason;
    private String ticketId;
    private String sync;

    public Long getId() {
        return id;
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
