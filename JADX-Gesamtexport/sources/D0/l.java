package D0;

import D4.c;
import N.C0208d;
import N.C0217h0;
import N.U;
import P4.AbstractC0336x;
import S1.V;
import S1.h0;
import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import java.util.Comparator;
import java.util.function.Consumer;
import p035g0.H;
import p124x0.Y;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0217h0 f751a = C0208d.K(Boolean.FALSE, U.f3673m);

    public final void a(View view, E0.m mVar, p111u4.i iVar, Consumer<ScrollCaptureTarget> consumer) {
        P.d dVar = new P.d(new m[16]);
        V.P(mVar.a(), 0, new k(dVar));
        final D4.c[] cVarArr = {e.f731j, e.f732k};
        dVar.r(new Comparator() { // from class: s4.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                for (c cVar : cVarArr) {
                    int iR = p027e3.a.R((Comparable) cVar.invoke(obj), (Comparable) cVar.invoke(obj2));
                    if (iR != 0) {
                        return iR;
                    }
                }
                return 0;
            }
        });
        m mVar2 = (m) (dVar.m() ? null : dVar.f4582h[dVar.f4583j - 1]);
        if (mVar2 == null) {
            return;
        }
        U4.d dVarA = AbstractC0336x.a(iVar);
        E0.l lVar = mVar2.f752a;
        S0.i iVar2 = mVar2.f754c;
        g gVar = new g(lVar, iVar2, dVarA, this);
        Y y2 = mVar2.f755d;
        p030f0.d dVarO = p113v0.U.f(y2).o(y2, true);
        long jC = h0.c(iVar2.f4892a, iVar2.f4893b);
        ScrollCaptureTarget scrollCaptureTargetD = a.d(view, H.s(p006b.a.A(dVarO)), new Point((int) (jC >> 32), (int) (jC & 4294967295L)), gVar);
        scrollCaptureTargetD.setScrollBounds(H.s(iVar2));
        consumer.accept(scrollCaptureTargetD);
    }
}
