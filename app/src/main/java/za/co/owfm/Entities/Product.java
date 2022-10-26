package za.co.owfm.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "product")
public class Product {

    @PrimaryKey(autoGenerate = true)
    private Long key;

    @ColumnInfo(name = "model_version_id")
    private String modelVersionId;

    @ColumnInfo(name = "product_name")
    private String productName;

    @ColumnInfo(name = "company")
    private String company;

    public Product(String modelVersionId, String productName, String company) {
        this.modelVersionId = modelVersionId;
        this.productName = productName;
        this.company = company;
    }

    public Long getKey() {
        return key;
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

    public void setKey(Long key) {
        this.key = key;
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
