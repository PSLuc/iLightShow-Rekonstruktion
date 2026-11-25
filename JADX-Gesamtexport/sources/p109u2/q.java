package p109u2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class q extends s implements Serializable {
    public final s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f12711j;

    public q(s sVar, s sVar2) {
        this.i = sVar;
        this.f12711j = sVar2;
    }

    @Override // p109u2.s
    public final String a(String str) {
        return this.i.a(this.f12711j.a(str));
    }

    public final String toString() {
        return "[ChainedTransformer(" + this.i + ", " + this.f12711j + ")]";
    }
}
