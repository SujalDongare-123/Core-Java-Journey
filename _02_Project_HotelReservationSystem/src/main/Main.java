package main;
import model.Room;
import model.Customer;
import model.Booking;
import service.*;
import singleton.HotelRepository;
import exception.RoomNotAvailableException;
import util.IdGenerator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HotelRepository repo = HotelRepository.getInstance();

        // Add default rooms (only if not exist)
        if(repo.getRoom(1) == null) repo.addRoom(new Room(1, "Deluxe"));
        if(repo.getRoom(2) == null) repo.addRoom(new Room(2, "Suite"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Are you Admin or User? (admin/user)");
        String role = sc.nextLine().toLowerCase();

        if (role.equals("admin")) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (repo.validateAdmin(username, password)) {
                System.out.println("Welcome Admin!");
                System.out.println("1. View all bookings\n2. Add Room");
                int choice = sc.nextInt(); sc.nextLine();

                if (choice == 1) {
                    if(repo.getBookings().isEmpty()){
                        System.out.println("No bookings found.");
                    } else {
                        repo.getBookings().forEach(System.out::println);
                    }
                } else if(choice == 2) {
                    System.out.print("Enter Room ID: ");
                    int roomId = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Room Type: ");
                    String type = sc.nextLine();
                    repo.addRoom(new Room(roomId, type));
                    System.out.println("Room added successfully!");
                }

            } else {
                System.out.println("Invalid admin credentials!");
            }

        } else if (role.equals("user")) {
            HotelService service = new HotelService() {
                @Override
                public synchronized void bookRoom(int roomId, String name) throws RoomNotAvailableException {
                    Room room = repo.getRoom(roomId);
                    if(room == null || !room.isAvailable()){
                        throw new RoomNotAvailableException("Room already booked!");
                    }
                    room.book();
                    Customer customer = new Customer(IdGenerator.generateId(), name);
                    Booking booking = new Booking(IdGenerator.generateId(), room, customer);
                    repo.addBooking(booking);
                    System.out.println("SUCCESS: " + booking);
                }
            };

            System.out.println("Available Rooms:");
            repo.getRoom(1).isAvailable();
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.print("Enter Room ID to book: ");
            int roomId = sc.nextInt();

            Thread t = new Thread(new BookingTask(service, roomId, name));
            t.start();
        }
    }
}
