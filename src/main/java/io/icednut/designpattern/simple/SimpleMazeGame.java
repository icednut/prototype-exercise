package io.icednut.designpattern.simple;

import io.icednut.designpattern.common.*;

public class SimpleMazeGame implements MazeGame {

    @Override
    public Maze createMaze() {
        Maze maze = new Maze();
        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Door theDoor = new Door(room1, room2);

        room1.setSide(Direction.NORTH, new Wall());
        room1.setSide(Direction.EAST, theDoor);
        room1.setSide(Direction.SOUTH, new Wall());
        room1.setSide(Direction.WEST, new Wall());

        room2.setSide(Direction.NORTH, new Wall());
        room2.setSide(Direction.EAST, new Wall());
        room2.setSide(Direction.SOUTH, new Wall());
        room2.setSide(Direction.WEST, theDoor);
        maze.addRoom(room1);
        maze.addRoom(room2);
        return maze;
    }
}
