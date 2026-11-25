package p130y0;

import D4.e;
import N.C0238s0;
import N.C0248x0;
import P4.InterfaceC0335w;
import S1.V;
import S4.F;
import android.view.View;
import com.nanjoran.ilightshow.R;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0248x0 f14284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f14285n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(C0248x0 c0248x0, View view, d dVar) {
        super(2, dVar);
        this.f14284m = c0248x0;
        this.f14285n = view;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new P0(this.f14284m, this.f14285n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((P0) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f14283l;
        x xVar = x.f10867a;
        C0248x0 c0248x0 = this.f14284m;
        View view = this.f14285n;
        try {
            if (i == 0) {
                V.O(obj);
                this.f14283l = 1;
                Object objH = F.h(c0248x0.f3870r, new C0238s0(2, null), this);
                if (objH != aVar) {
                    objH = xVar;
                }
                if (objH == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V.O(obj);
            }
            if (X0.b(view) == c0248x0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return xVar;
        } catch (Throwable th) {
            if (X0.b(view) == c0248x0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            throw th;
        }
    }
}
