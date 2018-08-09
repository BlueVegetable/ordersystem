package yidong.model;

public class SmallType {
    private String id;

    private String name;

    private String bigTypeId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBigTypeId() {
        return bigTypeId;
    }

    public void setBigTypeId(String bigTypeId) {
        this.bigTypeId = bigTypeId == null ? null : bigTypeId.trim();
    }
}