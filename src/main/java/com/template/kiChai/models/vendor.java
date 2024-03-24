package com.template.kiChai.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class vendor {

    @Id
    int vendorID;
    String companyName;
    String phone;
    String email;
    String city;
    int postCode;
    String logo;
    String emergency;


    public vendor(){
        //Default Constructor
    }

    public vendor(int vendorID, String companyName, String phone, String email, String city, int postCode, String logo, String emergency) {
        this.vendorID = vendorID;
        this.companyName = companyName;
        this.phone = phone;
        this.email = email;
        this.city = city;
        this.postCode = postCode;
        this.logo = logo;
        this.emergency = emergency;
    }

    public String getEmergency() {
        return emergency;
    }

    public void setEmergency(String emergency) {
        this.emergency = emergency;
    }

    public int getVendorID() {
        return vendorID;
    }

    public void setVendorID(int vendorID) {
        this.vendorID = vendorID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }


}
