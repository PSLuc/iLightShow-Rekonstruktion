package J3;

import P4.InterfaceC0335w;
import S1.V;
import java.util.ArrayList;
import p084p4.x;
import p122w4.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f1928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f1930n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, int i, e eVar2, p111u4.d dVar) {
        super(2, dVar);
        this.f1928l = eVar;
        this.f1929m = i;
        this.f1930n = eVar2;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new d(this.f1928l, this.f1929m, this.f1930n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        d dVar = (d) b((InterfaceC0335w) obj, (p111u4.d) obj2);
        x xVar = x.f10867a;
        dVar.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        int i = 0;
        v4.a aVar = v4.a.f13292h;
        V.O(obj);
        K3.e eVar = new K3.e(0);
        eVar.f2138b = 0;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f1928l.f1932b);
        for (a aVar2 : this.f1928l.f1935e) {
            synchronized (eVar) {
                eVar.f2138b++;
            }
            aVar2.scan(new b(this.f1929m, this.f1928l, eVar, arrayList));
        }
        eVar.f2139c = new c(this.f1929m, i, this.f1928l, this.f1930n);
        return x.f10867a;
    }
}
