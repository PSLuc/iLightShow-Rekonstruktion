package B;

import F1.C0096m;
import N.InterfaceC0203a0;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.InterfaceC0457q;
import java.util.Iterator;
import java.util.List;
import p045i1.AbstractC0758t;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;

/* JADX INFO: loaded from: classes.dex */
public final class N0 implements N.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f194c;

    public /* synthetic */ N0(Object obj, int i, Object obj2) {
        this.f192a = i;
        this.f193b = obj;
        this.f194c = obj2;
    }

    @Override // N.F
    public final void a() {
        Object obj = this.f194c;
        Object obj2 = this.f193b;
        switch (this.f192a) {
            case 0:
                InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) obj2;
                p117w.o oVar = (p117w.o) interfaceC0203a0.getValue();
                if (oVar != null) {
                    p117w.n nVar = new p117w.n(oVar);
                    p117w.m mVar = (p117w.m) obj;
                    if (mVar != null) {
                        mVar.b(nVar);
                    }
                    interfaceC0203a0.setValue(null);
                }
                break;
            case 1:
                ((f1) obj2).f318d.remove((D4.c) obj);
                break;
            case 2:
                ((C0096m) obj2).f1359o.f((G1.n) obj);
                break;
            case 3:
                Iterator it = ((List) ((N.V0) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((G1.i) obj).b().b((C0096m) it.next());
                }
                break;
            case 4:
                ((C0460u) obj2).f((InterfaceC0457q) obj);
                break;
            case 5:
                ((p096s.H) obj2).f11848a.o((p096s.E) obj);
                break;
            case 6:
                ((p096s.o0) obj2).f12064j.remove((p096s.o0) obj);
                break;
            case 7:
                p096s.o0 o0Var = (p096s.o0) obj2;
                o0Var.getClass();
                p096s.i0 i0Var = (p096s.i0) ((p096s.j0) obj).f12023b.getValue();
                if (i0Var != null) {
                    o0Var.i.remove(i0Var.f12011h);
                }
                break;
            case 8:
                ((p096s.o0) obj2).i.remove((p096s.m0) obj);
                break;
            case 9:
                p123x.b0 b0Var = (p123x.b0) obj2;
                int i = b0Var.f13754s - 1;
                b0Var.f13754s = i;
                if (i == 0) {
                    ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = p045i1.A.f9394a;
                    View view = (View) obj;
                    AbstractC0758t.u(view, null);
                    p045i1.A.c(view, null);
                    view.removeOnAttachStateChangeListener(b0Var.f13755t);
                }
                break;
            case 10:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((p130y0.J) obj);
                break;
            default:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((p130y0.K) obj);
                break;
        }
    }
}
