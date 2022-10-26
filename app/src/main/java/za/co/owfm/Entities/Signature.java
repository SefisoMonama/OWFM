package za.co.owfm.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "signature")
public class Signature {

    @PrimaryKey(autoGenerate = true)
    private Long key;

    @ColumnInfo(name = "ticket_id")
    private String ticketId;

    @ColumnInfo(name = "signature_type")
    private String signatureType;

    @ColumnInfo(name = "image")
    private byte[] image;

    @ColumnInfo(name = "sync")
    private String sync;

    public Signature(String ticketId, String signatureType, byte[] image, String sync) {
        this.ticketId = ticketId;
        this.signatureType = signatureType;
        this.image = image;
        this.sync = sync;
    }

    public Long getKey() {
        return key;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getSignatureType() {
        return signatureType;
    }

    public byte[] getImage() {
        return image;
    }

    public String getSync() {
        return sync;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setSync(String sync) {
        this.sync = sync;
    }

}
