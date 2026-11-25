package p112v;

import D4.e;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: v.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0991m extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f13025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0997p f13026n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1015y0 f13027o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0991m(C0997p c0997p, C1015y0 c1015y0, d dVar) {
        super(2, dVar);
        this.f13026n = c0997p;
        this.f13027o = c1015y0;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0991m c0991m = new C0991m(this.f13026n, this.f13027o, dVar);
        c0991m.f13025m = obj;
        return c0991m;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0991m) b((InterfaceC0970b0) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f13024l;
        C0997p c0997p = this.f13026n;
        try {
            if (i == 0) {
                V.O(obj);
                InterfaceC0970b0 interfaceC0970b0 = (InterfaceC0970b0) this.f13025m;
                c0997p.f13044d.setValue(Boolean.TRUE);
                C1015y0 c1015y0 = this.f13027o;
                this.f13024l = 1;
                if (c1015y0.d(interfaceC0970b0, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V.O(obj);
            }
            c0997p.f13044d.setValue(Boolean.FALSE);
            return x.f10867a;
        } catch (Throwable th) {
            c0997p.f13044d.setValue(Boolean.FALSE);
            throw th;
        }
    }
}
