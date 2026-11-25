package G1;

import F1.C0096m;
import N.C0217h0;
import N.V0;
import P4.InterfaceC0335w;
import S1.V;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p096s.o0;

/* JADX INFO: loaded from: classes.dex */
public final class A extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o0 f1596l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Map f1597m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V0 f1598n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f1599o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(o0 o0Var, Map map, V0 v6, i iVar, p111u4.d dVar) {
        super(2, dVar);
        this.f1596l = o0Var;
        this.f1597m = map;
        this.f1598n = v6;
        this.f1599o = iVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new A(this.f1596l, this.f1597m, this.f1598n, this.f1599o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        A a6 = (A) b((InterfaceC0335w) obj, (p111u4.d) obj2);
        p084p4.x xVar = p084p4.x.f10867a;
        a6.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        V.O(obj);
        o0 o0Var = this.f1596l;
        Object objJ = o0Var.f12056a.j();
        C0217h0 c0217h0 = o0Var.f12059d;
        if (E4.k.a(objJ, c0217h0.getValue())) {
            Iterator it = ((List) this.f1598n.getValue()).iterator();
            while (it.hasNext()) {
                this.f1599o.b().b((C0096m) it.next());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f1597m;
            for (Map.Entry entry : map.entrySet()) {
                if (!E4.k.a(entry.getKey(), ((C0096m) c0217h0.getValue()).f1357m)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                map.remove(((Map.Entry) it2.next()).getKey());
            }
        }
        return p084p4.x.f10867a;
    }
}
