package com.philips.lighting.hue.sdk.wrapper.knowledgebase;

/* JADX INFO: loaded from: classes.dex */
public enum KnowledgeBaseType {
    UNKNOWN(-1),
    LIGHTS(0),
    IMAGES(1),
    MANUFACTURERS(2);

    private int value;

    KnowledgeBaseType(int i) {
        this.value = i;
    }

    public static KnowledgeBaseType fromValue(int i) {
        for (KnowledgeBaseType knowledgeBaseType : values()) {
            if (knowledgeBaseType.getValue() == i) {
                return knowledgeBaseType;
            }
        }
        return UNKNOWN;
    }

    public int getValue() {
        return this.value;
    }
}
