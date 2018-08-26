package com.example.demo4.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Dima on 25.08.2018.
 */

@Entity
public class Advertiser implements Serializable {

    @Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "contactName", nullable = false)
    private String contactName;

    @Column(name = "creditLimit", nullable = false)
    private int creditLimit;

    public Advertiser() {

    }

    public Advertiser(String name, String contactName, int creditLimit) {
        this.name = name;
        this.contactName = contactName;
        this.creditLimit = creditLimit;
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

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Advertiser that = (Advertiser) o;

        if (creditLimit != that.creditLimit) return false;
        if (!id.equals(that.id)) return false;
        if (!name.equals(that.name)) return false;
        return contactName.equals(that.contactName);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + contactName.hashCode();
        result = 31 * result + creditLimit;
        return result;
    }

    @Override
    public String toString() {
        return "Advertiser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactName='" + contactName + '\'' +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
