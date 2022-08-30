package com.poc.modules.address.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    private String addressCode;
    private Boolean mainAddressFlag;
    private String streetAndNumber;
    private String additionalInfo;
    private String zipCode;
    private String city;
    private String state;

    public Address() {
    }

    public Address(String addressCode,
                   Boolean mainAddressFlag,
                   String streetAndNumber,
                   String additionalInfo,
                   String zipCode,
                   String city,
                   String state) {
        this.addressCode = addressCode;
        this.mainAddressFlag = mainAddressFlag;
        this.streetAndNumber = streetAndNumber;
        this.additionalInfo = additionalInfo;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }

    public String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public Boolean getMainAddressFlag() {
        return mainAddressFlag;
    }

    public void setMainAddressFlag(Boolean mainAddressFlag) {
        this.mainAddressFlag = mainAddressFlag;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
