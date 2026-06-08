package singleton;

import model.*;
import util.FileUtil;

import java.util.*;

public class HotelRepository {

    private static HotelRepository instance;

    private Map<Integer, Room> rooms = new HashMap<>();
    private List<Booking> bookings;
    private Admin admin;

    private HotelRepository() {
        admin = new Admin("admin", "admin123");

        // Load existing bookings from file
        bookings = FileUtil.loadBookings();

        // Mark booked rooms as unavailable
        for (Booking b : bookings) {
            Room room = b.getRoom();
            room.book();
            rooms.put(room.getRoomId(), room);
        }
    }

    public static HotelRepository getInstance() {
        if (instance == null) {
            instance = new HotelRepository();
        }
        return instance;
    }

    public boolean validateAdmin(String username, String password) {
        return admin.getUsername().equals(username) && admin.getPassword().equals(password);
    }

    public void addRoom(Room room) {
        rooms.put(room.getRoomId(), room);
    }

    public Room getRoom(int id) {
        return rooms.get(id);
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
        FileUtil.saveBookings(bookings); // save after each booking
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
