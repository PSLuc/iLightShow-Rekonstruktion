package C0;

import B.AbstractC0013g0;
import E4.k;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f600b;

    public b(Resources.Theme theme, int i) {
        this.f599a = theme;
        this.f600b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.a(this.f599a, bVar.f599a) && this.f600b == bVar.f600b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f600b) + (this.f599a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f599a);
        sb.append(", id=");
        return AbstractC0013g0.k(sb, this.f600b, ')');
    }
}
