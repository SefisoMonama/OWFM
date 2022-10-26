package za.co.owfm.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "photo")
public class Photo {

    @PrimaryKey(autoGenerate = true)
    private Long key;

    @ColumnInfo(name = "ticket_id")
    private String ticketId;

    @ColumnInfo(name = "type")
    private String type;

    @ColumnInfo(name = "image")
    private byte[] image;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "sync")
    private String sync;

    @ColumnInfo(name = "name")
    private String name;

    public Long getKey() {
        return key;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getType() {
        return type;
    }

    public byte[] getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getSync() {
        return sync;
    }

    public String getName() {
        return name;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSync(String sync) {
        this.sync = sync;
    }

    public void setName(String name) {
        this.name = name;
    }
}
