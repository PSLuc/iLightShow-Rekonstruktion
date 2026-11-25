package V1;

import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f5492j = new c(null, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient Object f5493h;
    public final boolean i;

    public c(Object obj, boolean z5) {
        this.i = z5;
        this.f5493h = obj;
    }

    public static void a(int[] iArr, int i) {
        int i3 = iArr[0];
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 >= i) {
            i3 = i;
        }
        iArr[0] = i3;
        int i6 = iArr[1];
        int i7 = i - i3;
        if (i6 < 0 || i6 > i7) {
            iArr[1] = i7;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f5493h;
        Object obj3 = this.f5493h;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        if ((obj3 instanceof File) || (obj3 instanceof URL) || (obj3 instanceof URI)) {
            return obj3.equals(obj2);
        }
        return obj3 == obj2;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f5493h);
    }
}
