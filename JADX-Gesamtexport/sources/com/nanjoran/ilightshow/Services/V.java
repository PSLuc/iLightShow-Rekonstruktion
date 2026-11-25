package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0480c0;
import com.spotify.sdk.android.auth.AuthorizationClient;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V f8374a;
    private static final a5.g descriptor;

    static {
        V v6 = new V();
        f8374a = v6;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.Palette", v6, 4);
        c0480c0.m(AuthorizationClient.PlayStoreParams.ID, true);
        c0480c0.m("name", true);
        c0480c0.m("displayOrder", true);
        c0480c0.m("colors", false);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        Y4.a aVar = Palette.$childSerializers[3];
        c5.p0 p0Var = c5.p0.f7477a;
        return new Y4.a[]{p0Var, p0Var, c5.J.f7400a, aVar};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        Y4.a[] aVarArr = Palette.$childSerializers;
        int i = 0;
        int iN = 0;
        String strM = null;
        String strM2 = null;
        List list = null;
        boolean z5 = true;
        while (z5) {
            int iK = aVarA.k(gVar);
            if (iK == -1) {
                z5 = false;
            } else if (iK == 0) {
                strM = aVarA.m(gVar, 0);
                i |= 1;
            } else if (iK == 1) {
                strM2 = aVarA.m(gVar, 1);
                i |= 2;
            } else if (iK == 2) {
                iN = aVarA.n(gVar, 2);
                i |= 4;
            } else {
                if (iK != 3) {
                    throw new UnknownFieldException(iK);
                }
                list = (List) aVarA.B(gVar, 3, aVarArr[3], list);
                i |= 8;
            }
        }
        aVarA.b(gVar);
        return new Palette(i, strM, strM2, iN, list, (c5.k0) null);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        Palette palette = (Palette) obj;
        E4.k.f("value", palette);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        Palette.write$Self$app_release(palette, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
