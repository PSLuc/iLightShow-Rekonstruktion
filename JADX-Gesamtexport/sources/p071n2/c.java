package p071n2;

import java.io.Serializable;
import java.util.Objects;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f10538h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f10539j;

    public c(String str, Class cls) {
        this.f10538h = cls;
        this.i = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        this.f10539j = (str == null || str.isEmpty()) ? null : str;
    }

    public final boolean a() {
        return this.f10539j != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != c.class) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10538h == cVar.f10538h && Objects.equals(this.f10539j, cVar.f10539j);
    }

    public final int hashCode() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[NamedType, class ");
        sb.append(this.f10538h.getName());
        sb.append(", name: ");
        return k.u(sb, this.f10539j == null ? "null" : k.u(new StringBuilder("'"), this.f10539j, "'"), "]");
    }
}
