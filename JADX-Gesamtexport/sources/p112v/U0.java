package p112v;

import D4.c;
import D4.e;
import E4.w;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p091r0.j;
import p091r0.q;
import p091r0.y;
import p101t.AbstractC0957z;
import p111u4.d;
import p122w4.h;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class U0 extends h implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ d f12901k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0335w f12902l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f12903m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f12904n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0968a0 f12905o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(InterfaceC0335w interfaceC0335w, AbstractC0957z abstractC0957z, c cVar, w wVar, C0968a0 c0968a0, d dVar) {
        super(2, dVar);
        this.f12902l = interfaceC0335w;
        this.f12903m = cVar;
        this.f12904n = wVar;
        this.f12905o = c0968a0;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0968a0 c0968a0 = this.f12905o;
        U0 u0 = new U0(this.f12902l, null, this.f12903m, this.f12904n, c0968a0, dVar);
        u0.f12901k = (d) obj;
        return u0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((U0) b((y) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12900j;
        if (i == 0) {
            V.O(obj);
            y yVar = (y) this.f12901k;
            this.f12900j = 1;
            obj = Y0.e(yVar, j.i, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        q qVar = (q) obj;
        x xVar = x.f10867a;
        C0968a0 c0968a0 = this.f12905o;
        InterfaceC0335w interfaceC0335w = this.f12902l;
        if (qVar != null) {
            qVar.a();
            AbstractC0336x.o(interfaceC0335w, null, new S0(c0968a0, null), 3);
            throw null;
        }
        AbstractC0336x.o(interfaceC0335w, null, new T0(c0968a0, null), 3);
        c cVar = this.f12903m;
        if (cVar == null) {
            return null;
        }
        cVar.invoke(new p030f0.c(((q) this.f12904n.f1074h).f11510c));
        return xVar;
    }
}
