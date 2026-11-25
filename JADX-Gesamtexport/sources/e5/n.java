package e5;

import c5.C0;
import c5.t0;
import c5.w0;
import c5.z0;
import java.util.Set;
import p089q4.A;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f8791a = A.X(w0.f7505b, z0.f7516b, t0.f7491b, C0.f7383b);

    public static final boolean a(a5.g gVar) {
        E4.k.f("<this>", gVar);
        return gVar.g() && f8791a.contains(gVar);
    }
}
