package p096s;

import E4.k;
import p035g0.C0715p;

/* JADX INFO: renamed from: s.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0906b0 implements InterfaceC0932z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11950c;

    public C0906b0(float f6, float f7, Object obj) {
        this.f11948a = f6;
        this.f11949b = f7;
        this.f11950c = obj;
    }

    @Override // p096s.InterfaceC0918k
    public final y0 a(w0 w0Var) {
        Object obj = this.f11950c;
        return new C0715p(this.f11948a, this.f11949b, obj == null ? null : (AbstractC0924q) w0Var.f12136a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0906b0) {
            C0906b0 c0906b0 = (C0906b0) obj;
            if (c0906b0.f11948a == this.f11948a && c0906b0.f11949b == this.f11949b && k.a(c0906b0.f11950c, this.f11950c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f11950c;
        return Float.hashCode(this.f11949b) + p012c.k.i(this.f11948a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ C0906b0(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
