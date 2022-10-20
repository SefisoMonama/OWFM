package com.example.owfm.Entities;

public class WorkInfo {

    private Long id;
    private String notes;
    private String ticketId;
    private String module;

    public Long getId() {
        return id;
    }

    public String getNotes() {
        return notes;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getModule() {
        return module;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
