package M4;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements L4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E4.l f3531c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(String str, int i, D4.e eVar) {
        E4.k.f("input", str);
        this.f3529a = str;
        this.f3530b = i;
        this.f3531c = (E4.l) eVar;
    }

    @Override // L4.j
    public final Iterator iterator() {
        return new b(this);
    }
}
