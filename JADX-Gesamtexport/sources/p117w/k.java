package p117w;

import D4.e;
import N.InterfaceC0203a0;
import P4.InterfaceC0335w;
import S1.V;
import S4.E;
import java.util.ArrayList;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f13390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f13391n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, InterfaceC0203a0 interfaceC0203a0, d dVar) {
        super(2, dVar);
        this.f13390m = mVar;
        this.f13391n = interfaceC0203a0;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new k(this.f13390m, this.f13391n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((k) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        a aVar = a.f13292h;
        int i = this.f13389l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return x.f10867a;
        }
        V.O(obj);
        ArrayList arrayList = new ArrayList();
        E e6 = this.f13390m.f13392a;
        g gVar = new g(arrayList, this.f13391n, 1);
        this.f13389l = 1;
        e6.getClass();
        E.j(e6, gVar, this);
        return aVar;
    }
}
