package B;

import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import S4.InterfaceC0369f;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import p124x0.AbstractC1098f;

/* JADX INFO: renamed from: B.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0047y implements InterfaceC0369f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f469h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f472l;

    public /* synthetic */ C0047y(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f469h = i;
        this.i = obj;
        this.f470j = obj2;
        this.f471k = obj3;
        this.f472l = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    @Override // S4.InterfaceC0369f
    public final Object m(Object obj, p111u4.d dVar) {
        T4.k kVar;
        switch (this.f469h) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C0036s0 c0036s0 = (C0036s0) this.i;
                if (zBooleanValue && c0036s0.b()) {
                    F.P p6 = (F.P) this.f471k;
                    AbstractC0029o0.m((M0.x) this.f470j, c0036s0, p6.j(), (M0.m) this.f472l, p6.f1121b);
                } else {
                    AbstractC0029o0.i(c0036s0);
                }
                return p084p4.x.f10867a;
            case 1:
                if (dVar instanceof T4.k) {
                    kVar = (T4.k) dVar;
                    int i = kVar.f5280o;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kVar.f5280o = i - Integer.MIN_VALUE;
                    } else {
                        kVar = new T4.k(this, dVar);
                    }
                } else {
                    kVar = new T4.k(this, dVar);
                }
                Object obj2 = kVar.f5278m;
                v4.a aVar = v4.a.f13292h;
                int i3 = kVar.f5280o;
                if (i3 == 0) {
                    S1.V.O(obj2);
                    P4.T t6 = (P4.T) ((E4.w) this.i).f1074h;
                    if (t6 != null) {
                        t6.c(new ChildCancelledException());
                        kVar.f5276k = this;
                        kVar.f5277l = obj;
                        kVar.f5280o = 1;
                        if (t6.M(kVar) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = kVar.f5277l;
                    this = kVar.f5276k;
                    S1.V.O(obj2);
                }
                ((E4.w) this.i).f1074h = AbstractC0336x.o((InterfaceC0335w) this.f470j, null, new T4.j((T4.m) this.f471k, (InterfaceC0369f) this.f472l, obj, null), 1);
                return p084p4.x.f10867a;
            default:
                p117w.l lVar = (p117w.l) obj;
                boolean z5 = lVar instanceof p117w.o;
                E4.u uVar = (E4.u) this.f471k;
                E4.u uVar2 = (E4.u) this.f470j;
                E4.u uVar3 = (E4.u) this.i;
                boolean z6 = true;
                if (z5) {
                    uVar3.f1072h++;
                } else if ((lVar instanceof p117w.p) || (lVar instanceof p117w.n)) {
                    uVar3.f1072h--;
                } else if (lVar instanceof p117w.i) {
                    uVar2.f1072h++;
                } else if (lVar instanceof p117w.j) {
                    uVar2.f1072h--;
                } else if (lVar instanceof p117w.e) {
                    uVar.f1072h++;
                } else if (lVar instanceof p117w.f) {
                    uVar.f1072h--;
                }
                boolean z7 = false;
                boolean z8 = uVar3.f1072h > 0;
                boolean z9 = uVar2.f1072h > 0;
                boolean z10 = uVar.f1072h > 0;
                p101t.C c6 = (p101t.C) this.f472l;
                if (c6.f12224v != z8) {
                    c6.f12224v = z8;
                    z7 = true;
                }
                if (c6.f12225w != z9) {
                    c6.f12225w = z9;
                    z7 = true;
                }
                if (c6.f12226x != z10) {
                    c6.f12226x = z10;
                } else {
                    z6 = z7;
                }
                if (z6) {
                    AbstractC1098f.l(c6);
                }
                return p084p4.x.f10867a;
        }
    }
}
