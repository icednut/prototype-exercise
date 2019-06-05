package io.icednut.designpattern;

import io.icednut.designpattern.common.*;
import io.icednut.designpattern.prototype.FactoryMazeGame;
import io.icednut.designpattern.prototype.MazePrototypeFactory;
import io.icednut.designpattern.simple.*;

public class App {

    public static void main(String[] args) {
        MazeGame simpleMazeGame = new SimpleMazeGame();
        Maze maze1 = simpleMazeGame.createMaze();

        MazeGame.WithFactory factoryMazeGame1 = new FactoryMazeGame();
        Maze mazeWithFactory1 = factoryMazeGame1.createMaze(new MazePrototypeFactory(new Maze(), new Room(), new Wall(), new Door()));

        MazeGame.WithFactory factoryMazeGame2 = new FactoryMazeGame();
        Maze mazeWithFactory2 = factoryMazeGame2.createMaze(new MazePrototypeFactory(new Maze(), new Room(), new BombedWall(), new Door()));
    }
}
