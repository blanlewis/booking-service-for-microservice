package com.lewistms.bookingserviceformicroservice.repository;

import com.lewistms.bookingserviceformicroservice.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository
        extends JpaRepository<BookingEntity, Long> {
}