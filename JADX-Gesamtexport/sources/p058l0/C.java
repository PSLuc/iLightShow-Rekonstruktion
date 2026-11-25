package p058l0;

import A2.e;
import D4.c;
import p044i0.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f10195a;

    public abstract void a(d dVar);

    public c b() {
        return this.f10195a;
    }

    public final void c() {
        c cVarB = b();
        if (cVarB != null) {
            cVarB.invoke(this);
        }
    }

    public void d(e eVar) {
        this.f10195a = eVar;
    }
}
