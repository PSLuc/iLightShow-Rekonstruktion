package p096s;

import D4.c;
import E4.k;
import E4.l;
import E4.w;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w f11998h;
    public final /* synthetic */ float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0915h f11999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0919l f12000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f12001l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(w wVar, float f6, InterfaceC0915h interfaceC0915h, C0919l c0919l, c cVar) {
        super(1);
        this.f11998h = wVar;
        this.i = f6;
        this.f11999j = interfaceC0915h;
        this.f12000k = c0919l;
        this.f12001l = cVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Object obj2 = this.f11998h.f1074h;
        k.c(obj2);
        AbstractC0909d.g((C0917j) obj2, jLongValue, this.i, this.f11999j, this.f12000k, this.f12001l);
        return x.f10867a;
    }
}
