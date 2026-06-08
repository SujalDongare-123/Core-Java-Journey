package service;

import exception.RoomNotAvailableException;

public interface HotelService {
    void bookRoom(int roomId, String customerName) throws RoomNotAvailableException;
}
