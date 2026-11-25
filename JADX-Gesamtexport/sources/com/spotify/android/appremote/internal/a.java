package com.spotify.android.appremote.internal;

import com.spotify.protocol.client.CallResult;
import com.spotify.protocol.client.ErrorCallback;
import com.spotify.protocol.types.Image;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements CallResult.ResultCallback, ErrorCallback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ CallResult f8547h;

    public /* synthetic */ a(CallResult callResult) {
        this.f8547h = callResult;
    }

    @Override // com.spotify.protocol.client.ErrorCallback
    public void onError(Throwable th) {
        this.f8547h.deliverError(th);
    }

    @Override // com.spotify.protocol.client.CallResult.ResultCallback
    public void onResult(Object obj) {
        ImagesApiImpl.lambda$getImage$0(this.f8547h, (Image) obj);
    }
}
