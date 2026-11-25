package p104t2;

import p015c2.h;
import p015c2.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f12507t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h f12508u;

    public f(int i) {
        super(Object.class, m.f12529n, n.n(), null, 1, null, null, false);
        this.f12507t = i;
    }

    public static void z0() {
        throw new UnsupportedOperationException("Operation should not be attempted on ".concat(f.class.getName()));
    }

    @Override // p015c2.h
    public final StringBuilder Z(StringBuilder sb) {
        sb.append('$');
        sb.append(this.f12507t + 1);
        return sb;
    }

    @Override // p015c2.h
    public final StringBuilder a0(StringBuilder sb) {
        Z(sb);
        return sb;
    }

    @Override // p015c2.h
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // p015c2.h
    public final boolean k0() {
        return false;
    }

    @Override // p015c2.h
    public final h p0(Class cls, m mVar, h hVar, h[] hVarArr) {
        z0();
        throw null;
    }

    @Override // p015c2.h
    public final h q0(h hVar) {
        z0();
        throw null;
    }

    @Override // p015c2.h
    public final h r0(Object obj) {
        z0();
        throw null;
    }

    @Override // p015c2.h
    public final h s0(j jVar) {
        z0();
        throw null;
    }

    @Override // p015c2.h
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Z(sb);
        return sb.toString();
    }

    @Override // p015c2.h
    public final h u0() {
        z0();
        throw null;
    }

    @Override // p015c2.h
    public final h v0(Object obj) {
        z0();
        throw null;
    }

    @Override // p015c2.h
    public final h w0(Object obj) {
        z0();
        throw null;
    }

    @Override // p104t2.j
    public final String y0() {
        return toString();
    }
}
