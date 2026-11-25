package androidx.compose.ui.focus;

import B.C0026n;
import B.L0;
import E4.w;
import F.L;
import F1.G;
import N.C0237s;
import P.d;
import Z.n;
import Z.o;
import android.view.KeyEvent;
import e5.f;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import p012c.C;
import p024e0.e;
import p024e0.g;
import p024e0.h;
import p024e0.j;
import p024e0.k;
import p024e0.r;
import p080p.t;
import p081p0.c;
import p096s.AbstractC0916i;
import p124x0.AbstractC1098f;
import p124x0.AbstractC1105m;
import p124x0.D;
import p124x0.InterfaceC1104l;
import p124x0.Q;
import p124x0.n0;
import p130y0.C1143m;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f6698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L0 f6699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f6700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C f6701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1143m f6702e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f6704g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t f6706j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f6703f = new r();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final L f6705h = new L(4);
    public final o i = new FocusPropertiesElement(new k()).k(new Q() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.f6695a.f6703f.hashCode();
        }

        @Override // p124x0.Q
        public final n l() {
            return this.f6695a.f6703f;
        }

        @Override // p124x0.Q
        public final /* bridge */ /* synthetic */ void m(n nVar) {
        }
    });

    public b(L0 l6, f fVar, L0 l7, C c6, C c7, C1143m c1143m) {
        this.f6698a = fVar;
        this.f6699b = l7;
        this.f6700c = c6;
        this.f6701d = c7;
        this.f6702e = c1143m;
        this.f6704g = new e(l6, new C(0, this, b.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 3));
    }

    public final boolean a(int i, boolean z5, boolean z6) {
        int iD;
        L l6 = this.f6705h;
        p024e0.f fVar = p024e0.f.f8648j;
        try {
            if (l6.f1105b) {
                L.a(l6);
            }
            l6.f1105b = true;
            ((d) l6.f1107d).c(fVar);
            r rVar = this.f6703f;
            boolean zE = (z5 || !((iD = AbstractC0916i.d(p024e0.d.u(rVar))) == 1 || iD == 2 || iD == 3)) ? p024e0.d.e(rVar, z5) : false;
            L.b(l6);
            if (zE && z6) {
                this.f6700c.invoke();
            }
            return zE;
        } catch (Throwable th) {
            L.b(l6);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x037f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0381  */
    /* JADX WARN: Code duplicated, block: B:110:0x0387  */
    /* JADX WARN: Code duplicated, block: B:112:0x038d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0399 A[ADDED_TO_REGION, LOOP:14: B:114:0x0399->B:143:0x03e8, LOOP_START, PHI: r6
  0x0399: PHI (r6v34 Z.n) = (r6v28 Z.n), (r6v35 Z.n) binds: [B:113:0x0397, B:143:0x03e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x039b  */
    /* JADX WARN: Code duplicated, block: B:117:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:119:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:122:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:153:0x0401  */
    /* JADX WARN: Code duplicated, block: B:154:0x0407  */
    /* JADX WARN: Code duplicated, block: B:156:0x040d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0413  */
    /* JADX WARN: Code duplicated, block: B:160:0x041b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0427 A[ADDED_TO_REGION, LOOP:18: B:162:0x0427->B:191:0x0476, LOOP_START, PHI: r2
  0x0427: PHI (r2v15 Z.n) = (r2v9 Z.n), (r2v16 Z.n) binds: [B:161:0x0425, B:191:0x0476] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:163:0x0429  */
    /* JADX WARN: Code duplicated, block: B:165:0x042f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0433  */
    /* JADX WARN: Code duplicated, block: B:170:0x0438  */
    /* JADX WARN: Code duplicated, block: B:172:0x043e  */
    /* JADX WARN: Code duplicated, block: B:194:0x047f  */
    /* JADX WARN: Code duplicated, block: B:201:0x048f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0494  */
    /* JADX WARN: Code duplicated, block: B:327:0x0614  */
    /* JADX WARN: Code duplicated, block: B:391:0x03fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x03fd A[EDGE_INSN: B:392:0x03fd->B:151:0x03fd BREAK  A[LOOP:13: B:111:0x038b->B:394:0x038b, LOOP_LABEL: LOOP:13: B:111:0x038b->B:394:0x038b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x03e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x0488 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x048a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x048b A[EDGE_INSN: B:413:0x048b->B:199:0x048b BREAK  A[LOOP:17: B:159:0x0419->B:415:0x0419, LOOP_LABEL: LOOP:17: B:159:0x0419->B:415:0x0419], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x0476 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x0471 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r0v13, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r0v17, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r0v18, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r10v10, types: [int] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [int] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [P.d] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34, types: [P.d] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37, types: [P.d] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40, types: [P.d] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v76 */
    /* JADX WARN: Type inference failed for: r6v77 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [P.d] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38, types: [int] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v76 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [P.d] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [P.d] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [P.d] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [int] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27, types: [int] */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [int] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [int] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v76 */
    public final boolean b(KeyEvent keyEvent, D4.a aVar) {
        boolean z5;
        int i;
        n nVar;
        n nVar2;
        D dS;
        ?? E5;
        InterfaceC1104l interfaceC1104l;
        n nVar3;
        C0237s c0237s;
        ?? dVar;
        n nVar4;
        D dS2;
        ?? E6;
        InterfaceC1104l interfaceC1104l2;
        C0237s c0237s2;
        ?? dVar2;
        int size;
        C0237s c0237s3;
        int iB;
        long j4;
        long[] jArr;
        int i3;
        if (this.f6704g.a()) {
            throw new IllegalStateException("Dispatching key event while focus system is invalidated.");
        }
        long jK0 = c.k0(keyEvent);
        int iO0 = c.o0(keyEvent);
        int i6 = 1;
        if (iO0 != 2) {
            z5 = false;
            if (iO0 == 1) {
                t tVar = this.f6706j;
                if (tVar != null && tVar.a(jK0)) {
                    t tVar2 = this.f6706j;
                    if (tVar2 != null) {
                        int iHashCode = Long.hashCode(jK0) * (-862048943);
                        int i7 = iHashCode ^ (iHashCode << 16);
                        int i8 = i7 & 127;
                        int i9 = tVar2.f10779c;
                        int i10 = (i7 >>> 7) & i9;
                        int i11 = 0;
                        loop23: while (true) {
                            long[] jArr2 = tVar2.f10777a;
                            int i12 = i10 >> 3;
                            int i13 = (i10 & 7) << 3;
                            long j6 = ((jArr2[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr2[i12] >>> i13);
                            long j7 = (((long) i8) * 72340172838076673L) ^ j6;
                            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i10) & i9;
                                if (tVar2.f10778b[iNumberOfTrailingZeros] == jK0) {
                                    i = iNumberOfTrailingZeros;
                                    break loop23;
                                }
                            }
                            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                                i = -1;
                                break;
                            }
                            i11 += 8;
                            i10 = (i10 + i11) & i9;
                        }
                        if (i >= 0) {
                            tVar2.f10780d--;
                            long[] jArr3 = tVar2.f10777a;
                            int i14 = tVar2.f10779c;
                            int i15 = i >> 3;
                            int i16 = (i & 7) << 3;
                            long j9 = (jArr3[i15] & (~(255 << i16))) | (254 << i16);
                            jArr3[i15] = j9;
                            jArr3[(((i - 7) & i14) + (i14 & 7)) >> 3] = j9;
                        }
                    }
                }
            }
            return z5;
        }
        t tVar3 = this.f6706j;
        if (tVar3 == null) {
            tVar3 = new t(3);
            this.f6706j = tVar3;
        }
        t tVar4 = tVar3;
        int iHashCode2 = Long.hashCode(jK0) * (-862048943);
        int i17 = iHashCode2 ^ (iHashCode2 << 16);
        int i18 = i17 >>> 7;
        int i19 = i17 & 127;
        z5 = false;
        int i20 = tVar4.f10779c;
        int i21 = i18 & i20;
        int i22 = 0;
        loop0: while (true) {
            long[] jArr4 = tVar4.f10777a;
            int i23 = i21 >> 3;
            int i24 = (i21 & 7) << 3;
            long j10 = (jArr4[i23] >>> i24) | ((jArr4[i23 + i6] << (64 - i24)) & ((-i24) >> 63));
            long j11 = i19;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (j12 - 72340172838076673L) & (~j12) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros2 = (i21 + (Long.numberOfTrailingZeros(j13) >> 3)) & i20;
                int i25 = i6;
                if (tVar4.f10778b[iNumberOfTrailingZeros2] == jK0) {
                    iB = iNumberOfTrailingZeros2;
                    break loop0;
                }
                j13 &= j13 - 1;
                i6 = i25;
            }
            int i26 = i6;
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iB = tVar4.b(i18);
                if (tVar4.f10781e != 0 || ((tVar4.f10777a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j4 = 128;
                } else {
                    int i27 = tVar4.f10779c;
                    if (i27 > 8) {
                        j4 = 128;
                        if (Long.compareUnsigned(((long) tVar4.f10780d) * 32, ((long) i27) * 25) <= 0) {
                            long[] jArr5 = tVar4.f10777a;
                            int i28 = tVar4.f10779c;
                            long[] jArr6 = tVar4.f10778b;
                            p080p.C.a(jArr5, i28);
                            int i29 = 0;
                            int iB2 = -1;
                            while (i29 != i28) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j14 = (jArr5[i30] >> i31) & 255;
                                if (j14 == 128) {
                                    iB2 = i29;
                                    i29++;
                                } else if (j14 != 254) {
                                    i29++;
                                } else {
                                    int iHashCode3 = Long.hashCode(jArr6[i29]) * (-862048943);
                                    int i32 = iHashCode3 ^ (iHashCode3 << 16);
                                    int i33 = i32 >>> 7;
                                    int iB3 = tVar4.b(i33);
                                    int i34 = i33 & i28;
                                    long[] jArr7 = jArr6;
                                    if (((iB3 - i34) & i28) / 8 == ((i29 - i34) & i28) / 8) {
                                        jArr5[i30] = (jArr5[i30] & (~(255 << i31))) | (((long) (i32 & 127)) << i31);
                                        jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i29++;
                                    } else {
                                        int i35 = i29;
                                        int i36 = iB3 >> 3;
                                        long j15 = jArr5[i36];
                                        int i37 = (iB3 & 7) << 3;
                                        if (((j15 >> i37) & 255) == 128) {
                                            jArr5[i36] = (j15 & (~(255 << i37))) | (((long) (i32 & 127)) << i37);
                                            jArr5[i30] = (jArr5[i30] & (~(255 << i31))) | (128 << i31);
                                            jArr7[iB3] = jArr7[i35];
                                            jArr7[i35] = 0;
                                            i3 = i35;
                                            iB2 = i3;
                                        } else {
                                            jArr5[i36] = (((long) (i32 & 127)) << i37) | (j15 & (~(255 << i37)));
                                            if (iB2 == -1) {
                                                iB2 = p080p.C.b(jArr5, i35 + 1, i28);
                                            }
                                            jArr7[iB2] = jArr7[iB3];
                                            jArr7[iB3] = jArr7[i35];
                                            jArr7[i35] = jArr7[iB2];
                                            i3 = i35 - 1;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i29 = i3 + 1;
                                    }
                                    jArr6 = jArr7;
                                }
                            }
                            tVar4.f10781e = p080p.C.c(tVar4.f10779c) - tVar4.f10780d;
                        }
                        iB = tVar4.b(i18);
                    } else {
                        j4 = 128;
                    }
                    int iD = p080p.C.d(tVar4.f10779c);
                    long[] jArr8 = tVar4.f10777a;
                    long[] jArr9 = tVar4.f10778b;
                    int i38 = tVar4.f10779c;
                    tVar4.c(iD);
                    long[] jArr10 = tVar4.f10777a;
                    long[] jArr11 = tVar4.f10778b;
                    int i39 = tVar4.f10779c;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr8[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < j4) {
                            long j16 = jArr9[i40];
                            int iHashCode4 = Long.hashCode(j16) * (-862048943);
                            int i41 = iHashCode4 ^ (iHashCode4 << 16);
                            jArr = jArr10;
                            int iB4 = tVar4.b(i41 >>> 7);
                            long j17 = i41 & 127;
                            int i42 = iB4 >> 3;
                            int i43 = (iB4 & 7) << 3;
                            long j18 = (jArr[i42] & (~(255 << i43))) | (j17 << i43);
                            jArr[i42] = j18;
                            jArr[(((iB4 - 7) & i39) + (i39 & 7)) >> 3] = j18;
                            jArr11[iB4] = j16;
                        } else {
                            jArr = jArr10;
                        }
                        i40++;
                        jArr10 = jArr;
                        jArr8 = jArr8;
                    }
                    iB = tVar4.b(i18);
                }
                tVar4.f10780d++;
                int i44 = tVar4.f10781e;
                long[] jArr12 = tVar4.f10777a;
                int i45 = iB >> 3;
                long j19 = jArr12[i45];
                int i46 = (iB & 7) << 3;
                tVar4.f10781e = i44 - (((j19 >> i46) & 255) == j4 ? i26 : 0);
                int i47 = tVar4.f10779c;
                long j20 = (j19 & (~(255 << i46))) | (j11 << i46);
                jArr12[i45] = j20;
                jArr12[(((iB - 7) & i47) + (i47 & 7)) >> 3] = j20;
                break;
            }
            i22 += 8;
            i21 = (i21 + i22) & i20;
            i6 = i26;
        }
        tVar4.f10778b[iB] = jK0;
        r rVar = this.f6703f;
        r rVarG = p024e0.d.g(rVar);
        if (rVarG != null) {
            n nVar5 = rVarG.f5958h;
            if (!nVar5.f5969t) {
                p027e3.a.y0("visitLocalDescendants called on an unattached node");
                throw null;
            }
            if ((nVar5.f5960k & 9216) != 0) {
                nVar3 = null;
                for (n nVar6 = nVar5.f5962m; nVar6 != null; nVar6 = nVar6.f5962m) {
                    int i48 = nVar6.f5959j;
                    if ((i48 & 9216) != 0) {
                        if ((i48 & 1024) != 0) {
                            break;
                        }
                        nVar3 = nVar6;
                    }
                }
            } else {
                nVar3 = null;
            }
            if (nVar3 == null) {
                if (rVarG != null) {
                    nVar4 = rVarG.f5958h;
                    if (nVar4.f5969t) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    dS2 = AbstractC1098f.s(rVarG);
                    loop13: while (true) {
                        if (dS2 != null) {
                            E6 = 0;
                            break;
                        }
                        if ((((n) dS2.f13828C.f3796f).f5960k & 8192) != 0) {
                            while (nVar4 != null) {
                                if ((nVar4.f5959j & 8192) != 0) {
                                    dVar2 = 0;
                                    E6 = nVar4;
                                    while (E6 != 0) {
                                        if (E6 instanceof p081p0.d) {
                                            break loop13;
                                        }
                                        if ((E6.f5959j & 8192) == 0 && (E6 instanceof AbstractC1105m)) {
                                            n nVar7 = ((AbstractC1105m) E6).f14046v;
                                            ?? r10 = z5;
                                            E6 = E6;
                                            dVar2 = dVar2;
                                            while (nVar7 != null) {
                                                if ((nVar7.f5959j & 8192) != 0) {
                                                    r10++;
                                                    dVar2 = dVar2;
                                                    if (r10 == 1) {
                                                        E6 = nVar7;
                                                    } else {
                                                        if (dVar2 == 0) {
                                                            dVar2 = new d(new n[16]);
                                                        }
                                                        if (E6 != 0) {
                                                            dVar2.c(E6);
                                                            E6 = 0;
                                                        }
                                                        dVar2.c(nVar7);
                                                    }
                                                }
                                                nVar7 = nVar7.f5962m;
                                                E6 = E6;
                                                dVar2 = dVar2;
                                                r10 = r10;
                                            }
                                            if (r10 == 1) {
                                            }
                                        }
                                        E6 = AbstractC1098f.e(dVar2);
                                    }
                                }
                                nVar4 = nVar4.f5961l;
                            }
                        }
                        dS2 = dS2.r();
                        nVar4 = (dS2 != null || (c0237s2 = dS2.f13828C) == null) ? null : (n0) c0237s2.f3795e;
                    }
                    interfaceC1104l2 = (p081p0.d) E6;
                    if (interfaceC1104l2 != null) {
                        nVar3 = ((n) interfaceC1104l2).f5958h;
                    } else {
                        nVar = rVar.f5958h;
                        if (nVar.f5969t) {
                            throw new IllegalStateException("visitAncestors called on an unattached node");
                        }
                        nVar2 = nVar.f5961l;
                        dS = AbstractC1098f.s(rVar);
                        loop17: while (true) {
                            if (dS != null) {
                                E5 = 0;
                                break;
                            }
                            if ((((n) dS.f13828C.f3796f).f5960k & 8192) != 0) {
                                while (nVar2 != null) {
                                    if ((nVar2.f5959j & 8192) != 0) {
                                        E5 = nVar2;
                                        dVar = 0;
                                        while (E5 != 0) {
                                            if (E5 instanceof p081p0.d) {
                                                break loop17;
                                            }
                                            if ((E5.f5959j & 8192) == 0 && (E5 instanceof AbstractC1105m)) {
                                                n nVar8 = ((AbstractC1105m) E5).f14046v;
                                                ?? r9 = z5;
                                                E5 = E5;
                                                dVar = dVar;
                                                while (nVar8 != null) {
                                                    if ((nVar8.f5959j & 8192) != 0) {
                                                        r9++;
                                                        dVar = dVar;
                                                        if (r9 == 1) {
                                                            E5 = nVar8;
                                                        } else {
                                                            if (dVar == 0) {
                                                                dVar = new d(new n[16]);
                                                            }
                                                            if (E5 != 0) {
                                                                dVar.c(E5);
                                                                E5 = 0;
                                                            }
                                                            dVar.c(nVar8);
                                                        }
                                                    }
                                                    nVar8 = nVar8.f5962m;
                                                    E5 = E5;
                                                    dVar = dVar;
                                                    r9 = r9;
                                                }
                                                if (r9 == 1) {
                                                }
                                            }
                                            E5 = AbstractC1098f.e(dVar);
                                        }
                                    }
                                    nVar2 = nVar2.f5961l;
                                }
                            }
                            dS = dS.r();
                            nVar2 = (dS != null || (c0237s = dS.f13828C) == null) ? null : (n0) c0237s.f3795e;
                        }
                        interfaceC1104l = (p081p0.d) E5;
                        if (interfaceC1104l != null) {
                            nVar3 = ((n) interfaceC1104l).f5958h;
                        } else {
                            nVar3 = null;
                        }
                    }
                } else {
                    nVar = rVar.f5958h;
                    if (nVar.f5969t) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    nVar2 = nVar.f5961l;
                    dS = AbstractC1098f.s(rVar);
                    loop17: while (true) {
                        if (dS != null) {
                            E5 = 0;
                            break;
                        }
                        if ((((n) dS.f13828C.f3796f).f5960k & 8192) != 0) {
                            while (nVar2 != null) {
                                if ((nVar2.f5959j & 8192) != 0) {
                                    E5 = nVar2;
                                    dVar = 0;
                                    while (E5 != 0) {
                                        if (E5 instanceof p081p0.d) {
                                            break loop17;
                                            break loop17;
                                        }
                                        if ((E5.f5959j & 8192) == 0) {
                                        }
                                        E5 = AbstractC1098f.e(dVar);
                                    }
                                }
                                nVar2 = nVar2.f5961l;
                            }
                        }
                        dS = dS.r();
                        if (dS != null) {
                        }
                    }
                    interfaceC1104l = (p081p0.d) E5;
                    if (interfaceC1104l != null) {
                        nVar3 = ((n) interfaceC1104l).f5958h;
                    } else {
                        nVar3 = null;
                    }
                }
            }
        } else if (rVarG != null) {
            nVar4 = rVarG.f5958h;
            if (nVar4.f5969t) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            dS2 = AbstractC1098f.s(rVarG);
            loop13: while (true) {
                if (dS2 != null) {
                    E6 = 0;
                    break;
                }
                if ((((n) dS2.f13828C.f3796f).f5960k & 8192) != 0) {
                    while (nVar4 != null) {
                        if ((nVar4.f5959j & 8192) != 0) {
                            dVar2 = 0;
                            E6 = nVar4;
                            while (E6 != 0) {
                                if (E6 instanceof p081p0.d) {
                                    break loop13;
                                    break loop13;
                                }
                                if ((E6.f5959j & 8192) == 0) {
                                }
                                E6 = AbstractC1098f.e(dVar2);
                            }
                        }
                        nVar4 = nVar4.f5961l;
                    }
                }
                dS2 = dS2.r();
                if (dS2 != null) {
                }
            }
            interfaceC1104l2 = (p081p0.d) E6;
            if (interfaceC1104l2 != null) {
                nVar3 = ((n) interfaceC1104l2).f5958h;
            } else {
                nVar = rVar.f5958h;
                if (nVar.f5969t) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                nVar2 = nVar.f5961l;
                dS = AbstractC1098f.s(rVar);
                loop17: while (true) {
                    if (dS != null) {
                        E5 = 0;
                        break;
                    }
                    if ((((n) dS.f13828C.f3796f).f5960k & 8192) != 0) {
                        while (nVar2 != null) {
                            if ((nVar2.f5959j & 8192) != 0) {
                                E5 = nVar2;
                                dVar = 0;
                                while (E5 != 0) {
                                    if (E5 instanceof p081p0.d) {
                                        break loop17;
                                        break loop17;
                                    }
                                    if ((E5.f5959j & 8192) == 0) {
                                    }
                                    E5 = AbstractC1098f.e(dVar);
                                }
                            }
                            nVar2 = nVar2.f5961l;
                        }
                    }
                    dS = dS.r();
                    if (dS != null) {
                    }
                }
                interfaceC1104l = (p081p0.d) E5;
                if (interfaceC1104l != null) {
                    nVar3 = ((n) interfaceC1104l).f5958h;
                } else {
                    nVar3 = null;
                }
            }
        } else {
            nVar = rVar.f5958h;
            if (nVar.f5969t) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            nVar2 = nVar.f5961l;
            dS = AbstractC1098f.s(rVar);
            loop17: while (true) {
                if (dS != null) {
                    E5 = 0;
                    break;
                }
                if ((((n) dS.f13828C.f3796f).f5960k & 8192) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f5959j & 8192) != 0) {
                            E5 = nVar2;
                            dVar = 0;
                            while (E5 != 0) {
                                if (E5 instanceof p081p0.d) {
                                    break loop17;
                                    break loop17;
                                }
                                if ((E5.f5959j & 8192) == 0) {
                                }
                                E5 = AbstractC1098f.e(dVar);
                            }
                        }
                        nVar2 = nVar2.f5961l;
                    }
                }
                dS = dS.r();
                if (dS != null) {
                }
            }
            interfaceC1104l = (p081p0.d) E5;
            if (interfaceC1104l != null) {
                nVar3 = ((n) interfaceC1104l).f5958h;
            } else {
                nVar3 = null;
            }
        }
        if (nVar3 != null) {
            n nVar9 = nVar3.f5958h;
            if (!nVar9.f5969t) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            n nVar10 = nVar9.f5961l;
            D dS3 = AbstractC1098f.s(nVar3);
            ?? arrayList = 0;
            while (dS3 != null) {
                arrayList = arrayList;
                if ((((n) dS3.f13828C.f3796f).f5960k & 8192) != 0) {
                    while (nVar10 != null) {
                        if ((nVar10.f5959j & 8192) != 0) {
                            n nVarE = nVar10;
                            d dVar3 = null;
                            while (nVarE != null) {
                                if (nVarE instanceof p081p0.d) {
                                    if (arrayList == 0) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nVarE);
                                } else if ((nVarE.f5959j & 8192) != 0 && (nVarE instanceof AbstractC1105m)) {
                                    n nVar11 = ((AbstractC1105m) nVarE).f14046v;
                                    ?? r11 = z5;
                                    while (nVar11 != null) {
                                        if ((nVar11.f5959j & 8192) != 0) {
                                            r11++;
                                            if (r11 == 1) {
                                                nVarE = nVar11;
                                            } else {
                                                if (dVar3 == null) {
                                                    dVar3 = new d(new n[16]);
                                                }
                                                if (nVarE != null) {
                                                    dVar3.c(nVarE);
                                                    nVarE = null;
                                                }
                                                dVar3.c(nVar11);
                                            }
                                        }
                                        nVar11 = nVar11.f5962m;
                                        r11 = r11;
                                    }
                                    if (r11 == 1) {
                                    }
                                }
                                nVarE = AbstractC1098f.e(dVar3);
                            }
                        }
                        nVar10 = nVar10.f5961l;
                        arrayList = arrayList;
                    }
                }
                dS3 = dS3.r();
                nVar10 = (dS3 == null || (c0237s3 = dS3.f13828C) == null) ? null : (n0) c0237s3.f3795e;
            }
            if (arrayList != 0 && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i49 = size - 1;
                    if (((p081p0.d) arrayList.get(size)).l(keyEvent)) {
                        return true;
                    }
                    if (i49 < 0) {
                        break;
                    }
                    size = i49;
                }
            }
            ?? E7 = nVar3.f5958h;
            ?? dVar4 = 0;
            while (E7 != 0) {
                if (E7 instanceof p081p0.d) {
                    if (((p081p0.d) E7).l(keyEvent)) {
                        return true;
                    }
                } else if ((E7.f5959j & 8192) != 0 && (E7 instanceof AbstractC1105m)) {
                    n nVar12 = ((AbstractC1105m) E7).f14046v;
                    ?? r8 = z5;
                    E7 = E7;
                    dVar4 = dVar4;
                    while (nVar12 != null) {
                        if ((nVar12.f5959j & 8192) != 0) {
                            r8++;
                            dVar4 = dVar4;
                            if (r8 == 1) {
                                E7 = nVar12;
                            } else {
                                if (dVar4 == 0) {
                                    dVar4 = new d(new n[16]);
                                }
                                if (E7 != 0) {
                                    dVar4.c(E7);
                                    E7 = 0;
                                }
                                dVar4.c(nVar12);
                            }
                        }
                        nVar12 = nVar12.f5962m;
                        E7 = E7;
                        dVar4 = dVar4;
                        r8 = r8;
                    }
                    if (r8 == 1) {
                    }
                }
                E7 = AbstractC1098f.e(dVar4);
            }
            if (((Boolean) aVar.invoke()).booleanValue()) {
                return true;
            }
            ?? E8 = nVar3.f5958h;
            ?? dVar5 = 0;
            while (E8 != 0) {
                if (E8 instanceof p081p0.d) {
                    if (((p081p0.d) E8).K(keyEvent)) {
                        return true;
                    }
                } else if ((E8.f5959j & 8192) != 0 && (E8 instanceof AbstractC1105m)) {
                    n nVar13 = ((AbstractC1105m) E8).f14046v;
                    ?? r7 = z5;
                    E8 = E8;
                    dVar5 = dVar5;
                    while (nVar13 != null) {
                        if ((nVar13.f5959j & 8192) != 0) {
                            r7++;
                            dVar5 = dVar5;
                            if (r7 == 1) {
                                E8 = nVar13;
                            } else {
                                if (dVar5 == 0) {
                                    dVar5 = new d(new n[16]);
                                }
                                if (E8 != 0) {
                                    dVar5.c(E8);
                                    E8 = 0;
                                }
                                dVar5.c(nVar13);
                            }
                        }
                        nVar13 = nVar13.f5962m;
                        E8 = E8;
                        dVar5 = dVar5;
                        r7 = r7;
                    }
                    if (r7 == 1) {
                    }
                }
                E8 = AbstractC1098f.e(dVar5);
            }
            if (arrayList != 0) {
                int size2 = arrayList.size();
                for (?? r6 = z5; r6 < size2; r6++) {
                    if (((p081p0.d) arrayList.get(r6)).K(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005d A[PHI: r11
  0x005d: PHI (r11v10 e0.n) = (r11v7 e0.n), (r11v14 e0.n) binds: [B:38:0x007a, B:24:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [P.d] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [P.d] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Boolean c(int i, p030f0.d dVar, D4.c cVar) {
        Boolean bool;
        boolean zA;
        Object obj;
        C0237s c0237s;
        p024e0.n nVar;
        p024e0.n nVar2;
        r rVar = this.f6703f;
        r rVarG = p024e0.d.g(rVar);
        C1143m c1143m = this.f6702e;
        int i3 = 4;
        if (rVarG != null) {
            S0.k kVar = (S0.k) c1143m.j();
            bool = null;
            j jVarY0 = rVarG.y0();
            if (i == 1) {
                nVar = jVarY0.f8656b;
            } else if (i == 2) {
                nVar = jVarY0.f8657c;
            } else if (i == 5) {
                nVar = jVarY0.f8658d;
            } else if (i == 6) {
                nVar = jVarY0.f8659e;
            } else if (i == 3) {
                int iOrdinal = kVar.ordinal();
                if (iOrdinal == 0) {
                    nVar2 = jVarY0.f8662h;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar2 = jVarY0.i;
                }
                if (nVar2 == p024e0.n.f8666b) {
                    nVar2 = null;
                }
                if (nVar2 == null) {
                    nVar = jVarY0.f8660f;
                } else {
                    nVar = nVar2;
                }
            } else if (i == 4) {
                int iOrdinal2 = kVar.ordinal();
                if (iOrdinal2 == 0) {
                    nVar2 = jVarY0.i;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar2 = jVarY0.f8662h;
                }
                if (nVar2 == p024e0.n.f8666b) {
                    nVar2 = null;
                }
                if (nVar2 == null) {
                    nVar = jVarY0.f8661g;
                } else {
                    nVar = nVar2;
                }
            } else if (i == 7) {
                jVarY0.f8663j.getClass();
                nVar = p024e0.n.f8666b;
            } else {
                if (i != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                jVarY0.f8664k.getClass();
                nVar = p024e0.n.f8666b;
            }
            if (!E4.k.a(nVar, p024e0.n.f8667c)) {
                if (!E4.k.a(nVar, p024e0.n.f8666b)) {
                    return Boolean.valueOf(nVar.a(cVar));
                }
            }
            return bool;
        }
        bool = null;
        rVarG = null;
        S0.k kVar2 = (S0.k) c1143m.j();
        C0026n c0026n = new C0026n(rVarG, this, cVar);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zA = p024e0.d.k(rVar, c0026n);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                zA = p024e0.d.a(rVar, c0026n);
            }
            return Boolean.valueOf(zA);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return p024e0.d.J(i, c0026n, rVar, dVar);
        }
        if (i == 7) {
            int iOrdinal3 = kVar2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 3;
            }
            r rVarG2 = p024e0.d.g(rVar);
            if (rVarG2 != null) {
                return p024e0.d.J(i3, c0026n, rVarG2, dVar);
            }
            return bool;
        }
        if (i != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) p024e0.b.a(i))).toString());
        }
        r rVarG3 = p024e0.d.g(rVar);
        boolean zBooleanValue = false;
        if (rVarG3 == null) {
            obj = bool;
            break;
        }
        n nVar3 = rVarG3.f5958h;
        if (!nVar3.f5969t) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Object obj2 = nVar3.f5961l;
        D dS = AbstractC1098f.s(rVarG3);
        loop0: while (true) {
            if (dS == null) {
                obj = bool;
                break;
            }
            if ((((n) dS.f13828C.f3796f).f5960k & 1024) != 0) {
                for (?? r6 = obj2; r6 != 0; r6 = r6.f5961l) {
                    if ((r6.f5959j & 1024) != 0) {
                        ?? E5 = r6;
                        ?? dVar2 = bool;
                        while (E5 != 0) {
                            if (E5 instanceof r) {
                                r rVar2 = (r) E5;
                                if (rVar2.y0().f8655a) {
                                    obj = rVar2;
                                    break loop0;
                                }
                            } else if ((E5.f5959j & 1024) != 0 && (E5 instanceof AbstractC1105m)) {
                                n nVar4 = ((AbstractC1105m) E5).f14046v;
                                int i6 = 0;
                                E5 = E5;
                                dVar2 = dVar2;
                                while (nVar4 != null) {
                                    if ((nVar4.f5959j & 1024) != 0) {
                                        i6++;
                                        dVar2 = dVar2;
                                        if (i6 == 1) {
                                            E5 = nVar4;
                                        } else {
                                            if (dVar2 == 0) {
                                                dVar2 = new d(new n[16]);
                                            }
                                            if (E5 != 0) {
                                                dVar2.c(E5);
                                                E5 = bool;
                                            }
                                            dVar2.c(nVar4);
                                        }
                                    }
                                    nVar4 = nVar4.f5962m;
                                    E5 = E5;
                                    dVar2 = dVar2;
                                }
                                if (i6 == 1) {
                                }
                            }
                            E5 = AbstractC1098f.e(dVar2);
                        }
                    }
                }
            }
            dS = dS.r();
            obj2 = (dS == null || (c0237s = dS.f13828C) == null) ? bool : (n0) c0237s.f3795e;
        }
        if (obj != null && !obj.equals(rVar)) {
            zBooleanValue = ((Boolean) c0026n.invoke(obj)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final boolean d(int i) {
        w wVar = new w();
        wVar.f1074h = Boolean.FALSE;
        Boolean boolC = c(i, (p030f0.d) this.f6701d.invoke(), new G(wVar, i));
        if (boolC != null && wVar.f1074h != null) {
            Boolean bool = Boolean.TRUE;
            if (!boolC.equals(bool) || !E4.k.a(wVar.f1074h, bool)) {
                if (i != 1 && i != 2) {
                    return ((Boolean) this.f6699b.invoke(new p024e0.b(i))).booleanValue();
                }
                if (a(i, false, false)) {
                    Boolean boolC2 = c(i, null, new h(i));
                    if (boolC2 != null ? boolC2.booleanValue() : false) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
