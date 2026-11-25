package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0480c0;
import com.spotify.sdk.android.auth.AuthorizationClient;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f8248a;
    private static final a5.g descriptor;

    static {
        E e6 = new E();
        f8248a = e6;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.LegacyPalette", e6, 3);
        c0480c0.m(AuthorizationClient.PlayStoreParams.ID, true);
        c0480c0.m("name", true);
        c0480c0.m("colors", true);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        Y4.a aVar = LegacyPalette.$childSerializers[2];
        c5.p0 p0Var = c5.p0.f7477a;
        return new Y4.a[]{p0Var, p0Var, aVar};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        Y4.a[] aVarArr = LegacyPalette.$childSerializers;
        int i = 0;
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
            } else {
                if (iK != 2) {
                    throw new UnknownFieldException(iK);
                }
                list = (List) aVarA.B(gVar, 2, aVarArr[2], list);
                i |= 4;
            }
        }
        aVarA.b(gVar);
        return new LegacyPalette(i, strM, strM2, list, (c5.k0) null);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        LegacyPalette legacyPalette = (LegacyPalette) obj;
        E4.k.f("value", legacyPalette);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        LegacyPalette.write$Self$app_release(legacyPalette, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
