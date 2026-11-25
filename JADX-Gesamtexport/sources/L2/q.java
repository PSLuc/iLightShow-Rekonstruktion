package L2;

import B.C0031p0;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile k f3080e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U2.a f3081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U2.a f3082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q2.c f3083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R2.l f3084d;

    public q(U2.a aVar, U2.a aVar2, Q2.c cVar, R2.l lVar, R2.m mVar) {
        this.f3081a = aVar;
        this.f3082b = aVar2;
        this.f3083c = cVar;
        this.f3084d = lVar;
        mVar.getClass();
        mVar.f4797a.execute(new I3.a(4, mVar));
    }

    public static q a() {
        k kVar = f3080e;
        if (kVar != null) {
            return (q) kVar.f3073m.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f3080e == null) {
            synchronized (q.class) {
                try {
                    if (f3080e == null) {
                        j jVar = new j();
                        context.getClass();
                        jVar.f3068a = context;
                        f3080e = jVar.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final C0031p0 c(J2.a aVar) {
        byte[] bytes;
        Set setUnmodifiableSet = aVar != null ? Collections.unmodifiableSet(J2.a.f1907d) : Collections.singleton(new I2.b("proto"));
        C0031p0 c0031p0A = i.a();
        aVar.getClass();
        c0031p0A.i = "cct";
        String str = aVar.f1909a;
        String str2 = aVar.f1910b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = p012c.k.s("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        c0031p0A.f394j = bytes;
        return new C0031p0(setUnmodifiableSet, c0031p0A.b(), this, 9);
    }
}
