package p058l0;

import E4.l;
import N.C0208d;
import N.C0217h0;
import N.U;
import S0.k;
import android.graphics.Bitmap;
import p015c2.AbstractC0473d;
import p030f0.f;
import p035g0.C0701b;
import p035g0.C0704e;
import p035g0.C0709j;
import p035g0.C0710k;
import p035g0.H;
import p035g0.InterfaceC0714o;
import p035g0.r;
import p044i0.a;
import p044i0.b;
import p044i0.d;

/* JADX INFO: loaded from: classes.dex */
public final class E extends C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0820c f10197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0818a f10200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f10201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0217h0 f10202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0709j f10203h;
    public final C0217h0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f10204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f10205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f10206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final D f10207m;

    public E(C0820c c0820c) {
        this.f10197b = c0820c;
        c0820c.i = new D(this, 0);
        this.f10198c = "";
        this.f10199d = true;
        this.f10200e = new C0818a();
        this.f10201f = C0824g.f10292j;
        U u6 = U.f3673m;
        this.f10202g = C0208d.K(null, u6);
        this.i = C0208d.K(new f(0L), u6);
        this.f10204j = 9205357640488583168L;
        this.f10205k = 1.0f;
        this.f10206l = 1.0f;
        this.f10207m = new D(this, 1);
    }

    @Override // p058l0.C
    public final void a(d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
    public final void e(d dVar, float f6, C0709j c0709j) {
        int i;
        C0709j c0709j2;
        C0704e c0704eF;
        Throwable th;
        char c6;
        long j4;
        d dVar2;
        C0709j c0709j3;
        int i3;
        int i6;
        C0820c c0820c = this.f10197b;
        boolean z5 = c0820c.f10247d;
        C0217h0 c0217h0 = this.f10202g;
        if (!z5 || c0820c.f10248e == 16) {
            i = 0;
        } else {
            C0709j c0709j4 = (C0709j) c0217h0.getValue();
            int i7 = G.f10217a;
            if (c0709j4 == null ? c0709j4 != null : !((i6 = c0709j4.f9070c) == 5 || i6 == 3)) {
                i = 0;
            } else if (c0709j == null ? c0709j != null : !((i3 = c0709j.f9070c) == 5 || i3 == 3)) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z6 = this.f10199d;
        C0818a c0818a = this.f10200e;
        if (z6 || !f.a(this.f10204j, dVar.f())) {
            if (i == 1) {
                long j6 = c0820c.f10248e;
                c0709j2 = new C0709j(j6, 5, C0710k.f9071a.a(j6, 5));
            } else {
                c0709j2 = null;
            }
            this.f10203h = c0709j2;
            float fD = f.d(dVar.f());
            C0217h0 c0217h1 = this.i;
            this.f10205k = fD / f.d(((f) c0217h1.getValue()).f8851a);
            this.f10206l = f.b(dVar.f()) / f.b(((f) c0217h1.getValue()).f8851a);
            long jB = AbstractC0473d.b((int) Math.ceil(f.d(dVar.f())), (int) Math.ceil(f.b(dVar.f())));
            k layoutDirection = dVar.getLayoutDirection();
            c0704eF = c0818a.f10238a;
            C0701b c0701bA = c0818a.f10239b;
            if (c0704eF != null || c0701bA == null) {
                th = null;
                c6 = ' ';
                j4 = 4294967295L;
            } else {
                th = null;
                c6 = ' ';
                int i8 = (int) (jB >> 32);
                Bitmap bitmap = c0704eF.f9060a;
                j4 = 4294967295L;
                if (i8 > bitmap.getWidth() || ((int) (jB & 4294967295L)) > bitmap.getHeight() || c0818a.f10241d != i) {
                }
                c0818a.f10240c = jB;
                long jU = AbstractC0473d.U(jB);
                b bVar = c0818a.f10242e;
                a aVar = bVar.f9385h;
                S0.b bVar2 = aVar.f9381a;
                k kVar = aVar.f9382b;
                InterfaceC0714o interfaceC0714o = aVar.f9383c;
                long j7 = aVar.f9384d;
                dVar2 = dVar;
                aVar.f9381a = dVar2;
                aVar.f9382b = layoutDirection;
                aVar.f9383c = c0701bA;
                aVar.f9384d = jU;
                c0701bA.l();
                d.k0(bVar, r.f9076b, 0L, 62);
                this.f10207m.invoke(bVar);
                c0701bA.i();
                a aVar2 = bVar.f9385h;
                aVar2.f9381a = bVar2;
                aVar2.f9382b = kVar;
                aVar2.f9383c = interfaceC0714o;
                aVar2.f9384d = j7;
                c0704eF.f9060a.prepareToDraw();
                this.f10199d = false;
                this.f10204j = dVar2.f();
            }
            c0704eF = H.f((int) (jB >> c6), (int) (jB & j4), i);
            c0701bA = H.a(c0704eF);
            c0818a.f10238a = c0704eF;
            c0818a.f10239b = c0701bA;
            c0818a.f10241d = i;
            c0818a.f10240c = jB;
            long jU2 = AbstractC0473d.U(jB);
            b bVar3 = c0818a.f10242e;
            a aVar3 = bVar3.f9385h;
            S0.b bVar4 = aVar3.f9381a;
            k kVar2 = aVar3.f9382b;
            InterfaceC0714o interfaceC0714o2 = aVar3.f9383c;
            long j8 = aVar3.f9384d;
            dVar2 = dVar;
            aVar3.f9381a = dVar2;
            aVar3.f9382b = layoutDirection;
            aVar3.f9383c = c0701bA;
            aVar3.f9384d = jU2;
            c0701bA.l();
            d.k0(bVar3, r.f9076b, 0L, 62);
            this.f10207m.invoke(bVar3);
            c0701bA.i();
            a aVar4 = bVar3.f9385h;
            aVar4.f9381a = bVar4;
            aVar4.f9382b = kVar2;
            aVar4.f9383c = interfaceC0714o2;
            aVar4.f9384d = j8;
            c0704eF.f9060a.prepareToDraw();
            this.f10199d = false;
            this.f10204j = dVar2.f();
        } else {
            C0704e c0704e = c0818a.f10238a;
            if (i == (c0704e != null ? c0704e.a() : 0)) {
                dVar2 = dVar;
                th = null;
            } else {
                if (i == 1) {
                    long j9 = c0820c.f10248e;
                    c0709j2 = new C0709j(j9, 5, C0710k.f9071a.a(j9, 5));
                } else {
                    c0709j2 = null;
                }
                this.f10203h = c0709j2;
                float fD2 = f.d(dVar.f());
                C0217h0 c0217h2 = this.i;
                this.f10205k = fD2 / f.d(((f) c0217h2.getValue()).f8851a);
                this.f10206l = f.b(dVar.f()) / f.b(((f) c0217h2.getValue()).f8851a);
                long jB2 = AbstractC0473d.b((int) Math.ceil(f.d(dVar.f())), (int) Math.ceil(f.b(dVar.f())));
                k layoutDirection2 = dVar.getLayoutDirection();
                c0704eF = c0818a.f10238a;
                C0701b c0701bA2 = c0818a.f10239b;
                if (c0704eF != null) {
                    th = null;
                    c6 = ' ';
                    j4 = 4294967295L;
                    c0704eF = H.f((int) (jB2 >> c6), (int) (jB2 & j4), i);
                    c0701bA2 = H.a(c0704eF);
                    c0818a.f10238a = c0704eF;
                    c0818a.f10239b = c0701bA2;
                    c0818a.f10241d = i;
                } else {
                    th = null;
                    c6 = ' ';
                    j4 = 4294967295L;
                    c0704eF = H.f((int) (jB2 >> c6), (int) (jB2 & j4), i);
                    c0701bA2 = H.a(c0704eF);
                    c0818a.f10238a = c0704eF;
                    c0818a.f10239b = c0701bA2;
                    c0818a.f10241d = i;
                }
                c0818a.f10240c = jB2;
                long jU3 = AbstractC0473d.U(jB2);
                b bVar5 = c0818a.f10242e;
                a aVar5 = bVar5.f9385h;
                S0.b bVar6 = aVar5.f9381a;
                k kVar3 = aVar5.f9382b;
                InterfaceC0714o interfaceC0714o3 = aVar5.f9383c;
                long j10 = aVar5.f9384d;
                dVar2 = dVar;
                aVar5.f9381a = dVar2;
                aVar5.f9382b = layoutDirection2;
                aVar5.f9383c = c0701bA2;
                aVar5.f9384d = jU3;
                c0701bA2.l();
                d.k0(bVar5, r.f9076b, 0L, 62);
                this.f10207m.invoke(bVar5);
                c0701bA2.i();
                a aVar6 = bVar5.f9385h;
                aVar6.f9381a = bVar6;
                aVar6.f9382b = kVar3;
                aVar6.f9383c = interfaceC0714o3;
                aVar6.f9384d = j10;
                c0704eF.f9060a.prepareToDraw();
                this.f10199d = false;
                this.f10204j = dVar2.f();
            }
        }
        if (c0709j != null) {
            c0709j3 = c0709j;
        } else {
            c0709j3 = ((C0709j) c0217h0.getValue()) != null ? (C0709j) c0217h0.getValue() : this.f10203h;
        }
        C0704e c0704e2 = c0818a.f10238a;
        if (c0704e2 != null) {
            d.I(dVar2, c0704e2, c0818a.f10240c, 0L, f6, c0709j3, 0, 858);
        } else {
            p027e3.a.y0("drawCachedImage must be invoked first before attempting to draw the result into another destination");
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f10198c);
        sb.append("\n\tviewportWidth: ");
        C0217h0 c0217h0 = this.i;
        sb.append(f.d(((f) c0217h0.getValue()).f8851a));
        sb.append("\n\tviewportHeight: ");
        sb.append(f.b(((f) c0217h0.getValue()).f8851a));
        sb.append("\n");
        String string = sb.toString();
        E4.k.e("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }
}
