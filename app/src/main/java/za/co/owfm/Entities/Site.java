package za.co.owfm.Entities;

public class Site {
    private Long id;
    private String company;
    private String site;
    private String scannerTag;
    private String type;

    public Long getId() {
        return id;
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

    public void setId(Long id) {
        this.id = id;
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
