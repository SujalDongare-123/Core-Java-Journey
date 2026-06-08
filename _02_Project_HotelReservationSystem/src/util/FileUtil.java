package util;

import model.Booking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    // Save bookings to file
    public static void saveBookings(List<Booking> bookings) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bookings.dat"))) {
            oos.writeObject(bookings);
        } catch (Exception e) {
            System.out.println("Error saving bookings: " + e.getMessage());
        }
    }

    // Load bookings from file
    public static List<Booking> loadBookings() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bookings.dat"))) {
            return (List<Booking>) ois.readObject();
        } catch (Exception e) {
            // file not found or first run
            return new ArrayList<>();
        }
    }
}
