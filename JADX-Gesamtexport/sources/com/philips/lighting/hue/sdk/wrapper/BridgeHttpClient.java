package com.philips.lighting.hue.sdk.wrapper;

import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface BridgeHttpClient {

    public static class HttpResponse {
        String body;
        int responseCode;

        public HttpResponse(String str, int i) {
            this.body = str;
            this.responseCode = i;
        }

        public String getBody() {
            return this.body;
        }

        public int getResponseCode() {
            return this.responseCode;
        }
    }

    public interface HttpResponseCallback {
        void onBridgeError(@Nonnull ReturnCode returnCode);

        void onFinished(@Nonnull HttpResponse httpResponse);
    }

    void doDelete(@Nonnull String str, @Nonnull BridgeConnectionType bridgeConnectionType, @Nullable HttpResponseCallback httpResponseCallback);

    void doGet(@Nonnull String str, @Nonnull BridgeConnectionType bridgeConnectionType, @Nullable HttpResponseCallback httpResponseCallback);

    void doPost(@Nonnull String str, @Nonnull String str2, @Nonnull BridgeConnectionType bridgeConnectionType, @Nullable HttpResponseCallback httpResponseCallback);

    void doPut(@Nonnull String str, @Nonnull String str2, @Nonnull BridgeConnectionType bridgeConnectionType, @Nullable HttpResponseCallback httpResponseCallback);
}
