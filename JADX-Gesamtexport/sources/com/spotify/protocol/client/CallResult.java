package com.spotify.protocol.client;

import com.spotify.protocol.types.Types;

/* JADX INFO: loaded from: classes.dex */
public class CallResult<T> extends PendingResultBase<T> {
    private final Types.RequestId mRequestId;
    private ResultCallback<T> mResultCallback;

    public interface ResultCallback<T> {
        void onResult(T t6);
    }

    public CallResult(Types.RequestId requestId) {
        this.mRequestId = requestId;
    }

    public Types.RequestId getRequestId() {
        return this.mRequestId;
    }

    @Override // com.spotify.protocol.client.PendingResultBase
    public void onResultDelivered() {
        ResultCallback<T> resultCallback;
        if (isCanceled() || (resultCallback = this.mResultCallback) == null) {
            return;
        }
        resultCallback.onResult(this.mRecentResult.getData());
    }

    public CallResult<T> setResultCallback(ResultCallback<T> resultCallback) {
        this.mResultCallback = resultCallback;
        if (this.mRecentResult != null && this.mRecentResult.isSuccessful()) {
            onResultDelivered();
        }
        return this;
    }
}
