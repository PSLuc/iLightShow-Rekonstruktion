package com.philips.lighting.hue.sdk.wrapper.domain;

/* JADX INFO: loaded from: classes.dex */
public class PortalConnectionError extends HttpError {
    private Error error;

    public enum Error {
        UNKNOWN(0),
        NOT_ALLOWED(1),
        BAD_REQUEST(2),
        LOGIN_REQUIRED(3),
        INVALID_REQUEST(4),
        INVALID_CLIENT(5),
        AUTHORIZATION_CODE_EXPIRED(6),
        RATE_LIMIT_QUOTA_VIOLATION(7),
        ACCESS_TOKEN_MISSING(8),
        ACCESS_TOKEN_BAD(9),
        ACCESS_TOKEN_EXPIRED(10),
        ACCESS_TOKEN_BRIDGE_MISMATCH(11);

        private int value;

        Error(int i) {
            this.value = i;
        }

        public static Error fromValue(int i) {
            for (Error error : values()) {
                if (error.getValue() == i) {
                    return error;
                }
            }
            return UNKNOWN;
        }

        public int getValue() {
            return this.value;
        }
    }

    public PortalConnectionError(int i, String str, int i3) {
        super(i, str);
        this.error = Error.fromValue(i3);
    }

    public Error getError() {
        return this.error;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.HttpError, com.philips.lighting.hue.sdk.wrapper.domain.HueError
    public String toString() {
        return "Remote Connection Error: " + this.error + " (code " + getCode() + "), " + (getMessage() != null ? getMessage() : "<unknown>");
    }
}
