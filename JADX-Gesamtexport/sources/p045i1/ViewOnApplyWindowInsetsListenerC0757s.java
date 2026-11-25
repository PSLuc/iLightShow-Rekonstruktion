package p045i1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import p123x.F;

/* JADX INFO: renamed from: i1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0757s implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0 f9468a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f9469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0749j f9470c;

    public ViewOnApplyWindowInsetsListenerC0757s(View view, InterfaceC0749j interfaceC0749j) {
        this.f9469b = view;
        this.f9470c = interfaceC0749j;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        c0 c0VarB = c0.b(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0749j interfaceC0749j = this.f9470c;
        if (i < 30) {
            AbstractC0758t.a(windowInsets, this.f9469b);
            if (c0VarB.equals(this.f9468a)) {
                return ((F) interfaceC0749j).a(view, c0VarB).a();
            }
        }
        this.f9468a = c0VarB;
        c0 c0VarA = ((F) interfaceC0749j).a(view, c0VarB);
        if (i >= 30) {
            return c0VarA.a();
        }
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        r.c(view);
        return c0VarA.a();
    }
}
