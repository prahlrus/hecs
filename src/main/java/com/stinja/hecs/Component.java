package com.stinja.hecs;

public abstract class Component {
    public final int eid;

    protected Component(int eid) {
        this.eid = eid;
    }

    public void tick() {
    }
}
