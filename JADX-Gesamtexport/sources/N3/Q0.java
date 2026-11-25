package N3;

import P4.InterfaceC0335w;
import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f4092l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(Context context, p111u4.d dVar) {
        super(2, dVar);
        this.f4092l = context;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new Q0(this.f4092l, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        Q0 q6 = (Q0) b((InterfaceC0335w) obj, (p111u4.d) obj2);
        p084p4.x xVar = p084p4.x.f10867a;
        q6.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        com.nanjoran.ilightshow.Services.z0 z0Var = com.nanjoran.ilightshow.Services.z0.f8505f;
        Context context = this.f4092l;
        E4.k.d("null cannot be cast to non-null type android.app.Activity", context);
        z0Var.f8511e = (Activity) context;
        I3.c.f1859f.a(z0Var);
        return p084p4.x.f10867a;
    }
}
