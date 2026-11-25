package p129y;

import B.c1;
import D4.a;
import D4.e;
import E4.l;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import p124x0.Y;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f14166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f14167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y f14168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f14169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c1 f14170p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(i iVar, Y y2, a aVar, c1 c1Var, d dVar) {
        super(2, dVar);
        this.f14167m = iVar;
        this.f14168n = y2;
        this.f14169o = (l) aVar;
        this.f14170p = c1Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [D4.a, E4.l] */
    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        ?? r6 = this.f14169o;
        c1 c1Var = this.f14170p;
        h hVar = new h(this.f14167m, this.f14168n, r6, c1Var, dVar);
        hVar.f14166l = obj;
        return hVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((h) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [D4.a, E4.l] */
    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        V.O(obj);
        InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f14166l;
        Y y2 = this.f14168n;
        ?? r6 = this.f14169o;
        i iVar = this.f14167m;
        AbstractC0336x.o(interfaceC0335w, null, new f(iVar, y2, r6, null), 3);
        return AbstractC0336x.o(interfaceC0335w, null, new g(iVar, this.f14170p, null), 3);
    }
}
