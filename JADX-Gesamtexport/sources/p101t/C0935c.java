package p101t;

import D4.e;
import E4.s;
import N.C0237s;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import S1.V;
import Z.n;
import android.view.ViewGroup;
import android.view.ViewParent;
import p013c0.c;
import p084p4.x;
import p111u4.d;
import p112v.C0967a;
import p112v.C0972c0;
import p117w.m;
import p117w.o;
import p122w4.i;
import p124x0.AbstractC1098f;
import p124x0.AbstractC1105m;
import p124x0.D;
import p124x0.n0;
import p124x0.p0;
import v4.a;

/* JADX INFO: renamed from: t.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0935c extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o f12295l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12296m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0942j f12297n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f12298o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f12299p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0935c(AbstractC0942j abstractC0942j, long j4, m mVar, d dVar) {
        super(2, dVar);
        this.f12297n = abstractC0942j;
        this.f12298o = j4;
        this.f12299p = mVar;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new C0935c(this.f12297n, this.f12298o, this.f12299p, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0935c) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0111  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [P.d] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [P.d] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v6 */
    @Override // p122w4.a
    public final Object o(Object obj) {
        boolean z5;
        boolean z6;
        C0237s c0237s;
        ?? dVar;
        ?? E5;
        int i;
        o oVar;
        a aVar = a.f13292h;
        int i3 = this.f12296m;
        AbstractC0942j abstractC0942j = this.f12297n;
        if (i3 != 0) {
            if (i3 == 1) {
                V.O(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar = this.f12295l;
                V.O(obj);
            }
            abstractC0942j.G = oVar;
            return x.f10867a;
        }
        V.O(obj);
        abstractC0942j.getClass();
        s sVar = new s();
        C0967a c0967a = C0972c0.f12965v;
        c cVar = new c(sVar, 2);
        n nVar = abstractC0942j.f5958h;
        if (!nVar.f5969t) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n nVar2 = nVar.f5961l;
        D dS = AbstractC1098f.s(abstractC0942j);
        loop0: while (dS != null) {
            int i6 = 262144;
            if ((((n) dS.f13828C.f3796f).f5960k & 262144) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f5959j & i6) != 0) {
                        ?? r11 = nVar2;
                        ?? r14 = 0;
                        while (r11 != 0) {
                            if (r11 instanceof p0) {
                                p0 p0Var = (p0) r11;
                                if (!(c0967a.equals(p0Var.o()) ? ((Boolean) cVar.invoke(p0Var)).booleanValue() : true)) {
                                    break loop0;
                                }
                            } else {
                                if (((r11.f5959j & i6) != 0) && (r11 instanceof AbstractC1105m)) {
                                    n nVar3 = ((AbstractC1105m) r11).f14046v;
                                    int i7 = 0;
                                    E5 = r11;
                                    dVar = r14;
                                    while (nVar3 != null) {
                                        int i8 = i6;
                                        if ((nVar3.f5959j & i8) != 0) {
                                            i7++;
                                            dVar = dVar;
                                            if (i7 == 1) {
                                                E5 = nVar3;
                                            } else {
                                                if (dVar == 0) {
                                                    dVar = new P.d(new n[16]);
                                                }
                                                if (E5 != 0) {
                                                    dVar.c(E5);
                                                    E5 = 0;
                                                }
                                                dVar.c(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f5962m;
                                        i6 = i8;
                                        E5 = E5;
                                        dVar = dVar;
                                    }
                                    i = i6;
                                    dVar = dVar;
                                    if (i7 == 1) {
                                    }
                                    i6 = i;
                                    r11 = E5;
                                    r14 = dVar;
                                }
                                E5 = AbstractC1098f.e(dVar);
                                i6 = i;
                                r11 = E5;
                                r14 = dVar;
                            }
                            i = i6;
                            dVar = r14;
                            E5 = AbstractC1098f.e(dVar);
                            i6 = i;
                            r11 = E5;
                            r14 = dVar;
                        }
                    }
                    nVar2 = nVar2.f5961l;
                    i6 = i6;
                }
            }
            dS = dS.r();
            nVar2 = (dS == null || (c0237s = dS.f13828C) == null) ? null : (n0) c0237s.f3795e;
        }
        if (sVar.f1070h) {
            z5 = true;
        } else {
            int i9 = AbstractC0955x.f12440b;
            ViewParent parent = AbstractC1098f.v(abstractC0942j).getParent();
            while (true) {
                if (parent == null || !(parent instanceof ViewGroup)) {
                    z6 = false;
                    break;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.shouldDelayChildPressedState()) {
                    z6 = true;
                    break;
                }
                parent = viewGroup.getParent();
            }
            if (z6) {
                z5 = true;
            } else {
                z5 = false;
            }
        }
        if (z5) {
            long j4 = AbstractC0955x.f12439a;
            this.f12296m = 1;
            if (AbstractC0336x.e(j4, this) != aVar) {
            }
        }
        return aVar;
        o oVar2 = new o(this.f12298o);
        this.f12295l = oVar2;
        this.f12296m = 2;
        if (this.f12299p.a(oVar2, this) != aVar) {
            oVar = oVar2;
            abstractC0942j.G = oVar;
            return x.f10867a;
        }
        return aVar;
    }
}
