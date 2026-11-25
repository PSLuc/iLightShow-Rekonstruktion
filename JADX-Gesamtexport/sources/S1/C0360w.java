package S1;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: S1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0360w implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0360w f4978m = new C0360w(Collections.EMPTY_SET, false, false, false, true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f4979h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f4980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f4981k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f4982l;

    public C0360w(Set set, boolean z5, boolean z6, boolean z7, boolean z8) {
        if (set == null) {
            this.f4979h = Collections.EMPTY_SET;
        } else {
            this.f4979h = set;
        }
        this.i = z5;
        this.f4980j = z6;
        this.f4981k = z7;
        this.f4982l = z8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == C0360w.class) {
            C0360w c0360w = (C0360w) obj;
            if (this.i == c0360w.i && this.f4982l == c0360w.f4982l && this.f4980j == c0360w.f4980j && this.f4981k == c0360w.f4981k && this.f4979h.equals(c0360w.f4979h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4979h.size() + (this.i ? 1 : -3) + (this.f4980j ? 3 : -7) + (this.f4981k ? 7 : -11) + (this.f4982l ? 11 : -13);
    }

    public final String toString() {
        return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this.f4979h, Boolean.valueOf(this.i), Boolean.valueOf(this.f4980j), Boolean.valueOf(this.f4981k), Boolean.valueOf(this.f4982l));
    }
}
