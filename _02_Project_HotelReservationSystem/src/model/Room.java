package model;

import java.io.Serializable;

public class Room implements Serializable {
    private int roomId;
    private String type;
    private boolean available;

    public Room(int roomId, String type) {
        this.roomId = roomId;
        this.type = type;
        this.available = true;
    }

    public int getRoomId() {
        return roomId;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void book() {
        this.available = false;
    }
}
