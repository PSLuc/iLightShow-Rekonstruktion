package p072n3;

import p060l3.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f10543h;

    public e() {
        this.f10543h = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e6) {
            b bVar = this.f10543h;
            if (bVar != null) {
                bVar.a(e6);
            }
        }
    }

    public e(b bVar) {
        this.f10543h = bVar;
    }
}
