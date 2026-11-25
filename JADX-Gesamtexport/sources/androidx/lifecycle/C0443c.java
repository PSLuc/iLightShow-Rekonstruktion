package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0443c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f6985b;

    public C0443c(int i, Method method) {
        this.f6984a = i;
        this.f6985b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0443c)) {
            return false;
        }
        C0443c c0443c = (C0443c) obj;
        return this.f6984a == c0443c.f6984a && this.f6985b.getName().equals(c0443c.f6985b.getName());
    }

    public final int hashCode() {
        return this.f6985b.getName().hashCode() + (this.f6984a * 31);
    }
}
