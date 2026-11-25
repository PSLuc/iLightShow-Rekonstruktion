package p123x;

import S0.b;
import S0.k;

/* JADX INFO: loaded from: classes.dex */
public final class K implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1068a f13696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13697b;

    public K(C1068a c1068a, int i) {
        this.f13696a = c1068a;
        this.f13697b = i;
    }

    @Override // p123x.a0
    public final int a(b bVar, k kVar) {
        if (((kVar == k.f4897h ? 8 : 2) & this.f13697b) != 0) {
            return this.f13696a.e().f7047a;
        }
        return 0;
    }

    @Override // p123x.a0
    public final int b(b bVar, k kVar) {
        if (((kVar == k.f4897h ? 4 : 1) & this.f13697b) != 0) {
            return this.f13696a.e().f7049c;
        }
        return 0;
    }

    @Override // p123x.a0
    public final int c(b bVar) {
        if ((this.f13697b & 16) != 0) {
            return this.f13696a.e().f7048b;
        }
        return 0;
    }

    @Override // p123x.a0
    public final int d(b bVar) {
        if ((this.f13697b & 32) != 0) {
            return this.f13696a.e().f7050d;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k3 = (K) obj;
        return E4.k.a(this.f13696a, k3.f13696a) && this.f13697b == k3.f13697b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13697b) + (this.f13696a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f13696a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.f13697b;
        int i3 = AbstractC1070c.f13758c;
        if ((i & i3) == i3) {
            AbstractC1070c.g(sb3, "Start");
        }
        int i6 = AbstractC1070c.f13760e;
        if ((i & i6) == i6) {
            AbstractC1070c.g(sb3, "Left");
        }
        if ((i & 16) == 16) {
            AbstractC1070c.g(sb3, "Top");
        }
        int i7 = AbstractC1070c.f13759d;
        if ((i & i7) == i7) {
            AbstractC1070c.g(sb3, "End");
        }
        int i8 = AbstractC1070c.f13761f;
        if ((i & i8) == i8) {
            AbstractC1070c.g(sb3, "Right");
        }
        if ((i & 32) == 32) {
            AbstractC1070c.g(sb3, "Bottom");
        }
        String string = sb3.toString();
        E4.k.e("StringBuilder().apply(builderAction).toString()", string);
        sb2.append(string);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
