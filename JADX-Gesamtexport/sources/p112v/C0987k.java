package p112v;

import E4.k;
import P4.AbstractC0336x;
import S0.j;
import S1.h0;
import Z.n;
import kotlin.NoWhenBranchMatchedException;
import p015c2.AbstractC0473d;
import p030f0.c;
import p030f0.d;
import p030f0.f;
import p091r0.h;
import p113v0.InterfaceC1033p;
import p124x0.AbstractC1098f;
import p124x0.InterfaceC1103k;
import p124x0.InterfaceC1113v;
import p124x0.Y;

/* JADX INFO: renamed from: v.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0987k extends n implements InterfaceC1113v, InterfaceC1103k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f13004A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f13006C;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public W f13007u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1017z0 f13008v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13009w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public InterfaceC1033p f13011y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d f13012z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h f13010x = new h(1);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f13005B = 0;

    public C0987k(W w6, C1017z0 c1017z0, boolean z5) {
        this.f13007u = w6;
        this.f13008v = c1017z0;
        this.f13009w = z5;
    }

    public static final float y0(C0987k c0987k, InterfaceC0973d interfaceC0973d) {
        d dVar;
        int iCompare;
        if (j.a(c0987k.f13005B, 0L)) {
            return 0.0f;
        }
        P.d dVar2 = c0987k.f13010x.f11493a;
        int i = dVar2.f4583j;
        if (i > 0) {
            int i3 = i - 1;
            Object[] objArr = dVar2.f4582h;
            dVar = null;
            do {
                d dVar3 = (d) ((C0981h) objArr[i3]).f12978a.invoke();
                if (dVar3 != null) {
                    long jF = h0.f(dVar3.c(), dVar3.b());
                    long jU = AbstractC0473d.U(c0987k.f13005B);
                    int iOrdinal = c0987k.f13007u.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(f.b(jF), f.b(jU));
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iCompare = Float.compare(f.d(jF), f.d(jU));
                    }
                    if (iCompare > 0) {
                        if (dVar != null) {
                            break;
                        }
                        dVar = dVar3;
                        break;
                    }
                    dVar = dVar3;
                    i3--;
                } else {
                    i3--;
                }
            } while (i3 >= 0);
        } else {
            dVar = null;
        }
        if (dVar == null) {
            d dVarZ0 = c0987k.f13004A ? c0987k.z0() : null;
            if (dVarZ0 == null) {
                return 0.0f;
            }
            dVar = dVarZ0;
        }
        long jU2 = AbstractC0473d.U(c0987k.f13005B);
        int iOrdinal2 = c0987k.f13007u.ordinal();
        if (iOrdinal2 == 0) {
            float f6 = dVar.f8842d;
            float f7 = dVar.f8840b;
            return interfaceC0973d.a(f7, f6 - f7, f.b(jU2));
        }
        if (iOrdinal2 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        float f8 = dVar.f8841c;
        float f9 = dVar.f8839a;
        return interfaceC0973d.a(f9, f8 - f9, f.d(jU2));
    }

    public final boolean A0(d dVar, long j4) {
        long jC0 = C0(dVar, j4);
        return Math.abs(c.d(jC0)) <= 0.5f && Math.abs(c.e(jC0)) <= 0.5f;
    }

    public final void B0() {
        InterfaceC0973d interfaceC0973d = (InterfaceC0973d) AbstractC1098f.h(this, AbstractC0979g.f12972a);
        if (this.f13006C) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        AbstractC0336x.o(n0(), null, new C0985j(this, new b1(interfaceC0973d.b()), interfaceC0973d, null), 1);
    }

    public final long C0(d dVar, long j4) {
        long jU = AbstractC0473d.U(j4);
        int iOrdinal = this.f13007u.ordinal();
        if (iOrdinal == 0) {
            InterfaceC0973d interfaceC0973d = (InterfaceC0973d) AbstractC1098f.h(this, AbstractC0979g.f12972a);
            float f6 = dVar.f8842d;
            float f7 = dVar.f8840b;
            return p081p0.c.y(0.0f, interfaceC0973d.a(f7, f6 - f7, f.b(jU)));
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC0973d interfaceC0973d2 = (InterfaceC0973d) AbstractC1098f.h(this, AbstractC0979g.f12972a);
        float f8 = dVar.f8841c;
        float f9 = dVar.f8839a;
        return p081p0.c.y(interfaceC0973d2.a(f9, f8 - f9, f.d(jU)), 0.0f);
    }

    @Override // Z.n
    public final boolean o0() {
        return false;
    }

    @Override // p124x0.InterfaceC1113v
    public final void r(long j4) {
        int iH;
        d dVarZ0;
        long j6 = this.f13005B;
        this.f13005B = j4;
        int iOrdinal = this.f13007u.ordinal();
        if (iOrdinal == 0) {
            iH = k.h((int) (j4 & 4294967295L), (int) (4294967295L & j6));
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            iH = k.h((int) (j4 >> 32), (int) (j6 >> 32));
        }
        if (iH < 0 && (dVarZ0 = z0()) != null) {
            d dVar = this.f13012z;
            if (dVar == null) {
                dVar = dVarZ0;
            }
            if (!this.f13006C && !this.f13004A && A0(dVar, j6) && !A0(dVarZ0, j4)) {
                this.f13004A = true;
                B0();
            }
            this.f13012z = dVarZ0;
        }
    }

    public final d z0() {
        if (this.f5969t) {
            Y yR = AbstractC1098f.r(this);
            InterfaceC1033p interfaceC1033p = this.f13011y;
            if (interfaceC1033p != null) {
                if (!interfaceC1033p.K()) {
                    interfaceC1033p = null;
                }
                if (interfaceC1033p != null) {
                    return yR.o(interfaceC1033p, false);
                }
            }
        }
        return null;
    }
}
