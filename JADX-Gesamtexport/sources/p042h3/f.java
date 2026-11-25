package p042h3;

import S1.h0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f9300l = new f(new Object[0], 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final transient Object[] f9301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient int f9302k;

    public f(Object[] objArr, int i) {
        this.f9301j = objArr;
        this.f9302k = i;
    }

    @Override // p042h3.a
    public final Object[] c() {
        return this.f9301j;
    }

    @Override // p042h3.a
    public final int d() {
        return 0;
    }

    @Override // p042h3.a
    public final int g() {
        return this.f9302k;
    }

    @Override // java.util.List
    public final Object get(int i) {
        h0.E(i, this.f9302k);
        Object obj = this.f9301j[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p042h3.e, p042h3.a
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f9301j;
        int i = this.f9302k;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9302k;
    }
}
