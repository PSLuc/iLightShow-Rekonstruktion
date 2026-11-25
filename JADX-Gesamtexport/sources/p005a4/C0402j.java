package p005a4;

import R3.a;
import R3.c;
import p056k4.b;
import p056k4.d;

/* JADX INFO: renamed from: a4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0402j extends AbstractC0393a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6256j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f6257k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0402j(a aVar, Object obj, int i) {
        super(aVar);
        this.f6256j = i;
        this.f6257k = obj;
    }

    @Override // R3.a
    public final void f(c cVar) {
        switch (this.f6256j) {
            case 0:
                boolean z5 = cVar instanceof X3.a;
                U3.c cVar2 = (U3.c) this.f6257k;
                a aVar = this.i;
                if (!z5) {
                    aVar.e(new C0401i(cVar, cVar2));
                } else {
                    aVar.e(new C0400h((X3.a) cVar, cVar2));
                }
                break;
            case 1:
                p073n4.a aVar2 = new p073n4.a(cVar);
                b bVar = new b(new d());
                try {
                    Object objApply = ((U3.b) this.f6257k).apply(bVar);
                    W3.b.a("handler returned a null Publisher", objApply);
                    u5.a aVar3 = (u5.a) objApply;
                    H h6 = new H(this.i);
                    I i = new I(aVar2, bVar, h6);
                    h6.f6191k = i;
                    cVar.h(i);
                    aVar3.a(h6);
                    h6.c(0);
                } catch (Throwable th) {
                    p027e3.a.w0(th);
                    p043h4.d.a(th, cVar);
                    return;
                }
                break;
            default:
                this.i.e(new P(cVar, (v5.a) this.f6257k));
                break;
        }
    }
}
