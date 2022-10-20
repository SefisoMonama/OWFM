package com.example.owfm.Entities;


import androidx.room.Entity;

@Entity(tableName = "asset")
public class Asset {

    private Long id;
    private String ticketId;
    private String requestId;
    private String ciName;
    private String ciId;
    private String serialNumber;
    private String instanceId;
    private String status;
    private String tier1;
    private String tier3;
    private String tagNumber;
    private String tier2;
    private String manufacturerName;
    private String modelNumber;
    private String modelVersion;
    private String open;
    private String relationshipType;
    private String assetNotes;

    public Long getId() {
        return id;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getCiName() {
        return ciName;
    }

    public String getCiId() {
        return ciId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public String getStatus() {
        return status;
    }

    public String getTier1() {
        return tier1;
    }

    public String getTier3() {
        return tier3;
    }

    public String getTagNumber() {
        return tagNumber;
    }

    public String getTier2() {
        return tier2;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getModelVersion() {
        return modelVersion;
    }

    public String getOpen() {
        return open;
    }

    public String getRelationshipType() {
        return relationshipType;
    }

    public String getAssetNotes() {
        return assetNotes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setCiName(String ciName) {
        this.ciName = ciName;
    }

    public void setCiId(String ciId) {
        this.ciId = ciId;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTier1(String tier1) {
        this.tier1 = tier1;
    }

    public void setTier3(String tier3) {
        this.tier3 = tier3;
    }

    public void setTagNumber(String tagNumber) {
        this.tagNumber = tagNumber;
    }

    public void setTier2(String tier2) {
        this.tier2 = tier2;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    public void setAssetNotes(String assetNotes) {
        this.assetNotes = assetNotes;
    }
}
