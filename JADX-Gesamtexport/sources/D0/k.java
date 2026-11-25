package D0;

import E4.y;
import java.io.Serializable;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements D4.c, E4.h, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final P.d f750h;

    public k(P.d dVar) {
        this.f750h = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        kVar.getClass();
        return this.f750h.equals(kVar.f750h) && P.d.class.equals(P.d.class);
    }

    @Override // E4.h
    public final int getArity() {
        return 1;
    }

    public final int hashCode() {
        return ((((((((((P.d.class.hashCode() + (this.f750h.hashCode() * 31)) * 31) + 96417) * 31) + 1636195860) * 31) + 1237) * 31) + 1) * 31) + 4;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        this.f750h.c((m) obj);
        return x.f10867a;
    }

    public final String toString() {
        E4.x.f1075a.getClass();
        return y.a(this);
    }
}
