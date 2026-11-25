package p129y;

import D4.a;
import D4.e;
import E4.l;
import P4.C0319f;
import P4.InterfaceC0335w;
import S1.V;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import p015c2.AbstractC0473d;
import p084p4.x;
import p090r.C0870i;
import p091r0.h;
import p111u4.d;
import p112v.C0981h;
import p112v.C0987k;
import p122w4.i;
import p124x0.Y;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f14160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y f14161n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f14162o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(i iVar, Y y2, a aVar, d dVar) {
        super(2, dVar);
        this.f14160m = iVar;
        this.f14161n = y2;
        this.f14162o = (l) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [D4.a, E4.l] */
    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new f(this.f14160m, this.f14161n, this.f14162o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((f) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Type inference failed for: r6v0, types: [D4.a, E4.l] */
    @Override // p122w4.a
    public final Object o(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objT;
        v4.a aVar = v4.a.f13292h;
        int i = this.f14159l;
        x xVar = x.f10867a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            return xVar;
        }
        V.O(obj);
        i iVar = this.f14160m;
        C0987k c0987k = iVar.f14172u;
        e eVar = new e(iVar, this.f14161n, this.f14162o);
        this.f14159l = 1;
        c0987k.getClass();
        p030f0.d dVar = (p030f0.d) eVar.invoke();
        if (dVar == null || c0987k.A0(dVar, c0987k.f13005B)) {
            objT = xVar;
        } else {
            C0319f c0319f = new C0319f(1, AbstractC0473d.F(this));
            c0319f.u();
            C0981h c0981h = new C0981h(eVar, c0319f);
            h hVar = c0987k.f13010x;
            hVar.getClass();
            p030f0.d dVar2 = (p030f0.d) eVar.invoke();
            if (dVar2 == null) {
                c0319f.g(xVar);
            } else {
                c0319f.w(new C0870i(hVar, 10, c0981h));
                P.d dVar3 = hVar.f11493a;
                int i3 = new J4.d(0, dVar3.f4583j - 1, 1).i;
                if (i3 < 0) {
                    dVar3.a(0, c0981h);
                    break;
                }
                while (true) {
                    p030f0.d dVar4 = (p030f0.d) ((C0981h) dVar3.f4582h[i3]).f12978a.invoke();
                    if (dVar4 != null) {
                        p030f0.d dVarD = dVar2.d(dVar4);
                        if (!dVarD.equals(dVar2)) {
                            if (!dVarD.equals(dVar4)) {
                                CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                int i6 = dVar3.f4583j - 1;
                                if (i6 <= i3) {
                                    while (true) {
                                        ((C0981h) dVar3.f4582h[i3]).f12979b.i(cancellationException);
                                        if (i6 == i3) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        } else {
                            dVar3.a(i3 + 1, c0981h);
                            break;
                        }
                    }
                    if (i3 == 0) {
                        dVar3.a(0, c0981h);
                        break;
                    }
                    i3--;
                }
                if (!c0987k.f13006C) {
                    c0987k.B0();
                }
            }
            objT = c0319f.t();
            if (objT != v4.a.f13292h) {
                objT = xVar;
            }
        }
        return objT == aVar ? aVar : xVar;
    }
}
