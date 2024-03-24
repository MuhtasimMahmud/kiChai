package com.template.kiChai.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class rating {

    @Id
    int jobID;
    int userID;
    int specialistID;

    public rating(){
        //Default Constructor
    }

    public rating(int jobID, int userID, int specialistID) {
        this.jobID = jobID;
        this.userID = userID;
        this.specialistID = specialistID;
    }

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getSpecialistID() {
        return specialistID;
    }

    public void setSpecialistID(int specialistID) {
        this.specialistID = specialistID;
    }
}
