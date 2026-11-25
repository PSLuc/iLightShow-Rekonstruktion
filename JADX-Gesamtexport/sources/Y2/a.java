package Y2;

import D.x;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f5865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5866c;

    public a(x xVar, String str) {
        Z2.i iVar = Z2.i.f6033a;
        this.f5865b = xVar;
        this.f5866c = str;
        this.f5864a = Arrays.hashCode(new Object[]{xVar, iVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!Z2.n.d(this.f5865b, aVar.f5865b)) {
            return false;
        }
        Z2.i iVar = Z2.i.f6033a;
        return Z2.n.d(iVar, iVar) && Z2.n.d(this.f5866c, aVar.f5866c);
    }

    public final int hashCode() {
        return this.f5864a;
    }
}
