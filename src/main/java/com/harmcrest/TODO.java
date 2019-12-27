package com.harmcrest;

public class TODO {
    private String desc;
    private String summary;
    private int id;

    public TODO(int id, String summary, String desc) {
        this.id = id;
        this.summary = summary;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TODO{" +
                "desc='" + desc + '\'' +
                ", summary='" + summary + '\'' +
                ", id=" + id +
                '}';
    }
}
