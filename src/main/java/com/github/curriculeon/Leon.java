package com.github.curriculeon;

public class Leon {
    public static final Leon INSTANCE = new Leon(0L, "Leon");
    private long id;
    private String name;

    private Leon(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
