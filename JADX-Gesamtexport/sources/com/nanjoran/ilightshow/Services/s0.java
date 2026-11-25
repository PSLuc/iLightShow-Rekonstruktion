package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0480c0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f8480a;
    private static final a5.g descriptor;

    static {
        s0 s0Var = new s0();
        f8480a = s0Var;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.SharedAppPresetDocumentV1", s0Var, 5);
        c0480c0.m("schema", true);
        c0480c0.m("schemaVersion", true);
        c0480c0.m("localStoreRevision", true);
        c0480c0.m("updatedAt", false);
        c0480c0.m("presets", false);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        Y4.a[] aVarArr = SharedAppPresetDocumentV1.$childSerializers;
        c5.p0 p0Var = c5.p0.f7477a;
        return new Y4.a[]{p0Var, c5.J.f7400a, AbstractC0599v0.B(p0Var), p0Var, aVarArr[4]};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        Y4.a[] aVarArr = SharedAppPresetDocumentV1.$childSerializers;
        int i = 0;
        int iN = 0;
        String strM = null;
        String str = null;
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
                iN = aVarA.n(gVar, 1);
                i |= 2;
            } else if (iK == 2) {
                str = (String) aVarA.j(gVar, 2, c5.p0.f7477a, str);
                i |= 4;
            } else if (iK == 3) {
                strM2 = aVarA.m(gVar, 3);
                i |= 8;
            } else {
                if (iK != 4) {
                    throw new UnknownFieldException(iK);
                }
                list = (List) aVarA.B(gVar, 4, aVarArr[4], list);
                i |= 16;
            }
        }
        aVarA.b(gVar);
        return new SharedAppPresetDocumentV1(i, strM, iN, str, strM2, list, (c5.k0) null);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        SharedAppPresetDocumentV1 sharedAppPresetDocumentV1 = (SharedAppPresetDocumentV1) obj;
        E4.k.f("value", sharedAppPresetDocumentV1);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        SharedAppPresetDocumentV1.write$Self$app_release(sharedAppPresetDocumentV1, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
