package za.co.owfm.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "menu_item")
public class MenuItem {

    @PrimaryKey(autoGenerate = true)
    private Long key;

    @ColumnInfo(name = "menu_category")
    private String menuCategory;

    @ColumnInfo(name = "menu_label1")
    private String menuLabel1;

    @ColumnInfo(name = "menu_value1")
    private String menuValue1;

    @ColumnInfo(name = "menu_label2")
    private String menuLabel2;

    @ColumnInfo(name = "menu_value2")
    private String menuValue2;

    @ColumnInfo(name = "status")
    private String status;

    @ColumnInfo(name = "sync")
    private String sync;

    public MenuItem(String menuCategory, String menuLabel1, String menuValue1, String menuLabel2, String menuValue2, String status, String sync) {
        this.menuCategory = menuCategory;
        this.menuLabel1 = menuLabel1;
        this.menuValue1 = menuValue1;
        this.menuLabel2 = menuLabel2;
        this.menuValue2 = menuValue2;
        this.status = status;
        this.sync = sync;
    }


    public Long getKey() {
        return key;
    }

    public String getMenuCategory() {
        return menuCategory;
    }

    public String getMenuLabel1() {
        return menuLabel1;
    }

    public String getMenuValue1() {
        return menuValue1;
    }

    public String getMenuLabel2() {
        return menuLabel2;
    }

    public String getMenuValue2() {
        return menuValue2;
    }

    public String getStatus() {
        return status;
    }

    public String getSync() {
        return sync;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public void setMenuCategory(String menuCategory) {
        this.menuCategory = menuCategory;
    }

    public void setMenuLabel1(String menuLabel1) {
        this.menuLabel1 = menuLabel1;
    }

    public void setMenuValue1(String menuValue1) {
        this.menuValue1 = menuValue1;
    }

    public void setMenuLabel2(String menuLabel2) {
        this.menuLabel2 = menuLabel2;
    }

    public void setMenuValue2(String menuValue2) {
        this.menuValue2 = menuValue2;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSync(String sync) {
        this.sync = sync;
    }
}
