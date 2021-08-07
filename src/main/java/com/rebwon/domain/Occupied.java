package com.rebwon.domain;

public final class Occupied extends AbstractSeatState {

    @Override
    public boolean isAvaiable() {
        return false;
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public boolean previous() {
        return false;
    }
}
