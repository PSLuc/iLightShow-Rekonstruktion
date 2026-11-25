package p042h3;

import S1.h0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final transient int f9297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient int f9298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f9299l;

    public d(e eVar, int i, int i3) {
        Objects.requireNonNull(eVar);
        this.f9299l = eVar;
        this.f9297j = i;
        this.f9298k = i3;
    }

    @Override // p042h3.a
    public final Object[] c() {
        return this.f9299l.c();
    }

    @Override // p042h3.a
    public final int d() {
        return this.f9299l.d() + this.f9297j;
    }

    @Override // p042h3.a
    public final int g() {
        return this.f9299l.d() + this.f9297j + this.f9298k;
    }

    @Override // java.util.List
    public final Object get(int i) {
        h0.E(i, this.f9298k);
        return this.f9299l.get(i + this.f9297j);
    }

    @Override // p042h3.e, java.util.List
    /* JADX INFO: renamed from: k */
    public final e subList(int i, int i3) {
        h0.G(i, i3, this.f9298k);
        int i6 = this.f9297j;
        return this.f9299l.subList(i + i6, i3 + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9298k;
    }
}
