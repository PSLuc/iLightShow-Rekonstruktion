package com.philips.lighting.hue.sdk.wrapper.domain;

/* JADX INFO: loaded from: classes.dex */
public class HttpError extends HueError {
    private int code;
    private String message;

    public HttpError(int i, String str) {
        this.code = i;
        this.message = str;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.HueError
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpError httpError = (HttpError) obj;
        if (this.code != httpError.code) {
            return false;
        }
        String str = this.message;
        if (str == null) {
            if (httpError.message != null) {
                return false;
            }
        } else if (!str.equals(httpError.message)) {
            return false;
        }
        return true;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.HueError
    public int hashCode() {
        int i = (this.code + 31) * 31;
        String str = this.message;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.HueError
    public String toString() {
        return "Http Error: code " + this.code + ", " + (this.message != null ? getMessage() : "<unknown>");
    }
}
