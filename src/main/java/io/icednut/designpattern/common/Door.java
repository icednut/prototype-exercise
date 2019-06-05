package io.icednut.designpattern.common;

import java.util.Optional;

public class Door implements MapSite {

    private Room room1;
    private Room room2;
    private boolean isOpen;

    public Door() {
    }

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
        // 문을 초기화하기 위해서는 문이 어느 방 사이에 있는지 알아야 합니다.
    }

    @Override
    public void enter() {
        // do something
    }

    @Override
    public Optional<Door> clone() {
        try {
            return Optional.of((Door) super.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public void initialize(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }
}
