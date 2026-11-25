package m5;

import p5.C0854t;
import p5.C0855u;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0855u f10461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0854t f10462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f10464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f10465e;

    public n() {
        this.f10461a = null;
        this.f10462b = null;
        this.f10463c = -1L;
    }

    public final void a() {
        n nVar = this.f10465e;
        nVar.f10464d = this.f10464d;
        this.f10464d.f10465e = nVar;
    }

    public final String toString() {
        return "CacheEntry [key: " + this.f10461a + ", last access: " + this.f10463c + "]";
    }

    public n(C0855u c0855u, C0854t c0854t) {
        this.f10462b = c0854t;
        this.f10461a = c0855u;
        this.f10463c = System.nanoTime();
    }
}
