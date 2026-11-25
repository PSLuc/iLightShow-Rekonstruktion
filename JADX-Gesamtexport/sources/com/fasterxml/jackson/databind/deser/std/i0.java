package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p046i2.C0772h;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p109u2.m f7601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0772h f7602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p109u2.m f7603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Enum f7604n;

    public i0(p109u2.m mVar, C0772h c0772h) {
        super(-1, mVar.f12703h, null);
        this.f7601k = mVar;
        this.f7602l = c0772h;
        this.f7604n = mVar.f12705k;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.l0
    public final Object b(p015c2.f fVar, String str) throws InvalidFormatException {
        p109u2.m mVarC;
        C0772h c0772h = this.f7602l;
        if (c0772h != null) {
            try {
                return c0772h.w(str);
            } catch (Exception e6) {
                Throwable thQ = p109u2.i.q(e6);
                String message = thQ.getMessage();
                p109u2.i.E(thQ);
                p109u2.i.C(thQ);
                throw new IllegalArgumentException(message, thQ);
            }
        }
        if (fVar.B0(p015c2.g.READ_ENUMS_USING_TO_STRING)) {
            mVarC = this.f7603m;
            if (mVarC == null) {
                synchronized (this) {
                    mVarC = p109u2.m.c(fVar.f7249l, this.f7601k.f12703h);
                    this.f7603m = mVarC;
                }
            }
        } else {
            mVarC = this.f7601k;
        }
        HashMap map = mVarC.f12704j;
        Enum r6 = (Enum) map.get(str);
        if (r6 == null && mVarC.f12706l) {
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    r6 = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (str.equalsIgnoreCase((String) entry.getKey())) {
                    r6 = (Enum) entry.getValue();
                    break;
                }
            }
        }
        if (r6 == null) {
            if (this.f7604n != null && fVar.B0(p015c2.g.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return this.f7604n;
            }
            if (!fVar.B0(p015c2.g.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                fVar.u0(this.i, str, "not one of the values accepted for Enum class: %s", mVarC.f12704j.keySet());
                throw null;
            }
        }
        return r6;
    }
}
