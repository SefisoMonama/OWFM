package za.co.owfm.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "site")
public class Site {

    @PrimaryKey(autoGenerate = true)
    private Long key;

    @ColumnInfo(name = "company")
    private String company;

    @ColumnInfo(name = "site")
    private String site;

    @ColumnInfo(name = "scanner_tag")
    private String scannerTag;

    @ColumnInfo(name = "type")
    private String type;

    public Site(String company, String site, String scannerTag, String type) {
        this.company = company;
        this.site = site;
        this.scannerTag = scannerTag;
        this.type = type;
    }

    public Long getKey() {
        return key;
    }

    public String getCompany() {
        return company;
    }

    public String getSite() {
        return site;
    }

    public String getScannerTag() {
        return scannerTag;
    }

    public String getType() {
        return type;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setScannerTag(String scannerTag) {
        this.scannerTag = scannerTag;
    }

    public void setType(String type) {
        this.type = type;
    }
}
