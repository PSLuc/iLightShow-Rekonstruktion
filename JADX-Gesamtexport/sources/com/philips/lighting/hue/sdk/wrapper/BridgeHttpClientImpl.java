package com.philips.lighting.hue.sdk.wrapper;

import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class BridgeHttpClientImpl implements BridgeHttpClient {
    private Bridge bridge;

    public class HttpResponseCallbackInternal {
        BridgeHttpClient.HttpResponseCallback cb;

        public HttpResponseCallbackInternal(BridgeHttpClient.HttpResponseCallback httpResponseCallback) {
            this.cb = httpResponseCallback;
        }

        public void onBridgeError(int i) {
            this.cb.onBridgeError(ReturnCode.fromValue(i));
        }

        public void onFinished(@Nonnull String str, int i) {
            this.cb.onFinished(new BridgeHttpClient.HttpResponse(str, i));
        }
    }

    public BridgeHttpClientImpl(Bridge bridge) {
        this.bridge = bridge;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.BridgeHttpClient
    public final void doDelete(@Nonnull String str, @Nonnull BridgeConnectionType bridgeConnectionType, @Nullable BridgeHttpClient.HttpResponseCallback httpResponseCallback) {
        doDeleteNative(str, bridgeConnectionType.getValue(), new HttpResponseCallbackInternal(httpResponseCallback));
    }

    public native void doDeleteNative(@Nonnull String str, int i, HttpResponseCallbackInternal httpResponseCallbackInternal);

    @Override // com.philips.lighting.hue.sdk.wrapper.BridgeHttpClient
    public final void doGet(@Nonnull String str, @Nonnull BridgeConnectionType bridgeConnectionType, @Nullable BridgeHttpClient.HttpResponseCallback httpResponseCallback) {
        doGetNative(str, bridgeConnectionType.getValue(), new HttpResponseCallbackInternal(httpResponseCallback));
    }

    public native void doGetNative(@Nonnull String str, int i, @Nullable HttpResponseCallbackInternal httpResponseCallbackInternal);

    @Override // com.philips.lighting.hue.sdk.wrapper.BridgeHttpClient
    public final void doPost(@Nonnull String str, @Nonnull String str2, @Nonnull BridgeConnectionType bridgeConnectionType, @Nullable BridgeHttpClient.HttpResponseCallback httpResponseCallback) {
        doPostNative(str, str2, bridgeConnectionType.getValue(), new HttpResponseCallbackInternal(httpResponseCallback));
    }

    public native void doPostNative(@Nonnull String str, @Nonnull String str2, int i, HttpResponseCallbackInternal httpResponseCallbackInternal);

    @Override // com.philips.lighting.hue.sdk.wrapper.BridgeHttpClient
    public final void doPut(@Nonnull String str, @Nonnull String str2, @Nonnull BridgeConnectionType bridgeConnectionType, @Nullable BridgeHttpClient.HttpResponseCallback httpResponseCallback) {
        doPutNative(str, str2, bridgeConnectionType.getValue(), new HttpResponseCallbackInternal(httpResponseCallback));
    }

    public native void doPutNative(@Nonnull String str, @Nonnull String str2, int i, HttpResponseCallbackInternal httpResponseCallbackInternal);
}
