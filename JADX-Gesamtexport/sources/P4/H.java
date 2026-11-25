package P4;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class H extends I {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0319f f4609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ K f4610k;

    public H(K k3, long j4, C0319f c0319f) {
        this.f4610k = k3;
        this.f4611h = j4;
        this.i = -1;
        this.f4609j = c0319f;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        this.f4609j.E(this.f4610k);
    }

    @Override // P4.I
    public final String toString() {
        return super.toString() + this.f4609j;
    }
}
