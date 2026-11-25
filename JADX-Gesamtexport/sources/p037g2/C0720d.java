package p037g2;

import B.C0031p0;
import p015c2.A;
import p015c2.B;
import p046i2.C0776l;
import p046i2.m;
import p046i2.t;

/* JADX INFO: renamed from: g2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0720d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f9121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f9122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0031p0[] f9124d;

    public C0720d(B b6, m mVar, C0031p0[] c0031p0Arr, int i) {
        this.f9121a = b6;
        this.f9122b = mVar;
        this.f9124d = c0031p0Arr;
        this.f9123c = i;
    }

    public static C0720d a(B b6, m mVar, t[] tVarArr) {
        int iY = mVar.y();
        C0031p0[] c0031p0Arr = new C0031p0[iY];
        for (int i = 0; i < iY; i++) {
            C0776l c0776lX = mVar.x(i);
            c0031p0Arr[i] = new C0031p0(c0776lX, tVarArr == null ? null : tVarArr[i], b6.p(c0776lX), 22);
        }
        return new C0720d(b6, mVar, c0031p0Arr, iY);
    }

    public final A b(int i) {
        this.f9121a.o((C0776l) this.f9124d[i].i);
        return null;
    }

    public final A c(int i) {
        t tVar = (t) this.f9124d[i].f394j;
        if (tVar != null) {
            return tVar.a();
        }
        return null;
    }

    public final t d(int i) {
        return (t) this.f9124d[i].f394j;
    }

    public final String toString() {
        return this.f9122b.toString();
    }
}
