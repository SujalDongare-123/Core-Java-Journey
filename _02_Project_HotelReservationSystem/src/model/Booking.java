package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Booking implements Serializable {

    private int bookingId;
    private Room room;
    private Customer customer;
    private LocalDate date;

    public Booking(int bookingId, Room room, Customer customer) {
        this.bookingId = bookingId;
        this.room = room;
        this.customer = customer;
        this.date = LocalDate.now();
    }

    // ADD THIS METHOD
    public Room getRoom() {
        return room;
    }

    public int getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "BookingId=" + bookingId +
               ", Customer=" + customer.getName() +
               ", Room=" + room.getType() +
               ", Date=" + date;
    }
}
