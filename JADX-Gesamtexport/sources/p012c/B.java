package p012c;

import E4.k;
import p089q4.j;

/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC0465c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f7118h;
    public final /* synthetic */ D i;

    public B(D d6, u uVar) {
        k.f("onBackPressedCallback", uVar);
        this.i = d6;
        this.f7118h = uVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [D4.a, E4.i] */
    @Override // p012c.InterfaceC0465c
    public final void cancel() {
        D d6 = this.i;
        j jVar = d6.f7121b;
        u uVar = this.f7118h;
        jVar.remove(uVar);
        if (k.a(d6.f7122c, uVar)) {
            uVar.a();
            d6.f7122c = null;
        }
        uVar.f7180b.remove(this);
        ?? r6 = uVar.f7181c;
        if (r6 != 0) {
            r6.invoke();
        }
        uVar.f7181c = null;
    }
}
