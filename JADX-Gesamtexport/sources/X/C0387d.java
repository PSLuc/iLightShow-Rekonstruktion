package X;

import N.C0208d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0387d extends AbstractC0391h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f5670n = new int[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D4.c f5671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D4.c f5672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p080p.A f5674h;
    public ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m f5675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f5676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5677l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5678m;

    public C0387d(int i, m mVar, D4.c cVar, D4.c cVar2) {
        super(i, mVar);
        this.f5671e = cVar;
        this.f5672f = cVar2;
        this.f5675j = m.f5702l;
        this.f5676k = f5670n;
        this.f5677l = 1;
    }

    public void A(p080p.A a6) {
        this.f5674h = a6;
    }

    public C0387d B(D4.c cVar, D4.c cVar2) {
        C0388e c0388e;
        if (this.f5687c) {
            C0208d.S("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f5678m && this.f5688d < 0) {
            C0208d.T("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        z(d());
        Object obj = o.f5709b;
        synchronized (obj) {
            int i = o.f5711d;
            o.f5711d = i + 1;
            o.f5710c = o.f5710c.k(i);
            m mVarE = e();
            r(mVarE.k(i));
            c0388e = new C0388e(i, o.e(mVarE, d() + 1, i), o.l(cVar, f(), true), o.b(cVar2, i()), this);
        }
        if (this.f5678m || this.f5687c) {
            return c0388e;
        }
        int iD = d();
        synchronized (obj) {
            int i3 = o.f5711d;
            o.f5711d = i3 + 1;
            q(i3);
            o.f5710c = o.f5710c.k(d());
        }
        r(o.e(e(), iD + 1, d()));
        return c0388e;
    }

    @Override // X.AbstractC0391h
    public final void b() {
        o.f5710c = o.f5710c.g(d()).c(this.f5675j);
    }

    @Override // X.AbstractC0391h
    public void c() {
        if (this.f5687c) {
            return;
        }
        this.f5687c = true;
        synchronized (o.f5709b) {
            int i = this.f5688d;
            if (i >= 0) {
                o.u(i);
                this.f5688d = -1;
            }
        }
        l();
    }

    @Override // X.AbstractC0391h
    public boolean g() {
        return false;
    }

    @Override // X.AbstractC0391h
    public int h() {
        return this.f5673g;
    }

    @Override // X.AbstractC0391h
    public D4.c i() {
        return this.f5672f;
    }

    @Override // X.AbstractC0391h
    public void k() {
        this.f5677l++;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0096 A[LOOP:0: B:19:0x0032->B:42:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x009f A[EDGE_INSN: B:50:0x009f->B:45:0x009f BREAK  A[LOOP:0: B:19:0x0032->B:42:0x0096], SYNTHETIC] */
    @Override // X.AbstractC0391h
    public void l() {
        int i = this.f5677l;
        if (!(i > 0)) {
            C0208d.S("no pending nested snapshots");
            throw null;
        }
        int i3 = i - 1;
        this.f5677l = i3;
        if (i3 != 0 || this.f5678m) {
            return;
        }
        p080p.A aW = w();
        if (aW != null) {
            if (this.f5678m) {
                C0208d.T("Unsupported operation on a snapshot that has been applied");
                throw null;
            }
            A(null);
            int iD = d();
            Object[] objArr = aW.f10709b;
            long[] jArr = aW.f10708a;
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
                            if ((255 & j4) < 128) {
                                for (D dC = ((B) objArr[(i6 << 3) + i8]).c(); dC != null; dC = dC.f5651b) {
                                    int i9 = dC.f5650a;
                                    if (i9 != iD) {
                                        Iterable iterable = this.f5675j;
                                        Integer numValueOf = Integer.valueOf(i9);
                                        E4.k.f("<this>", iterable);
                                        if (iterable instanceof Collection ? ((Collection) iterable).contains(numValueOf) : p089q4.l.b0(iterable, numValueOf) >= 0) {
                                            dC.f5650a = 0;
                                        }
                                    } else {
                                        dC.f5650a = 0;
                                    }
                                }
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
        a();
    }

    @Override // X.AbstractC0391h
    public void m() {
        if (this.f5678m || this.f5687c) {
            return;
        }
        u();
    }

    @Override // X.AbstractC0391h
    public void n(B b6) {
        p080p.A aW = w();
        if (aW == null) {
            int i = p080p.D.f10715a;
            aW = new p080p.A();
            A(aW);
        }
        aW.a(b6);
    }

    @Override // X.AbstractC0391h
    public final void o() {
        int length = this.f5676k.length;
        for (int i = 0; i < length; i++) {
            o.u(this.f5676k[i]);
        }
        int i3 = this.f5688d;
        if (i3 >= 0) {
            o.u(i3);
            this.f5688d = -1;
        }
    }

    @Override // X.AbstractC0391h
    public void s(int i) {
        this.f5673g = i;
    }

    @Override // X.AbstractC0391h
    public AbstractC0391h t(D4.c cVar) {
        C0389f c0389f;
        if (this.f5687c) {
            C0208d.S("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f5678m && this.f5688d < 0) {
            C0208d.T("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        int iD = d();
        z(d());
        Object obj = o.f5709b;
        synchronized (obj) {
            int i = o.f5711d;
            o.f5711d = i + 1;
            o.f5710c = o.f5710c.k(i);
            c0389f = new C0389f(i, o.e(e(), iD + 1, i), o.l(cVar, f(), true), this);
        }
        if (this.f5678m || this.f5687c) {
            return c0389f;
        }
        int iD2 = d();
        synchronized (obj) {
            int i3 = o.f5711d;
            o.f5711d = i3 + 1;
            q(i3);
            o.f5710c = o.f5710c.k(d());
        }
        r(o.e(e(), iD2 + 1, d()));
        return c0389f;
    }

    public final void u() {
        z(d());
        if (this.f5678m || this.f5687c) {
            return;
        }
        int iD = d();
        synchronized (o.f5709b) {
            int i = o.f5711d;
            o.f5711d = i + 1;
            q(i);
            o.f5710c = o.f5710c.k(d());
        }
        r(o.e(e(), iD + 1, d()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015e A[EDGE_INSN: B:101:0x015e->B:77:0x015e BREAK  A[LOOP:4: B:66:0x012f->B:76:0x015b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x011c A[Catch: all -> 0x0112, LOOP:2: B:48:0x00ea->B:60:0x011c, LOOP_END, TryCatch #0 {all -> 0x0112, blocks: (B:43:0x00ce, B:45:0x00de, B:48:0x00ea, B:50:0x00f6, B:52:0x0100, B:54:0x0106, B:57:0x0114, B:63:0x0125, B:66:0x012f, B:68:0x0139, B:70:0x0143, B:72:0x0149, B:73:0x0153, B:76:0x015b, B:77:0x015e, B:79:0x0162, B:81:0x0169, B:82:0x0175, B:60:0x011c), top: B:90:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:61:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x015b A[Catch: all -> 0x0112, LOOP:4: B:66:0x012f->B:76:0x015b, LOOP_END, TryCatch #0 {all -> 0x0112, blocks: (B:43:0x00ce, B:45:0x00de, B:48:0x00ea, B:50:0x00f6, B:52:0x0100, B:54:0x0106, B:57:0x0114, B:63:0x0125, B:66:0x012f, B:68:0x0139, B:70:0x0143, B:72:0x0149, B:73:0x0153, B:76:0x015b, B:77:0x015e, B:79:0x0162, B:81:0x0169, B:82:0x0175, B:60:0x011c), top: B:90:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0123 A[EDGE_INSN: B:96:0x0123->B:62:0x0123 BREAK  A[LOOP:2: B:48:0x00ea->B:60:0x011c], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public t v() {
        HashMap mapC;
        p080p.A a6;
        ?? r6;
        long j4;
        long j6;
        p080p.A aW = w();
        if (aW != null) {
            AtomicReference atomicReference = o.i;
            mapC = o.c((C0387d) atomicReference.get(), this, o.f5710c.g(((C0386c) atomicReference.get()).f5686b));
        } else {
            mapC = null;
        }
        p089q4.u uVar = p089q4.u.f11237h;
        synchronized (o.f5709b) {
            try {
                o.d(this);
                if (aW == null || aW.f10711d == 0) {
                    b();
                    C0386c c0386c = (C0386c) o.i.get();
                    o.v(c0386c, n.f5706j);
                    a6 = c0386c.f5674h;
                    if (a6 == null || !a6.h()) {
                        a6 = null;
                        r6 = uVar;
                    } else {
                        r6 = o.f5714g;
                    }
                } else {
                    C0386c c0386c2 = (C0386c) o.i.get();
                    t tVarY = y(o.f5711d, mapC, o.f5710c.g(c0386c2.f5686b));
                    if (!tVarY.equals(j.f5690c)) {
                        return tVarY;
                    }
                    b();
                    o.v(c0386c2, n.f5706j);
                    a6 = c0386c2.f5674h;
                    A(null);
                    c0386c2.f5674h = null;
                    r6 = o.f5714g;
                }
                this.f5678m = true;
                if (a6 != null) {
                    P.f fVar = new P.f(a6);
                    if (!a6.g()) {
                        int size = r6.size();
                        for (int i = 0; i < size; i++) {
                            ((D4.e) r6.get(i)).d(fVar, this);
                        }
                    }
                }
                if (aW != null && aW.h()) {
                    P.f fVar2 = new P.f(aW);
                    int size2 = r6.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((D4.e) r6.get(i3)).d(fVar2, this);
                    }
                }
                synchronized (o.f5709b) {
                    try {
                        o();
                        o.g();
                        if (a6 != null) {
                            Object[] objArr = a6.f10709b;
                            long[] jArr = a6.f10708a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                j4 = 128;
                                while (true) {
                                    long j7 = jArr[i6];
                                    j6 = 255;
                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j7 & 255) < 128) {
                                                o.q((B) objArr[(i6 << 3) + i8]);
                                            }
                                            j7 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            } else {
                                j4 = 128;
                                j6 = 255;
                            }
                        } else {
                            j4 = 128;
                            j6 = 255;
                        }
                        if (aW != null) {
                            Object[] objArr2 = aW.f10709b;
                            long[] jArr2 = aW.f10708a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i9 = 0;
                                while (true) {
                                    long j8 = jArr2[i9];
                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i9 != length2) {
                                            break;
                                            break;
                                        }
                                        i9++;
                                    } else {
                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                        for (int i11 = 0; i11 < i10; i11++) {
                                            if ((j8 & j6) < j4) {
                                                o.q((B) objArr2[(i9 << 3) + i11]);
                                            }
                                            j8 >>= 8;
                                        }
                                        if (i10 != 8) {
                                            break;
                                        }
                                        if (i9 != length2) {
                                            break;
                                        }
                                        i9++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i12 = 0; i12 < size3; i12++) {
                                o.q((B) arrayList.get(i12));
                            }
                        }
                        this.i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return j.f5690c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public p080p.A w() {
        return this.f5674h;
    }

    @Override // X.AbstractC0391h
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public D4.c f() {
        return this.f5671e;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x0152  */
    /* JADX WARN: Code duplicated, block: B:73:0x017b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0182 A[LOOP:3: B:74:0x0180->B:75:0x0182, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0193  */
    /* JADX WARN: Code duplicated, block: B:83:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final t y(int i, HashMap map, m mVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayListJ0;
        ArrayList arrayList3;
        int size;
        int i3;
        ArrayList arrayList4;
        int size2;
        int i6;
        B b6;
        D d6;
        m mVar2;
        Object[] objArr;
        long[] jArr;
        m mVar3;
        Object[] objArr2;
        long[] jArr2;
        int i7;
        int i8;
        D dS;
        D dG;
        m mVarJ = e().k(d()).j(this.f5675j);
        p080p.A aW = w();
        E4.k.c(aW);
        Object[] objArr3 = aW.f10709b;
        long[] jArr3 = aW.f10708a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i9 = 0;
            arrayList3 = null;
            arrayListJ0 = null;
            while (true) {
                long j4 = jArr3[i9];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8;
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j4 & 255) < 128) {
                            B b7 = (B) objArr3[(i9 << 3) + i12];
                            i8 = i10;
                            D dC = b7.c();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i7 = i12;
                            D dS2 = o.s(dC, i, mVar);
                            if (dS2 == null || (dS = o.s(dC, d(), mVarJ)) == null) {
                                mVar3 = mVarJ;
                            } else {
                                mVar3 = mVarJ;
                                if (dS.f5650a != 1 && !dS2.equals(dS)) {
                                    D dS3 = o.s(dC, d(), e());
                                    if (dS3 == null) {
                                        o.r();
                                        throw null;
                                    }
                                    if (map == null || (dG = (D) map.get(dS2)) == null) {
                                        dG = b7.g(dS, dS2, dS3);
                                    }
                                    if (dG == null) {
                                        return new i(this);
                                    }
                                    if (!dG.equals(dS3)) {
                                        if (dG.equals(dS2)) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(new p084p4.h(b7, dS2.b()));
                                            if (arrayListJ0 == null) {
                                                arrayListJ0 = new ArrayList();
                                            }
                                            arrayListJ0.add(b7);
                                        } else {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(!dG.equals(dS) ? new p084p4.h(b7, dG) : new p084p4.h(b7, dS.b()));
                                        }
                                    }
                                }
                            }
                        } else {
                            mVar3 = mVarJ;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i7 = i12;
                            i8 = i10;
                        }
                        j4 >>= i8;
                        i12 = i7 + 1;
                        i10 = i8;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        mVarJ = mVar3;
                    }
                    mVar2 = mVarJ;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i11 != i10) {
                        break;
                    }
                } else {
                    mVar2 = mVarJ;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i9 != length) {
                    i9++;
                    objArr3 = objArr;
                    jArr3 = jArr;
                    mVarJ = mVar2;
                } else {
                    arrayList2 = arrayList3;
                    arrayList = arrayListJ0;
                }
            }
            if (arrayList3 != null) {
                u();
                size2 = arrayList3.size();
                for (i6 = 0; i6 < size2; i6++) {
                    p084p4.h hVar = (p084p4.h) arrayList3.get(i6);
                    b6 = (B) hVar.f10849h;
                    d6 = (D) hVar.i;
                    d6.f5650a = d();
                    synchronized (o.f5709b) {
                        d6.f5651b = b6.c();
                        b6.i(d6);
                    }
                }
            }
            if (arrayListJ0 != null) {
                size = arrayListJ0.size();
                for (i3 = 0; i3 < size; i3++) {
                    aW.j((B) arrayListJ0.get(i3));
                }
                arrayList4 = this.i;
                if (arrayList4 != null) {
                    arrayListJ0 = p089q4.l.j0(arrayList4, arrayListJ0);
                }
                this.i = arrayListJ0;
            }
            return j.f5690c;
        }
        arrayList = null;
        arrayList2 = null;
        arrayList3 = arrayList2;
        arrayListJ0 = arrayList;
        if (arrayList3 != null) {
            u();
            size2 = arrayList3.size();
            while (i6 < size2) {
                p084p4.h hVar2 = (p084p4.h) arrayList3.get(i6);
                b6 = (B) hVar2.f10849h;
                d6 = (D) hVar2.i;
                d6.f5650a = d();
                synchronized (o.f5709b) {
                    d6.f5651b = b6.c();
                    b6.i(d6);
                }
            }
        }
        if (arrayListJ0 != null) {
            size = arrayListJ0.size();
            while (i3 < size) {
                aW.j((B) arrayListJ0.get(i3));
            }
            arrayList4 = this.i;
            if (arrayList4 != null) {
                arrayListJ0 = p089q4.l.j0(arrayList4, arrayListJ0);
            }
            this.i = arrayListJ0;
        }
        return j.f5690c;
    }

    public final void z(int i) {
        synchronized (o.f5709b) {
            this.f5675j = this.f5675j.k(i);
        }
    }
}
