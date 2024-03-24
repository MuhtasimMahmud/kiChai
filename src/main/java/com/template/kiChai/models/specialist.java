package com.template.kiChai.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class specialist {

    @Id
    int specialistID;
    String firstName;
    String lastName;
    String phone;
    String email;
    String city;
    int postCode;
    String profilePic;
    String emergency;

    public specialist(int specialistID, String firstName, String lastName, String phone, String email, String city, int postCode, String profilePic, String emergency) {
        this.specialistID = specialistID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.city = city;
        this.postCode = postCode;
        this.profilePic = profilePic;
        this.emergency = emergency;
    }

    public int getSpecialistID() {
        return specialistID;
    }

    public void setSpecialistID(int specialistID) {
        this.specialistID = specialistID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getEmergency() {
        return emergency;
    }

    public void setEmergency(String emergency) {
        this.emergency = emergency;
    }
}
