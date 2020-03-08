package com.worldofcustomers.beta.customer;

import java.util.UUID;

public class Customer {

    private final UUID customerId;
    private final String companyName;
    private final String country;
    private final String city;
    private final String street;
    private final String streetNumber;
    private final String zipCode;
    private final String lat;
    private final String lng;
    private final Owner owner;


    enum Owner{
        PAWEL, WOJTEK, BARTEK
    }

    public Customer(UUID customerId, String companyName, String country, String city, String street, String streetNumber, String zipCode, String lat, String lng, Owner owner) {
        this.customerId = customerId;
        this.companyName = companyName;
        this.country = country;
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.lat = lat;
        this.lng = lng;
        this.owner = owner;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public Owner getOwner() {
        return owner;
    }
}
