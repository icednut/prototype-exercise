package io.icednut.designpattern.common;

import java.util.Optional;

public class BombedWall extends Wall {

    private boolean bomb;

    public BombedWall() {
        this.bomb = true;
    }

    @Override
    public void enter() {
        System.out.println("Boooooooooooooooooooom!");
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Wall> clone() {
        return Optional.of(new BombedWall());
    }
}
