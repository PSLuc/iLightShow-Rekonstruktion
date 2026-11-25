package p112v;

import B.C0031p0;
import S0.o;
import S1.V;
import androidx.compose.foundation.gestures.a;
import c5.C0495p;
import p030f0.c;
import p084p4.x;
import p086q0.e;
import p090r.v;
import p101t.m0;
import p124x0.AbstractC1098f;

/* JADX INFO: renamed from: v.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1017z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC1003s0 f13104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0 f13105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0495p f13106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public W f13107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0031p0 f13109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13110g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC0970b0 f13111h = a.f6605a;
    public final C1011w0 i = new C1011w0(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v f13112j = new v(9, this);

    public C1017z0(InterfaceC1003s0 interfaceC1003s0, m0 m0Var, C0495p c0495p, W w6, boolean z5, C0031p0 c0031p0) {
        this.f13104a = interfaceC1003s0;
        this.f13105b = m0Var;
        this.f13106c = c0495p;
        this.f13107d = w6;
        this.f13108e = z5;
        this.f13109f = c0031p0;
    }

    public static final long a(C1017z0 c1017z0, InterfaceC0970b0 interfaceC0970b0, long j4, int i) {
        e eVar = (e) c1017z0.f13109f.i;
        e eVar2 = null;
        e eVar3 = (eVar == null || !eVar.f5969t) ? null : (e) AbstractC1098f.j(eVar);
        long jC0 = eVar3 != null ? eVar3.C0(i, j4) : 0L;
        long jG = c.g(j4, jC0);
        long jD = c1017z0.d(c1017z0.g(interfaceC0970b0.a(c1017z0.f(c1017z0.d(c.a(jG, 0.0f, c1017z0.f13107d == W.i ? 1 : 2))))));
        long jG2 = c.g(jG, jD);
        e eVar4 = (e) c1017z0.f13109f.i;
        if (eVar4 != null && eVar4.f5969t) {
            eVar2 = (e) AbstractC1098f.j(eVar4);
        }
        e eVar5 = eVar2;
        return c.h(c.h(jC0, jD), eVar5 != null ? eVar5.A0(jD, jG2, i) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j4, p122w4.c cVar) {
        C1005t0 c1005t0;
        E4.v vVar;
        if (cVar instanceof C1005t0) {
            c1005t0 = (C1005t0) cVar;
            int i = c1005t0.f13067n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1005t0.f13067n = i - Integer.MIN_VALUE;
            } else {
                c1005t0 = new C1005t0(this, cVar);
            }
        } else {
            c1005t0 = new C1005t0(this, cVar);
        }
        Object obj = c1005t0.f13065l;
        Object obj2 = v4.a.f13292h;
        int i3 = c1005t0.f13067n;
        if (i3 == 0) {
            V.O(obj);
            E4.v vVar2 = new E4.v();
            vVar2.f1073h = j4;
            D4.e c1009v0 = new C1009v0(this, vVar2, j4, null);
            c1005t0.f13064k = vVar2;
            c1005t0.f13067n = 1;
            if (e(1, c1009v0, c1005t0) == obj2) {
                return obj2;
            }
            vVar = vVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = c1005t0.f13064k;
            V.O(obj);
        }
        return new o(vVar.f1073h);
    }

    public final float c(float f6) {
        return this.f13108e ? f6 * (-1) : f6;
    }

    public final long d(long j4) {
        return this.f13108e ? c.i(-1.0f, j4) : j4;
    }

    public final Object e(int i, D4.e eVar, p122w4.c cVar) {
        Object objB = this.f13104a.b(i, new C1015y0(this, eVar, null), cVar);
        return objB == v4.a.f13292h ? objB : x.f10867a;
    }

    public final float f(long j4) {
        return this.f13107d == W.i ? c.d(j4) : c.e(j4);
    }

    public final long g(float f6) {
        if (f6 == 0.0f) {
            return 0L;
        }
        return this.f13107d == W.i ? p081p0.c.y(f6, 0.0f) : p081p0.c.y(0.0f, f6);
    }
}
