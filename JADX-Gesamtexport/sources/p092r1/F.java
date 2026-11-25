package p092r1;

import D4.e;
import P4.AbstractC0336x;
import P4.C0325l;
import P4.InterfaceC0335w;
import R4.b;
import R4.g;
import R4.h;
import S1.V;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p035g0.C0715p;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class F extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J f11578n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f11579o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F(J j4, e eVar, d dVar) {
        super(2, dVar);
        this.f11578n = j4;
        this.f11579o = (i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [D4.e, w4.i] */
    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        F f6 = new F(this.f11578n, this.f11579o, dVar);
        f6.f11577m = obj;
        return f6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((F) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [D4.e, w4.i] */
    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        a aVar = a.f13292h;
        int i = this.f11576l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return obj;
        }
        V.O(obj);
        InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f11577m;
        C0325l c0325l = new C0325l(true);
        c0325l.O(null);
        J j4 = this.f11578n;
        L l6 = new L(this.f11579o, c0325l, j4.f11601h.q(), interfaceC0335w.d());
        H1.d dVar = j4.f11604l;
        Object objJ = ((b) dVar.f1758j).j(l6);
        if (objJ instanceof g) {
            g gVar = objJ != null ? (g) objJ : null;
            Throwable th = gVar != null ? gVar.f4846a : null;
            if (th == null) {
                throw new ClosedSendChannelException("Channel was closed normally");
            }
            throw th;
        }
        if (objJ instanceof h) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) ((C0715p) dVar.f1759k).i).getAndIncrement() == 0) {
            AbstractC0336x.o((InterfaceC0335w) dVar.i, null, new O(dVar, null), 3);
        }
        this.f11576l = 1;
        Object objD0 = c0325l.d0(this);
        return objD0 == aVar ? aVar : objD0;
    }
}
