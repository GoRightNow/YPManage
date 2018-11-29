package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "yp_package")
public class Package {
    private Integer id;
    private Integer areaId;
    private String packageType;
    private Double price;

    public Package(Integer id, Integer areaId, String packageType, Double price) {
        this.id = id;
        this.areaId = areaId;
        this.packageType = packageType;
        this.price = price;
    }

    public Package() {
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
