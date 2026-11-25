package p096s;

import D4.c;
import E4.l;
import E4.w;
import F.D;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w f11991h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0915h f11992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC0924q f11993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0919l f11994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f11995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f11996n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(w wVar, Object obj, InterfaceC0915h interfaceC0915h, AbstractC0924q abstractC0924q, C0919l c0919l, float f6, c cVar) {
        super(1);
        this.f11991h = wVar;
        this.i = obj;
        this.f11992j = interfaceC0915h;
        this.f11993k = abstractC0924q;
        this.f11994l = c0919l;
        this.f11995m = f6;
        this.f11996n = cVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        InterfaceC0915h interfaceC0915h = this.f11992j;
        w0 w0VarD = interfaceC0915h.d();
        Object objE = interfaceC0915h.e();
        D d6 = new D(this.f11994l, 1);
        C0917j c0917j = new C0917j(this.i, w0VarD, this.f11993k, jLongValue, objE, jLongValue, d6);
        AbstractC0909d.g(c0917j, jLongValue, this.f11995m, this.f11992j, this.f11994l, this.f11996n);
        this.f11991h.f1074h = c0917j;
        return x.f10867a;
    }
}
