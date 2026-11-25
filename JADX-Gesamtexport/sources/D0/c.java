package D0;

import P4.InterfaceC0335w;
import S1.V;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import p035g0.H;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScrollCaptureSession f720n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Rect f721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Consumer f722p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, p111u4.d dVar) {
        super(2, dVar);
        this.f719m = gVar;
        this.f720n = scrollCaptureSession;
        this.f721o = rect;
        this.f722p = consumer;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new c(this.f719m, this.f720n, this.f721o, this.f722p, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((c) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f718l;
        if (i == 0) {
            V.O(obj);
            ScrollCaptureSession scrollCaptureSession = this.f720n;
            Rect rect = this.f721o;
            S0.i iVar = new S0.i(rect.left, rect.top, rect.right, rect.bottom);
            this.f718l = 1;
            obj = g.a(this.f719m, scrollCaptureSession, iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        this.f722p.accept(H.s((S0.i) obj));
        return x.f10867a;
    }
}
