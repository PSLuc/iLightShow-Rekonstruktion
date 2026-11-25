package com.nanjoran.ilightshow.Services;

import P4.InterfaceC0335w;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0666e extends p122w4.i implements D4.e {
    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new C0666e(2, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        C0666e c0666e = (C0666e) b((InterfaceC0335w) obj, (p111u4.d) obj2);
        p084p4.x xVar = p084p4.x.f10867a;
        c0666e.o(xVar);
        return xVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    @Override // p122w4.a
    public final Object o(Object obj) {
        Long l6;
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        synchronized (C0674i.f8409q) {
            int i = C0674i.f8410r;
            if (i > 0) {
                C0674i.f8410r = i - 1;
            }
        }
        if (C0674i.f8411s) {
            C0674i c0674i = C0674i.f8401h;
            C0674i.h();
        } else {
            C0674i c0674i2 = C0674i.f8401h;
            if (!C0674i.f8404l && (l6 = C0674i.f8407o) != null) {
                if ((l6 != null ? System.currentTimeMillis() - l6.longValue() : 0L) >= 600000) {
                    C0674i c0674i3 = C0674i.f8401h;
                    C0674i.h();
                }
            }
            C0674i.d();
        }
        return p084p4.x.f10867a;
    }
}
