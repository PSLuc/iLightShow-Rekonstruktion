package N;

import X.AbstractC0391h;

/* JADX INFO: loaded from: classes.dex */
public final class C extends X.D {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f3556h = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p080p.v f3559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3561g;

    public C() {
        p080p.v vVar = p080p.B.f10713a;
        E4.k.d("null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>", vVar);
        this.f3559e = vVar;
        this.f3560f = f3556h;
    }

    @Override // X.D
    public final void a(X.D d6) {
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>", d6);
        C c6 = (C) d6;
        this.f3559e = c6.f3559e;
        this.f3560f = c6.f3560f;
        this.f3561g = c6.f3561g;
    }

    @Override // X.D
    public final X.D b() {
        return new C();
    }

    public final boolean c(D d6, AbstractC0391h abstractC0391h) {
        boolean z5;
        boolean z6;
        Object obj = X.o.f5709b;
        synchronized (obj) {
            z5 = true;
            z6 = (this.f3557c == abstractC0391h.d() && this.f3558d == abstractC0391h.h()) ? false : true;
        }
        if (this.f3560f == f3556h || (z6 && this.f3561g != d(d6, abstractC0391h))) {
            z5 = false;
        }
        if (!z5 || !z6) {
            return z5;
        }
        synchronized (obj) {
            this.f3557c = abstractC0391h.d();
            this.f3558d = abstractC0391h.h();
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    public final int d(D d6, AbstractC0391h abstractC0391h) throws Throwable {
        p080p.v vVar;
        int iIdentityHashCode;
        int i;
        Object[] objArr;
        int i3;
        int i6;
        int i7;
        int i8;
        X.D dJ;
        synchronized (X.o.f5709b) {
            vVar = this.f3559e;
        }
        int i9 = 7;
        if (vVar.f10792e == 0) {
            return 7;
        }
        P.d dVarB = C0208d.B();
        int i10 = dVarB.f4583j;
        int i11 = 1;
        int i12 = 0;
        if (i10 > 0) {
            Object[] objArr2 = dVarB.f4582h;
            int i13 = 0;
            do {
                ((C0228n) objArr2[i13]).b();
                i13++;
            } while (i13 < i10);
        }
        try {
            Object[] objArr3 = vVar.f10789b;
            int[] iArr = vVar.f10790c;
            long[] jArr = vVar.f10788a;
            int length = jArr.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i14 = 0;
                while (true) {
                    long j4 = jArr[i14];
                    if ((((~j4) << i9) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8;
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j4 & 255) < 128) {
                                int i18 = (i14 << 3) + i17;
                                i7 = i9;
                                i8 = i15;
                                X.B b6 = (X.B) objArr3[i18];
                                if (iArr[i18] != i11) {
                                    i11 = i11;
                                } else {
                                    if (b6 instanceof D) {
                                        D d7 = (D) b6;
                                        try {
                                            dJ = d7.h((C) X.o.j(d7.f3563j, abstractC0391h), abstractC0391h, false, d7.i);
                                        } catch (Throwable th) {
                                            th = th;
                                            int i19 = dVarB.f4583j;
                                            if (i19 > 0) {
                                                Object[] objArr4 = dVarB.f4582h;
                                                do {
                                                    ((C0228n) objArr4[i12]).a();
                                                    i12++;
                                                } while (i12 < i19);
                                            }
                                            throw th;
                                        }
                                    } else {
                                        dJ = X.o.j(b6.c(), abstractC0391h);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(dJ)) * 31) + dJ.f5650a;
                                }
                            } else {
                                i7 = i9;
                                i11 = i11;
                                i8 = i15;
                            }
                            j4 >>= i8;
                            i17++;
                            i9 = i7;
                            i15 = i8;
                            i11 = i11;
                        }
                        i3 = i9;
                        i6 = i11;
                        if (i16 != i15) {
                            break;
                        }
                    } else {
                        i3 = i9;
                        i6 = i11;
                    }
                    if (i14 != length) {
                        i14++;
                        i9 = i3;
                        i11 = i6;
                    } else {
                        i9 = iIdentityHashCode;
                    }
                }
                i = dVarB.f4583j;
                if (i > 0) {
                    objArr = dVarB.f4582h;
                    do {
                        ((C0228n) objArr[i12]).a();
                        i12++;
                    } while (i12 < i);
                }
                return iIdentityHashCode;
            }
            iIdentityHashCode = i9;
            i = dVarB.f4583j;
            if (i > 0) {
                objArr = dVarB.f4582h;
                do {
                    ((C0228n) objArr[i12]).a();
                    i12++;
                } while (i12 < i);
            }
            return iIdentityHashCode;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
