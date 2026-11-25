package h5;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class B extends p089q4.d implements RandomAccess {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0735m[] f9309h;
    public final int[] i;

    public B(C0735m[] c0735mArr, int[] iArr) {
        this.f9309h = c0735mArr;
        this.i = iArr;
    }

    @Override // p089q4.AbstractC0861a
    public final int c() {
        return this.f9309h.length;
    }

    @Override // p089q4.AbstractC0861a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0735m) {
            return super.contains((C0735m) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f9309h[i];
    }

    @Override // p089q4.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0735m) {
            return super.indexOf((C0735m) obj);
        }
        return -1;
    }

    @Override // p089q4.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0735m) {
            return super.lastIndexOf((C0735m) obj);
        }
        return -1;
    }
}
