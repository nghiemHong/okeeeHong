package com.example.myapplication;

public class Nhanvien {
    String id;
    String Name;

    public Nhanvien(String id, String name) {
        this.id = id;
        Name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
