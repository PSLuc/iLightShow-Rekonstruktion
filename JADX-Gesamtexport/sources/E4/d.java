package E4;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements K4.a, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient K4.a f1056h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Class f1057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f1058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f1059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f1060m;

    public d(Object obj, Class cls, String str, String str2, boolean z5) {
        this.i = obj;
        this.f1057j = cls;
        this.f1058k = str;
        this.f1059l = str2;
        this.f1060m = z5;
    }

    public abstract K4.a a();

    public final e b() {
        Class cls = this.f1057j;
        if (!this.f1060m) {
            return x.a(cls);
        }
        x.f1075a.getClass();
        return new p(cls);
    }
}
