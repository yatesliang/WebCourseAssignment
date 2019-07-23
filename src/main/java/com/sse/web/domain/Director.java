package com.sse.web.domain;

public class Director {
    private Integer id;

    private String name;

    public Director(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Director() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}