package p130y0;

import D4.c;
import E4.k;
import E4.l;
import P4.InterfaceC0335w;
import V0.w;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import p024e0.b;
import p024e0.g;
import p030f0.d;
import p035g0.H;
import p081p0.a;
import p084p4.x;

/* JADX INFO: renamed from: y0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1145n extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14430h;
    public final /* synthetic */ r i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1145n(r rVar, int i) {
        super(1);
        this.f14430h = i;
        this.i = rVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        b bVar;
        switch (this.f14430h) {
            case 0:
                KeyEvent keyEvent = ((p081p0.b) obj).f10828a;
                r rVar = this.i;
                rVar.getClass();
                long jK0 = p081p0.c.k0(keyEvent);
                if (a.a(jK0, a.f10821h)) {
                    bVar = new b(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (a.a(jK0, a.f10819f)) {
                    bVar = new b(4);
                } else if (a.a(jK0, a.f10818e)) {
                    bVar = new b(3);
                } else {
                    if (a.a(jK0, a.f10816c) ? true : a.a(jK0, a.f10823k)) {
                        bVar = new b(5);
                    } else {
                        if (a.a(jK0, a.f10817d) ? true : a.a(jK0, a.f10824l)) {
                            bVar = new b(6);
                        } else {
                            if (a.a(jK0, a.f10820g) ? true : a.a(jK0, a.i) ? true : a.a(jK0, a.f10825m)) {
                                bVar = new b(7);
                            } else {
                                bVar = a.a(jK0, a.f10815b) ? true : a.a(jK0, a.f10822j) ? new b(8) : null;
                            }
                        }
                    }
                }
                if (bVar != null) {
                    if (p081p0.c.o0(keyEvent) == 2) {
                        d dVarT = rVar.t();
                        g focusOwner = rVar.getFocusOwner();
                        C1141l c1141l = new C1141l(bVar, 5);
                        int i = bVar.f8640a;
                        Boolean boolC = ((androidx.compose.ui.focus.b) focusOwner).c(i, dVarT, c1141l);
                        if (boolC != null ? boolC.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i == 1 || i == 2)) {
                            return Boolean.FALSE;
                        }
                        Integer numH = p024e0.d.H(i);
                        if (numH == null) {
                            throw new IllegalStateException("Invalid focus direction");
                        }
                        int iIntValue = numH.intValue();
                        Rect rectT = dVarT != null ? H.t(dVarT) : null;
                        if (rectT == null) {
                            throw new IllegalStateException("Invalid rect");
                        }
                        View viewFindNextFocus = rVar;
                        while (true) {
                            if (viewFindNextFocus != null) {
                                FocusFinder focusFinder = FocusFinder.getInstance();
                                View rootView = rVar.getRootView();
                                k.d("null cannot be cast to non-null type android.view.ViewGroup", rootView);
                                viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, iIntValue);
                                if (viewFindNextFocus != null) {
                                    if (!viewFindNextFocus.equals(rVar)) {
                                        ViewParent parent = viewFindNextFocus.getParent();
                                        while (true) {
                                            if (parent != null) {
                                                if (parent != rVar) {
                                                    parent = parent.getParent();
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                viewFindNextFocus = null;
                            }
                        }
                        if (k.a(viewFindNextFocus, rVar)) {
                            viewFindNextFocus = null;
                        }
                        if ((viewFindNextFocus == null || !p024e0.d.D(viewFindNextFocus, Integer.valueOf(iIntValue), rectT)) && ((androidx.compose.ui.focus.b) rVar.getFocusOwner()).a(i, false, false)) {
                            Boolean boolC2 = ((androidx.compose.ui.focus.b) rVar.getFocusOwner()).c(i, null, new C1141l(bVar, 4));
                            return Boolean.valueOf(boolC2 != null ? boolC2.booleanValue() : true);
                        }
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            case 1:
                D4.a aVar = (D4.a) obj;
                r rVar2 = this.i;
                Handler handler = rVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = rVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new w(aVar, 1));
                    }
                }
                return x.f10867a;
            default:
                r rVar3 = this.i;
                return new N(rVar3, rVar3.getTextInputService(), (InterfaceC0335w) obj);
        }
    }
}
