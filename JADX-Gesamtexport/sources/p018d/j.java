package p018d;

import D4.e;
import F.L;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class j extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f8566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f8567m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, boolean z5, d dVar) {
        super(2, dVar);
        this.f8566l = iVar;
        this.f8567m = z5;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new j(this.f8566l, this.f8567m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        j jVar = (j) b((InterfaceC0335w) obj, (d) obj2);
        x xVar = x.f10867a;
        jVar.o(xVar);
        return xVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [D4.a, E4.i] */
    @Override // p122w4.a
    public final Object o(Object obj) {
        L l6;
        a aVar = a.f13292h;
        V.O(obj);
        i iVar = this.f8566l;
        boolean z5 = this.f8567m;
        if (!z5 && iVar.f7179a && (l6 = iVar.f8565f) != null) {
            l6.c();
        }
        iVar.f7179a = z5;
        ?? r6 = iVar.f7181c;
        if (r6 != 0) {
            r6.invoke();
        }
        return x.f10867a;
    }
}
