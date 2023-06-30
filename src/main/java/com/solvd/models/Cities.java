package com.solvd.models;

public class Cities {
    private Long id;

    private String name;


    public Cities() {
    }

    public Cities(String name) {
        this.name = name;

    }

    public Cities(Long id, String name) {
        this.id = id;
        this.name = name;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Cities{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }
}


