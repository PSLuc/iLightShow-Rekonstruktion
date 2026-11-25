package p123x;

import E4.k;
import Z.e;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f13674a;

    public A(e eVar) {
        this.f13674a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && k.a(this.f13674a, ((A) obj).f13674a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f13674a.f5948a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f13674a + ')';
    }
}
