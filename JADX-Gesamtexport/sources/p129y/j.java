package p129y;

import D4.a;
import android.graphics.Rect;
import android.view.View;
import p030f0.d;
import p084p4.x;
import p122w4.c;
import p124x0.AbstractC1098f;
import p124x0.InterfaceC1104l;
import p124x0.Y;

/* JADX INFO: loaded from: classes.dex */
public final class j implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1104l f14174h;

    public j(InterfaceC1104l interfaceC1104l) {
        this.f14174h = interfaceC1104l;
    }

    @Override // p129y.a
    public final Object M(Y y2, a aVar, c cVar) {
        View viewV = AbstractC1098f.v(this.f14174h);
        long jQ = y2.Q(0L);
        d dVar = (d) aVar.invoke();
        d dVarH = dVar != null ? dVar.h(jQ) : null;
        if (dVarH != null) {
            viewV.requestRectangleOnScreen(new Rect((int) dVarH.f8839a, (int) dVarH.f8840b, (int) dVarH.f8841c, (int) dVarH.f8842d), false);
        }
        return x.f10867a;
    }
}
