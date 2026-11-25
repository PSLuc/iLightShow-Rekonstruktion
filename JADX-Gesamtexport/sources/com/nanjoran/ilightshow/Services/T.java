package com.nanjoran.ilightshow.Services;

import P4.C0319f;
import p005a4.C0402j;

/* JADX INFO: loaded from: classes.dex */
public final class T implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8365h;
    public final /* synthetic */ Object i;

    public /* synthetic */ T(int i, Object obj) {
        this.f8365h = i;
        this.i = obj;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f8365h) {
            case 0:
                Object obj2 = U.f8367b;
                C0319f c0319f = (C0319f) this.i;
                synchronized (obj2) {
                    U.f8373h.remove(c0319f);
                }
                return p084p4.x.f10867a;
            default:
                Byte b6 = (Byte) obj;
                E4.k.f("sequence", b6);
                v5.k kVar = (v5.k) this.i;
                p005a4.G g6 = kVar.f13332l.f13368f;
                v5.a aVar = new v5.a(new v5.b(kVar, b6, 0));
                g6.getClass();
                return new C0402j(g6, aVar, 0);
        }
    }
}
