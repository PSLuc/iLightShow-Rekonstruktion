package p130y0;

import E4.k;
import android.view.PointerIcon;
import android.view.View;
import p091r0.C0879a;
import p091r0.m;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f14216a = new F();

    public final void a(View view, m mVar) {
        PointerIcon systemIcon = mVar instanceof C0879a ? PointerIcon.getSystemIcon(view.getContext(), ((C0879a) mVar).f11469b) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (k.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
