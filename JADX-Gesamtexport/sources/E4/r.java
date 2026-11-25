package E4;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends d implements K4.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f1069n;

    public r(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f1069n = false;
    }

    public final K4.a e() {
        if (this.f1069n) {
            return this;
        }
        K4.a aVar = this.f1056h;
        if (aVar != null) {
            return aVar;
        }
        K4.a aVarA = a();
        this.f1056h = aVarA;
        return aVarA;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return b().equals(rVar.b()) && this.f1058k.equals(rVar.f1058k) && this.f1059l.equals(rVar.f1059l) && k.a(this.i, rVar.i);
        }
        if (obj instanceof K4.e) {
            return obj.equals(e());
        }
        return false;
    }

    public final K4.e g() {
        if (this.f1069n) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        K4.a aVarE = e();
        if (aVarE != this) {
            return (K4.e) aVarE;
        }
        throw new C4.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public final int hashCode() {
        return this.f1059l.hashCode() + AbstractC0013g0.c(b().hashCode() * 31, this.f1058k, 31);
    }

    public final String toString() {
        K4.a aVarE = e();
        return aVarE != this ? aVarE.toString() : p012c.k.u(new StringBuilder("property "), this.f1058k, " (Kotlin reflection is not available)");
    }
}
