
package com.lewistms.bookingserviceformicroservice.controller;

import com.lewistms.bookingserviceformicroservice.entity.BookingEntity;
import com.lewistms.bookingserviceformicroservice.service.BookingService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @QueryMapping
    public List<BookingEntity> bookings() {
        return bookingService.getAllBookings();
    }

    @QueryMapping
    public Optional<BookingEntity> bookingById(@Argument Long id) {
        return bookingService.getBookingById(id);
    }
}
