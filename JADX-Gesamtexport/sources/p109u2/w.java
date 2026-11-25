package p109u2;

import S1.EnumC0363z;
import java.util.Collections;
import java.util.Iterator;
import p015c2.A;
import p015c2.B;
import p015c2.h;
import p015c2.z;
import p026e2.n;
import p046i2.AbstractC0771g;
import p046i2.C0769e;
import p046i2.C0772h;
import p046i2.C0776l;
import p046i2.K;
import p046i2.t;

/* JADX INFO: loaded from: classes.dex */
public final class w extends t {
    public final B i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC0771g f12715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z f12716k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final A f12717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final S1.A f12718m;

    public w(B b6, AbstractC0771g abstractC0771g, A a6, z zVar, S1.A a7) {
        this.i = b6;
        this.f12715j = abstractC0771g;
        this.f12717l = a6;
        this.f12716k = zVar == null ? z.f7338p : zVar;
        this.f12718m = a7;
    }

    public static w B(n nVar, K k3, A a6, z zVar, EnumC0363z enumC0363z) {
        S1.A a7;
        EnumC0363z enumC0363z2;
        if (enumC0363z == null || enumC0363z == (enumC0363z2 = EnumC0363z.f4986l)) {
            a7 = t.f9574h;
        } else {
            S1.A a8 = S1.A.f4905l;
            a7 = enumC0363z != enumC0363z2 ? new S1.A(enumC0363z, null, null, null) : S1.A.f4905l;
        }
        return new w(nVar.d(), k3, a6, zVar, a7);
    }

    @Override // p046i2.t
    public final A a() {
        return this.f12717l;
    }

    @Override // p046i2.t
    public final z c() {
        return this.f12716k;
    }

    @Override // p109u2.t
    public final String getName() {
        return this.f12717l.f7195h;
    }

    @Override // p046i2.t
    public final S1.A h() {
        return this.f12718m;
    }

    @Override // p046i2.t
    public final C0776l m() {
        AbstractC0771g abstractC0771g = this.f12715j;
        if (abstractC0771g instanceof C0776l) {
            return (C0776l) abstractC0771g;
        }
        return null;
    }

    @Override // p046i2.t
    public final Iterator n() {
        C0776l c0776lM = m();
        return c0776lM == null ? i.f12699c : Collections.singleton(c0776lM).iterator();
    }

    @Override // p046i2.t
    public final C0769e o() {
        AbstractC0771g abstractC0771g = this.f12715j;
        if (abstractC0771g instanceof C0769e) {
            return (C0769e) abstractC0771g;
        }
        return null;
    }

    @Override // p046i2.t
    public final C0772h p() {
        AbstractC0771g abstractC0771g = this.f12715j;
        if ((abstractC0771g instanceof C0772h) && ((C0772h) abstractC0771g).f9547l.getParameterCount() == 0) {
            return (C0772h) abstractC0771g;
        }
        return null;
    }

    @Override // p046i2.t
    public final h q() {
        AbstractC0771g abstractC0771g = this.f12715j;
        return abstractC0771g == null ? p104t2.n.n() : abstractC0771g.h();
    }

    @Override // p046i2.t
    public final Class r() {
        AbstractC0771g abstractC0771g = this.f12715j;
        return abstractC0771g == null ? Object.class : abstractC0771g.g();
    }

    @Override // p046i2.t
    public final C0772h s() {
        AbstractC0771g abstractC0771g = this.f12715j;
        if ((abstractC0771g instanceof C0772h) && ((C0772h) abstractC0771g).f9547l.getParameterCount() == 1) {
            return (C0772h) abstractC0771g;
        }
        return null;
    }

    @Override // p046i2.t
    public final A t() {
        B b6 = this.i;
        if (b6 != null && this.f12715j != null) {
            b6.getClass();
        }
        return null;
    }

    @Override // p046i2.t
    public final boolean u() {
        return this.f12715j instanceof C0776l;
    }

    @Override // p046i2.t
    public final boolean v() {
        return this.f12715j instanceof C0769e;
    }

    @Override // p046i2.t
    public final boolean w(A a6) {
        return this.f12717l.equals(a6);
    }

    @Override // p046i2.t
    public final boolean x() {
        return s() != null;
    }

    @Override // p046i2.t
    public final boolean y() {
        return false;
    }

    @Override // p046i2.t
    public final boolean z() {
        return false;
    }
}
