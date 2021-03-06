package lk.lakshan.booking.bookingservice.service;

import lk.lakshan.booking.bookingservice.model.DetailResponse;
import lk.lakshan.booking.model.booking.Booking;

import java.util.List;

public interface BookingService {
    Booking save(Booking booking);

    Booking findById(int id);

    List<Booking> findAll();

    DetailResponse findDetailResponse(int id);
}
