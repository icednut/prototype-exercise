package io.icednut.designpattern.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Maze implements Cloneable {

    private Map<Integer, Room> rooms = new HashMap<>();

    public void addRoom(Room room) {
        rooms.put(room.getRoomId(), room);
    }

    public Room roomNo(int roomId) {
        return rooms.get(roomId);
    }

    @Override
    public Optional<Maze> clone() {
        try {
            return Optional.of((Maze) super.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
