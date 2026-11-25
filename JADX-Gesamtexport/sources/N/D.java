package N;

import B.C0017i0;
import B.C0031p0;
import X.AbstractC0391h;

/* JADX INFO: loaded from: classes.dex */
public final class D extends X.C implements V0 {
    public final D4.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C f3563j = new C();

    public D(D4.a aVar) {
        this.i = aVar;
    }

    @Override // X.B
    public final X.D c() {
        return this.f3563j;
    }

    @Override // N.V0
    public final Object getValue() {
        D4.c cVarF = X.o.k().f();
        if (cVarF != null) {
            cVarF.invoke(this);
        }
        AbstractC0391h abstractC0391hK = X.o.k();
        return h((C) X.o.j(this.f3563j, abstractC0391hK), abstractC0391hK, true, this.i).f3560f;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x009d A[EDGE_INSN: B:110:0x009d->B:33:0x009d BREAK  A[LOOP:1: B:18:0x004a->B:32:0x009a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x009a A[Catch: all -> 0x0039, LOOP:1: B:18:0x004a->B:32:0x009a, LOOP_END, TryCatch #2 {all -> 0x0039, blocks: (B:10:0x0024, B:12:0x0030, B:15:0x003c, B:18:0x004a, B:20:0x005a, B:22:0x0066, B:24:0x0070, B:26:0x0088, B:28:0x008e, B:32:0x009a, B:33:0x009d), top: B:103:0x0024 }] */
    public final C h(C c6, AbstractC0391h abstractC0391h, boolean z5, D4.a aVar) {
        AbstractC0391h abstractC0391hK;
        X.D dM;
        C c7;
        V.c cVar;
        int i;
        if (!c6.c(this, abstractC0391h)) {
            p080p.v vVar = new p080p.v();
            C0031p0 c0031p0 = M0.f3630a;
            V.c cVar2 = (V.c) c0031p0.get();
            if (cVar2 == null) {
                cVar2 = new V.c();
                c0031p0.s(cVar2);
            }
            int i3 = cVar2.f5393a;
            P.d dVarB = C0208d.B();
            int i6 = dVarB.f4583j;
            if (i6 > 0) {
                Object[] objArr = dVarB.f4582h;
                int i7 = 0;
                do {
                    ((C0228n) objArr[i7]).b();
                    i7++;
                } while (i7 < i6);
            }
            try {
                cVar2.f5393a = i3 + 1;
                Object objF = X.t.f(aVar, new C0017i0(this, cVar2, vVar, i3, 4));
                cVar2.f5393a = i3;
                int i8 = dVarB.f4583j;
                if (i8 > 0) {
                    Object[] objArr2 = dVarB.f4582h;
                    int i9 = 0;
                    do {
                        ((C0228n) objArr2[i9]).a();
                        i9++;
                    } while (i9 < i8);
                }
                Object obj = X.o.f5709b;
                synchronized (obj) {
                    abstractC0391hK = X.o.k();
                    C c8 = this.f3563j;
                    synchronized (obj) {
                        dM = X.o.m(c8, this);
                        dM.a(c8);
                        dM.f5650a = abstractC0391hK.d();
                    }
                    cVar = (V.c) M0.f3630a.get();
                    if (cVar != null || cVar.f5393a != 0) {
                        return c7;
                    }
                    X.o.k().m();
                    synchronized (obj) {
                        AbstractC0391h abstractC0391hK2 = X.o.k();
                        c7.f3557c = abstractC0391hK2.d();
                        c7.f3558d = abstractC0391hK2.h();
                    }
                    return c7;
                }
                c7 = (C) dM;
                c7.f3559e = vVar;
                c7.f3561g = c7.d(this, abstractC0391hK);
                c7.f3560f = objF;
                cVar = (V.c) M0.f3630a.get();
                if (cVar != null) {
                }
                return c7;
            } catch (Throwable th) {
                int i10 = dVarB.f4583j;
                if (i10 > 0) {
                    Object[] objArr3 = dVarB.f4582h;
                    int i11 = 0;
                    do {
                        ((C0228n) objArr3[i11]).a();
                        i11++;
                    } while (i11 < i10);
                }
                throw th;
            }
        }
        if (z5) {
            P.d dVarB2 = C0208d.B();
            int i12 = dVarB2.f4583j;
            if (i12 > 0) {
                Object[] objArr4 = dVarB2.f4582h;
                int i13 = 0;
                do {
                    ((C0228n) objArr4[i13]).b();
                    i13++;
                } while (i13 < i12);
            }
            try {
                p080p.v vVar2 = c6.f3559e;
                C0031p0 c0031p1 = M0.f3630a;
                V.c cVar3 = (V.c) c0031p1.get();
                if (cVar3 == null) {
                    cVar3 = new V.c();
                    c0031p1.s(cVar3);
                }
                int i14 = cVar3.f5393a;
                Object[] objArr5 = vVar2.f10789b;
                int[] iArr = vVar2.f10790c;
                long[] jArr = vVar2.f10788a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j4 = jArr[i15];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i15 != length) {
                                break;
                                break;
                            }
                            i15++;
                        } else {
                            int i16 = 8;
                            int i17 = 8 - ((~(i15 - length)) >>> 31);
                            int i18 = 0;
                            while (i18 < i17) {
                                if ((j4 & 255) < 128) {
                                    int i19 = (i15 << 3) + i18;
                                    X.B b6 = (X.B) objArr5[i19];
                                    i = i16;
                                    cVar3.f5393a = i14 + iArr[i19];
                                    D4.c cVarF = abstractC0391h.f();
                                    if (cVarF != null) {
                                        cVarF.invoke(b6);
                                    }
                                } else {
                                    i = i16;
                                }
                                j4 >>= i;
                                i18++;
                                i16 = i;
                            }
                            if (i17 != i16) {
                                break;
                            }
                            if (i15 != length) {
                                break;
                            }
                            i15++;
                        }
                    }
                }
                cVar3.f5393a = i14;
                int i20 = dVarB2.f4583j;
                if (i20 > 0) {
                    Object[] objArr6 = dVarB2.f4582h;
                    int i21 = 0;
                    do {
                        ((C0228n) objArr6[i21]).a();
                        i21++;
                    } while (i21 < i20);
                }
            } catch (Throwable th2) {
                int i22 = dVarB2.f4583j;
                if (i22 > 0) {
                    Object[] objArr7 = dVarB2.f4582h;
                    int i23 = 0;
                    do {
                        ((C0228n) objArr7[i23]).a();
                        i23++;
                    } while (i23 < i22);
                }
                throw th2;
            }
        }
        return c6;
    }

    @Override // X.B
    public final void i(X.D d6) {
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>", d6);
        this.f3563j = (C) d6;
    }

    public final C j() {
        AbstractC0391h abstractC0391hK = X.o.k();
        return h((C) X.o.j(this.f3563j, abstractC0391hK), abstractC0391hK, false, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        C c6 = (C) X.o.i(this.f3563j);
        sb.append(c6.c(this, X.o.k()) ? String.valueOf(c6.f3560f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
