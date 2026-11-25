package com.nanjoran.ilightshow.Services.lights.hue;

import D4.f;
import E4.k;
import E4.w;
import F2.c;
import com.nanjoran.ilightshow.Services.lights.hue.huestream.HueJsonGroup;
import com.spotify.sdk.android.auth.LoginActivity;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;
import p084p4.x;
import p126x2.z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8430h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f8431j;

    public /* synthetic */ a(w wVar, Object obj, int i) {
        this.f8430h = i;
        this.f8431j = wVar;
        this.i = obj;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        p126x2.w wVar = (p126x2.w) obj;
        z zVar = (z) obj2;
        c cVar = (c) obj3;
        switch (this.f8430h) {
            case 0:
                return DeviceHueBridge.signin$lambda$6$lambda$5((DeviceHueBridge) this.i, this.f8431j, wVar, zVar, cVar);
            case 1:
                return DeviceHueBridge.signin$lambda$6((DeviceHueBridge) this.i, this.f8431j, wVar, zVar, cVar);
            case 2:
                return DeviceHueBridge.signin$lambda$6$lambda$5$lambda$4(this.f8431j, (DeviceHueBridge) this.i, wVar, zVar, cVar);
            default:
                w wVar2 = this.f8431j;
                Semaphore semaphore = (Semaphore) this.i;
                k.f("<unused var>", wVar);
                k.f(LoginActivity.RESPONSE_KEY, zVar);
                k.f("groupsResult", cVar);
                HashMap map = (HashMap) cVar.a();
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        ((HueJsonGroup) entry.getValue()).setId((String) entry.getKey());
                    }
                    Collection collectionValues = map.values();
                    k.e("<get-values>(...)", collectionValues);
                    wVar2.f1074h = collectionValues.toArray(new HueJsonGroup[0]);
                }
                semaphore.release();
                return x.f10867a;
        }
    }

    public /* synthetic */ a(DeviceHueBridge deviceHueBridge, w wVar, int i) {
        this.f8430h = i;
        this.i = deviceHueBridge;
        this.f8431j = wVar;
    }
}
