package com.rebwon.domain;

public abstract class AbstractSeatState implements SeatState {

    private SeatState nextSeatState;
    private SeatState previousSeatState;
}
