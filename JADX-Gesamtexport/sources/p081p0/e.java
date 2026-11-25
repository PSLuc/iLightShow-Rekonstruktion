package p081p0;

import D4.c;
import E4.l;
import Z.n;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n implements d {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f10833u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public l f10834v;

    @Override // p081p0.d
    public final boolean K(KeyEvent keyEvent) {
        c cVar = this.f10833u;
        if (cVar != null) {
            return ((Boolean) cVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [D4.c, E4.l] */
    @Override // p081p0.d
    public final boolean l(KeyEvent keyEvent) {
        ?? r6 = this.f10834v;
        if (r6 != 0) {
            return ((Boolean) r6.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
