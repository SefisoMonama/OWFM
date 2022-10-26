package za.co.owfm.Entities;

public class Signature {

    private Long id;
    private String ticketId;
    private String signatureType;
    private byte[] image;
    private String sync;

    public Long getId() {
        return id;
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

    public void setId(Long id) {
        this.id = id;
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
