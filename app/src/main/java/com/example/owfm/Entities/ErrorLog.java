package com.example.owfm.Entities;

public class ErrorLog {

    private Long id;
    private String type;
    private String error;
    private String source;
    private String ticketId;

    public Long getId() {
        return id;
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

    public void setId(Long id) {
        this.id = id;
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
