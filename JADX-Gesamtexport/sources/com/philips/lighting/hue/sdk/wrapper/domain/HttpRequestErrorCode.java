package com.philips.lighting.hue.sdk.wrapper.domain;

/* JADX INFO: loaded from: classes.dex */
public enum HttpRequestErrorCode {
    NO_VALUE(-1),
    SUCCESS(0),
    UNDEFINED(1),
    CANCELED(2),
    CANNOT_RESOLVE_HOST(3),
    CANNOT_CONNECT(4),
    TIMEOUT(5),
    SERVER_RESET(6),
    INVALID_CERTIFICATE(7),
    GATEWAY_TIMEOUT(8);

    private int value;

    HttpRequestErrorCode(int i) {
        this.value = i;
    }

    public static HttpRequestErrorCode fromValue(int i) {
        for (HttpRequestErrorCode httpRequestErrorCode : values()) {
            if (httpRequestErrorCode.getValue() == i) {
                return httpRequestErrorCode;
            }
        }
        return NO_VALUE;
    }

    public int getValue() {
        return this.value;
    }
}
