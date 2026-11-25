package X;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: X.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0388e extends C0387d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0387d f5679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5680p;

    public C0388e(int i, m mVar, D4.c cVar, D4.c cVar2, C0387d c0387d) {
        super(i, mVar, cVar, cVar2);
        this.f5679o = c0387d;
        c0387d.k();
    }

    @Override // X.C0387d, X.AbstractC0391h
    public final void c() {
        if (this.f5687c) {
            return;
        }
        super.c();
        if (this.f5680p) {
            return;
        }
        this.f5680p = true;
        this.f5679o.l();
    }

    @Override // X.C0387d
    public final t v() {
        C0387d c0387d = this.f5679o;
        if (c0387d.f5678m || c0387d.f5687c) {
            return new i(this);
        }
        p080p.A a6 = this.f5674h;
        int i = this.f5686b;
        HashMap mapC = a6 != null ? o.c(c0387d, this, c0387d.e()) : null;
        Object obj = o.f5709b;
        synchronized (obj) {
            try {
                o.d(this);
                if (a6 == null || a6.f10711d == 0) {
                    a();
                } else {
                    t tVarY = y(this.f5679o.d(), mapC, this.f5679o.e());
                    if (!tVarY.equals(j.f5690c)) {
                        return tVarY;
                    }
                    p080p.A aW = this.f5679o.w();
                    if (aW != null) {
                        aW.i(a6);
                    } else {
                        this.f5679o.A(a6);
                        this.f5674h = null;
                    }
                }
                if (this.f5679o.d() < i) {
                    this.f5679o.u();
                }
                C0387d c0387d2 = this.f5679o;
                c0387d2.r(c0387d2.e().g(i).c(this.f5675j));
                this.f5679o.z(i);
                C0387d c0387d3 = this.f5679o;
                int i3 = this.f5688d;
                this.f5688d = -1;
                if (i3 >= 0) {
                    int[] iArr = c0387d3.f5676k;
                    E4.k.f("<this>", iArr);
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i3;
                    c0387d3.f5676k = iArrCopyOf;
                } else {
                    c0387d3.getClass();
                }
                C0387d c0387d4 = this.f5679o;
                m mVar = this.f5675j;
                c0387d4.getClass();
                synchronized (obj) {
                    c0387d4.f5675j = c0387d4.f5675j.j(mVar);
                    C0387d c0387d5 = this.f5679o;
                    int[] iArr2 = this.f5676k;
                    c0387d5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = c0387d5.f5676k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            E4.k.c(iArrCopyOf2);
                            iArr2 = iArrCopyOf2;
                        }
                        c0387d5.f5676k = iArr2;
                    }
                }
                this.f5678m = true;
                if (!this.f5680p) {
                    this.f5680p = true;
                    this.f5679o.l();
                }
                return j.f5690c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
