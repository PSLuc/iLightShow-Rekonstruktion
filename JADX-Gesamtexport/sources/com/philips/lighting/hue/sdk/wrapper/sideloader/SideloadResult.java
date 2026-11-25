package com.philips.lighting.hue.sdk.wrapper.sideloader;

/* JADX INFO: loaded from: classes.dex */
public enum SideloadResult {
    SUCCESS,
    INVALID_BRIDGE,
    INVALID_BRIDGE_CONFIGURATION,
    WEBSERVICE_REQUEST_ERROR,
    FIRMWARE_DOWNLOAD_ERROR,
    FIRMWARE_SIDELOAD_ERROR,
    BRIDGE_REBOOT_TIMEOUT,
    BRIDGE_NOT_CONNECTED,
    INVALID_PRE_DOWNLOADED_FIRMWARE
}
