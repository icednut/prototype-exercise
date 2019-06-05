package io.icednut.designpattern.common;

import io.icednut.designpattern.prototype.MazeFactory;

public interface MazeGame {

    Maze createMaze();

    interface WithFactory {

        Maze createMaze(MazeFactory mazeFactory);
    }
}
