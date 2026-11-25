package E4;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends d implements h, K4.a, p084p4.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1066o;

    public i(int i, Class cls, String str, String str2, int i3) {
        this(i, c.f1055h, cls, str, str2, i3);
    }

    @Override // E4.d
    public final K4.a a() {
        x.f1075a.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public final boolean equals(Object obj) {
        ?? r6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.f1058k.equals(iVar.f1058k) && this.f1059l.equals(iVar.f1059l) && this.f1066o == iVar.f1066o && this.f1065n == iVar.f1065n && k.a(this.i, iVar.i) && b().equals(iVar.b());
        }
        if (!(obj instanceof i)) {
            return false;
        }
        K4.a aVar = this.f1056h;
        if (aVar == null) {
            a();
            this.f1056h = this;
            this = this;
        } else {
            r6 = aVar;
        }
        return obj.equals(r6);
    }

    @Override // E4.h
    public final int getArity() {
        return this.f1065n;
    }

    public final int hashCode() {
        b();
        return this.f1059l.hashCode() + AbstractC0013g0.c(b().hashCode() * 31, this.f1058k, 31);
    }

    public final String toString() {
        K4.a aVar = this.f1056h;
        if (aVar == null) {
            a();
            this.f1056h = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f1058k;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC0013g0.i("function ", str, " (Kotlin reflection is not available)");
    }

    public i(int i, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f1065n = i;
        this.f1066o = 0;
    }
}
