package L;

import B.C0005c0;
import B.C0031p0;
import N.C0209d0;
import N.C0217h0;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: L.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0156l1 extends p122w4.h implements D4.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f2824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p117w.b f2825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public E4.t f2826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public E4.s f2827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2828n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ A0 f2830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0031p0 f2831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0335w f2832r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0156l1(A0 a6, C0031p0 c0031p0, InterfaceC0335w interfaceC0335w, p111u4.d dVar) {
        super(2, dVar);
        this.f2830p = a6;
        this.f2831q = c0031p0;
        this.f2832r = interfaceC0335w;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0156l1 c0156l1 = new C0156l1(this.f2830p, this.f2831q, this.f2832r, dVar);
        c0156l1.f2829o = obj;
        return c0156l1;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0156l1) b((p091r0.y) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:37:0x0101  */
    /* JADX WARN: Code duplicated, block: B:38:0x0109  */
    /* JADX WARN: Code duplicated, block: B:55:0x0169  */
    /* JADX WARN: Code duplicated, block: B:56:0x0170  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ab A[Catch: CancellationException -> 0x01b1, TryCatch #0 {CancellationException -> 0x01b1, blocks: (B:62:0x01a3, B:64:0x01ab, B:66:0x01b3), top: B:75:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b3 A[Catch: CancellationException -> 0x01b1, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x01b1, blocks: (B:62:0x01a3, B:64:0x01ab, B:66:0x01b3), top: B:75:0x01a3 }] */
    @Override // p122w4.a
    public final Object o(Object obj) {
        p091r0.y yVar;
        Object objB;
        p091r0.q qVar;
        Object objJ;
        E4.t tVar;
        p117w.b bVar;
        p091r0.y yVar2;
        E4.s sVar;
        p084p4.h hVar;
        boolean z5;
        float fH;
        E4.s sVar2;
        Object objD;
        p130y0.G0 g0D;
        int i;
        float fD;
        p117w.b bVar2;
        p117w.d aVar;
        v4.a aVar2 = v4.a.f13292h;
        int i3 = this.f2828n;
        C0031p0 c0031p0 = this.f2831q;
        A0 a6 = this.f2830p;
        InterfaceC0335w interfaceC0335w = this.f2832r;
        A0 a7 = (A0) c0031p0.i;
        C0209d0 c0209d0 = a6.f2153k;
        C0217h0 c0217h0 = a6.f2155m;
        if (i3 == 0) {
            S1.V.O(obj);
            yVar = (p091r0.y) this.f2829o;
            this.f2829o = yVar;
            this.f2828n = 1;
            objB = p112v.Y0.b(yVar, (3 & 1) != 0, p091r0.j.i, this);
            if (objB != aVar2) {
            }
            return aVar2;
        }
        if (i3 == 1) {
            yVar = (p091r0.y) this.f2829o;
            S1.V.O(obj);
            objB = obj;
        } else {
            if (i3 == 2) {
                sVar = this.f2827m;
                tVar = this.f2826l;
                bVar = this.f2825k;
                qVar = (p091r0.q) this.f2824j;
                yVar2 = (p091r0.y) this.f2829o;
                S1.V.O(obj);
                objJ = obj;
                c0209d0 = c0209d0;
                hVar = (p084p4.h) objJ;
                if (hVar != null) {
                    g0D = yVar2.d();
                    i = qVar.i;
                    float f6 = Q.f2459a;
                    if (i == 2) {
                        fD = g0D.d() * Q.f2459a;
                    } else {
                        fD = g0D.d();
                    }
                    if (Math.abs(a6.f2154l.h() - tVar.f1071h) < fD && Math.abs(c0209d0.h() - tVar.f1071h) < fD) {
                        float fFloatValue = ((Number) hVar.i).floatValue();
                        sVar.f1070h = ((Boolean) c0217h0.getValue()).booleanValue() ? fFloatValue < 0.0f : fFloatValue >= 0.0f;
                        tVar.f1071h = p030f0.c.d(p091r0.o.g((p091r0.q) hVar.f10849h, false)) + tVar.f1071h;
                    }
                }
                z5 = sVar.f1070h;
                float f7 = tVar.f1071h;
                if (z5) {
                    fH = a7.f2153k.h();
                } else {
                    fH = a7.f2154l.h();
                }
                a7.e(f7 - fH, z5);
                AbstractC0336x.o(interfaceC0335w, null, new C0196z0(c0031p0, z5, bVar, null), 3);
                try {
                    long j4 = qVar.f11508a;
                    C0005c0 c0005c0 = new C0005c0(a6, 16, sVar);
                    this.f2829o = bVar;
                    this.f2824j = sVar;
                    this.f2825k = null;
                    this.f2826l = null;
                    this.f2827m = null;
                    this.f2828n = 3;
                    objD = p112v.D.d(yVar2, j4, c0005c0, this);
                    if (objD != aVar2) {
                        sVar2 = sVar;
                    }
                    return aVar2;
                } catch (CancellationException unused) {
                    sVar2 = sVar;
                    bVar2 = bVar;
                    aVar = new p117w.a(bVar2);
                    a6.f2156n.invoke(Boolean.valueOf(sVar2.f1070h));
                    AbstractC0336x.o(interfaceC0335w, null, new C0153k1(c0031p0, sVar2, aVar, null), 3);
                    return p084p4.x.f10867a;
                }
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar2 = (E4.s) this.f2824j;
            bVar2 = (p117w.b) this.f2829o;
            try {
                S1.V.O(obj);
                bVar = bVar2;
                objD = obj;
            } catch (CancellationException unused2) {
                aVar = new p117w.a(bVar2);
            }
        }
        try {
            if (((Boolean) objD).booleanValue()) {
                aVar = new p117w.c(bVar);
            } else {
                aVar = new p117w.a(bVar);
            }
        } catch (CancellationException unused3) {
            bVar2 = bVar;
            aVar = new p117w.a(bVar2);
        }
        a6.f2156n.invoke(Boolean.valueOf(sVar2.f1070h));
        AbstractC0336x.o(interfaceC0335w, null, new C0153k1(c0031p0, sVar2, aVar, null), 3);
        return p084p4.x.f10867a;
        qVar = (p091r0.q) objB;
        p117w.b bVar3 = new p117w.b();
        E4.t tVar2 = new E4.t();
        float fH2 = ((Boolean) c0217h0.getValue()).booleanValue() ? a6.f2152j.h() - p030f0.c.d(qVar.f11510c) : p030f0.c.d(qVar.f11510c);
        tVar2.f1071h = fH2;
        int iCompare = Float.compare(Math.abs(a7.f2153k.h() - fH2), Math.abs(a7.f2154l.h() - fH2));
        E4.s sVar3 = new E4.s();
        sVar3.f1070h = iCompare == 0 ? c0209d0.h() > tVar2.f1071h : iCompare < 0;
        long j6 = qVar.f11508a;
        this.f2829o = yVar;
        this.f2824j = qVar;
        this.f2825k = bVar3;
        this.f2826l = tVar2;
        this.f2827m = sVar3;
        this.f2828n = 2;
        objJ = AbstractC0176s1.j(yVar, j6, qVar.i, this);
        if (objJ != aVar2) {
            tVar = tVar2;
            bVar = bVar3;
            yVar2 = yVar;
            sVar = sVar3;
            hVar = (p084p4.h) objJ;
            if (hVar != null) {
                g0D = yVar2.d();
                i = qVar.i;
                float f8 = Q.f2459a;
                if (i == 2) {
                    fD = g0D.d() * Q.f2459a;
                } else {
                    fD = g0D.d();
                }
                if (Math.abs(a6.f2154l.h() - tVar.f1071h) < fD) {
                    float fFloatValue2 = ((Number) hVar.i).floatValue();
                    sVar.f1070h = ((Boolean) c0217h0.getValue()).booleanValue() ? fFloatValue2 < 0.0f : fFloatValue2 >= 0.0f;
                    tVar.f1071h = p030f0.c.d(p091r0.o.g((p091r0.q) hVar.f10849h, false)) + tVar.f1071h;
                }
            }
            z5 = sVar.f1070h;
            float f9 = tVar.f1071h;
            if (z5) {
                fH = a7.f2153k.h();
            } else {
                fH = a7.f2154l.h();
            }
            a7.e(f9 - fH, z5);
            AbstractC0336x.o(interfaceC0335w, null, new C0196z0(c0031p0, z5, bVar, null), 3);
            long j7 = qVar.f11508a;
            C0005c0 c0005c1 = new C0005c0(a6, 16, sVar);
            this.f2829o = bVar;
            this.f2824j = sVar;
            this.f2825k = null;
            this.f2826l = null;
            this.f2827m = null;
            this.f2828n = 3;
            objD = p112v.D.d(yVar2, j7, c0005c1, this);
            if (objD != aVar2) {
                sVar2 = sVar;
                if (((Boolean) objD).booleanValue()) {
                    aVar = new p117w.c(bVar);
                } else {
                    aVar = new p117w.a(bVar);
                }
                a6.f2156n.invoke(Boolean.valueOf(sVar2.f1070h));
                AbstractC0336x.o(interfaceC0335w, null, new C0153k1(c0031p0, sVar2, aVar, null), 3);
                return p084p4.x.f10867a;
            }
        }
        return aVar2;
    }
}
