package K2;

import B.C0031p0;
import F.C0068j;
import android.content.Context;
import java.lang.reflect.Array;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k implements N2.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f2102h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f2103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f2104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f2105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f2106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f2107n;

    public static C0068j a(Object obj) {
        return new C0068j(obj.getClass(), Array.getLength(obj), obj);
    }

    @Override // p079o4.a
    public Object get() {
        return new R2.l((Context) ((N2.c) this.f2102h).f3892h, (M2.f) ((p079o4.a) this.i).get(), (S2.d) ((p079o4.a) this.f2103j).get(), (R2.d) ((C0031p0) this.f2104k).get(), (Executor) ((p079o4.a) this.f2105l).get(), (T2.b) ((p079o4.a) this.f2106m).get(), new Z2.f(13, false), new W2.g(13), (S2.c) ((p079o4.a) this.f2107n).get());
    }
}
