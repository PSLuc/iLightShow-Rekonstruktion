package p098s2;

import p015c2.E;
import p015c2.InterfaceC0472c;
import p071n2.e;
import p093r2.g;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p015c2.o implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f12190h;
    public final p015c2.o i;

    public o(e eVar, p015c2.o oVar) {
        this.f12190h = eVar;
        this.i = oVar;
    }

    @Override // p093r2.g
    public final p015c2.o b(E e6, InterfaceC0472c interfaceC0472c) {
        p015c2.o oVar = this.i;
        p015c2.o oVarT0 = oVar instanceof g ? e6.t0(oVar, interfaceC0472c) : oVar;
        return oVarT0 == oVar ? this : new o(this.f12190h, oVarT0);
    }

    @Override // p015c2.o
    public final Class handledType() {
        return Object.class;
    }

    @Override // p015c2.o
    public final void serialize(Object obj, T1.e eVar, E e6) {
        this.i.serializeWithType(obj, eVar, e6, this.f12190h);
    }

    @Override // p015c2.o
    public final void serializeWithType(Object obj, T1.e eVar, E e6, e eVar2) {
        this.i.serializeWithType(obj, eVar, e6, eVar2);
    }
}
