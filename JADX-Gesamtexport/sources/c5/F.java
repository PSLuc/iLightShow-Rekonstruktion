package c5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class F extends C0480c0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f7395l;

    public F(String str, G g6) {
        super(str, g6, 1);
        this.f7395l = true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, p4.f] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, p4.f] */
    @Override // c5.C0480c0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            a5.g gVar = (a5.g) obj;
            if (this.f7433a.equals(gVar.b())) {
                F f6 = (F) obj;
                if (f6.f7395l && Arrays.equals((a5.g[]) this.f7441j.getValue(), (a5.g[]) f6.f7441j.getValue())) {
                    int iE = gVar.e();
                    int i = this.f7435c;
                    if (i == iE) {
                        for (int i3 = 0; i3 < i; i3++) {
                            if (E4.k.a(k(i3).b(), gVar.k(i3).b()) && E4.k.a(k(i3).c(), gVar.k(i3).c())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // c5.C0480c0, a5.g
    public final boolean g() {
        return this.f7395l;
    }

    @Override // c5.C0480c0
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
