package za.co.owfm.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "scan_integration")
public class ScanIntegration {

    @PrimaryKey(autoGenerate = true)
    private Long key;

    @ColumnInfo(name = "company")
    private String company;

    @ColumnInfo(name = "operator")
    private String operator;

    @ColumnInfo(name = "serial_number")
    private String serialNumber;

    @ColumnInfo(name = "site_store")
    private String siteStore;

    @ColumnInfo(name = "room")
    private String room;

    @ColumnInfo(name = "inventory_location")
    private String inventoryLocation;

    @ColumnInfo(name = "po_ticket_number")
    private String poTicketNumber;

    @ColumnInfo(name = "operation")
    private String operation;

    @ColumnInfo(name = "floor")
    private String floor;

    @ColumnInfo(name = "position")
    private String position;

    @ColumnInfo(name = "tag_number")
    private String tagNumber;

    @ColumnInfo(name = "ticket_number")
    private String ticketNumber;

    @ColumnInfo(name = "site")
    private String site;

    @ColumnInfo(name = "model_name")
    private String modelName;

    @ColumnInfo(name = "model_name2")
    private String modelName2;

    @ColumnInfo(name = "parent_serial_number")
    private String parentSerialNumber;

    @ColumnInfo(name = "check_asset_exist")
    private String checkAssetExist;

    @ColumnInfo(name = "inventory_Status_season")
    private String inventoryStatusReason;

    @ColumnInfo(name = "asset_life_Cycle_status")
    private String assetLifeCycleStatus;

    @ColumnInfo(name = "sync")
    private String Sync;

    @ColumnInfo(name = "notes")
    private String notes;

    @ColumnInfo(name = "ztext1")
    private String zText1;

    @ColumnInfo(name = "ztext2")
    private String zText2;

    @ColumnInfo(name = "ztext3")
    private String zText3;

    @ColumnInfo(name = "planned_actual")
    private String plannedActual;

    @ColumnInfo(name = "status")
    private String status;

    //didn't see any field for products
    @ColumnInfo(name = "product")
    private String product;


    public ScanIntegration(String ticketNumber, String serialNumber, String tagNumber, String site, String notes, String product) {
        this.ticketNumber = ticketNumber;
        this.serialNumber = serialNumber;
        this.tagNumber = tagNumber;
        this.site = site;
        this.notes = notes;
        this.product = product;
    }


    @Ignore
    public ScanIntegration(String ticketNumber, String serialNumber, String tagNumber, String site) {
        this.ticketNumber = ticketNumber;
        this.serialNumber = serialNumber;
        this.tagNumber = tagNumber;
        this.site = site;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Long getKey() {
        return key;
    }

    public String getCompany() {
        return company;
    }

    public String getOperator() {
        return operator;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getSiteStore() {
        return siteStore;
    }

    public String getRoom() {
        return room;
    }

    public String getInventoryLocation() {
        return inventoryLocation;
    }

    public String getPoTicketNumber() {
        return poTicketNumber;
    }

    public String getOperation() {
        return operation;
    }

    public String getFloor() {
        return floor;
    }

    public String getPosition() {
        return position;
    }

    public String getTagNumber() {
        return tagNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public String getSite() {
        return site;
    }

    public String getModelName() {
        return modelName;
    }

    public String getModelName2() {
        return modelName2;
    }

    public String getParentSerialNumber() {
        return parentSerialNumber;
    }

    public String getCheckAssetExist() {
        return checkAssetExist;
    }

    public String getInventoryStatusReason() {
        return inventoryStatusReason;
    }

    public String getAssetLifeCycleStatus() {
        return assetLifeCycleStatus;
    }

    public String getSync() {
        return Sync;
    }

    public String getNotes() {
        return notes;
    }

    public String getZText1() {
        return zText1;
    }

    public String getZText2() {
        return zText2;
    }

    public String getZText3() {
        return zText3;
    }

    public String getPlannedActual() {
        return plannedActual;
    }

    public String getStatus() {
        return status;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setSiteStore(String siteStore) {
        this.siteStore = siteStore;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setInventoryLocation(String inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }

    public void setPoTicketNumber(String poTicketNumber) {
        this.poTicketNumber = poTicketNumber;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTagNumber(String tagNumber) {
        this.tagNumber = tagNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setModelName2(String modelName2) {
        this.modelName2 = modelName2;
    }

    public void setParentSerialNumber(String parentSerialNumber) {
        this.parentSerialNumber = parentSerialNumber;
    }

    public void setCheckAssetExist(String checkAssetExist) {
        this.checkAssetExist = checkAssetExist;
    }

    public void setInventoryStatusReason(String inventoryStatusReason) {
        this.inventoryStatusReason = inventoryStatusReason;
    }

    public void setAssetLifeCycleStatus(String assetLifeCycleStatus) {
        this.assetLifeCycleStatus = assetLifeCycleStatus;
    }


    public void setSync(String sync) {
        Sync = sync;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setZText1(String zText1) {
        this.zText1 = zText1;
    }

    public void setZText2(String zText2) {
        this.zText2 = zText2;
    }

    public void setZText3(String zText3) {
        this.zText3 = zText3;
    }

    public void setPlannedActual(String plannedActual) {
        this.plannedActual = plannedActual;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
