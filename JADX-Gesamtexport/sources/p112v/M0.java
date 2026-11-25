package p112v;

import D4.e;
import S1.V;
import p084p4.x;
import p091r0.j;
import p091r0.y;
import p111u4.d;
import p122w4.h;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class M0 extends h implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ d f12868k;

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        M0 m6 = new M0(2, dVar);
        m6.f12868k = (d) obj;
        return m6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((M0) b((y) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12867j;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return obj;
        }
        V.O(obj);
        y yVar = (y) this.f12868k;
        this.f12867j = 1;
        Object objE = Y0.e(yVar, j.i, this);
        return objE == aVar ? aVar : objE;
    }
}
