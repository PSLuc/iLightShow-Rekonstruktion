package J4;

import java.util.NoSuchElementException;
import p089q4.y;

/* JADX INFO: loaded from: classes.dex */
public final class c extends y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1943h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1945k;

    public c(int i, int i3, int i6) {
        this.f1943h = i6;
        this.i = i3;
        boolean z5 = false;
        if (i6 <= 0 ? i >= i3 : i <= i3) {
            z5 = true;
        }
        this.f1944j = z5;
        this.f1945k = z5 ? i : i3;
    }

    @Override // p089q4.y
    public final int a() {
        int i = this.f1945k;
        if (i != this.i) {
            this.f1945k = this.f1943h + i;
            return i;
        }
        if (!this.f1944j) {
            throw new NoSuchElementException();
        }
        this.f1944j = false;
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1944j;
    }
}
