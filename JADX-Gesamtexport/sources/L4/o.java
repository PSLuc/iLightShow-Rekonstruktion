package L4;

import c5.C0502x;
import java.util.Iterator;
import p058l0.I;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Iterable, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3118h;
    public final Object i;

    public /* synthetic */ o(int i, Object obj) {
        this.f3118h = i;
        this.i = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3118h) {
            case 0:
                return new M4.b((M4.c) this.i);
            case 1:
                return new E4.b((C0502x) this.i);
            default:
                return new c(E4.k.j((Object[]) ((I) this.i).i));
        }
    }
}
