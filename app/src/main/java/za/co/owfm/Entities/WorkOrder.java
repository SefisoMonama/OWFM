package za.co.owfm.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;


import java.util.Date;

@Entity(tableName = "workorder")
public class WorkOrder {

    @PrimaryKey(autoGenerate = true)
    private Long keys;
    private String workOrderId;
    private String company;
    private String customerName;
    private String contact;
    private String notes;
    private String template;
    private String summary;
    private String service;
    private String workOrderType;
    private String requestManager;
    private String rMSupportGroupName;
    private String requestAssignee;
    private String rASupportGroupName;
    private String status;
    private String statusReason;
    private String priority;
    private String vendorGroup;
    private String vendorTicketNumber;
    private String mobiSYNCStatus;
    private String sync;
    private String site;
    private String address;
    private String siteGroup;
    private String region;
    private String locationCompany;
    private String workInfo;
    private String workOrderOpen;
    private String latitude;
    private String longitude;
    private String scheduledStartDate;
    private String scheduledEndDate;
    private String organization;
    private String supportOrganization;
    private String supportGroup;
    private String resolutionReason;
    private String customerLastName;
    private String customerFirstName;
    private String rMSupportOrganization;
    private String woGuid;
    private String appointment;
    private String sequence;
    private String lastModifiedDate;
    //private Date actualStartDate;
    //private Date actualEndDate;
    //private Date arrivalDate;
    //private Date completedDate;

    public WorkOrder() {

    }

    public WorkOrder(String workOrderId, String company, String customerName, String contact, String notes) {
        this.workOrderId = workOrderId;
        this.company = company;
        this.customerName = customerName;
        this.contact = contact;
        this.notes = notes;
    }

    public Long getKeys() {
        return keys;
    }

    public String getWorkOrderId() {
        return workOrderId;
    }

    public String getCompany() {
        return company;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getContact() {
        return contact;
    }

    public String getNotes() {
        return notes;
    }

    public String getTemplate() {
        return template;
    }

    public String getSummary() {
        return summary;
    }

    public String getService() {
        return service;
    }

    public String getWorkOrderType() {
        return workOrderType;
    }

    public String getRequestManager() {
        return requestManager;
    }

    public String getRMSupportGroupName() {
        return rMSupportGroupName;
    }

    public String getRequestAssignee() {
        return requestAssignee;
    }

    public String getRASupportGroupName() {
        return rASupportGroupName;
    }

    public String getStatus() {
        return status;
    }

    public String getStatusReason() {
        return statusReason;
    }

    public String getPriority() {
        return priority;
    }

    public String getVendorGroup() {
        return vendorGroup;
    }

    public String getVendorTicketNumber() {
        return vendorTicketNumber;
    }

    public String getMobiSYNCStatus() {
        return mobiSYNCStatus;
    }

    public String getSync() {
        return sync;
    }

    public String getSite() {
        return site;
    }

    public String getAddress() {
        return address;
    }

    public String getSiteGroup() {
        return siteGroup;
    }

    public String getRegion() {
        return region;
    }

    public String getLocationCompany() {
        return locationCompany;
    }

    public String getWorkInfo() {
        return workInfo;
    }

    public String getWorkOrderOpen() {
        return workOrderOpen;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getScheduledStartDate() {
        return scheduledStartDate;
    }

    public String getScheduledEndDate() {
        return scheduledEndDate;
    }

    public String getOrganization() {
        return organization;
    }

    public String getSupportOrganization() {
        return supportOrganization;
    }

    public String getSupportGroup() {
        return supportGroup;
    }

    public String getResolutionReason() {
        return resolutionReason;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getRMSupportOrganization() {
        return rMSupportOrganization;
    }

    public String getWoGuid() {
        return woGuid;
    }

    public String getAppointment() {
        return appointment;
    }

    public String getSequence() {
        return sequence;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * public Date getActualStartDate() {
     * return actualStartDate;
     * }
     * <p>
     * public Date getActualEndDate() {
     * return actualEndDate;
     * }
     * <p>
     * public Date getArrivalDate() {
     * return arrivalDate;
     * }
     * <p>
     * public Date getCompletedDate() {
     * return completedDate;
     * }
     **/

    public void setKeys(Long keys) {
        this.keys = keys;
    }

    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setWorkOrderType(String workOrderType) {
        this.workOrderType = workOrderType;
    }

    public void setRequestManager(String requestManager) {
        this.requestManager = requestManager;
    }

    public void setRMSupportGroupName(String rMSupportGroupName) {
        this.rMSupportGroupName = rMSupportGroupName;
    }

    public void setRequestAssignee(String requestAssignee) {
        this.requestAssignee = requestAssignee;
    }

    public void setRASupportGroupName(String rASupportGroupName) {
        this.rASupportGroupName = rASupportGroupName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setVendorGroup(String vendorGroup) {
        this.vendorGroup = vendorGroup;
    }

    public void setVendorTicketNumber(String vendorTicketNumber) {
        this.vendorTicketNumber = vendorTicketNumber;
    }

    public void setMobiSYNCStatus(String mobiSYNCStatus) {
        this.mobiSYNCStatus = mobiSYNCStatus;
    }

    public void setSync(String sync) {
        this.sync = sync;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSiteGroup(String siteGroup) {
        this.siteGroup = siteGroup;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setLocationCompany(String locationCompany) {
        this.locationCompany = locationCompany;
    }

    public void setWorkInfo(String workInfo) {
        this.workInfo = workInfo;
    }

    public void setWorkOrderOpen(String workOrderOpen) {
        this.workOrderOpen = workOrderOpen;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setScheduledStartDate(String scheduledStartDate) {
        this.scheduledStartDate = scheduledStartDate;
    }

    public void setScheduledEndDate(String scheduledEndDate) {
        this.scheduledEndDate = scheduledEndDate;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public void setSupportOrganization(String supportOrganization) {
        this.supportOrganization = supportOrganization;
    }

    public void setSupportGroup(String supportGroup) {
        this.supportGroup = supportGroup;
    }

    public void setResolutionReason(String resolutionReason) {
        this.resolutionReason = resolutionReason;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public void setRMSupportOrganization(String rMSupportOrganization) {
        this.rMSupportOrganization = rMSupportOrganization;
    }

    public void setWoGuid(String woGuid) {
        this.woGuid = woGuid;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
/**
 public void setActualStartDate(Date actualStartDate) {
 this.actualStartDate = actualStartDate;
 }

 public void setActualEndDate(Date actualEndDate) {
 this.actualEndDate = actualEndDate;
 }

 public void setArrivalDate(Date arrivalDate) {
 this.arrivalDate = arrivalDate;
 }

 public void setCompletedDate(Date completedDate) {
 this.completedDate = completedDate;
 }**/


}
