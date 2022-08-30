package com.poc.modules.customer.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    private String cpfOrCnpj;
    private String name;
    private String costumerType;
    private String telephone;
    private String mainAddress;
    private String email;

    public Customer(String cpfOrCnpj,
                    String name,
                    String costumerType,
                    String telephone,
                    String mainAddress,
                    String email) {
        this.cpfOrCnpj = cpfOrCnpj;
        this.name = name;
        this.costumerType = costumerType;
        this.telephone = telephone;
        this.mainAddress = mainAddress;
        this.email = email;
    }

    public Customer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCostumerType() {
        return costumerType;
    }

    public void setCostumerType(String costumerType) {
        this.costumerType = costumerType;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMainAddress() {
        return mainAddress;
    }

    public void setMainAddress(String mainAddress) {
        this.mainAddress = mainAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpfOrCnpj() {
        return cpfOrCnpj;
    }

    public void setCpfOrCnpj(String cpfOrCnpj) {
        this.cpfOrCnpj = cpfOrCnpj;
    }
}
