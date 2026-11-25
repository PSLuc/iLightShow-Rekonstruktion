package com.philips.lighting.hue.sdk.wrapper.domain.resource;

/* JADX INFO: loaded from: classes.dex */
public enum ScheduleStatus {
    UNKNOWN(-1),
    NONE(0),
    ENABLED(1),
    DISABLED(2),
    ERROR(3);

    private int value;

    ScheduleStatus(int i) {
        this.value = i;
    }

    public static ScheduleStatus fromValue(int i) {
        for (ScheduleStatus scheduleStatus : values()) {
            if (scheduleStatus.getValue() == i) {
                return scheduleStatus;
            }
        }
        return UNKNOWN;
    }

    public int getValue() {
        return this.value;
    }
}
