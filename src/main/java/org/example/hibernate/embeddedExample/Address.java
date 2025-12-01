package org.example.hibernate.embeddedExample;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(name = "User_HOUSE_NO")
    private String houseNo;

    @Column(name = "User_Road")
    private String road;

    @Column(name = "User_PINCODE")
    private Long pinCode;

    @Column(name = "User_CITY")
    private String city;

    @Column(name = "User_State")
    private String state;

    @Column(name = "User_COUNTRY")
    private String country;

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public Long getPinCode() {
        return pinCode;
    }

    public void setPinCode(Long pinCode) {
        this.pinCode = pinCode;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
