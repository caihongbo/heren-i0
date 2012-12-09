package com.heren.his.domain;

import static com.google.common.base.Preconditions.checkState;

public class ClinicRegister {
    private int scheduled;

    private ClinicRegister() {
    }

    public ClinicRegister(int scheduled) {
        this.scheduled = scheduled;
    }

    public long getId() {
        return hashCode();
    }

    public int getScheduled() {
        return scheduled;
    }

    public void register() {
        checkState(scheduled > 0, "running out of register");
        scheduled--;
    }
}
