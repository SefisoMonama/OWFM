package za.co.owfm.Entities;

public class Priority {
    private Long id;
    private String priority;
    private String sync;

    public Long getId() {
        return id;
    }

    public String getPriority() {
        return priority;
    }

    public String getSync() {
        return sync;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setSync(String sync) {
        this.sync = sync;
    }
}
