package p112v;

import B.D;
import D4.e;
import E4.t;
import P4.InterfaceC0335w;
import S1.V;
import c5.C0495p;
import java.util.concurrent.CancellationException;
import p035g0.C0715p;
import p084p4.x;
import p096s.AbstractC0909d;
import p096s.C0919l;
import p096s.C0920m;
import p096s.C0928v;
import p096s.w0;
import p096s.x0;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: v.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0989l extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t f13016l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0919l f13017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13018n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f13019o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0495p f13020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1007u0 f13021q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0989l(float f6, C0495p c0495p, C1007u0 c1007u0, d dVar) {
        super(2, dVar);
        this.f13019o = f6;
        this.f13020p = c0495p;
        this.f13021q = c1007u0;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new C0989l(this.f13019o, this.f13020p, this.f13021q, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0989l) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        float f6;
        C0919l c0919l;
        t tVar;
        Object obj2 = a.f13292h;
        int i = this.f13018n;
        if (i == 0) {
            V.O(obj);
            f6 = this.f13019o;
            if (Math.abs(f6) > 1.0f) {
                t tVar2 = new t();
                tVar2.f1071h = f6;
                t tVar3 = new t();
                w0 w0Var = x0.f12138a;
                c0919l = new C0919l(w0Var, Float.valueOf(0.0f), new C0920m(f6), Long.MIN_VALUE, Long.MIN_VALUE, false);
                try {
                    C0495p c0495p = this.f13020p;
                    C0715p c0715p = (C0715p) c0495p.i;
                    D d6 = new D(tVar3, this.f13021q, tVar2, c0495p, 5);
                    this.f13016l = tVar2;
                    this.f13017m = c0919l;
                    this.f13018n = 1;
                    Object objB = AbstractC0909d.b(c0919l, new C0928v(c0715p, w0Var, c0919l.i.getValue(), c0919l.f12026j), Long.MIN_VALUE, d6, this);
                    if (objB != obj2) {
                        objB = x.f10867a;
                    }
                    if (objB == obj2) {
                        return obj2;
                    }
                    tVar = tVar2;
                    f6 = tVar.f1071h;
                } catch (CancellationException unused) {
                    tVar = tVar2;
                    tVar.f1071h = ((Number) c0919l.f12025h.f12137b.invoke(c0919l.f12026j)).floatValue();
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0919l = this.f13017m;
            tVar = this.f13016l;
            try {
                V.O(obj);
            } catch (CancellationException unused2) {
                tVar.f1071h = ((Number) c0919l.f12025h.f12137b.invoke(c0919l.f12026j)).floatValue();
            }
            f6 = tVar.f1071h;
        }
        return new Float(f6);
    }
}
