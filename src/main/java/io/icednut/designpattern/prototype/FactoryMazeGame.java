package io.icednut.designpattern.prototype;

import io.icednut.designpattern.common.Direction;
import io.icednut.designpattern.common.Maze;
import io.icednut.designpattern.common.MazeGame;
import io.icednut.designpattern.common.Room;

public class FactoryMazeGame implements MazeGame.WithFactory {

    public Maze createMaze(MazeFactory mazeFactory) {
        Maze maze = mazeFactory.makeMaze();
        Room room1 = mazeFactory.makeRoom(1);
        Room room2 = mazeFactory.makeRoom(1);

        room1.setSide(Direction.NORTH, mazeFactory.makeWall());
        room1.setSide(Direction.EAST, mazeFactory.makeWall());
        room1.setSide(Direction.SOUTH, mazeFactory.makeDoor(room1, room2));
        room1.setSide(Direction.WEST, mazeFactory.makeWall());

        room2.setSide(Direction.NORTH, mazeFactory.makeWall());
        room2.setSide(Direction.EAST, mazeFactory.makeDoor(room1, room2));
        room2.setSide(Direction.SOUTH, mazeFactory.makeWall());
        room2.setSide(Direction.WEST, mazeFactory.makeWall());
        maze.addRoom(room1);
        maze.addRoom(room2);
        return maze;
    }
}
