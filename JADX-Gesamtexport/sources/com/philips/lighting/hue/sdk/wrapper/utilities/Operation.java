package com.philips.lighting.hue.sdk.wrapper.utilities;

/* JADX INFO: loaded from: classes.dex */
public interface Operation {
    void cancel();

    boolean isCancelable();

    void waitFinished();
}
