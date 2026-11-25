package p112v;

import D4.c;
import D4.e;
import E4.w;
import R4.b;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class K extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w f12843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f12845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w f12846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ M f12847p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(w wVar, M m6, d dVar) {
        super(2, dVar);
        this.f12846o = wVar;
        this.f12847p = m6;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        K k3 = new K(this.f12846o, this.f12847p, dVar);
        k3.f12845n = obj;
        return k3;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((K) b((c) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0041 -> B:25:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004d -> B:24:0x0050). Please report as a decompilation issue!!! */
    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        c cVar;
        w wVar;
        Object obj2;
        AbstractC1006u abstractC1006u;
        a aVar = a.f13292h;
        int i = this.f12844m;
        if (i == 0) {
            V.O(obj);
            cVar = (c) this.f12845n;
            wVar = this.f12846o;
            obj2 = wVar.f1074h;
            if (!(obj2 instanceof C1004t) || (obj2 instanceof C0999q)) {
                return x.f10867a;
            }
            abstractC1006u = null;
            r rVar = obj2 instanceof r ? (r) obj2 : null;
            if (rVar != null) {
                cVar.invoke(rVar);
            }
            b bVar = this.f12847p.f12859A;
            if (bVar != null) {
                this.f12845n = cVar;
                this.f12843l = wVar;
                this.f12844m = 1;
                obj = bVar.l(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            wVar.f1074h = abstractC1006u;
            wVar = this.f12846o;
            obj2 = wVar.f1074h;
            if (obj2 instanceof C1004t) {
            }
            return x.f10867a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wVar = this.f12843l;
        cVar = (c) this.f12845n;
        V.O(obj);
        abstractC1006u = (AbstractC1006u) obj;
        wVar.f1074h = abstractC1006u;
        wVar = this.f12846o;
        obj2 = wVar.f1074h;
        if (obj2 instanceof C1004t) {
        }
        return x.f10867a;
    }
}
