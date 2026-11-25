package com.philips.lighting.hue.sdk.wrapper.connection;

/* JADX INFO: loaded from: classes.dex */
public enum QueueType {
    FIFO(0),
    SMART(1);

    private int value;

    QueueType(int i) {
        this.value = i;
    }

    public static QueueType fromValue(int i) {
        for (QueueType queueType : values()) {
            if (queueType.getValue() == i) {
                return queueType;
            }
        }
        return FIFO;
    }

    public int getValue() {
        return this.value;
    }
}
