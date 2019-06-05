package io.icednut.designpattern.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Room implements MapSite {
    private int roomId;
    private Map<Direction, MapSite> sides = new HashMap<>();

    public Room() {
    }

    public Room(int roomId) {
        this.roomId = roomId;
    }

    public void setSide(Direction direction, MapSite side) {
        sides.put(direction, side);
    }

    public MapSite getSite(Direction direction) {
        return sides.get(direction);
    }

    public int getRoomId() {
        return roomId;
    }

    @Override
    public void enter() {
        // do something
    }

    @Override
    public Optional<Room> clone() {
        try {
            return Optional.of((Room) super.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public void initialize(int roomId) {
        this.roomId = roomId;
    }
}
