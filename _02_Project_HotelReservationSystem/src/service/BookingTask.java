package service;

public class BookingTask implements Runnable {

    private HotelService service;
    private int roomId;
    private String customer;

    public BookingTask(HotelService service, int roomId, String customer) {
        this.service = service;
        this.roomId = roomId;
        this.customer = customer;
    }

    @Override
    public void run() {
        try {
            service.bookRoom(roomId, customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

