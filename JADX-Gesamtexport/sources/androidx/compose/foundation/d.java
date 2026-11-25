package androidx.compose.foundation;

import B.S0;
import N.W0;
import Z.o;
import p101t.D;
import p101t.X;
import p101t.Z;
import p117w.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W0 f6589a = new W0(Z.i);

    public static final o a(o oVar, m mVar, X x6) {
        if (x6 == null) {
            return oVar;
        }
        return x6 instanceof D ? oVar.k(new IndicationModifierElement(mVar, (D) x6)) : Z.a.a(oVar, new S0(x6, 4, mVar));
    }
}
