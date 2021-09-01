package com.example.deploymentonazure;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cid;
    private String name;
    private long zip;

    public City(int cid, String name, long zip) {
        this.cid = cid;
        this.name = name;
        this.zip = zip;
    }

    public City() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cid=" + cid +
                ", name='" + name + '\'' +
                ", zip=" + zip +
                '}';
    }
}

