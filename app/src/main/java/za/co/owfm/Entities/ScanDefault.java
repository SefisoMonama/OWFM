package za.co.owfm.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "scan_default")
public class ScanDefault {

    @PrimaryKey(autoGenerate = true)
    private Long key;

    @ColumnInfo(name = "default_name")
    private String defaultName;

    @ColumnInfo(name = "company")
    private String company;

    @ColumnInfo(name = "gr_allow_access")
    private String grAllowAccess;

    @ColumnInfo(name = "gr_force_tn")
    private String grForceTN;

    @ColumnInfo(name = "gr_validate_tn")
    private String grValidateTN;

    @ColumnInfo(name = "a_allow_access")
    private String aAllowAccess;

    @ColumnInfo(name = "a_force_tn")
    private String aForceTN;

    @ColumnInfo(name = "a_validate_tn")
    private String aValidateTN;

    @ColumnInfo(name = "m_allow_access")
    private String mAllowAccess;

    @ColumnInfo(name = "m_force_tn")
    private String mForceTN;

    @ColumnInfo(name = "m_validate_tn")
    private String mValidateTN;

    @ColumnInfo(name = "c_allow_access")
    private String cAllowAccess;

    @ColumnInfo(name = "c_force_tn")
    private String cForceTN;

    @ColumnInfo(name = "c_validate_tn")
    private String cValidateTN;

    @ColumnInfo(name = "bf_allow_access")
    private String bfAllowAccess;

    @ColumnInfo(name = "bf_force_tn")
    private String bfForceTN;

    @ColumnInfo(name = "bf_validate_tn")
    private String bfValidateTN;

    @ColumnInfo(name = "br_allow_access")
    private String brAllowAccess;

    @ColumnInfo(name = "br_force_tn")
    private String brForceTN;

    @ColumnInfo(name = "br_validate_tn")
    private String brValidateTN;

    @ColumnInfo(name = "br_ep_allow_access")
    private String brEpAllowAccess;

    @ColumnInfo(name = "br_ep_force_tn")
    private String brEpForceTN;

    @ColumnInfo(name = "br_ep_Validate_tn")
    private String brEpValidateTN;

    @ColumnInfo(name = "d_allow_access")
    private String dAllowAccess;

    @ColumnInfo(name = "d_force_tn")
    private String dForceTN;

    @ColumnInfo(name = "d_validate_tn")
    private String dValidateTN;

    @ColumnInfo(name = "display_add_field")
    private String displayAddField;

    @ColumnInfo(name = "force_add_field")
    private String forceAddField;

    @ColumnInfo(name = "label_add_field")
    private String labelAddField;

    public Long getKey() {
        return key;
    }

    public String getDefaultName() {
        return defaultName;
    }

    public String getCompany() {
        return company;
    }

    public String getGrAllowAccess() {
        return grAllowAccess;
    }

    public String getGrForceTN() {
        return grForceTN;
    }

    public String getGrValidateTN() {
        return grValidateTN;
    }

    public String getAAllowAccess() {
        return aAllowAccess;
    }

    public String getAForceTN() {
        return aForceTN;
    }

    public String getAValidateTN() {
        return aValidateTN;
    }

    public String getMAllowAccess() {
        return mAllowAccess;
    }

    public String getMForceTN() {
        return mForceTN;
    }

    public String getMValidateTN() {
        return mValidateTN;
    }

    public String getCAllowAccess() {
        return cAllowAccess;
    }

    public String getCForceTN() {
        return cForceTN;
    }

    public String getCValidateTN() {
        return cValidateTN;
    }

    public String getBfAllowAccess() {
        return bfAllowAccess;
    }

    public String getBfForceTN() {
        return bfForceTN;
    }

    public String getBfValidateTN() {
        return bfValidateTN;
    }

    public String getBrAllowAccess() {
        return brAllowAccess;
    }

    public String getBrForceTN() {
        return brForceTN;
    }

    public String getBrValidateTN() {
        return brValidateTN;
    }

    public String getBrEpAllowAccess() {
        return brEpAllowAccess;
    }

    public String getBrEpForceTN() {
        return brEpForceTN;
    }

    public String getBrEpValidateTN() {
        return brEpValidateTN;
    }

    public String getDAllowAccess() {
        return dAllowAccess;
    }

    public String getDForceTN() {
        return dForceTN;
    }

    public String getDValidateTN() {
        return dValidateTN;
    }

    public String getDisplayAddField() {
        return displayAddField;
    }

    public String getForceAddField() {
        return forceAddField;
    }

    public String getLabelAddField() {
        return labelAddField;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setGrAllowAccess(String grAllowAccess) {
        this.grAllowAccess = grAllowAccess;
    }

    public void setGrForceTN(String grForceTN) {
        this.grForceTN = grForceTN;
    }

    public void setGrValidateTN(String grValidateTN) {
        this.grValidateTN = grValidateTN;
    }

    public void setAAllowAccess(String aAllowAccess) {
        this.aAllowAccess = aAllowAccess;
    }

    public void setAForceTN(String aForceTN) {
        this.aForceTN = aForceTN;
    }

    public void setAValidateTN(String aValidateTN) {
        this.aValidateTN = aValidateTN;
    }

    public void setMAllowAccess(String mAllowAccess) {
        this.mAllowAccess = mAllowAccess;
    }

    public void setMForceTN(String mForceTN) {
        this.mForceTN = mForceTN;
    }

    public void setMValidateTN(String mValidateTN) {
        this.mValidateTN = mValidateTN;
    }

    public void setCAllowAccess(String cAllowAccess) {
        this.cAllowAccess = cAllowAccess;
    }

    public void setCForceTN(String cForceTN) {
        this.cForceTN = cForceTN;
    }

    public void setCValidateTN(String cValidateTN) {
        this.cValidateTN = cValidateTN;
    }

    public void setBfAllowAccess(String bfAllowAccess) {
        this.bfAllowAccess = bfAllowAccess;
    }

    public void setBfForceTN(String bfForceTN) {
        this.bfForceTN = bfForceTN;
    }

    public void setBfValidateTN(String bfValidateTN) {
        this.bfValidateTN = bfValidateTN;
    }

    public void setBrAllowAccess(String brAllowAccess) {
        this.brAllowAccess = brAllowAccess;
    }

    public void setBrForceTN(String brForceTN) {
        this.brForceTN = brForceTN;
    }

    public void setBrValidateTN(String brValidateTN) {
        this.brValidateTN = brValidateTN;
    }

    public void setBrEpAllowAccess(String brEpAllowAccess) {
        this.brEpAllowAccess = brEpAllowAccess;
    }

    public void setBrEpForceTN(String brEpForceTN) {
        this.brEpForceTN = brEpForceTN;
    }

    public void setBrEpValidateTN(String brEpValidateTN) {
        this.brEpValidateTN = brEpValidateTN;
    }

    public void setDAllowAccess(String dAllowAccess) {
        this.dAllowAccess = dAllowAccess;
    }

    public void setDForceTN(String dForceTN) {
        this.dForceTN = dForceTN;
    }

    public void setDValidateTN(String dValidateTN) {
        this.dValidateTN = dValidateTN;
    }

    public void setDisplayAddField(String displayAddField) {
        this.displayAddField = displayAddField;
    }

    public void setForceAddField(String forceAddField) {
        this.forceAddField = forceAddField;
    }

    public void setLabelAddField(String labelAddField) {
        this.labelAddField = labelAddField;
    }
}
