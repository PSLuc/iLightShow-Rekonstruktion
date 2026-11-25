package p045i1;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: i1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0745f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f9456a;

    public C0745f(DisplayCutout displayCutout) {
        this.f9456a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0745f.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f9456a, ((C0745f) obj).f9456a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f9456a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f9456a + "}";
    }
}
