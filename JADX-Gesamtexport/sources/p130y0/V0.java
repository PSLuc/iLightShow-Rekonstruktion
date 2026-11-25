package p130y0;

import E4.w;
import N.C0221j0;
import N.C0248x0;
import N.P;
import P4.AbstractC0336x;
import P4.C0319f;
import P4.InterfaceC0318e;
import U4.d;
import android.view.View;
import androidx.lifecycle.EnumC0453m;
import androidx.lifecycle.InterfaceC0457q;
import androidx.lifecycle.InterfaceC0458s;
import java.util.ArrayList;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class V0 implements InterfaceC0457q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f14315h;
    public final /* synthetic */ C0221j0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0248x0 f14316j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w f14317k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f14318l;

    public V0(d dVar, C0221j0 c0221j0, C0248x0 c0248x0, w wVar, View view) {
        this.f14315h = dVar;
        this.i = c0221j0;
        this.f14316j = c0248x0;
        this.f14317k = wVar;
        this.f14318l = view;
    }

    @Override // androidx.lifecycle.InterfaceC0457q
    public final void c(InterfaceC0458s interfaceC0458s, EnumC0453m enumC0453m) {
        boolean z5;
        int i = S0.f14301a[enumC0453m.ordinal()];
        InterfaceC0318e interfaceC0318eT = null;
        if (i == 1) {
            AbstractC0336x.o(this.f14315h, null, new U0(this.f14317k, this.f14316j, interfaceC0458s, this, this.f14318l, null), 1);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                this.f14316j.s();
                return;
            } else {
                C0248x0 c0248x0 = this.f14316j;
                synchronized (c0248x0.f3855b) {
                    c0248x0.f3869q = true;
                }
                return;
            }
        }
        C0221j0 c0221j0 = this.i;
        if (c0221j0 != null) {
            P p6 = (P) c0221j0.f3713j;
            synchronized (p6.f3648c) {
                try {
                    synchronized (p6.f3648c) {
                        z5 = p6.f3646a;
                    }
                    if (!z5) {
                        ArrayList arrayList = (ArrayList) p6.f3647b;
                        p6.f3647b = (ArrayList) p6.f3649d;
                        p6.f3649d = arrayList;
                        p6.f3646a = true;
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            ((p111u4.d) arrayList.get(i3)).g(x.f10867a);
                        }
                        arrayList.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0248x0 c0248x1 = this.f14316j;
        synchronized (c0248x1.f3855b) {
            if (c0248x1.f3869q) {
                c0248x1.f3869q = false;
                interfaceC0318eT = c0248x1.t();
            }
        }
        if (interfaceC0318eT != null) {
            ((C0319f) interfaceC0318eT).g(x.f10867a);
        }
    }
}
