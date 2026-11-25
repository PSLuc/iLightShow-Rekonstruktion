package p018d;

import D4.e;
import E4.s;
import F.L;
import L.C0141g1;
import P4.InterfaceC0335w;
import R4.b;
import S1.V;
import S4.C0365b;
import S4.C0373j;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s f8558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f8560n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e f8561o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ L f8562p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, e eVar, L l6, d dVar) {
        super(2, dVar);
        this.f8560n = iVar;
        this.f8561o = eVar;
        this.f8562p = l6;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new h(this.f8560n, this.f8561o, this.f8562p, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((h) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        s sVar;
        a aVar = a.f13292h;
        int i = this.f8559m;
        boolean z5 = true;
        if (i == 0) {
            V.O(obj);
            if (this.f8560n.f7179a) {
                s sVar2 = new s();
                C0373j c0373j = new C0373j(new C0365b((b) this.f8562p.f1106c, z5), new C0141g1(sVar2, null, 1));
                this.f8558l = sVar2;
                this.f8559m = 1;
                if (this.f8561o.d(c0373j, this) == aVar) {
                    return aVar;
                }
                sVar = sVar2;
            }
            return x.f10867a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sVar = this.f8558l;
        V.O(obj);
        if (!sVar.f1070h) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return x.f10867a;
    }
}
