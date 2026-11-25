package N0;

import E4.k;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f3876a;

    public a(Locale locale) {
        this.f3876a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return k.a(this.f3876a.toLanguageTag(), ((a) obj).f3876a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f3876a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f3876a.toLanguageTag();
    }
}
