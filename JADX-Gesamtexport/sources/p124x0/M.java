package p124x0;

import B.C0024m;
import D4.c;
import E4.k;
import java.util.Map;
import p027e3.a;
import p080p.u;
import p113v0.C;
import p113v0.C1029l;
import p113v0.G;
import p113v0.H;
import p113v0.InterfaceC1033p;
import p113v0.N;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class M extends N implements H, S {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C f13936p = new C(0, this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public u f13937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u f13938r;

    public static void y0(Y y2) {
        E e6;
        Y y6 = y2.f13990t;
        D d6 = y6 != null ? y6.f13989s : null;
        D d7 = y2.f13989s;
        if (!k.a(d6, d7)) {
            d7.f13829D.f13923r.f13884A.f();
            return;
        }
        InterfaceC1093a interfaceC1093aR = d7.f13829D.f13923r.r();
        if (interfaceC1093aR == null || (e6 = ((I) interfaceC1093aR).f13884A) == null) {
            return;
        }
        e6.f();
    }

    @Override // p113v0.H
    public final G F(int i, int i3, Map map, c cVar) {
        if ((i & (-16777216)) == 0 && ((-16777216) & i3) == 0) {
            return new K(i, i3, map, cVar, this);
        }
        a.y0("Size(" + i + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // p124x0.S
    public final void O(boolean z5) {
        this.f13933m = z5;
    }

    @Override // p113v0.N
    public final int e0(C1029l c1029l) {
        int iP0;
        if (t0() && (iP0 = p0(c1029l)) != Integer.MIN_VALUE) {
            return iP0 + ((int) (this.f13140l & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract int p0(C1029l c1029l);

    public final void q0(j0 j0Var) {
        long j4;
        int i;
        long j6;
        long j7;
        Object obj;
        Object obj2;
        Object obj3;
        M mW0;
        h0 snapshotObserver;
        Object[] objArr;
        float[] fArr;
        long[] jArr;
        float[] fArr2;
        long[] jArr2;
        int i3;
        long j8;
        long j9;
        int i6;
        int i7;
        int i8;
        if (this.f13935o || j0Var.f14044h.e() == null) {
            return;
        }
        u uVar = this.f13938r;
        if (uVar == null) {
            uVar = new u();
            this.f13938r = uVar;
        }
        u uVar2 = this.f13937q;
        if (uVar2 == null) {
            uVar2 = new u();
            this.f13937q = uVar2;
        }
        Object[] objArr2 = uVar2.f10783b;
        float[] fArr3 = uVar2.f10784c;
        long[] jArr3 = uVar2.f10782a;
        int length = jArr3.length - 2;
        long j10 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            int i10 = 0;
            i = 0;
            j6 = 128;
            while (true) {
                long j11 = jArr3[i10];
                j7 = 255;
                if ((((~j11) << 7) & j11 & j10) != j10) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j11 & 255) < 128) {
                            int i13 = (i10 << 3) + i12;
                            j9 = j10;
                            Object obj4 = objArr2[i13];
                            float f6 = fArr3[i13];
                            int iHashCode = (obj4 != null ? obj4.hashCode() : 0) * (-862048943);
                            int i14 = iHashCode ^ (iHashCode << 16);
                            int i15 = i14 >>> 7;
                            int i16 = i14 & 127;
                            int i17 = uVar.f10785d;
                            int i18 = i15 & i17;
                            int i19 = 0;
                            while (true) {
                                long[] jArr4 = uVar.f10782a;
                                int i20 = i18 >> 3;
                                int i21 = (i18 & 7) << 3;
                                long j12 = jArr4[i20] >>> i21;
                                long j13 = jArr4[i20 + 1] << (64 - i21);
                                fArr2 = fArr3;
                                long j14 = j12 | (j13 & ((-i21) >> 63));
                                j8 = j11;
                                long j15 = i16;
                                long j16 = j14 ^ (j15 * 72340172838076673L);
                                long j17 = (j16 - 72340172838076673L) & (~j16) & j9;
                                while (j17 != 0) {
                                    int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j17) >> 3)) & i17;
                                    jArr2 = jArr3;
                                    if (k.a(uVar.f10783b[iNumberOfTrailingZeros], obj4)) {
                                        i6 = iNumberOfTrailingZeros;
                                        break;
                                    } else {
                                        j17 &= j17 - 1;
                                        jArr3 = jArr2;
                                    }
                                }
                                jArr2 = jArr3;
                                if ((j14 & ((~j14) << 6) & j9) != 0) {
                                    int iB = uVar.b(i15);
                                    if (uVar.f10787f == 0 && ((uVar.f10782a[iB >> 3] >> ((iB & 7) << 3)) & 255) != 254) {
                                        int i22 = uVar.f10785d;
                                        if (i22 <= 8 || Long.compareUnsigned(((long) uVar.f10786e) * 32, ((long) i22) * 25) > 0) {
                                            int iD = p080p.C.d(uVar.f10785d);
                                            long[] jArr5 = uVar.f10782a;
                                            Object[] objArr3 = uVar.f10783b;
                                            float[] fArr4 = uVar.f10784c;
                                            int i23 = uVar.f10785d;
                                            uVar.d(iD);
                                            long[] jArr6 = uVar.f10782a;
                                            Object[] objArr4 = uVar.f10783b;
                                            float[] fArr5 = uVar.f10784c;
                                            int i24 = uVar.f10785d;
                                            int i25 = 0;
                                            while (i25 < i23) {
                                                if (((jArr5[i25 >> 3] >> ((i25 & 7) << 3)) & 255) < 128) {
                                                    Object obj5 = objArr3[i25];
                                                    int iHashCode2 = (obj5 != null ? obj5.hashCode() : 0) * (-862048943);
                                                    int i26 = iHashCode2 ^ (iHashCode2 << 16);
                                                    i7 = i25;
                                                    int iB2 = uVar.b(i26 >>> 7);
                                                    int i27 = iB2 >> 3;
                                                    int i28 = (iB2 & 7) << 3;
                                                    long j18 = (jArr6[i27] & (~(255 << i28))) | (((long) (i26 & 127)) << i28);
                                                    jArr6[i27] = j18;
                                                    jArr6[(((iB2 - 7) & i24) + (i24 & 7)) >> 3] = j18;
                                                    objArr4[iB2] = obj5;
                                                    fArr5[iB2] = fArr4[i7];
                                                } else {
                                                    i7 = i25;
                                                }
                                                i25 = i7 + 1;
                                                jArr5 = jArr5;
                                            }
                                        } else {
                                            long[] jArr7 = uVar.f10782a;
                                            int i29 = uVar.f10785d;
                                            Object[] objArr5 = uVar.f10783b;
                                            float[] fArr6 = uVar.f10784c;
                                            p080p.C.a(jArr7, i29);
                                            int i30 = 0;
                                            int iB3 = -1;
                                            while (i30 != i29) {
                                                int i31 = i30 >> 3;
                                                int i32 = (i30 & 7) << 3;
                                                long j19 = (jArr7[i31] >> i32) & 255;
                                                if (j19 == 128) {
                                                    int i33 = i30;
                                                    i30++;
                                                    iB3 = i33;
                                                } else if (j19 != 254) {
                                                    i30++;
                                                } else {
                                                    Object obj6 = objArr5[i30];
                                                    int iHashCode3 = (obj6 != null ? obj6.hashCode() : 0) * (-862048943);
                                                    int i34 = iHashCode3 ^ (iHashCode3 << 16);
                                                    int i35 = i34 >>> 7;
                                                    int iB4 = uVar.b(i35);
                                                    int i36 = i35 & i29;
                                                    float[] fArr7 = fArr6;
                                                    if (((iB4 - i36) & i29) / 8 == ((i30 - i36) & i29) / 8) {
                                                        jArr7[i31] = (jArr7[i31] & (~(255 << i32))) | (((long) (i34 & 127)) << i32);
                                                        jArr7[jArr7.length - 1] = (jArr7[0] & 72057594037927935L) | Long.MIN_VALUE;
                                                        i30++;
                                                    } else {
                                                        int i37 = i30;
                                                        int i38 = iB4 >> 3;
                                                        long j20 = jArr7[i38];
                                                        int i39 = (iB4 & 7) << 3;
                                                        if (((j20 >> i39) & 255) == 128) {
                                                            jArr7[i38] = (j20 & (~(255 << i39))) | (((long) (i34 & 127)) << i39);
                                                            jArr7[i31] = (jArr7[i31] & (~(255 << i32))) | (128 << i32);
                                                            objArr5[iB4] = objArr5[i37];
                                                            objArr5[i37] = null;
                                                            fArr7[iB4] = fArr7[i37];
                                                            fArr7[i37] = 0.0f;
                                                            iB3 = i37;
                                                            i8 = iB3;
                                                        } else {
                                                            jArr7[i38] = (j20 & (~(255 << i39))) | (((long) (i34 & 127)) << i39);
                                                            if (iB3 == -1) {
                                                                iB3 = p080p.C.b(jArr7, i37 + 1, i29);
                                                            }
                                                            objArr5[iB3] = objArr5[iB4];
                                                            objArr5[iB4] = objArr5[i37];
                                                            objArr5[i37] = objArr5[iB3];
                                                            fArr7[iB3] = fArr7[iB4];
                                                            fArr7[iB4] = fArr7[i37];
                                                            fArr7[i37] = fArr7[iB3];
                                                            i8 = i37 - 1;
                                                        }
                                                        jArr7[jArr7.length - 1] = (jArr7[0] & 72057594037927935L) | Long.MIN_VALUE;
                                                        i30 = i8 + 1;
                                                    }
                                                    fArr6 = fArr7;
                                                }
                                            }
                                            uVar.f10787f = p080p.C.c(uVar.f10785d) - uVar.f10786e;
                                        }
                                        iB = uVar.b(i15);
                                    }
                                    uVar.f10786e++;
                                    int i40 = uVar.f10787f;
                                    long[] jArr8 = uVar.f10782a;
                                    int i41 = iB >> 3;
                                    long j21 = jArr8[i41];
                                    int i42 = (iB & 7) << 3;
                                    uVar.f10787f = i40 - (((j21 >> i42) & 255) != 128 ? 0 : 1);
                                    int i43 = uVar.f10785d;
                                    long j22 = ((~(255 << i42)) & j21) | (j15 << i42);
                                    jArr8[i41] = j22;
                                    jArr8[(((iB - 7) & i43) + (i43 & 7)) >> 3] = j22;
                                    i6 = ~iB;
                                    break;
                                }
                                i19 += 8;
                                i18 = (i18 + i19) & i17;
                                fArr3 = fArr2;
                                j11 = j8;
                                jArr3 = jArr2;
                            }
                            if (i6 < 0) {
                                i6 = ~i6;
                            }
                            uVar.f10783b[i6] = obj4;
                            uVar.f10784c[i6] = f6;
                            i3 = 8;
                        } else {
                            fArr2 = fArr3;
                            jArr2 = jArr3;
                            i3 = i9;
                            j8 = j11;
                            j9 = j10;
                        }
                        j11 = j8 >> i3;
                        i12++;
                        i9 = i3;
                        objArr2 = objArr2;
                        j10 = j9;
                        fArr3 = fArr2;
                        jArr3 = jArr2;
                    }
                    objArr = objArr2;
                    fArr = fArr3;
                    jArr = jArr3;
                    j4 = j10;
                    obj = null;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    objArr = objArr2;
                    fArr = fArr3;
                    jArr = jArr3;
                    j4 = j10;
                    obj = null;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                objArr2 = objArr;
                j10 = j4;
                fArr3 = fArr;
                jArr3 = jArr;
                i9 = 8;
            }
        } else {
            j4 = -9187201950435737472L;
            i = 0;
            j6 = 128;
            j7 = 255;
            obj = null;
        }
        uVar2.a();
        r rVar = u0().f13842p;
        if (rVar != null && (snapshotObserver = rVar.getSnapshotObserver()) != null) {
            snapshotObserver.a(j0Var, C1097e.f14009j, new C0024m(j0Var, 15, this));
        }
        Object[] objArr6 = uVar2.f10783b;
        long[] jArr9 = uVar2.f10782a;
        int length2 = jArr9.length - 2;
        if (length2 >= 0) {
            int i44 = i;
            while (true) {
                long j23 = jArr9[i44];
                if ((((~j23) << 7) & j23 & j4) != j4) {
                    int i45 = 8 - ((~(i44 - length2)) >>> 31);
                    int i46 = i;
                    while (i46 < i45) {
                        if ((j23 & j7) >= j6) {
                            obj3 = obj;
                        } else {
                            if (objArr6[(i44 << 3) + i46] != null) {
                                throw new ClassCastException();
                            }
                            obj3 = obj;
                            if (uVar.c(obj3) < 0 && (mW0 = w0()) != null) {
                                do {
                                    u uVar3 = mW0.f13937q;
                                    if (uVar3 != null && uVar3.c(obj3) >= 0) {
                                        break;
                                    } else {
                                        mW0 = mW0.w0();
                                    }
                                } while (mW0 != null);
                            }
                        }
                        j23 >>= 8;
                        i46++;
                        obj = obj3;
                    }
                    obj2 = obj;
                    if (i45 != 8) {
                        break;
                    }
                } else {
                    obj2 = obj;
                }
                if (i44 == length2) {
                    break;
                }
                i44++;
                obj = obj2;
            }
        }
        uVar.a();
    }

    public abstract M r0();

    @Override // p113v0.InterfaceC1030m
    public boolean s() {
        return false;
    }

    public abstract InterfaceC1033p s0();

    public abstract boolean t0();

    public abstract D u0();

    public abstract G v0();

    public abstract M w0();

    public abstract long x0();

    public abstract void z0();
}
