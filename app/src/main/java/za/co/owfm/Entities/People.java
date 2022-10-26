package za.co.owfm.Entities;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "people")
public class People {

    @PrimaryKey(autoGenerate = true)
    private Long key;
    @ColumnInfo(name = "full_name")
    private String fullName;

    @ColumnInfo(name = "last_name")
    private String lastName;

    @ColumnInfo(name = "first_name")
    private String firstName;

    @ColumnInfo(name = "person_id")
    private String personId;

    @ColumnInfo(name = "company")
    private String company;

    @ColumnInfo(name = "sync")
    private String sync;

    public People(String fullName, String lastName, String firstName, String personId, String company, String sync) {
        this.fullName = fullName;
        this.lastName = lastName;
        this.firstName = firstName;
        this.personId = personId;
        this.company = company;
        this.sync = sync;
    }

    public Long getKey() {
        return key;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPersonId() {
        return personId;
    }

    public String getCompany() {
        return company;
    }

    public String getSync() {
        return sync;
    }

    public void setKey(Long iD) {
        key = iD;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSync(String sync) {
        this.sync = sync;
    }
}
