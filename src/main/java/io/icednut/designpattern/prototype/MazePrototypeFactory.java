package io.icednut.designpattern.prototype;

import io.icednut.designpattern.common.Door;
import io.icednut.designpattern.common.Maze;
import io.icednut.designpattern.common.Room;
import io.icednut.designpattern.common.Wall;

public class MazePrototypeFactory implements MazeFactory {

    private Maze prototypeMaze;
    private Room prototypeRoom;
    private Wall prototypeWall;
    private Door prototypeDoor;

    public MazePrototypeFactory(Maze prototypeMaze, Room prototypeRoom, Wall prototypeWall, Door prototypeDoor) {
        this.prototypeMaze = prototypeMaze;
        this.prototypeRoom = prototypeRoom;
        this.prototypeWall = prototypeWall;
        this.prototypeDoor = prototypeDoor;
    }

    @Override
    public Maze makeMaze() {
        return prototypeMaze.clone().orElseThrow(() -> new RuntimeException("Maze를 clone할 수 없습니다."));
    }

    @Override
    public Room makeRoom(int roomId) {
        Room room = prototypeRoom.clone().orElseThrow(() -> new RuntimeException("Room을 clone할 수 없습니다."));

        room.initialize(roomId);
        return room;
    }

    @Override
    public Wall makeWall() {
        return prototypeWall.clone().orElseThrow(() -> new RuntimeException("Wall을 clone할 수 없습니다."));
    }

    @Override
    public Door makeDoor(Room prevRoom, Room nextRoom) {
        Door door = prototypeDoor.clone().orElseThrow(() -> new RuntimeException("Door를 clone할 수 없습니다."));

        door.initialize(prevRoom, nextRoom);
        return door;
    }
}
