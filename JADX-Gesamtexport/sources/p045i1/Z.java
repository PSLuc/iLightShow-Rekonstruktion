package p045i1;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p008b1.c;

/* JADX INFO: loaded from: classes.dex */
public class Z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f9437b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f9438a;

    static {
        f9437b = (Build.VERSION.SDK_INT >= 30 ? new S() : new Q()).b().f9452a.a().f9452a.b().f9452a.c();
    }

    public Z(c0 c0Var) {
        this.f9438a = c0Var;
    }

    public c0 a() {
        return this.f9438a;
    }

    public c0 b() {
        return this.f9438a;
    }

    public c0 c() {
        return this.f9438a;
    }

    public void d(View view) {
    }

    public C0745f e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z5 = (Z) obj;
        return o() == z5.o() && n() == z5.n() && Objects.equals(k(), z5.k()) && Objects.equals(i(), z5.i()) && Objects.equals(e(), z5.e());
    }

    public c f(int i) {
        return c.f7046e;
    }

    public c g(int i) {
        if ((i & 8) == 0) {
            return c.f7046e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public c h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public c i() {
        return c.f7046e;
    }

    public c j() {
        return k();
    }

    public c k() {
        return c.f7046e;
    }

    public c l() {
        return k();
    }

    public c0 m(int i, int i3, int i6, int i7) {
        return f9437b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i) {
        return true;
    }

    public void q(c[] cVarArr) {
    }

    public void r(c0 c0Var) {
    }
}
