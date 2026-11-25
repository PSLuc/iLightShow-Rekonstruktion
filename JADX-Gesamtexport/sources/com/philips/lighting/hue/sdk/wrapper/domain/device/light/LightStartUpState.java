package com.philips.lighting.hue.sdk.wrapper.domain.device.light;

/* JADX INFO: loaded from: classes.dex */
public interface LightStartUpState {
    CustomStartUpSettings getCustomSettings();

    StartUpMode getMode();

    Boolean isConfigured();

    void setCustomSettings(CustomStartUpSettings customStartUpSettings);

    void setMode(StartUpMode startUpMode);
}
