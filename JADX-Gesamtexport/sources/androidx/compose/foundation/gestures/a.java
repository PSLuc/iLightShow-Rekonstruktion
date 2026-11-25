package androidx.compose.foundation.gestures;

import E4.t;
import S1.V;
import Z.o;
import p101t.m0;
import p112v.C0974d0;
import p112v.C0976e0;
import p112v.C0978f0;
import p112v.C0980g0;
import p112v.C0982h0;
import p112v.C1017z0;
import p112v.InterfaceC1003s0;
import p112v.W;
import p117w.m;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0976e0 f6605a = new C0976e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0974d0 f6606b = new C0974d0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0978f0 f6607c = new C0978f0();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(C1017z0 c1017z0, long j4, c cVar) {
        C0980g0 c0980g0;
        t tVar;
        C1017z0 c1017z1;
        if (cVar instanceof C0980g0) {
            c0980g0 = (C0980g0) cVar;
            int i = c0980g0.f12977n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0980g0.f12977n = i - Integer.MIN_VALUE;
            } else {
                c0980g0 = new C0980g0(cVar);
            }
        } else {
            c0980g0 = new C0980g0(cVar);
        }
        Object obj = c0980g0.f12976m;
        v4.a aVar = v4.a.f13292h;
        int i3 = c0980g0.f12977n;
        if (i3 == 0) {
            V.O(obj);
            tVar = new t();
            C0982h0 c0982h0 = new C0982h0(c1017z0, j4, tVar, null);
            c0980g0.f12974k = c1017z0;
            c0980g0.f12975l = tVar;
            c0980g0.f12977n = 1;
            if (c1017z0.e(1, c0982h0, c0980g0) == aVar) {
                return aVar;
            }
            c1017z1 = c1017z0;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t tVar2 = c0980g0.f12975l;
            C1017z0 c1017z2 = c0980g0.f12974k;
            V.O(obj);
            tVar = tVar2;
            c1017z1 = c1017z2;
        }
        return new p030f0.c(c1017z1.g(tVar.f1071h));
    }

    public static final o b(o oVar, InterfaceC1003s0 interfaceC1003s0, W w6, m0 m0Var, boolean z5, boolean z6, m mVar) {
        return oVar.k(new ScrollableElement(m0Var, w6, interfaceC1003s0, mVar, z5, z6));
    }
}
