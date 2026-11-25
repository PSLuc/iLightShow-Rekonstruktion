package p130y0;

import D.D;
import M0.x;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import S1.V;
import Z.r;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import p090r.C0870i;
import p111u4.i;
import p122w4.c;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class N implements InterfaceC0335w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f14274h;
    public final x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC0335w f14275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f14276k = new AtomicReference(null);

    public N(View view, x xVar, InterfaceC0335w interfaceC0335w) {
        this.f14274h = view;
        this.i = xVar;
        this.f14275j = interfaceC0335w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(D d6, c cVar) {
        L l6;
        if (cVar instanceof L) {
            l6 = (L) cVar;
            int i = l6.f14269m;
            if ((i & Integer.MIN_VALUE) != 0) {
                l6.f14269m = i - Integer.MIN_VALUE;
            } else {
                l6 = new L(this, cVar);
            }
        } else {
            l6 = new L(this, cVar);
        }
        Object obj = l6.f14267k;
        a aVar = a.f13292h;
        int i3 = l6.f14269m;
        if (i3 == 0) {
            V.O(obj);
            AtomicReference atomicReference = this.f14276k;
            C0870i c0870i = new C0870i(d6, 18, this);
            M m6 = new M(this, null);
            l6.f14269m = 1;
            if (AbstractC0336x.d(new r(c0870i, atomicReference, m6, null), l6) == aVar) {
                return;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // P4.InterfaceC0335w
    public final i d() {
        return this.f14275j.d();
    }
}
