package p123x;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13713a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13714b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A f13715c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s6 = (S) obj;
        return Float.compare(this.f13713a, s6.f13713a) == 0 && this.f13714b == s6.f13714b && k.a(this.f13715c, s6.f13715c);
    }

    public final int hashCode() {
        int iM = p012c.k.m(this.f13714b, Float.hashCode(this.f13713a) * 31, 31);
        A a6 = this.f13715c;
        return (iM + (a6 == null ? 0 : a6.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f13713a + ", fill=" + this.f13714b + ", crossAxisAlignment=" + this.f13715c + ", flowLayoutData=null)";
    }
}
