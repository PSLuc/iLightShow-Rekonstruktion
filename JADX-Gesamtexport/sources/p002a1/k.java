package p002a1;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f6142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f6143b;

    public k(Resources resources, Resources.Theme theme) {
        this.f6142a = resources;
        this.f6143b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f6142a.equals(kVar.f6142a) && Objects.equals(this.f6143b, kVar.f6143b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f6142a, this.f6143b);
    }
}
