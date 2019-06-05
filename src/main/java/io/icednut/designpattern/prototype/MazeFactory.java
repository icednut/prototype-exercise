package io.icednut.designpattern.prototype;

import io.icednut.designpattern.common.Door;
import io.icednut.designpattern.common.Maze;
import io.icednut.designpattern.common.Room;
import io.icednut.designpattern.common.Wall;

public interface MazeFactory {

    Maze makeMaze();

    Room makeRoom(int roomId);

    Wall makeWall();

    Door makeDoor(Room prevRoom, Room nextRoom);
}
