package Y2;

import D.x;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f5902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W2.c f5903b;

    public /* synthetic */ i(a aVar, W2.c cVar) {
        this.f5902a = aVar;
        this.f5903b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            if (Z2.n.d(this.f5902a, iVar.f5902a) && Z2.n.d(this.f5903b, iVar.f5903b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5902a, this.f5903b});
    }

    public final String toString() {
        x xVar = new x(this);
        xVar.i("key", this.f5902a);
        xVar.i("feature", this.f5903b);
        return xVar.toString();
    }
}
