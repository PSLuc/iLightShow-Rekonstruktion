package p037g2;

import T1.i;
import com.fasterxml.jackson.databind.DatabindException;
import java.util.BitSet;
import p015c2.A;
import p015c2.f;
import p015c2.g;
import p032f2.r;
import p046i2.AbstractC0771g;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f9171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f9172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f9173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f9174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BitSet f9177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y f9178h;
    public Object i;

    public z(i iVar, f fVar, int i, r rVar) {
        this.f9171a = iVar;
        this.f9172b = fVar;
        this.f9175e = i;
        this.f9173c = rVar;
        this.f9174d = new Object[i];
        if (i < 32) {
            this.f9177g = null;
        } else {
            this.f9177g = new BitSet();
        }
    }

    public final Object a(r rVar) throws DatabindException {
        Object objO = rVar.o();
        f fVar = this.f9172b;
        if (objO != null) {
            fVar.g0(rVar.o());
            throw null;
        }
        boolean zD = rVar.d();
        A a6 = rVar.f8933j;
        if (zD) {
            fVar.I0(rVar, "Missing required creator property '%s' (index %d)", a6.f7195h, Integer.valueOf(rVar.n()));
            throw null;
        }
        if (fVar.B0(g.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
            fVar.I0(rVar, "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled", a6.f7195h, Integer.valueOf(rVar.n()));
            throw null;
        }
        try {
            Object absentValue = rVar.f8937n.getAbsentValue(fVar);
            return absentValue != null ? absentValue : rVar.r().getAbsentValue(fVar);
        } catch (DatabindException e6) {
            AbstractC0771g abstractC0771gE = rVar.e();
            if (abstractC0771gE != null) {
                e6.e(a6.f7195h, abstractC0771gE.n());
            }
            throw e6;
        }
    }

    public final boolean b(r rVar, Object obj) {
        int iN = rVar.n();
        this.f9174d[iN] = obj;
        BitSet bitSet = this.f9177g;
        if (bitSet == null) {
            int i = this.f9176f;
            int i3 = (1 << iN) | i;
            if (i != i3) {
                this.f9176f = i3;
                int i6 = this.f9175e - 1;
                this.f9175e = i6;
                if (i6 <= 0) {
                    return this.f9173c == null || this.i != null;
                }
            }
        } else if (!bitSet.get(iN)) {
            bitSet.set(iN);
            this.f9175e--;
        }
        return false;
    }

    public final void c(r rVar, Object obj) {
        this.f9178h = new x(this.f9178h, obj, rVar, 1);
    }

    public final boolean d(String str) {
        r rVar = this.f9173c;
        if (rVar == null || !str.equals(rVar.i.f7195h)) {
            return false;
        }
        this.i = rVar.f9160k.deserialize(this.f9171a, this.f9172b);
        return true;
    }
}
