package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

/* JADX INFO: loaded from: classes.dex */
public enum TimePatternType {
    UNKNOWN(-1),
    ABSOLUTE_TIME(0),
    TRUNCATED_TIME(1),
    RANDOMIZED_TIME(2),
    RECURRING_TIME(3),
    RECURRING_RANDOMIZED_TIME(4),
    TIME_INTERVAL(5),
    RECURRING_TIME_INTERVAL(6),
    DAY_INTERVAL(7),
    TIMER(8),
    RANDOMIZED_TIMER(9),
    RECURRING_TIMER(10),
    RECURRING_RANDOMIZED_TIMER(11);

    private int value;

    TimePatternType(int i) {
        this.value = i;
    }

    public static TimePatternType fromValue(int i) {
        for (TimePatternType timePatternType : values()) {
            if (timePatternType.getValue() == i) {
                return timePatternType;
            }
        }
        return UNKNOWN;
    }

    public int getValue() {
        return this.value;
    }
}
