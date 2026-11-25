package p091r0;

import D4.e;
import P.d;
import P4.AbstractC0336x;
import P4.C0319f;
import P4.i0;
import S0.b;
import Z.n;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import java.util.ArrayList;
import p015c2.AbstractC0473d;
import p084p4.x;
import p090r.v;
import p111u4.k;
import p124x0.AbstractC1098f;
import p124x0.k0;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class A extends n implements b, k0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public i f11461C;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f11463u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f11464v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object[] f11465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e f11466x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i0 f11467y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i f11468z = u.f11534a;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final d f11459A = new d(new y[16]);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final d f11460B = new d(new y[16]);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f11462D = 0;

    public A(Object obj, Object obj2, Object[] objArr, e eVar) {
        this.f11463u = obj;
        this.f11464v = obj2;
        this.f11465w = objArr;
        this.f11466x = eVar;
    }

    public final void A0() {
        i0 i0Var = this.f11467y;
        if (i0Var != null) {
            i0Var.u(new PointerInputResetException());
            this.f11467y = null;
        }
    }

    @Override // p124x0.k0
    public final void U() {
        A0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // p124x0.k0
    public final void X() {
        i iVar = this.f11461C;
        if (iVar == null) {
            return;
        }
        ?? r6 = iVar.f11494a;
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            if (((q) r6.get(i)).f11511d) {
                ArrayList arrayList = new ArrayList(r6.size());
                int size2 = r6.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    q qVar = (q) r6.get(i3);
                    long j4 = qVar.f11508a;
                    boolean z5 = qVar.f11511d;
                    long j6 = qVar.f11509b;
                    long j7 = qVar.f11510c;
                    arrayList.add(new q(j4, j6, j7, false, qVar.f11512e, j6, j7, z5, z5, 1, 0L));
                }
                i iVar2 = new i(arrayList, null);
                this.f11468z = iVar2;
                z0(iVar2, j.f11497h);
                z0(iVar2, j.i);
                z0(iVar2, j.f11498j);
                this.f11461C = null;
                return;
            }
        }
    }

    @Override // S0.b
    public final float a() {
        return AbstractC1098f.s(this).f13850x.a();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    @Override // p124x0.k0
    public final void f0(i iVar, j jVar, long j4) {
        this.f11462D = j4;
        if (jVar == j.f11497h) {
            this.f11468z = iVar;
        }
        if (this.f11467y == null) {
            this.f11467y = AbstractC0336x.o(n0(), null, new z(this, null), 1);
        }
        z0(iVar, jVar);
        ?? r6 = iVar.f11494a;
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            if (!o.c((q) r6.get(i))) {
                this.f11461C = iVar;
            }
        }
        iVar = null;
        this.f11461C = iVar;
    }

    @Override // p124x0.k0
    public final void k() {
        A0();
    }

    @Override // S0.b
    public final float n() {
        return AbstractC1098f.s(this).f13850x.n();
    }

    @Override // Z.n
    public final void s0() {
        A0();
    }

    public final Object y0(e eVar, p111u4.d dVar) {
        C0319f c0319f = new C0319f(1, AbstractC0473d.F(dVar));
        c0319f.u();
        y yVar = new y(this, c0319f);
        synchronized (this.f11459A) {
            this.f11459A.c(yVar);
            new k(AbstractC0473d.F(AbstractC0473d.o(eVar, yVar, yVar)), a.f13292h).g(x.f10867a);
        }
        c0319f.w(new v(1, yVar));
        return c0319f.t();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x003c A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:6:0x000d, B:13:0x001b, B:15:0x0021, B:16:0x0024, B:18:0x002c, B:20:0x0030, B:21:0x0035, B:26:0x003c, B:28:0x0042, B:29:0x0045, B:31:0x004d, B:33:0x0051), top: B:45:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0042 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:6:0x000d, B:13:0x001b, B:15:0x0021, B:16:0x0024, B:18:0x002c, B:20:0x0030, B:21:0x0035, B:26:0x003c, B:28:0x0042, B:29:0x0045, B:31:0x004d, B:33:0x0051), top: B:45:0x000d }] */
    public final void z0(i iVar, j jVar) {
        d dVar;
        int i;
        Object[] objArr;
        int i3;
        y yVar;
        C0319f c0319f;
        C0319f c0319f2;
        synchronized (this.f11459A) {
            d dVar2 = this.f11460B;
            dVar2.d(dVar2.f4583j, this.f11459A);
        }
        try {
            int iOrdinal = jVar.ordinal();
            if (iOrdinal == 0) {
                dVar = this.f11460B;
                i = dVar.f4583j;
                if (i > 0) {
                    objArr = dVar.f4582h;
                    i3 = 0;
                    do {
                        yVar = (y) objArr[i3];
                        if (jVar == yVar.f11547k && (c0319f = yVar.f11546j) != null) {
                            yVar.f11546j = null;
                            c0319f.g(iVar);
                        }
                        i3++;
                    } while (i3 < i);
                }
            } else if (iOrdinal == 1) {
                d dVar3 = this.f11460B;
                int i6 = dVar3.f4583j;
                if (i6 > 0) {
                    int i7 = i6 - 1;
                    Object[] objArr2 = dVar3.f4582h;
                    do {
                        y yVar2 = (y) objArr2[i7];
                        if (jVar == yVar2.f11547k && (c0319f2 = yVar2.f11546j) != null) {
                            yVar2.f11546j = null;
                            c0319f2.g(iVar);
                        }
                        i7--;
                    } while (i7 >= 0);
                }
            } else if (iOrdinal == 2) {
                dVar = this.f11460B;
                i = dVar.f4583j;
                if (i > 0) {
                    objArr = dVar.f4582h;
                    i3 = 0;
                    do {
                        yVar = (y) objArr[i3];
                        if (jVar == yVar.f11547k) {
                            yVar.f11546j = null;
                            c0319f.g(iVar);
                        }
                        i3++;
                    } while (i3 < i);
                }
            }
        } finally {
            this.f11460B.i();
        }
    }
}
