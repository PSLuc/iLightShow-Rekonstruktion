package p081p0;

import E4.k;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyEvent f10828a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return k.a(this.f10828a, ((b) obj).f10828a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10828a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f10828a + ')';
    }
}
