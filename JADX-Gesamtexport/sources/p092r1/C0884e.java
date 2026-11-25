package p092r1;

import D4.c;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: r1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0884e extends i implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11645l;

    @Override // D4.c
    public final Object invoke(Object obj) {
        C0884e c0884e = new C0884e(1, (d) obj);
        x xVar = x.f10867a;
        c0884e.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f11645l;
        if (i == 0) {
            V.O(obj);
            this.f11645l = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        V.O(obj);
        return x.f10867a;
    }
}
