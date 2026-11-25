package com.philips.lighting.hue.sdk.wrapper.domain.clip;

/* JADX INFO: loaded from: classes.dex */
public enum SceneType {
    NO_VALUE(-1),
    LIGHT(1),
    GROUP(2);

    private int value;

    SceneType(int i) {
        this.value = i;
    }

    public static SceneType fromValue(int i) {
        for (SceneType sceneType : values()) {
            if (sceneType.getValue() == i) {
                return sceneType;
            }
        }
        return NO_VALUE;
    }

    public int getValue() {
        return this.value;
    }
}
