package N;

import B.AbstractC0013g0;
import B.C0025m0;
import O.C0304a;
import O.C0305b;
import O.C0306c;
import android.os.Trace;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p124x0.C1106n;

/* JADX INFO: renamed from: N.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0230o {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f3733A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f3734B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0228n f3735C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0227m0 f3736D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f3737E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public D0 f3738F;
    public E0 G;
    public G0 H;
    public boolean I;
    public InterfaceC0225l0 J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C0304a f3739K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C0305b f3740L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C0206c f3741M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C0306c f3742N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f3743O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f3744P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p091r0.d f3745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0234q f3746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E0 f3747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p080p.z f3748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0304a f3749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0304a f3750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0239t f3751g;
    public C0223k0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3755l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f3757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p080p.o f3758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3760q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0025m0 f3764u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3765v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3767x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f3769z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0227m0 f3752h = new C0227m0(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final L f3756m = new L();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f3761r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final L f3762s = new L();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC0225l0 f3763t = V.e.f5395k;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final L f3766w = new L();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3768y = -1;

    public C0230o(p091r0.d dVar, AbstractC0234q abstractC0234q, E0 e6, p080p.z zVar, C0304a c0304a, C0304a c0304a2, C0239t c0239t) {
        this.f3745a = dVar;
        this.f3746b = abstractC0234q;
        this.f3747c = e6;
        this.f3748d = zVar;
        this.f3749e = c0304a;
        this.f3750f = c0304a2;
        this.f3751g = c0239t;
        this.f3734B = abstractC0234q.e() || abstractC0234q.c();
        this.f3735C = new C0228n(0, this);
        this.f3736D = new C0227m0(1);
        D0 d0I = e6.i();
        d0I.c();
        this.f3738F = d0I;
        E0 e7 = new E0();
        if (abstractC0234q.e()) {
            e7.g();
        }
        if (abstractC0234q.c()) {
            e7.f3586q = new p080p.q();
        }
        this.G = e7;
        G0 g0J = e7.j();
        g0J.e(true);
        this.H = g0J;
        this.f3740L = new C0305b(this, c0304a);
        D0 d0I2 = this.G.i();
        try {
            C0206c c0206cA = d0I2.a(0);
            d0I2.c();
            this.f3741M = c0206cA;
            this.f3742N = new C0306c();
        } catch (Throwable th) {
            d0I2.c();
            throw th;
        }
    }

    public static final int M(C0230o c0230o, int i, boolean z5, int i3) {
        D0 d1 = c0230o.f3738F;
        int[] iArr = d1.f3565b;
        int i6 = i * 5;
        if ((iArr[i6 + 1] & 134217728) != 0) {
            int i7 = iArr[i6];
            Object objJ = d1.j(iArr, i);
            if (i7 == 206 && E4.k.a(objJ, C0208d.f3691e)) {
                Object objG = d1.g(i, 0);
                C0224l c0224l = objG instanceof C0224l ? (C0224l) objG : null;
                if (c0224l != null) {
                    for (C0230o c0230o2 : c0224l.f3721h.f3726e) {
                        C0305b c0305b = c0230o2.f3740L;
                        E0 e6 = c0230o2.f3747c;
                        if (e6.i > 0 && C0208d.h(e6.f3578h, 0)) {
                            C0304a c0304a = new C0304a();
                            c0230o2.f3739K = c0304a;
                            D0 d0I = e6.i();
                            try {
                                c0230o2.f3738F = d0I;
                                C0304a c0304a2 = c0305b.f4351b;
                                try {
                                    c0305b.f4351b = c0304a;
                                    c0230o2.L(0);
                                    c0305b.b();
                                    if (c0305b.f4352c) {
                                        C0304a c0304a3 = c0305b.f4351b;
                                        c0304a3.getClass();
                                        c0304a3.f4349j.L0(O.w.f4386c);
                                        if (c0305b.f4352c) {
                                            c0305b.d(false);
                                            c0305b.d(false);
                                            C0304a c0304a4 = c0305b.f4351b;
                                            c0304a4.getClass();
                                            c0304a4.f4349j.L0(O.i.f4368c);
                                            c0305b.f4352c = false;
                                        }
                                    }
                                    c0305b.f4351b = c0304a2;
                                    d0I.c();
                                } catch (Throwable th) {
                                    c0305b.f4351b = c0304a2;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                d0I.c();
                                throw th2;
                            }
                        }
                        c0230o.f3746b.l(c0230o2.f3751g);
                    }
                }
                return C0208d.o(iArr, i);
            }
            if (!C0208d.m(iArr, i)) {
                return C0208d.o(iArr, i);
            }
        } else if (C0208d.h(iArr, i)) {
            int i8 = iArr[i6 + 3] + i;
            int iM = 0;
            for (int i9 = i + 1; i9 < i8; i9 += iArr[(i9 * 5) + 3]) {
                boolean zM = C0208d.m(iArr, i9);
                C0305b c0305b2 = c0230o.f3740L;
                if (zM) {
                    c0305b2.c();
                    Object objI = d1.i(i9);
                    c0305b2.c();
                    c0305b2.f4357h.f3729h.add(objI);
                }
                iM += M(c0230o, i9, zM || z5, zM ? 0 : i3 + iM);
                if (zM) {
                    c0305b2.c();
                    c0305b2.a();
                }
            }
            if (!C0208d.m(iArr, i)) {
                return iM;
            }
        } else if (!C0208d.m(iArr, i)) {
            return C0208d.o(iArr, i);
        }
        return 1;
    }

    public final boolean A() {
        return this.f3743O;
    }

    public final boolean B() {
        C0235q0 c0235q0Y;
        return (this.f3743O || this.f3767x || this.f3765v || (c0235q0Y = y()) == null || (c0235q0Y.f3777a & 8) != 0) ? false : true;
    }

    public final void C(ArrayList arrayList) {
        C0304a c0304a = this.f3750f;
        C0305b c0305b = this.f3740L;
        C0304a c0304a2 = c0305b.f4351b;
        try {
            c0305b.f4351b = c0304a;
            c0304a.f4349j.L0(O.u.f4384c);
            if (arrayList.size() > 0) {
                p084p4.h hVar = (p084p4.h) arrayList.get(0);
                Y y2 = (Y) hVar.f10849h;
                y2.getClass();
                throw null;
            }
            C0304a c0304a3 = c0305b.f4351b;
            c0304a3.getClass();
            c0304a3.f4349j.L0(O.j.f4369c);
            c0305b.f4355f = 0;
            c0305b.f4351b = c0304a2;
        } catch (Throwable th) {
            c0305b.f4351b = c0304a2;
            throw th;
        }
    }

    public final Object D() {
        boolean z5 = this.f3743O;
        U u6 = C0222k.f3714a;
        if (!z5) {
            Object objH = this.f3738F.h();
            if (!this.f3767x || (objH instanceof C0224l)) {
                return objH;
            }
        } else if (this.f3760q) {
            C0208d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        return u6;
    }

    public final int E(int i) {
        int iP = C0208d.p(this.f3738F.f3565b, i) + 1;
        int i3 = 0;
        while (iP < i) {
            if (!C0208d.l(this.f3738F.f3565b, iP)) {
                i3++;
            }
            iP += C0208d.j(this.f3738F.f3565b, iP);
        }
        return i3;
    }

    public final boolean F(C0025m0 c0025m0) {
        O.D d6 = this.f3749e.f4349j;
        if (!d6.I0()) {
            C0208d.w("Expected applyChanges() to have been called");
            throw null;
        }
        if (((p080p.x) c0025m0.i).f10800e <= 0 && this.f3761r.isEmpty()) {
            return false;
        }
        n(c0025m0, null);
        return d6.J0();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0299  */
    /* JADX WARN: Code duplicated, block: B:162:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f0 A[LOOP:6: B:34:0x00ae->B:50:0x00f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    /* JADX WARN: Code duplicated, block: B:62:0x013d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0142  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:66:0x0150
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void G() {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0230o.G():void");
    }

    public final void H() {
        L(this.f3738F.f3570g);
        C0305b c0305b = this.f3740L;
        c0305b.d(false);
        C0230o c0230o = c0305b.f4350a;
        D0 d1 = c0230o.f3738F;
        if (d1.f3566c > 0) {
            int i = d1.i;
            L l6 = c0305b.f4353d;
            int i3 = l6.f3626b;
            if ((i3 > 0 ? l6.f3625a[i3 - 1] : -2) != i) {
                if (!c0305b.f4352c && c0305b.f4354e) {
                    c0305b.d(false);
                    C0304a c0304a = c0305b.f4351b;
                    c0304a.getClass();
                    c0304a.f4349j.L0(O.l.f4371c);
                    c0305b.f4352c = true;
                }
                if (i > 0) {
                    C0206c c0206cA = d1.a(i);
                    l6.b(i);
                    c0305b.d(false);
                    C0304a c0304a2 = c0305b.f4351b;
                    c0304a2.getClass();
                    O.k kVar = O.k.f4370c;
                    O.D d6 = c0304a2.f4349j;
                    d6.M0(kVar);
                    p020d2.n.M(d6, 0, c0206cA);
                    int i6 = d6.f4347p;
                    int i7 = kVar.f4339a;
                    int iF0 = O.D.F0(d6, i7);
                    int i8 = kVar.f4340b;
                    if (i6 != iF0 || d6.f4348q != O.D.F0(d6, i8)) {
                        StringBuilder sb = new StringBuilder();
                        int i9 = 0;
                        for (int i10 = 0; i10 < i7; i10++) {
                            if (((1 << i10) & d6.f4347p) != 0) {
                                if (i9 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(kVar.b(i10));
                                i9++;
                            }
                        }
                        String string = sb.toString();
                        StringBuilder sbN = AbstractC0013g0.n(string, "StringBuilder().apply(builderAction).toString()");
                        int i11 = 0;
                        for (int i12 = 0; i12 < i8; i12++) {
                            if (((1 << i12) & d6.f4348q) != 0) {
                                if (i9 > 0) {
                                    sbN.append(", ");
                                }
                                sbN.append(kVar.c(i12));
                                i11++;
                            }
                        }
                        String string2 = sbN.toString();
                        E4.k.e("StringBuilder().apply(builderAction).toString()", string2);
                        StringBuilder sb2 = new StringBuilder("Error while pushing ");
                        sb2.append(kVar);
                        sb2.append(". Not all arguments were provided. Missing ");
                        AbstractC0013g0.s(sb2, i9, " int arguments (", string, ") and ");
                        AbstractC0013g0.u(sb2, i11, " object arguments (", string2, ").");
                        throw null;
                    }
                    c0305b.f4352c = true;
                }
            }
        }
        C0304a c0304a3 = c0305b.f4351b;
        c0304a3.getClass();
        c0304a3.f4349j.L0(O.s.f4382c);
        int i13 = c0305b.f4355f;
        D0 d7 = c0230o.f3738F;
        c0305b.f4355f = d7.f3565b[(d7.f3570g * 5) + 3] + i13;
    }

    public final void I(InterfaceC0225l0 interfaceC0225l0) {
        C0025m0 c0025m0 = this.f3764u;
        if (c0025m0 == null) {
            c0025m0 = new C0025m0(11);
            this.f3764u = c0025m0;
        }
        ((SparseArray) c0025m0.i).put(this.f3738F.f3570g, interfaceC0225l0);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    public final void J(int i, int i3, int i6) {
        int[] iArr;
        D0 d1 = this.f3738F;
        if (i == i3) {
            i6 = i;
        } else if (i != i6 && i3 != i6) {
            int[] iArr2 = d1.f3565b;
            int i7 = iArr2[(i * 5) + 2];
            if (i7 == i3) {
                i6 = i3;
            } else {
                int i8 = iArr2[(i3 * 5) + 2];
                if (i8 == i) {
                    i6 = i;
                } else if (i7 == i8) {
                    i6 = i7;
                } else {
                    int iP = i;
                    int i9 = 0;
                    while (true) {
                        iArr = d1.f3565b;
                        if (iP <= 0 || iP == i6) {
                            break;
                        }
                        iP = C0208d.p(iArr, iP);
                        i9++;
                    }
                    int iP2 = i3;
                    int i10 = 0;
                    while (iP2 > 0 && iP2 != i6) {
                        iP2 = C0208d.p(iArr, iP2);
                        i10++;
                    }
                    int i11 = i9 - i10;
                    int i12 = i;
                    for (int i13 = 0; i13 < i11; i13++) {
                        i12 = iArr2[(i12 * 5) + 2];
                    }
                    int i14 = i10 - i9;
                    int i15 = i3;
                    for (int i16 = 0; i16 < i14; i16++) {
                        i15 = iArr2[(i15 * 5) + 2];
                    }
                    i6 = i12;
                    for (int i17 = i15; i6 != i17; i17 = iArr2[(i17 * 5) + 2]) {
                        i6 = iArr2[(i6 * 5) + 2];
                    }
                }
            }
        }
        while (i > 0 && i != i6) {
            if (C0208d.m(d1.f3565b, i)) {
                this.f3740L.a();
            }
            i = d1.f3565b[(i * 5) + 2];
        }
        o(i3, i6);
    }

    public final Object K() {
        boolean z5 = this.f3743O;
        U u6 = C0222k.f3714a;
        if (!z5) {
            Object objH = this.f3738F.h();
            if (!this.f3767x || (objH instanceof C0224l)) {
                return objH instanceof C0252z0 ? ((C0252z0) objH).f3874a : objH;
            }
        } else if (this.f3760q) {
            C0208d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        return u6;
    }

    public final void L(int i) {
        M(this, i, false, 0);
        this.f3740L.c();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00df  */
    public final void N() {
        int iRotateLeft;
        if (this.f3761r.isEmpty()) {
            this.f3754k = this.f3738F.l() + this.f3754k;
            return;
        }
        D0 d1 = this.f3738F;
        int iF = d1.f();
        int i = d1.f3570g;
        int i3 = d1.f3571h;
        int[] iArr = d1.f3565b;
        Object objJ = i < i3 ? d1.j(iArr, i) : null;
        Object objE = d1.e();
        int i6 = this.f3755l;
        U u6 = C0222k.f3714a;
        if (objJ == null) {
            if (objE == null || iF != 207 || objE.equals(u6)) {
                iRotateLeft = Integer.rotateLeft(Integer.rotateLeft(this.f3744P, 3) ^ iF, 3) ^ i6;
            } else {
                this.f3744P = Integer.rotateLeft(objE.hashCode() ^ Integer.rotateLeft(this.f3744P, 3), 3) ^ i6;
            }
            U(null, C0208d.m(iArr, d1.f3570g));
            G();
            d1.d();
            if (objJ != null) {
                if (objJ instanceof Enum) {
                    this.f3744P = Integer.rotateRight(Integer.hashCode(((Enum) objJ).ordinal()) ^ Integer.rotateRight(this.f3744P, 3), 3);
                } else {
                    this.f3744P = Integer.rotateRight(Integer.hashCode(objJ.hashCode()) ^ Integer.rotateRight(this.f3744P, 3), 3);
                }
            }
            if (objE != null || iF != 207 || objE.equals(u6)) {
                this.f3744P = Integer.rotateRight(Integer.rotateRight(this.f3744P ^ i6, 3) ^ Integer.hashCode(iF), 3);
            } else {
                this.f3744P = Integer.rotateRight(Integer.hashCode(objE.hashCode()) ^ Integer.rotateRight(this.f3744P ^ i6, 3), 3);
                return;
            }
        }
        iRotateLeft = Integer.rotateLeft((objJ instanceof Enum ? ((Enum) objJ).ordinal() : objJ.hashCode()) ^ Integer.rotateLeft(this.f3744P, 3), 3);
        this.f3744P = iRotateLeft;
        U(null, C0208d.m(iArr, d1.f3570g));
        G();
        d1.d();
        if (objJ != null) {
            if (objE != null) {
            }
            this.f3744P = Integer.rotateRight(Integer.rotateRight(this.f3744P ^ i6, 3) ^ Integer.hashCode(iF), 3);
        } else if (objJ instanceof Enum) {
            this.f3744P = Integer.rotateRight(Integer.hashCode(((Enum) objJ).ordinal()) ^ Integer.rotateRight(this.f3744P, 3), 3);
        } else {
            this.f3744P = Integer.rotateRight(Integer.hashCode(objJ.hashCode()) ^ Integer.rotateRight(this.f3744P, 3), 3);
        }
    }

    public final void O() {
        D0 d1 = this.f3738F;
        int i = d1.i;
        this.f3754k = i >= 0 ? C0208d.o(d1.f3565b, i) : 0;
        this.f3738F.m();
    }

    public final void P() {
        if (this.f3754k != 0) {
            C0208d.w("No nodes can be emitted before calling skipAndEndGroup");
            throw null;
        }
        C0235q0 c0235q0Y = y();
        if (c0235q0Y != null) {
            c0235q0Y.f3777a |= 16;
        }
        if (this.f3761r.isEmpty()) {
            O();
        } else {
            G();
        }
    }

    /* JADX WARN: Code duplicated, block: B:196:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:225:0x046f  */
    /* JADX WARN: Code duplicated, block: B:228:0x048b  */
    /* JADX WARN: Code duplicated, block: B:229:0x0490 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:230:0x0492 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:231:0x0494  */
    /* JADX WARN: Code duplicated, block: B:233:0x049a  */
    /* JADX WARN: Code duplicated, block: B:235:0x049d  */
    /* JADX WARN: Code duplicated, block: B:239:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:240:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:242:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00da  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:64:0x0104  */
    /* JADX WARN: Code duplicated, block: B:66:0x010d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0115  */
    /* JADX WARN: Code duplicated, block: B:71:0x012d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0130  */
    /* JADX WARN: Code duplicated, block: B:77:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0156  */
    /* JADX WARN: Code duplicated, block: B:79:0x0160  */
    /* JADX WARN: Code duplicated, block: B:82:0x0174  */
    /* JADX WARN: Code duplicated, block: B:91:0x0193  */
    /* JADX WARN: Code duplicated, block: B:93:0x019d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [N.l0] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [int] */
    /* JADX WARN: Type inference failed for: r8v20 */
    public final void Q(int i, int i3, Object obj, Object obj2) throws Throwable {
        int iRotateLeft;
        boolean z5;
        boolean z6;
        int i6;
        int i7;
        boolean z7;
        boolean z8;
        Throwable th;
        int i8;
        C0223k0 c0223k0;
        C0223k0 c0223k1;
        Object objValueOf;
        p080p.x xVar;
        Object objE;
        Object objRemove;
        ArrayList arrayList;
        p080p.q qVar;
        int i9;
        G0 g6;
        int i10;
        Object[] objArr;
        long[] jArr;
        Object[] objArr2;
        long[] jArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i11;
        D0 d1;
        ArrayList arrayList2;
        int i12;
        int[] iArr;
        boolean z9;
        ?? O5;
        D0 d6;
        int i13;
        Object objJ;
        G0 g7;
        int i14;
        C0223k0 c0223k2;
        C0230o c0230o = this;
        Object obj3 = obj;
        Throwable th2 = null;
        if (c0230o.f3760q) {
            C0208d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        int i15 = c0230o.f3755l;
        U u6 = C0222k.f3714a;
        if (obj3 == null) {
            if (obj2 == null || i != 207 || obj2.equals(u6)) {
                iRotateLeft = i15 ^ Integer.rotateLeft(Integer.rotateLeft(c0230o.f3744P, 3) ^ i, 3);
            } else {
                c0230o.f3744P = i15 ^ Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(c0230o.f3744P, 3), 3);
            }
            z5 = true;
            if (obj3 == null) {
                c0230o.f3755l++;
            }
            if (i3 != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            i6 = -2;
            i7 = -1;
            if (c0230o.f3743O) {
                c0230o.f3738F.f3573k++;
                g7 = c0230o.H;
                i14 = g7.f3607t;
                if (z6) {
                    g7.H(i, u6, u6, true);
                } else if (obj2 != null) {
                    if (obj3 == null) {
                        obj3 = u6;
                    }
                    g7.H(i, obj3, obj2, false);
                } else {
                    if (obj3 == null) {
                        obj3 = u6;
                    }
                    g7.H(i, obj3, u6, false);
                }
                c0223k2 = c0230o.i;
                if (c0223k2 != null) {
                    int i16 = (-2) - i14;
                    O o6 = new O(-1, i, i16, -1);
                    c0223k2.f3719e.i(i16, new I(-1, c0230o.f3753j - c0223k2.f3716b, 0));
                    c0223k2.f3718d.add(o6);
                }
                c0230o.v(z6, null);
                return;
            }
            if (i3 != 1 && c0230o.f3767x) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (c0230o.i == null) {
                int iF = c0230o.f3738F.f();
                if (!z7 && iF == i) {
                    d6 = c0230o.f3738F;
                    i13 = d6.f3570g;
                    if (i13 < d6.f3571h) {
                        objJ = d6.j(d6.f3565b, i13);
                    } else {
                        objJ = null;
                    }
                    if (E4.k.a(obj3, objJ)) {
                        c0230o.U(obj2, z6);
                        z8 = true;
                        th = null;
                        i6 = -2;
                        i8 = -1;
                    }
                }
                d1 = c0230o.f3738F;
                d1.getClass();
                arrayList2 = new ArrayList();
                if (d1.f3573k > 0) {
                    i12 = d1.f3570g;
                    while (i12 < d1.f3571h) {
                        int i17 = i12 * 5;
                        int i18 = i7;
                        iArr = d1.f3565b;
                        Throwable th3 = th2;
                        int i19 = iArr[i17];
                        z9 = z5;
                        Object objJ2 = d1.j(iArr, i12);
                        if (C0208d.m(iArr, i12)) {
                            O5 = z9;
                        } else {
                            O5 = C0208d.o(iArr, i12);
                        }
                        arrayList2.add(new O(objJ2, i19, i12, O5));
                        i12 += iArr[i17 + 3];
                        i7 = i18;
                        th2 = th3;
                        z5 = z9;
                    }
                }
                z8 = z5;
                th = th2;
                i8 = i7;
                c0230o.i = new C0223k0(c0230o.f3753j, arrayList2);
            } else {
                z8 = true;
                th = null;
                i6 = -2;
                i8 = -1;
            }
            c0223k0 = c0230o.i;
            if (c0223k0 != null) {
                if (obj3 != null) {
                    objValueOf = new N(Integer.valueOf(i), obj3);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                xVar = ((Z) c0223k0.f3720f.getValue()).f3679a;
                objE = xVar.e(objValueOf);
                if (objE != null) {
                    if ((objE instanceof List) || ((objE instanceof F4.a) && !(objE instanceof F4.c))) {
                        xVar.g(objValueOf);
                        objRemove = objE;
                    } else {
                        List listB = E4.z.b(objE);
                        objRemove = listB.remove(0);
                        if (listB.isEmpty()) {
                            xVar.g(objValueOf);
                        }
                    }
                    E4.k.d("null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1", objRemove);
                } else {
                    objRemove = th;
                }
                O o7 = (O) objRemove;
                arrayList = c0223k0.f3718d;
                qVar = c0223k0.f3719e;
                i9 = c0223k0.f3716b;
                if (!z7 || o7 == null) {
                    z6 = z6;
                    c0230o.f3738F.f3573k++;
                    c0230o.f3743O = true;
                    c0230o.J = th;
                    if (c0230o.H.f3610w) {
                        G0 g0J = c0230o.G.j();
                        c0230o.H = g0J;
                        g0J.D();
                        c0230o.I = false;
                        c0230o.J = null;
                    }
                    c0230o.H.d();
                    g6 = c0230o.H;
                    int i20 = g6.f3607t;
                    if (z6) {
                        g6.H(i, u6, u6, true);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = u6;
                        }
                        g6.H(i, obj3, obj2, false);
                    } else {
                        if (obj3 == null) {
                            obj3 = u6;
                        }
                        g6.H(i, obj3, u6, false);
                    }
                    c0230o.f3741M = c0230o.H.b(i20);
                    int i21 = (-2) - i20;
                    int i22 = i8;
                    O o8 = new O(Integer.valueOf(i8), i, i21, i22);
                    qVar.i(i21, new I(i22, c0230o.f3753j - i9, 0));
                    arrayList.add(o8);
                    ArrayList arrayList3 = new ArrayList();
                    if (z6) {
                        i10 = 0;
                    } else {
                        i10 = c0230o.f3753j;
                    }
                    c0223k1 = new C0223k0(i10, arrayList3);
                } else {
                    arrayList.add(o7);
                    int i23 = o7.f3640c;
                    I i24 = (I) qVar.f(i23);
                    c0230o.f3753j = (i24 != null ? i24.f3615b : i8) + i9;
                    I i25 = (I) qVar.f(i23);
                    int i26 = i25 != null ? i25.f3614a : i8;
                    int i27 = c0223k0.f3717c;
                    int i28 = i26 - i27;
                    int i29 = 8;
                    if (i26 <= i27) {
                        if (i27 > i26) {
                            Object[] objArr5 = qVar.f10762c;
                            long[] jArr3 = qVar.f10760a;
                            int length = jArr3.length - 2;
                            if (length >= 0) {
                                int i30 = 0;
                                while (true) {
                                    long j4 = jArr3[i30];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i31 = 8 - ((~(i30 - length)) >>> 31);
                                        int i32 = 0;
                                        while (i32 < i31) {
                                            if ((j4 & 255) < 128) {
                                                I i33 = (I) objArr5[(i30 << 3) + i32];
                                                objArr2 = objArr5;
                                                int i34 = i33.f3614a;
                                                if (i34 == i26) {
                                                    i33.f3614a = i27;
                                                } else {
                                                    jArr2 = jArr3;
                                                    if (i26 + 1 <= i34 && i34 < i27) {
                                                        i33.f3614a = i34 - 1;
                                                    }
                                                }
                                                j4 >>= 8;
                                                i32++;
                                                objArr5 = objArr2;
                                                jArr3 = jArr2;
                                            } else {
                                                objArr2 = objArr5;
                                            }
                                            jArr2 = jArr3;
                                            j4 >>= 8;
                                            i32++;
                                            objArr5 = objArr2;
                                            jArr3 = jArr2;
                                        }
                                        objArr = objArr5;
                                        jArr = jArr3;
                                        if (i31 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr5;
                                        jArr = jArr3;
                                    }
                                    if (i30 == length) {
                                        break;
                                    }
                                    i30++;
                                    objArr5 = objArr;
                                    jArr3 = jArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr6 = qVar.f10762c;
                        long[] jArr4 = qVar.f10760a;
                        int length2 = jArr4.length - 2;
                        if (length2 >= 0) {
                            int i35 = 0;
                            while (true) {
                                long j6 = jArr4[i35];
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i36 = 8 - ((~(i35 - length2)) >>> 31);
                                    int i37 = 0;
                                    while (i37 < i36) {
                                        if ((j6 & 255) < 128) {
                                            i11 = i29;
                                            I i38 = (I) objArr6[(i35 << 3) + i37];
                                            objArr4 = objArr6;
                                            int i39 = i38.f3614a;
                                            if (i39 == i26) {
                                                i38.f3614a = i27;
                                            } else if (i27 <= i39 && i39 < i26) {
                                                i38.f3614a = i39 + 1;
                                            }
                                        } else {
                                            objArr4 = objArr6;
                                            i11 = i29;
                                        }
                                        j6 >>= i11;
                                        i37++;
                                        objArr6 = objArr4;
                                        i29 = i11;
                                    }
                                    objArr3 = objArr6;
                                    if (i36 != i29) {
                                        break;
                                    }
                                } else {
                                    objArr3 = objArr6;
                                }
                                if (i35 == length2) {
                                    break;
                                }
                                i35++;
                                objArr6 = objArr3;
                                i29 = 8;
                            }
                        }
                    }
                    C0305b c0305b = c0230o.f3740L;
                    int i40 = c0305b.f4355f;
                    C0230o c0230o2 = c0305b.f4350a;
                    c0305b.f4355f = (i23 - c0230o2.f3738F.f3570g) + i40;
                    c0230o.f3738F.k(i23);
                    if (i28 > 0) {
                        c0305b.d(false);
                        D0 d7 = c0230o2.f3738F;
                        if (d7.f3566c > 0) {
                            int i41 = d7.i;
                            L l6 = c0305b.f4353d;
                            int i42 = l6.f3626b;
                            if ((i42 > 0 ? l6.f3625a[i42 - 1] : i6) != i41) {
                                if (!c0305b.f4352c && c0305b.f4354e) {
                                    c0305b.d(false);
                                    C0304a c0304a = c0305b.f4351b;
                                    c0304a.getClass();
                                    c0304a.f4349j.L0(O.l.f4371c);
                                    c0305b.f4352c = z8;
                                }
                                if (i41 > 0) {
                                    C0206c c0206cA = d7.a(i41);
                                    l6.b(i41);
                                    c0305b.d(false);
                                    C0304a c0304a2 = c0305b.f4351b;
                                    c0304a2.getClass();
                                    O.k kVar = O.k.f4370c;
                                    O.D d8 = c0304a2.f4349j;
                                    d8.M0(kVar);
                                    p020d2.n.M(d8, 0, c0206cA);
                                    int i43 = d8.f4347p;
                                    int i44 = kVar.f4339a;
                                    int iF0 = O.D.F0(d8, i44);
                                    int i45 = kVar.f4340b;
                                    if (i43 != iF0 || d8.f4348q != O.D.F0(d8, i45)) {
                                        int i46 = 1;
                                        StringBuilder sb = new StringBuilder();
                                        int i47 = 0;
                                        int i48 = 0;
                                        while (i47 < i44) {
                                            if (((i46 << i47) & d8.f4347p) != 0) {
                                                if (i48 > 0) {
                                                    sb.append(", ");
                                                }
                                                sb.append(kVar.b(i47));
                                                i48++;
                                            }
                                            i47++;
                                            i46 = 1;
                                        }
                                        String string = sb.toString();
                                        StringBuilder sbN = AbstractC0013g0.n(string, "StringBuilder().apply(builderAction).toString()");
                                        int i49 = 0;
                                        int i50 = 0;
                                        while (i49 < i45) {
                                            int i51 = i45;
                                            if (((1 << i49) & d8.f4348q) != 0) {
                                                if (i48 > 0) {
                                                    sbN.append(", ");
                                                }
                                                sbN.append(kVar.c(i49));
                                                i50++;
                                            }
                                            i49++;
                                            i45 = i51;
                                        }
                                        String string2 = sbN.toString();
                                        E4.k.e("StringBuilder().apply(builderAction).toString()", string2);
                                        StringBuilder sb2 = new StringBuilder("Error while pushing ");
                                        sb2.append(kVar);
                                        sb2.append(". Not all arguments were provided. Missing ");
                                        AbstractC0013g0.s(sb2, i48, " int arguments (", string, ") and ");
                                        AbstractC0013g0.u(sb2, i50, " object arguments (", string2, ").");
                                        throw th;
                                    }
                                    c0305b.f4352c = true;
                                }
                            }
                        }
                        C0304a c0304a3 = c0305b.f4351b;
                        c0304a3.getClass();
                        O.p pVar = O.p.f4379c;
                        O.D d9 = c0304a3.f4349j;
                        d9.M0(pVar);
                        p020d2.n.L(d9, 0, i28);
                        int i52 = d9.f4347p;
                        int i53 = pVar.f4339a;
                        int iF1 = O.D.F0(d9, i53);
                        int i54 = pVar.f4340b;
                        if (i52 != iF1 || d9.f4348q != O.D.F0(d9, i54)) {
                            StringBuilder sb3 = new StringBuilder();
                            int i55 = 0;
                            int i56 = 0;
                            while (i55 < i53) {
                                int i57 = i53;
                                if ((d9.f4347p & (1 << i55)) != 0) {
                                    if (i56 > 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(pVar.b(i55));
                                    i56++;
                                }
                                i55++;
                                i53 = i57;
                            }
                            String string3 = sb3.toString();
                            StringBuilder sbN2 = AbstractC0013g0.n(string3, "StringBuilder().apply(builderAction).toString()");
                            int i58 = 0;
                            int i59 = 0;
                            while (i58 < i54) {
                                int i60 = i54;
                                if (((1 << i58) & d9.f4348q) != 0) {
                                    if (i56 > 0) {
                                        sbN2.append(", ");
                                    }
                                    sbN2.append(pVar.c(i58));
                                    i59++;
                                }
                                i58++;
                                i54 = i60;
                            }
                            String string4 = sbN2.toString();
                            E4.k.e("StringBuilder().apply(builderAction).toString()", string4);
                            StringBuilder sb4 = new StringBuilder("Error while pushing ");
                            sb4.append(pVar);
                            sb4.append(". Not all arguments were provided. Missing ");
                            AbstractC0013g0.s(sb4, i56, " int arguments (", string3, ") and ");
                            AbstractC0013g0.u(sb4, i59, " object arguments (", string4, ").");
                            throw th;
                        }
                    }
                    c0230o = this;
                    c0230o.U(obj2, z6);
                }
                c0230o.v(z6, c0223k1);
            }
            z6 = z6;
            c0223k1 = null;
            c0230o.v(z6, c0223k1);
        }
        iRotateLeft = Integer.rotateLeft((obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode()) ^ Integer.rotateLeft(c0230o.f3744P, 3), 3);
        c0230o.f3744P = iRotateLeft;
        z5 = true;
        if (obj3 == null) {
            c0230o.f3755l++;
        }
        if (i3 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        i6 = -2;
        i7 = -1;
        if (c0230o.f3743O) {
            c0230o.f3738F.f3573k++;
            g7 = c0230o.H;
            i14 = g7.f3607t;
            if (z6) {
                g7.H(i, u6, u6, true);
            } else if (obj2 != null) {
                if (obj3 == null) {
                    obj3 = u6;
                }
                g7.H(i, obj3, obj2, false);
            } else {
                if (obj3 == null) {
                    obj3 = u6;
                }
                g7.H(i, obj3, u6, false);
            }
            c0223k2 = c0230o.i;
            if (c0223k2 != null) {
                int i110 = (-2) - i14;
                O o9 = new O(-1, i, i110, -1);
                c0223k2.f3719e.i(i110, new I(-1, c0230o.f3753j - c0223k2.f3716b, 0));
                c0223k2.f3718d.add(o9);
            }
            c0230o.v(z6, null);
            return;
        }
        if (i3 != 1) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (c0230o.i == null) {
            int iF2 = c0230o.f3738F.f();
            if (!z7) {
                d6 = c0230o.f3738F;
                i13 = d6.f3570g;
                if (i13 < d6.f3571h) {
                    objJ = d6.j(d6.f3565b, i13);
                } else {
                    objJ = null;
                }
                if (E4.k.a(obj3, objJ)) {
                    c0230o.U(obj2, z6);
                    z8 = true;
                    th = null;
                    i6 = -2;
                    i8 = -1;
                }
            }
            d1 = c0230o.f3738F;
            d1.getClass();
            arrayList2 = new ArrayList();
            if (d1.f3573k > 0) {
                i12 = d1.f3570g;
                while (i12 < d1.f3571h) {
                    int i111 = i12 * 5;
                    int i112 = i7;
                    iArr = d1.f3565b;
                    Throwable th4 = th2;
                    int i113 = iArr[i111];
                    z9 = z5;
                    Object objJ3 = d1.j(iArr, i12);
                    if (C0208d.m(iArr, i12)) {
                        O5 = z9;
                    } else {
                        O5 = C0208d.o(iArr, i12);
                    }
                    arrayList2.add(new O(objJ3, i113, i12, O5));
                    i12 += iArr[i111 + 3];
                    i7 = i112;
                    th2 = th4;
                    z5 = z9;
                }
            }
            z8 = z5;
            th = th2;
            i8 = i7;
            c0230o.i = new C0223k0(c0230o.f3753j, arrayList2);
        } else {
            z8 = true;
            th = null;
            i6 = -2;
            i8 = -1;
        }
        c0223k0 = c0230o.i;
        if (c0223k0 != null) {
            if (obj3 != null) {
                objValueOf = new N(Integer.valueOf(i), obj3);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            xVar = ((Z) c0223k0.f3720f.getValue()).f3679a;
            objE = xVar.e(objValueOf);
            if (objE != null) {
                if (objE instanceof List) {
                    xVar.g(objValueOf);
                    objRemove = objE;
                } else {
                    xVar.g(objValueOf);
                    objRemove = objE;
                }
                E4.k.d("null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1", objRemove);
            } else {
                objRemove = th;
            }
            O o10 = (O) objRemove;
            arrayList = c0223k0.f3718d;
            qVar = c0223k0.f3719e;
            i9 = c0223k0.f3716b;
            if (z7) {
            }
            z6 = z6;
            c0230o.f3738F.f3573k++;
            c0230o.f3743O = true;
            c0230o.J = th;
            if (c0230o.H.f3610w) {
                G0 g0J2 = c0230o.G.j();
                c0230o.H = g0J2;
                g0J2.D();
                c0230o.I = false;
                c0230o.J = null;
            }
            c0230o.H.d();
            g6 = c0230o.H;
            int i210 = g6.f3607t;
            if (z6) {
                g6.H(i, u6, u6, true);
            } else if (obj2 != null) {
                if (obj3 == null) {
                    obj3 = u6;
                }
                g6.H(i, obj3, obj2, false);
            } else {
                if (obj3 == null) {
                    obj3 = u6;
                }
                g6.H(i, obj3, u6, false);
            }
            c0230o.f3741M = c0230o.H.b(i210);
            int i211 = (-2) - i210;
            int i212 = i8;
            O o11 = new O(Integer.valueOf(i8), i, i211, i212);
            qVar.i(i211, new I(i212, c0230o.f3753j - i9, 0));
            arrayList.add(o11);
            ArrayList arrayList4 = new ArrayList();
            if (z6) {
                i10 = 0;
            } else {
                i10 = c0230o.f3753j;
            }
            c0223k1 = new C0223k0(i10, arrayList4);
            c0230o.v(z6, c0223k1);
        }
        z6 = z6;
        c0223k1 = null;
        c0230o.v(z6, c0223k1);
    }

    public final void R() {
        Q(-127, 0, null, null);
    }

    public final void S(int i, C0205b0 c0205b0) throws Throwable {
        Q(i, 0, c0205b0, null);
    }

    public final void T(int i, Object obj) {
        Q(i, 0, obj, null);
    }

    public final void U(Object obj, boolean z5) {
        if (z5) {
            D0 d1 = this.f3738F;
            if (d1.f3573k <= 0) {
                if (C0208d.m(d1.f3565b, d1.f3570g)) {
                    d1.n();
                    return;
                } else {
                    C0208d.S("Expected a node group");
                    throw null;
                }
            }
            return;
        }
        if (obj != null && this.f3738F.e() != obj) {
            C0305b c0305b = this.f3740L;
            c0305b.getClass();
            c0305b.d(false);
            C0304a c0304a = c0305b.f4351b;
            c0304a.getClass();
            O.y yVar = O.y.f4388c;
            O.D d6 = c0304a.f4349j;
            d6.M0(yVar);
            p020d2.n.M(d6, 0, obj);
            int i = d6.f4347p;
            int i3 = yVar.f4339a;
            int iF0 = O.D.F0(d6, i3);
            int i6 = yVar.f4340b;
            if (i != iF0 || d6.f4348q != O.D.F0(d6, i6)) {
                StringBuilder sb = new StringBuilder();
                int i7 = 0;
                for (int i8 = 0; i8 < i3; i8++) {
                    if (((1 << i8) & d6.f4347p) != 0) {
                        if (i7 > 0) {
                            sb.append(", ");
                        }
                        sb.append(yVar.b(i8));
                        i7++;
                    }
                }
                String string = sb.toString();
                StringBuilder sbN = AbstractC0013g0.n(string, "StringBuilder().apply(builderAction).toString()");
                int i9 = 0;
                for (int i10 = 0; i10 < i6; i10++) {
                    if (((1 << i10) & d6.f4348q) != 0) {
                        if (i7 > 0) {
                            sbN.append(", ");
                        }
                        sbN.append(yVar.c(i10));
                        i9++;
                    }
                }
                String string2 = sbN.toString();
                E4.k.e("StringBuilder().apply(builderAction).toString()", string2);
                StringBuilder sb2 = new StringBuilder("Error while pushing ");
                sb2.append(yVar);
                sb2.append(". Not all arguments were provided. Missing ");
                AbstractC0013g0.s(sb2, i7, " int arguments (", string, ") and ");
                AbstractC0013g0.u(sb2, i9, " object arguments (", string2, ").");
                throw null;
            }
        }
        this.f3738F.n();
    }

    public final void V(int i) {
        int i3;
        int i6;
        if (this.i != null) {
            Q(i, 0, null, null);
            return;
        }
        if (this.f3760q) {
            C0208d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        this.f3744P = this.f3755l ^ Integer.rotateLeft(Integer.rotateLeft(this.f3744P, 3) ^ i, 3);
        this.f3755l++;
        D0 d1 = this.f3738F;
        boolean z5 = this.f3743O;
        U u6 = C0222k.f3714a;
        if (z5) {
            d1.f3573k++;
            this.H.H(i, u6, u6, false);
            v(false, null);
            return;
        }
        if (d1.f() == i && ((i6 = d1.f3570g) >= d1.f3571h || !C0208d.l(d1.f3565b, i6))) {
            d1.n();
            v(false, null);
            return;
        }
        if (d1.f3573k <= 0 && (i3 = d1.f3570g) != d1.f3571h) {
            int i7 = this.f3753j;
            H();
            this.f3740L.e(i7, d1.l());
            C0208d.q(this.f3761r, i3, d1.f3570g);
        }
        d1.f3573k++;
        this.f3743O = true;
        this.J = null;
        if (this.H.f3610w) {
            G0 g0J = this.G.j();
            this.H = g0J;
            g0J.D();
            this.I = false;
            this.J = null;
        }
        G0 g6 = this.H;
        g6.d();
        int i8 = g6.f3607t;
        g6.H(i, u6, u6, false);
        this.f3741M = g6.b(i8);
        v(false, null);
    }

    public final void W(int i) {
        Q(i, 0, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    public final C0230o X(int i) {
        C0235q0 c0235q0;
        V(i);
        boolean z5 = this.f3743O;
        C0239t c0239t = this.f3751g;
        C0227m0 c0227m0 = this.f3736D;
        if (z5) {
            C0235q0 c0235q1 = new C0235q0(c0239t);
            c0227m0.f3729h.add(c0235q1);
            g0(c0235q1);
            c0235q1.f3781e = this.f3733A;
            c0235q1.f3777a &= -17;
            return this;
        }
        ArrayList arrayList = this.f3761r;
        int iD = C0208d.D(this.f3738F.i, arrayList);
        M m6 = iD >= 0 ? (M) arrayList.remove(iD) : null;
        Object objH = this.f3738F.h();
        if (E4.k.a(objH, C0222k.f3714a)) {
            c0235q0 = new C0235q0(c0239t);
            g0(c0235q0);
        } else {
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl", objH);
            c0235q0 = (C0235q0) objH;
        }
        if (m6 == null) {
            int i3 = c0235q0.f3777a;
            boolean z6 = (i3 & 64) != 0;
            if (z6) {
                c0235q0.f3777a = i3 & (-65);
            }
            if (z6) {
                c0235q0.f3777a |= 8;
            } else {
                c0235q0.f3777a &= -9;
            }
        } else {
            c0235q0.f3777a |= 8;
        }
        c0227m0.f3729h.add(c0235q0);
        c0235q0.f3781e = this.f3733A;
        c0235q0.f3777a &= -17;
        return this;
    }

    public final void Y(Object obj) throws Throwable {
        if (!this.f3743O && this.f3738F.f() == 207 && !E4.k.a(this.f3738F.e(), obj) && this.f3768y < 0) {
            this.f3768y = this.f3738F.f3570g;
            this.f3767x = true;
        }
        Q(207, 0, null, obj);
    }

    public final void Z() {
        Q(125, 2, null, null);
        this.f3760q = true;
    }

    public final void a() {
        i();
        this.f3752h.f3729h.clear();
        this.f3756m.f3626b = 0;
        this.f3762s.f3626b = 0;
        this.f3766w.f3626b = 0;
        this.f3764u = null;
        C0306c c0306c = this.f3742N;
        c0306c.f4362k.G0();
        c0306c.f4361j.G0();
        this.f3744P = 0;
        this.f3769z = 0;
        this.f3760q = false;
        this.f3743O = false;
        this.f3767x = false;
        this.f3737E = false;
        this.f3768y = -1;
        D0 d1 = this.f3738F;
        if (!d1.f3569f) {
            d1.c();
        }
        if (this.H.f3610w) {
            return;
        }
        w();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a0() throws Throwable {
        this.f3755l = 0;
        E0 e6 = this.f3747c;
        this.f3738F = e6.i();
        Q(100, 0, null, null);
        AbstractC0234q abstractC0234q = this.f3746b;
        abstractC0234q.m();
        this.f3763t = abstractC0234q.f();
        this.f3766w.b(this.f3765v ? 1 : 0);
        this.f3765v = f(this.f3763t);
        this.J = null;
        if (!this.f3759p) {
            this.f3759p = abstractC0234q.d();
        }
        if (!this.f3734B) {
            this.f3734B = abstractC0234q.e();
        }
        Set set = (Set) C0208d.L(this.f3763t, Y.b.f5788a);
        if (set != null) {
            set.add(e6);
            abstractC0234q.j(set);
        }
        Q(abstractC0234q.g(), 0, null, null);
    }

    public final void b(Object obj, D4.e eVar) {
        if (this.f3743O) {
            C0306c c0306c = this.f3742N;
            c0306c.getClass();
            O.z zVar = O.z.f4389c;
            O.D d6 = c0306c.f4361j;
            d6.M0(zVar);
            p020d2.n.M(d6, 0, obj);
            E4.k.d("null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>", eVar);
            E4.z.d(2, eVar);
            p020d2.n.M(d6, 1, eVar);
            int i = d6.f4347p;
            int i3 = zVar.f4339a;
            int iF0 = O.D.F0(d6, i3);
            int i6 = zVar.f4340b;
            if (i == iF0 && d6.f4348q == O.D.F0(d6, i6)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i7 = 0;
            for (int i8 = 0; i8 < i3; i8++) {
                if (((1 << i8) & d6.f4347p) != 0) {
                    if (i7 > 0) {
                        sb.append(", ");
                    }
                    sb.append(zVar.b(i8));
                    i7++;
                }
            }
            String string = sb.toString();
            StringBuilder sbN = AbstractC0013g0.n(string, "StringBuilder().apply(builderAction).toString()");
            int i9 = 0;
            int i10 = 0;
            while (i9 < i6) {
                int i11 = i6;
                if (((1 << i9) & d6.f4348q) != 0) {
                    if (i7 > 0) {
                        sbN.append(", ");
                    }
                    sbN.append(zVar.c(i9));
                    i10++;
                }
                i9++;
                i6 = i11;
            }
            String string2 = sbN.toString();
            E4.k.e("StringBuilder().apply(builderAction).toString()", string2);
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(zVar);
            sb2.append(". Not all arguments were provided. Missing ");
            AbstractC0013g0.s(sb2, i7, " int arguments (", string, ") and ");
            AbstractC0013g0.u(sb2, i10, " object arguments (", string2, ").");
            throw null;
        }
        C0305b c0305b = this.f3740L;
        c0305b.b();
        C0304a c0304a = c0305b.f4351b;
        c0304a.getClass();
        O.z zVar2 = O.z.f4389c;
        O.D d7 = c0304a.f4349j;
        d7.M0(zVar2);
        p020d2.n.M(d7, 0, obj);
        E4.k.d("null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>", eVar);
        E4.z.d(2, eVar);
        p020d2.n.M(d7, 1, eVar);
        int i12 = d7.f4347p;
        int i13 = zVar2.f4339a;
        int iF1 = O.D.F0(d7, i13);
        int i14 = zVar2.f4340b;
        if (i12 == iF1 && d7.f4348q == O.D.F0(d7, i14)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16++) {
            if (((1 << i16) & d7.f4347p) != 0) {
                if (i15 > 0) {
                    sb3.append(", ");
                }
                sb3.append(zVar2.b(i16));
                i15++;
            }
        }
        String string3 = sb3.toString();
        StringBuilder sbN2 = AbstractC0013g0.n(string3, "StringBuilder().apply(builderAction).toString()");
        int i17 = 0;
        int i18 = 0;
        while (i17 < i14) {
            int i19 = i14;
            if (((1 << i17) & d7.f4348q) != 0) {
                if (i15 > 0) {
                    sbN2.append(", ");
                }
                sbN2.append(zVar2.c(i17));
                i18++;
            }
            i17++;
            i14 = i19;
        }
        String string4 = sbN2.toString();
        E4.k.e("StringBuilder().apply(builderAction).toString()", string4);
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(zVar2);
        sb4.append(". Not all arguments were provided. Missing ");
        AbstractC0013g0.s(sb4, i15, " int arguments (", string3, ") and ");
        AbstractC0013g0.u(sb4, i18, " object arguments (", string4, ").");
        throw null;
    }

    public final boolean b0(C0235q0 c0235q0, Object obj) {
        C0206c c0206c = c0235q0.f3779c;
        if (c0206c == null) {
            return false;
        }
        int iC = this.f3738F.f3564a.c(c0206c);
        if (!this.f3737E || iC < this.f3738F.f3570g) {
            return false;
        }
        ArrayList arrayList = this.f3761r;
        int iD = C0208d.D(iC, arrayList);
        if (iD < 0) {
            int i = -(iD + 1);
            if (!(obj instanceof D)) {
                obj = null;
            }
            arrayList.add(i, new M(c0235q0, iC, obj));
            return true;
        }
        M m6 = (M) arrayList.get(iD);
        if (!(obj instanceof D)) {
            m6.f3629c = null;
            return true;
        }
        Object obj2 = m6.f3629c;
        if (obj2 == null) {
            m6.f3629c = obj;
            return true;
        }
        if (obj2 instanceof p080p.A) {
            ((p080p.A) obj2).a(obj);
            return true;
        }
        int i3 = p080p.D.f10715a;
        p080p.A a6 = new p080p.A(2);
        a6.f10709b[a6.d(obj2)] = obj2;
        a6.f10709b[a6.d(obj)] = obj;
        m6.f3629c = a6;
        return true;
    }

    public final boolean c(float f6) {
        Object objD = D();
        if ((objD instanceof Float) && f6 == ((Number) objD).floatValue()) {
            return false;
        }
        g0(Float.valueOf(f6));
        return true;
    }

    public final void c0(int i, int i3) {
        if (h0(i) != i3) {
            if (i < 0) {
                p080p.o oVar = this.f3758o;
                if (oVar == null) {
                    oVar = new p080p.o();
                    this.f3758o = oVar;
                }
                oVar.f(i, i3);
                return;
            }
            int[] iArr = this.f3757n;
            if (iArr == null) {
                int i6 = this.f3738F.f3566c;
                int[] iArr2 = new int[i6];
                Arrays.fill(iArr2, 0, i6, -1);
                this.f3757n = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i3;
        }
    }

    public final boolean d(int i) {
        Object objD = D();
        if ((objD instanceof Integer) && i == ((Number) objD).intValue()) {
            return false;
        }
        g0(Integer.valueOf(i));
        return true;
    }

    public final void d0(int i, int i3) {
        int iH0 = h0(i);
        if (iH0 != i3) {
            int i6 = i3 - iH0;
            C0227m0 c0227m0 = this.f3752h;
            int size = c0227m0.f3729h.size() - 1;
            while (i != -1) {
                int iH1 = h0(i) + i6;
                c0(i, iH1);
                for (int i7 = size; -1 < i7; i7--) {
                    C0223k0 c0223k0 = (C0223k0) c0227m0.f3729h.get(i7);
                    if (c0223k0 != null && c0223k0.a(i, iH1)) {
                        size = i7 - 1;
                        break;
                    }
                }
                if (i < 0) {
                    i = this.f3738F.i;
                } else if (C0208d.m(this.f3738F.f3565b, i)) {
                    return;
                } else {
                    i = C0208d.p(this.f3738F.f3565b, i);
                }
            }
        }
    }

    public final boolean e(long j4) {
        Object objD = D();
        if ((objD instanceof Long) && j4 == ((Number) objD).longValue()) {
            return false;
        }
        g0(Long.valueOf(j4));
        return true;
    }

    public final V.e e0(InterfaceC0225l0 interfaceC0225l0, V.e eVar) throws Throwable {
        V.e eVar2 = (V.e) interfaceC0225l0;
        eVar2.getClass();
        V.d dVar = new V.d(eVar2);
        dVar.f5394n = eVar2;
        dVar.putAll(eVar);
        V.e eVarC = dVar.d();
        S(204, C0208d.f3690d);
        D();
        g0(eVarC);
        D();
        g0(eVar);
        p(false);
        return eVarC;
    }

    public final boolean f(Object obj) {
        if (E4.k.a(D(), obj)) {
            return false;
        }
        g0(obj);
        return true;
    }

    public final void f0(Object obj) {
        int i;
        D0 d1;
        int i3;
        G0 g6;
        if (obj instanceof InterfaceC0250y0) {
            C0206c c0206cA = null;
            if (this.f3743O) {
                C0304a c0304a = this.f3740L.f4351b;
                c0304a.getClass();
                O.r rVar = O.r.f4381c;
                O.D d6 = c0304a.f4349j;
                d6.M0(rVar);
                p020d2.n.M(d6, 0, (InterfaceC0250y0) obj);
                int i6 = d6.f4347p;
                int i7 = rVar.f4339a;
                int iF0 = O.D.F0(d6, i7);
                int i8 = rVar.f4340b;
                if (i6 != iF0 || d6.f4348q != O.D.F0(d6, i8)) {
                    StringBuilder sb = new StringBuilder();
                    int i9 = 0;
                    for (int i10 = 0; i10 < i7; i10++) {
                        if (((1 << i10) & d6.f4347p) != 0) {
                            if (i9 > 0) {
                                sb.append(", ");
                            }
                            sb.append(rVar.b(i10));
                            i9++;
                        }
                    }
                    String string = sb.toString();
                    StringBuilder sbN = AbstractC0013g0.n(string, "StringBuilder().apply(builderAction).toString()");
                    int i11 = 0;
                    for (int i12 = 0; i12 < i8; i12++) {
                        if (((1 << i12) & d6.f4348q) != 0) {
                            if (i9 > 0) {
                                sbN.append(", ");
                            }
                            sbN.append(rVar.c(i12));
                            i11++;
                        }
                    }
                    String string2 = sbN.toString();
                    E4.k.e("StringBuilder().apply(builderAction).toString()", string2);
                    StringBuilder sb2 = new StringBuilder("Error while pushing ");
                    sb2.append(rVar);
                    sb2.append(". Not all arguments were provided. Missing ");
                    AbstractC0013g0.s(sb2, i9, " int arguments (", string, ") and ");
                    AbstractC0013g0.u(sb2, i11, " object arguments (", string2, ").");
                    throw null;
                }
            }
            this.f3748d.add(obj);
            InterfaceC0250y0 interfaceC0250y0 = (InterfaceC0250y0) obj;
            if (this.f3743O) {
                G0 g7 = this.H;
                int i13 = g7.f3607t;
                if (i13 > g7.f3609v + 1) {
                    int i14 = i13 - 1;
                    int iX = g7.x(g7.f3590b, i14);
                    while (true) {
                        i3 = i14;
                        i14 = iX;
                        g6 = this.H;
                        if (i14 == g6.f3609v || i14 < 0) {
                            break;
                        } else {
                            iX = g6.x(g6.f3590b, i14);
                        }
                    }
                    c0206cA = g6.b(i3);
                }
            } else {
                D0 d7 = this.f3738F;
                int i15 = d7.f3570g;
                if (i15 > d7.i + 1) {
                    int i16 = i15 - 1;
                    int i17 = d7.f3565b[(i16 * 5) + 2];
                    while (true) {
                        i = i16;
                        i16 = i17;
                        d1 = this.f3738F;
                        if (i16 == d1.i || i16 < 0) {
                            break;
                        } else {
                            i17 = d1.f3565b[(i16 * 5) + 2];
                        }
                    }
                    c0206cA = d1.a(i);
                }
            }
            C0252z0 c0252z0 = new C0252z0();
            c0252z0.f3874a = interfaceC0250y0;
            c0252z0.f3875b = c0206cA;
            obj = c0252z0;
        }
        g0(obj);
    }

    public final boolean g(boolean z5) {
        Object objD = D();
        if ((objD instanceof Boolean) && z5 == ((Boolean) objD).booleanValue()) {
            return false;
        }
        g0(Boolean.valueOf(z5));
        return true;
    }

    public final void g0(Object obj) {
        int i;
        int i3;
        if (this.f3743O) {
            G0 g6 = this.H;
            if (g6.f3601n <= 0 || g6.i == g6.f3598k) {
                g6.y(obj);
                return;
            }
            p080p.q qVar = g6.f3606s;
            if (qVar == null) {
                qVar = new p080p.q();
            }
            g6.f3606s = qVar;
            int i6 = g6.f3609v;
            Object objF = qVar.f(i6);
            if (objF == null) {
                objF = new p080p.w();
                qVar.i(i6, objF);
            }
            ((p080p.w) objF).a(obj);
            return;
        }
        D0 d1 = this.f3738F;
        boolean z5 = d1.f3576n;
        C0305b c0305b = this.f3740L;
        int i7 = 0;
        if (!z5) {
            C0206c c0206cA = d1.a(d1.i);
            C0304a c0304a = c0305b.f4351b;
            c0304a.getClass();
            O.e eVar = O.e.f4364c;
            O.D d6 = c0304a.f4349j;
            d6.M0(eVar);
            p020d2.n.M(d6, 0, c0206cA);
            p020d2.n.M(d6, 1, obj);
            int i8 = d6.f4347p;
            int i9 = eVar.f4339a;
            int iF0 = O.D.F0(d6, i9);
            int i10 = eVar.f4340b;
            if (i8 == iF0 && d6.f4348q == O.D.F0(d6, i10)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i11 = 0;
            for (int i12 = 0; i12 < i9; i12++) {
                if (((1 << i12) & d6.f4347p) != 0) {
                    if (i11 > 0) {
                        sb.append(", ");
                    }
                    sb.append(eVar.b(i12));
                    i11++;
                }
            }
            String string = sb.toString();
            StringBuilder sbN = AbstractC0013g0.n(string, "StringBuilder().apply(builderAction).toString()");
            int i13 = 0;
            int i14 = 0;
            while (i14 < i10) {
                int i15 = i10;
                if (((1 << i14) & d6.f4348q) != 0) {
                    if (i11 > 0) {
                        sbN.append(", ");
                    }
                    sbN.append(eVar.c(i14));
                    i13++;
                }
                i14++;
                i10 = i15;
            }
            String string2 = sbN.toString();
            E4.k.e("StringBuilder().apply(builderAction).toString()", string2);
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(eVar);
            sb2.append(". Not all arguments were provided. Missing ");
            AbstractC0013g0.s(sb2, i11, " int arguments (", string, ") and ");
            AbstractC0013g0.u(sb2, i13, " object arguments (", string2, ").");
            throw null;
        }
        int iR = (d1.f3574l - C0208d.r(d1.f3565b, d1.i)) - 1;
        if (c0305b.f4350a.f3738F.i - c0305b.f4355f >= 0) {
            c0305b.d(true);
            C0304a c0304a2 = c0305b.f4351b;
            O.m mVar = O.m.f4375g;
            O.D d7 = c0304a2.f4349j;
            d7.M0(mVar);
            p020d2.n.M(d7, 0, obj);
            p020d2.n.L(d7, 0, iR);
            if (d7.f4347p == O.D.F0(d7, 1) && d7.f4348q == O.D.F0(d7, 1)) {
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            if ((d7.f4347p & 1) != 0) {
                sb3.append(mVar.b(0));
                i = 1;
            } else {
                i = 0;
            }
            String string3 = sb3.toString();
            StringBuilder sbN2 = AbstractC0013g0.n(string3, "StringBuilder().apply(builderAction).toString()");
            if ((d7.f4348q & 1) != 0) {
                if (i > 0) {
                    sbN2.append(", ");
                }
                sbN2.append(mVar.c(0));
                i7 = 1;
            }
            String string4 = sbN2.toString();
            E4.k.e("StringBuilder().apply(builderAction).toString()", string4);
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(mVar);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC0013g0.s(sb4, i, " int arguments (", string3, ") and ");
            AbstractC0013g0.u(sb4, i7, " object arguments (", string4, ").");
            throw null;
        }
        D0 d8 = this.f3738F;
        C0206c c0206cA2 = d8.a(d8.i);
        C0304a c0304a3 = c0305b.f4351b;
        O.m mVar2 = O.m.f4374f;
        O.D d9 = c0304a3.f4349j;
        d9.M0(mVar2);
        p020d2.n.M(d9, 0, obj);
        p020d2.n.M(d9, 1, c0206cA2);
        p020d2.n.L(d9, 0, iR);
        if (d9.f4347p == O.D.F0(d9, 1) && d9.f4348q == O.D.F0(d9, 2)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        if ((d9.f4347p & 1) != 0) {
            sb5.append(mVar2.b(0));
            i3 = 1;
        } else {
            i3 = 0;
        }
        String string5 = sb5.toString();
        StringBuilder sbN3 = AbstractC0013g0.n(string5, "StringBuilder().apply(builderAction).toString()");
        int i16 = 0;
        for (int i17 = 2; i7 < i17; i17 = 2) {
            if (((1 << i7) & d9.f4348q) != 0) {
                if (i3 > 0) {
                    sbN3.append(", ");
                }
                sbN3.append(mVar2.c(i7));
                i16++;
            }
            i7++;
        }
        String string6 = sbN3.toString();
        E4.k.e("StringBuilder().apply(builderAction).toString()", string6);
        StringBuilder sb6 = new StringBuilder("Error while pushing ");
        sb6.append(mVar2);
        sb6.append(". Not all arguments were provided. Missing ");
        AbstractC0013g0.s(sb6, i3, " int arguments (", string5, ") and ");
        AbstractC0013g0.u(sb6, i16, " object arguments (", string6, ").");
        throw null;
    }

    public final boolean h(Object obj) {
        if (D() == obj) {
            return false;
        }
        g0(obj);
        return true;
    }

    public final int h0(int i) {
        int i3;
        if (i >= 0) {
            int[] iArr = this.f3757n;
            return (iArr == null || (i3 = iArr[i]) < 0) ? C0208d.o(this.f3738F.f3565b, i) : i3;
        }
        p080p.o oVar = this.f3758o;
        if (oVar == null || oVar.c(i) < 0) {
            return 0;
        }
        return oVar.d(i);
    }

    public final void i() {
        this.i = null;
        this.f3753j = 0;
        this.f3754k = 0;
        this.f3744P = 0;
        this.f3760q = false;
        C0305b c0305b = this.f3740L;
        c0305b.f4352c = false;
        c0305b.f4353d.f3626b = 0;
        c0305b.f4355f = 0;
        this.f3736D.f3729h.clear();
        this.f3757n = null;
        this.f3758o = null;
    }

    public final void i0() {
        if (!this.f3760q) {
            C0208d.w("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f3760q = false;
        if (this.f3743O) {
            C0208d.w("useNode() called while inserting");
            throw null;
        }
        D0 d1 = this.f3738F;
        Object objI = d1.i(d1.i);
        C0305b c0305b = this.f3740L;
        c0305b.c();
        c0305b.f4357h.f3729h.add(objI);
        if (this.f3767x && (objI instanceof InterfaceC0220j)) {
            c0305b.b();
            C0304a c0304a = c0305b.f4351b;
            c0304a.getClass();
            if (objI != null) {
                c0304a.f4349j.L0(O.B.f4338c);
            }
        }
    }

    public final int j(int i, int i3, int i6, int i7) {
        int iHashCode;
        Object objB;
        if (i == i6) {
            return i7;
        }
        D0 d1 = this.f3738F;
        boolean zL = C0208d.l(d1.f3565b, i);
        int[] iArr = d1.f3565b;
        if (zL) {
            Object objJ = d1.j(iArr, i);
            if (objJ != null) {
                iHashCode = objJ instanceof Enum ? ((Enum) objJ).ordinal() : objJ.hashCode();
            } else {
                iHashCode = 0;
            }
        } else {
            int i8 = iArr[i * 5];
            iHashCode = (i8 != 207 || (objB = d1.b(iArr, i)) == null || objB.equals(C0222k.f3714a)) ? i8 : objB.hashCode();
        }
        if (iHashCode == 126665345) {
            return iHashCode;
        }
        int i9 = this.f3738F.f3565b[(i * 5) + 2];
        if (i9 != i6) {
            i7 = j(i9, E(i9), i6, i7);
        }
        if (C0208d.l(this.f3738F.f3565b, i)) {
            i3 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i7, 3) ^ iHashCode, 3) ^ i3;
    }

    public final Object k(AbstractC0231o0 abstractC0231o0) {
        return C0208d.L(m(), abstractC0231o0);
    }

    public final void l(C1106n c1106n) {
        int i;
        int i3;
        if (!this.f3760q) {
            C0208d.w("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        int i6 = 0;
        this.f3760q = false;
        if (!this.f3743O) {
            C0208d.w("createNode() can only be called when inserting");
            throw null;
        }
        L l6 = this.f3756m;
        int i7 = l6.f3625a[l6.f3626b - 1];
        G0 g6 = this.H;
        C0206c c0206cB = g6.b(g6.f3609v);
        this.f3754k++;
        C0306c c0306c = this.f3742N;
        O.m mVar = O.m.f4372d;
        O.D d6 = c0306c.f4361j;
        d6.M0(mVar);
        p020d2.n.M(d6, 0, c1106n);
        p020d2.n.L(d6, 0, i7);
        p020d2.n.M(d6, 1, c0206cB);
        if (!(d6.f4347p == O.D.F0(d6, 1) && d6.f4348q == O.D.F0(d6, 2))) {
            StringBuilder sb = new StringBuilder();
            if ((1 & d6.f4347p) != 0) {
                sb.append(mVar.b(0));
                i3 = 1;
            } else {
                i3 = 0;
            }
            String string = sb.toString();
            StringBuilder sbN = AbstractC0013g0.n(string, "StringBuilder().apply(builderAction).toString()");
            int i8 = 0;
            for (int i9 = 2; i6 < i9; i9 = 2) {
                if (((1 << i6) & d6.f4348q) != 0) {
                    if (i3 > 0) {
                        sbN.append(", ");
                    }
                    sbN.append(mVar.c(i6));
                    i8++;
                }
                i6++;
            }
            String string2 = sbN.toString();
            E4.k.e("StringBuilder().apply(builderAction).toString()", string2);
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(mVar);
            sb2.append(". Not all arguments were provided. Missing ");
            AbstractC0013g0.s(sb2, i3, " int arguments (", string, ") and ");
            AbstractC0013g0.u(sb2, i8, " object arguments (", string2, ").");
            throw null;
        }
        O.m mVar2 = O.m.f4373e;
        O.D d7 = c0306c.f4362k;
        d7.M0(mVar2);
        p020d2.n.L(d7, 0, i7);
        p020d2.n.M(d7, 0, c0206cB);
        if (d7.f4347p == O.D.F0(d7, 1) && d7.f4348q == O.D.F0(d7, 1)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        if ((d7.f4347p & 1) != 0) {
            sb3.append(mVar2.b(0));
            i = 1;
        } else {
            i = 0;
        }
        String string3 = sb3.toString();
        StringBuilder sbN2 = AbstractC0013g0.n(string3, "StringBuilder().apply(builderAction).toString()");
        if ((d7.f4348q & 1) != 0) {
            if (i > 0) {
                sbN2.append(", ");
            }
            sbN2.append(mVar2.c(0));
            i6 = 1;
        }
        String string4 = sbN2.toString();
        E4.k.e("StringBuilder().apply(builderAction).toString()", string4);
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(mVar2);
        sb4.append(". Not all arguments were provided. Missing ");
        AbstractC0013g0.s(sb4, i, " int arguments (", string3, ") and ");
        AbstractC0013g0.u(sb4, i6, " object arguments (", string4, ").");
        throw null;
    }

    public final InterfaceC0225l0 m() {
        InterfaceC0225l0 interfaceC0225l0;
        Object obj;
        Object obj2;
        int i;
        InterfaceC0225l0 interfaceC0225l1 = this.J;
        if (interfaceC0225l1 != null) {
            return interfaceC0225l1;
        }
        int i3 = this.f3738F.i;
        boolean z5 = this.f3743O;
        C0205b0 c0205b0 = C0208d.f3689c;
        if (z5 && this.I) {
            int iX = this.H.f3609v;
            while (iX > 0) {
                G0 g6 = this.H;
                if (g6.f3590b[g6.p(iX) * 5] == 202) {
                    G0 g7 = this.H;
                    int iP = g7.p(iX);
                    int i6 = 2;
                    if (C0208d.l(g7.f3590b, iP)) {
                        Object[] objArr = g7.f3591c;
                        int[] iArr = g7.f3590b;
                        int i7 = iP * 5;
                        int i8 = iArr[i7 + 4];
                        switch (iArr[i7 + 1] >> 30) {
                            case 0:
                                i = 0;
                                break;
                            case 1:
                            case 2:
                            case 4:
                                i = 1;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i = 2;
                                break;
                            default:
                                i = 3;
                                break;
                        }
                        obj = objArr[i + i8];
                    } else {
                        obj = null;
                    }
                    if (E4.k.a(obj, c0205b0)) {
                        G0 g8 = this.H;
                        int iP2 = g8.p(iX);
                        if (C0208d.k(g8.f3590b, iP2)) {
                            Object[] objArr2 = g8.f3591c;
                            int[] iArr2 = g8.f3590b;
                            int iF = g8.f(iArr2, iP2);
                            switch (iArr2[(iP2 * 5) + 1] >> 29) {
                                case 0:
                                    i6 = 0;
                                    break;
                                case 1:
                                case 2:
                                case 4:
                                    i6 = 1;
                                    break;
                                case 3:
                                case 5:
                                case 6:
                                    break;
                                default:
                                    i6 = 3;
                                    break;
                            }
                            obj2 = objArr2[i6 + iF];
                        } else {
                            obj2 = C0222k.f3714a;
                        }
                        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap", obj2);
                        InterfaceC0225l0 interfaceC0225l2 = (InterfaceC0225l0) obj2;
                        this.J = interfaceC0225l2;
                        return interfaceC0225l2;
                    }
                }
                G0 g9 = this.H;
                iX = g9.x(g9.f3590b, iX);
            }
        }
        if (this.f3738F.f3566c > 0) {
            while (i3 > 0) {
                D0 d1 = this.f3738F;
                int i9 = i3 * 5;
                int[] iArr3 = d1.f3565b;
                if (iArr3[i9] == 202 && E4.k.a(d1.j(iArr3, i3), c0205b0)) {
                    C0025m0 c0025m0 = this.f3764u;
                    if (c0025m0 == null || (interfaceC0225l0 = (InterfaceC0225l0) ((SparseArray) c0025m0.i).get(i3)) == null) {
                        D0 d6 = this.f3738F;
                        Object objB = d6.b(d6.f3565b, i3);
                        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap", objB);
                        interfaceC0225l0 = (InterfaceC0225l0) objB;
                    }
                    this.J = interfaceC0225l0;
                    return interfaceC0225l0;
                }
                i3 = this.f3738F.f3565b[i9 + 2];
            }
        }
        InterfaceC0225l0 interfaceC0225l3 = this.f3763t;
        this.J = interfaceC0225l3;
        return interfaceC0225l3;
    }

    public final void n(C0025m0 c0025m0, V.a aVar) {
        Object obj;
        Object obj2;
        Object obj3 = null;
        if (this.f3737E) {
            C0208d.w("Reentrant composition is not supported");
            throw null;
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.f3733A = X.o.k().d();
            this.f3764u = null;
            p080p.x xVar = (p080p.x) c0025m0.i;
            Object[] objArr = xVar.f10797b;
            Object[] objArr2 = xVar.f10798c;
            long[] jArr = xVar.f10796a;
            int length = jArr.length - 2;
            ArrayList arrayList = this.f3761r;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j4 = jArr[i];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8;
                        int i6 = 8 - ((~(i - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i << 3) + i7;
                                obj2 = obj3;
                                Object obj4 = objArr[i8];
                                Object obj5 = objArr2[i8];
                                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl", obj4);
                                C0206c c0206c = ((C0235q0) obj4).f3779c;
                                if (c0206c != null) {
                                    int i9 = c0206c.f3685a;
                                    C0235q0 c0235q0 = (C0235q0) obj4;
                                    if (obj5 == U.f3672l) {
                                        obj5 = obj2;
                                    }
                                    arrayList.add(new M(c0235q0, i9, obj5));
                                }
                                j4 >>= i3;
                                i7++;
                                obj3 = obj2;
                                i3 = i3;
                            } else {
                                obj2 = obj3;
                            }
                            j4 >>= i3;
                            i7++;
                            obj3 = obj2;
                            i3 = i3;
                        }
                        obj = obj3;
                        if (i6 != i3) {
                            break;
                        }
                    } else {
                        obj = obj3;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                    obj3 = obj;
                }
            }
            p089q4.q.Q(arrayList, C0208d.f3692f);
            this.f3753j = 0;
            this.f3737E = true;
            try {
                a0();
                Object objD = D();
                if (objD != aVar && aVar != null) {
                    g0(aVar);
                }
                C0228n c0228n = this.f3735C;
                P.d dVarB = C0208d.B();
                try {
                    dVarB.c(c0228n);
                    C0205b0 c0205b0 = C0208d.f3687a;
                    if (aVar != null) {
                        S(200, c0205b0);
                        C0208d.G(this, aVar);
                        p(false);
                    } else if (!this.f3765v || objD == null || objD.equals(C0222k.f3714a)) {
                        N();
                    } else {
                        S(200, c0205b0);
                        E4.z.d(2, objD);
                        C0208d.G(this, (D4.e) objD);
                        p(false);
                    }
                    dVarB.p(dVarB.f4583j - 1);
                    u();
                    this.f3737E = false;
                    arrayList.clear();
                    C0208d.P(this.H.f3610w);
                    w();
                    Trace.endSection();
                } catch (Throwable th) {
                    dVarB.p(dVarB.f4583j - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.f3737E = false;
                arrayList.clear();
                a();
                C0208d.P(this.H.f3610w);
                w();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public final void o(int i, int i3) {
        if (i <= 0 || i == i3) {
            return;
        }
        o(this.f3738F.f3565b[(i * 5) + 2], i3);
        if (C0208d.m(this.f3738F.f3565b, i)) {
            Object objI = this.f3738F.i(i);
            C0305b c0305b = this.f3740L;
            c0305b.c();
            c0305b.f4357h.f3729h.add(objI);
        }
    }

    /* JADX WARN: Code duplicated, block: B:166:0x03df  */
    /* JADX WARN: Code duplicated, block: B:247:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:249:0x0604 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:250:0x0606  */
    /* JADX WARN: Code duplicated, block: B:255:0x0623  */
    /* JADX WARN: Code duplicated, block: B:257:0x062f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x0631  */
    /* JADX WARN: Code duplicated, block: B:301:0x074b  */
    /* JADX WARN: Code duplicated, block: B:375:0x090b  */
    /* JADX WARN: Code duplicated, block: B:455:0x0612 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x063d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void p(boolean z5) {
        int iHashCode;
        L l6;
        int i;
        Throwable th;
        int i3;
        C0230o c0230o;
        int i6;
        int i7;
        int i8;
        C0230o c0230o2;
        O.n nVar;
        O.D d6;
        int i9;
        int i10;
        int iF0;
        int i11;
        StringBuilder sb;
        int i12;
        int i13;
        StringBuilder sbN;
        int i14;
        int i15;
        int i16;
        C0223k0 c0223k0;
        LinkedHashSet linkedHashSet;
        int i17;
        ArrayList arrayList;
        ArrayList arrayList2;
        HashSet hashSet;
        int i18;
        int i19;
        Object[] objArr;
        long[] jArr;
        int i20;
        Object[] objArr2;
        long[] jArr2;
        int i21;
        int i22;
        Object[] objArr3;
        int i23;
        Object[] objArr4;
        long j4;
        Object obj;
        Object obj2;
        int iHashCode2;
        int i24;
        int i25;
        L l7 = this.f3756m;
        int i26 = l7.f3625a[l7.f3626b - 2] - 1;
        boolean z6 = this.f3743O;
        U u6 = C0222k.f3714a;
        if (z6) {
            G0 g6 = this.H;
            int i27 = g6.f3609v;
            int i28 = g6.f3590b[g6.p(i27) * 5];
            G0 g7 = this.H;
            int iP = g7.p(i27);
            if (C0208d.l(g7.f3590b, iP)) {
                Object[] objArr5 = g7.f3591c;
                int[] iArr = g7.f3590b;
                int i29 = iP * 5;
                int i30 = iArr[i29 + 4];
                switch (iArr[i29 + 1] >> 30) {
                    case 0:
                        i25 = 0;
                        break;
                    case 1:
                    case 2:
                    case 4:
                        i25 = 1;
                        break;
                    case 3:
                    case 5:
                    case 6:
                        i25 = 2;
                        break;
                    default:
                        i25 = 3;
                        break;
                }
                obj = objArr5[i25 + i30];
            } else {
                obj = null;
            }
            G0 g8 = this.H;
            int iP2 = g8.p(i27);
            if (C0208d.k(g8.f3590b, iP2)) {
                Object[] objArr6 = g8.f3591c;
                int[] iArr2 = g8.f3590b;
                int iF = g8.f(iArr2, iP2);
                switch (iArr2[(iP2 * 5) + 1] >> 29) {
                    case 0:
                        i24 = 0;
                        break;
                    case 1:
                    case 2:
                    case 4:
                        i24 = 1;
                        break;
                    case 3:
                    case 5:
                    case 6:
                        i24 = 2;
                        break;
                    default:
                        i24 = 3;
                        break;
                }
                obj2 = objArr6[i24 + iF];
            } else {
                obj2 = u6;
            }
            if (obj != null) {
                iHashCode2 = Integer.hashCode(obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode()) ^ Integer.rotateRight(this.f3744P, 3);
            } else if (obj2 == null || i28 != 207 || obj2.equals(u6)) {
                iHashCode2 = Integer.rotateRight(i26 ^ this.f3744P, 3) ^ Integer.hashCode(i28);
            } else {
                this.f3744P = Integer.rotateRight(Integer.rotateRight(i26 ^ this.f3744P, 3) ^ Integer.hashCode(obj2.hashCode()), 3);
            }
            this.f3744P = Integer.rotateRight(iHashCode2, 3);
        } else {
            D0 d1 = this.f3738F;
            int i31 = d1.i;
            int[] iArr3 = d1.f3565b;
            int i32 = iArr3[i31 * 5];
            Object objJ = d1.j(iArr3, i31);
            D0 d7 = this.f3738F;
            Object objB = d7.b(d7.f3565b, i31);
            if (objJ != null) {
                iHashCode = Integer.hashCode(objJ instanceof Enum ? ((Enum) objJ).ordinal() : objJ.hashCode()) ^ Integer.rotateRight(this.f3744P, 3);
            } else if (objB == null || i32 != 207 || objB.equals(u6)) {
                iHashCode = Integer.rotateRight(i26 ^ this.f3744P, 3) ^ Integer.hashCode(i32);
            } else {
                this.f3744P = Integer.rotateRight(Integer.rotateRight(i26 ^ this.f3744P, 3) ^ Integer.hashCode(objB.hashCode()), 3);
            }
            this.f3744P = Integer.rotateRight(iHashCode, 3);
        }
        int i33 = this.f3754k;
        C0223k0 c0223k1 = this.i;
        ArrayList arrayList3 = this.f3761r;
        C0305b c0305b = this.f3740L;
        if (c0223k1 != null) {
            ArrayList arrayList4 = c0223k1.f3715a;
            if (arrayList4.size() > 0) {
                ArrayList arrayList5 = c0223k1.f3718d;
                HashSet hashSet2 = new HashSet(arrayList5.size());
                int size = arrayList5.size();
                for (int i34 = 0; i34 < size; i34++) {
                    hashSet2.add(arrayList5.get(i34));
                }
                th = null;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList5.size();
                int size3 = arrayList4.size();
                i = 2;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                i3 = -1;
                while (i37 < size3) {
                    O o6 = (O) arrayList4.get(i37);
                    boolean zContains = hashSet2.contains(o6);
                    l7 = l7;
                    p080p.q qVar = c0223k1.f3719e;
                    int i38 = i37;
                    int i39 = c0223k1.f3716b;
                    if (!zContains) {
                        I i40 = (I) qVar.f(o6.f3640c);
                        c0305b.e((i40 != null ? i40.f3615b : -1) + i39, o6.f3641d);
                        int i41 = o6.f3640c;
                        c0223k1.a(i41, 0);
                        c0305b.f4355f = (i41 - c0305b.f4350a.f3738F.f3570g) + c0305b.f4355f;
                        this.f3738F.k(i41);
                        H();
                        this.f3738F.l();
                        C0208d.q(arrayList3, i41, this.f3738F.f3565b[(i41 * 5) + 3] + i41);
                    } else if (!linkedHashSet2.contains(o6)) {
                        if (i36 < size2) {
                            O o7 = (O) arrayList5.get(i36);
                            if (o7 != o6) {
                                I i42 = (I) qVar.f(o7.f3640c);
                                int i43 = i42 != null ? i42.f3615b : -1;
                                linkedHashSet2.add(o7);
                                if (i43 != i35) {
                                    I i44 = (I) qVar.f(o7.f3640c);
                                    int i45 = i44 != null ? i44.f3616c : o7.f3641d;
                                    c0223k0 = c0223k1;
                                    int i46 = i43 + i39;
                                    linkedHashSet = linkedHashSet2;
                                    int i47 = i35 + i39;
                                    if (i45 > 0) {
                                        i17 = size2;
                                        int i48 = c0305b.f4360l;
                                        if (i48 > 0) {
                                            arrayList = arrayList4;
                                            if (c0305b.f4358j == i46 - i48 && c0305b.f4359k == i47 - i48) {
                                                c0305b.f4360l = i48 + i45;
                                            }
                                        } else {
                                            arrayList = arrayList4;
                                        }
                                        c0305b.c();
                                        c0305b.f4358j = i46;
                                        c0305b.f4359k = i47;
                                        c0305b.f4360l = i45;
                                    } else {
                                        i17 = size2;
                                        arrayList = arrayList4;
                                        c0305b.getClass();
                                    }
                                    if (i43 > i35) {
                                        Object[] objArr7 = qVar.f10762c;
                                        long[] jArr3 = qVar.f10760a;
                                        int length = jArr3.length - 2;
                                        if (length >= 0) {
                                            arrayList2 = arrayList5;
                                            int i49 = 0;
                                            while (true) {
                                                long j6 = jArr3[i49];
                                                hashSet = hashSet2;
                                                i18 = size3;
                                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i50 = 8 - ((~(i49 - length)) >>> 31);
                                                    int i51 = 0;
                                                    while (i51 < i50) {
                                                        if ((j6 & 255) < 128) {
                                                            i23 = i45;
                                                            I i52 = (I) objArr7[(i49 << 3) + i51];
                                                            objArr4 = objArr7;
                                                            int i53 = i52.f3615b;
                                                            j4 = j6;
                                                            if (i43 <= i53 && i53 < i43 + i23) {
                                                                i52.f3615b = (i53 - i43) + i35;
                                                            } else if (i35 <= i53 && i53 < i43) {
                                                                i52.f3615b = i53 + i23;
                                                            }
                                                        } else {
                                                            i23 = i45;
                                                            objArr4 = objArr7;
                                                            j4 = j6;
                                                        }
                                                        j6 = j4 >> 8;
                                                        i51++;
                                                        objArr7 = objArr4;
                                                        i45 = i23;
                                                    }
                                                    i22 = i45;
                                                    objArr3 = objArr7;
                                                    if (i50 == 8) {
                                                    }
                                                } else {
                                                    i22 = i45;
                                                    objArr3 = objArr7;
                                                }
                                                if (i49 != length) {
                                                    i49++;
                                                    hashSet2 = hashSet;
                                                    size3 = i18;
                                                    objArr7 = objArr3;
                                                    i45 = i22;
                                                }
                                            }
                                        }
                                    } else {
                                        int i54 = i45;
                                        arrayList2 = arrayList5;
                                        hashSet = hashSet2;
                                        i18 = size3;
                                        if (i35 > i43) {
                                            Object[] objArr8 = qVar.f10762c;
                                            long[] jArr4 = qVar.f10760a;
                                            int length2 = jArr4.length - 2;
                                            if (length2 >= 0) {
                                                int i55 = 0;
                                                while (true) {
                                                    long j7 = jArr4[i55];
                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i56 = 8 - ((~(i55 - length2)) >>> 31);
                                                        int i57 = 0;
                                                        while (i57 < i56) {
                                                            if ((j7 & 255) < 128) {
                                                                objArr2 = objArr8;
                                                                I i58 = (I) objArr8[(i55 << 3) + i57];
                                                                jArr2 = jArr4;
                                                                int i59 = i58.f3615b;
                                                                i21 = i43;
                                                                if (i43 <= i59 && i59 < i21 + i54) {
                                                                    i58.f3615b = (i59 - i21) + i35;
                                                                } else if (i21 + 1 <= i59 && i59 < i35) {
                                                                    i58.f3615b = i59 - i54;
                                                                }
                                                            } else {
                                                                objArr2 = objArr8;
                                                                jArr2 = jArr4;
                                                                i21 = i43;
                                                            }
                                                            j7 >>= 8;
                                                            i57++;
                                                            jArr4 = jArr2;
                                                            objArr8 = objArr2;
                                                            i43 = i21;
                                                        }
                                                        objArr = objArr8;
                                                        jArr = jArr4;
                                                        i20 = i43;
                                                        if (i56 == 8) {
                                                        }
                                                    } else {
                                                        objArr = objArr8;
                                                        jArr = jArr4;
                                                        i20 = i43;
                                                    }
                                                    if (i55 != length2) {
                                                        i55++;
                                                        jArr4 = jArr;
                                                        objArr8 = objArr;
                                                        i43 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i19 = i38;
                                } else {
                                    c0223k0 = c0223k1;
                                    linkedHashSet = linkedHashSet2;
                                    i17 = size2;
                                    arrayList = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                hashSet = hashSet2;
                                i18 = size3;
                                i19 = i38;
                            } else {
                                c0223k0 = c0223k1;
                                linkedHashSet = linkedHashSet2;
                                i17 = size2;
                                arrayList = arrayList4;
                                arrayList2 = arrayList5;
                                hashSet = hashSet2;
                                i18 = size3;
                                i19 = i38 + 1;
                            }
                            int i60 = i36 + 1;
                            I i61 = (I) qVar.f(o7.f3640c);
                            i35 += i61 != null ? i61.f3616c : o7.f3641d;
                            i37 = i19;
                            i36 = i60;
                            size2 = i17;
                            c0223k1 = c0223k0;
                            linkedHashSet2 = linkedHashSet;
                            arrayList4 = arrayList;
                            arrayList5 = arrayList2;
                            hashSet2 = hashSet;
                            size3 = i18;
                        } else {
                            i37 = i38;
                        }
                    }
                    i37 = i38 + 1;
                }
                l6 = l7;
                c0305b.c();
                if (arrayList4.size() > 0) {
                    D0 d8 = this.f3738F;
                    c0305b.f4355f = (d8.f3571h - c0305b.f4350a.f3738F.f3570g) + c0305b.f4355f;
                    d8.m();
                }
            } else {
                l6 = l7;
                i = 2;
                th = null;
                i3 = -1;
            }
        } else {
            l6 = l7;
            i = 2;
            th = null;
            i3 = -1;
        }
        int i62 = this.f3753j;
        while (true) {
            D0 d9 = this.f3738F;
            if (d9.f3573k <= 0 && (i16 = d9.f3570g) != d9.f3571h) {
                H();
                c0305b.e(i62, this.f3738F.l());
                C0208d.q(arrayList3, i16, this.f3738F.f3570g);
                i = i;
                i33 = i33;
            }
        }
        boolean z7 = this.f3743O;
        if (z7) {
            if (z5) {
                C0306c c0306c = this.f3742N;
                O.D d10 = c0306c.f4362k;
                if (!d10.J0()) {
                    C0208d.w("Cannot end node insertion, there are no pending operations that can be realized.");
                    throw th;
                }
                if (d10.I0()) {
                    throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
                }
                O.C[] cArr = d10.f4341j;
                int i63 = d10.f4342k - 1;
                d10.f4342k = i63;
                O.C c6 = cArr[i63];
                E4.k.c(c6);
                i6 = -2;
                d10.f4341j[d10.f4342k] = th;
                O.D d11 = c0306c.f4361j;
                d11.M0(c6);
                int i64 = d10.f4346o;
                int i65 = d11.f4346o;
                int i66 = 0;
                while (true) {
                    int i67 = i64;
                    int i68 = c6.f4340b;
                    if (i66 < i68) {
                        i65--;
                        i64 = i67 - 1;
                        int i69 = i66;
                        Object[] objArr9 = d11.f4345n;
                        Object[] objArr10 = d10.f4345n;
                        objArr9[i65] = objArr10[i64];
                        objArr10[i64] = th;
                        i66 = i69 + 1;
                    } else {
                        int i70 = d10.f4344m;
                        int i71 = d11.f4344m;
                        int i72 = i70;
                        int i73 = 0;
                        while (true) {
                            int i74 = c6.f4339a;
                            if (i73 < i74) {
                                i71--;
                                int i75 = i72 - 1;
                                int i76 = i73;
                                int[] iArr4 = d11.f4343l;
                                int[] iArr5 = d10.f4343l;
                                iArr4[i71] = iArr5[i75];
                                iArr5[i75] = 0;
                                i73 = i76 + 1;
                                i72 = i75;
                            } else {
                                d10.f4346o -= i68;
                                d10.f4344m -= i74;
                                i33 = 1;
                            }
                        }
                    }
                }
            } else {
                i6 = -2;
            }
            D0 d12 = this.f3738F;
            int i77 = d12.f3573k;
            if (i77 <= 0) {
                C0208d.S("Unbalanced begin/end empty");
                throw th;
            }
            d12.f3573k = i77 - 1;
            G0 g9 = this.H;
            int i78 = g9.f3609v;
            g9.i();
            if (this.f3738F.f3573k > 0) {
                c0230o2 = this;
            } else {
                int i79 = (-2) - i78;
                this.H.j();
                this.H.e(true);
                C0206c c0206c = this.f3741M;
                if (this.f3742N.f4361j.I0()) {
                    E0 e6 = this.G;
                    c0305b.b();
                    c0305b.d(false);
                    D0 d13 = c0305b.f4350a.f3738F;
                    if (d13.f3566c > 0) {
                        int i80 = d13.i;
                        i7 = i33;
                        L l8 = c0305b.f4353d;
                        i8 = i79;
                        int i81 = l8.f3626b;
                        if ((i81 > 0 ? l8.f3625a[i81 - 1] : i6) != i80) {
                            if (!c0305b.f4352c && c0305b.f4354e) {
                                c0305b.d(false);
                                C0304a c0304a = c0305b.f4351b;
                                c0304a.getClass();
                                c0304a.f4349j.L0(O.l.f4371c);
                                c0305b.f4352c = true;
                            }
                            if (i80 > 0) {
                                C0206c c0206cA = d13.a(i80);
                                l8.b(i80);
                                c0305b.d(false);
                                C0304a c0304a2 = c0305b.f4351b;
                                c0304a2.getClass();
                                O.k kVar = O.k.f4370c;
                                O.D d14 = c0304a2.f4349j;
                                d14.M0(kVar);
                                p020d2.n.M(d14, 0, c0206cA);
                                int i82 = d14.f4347p;
                                int i83 = kVar.f4339a;
                                int iF1 = O.D.F0(d14, i83);
                                int i84 = kVar.f4340b;
                                if (i82 != iF1 || d14.f4348q != O.D.F0(d14, i84)) {
                                    int i85 = 1;
                                    StringBuilder sb2 = new StringBuilder();
                                    int i86 = 0;
                                    int i87 = 0;
                                    while (i86 < i83) {
                                        if (((i85 << i86) & d14.f4347p) != 0) {
                                            if (i87 > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(kVar.b(i86));
                                            i87++;
                                        }
                                        i86++;
                                        i85 = 1;
                                    }
                                    String string = sb2.toString();
                                    StringBuilder sbN2 = AbstractC0013g0.n(string, "StringBuilder().apply(builderAction).toString()");
                                    int i88 = 0;
                                    int i89 = 0;
                                    while (i88 < i84) {
                                        int i90 = i84;
                                        if (((1 << i88) & d14.f4348q) != 0) {
                                            if (i87 > 0) {
                                                sbN2.append(", ");
                                            }
                                            sbN2.append(kVar.c(i88));
                                            i89++;
                                        }
                                        i88++;
                                        i84 = i90;
                                    }
                                    String string2 = sbN2.toString();
                                    E4.k.e("StringBuilder().apply(builderAction).toString()", string2);
                                    StringBuilder sb3 = new StringBuilder("Error while pushing ");
                                    sb3.append(kVar);
                                    sb3.append(". Not all arguments were provided. Missing ");
                                    AbstractC0013g0.s(sb3, i87, " int arguments (", string, ") and ");
                                    AbstractC0013g0.u(sb3, i89, " object arguments (", string2, ").");
                                    throw th;
                                }
                                c0305b.f4352c = true;
                            }
                        }
                        c0305b.c();
                        C0304a c0304a3 = c0305b.f4351b;
                        c0304a3.getClass();
                        nVar = O.n.f4377c;
                        d6 = c0304a3.f4349j;
                        d6.M0(nVar);
                        p020d2.n.M(d6, 0, c0206c);
                        p020d2.n.M(d6, 1, e6);
                        i9 = d6.f4347p;
                        i10 = nVar.f4339a;
                        iF0 = O.D.F0(d6, i10);
                        i11 = nVar.f4340b;
                        if (i9 == iF0 || d6.f4348q != O.D.F0(d6, i11)) {
                            sb = new StringBuilder();
                            i12 = 0;
                            i13 = 0;
                            while (i12 < i10) {
                                int i91 = i10;
                                if ((d6.f4347p & (1 << i12)) == 0) {
                                    if (i13 > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(nVar.b(i12));
                                    i13++;
                                }
                                i12++;
                                i10 = i91;
                            }
                            String string3 = sb.toString();
                            sbN = AbstractC0013g0.n(string3, "StringBuilder().apply(builderAction).toString()");
                            i14 = 0;
                            i15 = 0;
                            while (i14 < i11) {
                                int i92 = i11;
                                if (((1 << i14) & d6.f4348q) == 0) {
                                    if (i13 > 0) {
                                        sbN.append(", ");
                                    }
                                    sbN.append(nVar.c(i14));
                                    i15++;
                                }
                                i14++;
                                i11 = i92;
                            }
                            String string4 = sbN.toString();
                            E4.k.e("StringBuilder().apply(builderAction).toString()", string4);
                            StringBuilder sb4 = new StringBuilder("Error while pushing ");
                            sb4.append(nVar);
                            sb4.append(". Not all arguments were provided. Missing ");
                            AbstractC0013g0.s(sb4, i13, " int arguments (", string3, ") and ");
                            AbstractC0013g0.u(sb4, i15, " object arguments (", string4, ").");
                            throw th;
                        }
                        c0230o2 = this;
                    } else {
                        i7 = i33;
                        i8 = i79;
                    }
                    c0305b.c();
                    C0304a c0304a4 = c0305b.f4351b;
                    c0304a4.getClass();
                    nVar = O.n.f4377c;
                    d6 = c0304a4.f4349j;
                    d6.M0(nVar);
                    p020d2.n.M(d6, 0, c0206c);
                    p020d2.n.M(d6, 1, e6);
                    i9 = d6.f4347p;
                    i10 = nVar.f4339a;
                    iF0 = O.D.F0(d6, i10);
                    i11 = nVar.f4340b;
                    if (i9 == iF0) {
                    }
                    sb = new StringBuilder();
                    i12 = 0;
                    i13 = 0;
                    while (i12 < i10) {
                        int i93 = i10;
                        if ((d6.f4347p & (1 << i12)) == 0) {
                            if (i13 > 0) {
                                sb.append(", ");
                            }
                            sb.append(nVar.b(i12));
                            i13++;
                        }
                        i12++;
                        i10 = i93;
                    }
                    String string5 = sb.toString();
                    sbN = AbstractC0013g0.n(string5, "StringBuilder().apply(builderAction).toString()");
                    i14 = 0;
                    i15 = 0;
                    while (i14 < i11) {
                        int i94 = i11;
                        if (((1 << i14) & d6.f4348q) == 0) {
                            if (i13 > 0) {
                                sbN.append(", ");
                            }
                            sbN.append(nVar.c(i14));
                            i15++;
                        }
                        i14++;
                        i11 = i94;
                    }
                    String string6 = sbN.toString();
                    E4.k.e("StringBuilder().apply(builderAction).toString()", string6);
                    StringBuilder sb5 = new StringBuilder("Error while pushing ");
                    sb5.append(nVar);
                    sb5.append(". Not all arguments were provided. Missing ");
                    AbstractC0013g0.s(sb5, i13, " int arguments (", string5, ") and ");
                    AbstractC0013g0.u(sb5, i15, " object arguments (", string6, ").");
                    throw th;
                }
                i7 = i33;
                i8 = i79;
                E0 e7 = this.G;
                C0306c c0306c2 = this.f3742N;
                c0305b.b();
                c0305b.d(false);
                D0 d15 = c0305b.f4350a.f3738F;
                if (d15.f3566c > 0) {
                    int i95 = d15.i;
                    L l9 = c0305b.f4353d;
                    int i96 = l9.f3626b;
                    if ((i96 > 0 ? l9.f3625a[i96 - 1] : i6) != i95) {
                        if (!c0305b.f4352c && c0305b.f4354e) {
                            c0305b.d(false);
                            C0304a c0304a5 = c0305b.f4351b;
                            c0304a5.getClass();
                            c0304a5.f4349j.L0(O.l.f4371c);
                            c0305b.f4352c = true;
                        }
                        if (i95 > 0) {
                            C0206c c0206cA2 = d15.a(i95);
                            l9.b(i95);
                            c0305b.d(false);
                            C0304a c0304a6 = c0305b.f4351b;
                            c0304a6.getClass();
                            O.k kVar2 = O.k.f4370c;
                            O.D d16 = c0304a6.f4349j;
                            d16.M0(kVar2);
                            p020d2.n.M(d16, 0, c0206cA2);
                            int i97 = d16.f4347p;
                            int i98 = kVar2.f4339a;
                            int iF2 = O.D.F0(d16, i98);
                            int i99 = kVar2.f4340b;
                            if (i97 != iF2 || d16.f4348q != O.D.F0(d16, i99)) {
                                int i100 = 1;
                                StringBuilder sb6 = new StringBuilder();
                                int i101 = 0;
                                int i102 = 0;
                                while (i101 < i98) {
                                    if (((i100 << i101) & d16.f4347p) != 0) {
                                        if (i102 > 0) {
                                            sb6.append(", ");
                                        }
                                        sb6.append(kVar2.b(i101));
                                        i102++;
                                    }
                                    i101++;
                                    i100 = 1;
                                }
                                String string7 = sb6.toString();
                                StringBuilder sbN3 = AbstractC0013g0.n(string7, "StringBuilder().apply(builderAction).toString()");
                                int i103 = 0;
                                int i104 = 0;
                                while (i103 < i99) {
                                    int i105 = i99;
                                    if (((1 << i103) & d16.f4348q) != 0) {
                                        if (i102 > 0) {
                                            sbN3.append(", ");
                                        }
                                        sbN3.append(kVar2.c(i103));
                                        i104++;
                                    }
                                    i103++;
                                    i99 = i105;
                                }
                                String string8 = sbN3.toString();
                                E4.k.e("StringBuilder().apply(builderAction).toString()", string8);
                                StringBuilder sb7 = new StringBuilder("Error while pushing ");
                                sb7.append(kVar2);
                                sb7.append(". Not all arguments were provided. Missing ");
                                AbstractC0013g0.s(sb7, i102, " int arguments (", string7, ") and ");
                                AbstractC0013g0.u(sb7, i104, " object arguments (", string8, ").");
                                throw th;
                            }
                            c0305b.f4352c = true;
                        }
                    } else {
                        c0306c2 = c0306c2;
                    }
                } else {
                    c0306c2 = c0306c2;
                }
                c0305b.c();
                C0304a c0304a7 = c0305b.f4351b;
                c0304a7.getClass();
                O.o oVar = O.o.f4378c;
                O.D d17 = c0304a7.f4349j;
                d17.M0(oVar);
                p020d2.n.M(d17, 0, c0206c);
                p020d2.n.M(d17, 1, e7);
                p020d2.n.M(d17, i, c0306c2);
                int i106 = d17.f4347p;
                int i107 = oVar.f4339a;
                int iF3 = O.D.F0(d17, i107);
                int i108 = oVar.f4340b;
                if (i106 != iF3 || d17.f4348q != O.D.F0(d17, i108)) {
                    StringBuilder sb8 = new StringBuilder();
                    int i109 = 0;
                    int i110 = 0;
                    while (i109 < i107) {
                        int i111 = i107;
                        if ((d17.f4347p & (1 << i109)) != 0) {
                            if (i110 > 0) {
                                sb8.append(", ");
                            }
                            sb8.append(oVar.b(i109));
                            i110++;
                        }
                        i109++;
                        i107 = i111;
                    }
                    String string9 = sb8.toString();
                    StringBuilder sbN4 = AbstractC0013g0.n(string9, "StringBuilder().apply(builderAction).toString()");
                    int i112 = 0;
                    int i113 = 0;
                    while (i112 < i108) {
                        int i114 = i108;
                        if (((1 << i112) & d17.f4348q) != 0) {
                            if (i110 > 0) {
                                sbN4.append(", ");
                            }
                            sbN4.append(oVar.c(i112));
                            i113++;
                        }
                        i112++;
                        i108 = i114;
                    }
                    String string10 = sbN4.toString();
                    E4.k.e("StringBuilder().apply(builderAction).toString()", string10);
                    StringBuilder sb9 = new StringBuilder("Error while pushing ");
                    sb9.append(oVar);
                    sb9.append(". Not all arguments were provided. Missing ");
                    AbstractC0013g0.s(sb9, i110, " int arguments (", string9, ") and ");
                    AbstractC0013g0.u(sb9, i113, " object arguments (", string10, ").");
                    throw th;
                }
                c0230o2 = this;
                c0230o2.f3742N = new C0306c();
                c0230o2.f3743O = false;
                if (c0230o2.f3747c.i == 0) {
                    i33 = i7;
                } else {
                    int i115 = i8;
                    c0230o2.c0(i115, 0);
                    i33 = i7;
                    c0230o2.d0(i115, i33);
                }
            }
            c0230o = c0230o2;
        } else {
            z7 = z7;
            if (z5) {
                c0305b.a();
            }
            D0 d18 = this.f3738F;
            int i116 = d18.f3575m - d18.f3574l;
            if (i116 <= 0) {
                i33 = i33;
            } else if (i116 > 0) {
                c0305b.d(false);
                D0 d19 = c0305b.f4350a.f3738F;
                if (d19.f3566c > 0) {
                    int i117 = d19.i;
                    L l10 = c0305b.f4353d;
                    int i118 = l10.f3626b;
                    if ((i118 > 0 ? l10.f3625a[i118 - 1] : -2) != i117) {
                        if (!c0305b.f4352c && c0305b.f4354e) {
                            c0305b.d(false);
                            C0304a c0304a8 = c0305b.f4351b;
                            c0304a8.getClass();
                            c0304a8.f4349j.L0(O.l.f4371c);
                            c0305b.f4352c = true;
                        }
                        if (i117 > 0) {
                            C0206c c0206cA3 = d19.a(i117);
                            l10.b(i117);
                            c0305b.d(false);
                            C0304a c0304a9 = c0305b.f4351b;
                            c0304a9.getClass();
                            O.k kVar3 = O.k.f4370c;
                            O.D d20 = c0304a9.f4349j;
                            d20.M0(kVar3);
                            p020d2.n.M(d20, 0, c0206cA3);
                            int i119 = d20.f4347p;
                            int i120 = kVar3.f4339a;
                            int iF4 = O.D.F0(d20, i120);
                            int i121 = kVar3.f4340b;
                            if (i119 != iF4 || d20.f4348q != O.D.F0(d20, i121)) {
                                int i122 = 1;
                                StringBuilder sb10 = new StringBuilder();
                                int i123 = 0;
                                int i124 = 0;
                                while (i123 < i120) {
                                    if (((i122 << i123) & d20.f4347p) != 0) {
                                        if (i124 > 0) {
                                            sb10.append(", ");
                                        }
                                        sb10.append(kVar3.b(i123));
                                        i124++;
                                    }
                                    i123++;
                                    i122 = 1;
                                }
                                String string11 = sb10.toString();
                                StringBuilder sbN5 = AbstractC0013g0.n(string11, "StringBuilder().apply(builderAction).toString()");
                                int i125 = 0;
                                int i126 = 0;
                                while (i125 < i121) {
                                    int i127 = i121;
                                    if (((1 << i125) & d20.f4348q) != 0) {
                                        if (i124 > 0) {
                                            sbN5.append(", ");
                                        }
                                        sbN5.append(kVar3.c(i125));
                                        i126++;
                                    }
                                    i125++;
                                    i121 = i127;
                                }
                                String string12 = sbN5.toString();
                                E4.k.e("StringBuilder().apply(builderAction).toString()", string12);
                                StringBuilder sb11 = new StringBuilder("Error while pushing ");
                                sb11.append(kVar3);
                                sb11.append(". Not all arguments were provided. Missing ");
                                AbstractC0013g0.s(sb11, i124, " int arguments (", string11, ") and ");
                                AbstractC0013g0.u(sb11, i126, " object arguments (", string12, ").");
                                throw th;
                            }
                            c0305b.f4352c = true;
                        }
                    } else {
                        i33 = i33;
                    }
                } else {
                    i33 = i33;
                }
                C0304a c0304a10 = c0305b.f4351b;
                c0304a10.getClass();
                O.x xVar = O.x.f4387c;
                O.D d21 = c0304a10.f4349j;
                d21.M0(xVar);
                p020d2.n.L(d21, 0, i116);
                int i128 = d21.f4347p;
                int i129 = xVar.f4339a;
                int iF5 = O.D.F0(d21, i129);
                int i130 = xVar.f4340b;
                if (i128 != iF5 || d21.f4348q != O.D.F0(d21, i130)) {
                    StringBuilder sb12 = new StringBuilder();
                    int i131 = 0;
                    int i132 = 0;
                    while (i131 < i129) {
                        int i133 = i129;
                        if ((d21.f4347p & (1 << i131)) != 0) {
                            if (i132 > 0) {
                                sb12.append(", ");
                            }
                            sb12.append(xVar.b(i131));
                            i132++;
                        }
                        i131++;
                        i129 = i133;
                    }
                    String string13 = sb12.toString();
                    StringBuilder sbN6 = AbstractC0013g0.n(string13, "StringBuilder().apply(builderAction).toString()");
                    int i134 = 0;
                    int i135 = 0;
                    while (i134 < i130) {
                        int i136 = i130;
                        if (((1 << i134) & d21.f4348q) != 0) {
                            if (i132 > 0) {
                                sbN6.append(", ");
                            }
                            sbN6.append(xVar.c(i134));
                            i135++;
                        }
                        i134++;
                        i130 = i136;
                    }
                    String string14 = sbN6.toString();
                    E4.k.e("StringBuilder().apply(builderAction).toString()", string14);
                    StringBuilder sb13 = new StringBuilder("Error while pushing ");
                    sb13.append(xVar);
                    sb13.append(". Not all arguments were provided. Missing ");
                    AbstractC0013g0.s(sb13, i132, " int arguments (", string13, ") and ");
                    AbstractC0013g0.u(sb13, i135, " object arguments (", string14, ").");
                    throw th;
                }
            } else {
                i33 = i33;
                c0305b.getClass();
            }
            int i137 = c0305b.f4350a.f3738F.i;
            L l11 = c0305b.f4353d;
            int i138 = l11.f3626b;
            if ((i138 > 0 ? l11.f3625a[i138 - 1] : i3) > i137) {
                C0208d.w("Missed recording an endGroup");
                throw th;
            }
            if ((i138 > 0 ? l11.f3625a[i138 - 1] : i3) == i137) {
                c0305b.d(false);
                l11.a();
                C0304a c0304a11 = c0305b.f4351b;
                c0304a11.getClass();
                c0304a11.f4349j.L0(O.i.f4368c);
            }
            c0230o = this;
            int i139 = c0230o.f3738F.i;
            int i140 = i33;
            if (i140 != c0230o.h0(i139)) {
                c0230o.d0(i139, i140);
            }
            i33 = z5 ? 1 : i140;
            c0230o.f3738F.d();
            c0305b.c();
        }
        ArrayList arrayList6 = c0230o.f3752h.f3729h;
        C0223k0 c0223k2 = (C0223k0) arrayList6.remove(arrayList6.size() - 1);
        if (c0223k2 != null && !z7) {
            c0223k2.f3717c++;
        }
        c0230o.i = c0223k2;
        c0230o.f3753j = l6.a() + i33;
        c0230o.f3755l = l6.a();
        c0230o.f3754k = l6.a() + i33;
    }

    public final void q() {
        p(false);
        C0235q0 c0235q0Y = y();
        if (c0235q0Y != null) {
            int i = c0235q0Y.f3777a;
            if ((i & 1) != 0) {
                c0235q0Y.f3777a = i | 2;
            }
        }
    }

    public final void r() {
        p(true);
    }

    public final void s() {
        p(false);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:79:0x016c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final C0235q0 t() {
        C0235q0 c0235q0;
        Throwable th;
        C0235q0 c0235q1;
        C0206c c0206cA;
        Object j4;
        C0227m0 c0227m0 = this.f3736D;
        if (c0227m0.f3729h.isEmpty()) {
            c0235q0 = null;
        } else {
            ArrayList arrayList = c0227m0.f3729h;
            c0235q0 = (C0235q0) arrayList.remove(arrayList.size() - 1);
        }
        if (c0235q0 != null) {
            c0235q0.f3777a &= -9;
        }
        if (c0235q0 != null) {
            int i = this.f3733A;
            p080p.v vVar = c0235q0.f3782f;
            if (vVar == null || (c0235q0.f3777a & 16) != 0) {
                th = null;
                j4 = th;
                break;
            }
            Object[] objArr = vVar.f10789b;
            int[] iArr = vVar.f10790c;
            long[] jArr = vVar.f10788a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                loop0: while (true) {
                    long j6 = jArr[i3];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i3 - length)) >>> 31);
                        th = null;
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j6 & 255) < 128) {
                                int i8 = (i3 << 3) + i7;
                                Object obj = objArr[i8];
                                if (iArr[i8] != i) {
                                    j4 = new B.J0(i, 1, c0235q0, vVar);
                                    break loop0;
                                }
                            }
                            j6 >>= 8;
                        }
                        if (i6 == 8) {
                        }
                    } else {
                        th = null;
                    }
                    if (i3 != length) {
                        i3++;
                    }
                }
            } else {
                th = null;
            }
            j4 = th;
            break;
            if (j4 != null) {
                C0304a c0304a = this.f3740L.f4351b;
                c0304a.getClass();
                O.h hVar = O.h.f4367c;
                O.D d6 = c0304a.f4349j;
                d6.M0(hVar);
                p020d2.n.M(d6, 0, j4);
                p020d2.n.M(d6, 1, this.f3751g);
                int i9 = d6.f4347p;
                int i10 = hVar.f4339a;
                int iF0 = O.D.F0(d6, i10);
                int i11 = hVar.f4340b;
                if (i9 != iF0 || d6.f4348q != O.D.F0(d6, i11)) {
                    StringBuilder sb = new StringBuilder();
                    int i12 = 0;
                    for (int i13 = 0; i13 < i10; i13++) {
                        if (((1 << i13) & d6.f4347p) != 0) {
                            if (i12 > 0) {
                                sb.append(", ");
                            }
                            sb.append(hVar.b(i13));
                            i12++;
                        }
                    }
                    String string = sb.toString();
                    StringBuilder sbN = AbstractC0013g0.n(string, "StringBuilder().apply(builderAction).toString()");
                    int i14 = 0;
                    for (int i15 = 0; i15 < i11; i15++) {
                        if (((1 << i15) & d6.f4348q) != 0) {
                            if (i12 > 0) {
                                sbN.append(", ");
                            }
                            sbN.append(hVar.c(i15));
                            i14++;
                        }
                    }
                    String string2 = sbN.toString();
                    E4.k.e("StringBuilder().apply(builderAction).toString()", string2);
                    StringBuilder sb2 = new StringBuilder("Error while pushing ");
                    sb2.append(hVar);
                    sb2.append(". Not all arguments were provided. Missing ");
                    AbstractC0013g0.s(sb2, i12, " int arguments (", string, ") and ");
                    AbstractC0013g0.u(sb2, i14, " object arguments (", string2, ").");
                    throw th;
                }
            }
        } else {
            th = null;
        }
        if (c0235q0 != null) {
            int i16 = c0235q0.f3777a;
            if ((i16 & 16) == 0 && ((i16 & 1) != 0 || this.f3759p)) {
                if (c0235q0.f3779c == null) {
                    if (this.f3743O) {
                        G0 g6 = this.H;
                        c0206cA = g6.b(g6.f3609v);
                    } else {
                        D0 d1 = this.f3738F;
                        c0206cA = d1.a(d1.i);
                    }
                    c0235q0.f3779c = c0206cA;
                }
                c0235q0.f3777a &= -5;
                c0235q1 = c0235q0;
            } else {
                c0235q1 = th;
            }
        } else {
            c0235q1 = th;
        }
        p(false);
        return c0235q1;
    }

    public final void u() {
        p(false);
        this.f3746b.b();
        p(false);
        C0305b c0305b = this.f3740L;
        if (c0305b.f4352c) {
            c0305b.d(false);
            c0305b.d(false);
            C0304a c0304a = c0305b.f4351b;
            c0304a.getClass();
            c0304a.f4349j.L0(O.i.f4368c);
            c0305b.f4352c = false;
        }
        c0305b.b();
        if (!(c0305b.f4353d.f3626b == 0)) {
            C0208d.w("Missed recording an endGroup()");
            throw null;
        }
        if (!this.f3752h.f3729h.isEmpty()) {
            C0208d.w("Start/end imbalance");
            throw null;
        }
        i();
        this.f3738F.c();
        this.f3765v = this.f3766w.a() != 0;
    }

    public final void v(boolean z5, C0223k0 c0223k0) {
        this.f3752h.f3729h.add(this.i);
        this.i = c0223k0;
        int i = this.f3754k;
        L l6 = this.f3756m;
        l6.b(i);
        l6.b(this.f3755l);
        l6.b(this.f3753j);
        if (z5) {
            this.f3753j = 0;
        }
        this.f3754k = 0;
        this.f3755l = 0;
    }

    public final void w() {
        E0 e6 = new E0();
        if (this.f3734B) {
            e6.g();
        }
        if (this.f3746b.c()) {
            e6.f3586q = new p080p.q();
        }
        this.G = e6;
        G0 g0J = e6.j();
        g0J.e(true);
        this.H = g0J;
    }

    public final InterfaceC0225l0 x() {
        return m();
    }

    public final C0235q0 y() {
        if (this.f3769z != 0) {
            return null;
        }
        C0227m0 c0227m0 = this.f3736D;
        if (c0227m0.f3729h.isEmpty()) {
            return null;
        }
        ArrayList arrayList = c0227m0.f3729h;
        return (C0235q0) arrayList.get(arrayList.size() - 1);
    }

    public final boolean z() {
        if (!B() || this.f3765v) {
            return true;
        }
        C0235q0 c0235q0Y = y();
        return (c0235q0Y == null || (c0235q0Y.f3777a & 4) == 0) ? false : true;
    }
}
