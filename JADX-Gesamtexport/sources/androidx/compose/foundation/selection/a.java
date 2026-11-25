package androidx.compose.foundation.selection;

import D4.f;
import E0.e;
import E4.l;
import N.C0222k;
import N.C0230o;
import Z.o;
import androidx.compose.foundation.d;
import p101t.X;
import p117w.m;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ X f6652h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f6653j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e f6654k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D4.a f6655l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(X x6, boolean z5, boolean z6, e eVar, D4.a aVar) {
        super(3);
        this.f6652h = x6;
        this.i = z5;
        this.f6653j = z6;
        this.f6654k = eVar;
        this.f6655l = aVar;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        C0230o c0230o = (C0230o) obj2;
        ((Number) obj3).intValue();
        c0230o.V(-1525724089);
        Object objK = c0230o.K();
        if (objK == C0222k.f3714a) {
            objK = new m();
            c0230o.f0(objK);
        }
        m mVar = (m) objK;
        o oVarK = d.a(Z.l.f5957a, mVar, this.f6652h).k(new SelectableElement(this.i, mVar, null, this.f6653j, this.f6654k, this.f6655l));
        c0230o.p(false);
        return oVarK;
    }
}
