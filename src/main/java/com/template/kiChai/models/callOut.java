package com.template.kiChai.models;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class callOut {

    @Id
    int jobID;
    int consumerID;
    int specialistID;

    String city;
    int postCode;
    String emergency;

    public callOut(){
        //Default Constructor
    }

    public callOut(int jobID, int consumerID, int specialistID, String city, int postCode, String emergency) {
        this.jobID = jobID;
        this.consumerID = consumerID;
        this.specialistID = specialistID;
        this.city = city;
        this.postCode = postCode;
        this.emergency = emergency;
    }

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public int getConsumerID() {
        return consumerID;
    }

    public void setConsumerID(int consumerID) {
        this.consumerID = consumerID;
    }

    public int getSpecialistID() {
        return specialistID;
    }

    public void setSpecialistID(int specialistID) {
        this.specialistID = specialistID;
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

    public String getEmergency() {
        return emergency;
    }

    public void setEmergency(String emergency) {
        this.emergency = emergency;
    }
}
