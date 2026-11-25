package G1;

import F1.C0096m;
import N.InterfaceC0203a0;
import N.V0;
import java.util.List;
import java.util.Map;
import p090r.C0864c;
import p090r.C0873l;
import p090r.G;
import p090r.H;
import p090r.N;

/* JADX INFO: loaded from: classes.dex */
public final class x extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Map f1669h;
    public final /* synthetic */ i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D4.c f1670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ D4.c f1671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D4.c f1672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ V0 f1673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f1674n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Map map, i iVar, D4.c cVar, D4.c cVar2, D4.c cVar3, V0 v6, InterfaceC0203a0 interfaceC0203a0) {
        super(1);
        this.f1669h = map;
        this.i = iVar;
        this.f1670j = cVar;
        this.f1671k = cVar2;
        this.f1672l = cVar3;
        this.f1673m = v6;
        this.f1674n = interfaceC0203a0;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        C0873l c0873l = (C0873l) obj;
        float fFloatValue = 0.0f;
        if (!((List) this.f1673m.getValue()).contains(c0873l.b())) {
            return new p090r.w(G.f11374b, H.f11376b, 0.0f, new N(C0864c.f11398h));
        }
        String str = ((C0096m) c0873l.b()).f1357m;
        Map map = this.f1669h;
        Float f6 = (Float) map.get(str);
        if (f6 != null) {
            fFloatValue = f6.floatValue();
        } else {
            map.put(((C0096m) c0873l.b()).f1357m, Float.valueOf(0.0f));
        }
        if (!E4.k.a(((C0096m) c0873l.c()).f1357m, ((C0096m) c0873l.b()).f1357m)) {
            fFloatValue = (((Boolean) this.i.f1621c.getValue()).booleanValue() || ((Boolean) this.f1674n.getValue()).booleanValue()) ? fFloatValue - 1.0f : fFloatValue + 1.0f;
        }
        map.put(((C0096m) c0873l.c()).f1357m, Float.valueOf(fFloatValue));
        return new p090r.w((G) this.f1670j.invoke(c0873l), (H) this.f1671k.invoke(c0873l), fFloatValue, (N) this.f1672l.invoke(c0873l));
    }
}
