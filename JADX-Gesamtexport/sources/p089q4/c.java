package p089q4;

import B.AbstractC0013g0;
import java.util.RandomAccess;
import p006b.a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f11229h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f11230j;

    public c(d dVar, int i, int i3) {
        this.f11229h = dVar;
        this.i = i;
        a.r(i, i3, dVar.c());
        this.f11230j = i3 - i;
    }

    @Override // p089q4.AbstractC0861a
    public final int c() {
        return this.f11230j;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i3 = this.f11230j;
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
        }
        return this.f11229h.get(this.i + i);
    }
}
