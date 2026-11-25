package com.nanjoran.ilightshow.Services.lights.generic;

import E4.k;
import K3.d;
import java.lang.reflect.Type;
import p105t3.p;
import p105t3.q;
import p105t3.r;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceDeserializer implements q {
    @Override // p105t3.q
    public final Object deserialize(r rVar, Type type, p pVar) {
        k.f("json", rVar);
        k.f("typeOfT", type);
        k.f("context", pVar);
        String strK = ((r) rVar.g().f12592h.get("type")).k();
        if (strK == null) {
            return null;
        }
        d.valueOf(strK);
        return null;
    }
}
