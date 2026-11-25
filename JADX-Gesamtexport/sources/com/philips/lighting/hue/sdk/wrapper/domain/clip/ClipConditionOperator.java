package com.philips.lighting.hue.sdk.wrapper.domain.clip;

/* JADX INFO: loaded from: classes.dex */
public enum ClipConditionOperator {
    UNKNOWN(-1),
    NONE(0),
    EQ(1),
    GT(2),
    LT(3),
    DX(4),
    DDX(5),
    STABLE(6),
    NOT_STABLE(7),
    IN(8),
    NOT_IN(9);

    private int value;

    ClipConditionOperator(int i) {
        this.value = i;
    }

    public static ClipConditionOperator fromValue(int i) {
        for (ClipConditionOperator clipConditionOperator : values()) {
            if (clipConditionOperator.getValue() == i) {
                return clipConditionOperator;
            }
        }
        return UNKNOWN;
    }

    public int getValue() {
        return this.value;
    }
}
