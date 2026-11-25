package p113v0;

import D4.c;
import S0.k;
import java.util.Map;
import p027e3.a;

/* JADX INFO: renamed from: v0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1032o implements H, InterfaceC1030m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f13177h;
    public final /* synthetic */ InterfaceC1030m i;

    public C1032o(InterfaceC1030m interfaceC1030m, k kVar) {
        this.f13177h = kVar;
        this.i = interfaceC1030m;
    }

    @Override // S0.b
    public final float C(long j4) {
        return this.i.C(j4);
    }

    @Override // p113v0.H
    public final G F(int i, int i3, Map map, c cVar) {
        if (i < 0) {
            i = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if ((i & (-16777216)) == 0 && ((-16777216) & i3) == 0) {
            return new C1031n(i, i3, map);
        }
        a.y0("Size(" + i + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // S0.b
    public final int H(float f6) {
        return this.i.H(f6);
    }

    @Override // S0.b
    public final long S(long j4) {
        return this.i.S(j4);
    }

    @Override // S0.b
    public final float V(long j4) {
        return this.i.V(j4);
    }

    @Override // S0.b
    public final float a() {
        return this.i.a();
    }

    @Override // S0.b
    public final long b0(float f6) {
        return this.i.b0(f6);
    }

    @Override // p113v0.InterfaceC1030m
    public final k getLayoutDirection() {
        return this.f13177h;
    }

    @Override // S0.b
    public final float i0(int i) {
        return this.i.i0(i);
    }

    @Override // S0.b
    public final float j0(float f6) {
        return this.i.j0(f6);
    }

    @Override // S0.b
    public final float n() {
        return this.i.n();
    }

    @Override // p113v0.InterfaceC1030m
    public final boolean s() {
        return this.i.s();
    }

    @Override // S0.b
    public final long v(float f6) {
        return this.i.v(f6);
    }

    @Override // S0.b
    public final long w(long j4) {
        return this.i.w(j4);
    }

    @Override // S0.b
    public final float y(float f6) {
        return this.i.y(f6);
    }
}
