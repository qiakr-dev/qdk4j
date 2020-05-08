package com.yiguo.qiakr.open.qdk4j.response.store;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * www.qiakr.com
 * Copyright (c) 2014-2020 All Rights Reserved.
 *
 * @author yhzdys
 */
public final class GetSupplierStoreResp implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Byte storeType;
    private Byte open;
    private String extCode;
    private String logo;
    private String picture;
    private String province;
    private String city;
    private String district;
    private String address;
    private BigDecimal longitude;
    private BigDecimal latitude;

    public Long getId() {
        return id;
    }

    public GetSupplierStoreResp setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetSupplierStoreResp setName(String name) {
        this.name = name;
        return this;
    }

    public Byte getStoreType() {
        return storeType;
    }

    public GetSupplierStoreResp setStoreType(Byte storeType) {
        this.storeType = storeType;
        return this;
    }

    public Byte getOpen() {
        return open;
    }

    public GetSupplierStoreResp setOpen(Byte open) {
        this.open = open;
        return this;
    }

    public String getExtCode() {
        return extCode;
    }

    public GetSupplierStoreResp setExtCode(String extCode) {
        this.extCode = extCode;
        return this;
    }

    public String getLogo() {
        return logo;
    }

    public GetSupplierStoreResp setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public String getPicture() {
        return picture;
    }

    public GetSupplierStoreResp setPicture(String picture) {
        this.picture = picture;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public GetSupplierStoreResp setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getCity() {
        return city;
    }

    public GetSupplierStoreResp setCity(String city) {
        this.city = city;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public GetSupplierStoreResp setDistrict(String district) {
        this.district = district;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public GetSupplierStoreResp setAddress(String address) {
        this.address = address;
        return this;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public GetSupplierStoreResp setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
        return this;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public GetSupplierStoreResp setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
        return this;
    }
}
