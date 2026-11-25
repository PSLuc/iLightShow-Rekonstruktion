package com.nanjoran.ilightshow.Services;

import com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridgeKt;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G0 implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8264a;

    public /* synthetic */ G0(int i) {
        this.f8264a = i;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        switch (this.f8264a) {
            case 0:
                P0 p6 = P0.f8357e;
                return true;
            default:
                return DeviceHueBridgeKt.unsafeFuel$lambda$2$lambda$1(str, sSLSession);
        }
    }
}
