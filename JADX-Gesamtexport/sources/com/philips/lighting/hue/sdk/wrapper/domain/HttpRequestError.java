package com.philips.lighting.hue.sdk.wrapper.domain;

/* JADX INFO: loaded from: classes.dex */
public class HttpRequestError extends HueError {
    private HttpRequestErrorCode code;
    private String message;

    private HttpRequestError(int i, String str) {
        this.code = HttpRequestErrorCode.fromValue(i);
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
        HttpRequestError httpRequestError = (HttpRequestError) obj;
        if (this.code != httpRequestError.code) {
            return false;
        }
        String str = this.message;
        if (str == null) {
            if (httpRequestError.message != null) {
                return false;
            }
        } else if (!str.equals(httpRequestError.message)) {
            return false;
        }
        return true;
    }

    public HttpRequestErrorCode getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.HueError
    public int hashCode() {
        HttpRequestErrorCode httpRequestErrorCode = this.code;
        int iHashCode = ((httpRequestErrorCode == null ? 0 : httpRequestErrorCode.hashCode()) + 31) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.HueError
    public String toString() {
        return "Http Request Error: code " + this.code + ", " + (this.message != null ? getMessage() : "<unknown>");
    }
}
