package com.philips.lighting.hue.sdk.wrapper.domain.resource;

/* JADX INFO: loaded from: classes.dex */
public enum GroupType {
    UNKNOWN(-1),
    LIGHT_GROUP(0),
    LIGHT_SOURCE(1),
    LUMINAIRE(2),
    ROOM(3),
    ENTERTAINMENT(4),
    ZONE(5);

    private int value;

    GroupType(int i) {
        this.value = i;
    }

    public static GroupType fromValue(int i) {
        for (GroupType groupType : values()) {
            if (groupType.getValue() == i) {
                return groupType;
            }
        }
        return UNKNOWN;
    }

    public int getValue() {
        return this.value;
    }
}
