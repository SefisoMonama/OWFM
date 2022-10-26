package za.co.owfm.Entities;

public class Product {

    private Long id;
    private String modelVersionId;
    private String productName;
    private String company;

    public Long getId() {
        return id;
    }

    public String getModelVersionId() {
        return modelVersionId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCompany() {
        return company;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setModelVersionId(String modelVersionId) {
        this.modelVersionId = modelVersionId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
