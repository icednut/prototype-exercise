package io.icednut.designpattern.common;

import java.util.Optional;

public class Wall implements MapSite {

    @Override
    public void enter() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Wall> clone() {
        try {
            return Optional.of((Wall) super.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
