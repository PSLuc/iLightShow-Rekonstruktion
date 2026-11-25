package com.philips.lighting.hue.sdk.wrapper.domain.resource.rule;

/* JADX INFO: loaded from: classes.dex */
public enum RuleStatus {
    UNKNOWN(-1),
    NONE(0),
    ENABLED(1),
    DISABLED(2),
    LOOP_ERROR(3),
    RESOURCE_DELETED(4),
    ERRORS(5);

    private int value;

    RuleStatus(int i) {
        this.value = i;
    }

    public static RuleStatus fromValue(int i) {
        for (RuleStatus ruleStatus : values()) {
            if (ruleStatus.getValue() == i) {
                return ruleStatus;
            }
        }
        return UNKNOWN;
    }

    public int getValue() {
        return this.value;
    }
}
