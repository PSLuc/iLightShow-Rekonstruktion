package L;

import N.C0229n0;
import N.InterfaceC0203a0;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import S4.C0366c;
import S4.C0367d;
import S4.C0376m;
import S4.InterfaceC0369f;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class W implements InterfaceC0369f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2545h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f2546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f2547k;

    /* JADX WARN: Multi-variable type inference failed */
    public W(E4.s sVar, InterfaceC0369f interfaceC0369f, D4.e eVar) {
        this.f2545h = 2;
        this.i = sVar;
        this.f2546j = interfaceC0369f;
        this.f2547k = (p122w4.i) eVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v19, types: [D4.e, w4.i] */
    @Override // S4.InterfaceC0369f
    public final Object m(Object obj, p111u4.d dVar) {
        C0366c c0366c;
        C0376m c0376m;
        boolean zBooleanValue;
        switch (this.f2545h) {
            case 0:
                p117w.l lVar = (p117w.l) obj;
                boolean z5 = lVar instanceof p117w.i;
                ArrayList arrayList = (ArrayList) this.i;
                if (z5) {
                    arrayList.add(lVar);
                } else if (lVar instanceof p117w.j) {
                    arrayList.remove(((p117w.j) lVar).f13388a);
                } else if (lVar instanceof p117w.e) {
                    arrayList.add(lVar);
                } else if (lVar instanceof p117w.f) {
                    arrayList.remove(((p117w.f) lVar).f13382a);
                } else if (lVar instanceof p117w.o) {
                    arrayList.add(lVar);
                } else if (lVar instanceof p117w.p) {
                    arrayList.remove(((p117w.p) lVar).f13395a);
                } else if (lVar instanceof p117w.n) {
                    arrayList.remove(((p117w.n) lVar).f13393a);
                }
                AbstractC0336x.o((InterfaceC0335w) this.f2546j, null, new V((C0125b0) this.f2547k, (p117w.l) p089q4.l.h0(arrayList), null), 3);
                return p084p4.x.f10867a;
            case 1:
                if (dVar instanceof C0366c) {
                    c0366c = (C0366c) dVar;
                    int i = c0366c.f5070m;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0366c.f5070m = i - Integer.MIN_VALUE;
                    } else {
                        c0366c = new C0366c(this, dVar);
                    }
                } else {
                    c0366c = new C0366c(this, dVar);
                }
                Object obj2 = c0366c.f5068k;
                v4.a aVar = v4.a.f13292h;
                int i3 = c0366c.f5070m;
                p084p4.x xVar = p084p4.x.f10867a;
                if (i3 == 0) {
                    S1.V.O(obj2);
                    ((C0367d) this.i).getClass();
                    E4.w wVar = (E4.w) this.f2546j;
                    Object obj3 = wVar.f1074h;
                    if (obj3 == T4.b.f5258b || !E4.k.a(obj3, obj)) {
                        wVar.f1074h = obj;
                        c0366c.f5070m = 1;
                        if (((InterfaceC0369f) this.f2547k).m(obj, c0366c) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    S1.V.O(obj2);
                }
                return xVar;
            case 2:
                if (dVar instanceof C0376m) {
                    c0376m = (C0376m) dVar;
                    int i6 = c0376m.f5099o;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0376m.f5099o = i6 - Integer.MIN_VALUE;
                    } else {
                        c0376m = new C0376m(this, dVar);
                    }
                } else {
                    c0376m = new C0376m(this, dVar);
                }
                Object objD = c0376m.f5097m;
                v4.a aVar2 = v4.a.f13292h;
                int i7 = c0376m.f5099o;
                p084p4.x xVar2 = p084p4.x.f10867a;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            obj = c0376m.f5096l;
                            this = c0376m.f5095k;
                            S1.V.O(objD);
                            if (!((Boolean) objD).booleanValue()) {
                                ((E4.s) this.i).f1070h = true;
                                c0376m.f5095k = null;
                                c0376m.f5096l = null;
                                c0376m.f5099o = 3;
                                if (((InterfaceC0369f) this.f2546j).m(obj, c0376m) == aVar2) {
                                    return aVar2;
                                }
                            }
                        } else if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    S1.V.O(objD);
                } else {
                    S1.V.O(objD);
                    if (((E4.s) this.i).f1070h) {
                        c0376m.f5099o = 1;
                        if (((InterfaceC0369f) this.f2546j).m(obj, c0376m) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        c0376m.f5095k = this;
                        c0376m.f5096l = obj;
                        c0376m.f5099o = 2;
                        objD = ((p122w4.i) this.f2547k).d(obj, c0376m);
                        if (objD == aVar2) {
                            return aVar2;
                        }
                        if (!((Boolean) objD).booleanValue()) {
                            ((E4.s) this.i).f1070h = true;
                            c0376m.f5095k = null;
                            c0376m.f5096l = null;
                            c0376m.f5099o = 3;
                            if (((InterfaceC0369f) this.f2546j).m(obj, c0376m) == aVar2) {
                                return aVar2;
                            }
                        }
                    }
                }
                return xVar2;
            case 3:
                Object objA = T4.b.a((p111u4.i) this.i, obj, this.f2546j, (T4.y) this.f2547k, dVar);
                return objA == v4.a.f13292h ? objA : p084p4.x.f10867a;
            default:
                if (((Boolean) obj).booleanValue()) {
                    D4.e eVar = (D4.e) ((InterfaceC0203a0) this.f2547k).getValue();
                    p096s.o0 o0Var = (p096s.o0) this.f2546j;
                    zBooleanValue = ((Boolean) eVar.d(o0Var.f12056a.j(), o0Var.f12059d.getValue())).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                ((C0229n0) this.i).setValue(Boolean.valueOf(zBooleanValue));
                return p084p4.x.f10867a;
        }
    }

    public /* synthetic */ W(Object obj, Object obj2, Object obj3, int i) {
        this.f2545h = i;
        this.i = obj;
        this.f2546j = obj2;
        this.f2547k = obj3;
    }

    public W(InterfaceC0369f interfaceC0369f, p111u4.i iVar) {
        this.f2545h = 3;
        this.i = iVar;
        this.f2546j = U4.a.k(iVar);
        this.f2547k = new T4.y(interfaceC0369f, null);
    }
}
