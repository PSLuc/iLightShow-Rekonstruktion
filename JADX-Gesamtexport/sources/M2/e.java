package M2;

import S2.j;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class e implements N2.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3484h;
    public final N2.c i;

    public /* synthetic */ e(N2.c cVar, int i) {
        this.f3484h = i;
        this.i = cVar;
    }

    @Override // p079o4.a
    public final Object get() {
        switch (this.f3484h) {
            case 0:
                return new d((Context) this.i.f3892h, new Z2.f(13, false), new W2.g(13));
            case 1:
                String packageName = ((Context) this.i.f3892h).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new j(Integer.valueOf(j.f5008k).intValue(), (Context) this.i.f3892h, "com.google.android.datatransport.events");
        }
    }
}
