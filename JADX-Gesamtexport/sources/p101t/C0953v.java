package p101t;

import D4.f;
import P4.AbstractC0336x;
import S1.V;
import p030f0.c;
import p084p4.x;
import p111u4.d;
import p112v.C0968a0;
import p117w.m;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: t.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0953v extends i implements f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f12434l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12435m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ C0968a0 f12436n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ long f12437o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractC0942j f12438p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0953v(AbstractC0942j abstractC0942j, d dVar, int i) {
        super(3, dVar);
        this.f12434l = i;
        this.f12438p = abstractC0942j;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        C0968a0 c0968a0 = (C0968a0) obj;
        c cVar = (c) obj2;
        switch (this.f12434l) {
            case 0:
                long j4 = cVar.f8837a;
                C0953v c0953v = new C0953v((C0954w) this.f12438p, (d) obj3, 0);
                c0953v.f12436n = c0968a0;
                c0953v.f12437o = j4;
                return c0953v.o(x.f10867a);
            default:
                long j6 = cVar.f8837a;
                C0953v c0953v2 = new C0953v((A) this.f12438p, (d) obj3, 1);
                c0953v2.f12436n = c0968a0;
                c0953v2.f12437o = j6;
                return c0953v2.o(x.f10867a);
        }
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        Object objD;
        Object objD2;
        switch (this.f12434l) {
            case 0:
                a aVar = a.f13292h;
                int i = this.f12435m;
                x xVar = x.f10867a;
                if (i == 0) {
                    V.O(obj);
                    C0968a0 c0968a0 = this.f12436n;
                    long j4 = this.f12437o;
                    C0954w c0954w = (C0954w) this.f12438p;
                    if (c0954w.f12348A) {
                        this.f12435m = 1;
                        m mVar = c0954w.f12357w;
                        if (mVar == null || (objD = AbstractC0336x.d(new C0936d(c0968a0, j4, mVar, c0954w, null), this)) != aVar) {
                            objD = xVar;
                        }
                        if (objD == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V.O(obj);
                }
                return xVar;
            default:
                a aVar2 = a.f13292h;
                int i3 = this.f12435m;
                x xVar2 = x.f10867a;
                if (i3 == 0) {
                    V.O(obj);
                    C0968a0 c0968a1 = this.f12436n;
                    long j6 = this.f12437o;
                    A a6 = (A) this.f12438p;
                    if (a6.f12348A) {
                        this.f12435m = 1;
                        m mVar2 = a6.f12357w;
                        if (mVar2 == null || (objD2 = AbstractC0336x.d(new C0936d(c0968a1, j6, mVar2, a6, null), this)) != aVar2) {
                            objD2 = xVar2;
                        }
                        if (objD2 == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V.O(obj);
                }
                return xVar2;
        }
    }
}
