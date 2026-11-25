package N;

import B.AbstractC0013g0;

/* JADX INFO: renamed from: N.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0206c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3685a;

    public C0206c(int i) {
        this.f3685a = i;
    }

    public final boolean a() {
        return this.f3685a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return AbstractC0013g0.l(sb, this.f3685a, " }");
    }
}
