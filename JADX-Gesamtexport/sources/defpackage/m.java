package defpackage;

import S1.V;
import S4.InterfaceC0369f;
import p084p4.x;
import p111u4.d;
import p114v1.b;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class m implements InterfaceC0369f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10398h;
    public final /* synthetic */ InterfaceC0369f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f10399j;

    public /* synthetic */ m(InterfaceC0369f interfaceC0369f, t tVar, int i) {
        this.f10398h = i;
        this.i = interfaceC0369f;
        this.f10399j = tVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // S4.InterfaceC0369f
    public final Object m(Object obj, d dVar) {
        l lVar;
        p pVar;
        switch (this.f10398h) {
            case 0:
                if (dVar instanceof l) {
                    lVar = (l) dVar;
                    int i = lVar.f9957l;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        lVar.f9957l = i - Integer.MIN_VALUE;
                    } else {
                        lVar = new l(this, dVar);
                    }
                } else {
                    lVar = new l(this, dVar);
                }
                Object obj2 = lVar.f9956k;
                a aVar = a.f13292h;
                int i3 = lVar.f9957l;
                if (i3 == 0) {
                    V.O(obj2);
                    t tVar = this.f10399j;
                    Object objC = ((b) obj).c(tVar.f12218b);
                    if (objC == null) {
                        objC = tVar.f12217a;
                    }
                    lVar.f9957l = 1;
                    if (this.i.m(objC, lVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V.O(obj2);
                }
                return x.f10867a;
            default:
                if (dVar instanceof p) {
                    pVar = (p) dVar;
                    int i6 = pVar.f10706l;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        pVar.f10706l = i6 - Integer.MIN_VALUE;
                    } else {
                        pVar = new p(this, dVar);
                    }
                } else {
                    pVar = new p(this, dVar);
                }
                Object obj3 = pVar.f10705k;
                a aVar2 = a.f13292h;
                int i7 = pVar.f10706l;
                if (i7 == 0) {
                    V.O(obj3);
                    t tVar2 = this.f10399j;
                    Object objC2 = ((b) obj).c(tVar2.f12218b);
                    if (objC2 == null) {
                        objC2 = tVar2.f12217a;
                    }
                    pVar.f10706l = 1;
                    if (this.i.m(objC2, pVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V.O(obj3);
                }
                return x.f10867a;
        }
    }
}
