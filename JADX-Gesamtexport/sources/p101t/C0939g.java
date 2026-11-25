package p101t;

import D4.e;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p117w.m;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: t.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0939g extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0942j f12328l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0939g(AbstractC0942j abstractC0942j, d dVar) {
        super(2, dVar);
        this.f12328l = abstractC0942j;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new C0939g(this.f12328l, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        C0939g c0939g = (C0939g) b((InterfaceC0335w) obj, (d) obj2);
        x xVar = x.f10867a;
        c0939g.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        V.O(obj);
        AbstractC0942j abstractC0942j = this.f12328l;
        if (abstractC0942j.H == null) {
            p117w.i iVar = new p117w.i();
            m mVar = abstractC0942j.f12357w;
            if (mVar != null) {
                AbstractC0336x.o(abstractC0942j.n0(), null, new C0933a(mVar, iVar, null), 3);
            }
            abstractC0942j.H = iVar;
        }
        return x.f10867a;
    }
}
