package N;

import B.C0025m0;
import O.C0304a;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: N.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0239t implements InterfaceC0232p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC0234q f3800h;
    public final p091r0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f3801j = new AtomicReference(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f3802k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p080p.z f3803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final E0 f3804m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0025m0 f3805n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p080p.A f3806o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p080p.A f3807p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0025m0 f3808q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0304a f3809r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0304a f3810s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0025m0 f3811t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0025m0 f3812u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3813v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final U f3814w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0230o f3815x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f3816y;

    public C0239t(AbstractC0234q abstractC0234q, p091r0.d dVar) {
        this.f3800h = abstractC0234q;
        this.i = dVar;
        p080p.z zVar = new p080p.z(new p080p.A());
        this.f3803l = zVar;
        E0 e6 = new E0();
        if (abstractC0234q.c()) {
            e6.f3586q = new p080p.q();
        }
        if (abstractC0234q.e()) {
            e6.g();
        }
        this.f3804m = e6;
        this.f3805n = new C0025m0(12);
        this.f3806o = new p080p.A();
        this.f3807p = new p080p.A();
        this.f3808q = new C0025m0(12);
        C0304a c0304a = new C0304a();
        this.f3809r = c0304a;
        C0304a c0304a2 = new C0304a();
        this.f3810s = c0304a2;
        this.f3811t = new C0025m0(12);
        this.f3812u = new C0025m0(12);
        this.f3814w = new U(6);
        C0230o c0230o = new C0230o(dVar, abstractC0234q, e6, zVar, c0304a, c0304a2, this);
        abstractC0234q.k(c0230o);
        this.f3815x = c0230o;
        boolean z5 = abstractC0234q instanceof C0248x0;
        V.a aVar = AbstractC0218i.f3705a;
    }

    public final void a() {
        this.f3801j.set(null);
        this.f3809r.f4349j.G0();
        this.f3810s.f4349j.G0();
        p080p.z zVar = this.f3803l;
        if (zVar.f10814h.g()) {
            return;
        }
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        if (zVar.f10814h.g()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = zVar.iterator();
            while (true) {
                L4.h hVar = (L4.h) it;
                if (!hVar.hasNext()) {
                    Trace.endSection();
                    return;
                } else {
                    InterfaceC0250y0 interfaceC0250y0 = (InterfaceC0250y0) hVar.next();
                    hVar.remove();
                    interfaceC0250y0.b();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void b(Object obj, boolean z5) {
        Object objE = ((p080p.x) this.f3805n.i).e(obj);
        if (objE == null) {
            return;
        }
        boolean z6 = objE instanceof p080p.A;
        p080p.A a6 = this.f3806o;
        p080p.A a7 = this.f3807p;
        C0025m0 c0025m0 = this.f3811t;
        if (!z6) {
            C0235q0 c0235q0 = (C0235q0) objE;
            if (c0025m0.h(obj, c0235q0) || c0235q0.c(obj) == 1) {
                return;
            }
            if (c0235q0.f3783g == null || z5) {
                a6.a(c0235q0);
                return;
            } else {
                a7.a(c0235q0);
                return;
            }
        }
        p080p.A a8 = (p080p.A) objE;
        Object[] objArr = a8.f10709b;
        long[] jArr = a8.f10708a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j4 = jArr[i];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i3; i6++) {
                    if ((255 & j4) < 128) {
                        C0235q0 c0235q1 = (C0235q0) objArr[(i << 3) + i6];
                        if (!c0025m0.h(obj, c0235q1) && c0235q1.c(obj) != 1) {
                            if (c0235q1.f3783g == null || z5) {
                                a6.a(c0235q1);
                            } else {
                                a7.a(c0235q1);
                            }
                        }
                    }
                    j4 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0248 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x024a A[LOOP:6: B:94:0x01f6->B:111:0x024a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x0257 A[EDGE_INSN: B:204:0x0257->B:113:0x0257 BREAK  A[LOOP:6: B:94:0x01f6->B:111:0x024a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0126 A[EDGE_INSN: B:224:0x0126->B:219:0x0126 BREAK  A[LOOP:13: B:63:0x0159->B:74:0x018d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x018b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x018d A[LOOP:13: B:63:0x0159->B:74:0x018d, LOOP_END] */
    public final void c(Set set, boolean z5) {
        long j4;
        long j6;
        long j7;
        char c6;
        long[] jArr;
        String str;
        String str2;
        long j8;
        boolean zC;
        String str3;
        long j9;
        long[] jArr2;
        long[] jArr3;
        int i;
        long j10;
        boolean zG;
        int i3;
        long j11;
        long[] jArr4;
        long[] jArr5;
        char c7;
        long j12;
        int i6;
        int i7;
        boolean z6 = set instanceof P.f;
        C0025m0 c0025m0 = this.f3808q;
        Object obj = null;
        int i8 = 8;
        if (z6) {
            p080p.A a6 = ((P.f) set).f4594h;
            Object[] objArr = a6.f10709b;
            long[] jArr6 = a6.f10708a;
            int length = jArr6.length - 2;
            if (length >= 0) {
                int i9 = 0;
                j4 = 128;
                j6 = 255;
                while (true) {
                    long j13 = jArr6[i9];
                    char c8 = 7;
                    j7 = -9187201950435737472L;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j13 & 255) < 128) {
                                Object obj2 = objArr[(i9 << 3) + i11];
                                c7 = c8;
                                if (obj2 instanceof C0235q0) {
                                    ((C0235q0) obj2).c(obj);
                                } else {
                                    b(obj2, z5);
                                    Object objE = ((p080p.x) c0025m0.i).e(obj2);
                                    if (objE != null) {
                                        if (objE instanceof p080p.A) {
                                            p080p.A a7 = (p080p.A) objE;
                                            Object[] objArr2 = a7.f10709b;
                                            long[] jArr7 = a7.f10708a;
                                            int length2 = jArr7.length - 2;
                                            if (length2 >= 0) {
                                                int i12 = i8;
                                                i6 = length;
                                                int i13 = 0;
                                                while (true) {
                                                    long j14 = jArr7[i13];
                                                    j12 = j13;
                                                    long[] jArr8 = jArr7;
                                                    if ((((~j14) << c7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                        int i15 = 0;
                                                        while (i15 < i14) {
                                                            if ((j14 & 255) < 128) {
                                                                b((D) objArr2[(i13 << 3) + i15], z5);
                                                            }
                                                            j14 >>= i12;
                                                            i15++;
                                                            jArr6 = jArr6;
                                                        }
                                                        jArr5 = jArr6;
                                                        if (i14 != i12) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr5 = jArr6;
                                                    }
                                                    if (i13 == length2) {
                                                        break;
                                                    }
                                                    i13++;
                                                    jArr7 = jArr8;
                                                    j13 = j12;
                                                    jArr6 = jArr5;
                                                    i12 = 8;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr6;
                                            j12 = j13;
                                            i6 = length;
                                            b((D) objE, z5);
                                        }
                                    }
                                    i7 = 8;
                                }
                                jArr5 = jArr6;
                                j12 = j13;
                                i6 = length;
                                i7 = 8;
                            } else {
                                jArr5 = jArr6;
                                c7 = c8;
                                j12 = j13;
                                i6 = length;
                                i7 = i8;
                            }
                            j13 = j12 >> i7;
                            i11++;
                            length = i6;
                            i8 = i7;
                            c8 = c7;
                            jArr6 = jArr5;
                            obj = null;
                        }
                        jArr4 = jArr6;
                        c6 = c8;
                        int i16 = length;
                        if (i10 != i8) {
                            break;
                        } else {
                            length = i16;
                        }
                    } else {
                        jArr4 = jArr6;
                        c6 = 7;
                    }
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                    jArr6 = jArr4;
                    obj = null;
                    i8 = 8;
                }
            } else {
                j4 = 128;
                j6 = 255;
                j7 = -9187201950435737472L;
                c6 = 7;
            }
        } else {
            j4 = 128;
            j6 = 255;
            j7 = -9187201950435737472L;
            c6 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof C0235q0) {
                    ((C0235q0) obj3).c(null);
                } else {
                    b(obj3, z5);
                    Object objE2 = ((p080p.x) c0025m0.i).e(obj3);
                    if (objE2 != null) {
                        if (objE2 instanceof p080p.A) {
                            p080p.A a8 = (p080p.A) objE2;
                            Object[] objArr3 = a8.f10709b;
                            long[] jArr9 = a8.f10708a;
                            int length3 = jArr9.length - 2;
                            if (length3 >= 0) {
                                int i17 = 0;
                                while (true) {
                                    long j15 = jArr9[i17];
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i17 != length3) {
                                            break;
                                            break;
                                        }
                                        i17++;
                                    } else {
                                        int i18 = 8 - ((~(i17 - length3)) >>> 31);
                                        for (int i19 = 0; i19 < i18; i19++) {
                                            if ((j15 & 255) < 128) {
                                                b((D) objArr3[(i17 << 3) + i19], z5);
                                            }
                                            j15 >>= 8;
                                        }
                                        if (i18 != 8) {
                                            break;
                                        } else if (i17 != length3) {
                                            break;
                                        } else {
                                            i17++;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((D) objE2, z5);
                        }
                    }
                }
            }
        }
        String str4 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        C0025m0 c0025m1 = this.f3805n;
        p080p.A a9 = this.f3806o;
        if (z5) {
            p080p.A a10 = this.f3807p;
            if (a10.h()) {
                p080p.x xVar = (p080p.x) c0025m1.i;
                long[] jArr10 = xVar.f10796a;
                int length4 = jArr10.length - 2;
                if (length4 >= 0) {
                    int i20 = 0;
                    while (true) {
                        long j16 = jArr10[i20];
                        if ((((~j16) << c6) & j16 & j7) != j7) {
                            int i21 = 8 - ((~(i20 - length4)) >>> 31);
                            int i22 = 0;
                            while (i22 < i21) {
                                if ((j16 & j6) < j4) {
                                    int i23 = (i20 << 3) + i22;
                                    Object obj4 = xVar.f10797b[i23];
                                    Object obj5 = xVar.f10798c[i23];
                                    if (obj5 instanceof p080p.A) {
                                        E4.k.d("null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>", obj5);
                                        p080p.A a11 = (p080p.A) obj5;
                                        Object[] objArr4 = a11.f10709b;
                                        long[] jArr11 = a11.f10708a;
                                        int length5 = jArr11.length - 2;
                                        if (length5 >= 0) {
                                            j10 = j16;
                                            int i24 = 0;
                                            while (true) {
                                                long j17 = jArr11[i24];
                                                jArr3 = jArr10;
                                                i = length4;
                                                if ((((~j17) << c6) & j17 & j7) != j7) {
                                                    int i25 = 8 - ((~(i24 - length5)) >>> 31);
                                                    for (int i26 = 0; i26 < i25; i26 = i3 + 1) {
                                                        if ((j17 & j6) < j4) {
                                                            i3 = i26;
                                                            int i27 = (i24 << 3) + i3;
                                                            j11 = j17;
                                                            C0235q0 c0235q0 = (C0235q0) objArr4[i27];
                                                            if (a10.c(c0235q0) || a9.c(c0235q0)) {
                                                                a11.k(i27);
                                                            }
                                                        } else {
                                                            i3 = i26;
                                                            j11 = j17;
                                                        }
                                                        j17 = j11 >> 8;
                                                    }
                                                    if (i25 != 8) {
                                                        break;
                                                    }
                                                    if (i24 != length5) {
                                                        break;
                                                    }
                                                    i24++;
                                                    length4 = i;
                                                    jArr10 = jArr3;
                                                } else if (i24 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i24++;
                                                    length4 = i;
                                                    jArr10 = jArr3;
                                                }
                                            }
                                        } else {
                                            jArr3 = jArr10;
                                            i = length4;
                                            j10 = j16;
                                        }
                                        zG = a11.g();
                                    } else {
                                        jArr3 = jArr10;
                                        i = length4;
                                        j10 = j16;
                                        E4.k.d("null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2", obj5);
                                        C0235q0 c0235q1 = (C0235q0) obj5;
                                        zG = a10.c(c0235q1) || a9.c(c0235q1);
                                    }
                                    if (zG) {
                                        xVar.h(i23);
                                    }
                                } else {
                                    jArr3 = jArr10;
                                    i = length4;
                                    j10 = j16;
                                }
                                j16 = j10 >> 8;
                                i22++;
                                length4 = i;
                                jArr10 = jArr3;
                            }
                            jArr2 = jArr10;
                            int i28 = length4;
                            if (i21 != 8) {
                                break;
                            } else {
                                length4 = i28;
                            }
                        } else {
                            jArr2 = jArr10;
                        }
                        if (i20 == length4) {
                            break;
                        }
                        i20++;
                        jArr10 = jArr2;
                    }
                }
                a10.b();
                h();
                return;
            }
        }
        if (a9.h()) {
            p080p.x xVar2 = (p080p.x) c0025m1.i;
            long[] jArr12 = xVar2.f10796a;
            int length6 = jArr12.length - 2;
            if (length6 >= 0) {
                int i29 = 0;
                while (true) {
                    long j18 = jArr12[i29];
                    if ((((~j18) << c6) & j18 & j7) != j7) {
                        int i30 = 8 - ((~(i29 - length6)) >>> 31);
                        int i31 = 0;
                        while (i31 < i30) {
                            if ((j18 & j6) < j4) {
                                int i32 = (i29 << 3) + i31;
                                Object obj6 = xVar2.f10797b[i32];
                                Object obj7 = xVar2.f10798c[i32];
                                if (obj7 instanceof p080p.A) {
                                    E4.k.d(str4, obj7);
                                    p080p.A a12 = (p080p.A) obj7;
                                    Object[] objArr5 = a12.f10709b;
                                    long[] jArr13 = a12.f10708a;
                                    int length7 = jArr13.length - 2;
                                    if (length7 >= 0) {
                                        j8 = j18;
                                        int i33 = 0;
                                        while (true) {
                                            long j19 = jArr13[i33];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr14 = jArr13;
                                            if ((((~j19) << c6) & j19 & j7) != j7) {
                                                int i34 = 8 - ((~(i33 - length7)) >>> 31);
                                                int i35 = 0;
                                                while (i35 < i34) {
                                                    if ((j19 & j6) < j4) {
                                                        str3 = str4;
                                                        int i36 = (i33 << 3) + i35;
                                                        j9 = j19;
                                                        if (a9.c((C0235q0) objArr6[i36])) {
                                                            a12.k(i36);
                                                        }
                                                    } else {
                                                        str3 = str4;
                                                        j9 = j19;
                                                    }
                                                    i35++;
                                                    str4 = str3;
                                                    j19 = j9 >> 8;
                                                }
                                                str2 = str4;
                                                if (i34 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str4;
                                            }
                                            if (i33 == length7) {
                                                break;
                                            }
                                            i33++;
                                            objArr5 = objArr6;
                                            jArr13 = jArr14;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = str4;
                                        j8 = j18;
                                    }
                                    zC = a12.g();
                                } else {
                                    str2 = str4;
                                    j8 = j18;
                                    E4.k.d("null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2", obj7);
                                    zC = a9.c((C0235q0) obj7);
                                }
                                if (zC) {
                                    xVar2.h(i32);
                                }
                            } else {
                                jArr12 = jArr12;
                                str2 = str4;
                                j8 = j18;
                            }
                            j18 = j8 >> 8;
                            i31++;
                            jArr12 = jArr12;
                            str4 = str2;
                        }
                        jArr = jArr12;
                        str = str4;
                        if (i30 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr12;
                        str = str4;
                    }
                    if (i29 == length6) {
                        break;
                    }
                    i29++;
                    jArr12 = jArr;
                    str4 = str;
                }
            }
            h();
            a9.b();
        }
    }

    public final void d() {
        synchronized (this.f3802k) {
            try {
                e(this.f3809r);
                n();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f3803l.f10814h.g()) {
                            p080p.z zVar = this.f3803l;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!zVar.f10814h.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = zVar.iterator();
                                    while (((L4.k) ((L4.h) it).i).hasNext()) {
                                        InterfaceC0250y0 interfaceC0250y0 = (InterfaceC0250y0) ((L4.k) ((L4.h) it).i).next();
                                        ((L4.h) it).remove();
                                        interfaceC0250y0.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e6) {
                        a();
                        throw e6;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01d4  */
    public final void e(C0304a c0304a) throws Throwable {
        C0237s c0237s;
        long[] jArr;
        int i;
        C0237s c0237s2;
        long[] jArr2;
        long j4;
        char c6;
        long j6;
        int i3;
        boolean zG;
        int i6;
        p091r0.d dVar = this.i;
        C0304a c0304a2 = this.f3810s;
        C0237s c0237s3 = new C0237s(this.f3803l);
        try {
            if (c0304a.f4349j.I0()) {
                if (c0304a2.f4349j.I0()) {
                    c0237s3.d();
                    return;
                }
                return;
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    G0 g0J = this.f3804m.j();
                    int i7 = 0;
                    try {
                        c0304a.f4349j.H0(dVar, g0J, c0237s3);
                        g0J.e(true);
                        dVar.j();
                        Trace.endSection();
                        c0237s3.e();
                        ArrayList arrayList = (ArrayList) c0237s3.f3795e;
                        if (!arrayList.isEmpty()) {
                            Trace.beginSection("Compose:sideeffects");
                            try {
                                int size = arrayList.size();
                                for (int i8 = 0; i8 < size; i8++) {
                                    ((D4.a) arrayList.get(i8)).invoke();
                                }
                                arrayList.clear();
                                Trace.endSection();
                            } catch (Throwable th) {
                                Trace.endSection();
                                throw th;
                            }
                        }
                        if (this.f3813v) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f3813v = false;
                                p080p.x xVar = (p080p.x) this.f3805n.i;
                                long[] jArr3 = xVar.f10796a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i9 = 0;
                                    while (true) {
                                        long j7 = jArr3[i9];
                                        char c7 = 7;
                                        long j8 = -9187201950435737472L;
                                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8;
                                            int i11 = 8 - ((~(i9 - length)) >>> 31);
                                            int i12 = i7;
                                            while (i12 < i11) {
                                                if ((j7 & 255) < 128) {
                                                    c6 = c7;
                                                    int i13 = (i9 << 3) + i12;
                                                    j6 = j8;
                                                    Object obj = xVar.f10797b[i13];
                                                    Object obj2 = xVar.f10798c[i13];
                                                    if (obj2 instanceof p080p.A) {
                                                        E4.k.d("null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>", obj2);
                                                        p080p.A a6 = (p080p.A) obj2;
                                                        Object[] objArr = a6.f10709b;
                                                        long[] jArr4 = a6.f10708a;
                                                        int i14 = i10;
                                                        int length2 = jArr4.length - 2;
                                                        if (length2 >= 0) {
                                                            c0237s2 = c0237s3;
                                                            jArr2 = jArr3;
                                                            int i15 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j9 = jArr4[i15];
                                                                    j4 = j7;
                                                                    if ((((~j9) << c6) & j9 & j6) != j6) {
                                                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                                        int i17 = 0;
                                                                        while (i17 < i16) {
                                                                            if ((j9 & 255) < 128) {
                                                                                i6 = i12;
                                                                                int i18 = (i15 << 3) + i17;
                                                                                if (!((C0235q0) objArr[i18]).b()) {
                                                                                    a6.k(i18);
                                                                                }
                                                                            } else {
                                                                                i6 = i12;
                                                                            }
                                                                            j9 >>= i14;
                                                                            i17++;
                                                                            i12 = i6;
                                                                        }
                                                                        i = i12;
                                                                        if (i16 != i14) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        i = i12;
                                                                    }
                                                                    if (i15 == length2) {
                                                                        break;
                                                                    }
                                                                    i15++;
                                                                    j7 = j4;
                                                                    i12 = i;
                                                                    i14 = 8;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            i = i12;
                                                            c0237s2 = c0237s3;
                                                            jArr2 = jArr3;
                                                            j4 = j7;
                                                        }
                                                        zG = a6.g();
                                                    } else {
                                                        i = i12;
                                                        c0237s2 = c0237s3;
                                                        jArr2 = jArr3;
                                                        j4 = j7;
                                                        E4.k.d("null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2", obj2);
                                                        zG = !((C0235q0) obj2).b();
                                                    }
                                                    if (zG) {
                                                        xVar.h(i13);
                                                    }
                                                    i3 = 8;
                                                } else {
                                                    i = i12;
                                                    c0237s2 = c0237s3;
                                                    jArr2 = jArr3;
                                                    j4 = j7;
                                                    c6 = c7;
                                                    j6 = j8;
                                                    i3 = i10;
                                                }
                                                j7 = j4 >> i3;
                                                i10 = i3;
                                                c7 = c6;
                                                j8 = j6;
                                                c0237s3 = c0237s2;
                                                jArr3 = jArr2;
                                                i12 = i + 1;
                                            }
                                            c0237s = c0237s3;
                                            jArr = jArr3;
                                            if (i11 != i10) {
                                                break;
                                            }
                                        } else {
                                            c0237s = c0237s3;
                                            jArr = jArr3;
                                        }
                                        if (i9 == length) {
                                            break;
                                        }
                                        i9++;
                                        c0237s3 = c0237s;
                                        jArr3 = jArr;
                                        i7 = 0;
                                    }
                                } else {
                                    c0237s = c0237s3;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            c0237s = c0237s3;
                        }
                        if (c0304a2.f4349j.I0()) {
                            c0237s.d();
                        }
                    } catch (Throwable th4) {
                        try {
                            g0J.e(false);
                            throw th4;
                        } catch (Throwable th5) {
                            th = th5;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                if (c0304a2.f4349j.I0()) {
                    c0237s3.d();
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (c0304a2.f4349j.I0()) {
                c0237s3.d();
            }
            throw th;
        }
    }

    public final void f() {
        synchronized (this.f3802k) {
            try {
                if (this.f3810s.f4349j.J0()) {
                    e(this.f3810s);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f3803l.f10814h.g()) {
                            p080p.z zVar = this.f3803l;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!zVar.f10814h.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = zVar.iterator();
                                    while (((L4.k) ((L4.h) it).i).hasNext()) {
                                        InterfaceC0250y0 interfaceC0250y0 = (InterfaceC0250y0) ((L4.k) ((L4.h) it).i).next();
                                        ((L4.h) it).remove();
                                        interfaceC0250y0.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e6) {
                        a();
                        throw e6;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f3802k) {
            try {
                this.f3815x.f3764u = null;
                if (!this.f3803l.f10814h.g()) {
                    p080p.z zVar = this.f3803l;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!zVar.f10814h.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = zVar.iterator();
                            while (true) {
                                L4.h hVar = (L4.h) it;
                                if (!hVar.hasNext()) {
                                    break;
                                }
                                InterfaceC0250y0 interfaceC0250y0 = (InterfaceC0250y0) hVar.next();
                                hVar.remove();
                                interfaceC0250y0.b();
                            }
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f3803l.f10814h.g()) {
                            p080p.z zVar2 = this.f3803l;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!zVar2.f10814h.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it2 = zVar2.iterator();
                                    while (true) {
                                        L4.h hVar2 = (L4.h) it2;
                                        if (!hVar2.hasNext()) {
                                            break;
                                        }
                                        InterfaceC0250y0 interfaceC0250y1 = (InterfaceC0250y0) hVar2.next();
                                        hVar2.remove();
                                        interfaceC0250y1.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e6) {
                        a();
                        throw e6;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae A[LOOP:2: B:16:0x0063->B:30:0x00ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x00bd A[EDGE_INSN: B:83:0x00bd->B:32:0x00bd BREAK  A[LOOP:2: B:16:0x0063->B:30:0x00ae], SYNTHETIC] */
    public final void h() {
        long j4;
        char c6;
        long j6;
        long j7;
        long[] jArr;
        long[] jArr2;
        int i;
        long j8;
        long j9;
        char c7;
        long j10;
        int i3;
        boolean zG;
        int i6;
        long j11;
        p080p.x xVar = (p080p.x) this.f3808q.i;
        long[] jArr3 = xVar.f10796a;
        int length = jArr3.length - 2;
        long j12 = 255;
        char c8 = 7;
        long j13 = -9187201950435737472L;
        int i7 = 8;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j14 = jArr3[i8];
                j7 = 128;
                if ((((~j14) << c8) & j14 & j13) != j13) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j14 & j12) < 128) {
                            j9 = j12;
                            int i11 = (i8 << 3) + i10;
                            Object obj = xVar.f10797b[i11];
                            Object obj2 = xVar.f10798c[i11];
                            c7 = c8;
                            boolean z5 = obj2 instanceof p080p.A;
                            j10 = j13;
                            C0025m0 c0025m0 = this.f3805n;
                            if (z5) {
                                E4.k.d("null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>", obj2);
                                p080p.A a6 = (p080p.A) obj2;
                                Object[] objArr = a6.f10709b;
                                long[] jArr4 = a6.f10708a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j8 = j14;
                                    int i12 = i7;
                                    int i13 = 0;
                                    while (true) {
                                        long j15 = jArr4[i13];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j15) << c7) & j15 & j10) == j10) {
                                            if (i13 != length2) {
                                                break;
                                                break;
                                            }
                                            i13++;
                                            jArr3 = jArr2;
                                            length = i;
                                            i12 = 8;
                                        } else {
                                            int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                            int i15 = 0;
                                            while (i15 < i14) {
                                                if ((j15 & j9) < 128) {
                                                    i6 = i15;
                                                    int i16 = (i13 << 3) + i6;
                                                    j11 = j15;
                                                    if (!((p080p.x) c0025m0.i).b((D) objArr[i16])) {
                                                        a6.k(i16);
                                                    }
                                                } else {
                                                    i6 = i15;
                                                    j11 = j15;
                                                }
                                                j15 = j11 >> i12;
                                                i15 = i6 + 1;
                                            }
                                            if (i14 != i12) {
                                                break;
                                            }
                                            if (i13 != length2) {
                                                break;
                                            }
                                            i13++;
                                            jArr3 = jArr2;
                                            length = i;
                                            i12 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j8 = j14;
                                }
                                zG = a6.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j8 = j14;
                                E4.k.d("null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2", obj2);
                                zG = !((p080p.x) c0025m0.i).b((D) obj2);
                            }
                            if (zG) {
                                xVar.h(i11);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j8 = j14;
                            j9 = j12;
                            c7 = c8;
                            j10 = j13;
                            i3 = i7;
                        }
                        j14 = j8 >> i3;
                        i10++;
                        i7 = i3;
                        c8 = c7;
                        j12 = j9;
                        j13 = j10;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i17 = length;
                    j4 = j12;
                    c6 = c8;
                    j6 = j13;
                    if (i9 != i7) {
                        break;
                    } else {
                        length = i17;
                    }
                } else {
                    jArr = jArr3;
                    j4 = j12;
                    c6 = c8;
                    j6 = j13;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                c8 = c6;
                j12 = j4;
                j13 = j6;
                jArr3 = jArr;
                i7 = 8;
            }
        } else {
            j4 = 255;
            c6 = 7;
            j6 = -9187201950435737472L;
            j7 = 128;
        }
        p080p.A a7 = this.f3807p;
        if (!a7.h()) {
            return;
        }
        Object[] objArr2 = a7.f10709b;
        long[] jArr5 = a7.f10708a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            long j16 = jArr5[i18];
            if ((((~j16) << c6) & j16 & j6) != j6) {
                int i19 = 8 - ((~(i18 - length3)) >>> 31);
                for (int i20 = 0; i20 < i19; i20++) {
                    if ((j16 & j4) < j7) {
                        int i21 = (i18 << 3) + i20;
                        if (!(((C0235q0) objArr2[i21]).f3783g != null)) {
                            a7.k(i21);
                        }
                    }
                    j16 >>= 8;
                }
                if (i19 != 8) {
                    return;
                }
            }
            if (i18 == length3) {
                return;
            } else {
                i18++;
            }
        }
    }

    public final void i(V.a aVar) throws Exception {
        try {
            synchronized (this.f3802k) {
                m();
                C0025m0 c0025m0 = this.f3812u;
                this.f3812u = new C0025m0(12);
                try {
                    this.f3814w.getClass();
                    this.f3800h.getClass();
                    C0230o c0230o = this.f3815x;
                    if (!c0230o.f3749e.f4349j.I0()) {
                        C0208d.w("Expected applyChanges() to have been called");
                        throw null;
                    }
                    c0230o.n(c0025m0, aVar);
                } catch (Exception e6) {
                    this.f3812u = c0025m0;
                    throw e6;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f3803l.f10814h.g()) {
                    p080p.z zVar = this.f3803l;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!zVar.f10814h.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = zVar.iterator();
                            while (((L4.k) ((L4.h) it).i).hasNext()) {
                                InterfaceC0250y0 interfaceC0250y0 = (InterfaceC0250y0) ((L4.k) ((L4.h) it).i).next();
                                ((L4.h) it).remove();
                                interfaceC0250y0.b();
                            }
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
                throw th;
            } catch (Exception e7) {
                a();
                throw e7;
            }
        }
    }

    public final void j(V.a aVar) {
        if (this.f3816y) {
            C0208d.T("The composition is disposed");
            throw null;
        }
        this.f3800h.a(this, aVar);
    }

    public final void k() {
        synchronized (this.f3802k) {
            try {
                boolean z5 = this.f3804m.i > 0;
                if (z5 || !this.f3803l.f10814h.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        C0237s c0237s = new C0237s(this.f3803l);
                        if (z5) {
                            G0 g0J = this.f3804m.j();
                            try {
                                C0208d.A(g0J, c0237s);
                                g0J.e(true);
                                this.i.j();
                                c0237s.e();
                            } catch (Throwable th) {
                                g0J.e(false);
                                throw th;
                            }
                        }
                        c0237s.d();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                ((p080p.x) this.f3805n.i).a();
                ((p080p.x) this.f3808q.i).a();
                ((p080p.x) this.f3812u.i).a();
                this.f3809r.f4349j.G0();
                this.f3810s.f4349j.G0();
                C0230o c0230o = this.f3815x;
                c0230o.f3736D.f3729h.clear();
                c0230o.f3761r.clear();
                c0230o.f3749e.f4349j.G0();
                c0230o.f3764u = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void l() {
        synchronized (this.f3802k) {
            try {
                C0230o c0230o = this.f3815x;
                if (c0230o.f3737E) {
                    C0208d.T("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                    throw null;
                }
                if (!this.f3816y) {
                    this.f3816y = true;
                    V.a aVar = AbstractC0218i.f3706b;
                    C0304a c0304a = c0230o.f3739K;
                    if (c0304a != null) {
                        e(c0304a);
                    }
                    boolean z5 = this.f3804m.i > 0;
                    if (z5 || !this.f3803l.f10814h.g()) {
                        C0237s c0237s = new C0237s(this.f3803l);
                        if (z5) {
                            G0 g0J = this.f3804m.j();
                            try {
                                C0208d.O(g0J, c0237s);
                                g0J.e(true);
                                this.i.b();
                                this.i.j();
                                c0237s.e();
                            } catch (Throwable th) {
                                g0J.e(false);
                                throw th;
                            }
                        }
                        c0237s.d();
                    }
                    C0230o c0230o2 = this.f3815x;
                    c0230o2.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c0230o2.f3746b.n(c0230o2);
                        c0230o2.f3736D.f3729h.clear();
                        c0230o2.f3761r.clear();
                        c0230o2.f3749e.f4349j.G0();
                        c0230o2.f3764u = null;
                        c0230o2.f3745a.b();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f3800h.o(this);
    }

    public final void m() {
        AtomicReference atomicReference = this.f3801j;
        Object obj = C0208d.f3693g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                C0208d.x("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                C0208d.x("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f3801j;
        Object andSet = atomicReference.getAndSet(null);
        if (E4.k.a(andSet, C0208d.f3693g)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            C0208d.x("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        }
        C0208d.x("corrupt pendingModifications drain: " + atomicReference);
        throw null;
    }

    public final void o(ArrayList arrayList) throws Exception {
        if (arrayList.size() > 0) {
            ((Y) ((p084p4.h) arrayList.get(0)).f10849h).getClass();
            throw null;
        }
        C0208d.P(true);
        try {
            C0230o c0230o = this.f3815x;
            c0230o.getClass();
            try {
                c0230o.C(arrayList);
                c0230o.i();
            } catch (Throwable th) {
                c0230o.a();
                throw th;
            }
        } catch (Throwable th2) {
            p080p.z zVar = this.f3803l;
            try {
                if (!zVar.f10814h.g()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!zVar.f10814h.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = zVar.iterator();
                            while (true) {
                                L4.h hVar = (L4.h) it;
                                if (!hVar.hasNext()) {
                                    break;
                                }
                                InterfaceC0250y0 interfaceC0250y0 = (InterfaceC0250y0) hVar.next();
                                hVar.remove();
                                interfaceC0250y0.b();
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e6) {
                a();
                throw e6;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e9 A[Catch: all -> 0x0081, LOOP:0: B:52:0x00af->B:64:0x00e9, LOOP_END, TryCatch #0 {all -> 0x0081, blocks: (B:28:0x0052, B:30:0x0059, B:37:0x0068, B:39:0x0074, B:42:0x0084, B:44:0x0088, B:45:0x0094, B:47:0x00a0, B:49:0x00a4, B:52:0x00af, B:54:0x00bf, B:56:0x00cb, B:58:0x00d5, B:61:0x00e0, B:64:0x00e9, B:65:0x00ed, B:68:0x00f2), top: B:78:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f2 A[Catch: all -> 0x0081, EDGE_INSN: B:68:0x00f2->B:69:0x00f7 BREAK  A[LOOP:0: B:52:0x00af->B:64:0x00e9], TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:28:0x0052, B:30:0x0059, B:37:0x0068, B:39:0x0074, B:42:0x0084, B:44:0x0088, B:45:0x0094, B:47:0x00a0, B:49:0x00a4, B:52:0x00af, B:54:0x00bf, B:56:0x00cb, B:58:0x00d5, B:61:0x00e0, B:64:0x00e9, B:65:0x00ed, B:68:0x00f2), top: B:78:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2 A[SYNTHETIC] */
    public final int p(C0235q0 c0235q0, Object obj) {
        int iQ;
        int i = c0235q0.f3777a;
        if ((i & 2) != 0) {
            c0235q0.f3777a = i | 4;
        }
        C0206c c0206c = c0235q0.f3779c;
        if (c0206c != null && c0206c.a()) {
            E0 e6 = this.f3804m;
            e6.getClass();
            if (!(c0206c.a() && (iQ = C0208d.Q(e6.f3584o, c0206c.f3685a, e6.i)) >= 0 && E4.k.a(e6.f3584o.get(iQ), c0206c))) {
                synchronized (this.f3802k) {
                }
                return 1;
            }
            if (c0235q0.f3780d != null) {
                synchronized (this.f3802k) {
                    try {
                        C0230o c0230o = this.f3815x;
                        if (c0230o.f3737E && c0230o.b0(c0235q0, obj)) {
                            return 4;
                        }
                        this.f3814w.getClass();
                        this.f3800h.getClass();
                        if (obj == null) {
                            ((p080p.x) this.f3812u.i).i(c0235q0, U.f3672l);
                        } else if (obj instanceof D) {
                            Object objE = ((p080p.x) this.f3812u.i).e(c0235q0);
                            if (objE == null) {
                                this.f3812u.c(c0235q0, obj);
                                break;
                            }
                            if (objE instanceof p080p.A) {
                                p080p.A a6 = (p080p.A) objE;
                                Object[] objArr = a6.f10709b;
                                long[] jArr = a6.f10708a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    this.f3812u.c(c0235q0, obj);
                                    break;
                                }
                                int i3 = 0;
                                loop0: while (true) {
                                    long j4 = jArr[i3];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i6 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i7 = 0; i7 < i6; i7++) {
                                            if ((j4 & 255) < 128 && objArr[(i3 << 3) + i7] == U.f3672l) {
                                                break loop0;
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i6 == 8) {
                                            if (i3 == length) {
                                                i3++;
                                            }
                                        }
                                        this.f3812u.c(c0235q0, obj);
                                        break;
                                    }
                                    if (i3 == length) {
                                        this.f3812u.c(c0235q0, obj);
                                        break;
                                    }
                                    i3++;
                                }
                            } else {
                                if (objE != U.f3672l) {
                                    this.f3812u.c(c0235q0, obj);
                                    break;
                                }
                            }
                        } else {
                            ((p080p.x) this.f3812u.i).i(c0235q0, U.f3672l);
                        }
                        this.f3800h.i(this);
                        return this.f3815x.f3737E ? 3 : 2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return 1;
    }

    public final void q() {
        C0239t c0239t;
        synchronized (this.f3802k) {
            try {
                for (Object obj : this.f3804m.f3579j) {
                    C0235q0 c0235q0 = obj instanceof C0235q0 ? (C0235q0) obj : null;
                    if (c0235q0 != null && (c0239t = c0235q0.f3778b) != null) {
                        c0239t.p(c0235q0, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(Object obj) {
        Object objE = ((p080p.x) this.f3805n.i).e(obj);
        if (objE == null) {
            return;
        }
        boolean z5 = objE instanceof p080p.A;
        C0025m0 c0025m0 = this.f3811t;
        if (!z5) {
            C0235q0 c0235q0 = (C0235q0) objE;
            if (c0235q0.c(obj) == 4) {
                c0025m0.c(obj, c0235q0);
                return;
            }
            return;
        }
        p080p.A a6 = (p080p.A) objE;
        Object[] objArr = a6.f10709b;
        long[] jArr = a6.f10708a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j4 = jArr[i];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i3; i6++) {
                    if ((255 & j4) < 128) {
                        C0235q0 c0235q1 = (C0235q0) objArr[(i << 3) + i6];
                        if (c0235q1.c(obj) == 4) {
                            c0025m0.c(obj, c0235q1);
                        }
                    }
                    j4 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0063 A[LOOP:0: B:7:0x001c->B:21:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b A[SYNTHETIC] */
    public final boolean s(Set set) {
        boolean z5 = set instanceof P.f;
        C0025m0 c0025m0 = this.f3808q;
        C0025m0 c0025m1 = this.f3805n;
        if (z5) {
            p080p.A a6 = ((P.f) set).f4594h;
            Object[] objArr = a6.f10709b;
            long[] jArr = a6.f10708a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j4 = jArr[i];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i - length)) >>> 31);
                        for (int i6 = 0; i6 < i3; i6++) {
                            if ((255 & j4) < 128) {
                                Object obj = objArr[(i << 3) + i6];
                                if (((p080p.x) c0025m1.i).b(obj) || ((p080p.x) c0025m0.i).b(obj)) {
                                    break loop0;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i3 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (((p080p.x) c0025m1.i).b(obj2) || ((p080p.x) c0025m0.i).b(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean t() {
        boolean zF;
        synchronized (this.f3802k) {
            try {
                m();
                try {
                    C0025m0 c0025m0 = this.f3812u;
                    this.f3812u = new C0025m0(12);
                    try {
                        this.f3814w.getClass();
                        this.f3800h.getClass();
                        zF = this.f3815x.F(c0025m0);
                        if (!zF) {
                            n();
                        }
                    } catch (Exception e6) {
                        this.f3812u = c0025m0;
                        throw e6;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.f3803l.f10814h.g()) {
                            p080p.z zVar = this.f3803l;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!zVar.f10814h.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = zVar.iterator();
                                    while (((L4.k) ((L4.h) it).i).hasNext()) {
                                        InterfaceC0250y0 interfaceC0250y0 = (InterfaceC0250y0) ((L4.k) ((L4.h) it).i).next();
                                        ((L4.h) it).remove();
                                        interfaceC0250y0.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e7) {
                        a();
                        throw e7;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(P.f fVar) {
        Object obj;
        while (true) {
            Object obj2 = this.f3801j.get();
            if (obj2 == null ? true : obj2.equals(C0208d.f3693g)) {
                obj = fVar;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, fVar};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f3801j).toString());
                }
                E4.k.d("null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>", obj2);
                Set[] setArr = (Set[]) obj2;
                E4.k.f("<this>", setArr);
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = fVar;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f3801j;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.f3802k) {
                            n();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00be A[LOOP:0: B:28:0x0070->B:43:0x00be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1 A[EDGE_INSN: B:50:0x00c1->B:44:0x00c1 BREAK  A[LOOP:0: B:28:0x0070->B:43:0x00be], SYNTHETIC] */
    public final void v(Object obj) {
        C0235q0 c0235q0Y;
        int i;
        C0230o c0230o = this.f3815x;
        if (c0230o.f3769z <= 0 && (c0235q0Y = c0230o.y()) != null) {
            int i3 = c0235q0Y.f3777a | 1;
            c0235q0Y.f3777a = i3;
            if ((i3 & 32) == 0) {
                p080p.v vVar = c0235q0Y.f3782f;
                if (vVar == null) {
                    vVar = new p080p.v();
                    c0235q0Y.f3782f = vVar;
                }
                int i6 = c0235q0Y.f3781e;
                int iB = vVar.b(obj);
                if (iB < 0) {
                    iB = ~iB;
                    i = -1;
                } else {
                    i = vVar.f10790c[iB];
                }
                vVar.f10789b[iB] = obj;
                vVar.f10790c[iB] = i6;
                if (i == c0235q0Y.f3781e) {
                    return;
                }
            }
            if (obj instanceof X.C) {
                ((X.C) obj).f(1);
            }
            this.f3805n.c(obj, c0235q0Y);
            if (obj instanceof D) {
                D d6 = (D) obj;
                C cJ = d6.j();
                C0025m0 c0025m0 = this.f3808q;
                c0025m0.i(obj);
                p080p.v vVar2 = cJ.f3559e;
                Object[] objArr = vVar2.f10789b;
                long[] jArr = vVar2.f10788a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j4 = jArr[i7];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i7 != length) {
                                break;
                                break;
                            }
                            i7++;
                        } else {
                            int i8 = 8;
                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                            int i10 = 0;
                            while (i10 < i9) {
                                if ((j4 & 255) < 128) {
                                    X.B b6 = (X.B) objArr[(i7 << 3) + i10];
                                    if (b6 instanceof X.C) {
                                        ((X.C) b6).f(1);
                                    }
                                    c0025m0.c(b6, obj);
                                }
                                j4 >>= i8;
                                i10++;
                                i8 = i8;
                            }
                            if (i9 != i8) {
                                break;
                            } else if (i7 != length) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                    }
                }
                Object obj2 = cJ.f3560f;
                p080p.x xVar = c0235q0Y.f3783g;
                if (xVar == null) {
                    xVar = new p080p.x();
                    c0235q0Y.f3783g = xVar;
                }
                xVar.i(d6, obj2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005d A[Catch: all -> 0x0053, LOOP:0: B:11:0x0023->B:23:0x005d, LOOP_END, TryCatch #0 {all -> 0x0053, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0016, B:11:0x0023, B:13:0x0033, B:15:0x003f, B:17:0x0048, B:20:0x0055, B:23:0x005d, B:24:0x0060), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0065 A[EDGE_INSN: B:31:0x0065->B:25:0x0065 BREAK  A[LOOP:0: B:11:0x0023->B:23:0x005d], SYNTHETIC] */
    public final void w(Object obj) {
        synchronized (this.f3802k) {
            try {
                r(obj);
                Object objE = ((p080p.x) this.f3808q.i).e(obj);
                if (objE != null) {
                    if (objE instanceof p080p.A) {
                        p080p.A a6 = (p080p.A) objE;
                        Object[] objArr = a6.f10709b;
                        long[] jArr = a6.f10708a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j4 = jArr[i];
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i3 = 8 - ((~(i - length)) >>> 31);
                                    for (int i6 = 0; i6 < i3; i6++) {
                                        if ((255 & j4) < 128) {
                                            r((D) objArr[(i << 3) + i6]);
                                        }
                                        j4 >>= 8;
                                    }
                                    if (i3 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        r((D) objE);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
