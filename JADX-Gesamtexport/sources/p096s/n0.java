package p096s;

import D4.e;
import E4.k;
import L.V1;
import N.C0208d;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f12049l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12050m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f12051n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o0 f12052o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, d dVar) {
        super(2, dVar);
        this.f12052o = o0Var;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        n0 n0Var = new n0(this.f12052o, dVar);
        n0Var.f12051n = obj;
        return n0Var;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((n0) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        float fH;
        InterfaceC0335w interfaceC0335w;
        a aVar = a.f13292h;
        int i = this.f12050m;
        if (i == 0) {
            V.O(obj);
            InterfaceC0335w interfaceC0335w2 = (InterfaceC0335w) this.f12051n;
            fH = AbstractC0909d.h(interfaceC0335w2.d());
            interfaceC0335w = interfaceC0335w2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fH = this.f12049l;
            interfaceC0335w = (InterfaceC0335w) this.f12051n;
            V.O(obj);
        }
        while (AbstractC0336x.m(interfaceC0335w)) {
            V1 v6 = new V1(this.f12052o, fH);
            this.f12051n = interfaceC0335w;
            this.f12049l = fH;
            this.f12050m = 1;
            p111u4.i iVar = this.i;
            k.c(iVar);
            if (C0208d.F(iVar).C(v6, this) == aVar) {
                return aVar;
            }
        }
        return x.f10867a;
    }
}
