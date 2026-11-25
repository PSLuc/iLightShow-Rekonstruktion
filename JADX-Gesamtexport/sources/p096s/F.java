package p096s;

import D4.e;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class F extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ float f11842l;

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        F f6 = new F(2, dVar);
        f6.f11842l = ((Number) obj).floatValue();
        return f6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((F) b(Float.valueOf(((Number) obj).floatValue()), (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        V.O(obj);
        return Boolean.valueOf(this.f11842l > 0.0f);
    }
}
