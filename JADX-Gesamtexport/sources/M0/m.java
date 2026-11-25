package M0;

import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f3430f = new m(0, true, 1, 1, N0.b.f3877j);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N0.b f3435e;

    public m(int i, boolean z5, int i3, int i6, N0.b bVar) {
        this.f3431a = i;
        this.f3432b = z5;
        this.f3433c = i3;
        this.f3434d = i6;
        this.f3435e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        mVar.getClass();
        return this.f3431a == mVar.f3431a && this.f3432b == mVar.f3432b && this.f3433c == mVar.f3433c && this.f3434d == mVar.f3434d && E4.k.a(this.f3435e, mVar.f3435e);
    }

    public final int hashCode() {
        return this.f3435e.f3878h.hashCode() + AbstractC0916i.c(this.f3434d, AbstractC0916i.c(this.f3433c, p012c.k.m(this.f3432b, AbstractC0916i.c(this.f3431a, Boolean.hashCode(false) * 31, 31), 31), 31), 961);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        int i = this.f3431a;
        if (i == -1) {
            str = "Unspecified";
        } else if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Characters";
        } else if (i == 2) {
            str = "Words";
        } else {
            str = i == 3 ? "Sentences" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", autoCorrect=");
        sb.append(this.f3432b);
        sb.append(", keyboardType=");
        sb.append((Object) p027e3.a.A0(this.f3433c));
        sb.append(", imeAction=");
        sb.append((Object) l.a(this.f3434d));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f3435e);
        sb.append(')');
        return sb.toString();
    }
}
