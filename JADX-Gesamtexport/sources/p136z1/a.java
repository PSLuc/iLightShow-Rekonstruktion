package p136z1;

import java.util.ArrayList;
import p124x0.d0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f14611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14613d;

    public a(d0 d0Var) {
        d0Var.getClass();
        this.f14610a = new ArrayList();
        this.f14613d = -1;
        this.f14611b = d0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f14613d >= 0) {
            sb.append(" #");
            sb.append(this.f14613d);
        }
        sb.append("}");
        return sb.toString();
    }
}
