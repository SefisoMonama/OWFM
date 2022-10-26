package za.co.owfm.Entities;

public class Photo {
    private Long id;
    private String ticketId;
    private String type;
    private byte[] Img;
    private String description;
    private String sync;
    private String name;

    public Long getId() {
        return id;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getType() {
        return type;
    }

    public byte[] getImg() {
        return Img;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImg(byte[] img) {
        Img = img;
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
