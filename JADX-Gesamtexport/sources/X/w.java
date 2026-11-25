package X;

import B.C0025m0;
import N.C0208d;
import N.C0228n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p124x0.g0;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D4.c f5730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p080p.v f5732c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5738j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5733d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0025m0 f5734e = new C0025m0(12);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p080p.x f5735f = new p080p.x();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p080p.A f5736g = new p080p.A();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final P.d f5737h = new P.d(new N.D[16]);
    public final C0228n i = new C0228n(1, this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0025m0 f5739k = new C0025m0(12);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f5740l = new HashMap();

    public w(D4.c cVar) {
        this.f5730a = cVar;
    }

    public final void a(Object obj, A2.e eVar, D4.a aVar) {
        boolean z5;
        int i;
        int i3;
        Object obj2 = this.f5731b;
        p080p.v vVar = this.f5732c;
        int i6 = this.f5733d;
        this.f5731b = obj;
        this.f5732c = (p080p.v) this.f5735f.e(obj);
        if (this.f5733d == -1) {
            this.f5733d = o.k().d();
        }
        C0228n c0228n = this.i;
        P.d dVarB = C0208d.B();
        boolean z6 = true;
        try {
            dVarB.c(c0228n);
            t.f(aVar, eVar);
            dVarB.p(dVarB.f4583j - 1);
            Object obj3 = this.f5731b;
            E4.k.c(obj3);
            int i7 = this.f5733d;
            p080p.v vVar2 = this.f5732c;
            if (vVar2 != null) {
                long[] jArr = vVar2.f10788a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j4 = jArr[i8];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8;
                            int i10 = 8 - ((~(i8 - length)) >>> 31);
                            z5 = z6;
                            int i11 = 0;
                            while (i11 < i10) {
                                if ((j4 & 255) < 128) {
                                    int i12 = (i8 << 3) + i11;
                                    i3 = i9;
                                    Object obj4 = vVar2.f10789b[i12];
                                    i = i11;
                                    boolean z7 = vVar2.f10790c[i12] != i7 ? z5 : false;
                                    if (z7) {
                                        d(obj3, obj4);
                                    }
                                    if (z7) {
                                        vVar2.e(i12);
                                    }
                                } else {
                                    i = i11;
                                    i3 = i9;
                                }
                                j4 >>= i3;
                                i11 = i + 1;
                                i9 = i3;
                            }
                            if (i10 != i9) {
                                break;
                            }
                        } else {
                            z5 = z6;
                        }
                        if (i8 == length) {
                            break;
                        }
                        i8++;
                        z6 = z5;
                    }
                }
            }
            this.f5731b = obj2;
            this.f5732c = vVar;
            this.f5733d = i6;
        } catch (Throwable th) {
            dVarB.p(dVarB.f4583j - 1);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x027b A[DONT_INVERT, PHI: r22
  0x027b: PHI (r22v38 boolean) = (r22v37 boolean), (r22v39 boolean) binds: [B:101:0x0252, B:109:0x0279] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x027d A[LOOP:6: B:100:0x0248->B:111:0x027d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:168:0x03d3 A[DONT_INVERT, PHI: r22
  0x03d3: PHI (r22v21 boolean) = (r22v20 boolean), (r22v22 boolean) binds: [B:157:0x03a1, B:167:0x03d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:169:0x03d5 A[LOOP:16: B:156:0x0393->B:169:0x03d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x049c A[DONT_INVERT, PHI: r22
  0x049c: PHI (r22v11 boolean) = (r22v10 boolean), (r22v12 boolean) binds: [B:193:0x0473, B:201:0x049a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:203:0x049e A[LOOP:20: B:192:0x0469->B:203:0x049e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:224:0x0505 A[DONT_INVERT, PHI: r22
  0x0505: PHI (r22v5 boolean) = (r22v4 boolean), (r22v6 boolean) binds: [B:215:0x04dc, B:223:0x0503] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:225:0x0507 A[LOOP:18: B:214:0x04d2->B:225:0x0507, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:280:0x015c A[EDGE_INSN: B:280:0x015c->B:59:0x015c BREAK  A[LOOP:4: B:43:0x00ff->B:55:0x013b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0285 A[EDGE_INSN: B:285:0x0285->B:113:0x0285 BREAK  A[LOOP:6: B:100:0x0248->B:111:0x027d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0229 A[EDGE_INSN: B:290:0x0229->B:93:0x0229 BREAK  A[LOOP:8: B:78:0x01db->B:89:0x0210], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x050f A[EDGE_INSN: B:304:0x050f->B:227:0x050f BREAK  A[LOOP:18: B:214:0x04d2->B:225:0x0507], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x03f0 A[EDGE_INSN: B:309:0x03f0->B:173:0x03f0 BREAK  A[LOOP:16: B:156:0x0393->B:169:0x03d5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x04b3 A[EDGE_INSN: B:315:0x04b3->B:207:0x04b3 BREAK  A[LOOP:20: B:192:0x0469->B:203:0x049e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0139 A[DONT_INVERT, PHI: r22
  0x0139: PHI (r22v54 boolean) = (r22v53 boolean), (r22v55 boolean) binds: [B:44:0x010d, B:53:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x013b A[LOOP:4: B:43:0x00ff->B:55:0x013b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x020e A[DONT_INVERT, PHI: r22
  0x020e: PHI (r22v44 boolean) = (r22v43 boolean), (r22v45 boolean) binds: [B:79:0x01e5, B:87:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0210 A[LOOP:8: B:78:0x01db->B:89:0x0210, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x021d  */
    public final boolean b(Set set) {
        char c6;
        long j4;
        boolean z5;
        Iterator it;
        Object obj;
        String str;
        C0025m0 c0025m0;
        Object objE;
        Iterator it2;
        String str2;
        C0025m0 c0025m1;
        long j6;
        P.d dVar;
        Object[] objArr;
        int i;
        p080p.v vVar;
        long[] jArr;
        Object[] objArr2;
        int i3;
        long[] jArr2;
        Object[] objArr3;
        int i6;
        int i7;
        long j7;
        int i8;
        int i9;
        Object obj2;
        Object objE2;
        int i10;
        long j8;
        int i11;
        int i12;
        HashMap map = this.f5740l;
        boolean z6 = set instanceof P.f;
        String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        P.d dVar2 = this.f5737h;
        C0025m0 c0025m2 = this.f5739k;
        C0025m0 c0025m3 = this.f5734e;
        p080p.A a6 = this.f5736g;
        if (z6) {
            p080p.A a7 = ((P.f) set).f4594h;
            Object[] objArr4 = a7.f10709b;
            long[] jArr3 = a7.f10708a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i13 = 0;
                z5 = false;
                c6 = 7;
                j4 = -9187201950435737472L;
                while (true) {
                    long j9 = jArr3[i13];
                    int i14 = 8;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j9 & 255) < 128) {
                                Object obj3 = objArr4[(i13 << 3) + i16];
                                jArr2 = jArr3;
                                if (obj3 instanceof C) {
                                    objArr3 = objArr4;
                                    if (!((C) obj3).d(2)) {
                                    }
                                    j9 = j7 >> 8;
                                    objArr4 = objArr3;
                                    i14 = 8;
                                    length = i6;
                                    i13 = i7;
                                    i15 = i8;
                                    i16 = i9 + 1;
                                    jArr3 = jArr2;
                                } else {
                                    objArr3 = objArr4;
                                }
                                if (!((p080p.x) c0025m2.i).b(obj3) || (objE2 = ((p080p.x) c0025m2.i).e(obj3)) == null) {
                                    i6 = length;
                                    i7 = i13;
                                    obj2 = obj3;
                                    j7 = j9;
                                    i8 = i15;
                                    i9 = i16;
                                } else if (objE2 instanceof p080p.A) {
                                    p080p.A a8 = (p080p.A) objE2;
                                    Object[] objArr5 = a8.f10709b;
                                    long[] jArr4 = a8.f10708a;
                                    int length2 = jArr4.length - 2;
                                    if (length2 >= 0) {
                                        j7 = j9;
                                        int i17 = 0;
                                        while (true) {
                                            long j10 = jArr4[i17];
                                            i6 = length;
                                            i7 = i13;
                                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                int i19 = 0;
                                                while (i19 < i18) {
                                                    if ((j10 & 255) < 128) {
                                                        i10 = i19;
                                                        N.D d6 = (N.D) objArr5[(i17 << 3) + i19];
                                                        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>", d6);
                                                        j8 = j10;
                                                        if (E4.k.a(d6.j().f3560f, map.get(d6))) {
                                                            obj3 = obj3;
                                                            i11 = i15;
                                                            i12 = i16;
                                                            dVar2.c(d6);
                                                        } else {
                                                            Object objE3 = ((p080p.x) c0025m3.i).e(d6);
                                                            if (objE3 != null) {
                                                                if (objE3 instanceof p080p.A) {
                                                                    p080p.A a9 = (p080p.A) objE3;
                                                                    Object[] objArr6 = a9.f10709b;
                                                                    long[] jArr5 = a9.f10708a;
                                                                    int length3 = jArr5.length - 2;
                                                                    if (length3 >= 0) {
                                                                        i11 = i15;
                                                                        i12 = i16;
                                                                        int i20 = 0;
                                                                        while (true) {
                                                                            long j11 = jArr5[i20];
                                                                            obj3 = obj3;
                                                                            Object[] objArr7 = objArr6;
                                                                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                if (i20 != length3) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                i20++;
                                                                                obj3 = obj3;
                                                                                objArr6 = objArr7;
                                                                                i14 = 8;
                                                                            } else {
                                                                                int i21 = 8 - ((~(i20 - length3)) >>> 31);
                                                                                for (int i22 = 0; i22 < i21; i22++) {
                                                                                    if ((j11 & 255) < 128) {
                                                                                        a6.a(objArr7[(i20 << 3) + i22]);
                                                                                        z5 = true;
                                                                                    }
                                                                                    j11 >>= i14;
                                                                                }
                                                                                if (i21 != i14) {
                                                                                    break;
                                                                                }
                                                                                if (i20 != length3) {
                                                                                    break;
                                                                                }
                                                                                i20++;
                                                                                obj3 = obj3;
                                                                                objArr6 = objArr7;
                                                                                i14 = 8;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    obj3 = obj3;
                                                                    i11 = i15;
                                                                    i12 = i16;
                                                                    a6.a(objE3);
                                                                    z5 = true;
                                                                }
                                                            }
                                                        }
                                                        i14 = 8;
                                                        i15 = i11;
                                                        i16 = i12;
                                                        i19 = i10 + 1;
                                                        j10 = j8 >> 8;
                                                        obj3 = obj3;
                                                    } else {
                                                        i10 = i19;
                                                        j8 = j10;
                                                    }
                                                    i11 = i15;
                                                    i12 = i16;
                                                    i14 = 8;
                                                    i15 = i11;
                                                    i16 = i12;
                                                    i19 = i10 + 1;
                                                    j10 = j8 >> 8;
                                                    obj3 = obj3;
                                                }
                                                obj2 = obj3;
                                                i8 = i15;
                                                i9 = i16;
                                                if (i18 != i14) {
                                                    break;
                                                }
                                            } else {
                                                obj2 = obj3;
                                                i8 = i15;
                                                i9 = i16;
                                            }
                                            if (i17 == length2) {
                                                break;
                                            }
                                            i17++;
                                            length = i6;
                                            i13 = i7;
                                            i15 = i8;
                                            i16 = i9;
                                            obj3 = obj2;
                                            i14 = 8;
                                        }
                                    } else {
                                        i6 = length;
                                        i7 = i13;
                                        obj2 = obj3;
                                        j7 = j9;
                                        i8 = i15;
                                        i9 = i16;
                                    }
                                } else {
                                    i6 = length;
                                    i7 = i13;
                                    obj2 = obj3;
                                    j7 = j9;
                                    i8 = i15;
                                    i9 = i16;
                                    N.D d7 = (N.D) objE2;
                                    if (E4.k.a(d7.j().f3560f, map.get(d7))) {
                                        dVar2.c(d7);
                                    } else {
                                        Object objE4 = ((p080p.x) c0025m3.i).e(d7);
                                        if (objE4 != null) {
                                            if (objE4 instanceof p080p.A) {
                                                p080p.A a10 = (p080p.A) objE4;
                                                Object[] objArr8 = a10.f10709b;
                                                long[] jArr6 = a10.f10708a;
                                                int length4 = jArr6.length - 2;
                                                if (length4 >= 0) {
                                                    int i23 = 0;
                                                    while (true) {
                                                        long j12 = jArr6[i23];
                                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                            if (i23 != length4) {
                                                                break;
                                                                break;
                                                            }
                                                            i23++;
                                                        } else {
                                                            int i24 = 8 - ((~(i23 - length4)) >>> 31);
                                                            for (int i25 = 0; i25 < i24; i25++) {
                                                                if ((j12 & 255) < 128) {
                                                                    a6.a(objArr8[(i23 << 3) + i25]);
                                                                    z5 = true;
                                                                }
                                                                j12 >>= 8;
                                                            }
                                                            if (i24 != 8) {
                                                                break;
                                                            }
                                                            if (i23 != length4) {
                                                                break;
                                                            }
                                                            i23++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                a6.a(objE4);
                                                z5 = true;
                                            }
                                        }
                                    }
                                }
                                Object objE5 = ((p080p.x) c0025m3.i).e(obj2);
                                if (objE5 != null) {
                                    if (objE5 instanceof p080p.A) {
                                        p080p.A a11 = (p080p.A) objE5;
                                        Object[] objArr9 = a11.f10709b;
                                        long[] jArr7 = a11.f10708a;
                                        int length5 = jArr7.length - 2;
                                        if (length5 >= 0) {
                                            int i26 = 0;
                                            while (true) {
                                                long j13 = jArr7[i26];
                                                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                    if (i26 != length5) {
                                                        break;
                                                        break;
                                                    }
                                                    i26++;
                                                } else {
                                                    int i27 = 8 - ((~(i26 - length5)) >>> 31);
                                                    for (int i28 = 0; i28 < i27; i28++) {
                                                        if ((j13 & 255) < 128) {
                                                            a6.a(objArr9[(i26 << 3) + i28]);
                                                            z5 = true;
                                                        }
                                                        j13 >>= 8;
                                                    }
                                                    if (i27 != 8) {
                                                        break;
                                                    }
                                                    if (i26 != length5) {
                                                        break;
                                                    }
                                                    i26++;
                                                }
                                            }
                                        }
                                    } else {
                                        a6.a(objE5);
                                        z5 = true;
                                    }
                                }
                                j9 = j7 >> 8;
                                objArr4 = objArr3;
                                i14 = 8;
                                length = i6;
                                i13 = i7;
                                i15 = i8;
                                i16 = i9 + 1;
                                jArr3 = jArr2;
                            } else {
                                jArr2 = jArr3;
                                objArr3 = objArr4;
                            }
                            i6 = length;
                            i7 = i13;
                            j7 = j9;
                            i8 = i15;
                            i9 = i16;
                            j9 = j7 >> 8;
                            objArr4 = objArr3;
                            i14 = 8;
                            length = i6;
                            i13 = i7;
                            i15 = i8;
                            i16 = i9 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr2 = objArr4;
                        int i29 = length;
                        int i30 = i13;
                        if (i15 != i14) {
                            break;
                        }
                        length = i29;
                        i3 = i30;
                    } else {
                        jArr = jArr3;
                        objArr2 = objArr4;
                        i3 = i13;
                    }
                    if (i3 == length) {
                        break;
                    }
                    i13 = i3 + 1;
                    objArr4 = objArr2;
                    jArr3 = jArr;
                }
            } else {
                c6 = 7;
                j4 = -9187201950435737472L;
                z5 = false;
            }
        } else {
            c6 = 7;
            j4 = -9187201950435737472L;
            Iterator it3 = set.iterator();
            z5 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof C) || ((C) next).d(2)) {
                    if (!((p080p.x) c0025m2.i).b(next) || (objE = ((p080p.x) c0025m2.i).e(next)) == null) {
                        it = it3;
                        obj = next;
                        str = str3;
                        c0025m0 = c0025m2;
                    } else if (objE instanceof p080p.A) {
                        p080p.A a12 = (p080p.A) objE;
                        Object[] objArr10 = a12.f10709b;
                        long[] jArr8 = a12.f10708a;
                        int length6 = jArr8.length - 2;
                        if (length6 >= 0) {
                            int i31 = 0;
                            while (true) {
                                long j14 = jArr8[i31];
                                long[] jArr9 = jArr8;
                                Object[] objArr11 = objArr10;
                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i32 = 8 - ((~(i31 - length6)) >>> 31);
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        if ((j14 & 255) < 128) {
                                            it2 = it3;
                                            N.D d8 = (N.D) objArr11[(i31 << 3) + i33];
                                            E4.k.d(str3, d8);
                                            str2 = str3;
                                            c0025m1 = c0025m2;
                                            if (E4.k.a(d8.j().f3560f, map.get(d8))) {
                                                next = next;
                                                j6 = j14;
                                                dVar2.c(d8);
                                            } else {
                                                Object objE6 = ((p080p.x) c0025m3.i).e(d8);
                                                if (objE6 != null) {
                                                    if (objE6 instanceof p080p.A) {
                                                        p080p.A a13 = (p080p.A) objE6;
                                                        Object[] objArr12 = a13.f10709b;
                                                        long[] jArr10 = a13.f10708a;
                                                        int length7 = jArr10.length - 2;
                                                        if (length7 >= 0) {
                                                            j6 = j14;
                                                            int i34 = 0;
                                                            while (true) {
                                                                long j15 = jArr10[i34];
                                                                next = next;
                                                                Object[] objArr13 = objArr12;
                                                                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                    if (i34 != length7) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i34++;
                                                                    next = next;
                                                                    objArr12 = objArr13;
                                                                } else {
                                                                    int i35 = 8 - ((~(i34 - length7)) >>> 31);
                                                                    for (int i36 = 0; i36 < i35; i36++) {
                                                                        if ((j15 & 255) < 128) {
                                                                            a6.a(objArr13[(i34 << 3) + i36]);
                                                                            z5 = true;
                                                                        }
                                                                        j15 >>= 8;
                                                                    }
                                                                    if (i35 != 8) {
                                                                        break;
                                                                    }
                                                                    if (i34 != length7) {
                                                                        break;
                                                                    }
                                                                    i34++;
                                                                    next = next;
                                                                    objArr12 = objArr13;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        next = next;
                                                        j6 = j14;
                                                        a6.a(objE6);
                                                        z5 = true;
                                                    }
                                                }
                                            }
                                            j14 = j6 >> 8;
                                            i33++;
                                            it3 = it2;
                                            str3 = str2;
                                            c0025m2 = c0025m1;
                                            next = next;
                                        } else {
                                            it2 = it3;
                                            str2 = str3;
                                            c0025m1 = c0025m2;
                                        }
                                        j6 = j14;
                                        j14 = j6 >> 8;
                                        i33++;
                                        it3 = it2;
                                        str3 = str2;
                                        c0025m2 = c0025m1;
                                        next = next;
                                    }
                                    it = it3;
                                    obj = next;
                                    str = str3;
                                    c0025m0 = c0025m2;
                                    if (i32 != 8) {
                                        break;
                                    }
                                } else {
                                    it = it3;
                                    obj = next;
                                    str = str3;
                                    c0025m0 = c0025m2;
                                }
                                if (i31 == length6) {
                                    break;
                                }
                                i31++;
                                it3 = it;
                                objArr10 = objArr11;
                                jArr8 = jArr9;
                                str3 = str;
                                c0025m2 = c0025m0;
                                next = obj;
                            }
                        } else {
                            it = it3;
                            obj = next;
                            str = str3;
                            c0025m0 = c0025m2;
                        }
                    } else {
                        it = it3;
                        obj = next;
                        str = str3;
                        c0025m0 = c0025m2;
                        N.D d9 = (N.D) objE;
                        if (E4.k.a(d9.j().f3560f, map.get(d9))) {
                            dVar2.c(d9);
                        } else {
                            Object objE7 = ((p080p.x) c0025m3.i).e(d9);
                            if (objE7 != null) {
                                if (objE7 instanceof p080p.A) {
                                    p080p.A a14 = (p080p.A) objE7;
                                    Object[] objArr14 = a14.f10709b;
                                    long[] jArr11 = a14.f10708a;
                                    int length8 = jArr11.length - 2;
                                    if (length8 >= 0) {
                                        int i37 = 0;
                                        while (true) {
                                            long j16 = jArr11[i37];
                                            if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                if (i37 != length8) {
                                                    break;
                                                    break;
                                                }
                                                i37++;
                                            } else {
                                                int i38 = 8 - ((~(i37 - length8)) >>> 31);
                                                for (int i39 = 0; i39 < i38; i39++) {
                                                    if ((j16 & 255) < 128) {
                                                        a6.a(objArr14[(i37 << 3) + i39]);
                                                        z5 = true;
                                                    }
                                                    j16 >>= 8;
                                                }
                                                if (i38 != 8) {
                                                    break;
                                                }
                                                if (i37 != length8) {
                                                    break;
                                                }
                                                i37++;
                                            }
                                        }
                                    }
                                } else {
                                    a6.a(objE7);
                                    z5 = true;
                                }
                            }
                        }
                    }
                    Object objE8 = ((p080p.x) c0025m3.i).e(obj);
                    if (objE8 != null) {
                        if (objE8 instanceof p080p.A) {
                            p080p.A a15 = (p080p.A) objE8;
                            Object[] objArr15 = a15.f10709b;
                            long[] jArr12 = a15.f10708a;
                            int length9 = jArr12.length - 2;
                            if (length9 >= 0) {
                                int i40 = 0;
                                while (true) {
                                    long j17 = jArr12[i40];
                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i40 != length9) {
                                            break;
                                            break;
                                        }
                                        i40++;
                                    } else {
                                        int i41 = 8 - ((~(i40 - length9)) >>> 31);
                                        for (int i42 = 0; i42 < i41; i42++) {
                                            if ((j17 & 255) < 128) {
                                                a6.a(objArr15[(i40 << 3) + i42]);
                                                z5 = true;
                                            }
                                            j17 >>= 8;
                                        }
                                        if (i41 != 8) {
                                            break;
                                        }
                                        if (i40 != length9) {
                                            break;
                                        }
                                        i40++;
                                    }
                                }
                            }
                        } else {
                            a6.a(objE8);
                            z5 = true;
                        }
                    }
                } else {
                    it = it3;
                    str = str3;
                    c0025m0 = c0025m2;
                }
                it3 = it;
                str3 = str;
                c0025m2 = c0025m0;
            }
        }
        if (dVar2.n()) {
            int i43 = dVar2.f4583j;
            if (i43 > 0) {
                Object[] objArr16 = dVar2.f4582h;
                int i44 = 0;
                while (true) {
                    N.D d10 = (N.D) objArr16[i44];
                    int iD = o.k().d();
                    Object objE9 = ((p080p.x) c0025m3.i).e(d10);
                    if (objE9 != null) {
                        boolean z7 = objE9 instanceof p080p.A;
                        p080p.x xVar = this.f5735f;
                        if (z7) {
                            p080p.A a16 = (p080p.A) objE9;
                            Object[] objArr17 = a16.f10709b;
                            long[] jArr13 = a16.f10708a;
                            int length10 = jArr13.length - 2;
                            if (length10 >= 0) {
                                int i45 = 0;
                                while (true) {
                                    long j18 = jArr13[i45];
                                    objArr = objArr16;
                                    i = i44;
                                    if ((((~j18) << c6) & j18 & j4) != j4) {
                                        int i46 = 8 - ((~(i45 - length10)) >>> 31);
                                        int i47 = 0;
                                        while (i47 < i46) {
                                            if ((j18 & 255) < 128) {
                                                Object obj4 = objArr17[(i45 << 3) + i47];
                                                p080p.v vVar2 = (p080p.v) xVar.e(obj4);
                                                if (vVar2 == null) {
                                                    vVar = new p080p.v();
                                                    xVar.i(obj4, vVar);
                                                } else {
                                                    vVar = vVar2;
                                                }
                                                c(d10, iD, obj4, vVar);
                                            }
                                            j18 >>= 8;
                                            i47++;
                                            dVar2 = dVar2;
                                        }
                                        dVar = dVar2;
                                        if (i46 != 8) {
                                            break;
                                        }
                                    } else {
                                        dVar = dVar2;
                                    }
                                    if (i45 == length10) {
                                        break;
                                    }
                                    i45++;
                                    i44 = i;
                                    objArr16 = objArr;
                                    dVar2 = dVar;
                                }
                            } else {
                                objArr = objArr16;
                                i = i44;
                                dVar = dVar2;
                            }
                        } else {
                            objArr = objArr16;
                            i = i44;
                            dVar = dVar2;
                            p080p.v vVar3 = (p080p.v) xVar.e(objE9);
                            if (vVar3 == null) {
                                vVar3 = new p080p.v();
                                xVar.i(objE9, vVar3);
                            }
                            c(d10, iD, objE9, vVar3);
                        }
                    } else {
                        objArr = objArr16;
                        i = i44;
                        dVar = dVar2;
                    }
                    int i48 = i + 1;
                    if (i48 >= i43) {
                        break;
                    }
                    i44 = i48;
                    objArr16 = objArr;
                    dVar2 = dVar;
                }
            } else {
                dVar = dVar2;
            }
            dVar.i();
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    public final void c(Object obj, int i, Object obj2, p080p.v vVar) {
        int i3;
        if (this.f5738j > 0) {
            return;
        }
        int iB = vVar.b(obj);
        if (iB < 0) {
            iB = ~iB;
            i3 = -1;
        } else {
            i3 = vVar.f10790c[iB];
        }
        vVar.f10789b[iB] = obj;
        vVar.f10790c[iB] = i;
        if ((obj instanceof N.D) && i3 != i) {
            N.C cJ = ((N.D) obj).j();
            this.f5740l.put(obj, cJ.f3560f);
            p080p.v vVar2 = cJ.f3559e;
            C0025m0 c0025m0 = this.f5739k;
            c0025m0.i(obj);
            Object[] objArr = vVar2.f10789b;
            long[] jArr = vVar2.f10788a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    long j4 = jArr[i6];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i6 != length) {
                            break;
                            break;
                        }
                        i6++;
                    } else {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j4 & 255) < 128) {
                                B b6 = (B) objArr[(i6 << 3) + i8];
                                if (b6 instanceof C) {
                                    ((C) b6).f(2);
                                }
                                c0025m0.c(b6, obj);
                            }
                            j4 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        } else if (i6 != length) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            }
        }
        if (i3 == -1) {
            if (obj instanceof C) {
                ((C) obj).f(2);
            }
            this.f5734e.c(obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        C0025m0 c0025m0 = this.f5734e;
        c0025m0.h(obj2, obj);
        if (!(obj2 instanceof N.D) || ((p080p.x) c0025m0.i).b(obj2)) {
            return;
        }
        this.f5739k.i(obj2);
        this.f5740l.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1 A[LOOP:2: B:16:0x0066->B:28:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0 A[EDGE_INSN: B:48:0x00b0->B:30:0x00b0 BREAK  A[LOOP:2: B:16:0x0066->B:28:0x00a1], SYNTHETIC] */
    public final void e() {
        long[] jArr;
        long[] jArr2;
        long j4;
        char c6;
        long j6;
        int i;
        boolean z5;
        p080p.x xVar = this.f5735f;
        long[] jArr3 = xVar.f10796a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j7 = jArr3[i3];
            char c7 = 7;
            long j8 = -9187201950435737472L;
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i3 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((j7 & 255) < 128) {
                        int i9 = (i3 << 3) + i8;
                        c6 = c7;
                        Object obj = xVar.f10797b[i9];
                        j6 = j8;
                        p080p.v vVar = (p080p.v) xVar.f10798c[i9];
                        E4.k.d("null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope", obj);
                        boolean z6 = ((g0) obj).z();
                        if (z6) {
                            jArr2 = jArr3;
                            j4 = j7;
                            z5 = z6;
                        } else {
                            Object[] objArr = vVar.f10789b;
                            int[] iArr = vVar.f10790c;
                            long[] jArr4 = vVar.f10788a;
                            int i10 = i6;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j4 = j7;
                                int i11 = 0;
                                while (true) {
                                    long j9 = jArr4[i11];
                                    long[] jArr5 = jArr4;
                                    z5 = z6;
                                    if ((((~j9) << c6) & j9 & j6) == j6) {
                                        if (i11 != length2) {
                                            break;
                                            break;
                                        }
                                        i11++;
                                        z6 = z5;
                                        jArr4 = jArr5;
                                        i10 = 8;
                                    } else {
                                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                        for (int i13 = 0; i13 < i12; i13++) {
                                            if ((j9 & 255) < 128) {
                                                int i14 = (i11 << 3) + i13;
                                                Object obj2 = objArr[i14];
                                                int i15 = iArr[i14];
                                                d(obj, obj2);
                                            }
                                            j9 >>= i10;
                                        }
                                        if (i12 != i10) {
                                            break;
                                        }
                                        if (i11 != length2) {
                                            break;
                                        }
                                        i11++;
                                        z6 = z5;
                                        jArr4 = jArr5;
                                        i10 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j4 = j7;
                                z5 = z6;
                            }
                        }
                        if (!z5) {
                            xVar.h(i9);
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j4 = j7;
                        c6 = c7;
                        j6 = j8;
                        i = i6;
                    }
                    i8++;
                    i6 = i;
                    j7 = j4 >> i;
                    c7 = c6;
                    j8 = j6;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i7 != i6) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            jArr3 = jArr;
        }
    }
}
