package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0480c0;
import c5.C0485f;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P f8356a;
    private static final a5.g descriptor;

    static {
        P p6 = new P();
        f8356a = p6;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.News", p6, 4);
        c0480c0.m("news_id", false);
        c0480c0.m("url", false);
        c0480c0.m("blocking", false);
        c0480c0.m("temporary", false);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        C0485f c0485f = C0485f.f7447a;
        return new Y4.a[]{c5.J.f7400a, c5.p0.f7477a, c0485f, c0485f};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        int i = 0;
        int iN = 0;
        boolean zU = false;
        boolean zU2 = false;
        String strM = null;
        boolean z5 = true;
        while (z5) {
            int iK = aVarA.k(gVar);
            if (iK == -1) {
                z5 = false;
            } else if (iK == 0) {
                iN = aVarA.n(gVar, 0);
                i |= 1;
            } else if (iK == 1) {
                strM = aVarA.m(gVar, 1);
                i |= 2;
            } else if (iK == 2) {
                zU = aVarA.u(gVar, 2);
                i |= 4;
            } else {
                if (iK != 3) {
                    throw new UnknownFieldException(iK);
                }
                zU2 = aVarA.u(gVar, 3);
                i |= 8;
            }
        }
        aVarA.b(gVar);
        return new News(i, iN, strM, zU, zU2, null);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        News news = (News) obj;
        E4.k.f("value", news);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        News.write$Self$app_release(news, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
