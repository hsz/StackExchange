package mobi.hsz.stackexchange.entity;

import com.google.gson.annotations.SerializedName;

public class Error {

    @SerializedName("error_id")
    protected int id;

    protected String description;

    @SerializedName("error_name")
    protected String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
