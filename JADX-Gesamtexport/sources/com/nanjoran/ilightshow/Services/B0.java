package com.nanjoran.ilightshow.Services;

import android.os.Handler;
import android.os.Looper;
import com.github.kittinunf.fuel.core.FuelError;
import com.nanjoran.ilightshow.Model.Data.AuthRequest;
import com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridge;
import com.spotify.sdk.android.auth.LoginActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B0 implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8233h;
    public final /* synthetic */ Object i;

    public /* synthetic */ B0(int i, Object obj) {
        this.f8233h = i;
        this.i = obj;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        p126x2.w wVar = (p126x2.w) obj;
        switch (this.f8233h) {
            case 0:
                C0.a((C0) this.i, wVar, (p126x2.z) obj2, (F2.c) obj3);
                return p084p4.x.f10867a;
            case 1:
                p126x2.z zVar = (p126x2.z) obj2;
                F2.c cVar = (F2.c) obj3;
                C0 c6 = (C0) this.i;
                E4.k.f("this$0", c6);
                E4.k.f("<unused var>", wVar);
                E4.k.f(LoginActivity.RESPONSE_KEY, zVar);
                E4.k.f("result", cVar);
                AuthRequest authRequest = (AuthRequest) cVar.a();
                new Handler(Looper.getMainLooper()).post(new L3.a(c6, zVar, (FuelError) cVar.b(), authRequest, 2));
                return p084p4.x.f10867a;
            default:
                return DeviceHueBridge.signup$lambda$2((DeviceHueBridge) this.i, wVar, (p126x2.z) obj2, (F2.c) obj3);
        }
    }
}
