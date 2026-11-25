package E;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f888c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f889d = null;

    public i(String str, String str2) {
        this.f886a = str;
        this.f887b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return E4.k.a(this.f886a, iVar.f886a) && E4.k.a(this.f887b, iVar.f887b) && this.f888c == iVar.f888c && E4.k.a(this.f889d, iVar.f889d);
    }

    public final int hashCode() {
        int iM = p012c.k.m(this.f888c, AbstractC0013g0.c(this.f886a.hashCode() * 31, this.f887b, 31), 31);
        e eVar = this.f889d;
        return iM + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f889d + ", isShowingSubstitution=" + this.f888c + ')';
    }
}
