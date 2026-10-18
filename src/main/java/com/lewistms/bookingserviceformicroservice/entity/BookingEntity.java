package com.lewistms.bookingserviceformicroservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reference;
    private String customer;
    private String status;

    public BookingEntity() {
    }

    public BookingEntity(String reference, String customer, String status) {
        this.reference = reference;
        this.customer = customer;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getReference() {
        return reference;
    }

    public String getCustomer() {
        return customer;
    }

    public String getStatus() {
        return status;
    }
}