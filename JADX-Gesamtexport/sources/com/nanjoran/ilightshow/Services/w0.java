package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0480c0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.spotify.protocol.types.MotionState;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0 implements c5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f8493a;
    private static final a5.g descriptor;

    static {
        w0 w0Var = new w0();
        f8493a = w0Var;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.SharedPaletteStorageDocument", w0Var, 6);
        c0480c0.m("schema", true);
        c0480c0.m("schemaVersion", true);
        c0480c0.m("localStoreRevision", true);
        c0480c0.m("updatedAt", true);
        c0480c0.m("defaultColorSource", true);
        c0480c0.m("palettes", true);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        Y4.a[] aVarArr = SharedPaletteStorageDocument.$childSerializers;
        c5.p0 p0Var = c5.p0.f7477a;
        return new Y4.a[]{p0Var, c5.J.f7400a, AbstractC0599v0.B(p0Var), AbstractC0599v0.B(p0Var), Z.f8376a, aVarArr[5]};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        Y4.a[] aVarArr = SharedPaletteStorageDocument.$childSerializers;
        int i = 0;
        int iN = 0;
        String strM = null;
        String str = null;
        String str2 = null;
        PaletteColorSource paletteColorSource = null;
        List list = null;
        boolean z5 = true;
        while (z5) {
            int iK = aVarA.k(gVar);
            switch (iK) {
                case MotionState.UNKNOWN /* -1 */:
                    z5 = false;
                    break;
                case 0:
                    strM = aVarA.m(gVar, 0);
                    i |= 1;
                    break;
                case 1:
                    iN = aVarA.n(gVar, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) aVarA.j(gVar, 2, c5.p0.f7477a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) aVarA.j(gVar, 3, c5.p0.f7477a, str2);
                    i |= 8;
                    break;
                case 4:
                    paletteColorSource = (PaletteColorSource) aVarA.B(gVar, 4, Z.f8376a, paletteColorSource);
                    i |= 16;
                    break;
                case 5:
                    list = (List) aVarA.B(gVar, 5, aVarArr[5], list);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iK);
            }
        }
        aVarA.b(gVar);
        return new SharedPaletteStorageDocument(i, strM, iN, str, str2, paletteColorSource, list, (c5.k0) null);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        SharedPaletteStorageDocument sharedPaletteStorageDocument = (SharedPaletteStorageDocument) obj;
        E4.k.f("value", sharedPaletteStorageDocument);
        a5.g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        SharedPaletteStorageDocument.write$Self$app_release(sharedPaletteStorageDocument, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}
