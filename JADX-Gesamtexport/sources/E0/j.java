package E0;

import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class j extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f942h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, int i) {
        super(1);
        this.f942h = i;
        this.i = str;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        x xVar = x.f10867a;
        String str = this.i;
        switch (this.f942h) {
            case 0:
                q.e((h) obj, str);
                return xVar;
            case 1:
                return Boolean.valueOf(E4.k.a((String) obj, str));
            case 2:
                K4.e[] eVarArr = q.f997a;
                r rVar = o.f974d;
                K4.e eVar = q.f997a[2];
                rVar.a((h) obj, str);
                return xVar;
            case 3:
                h hVar = (h) obj;
                q.e(hVar, str);
                q.g(hVar, 5);
                return xVar;
            case 4:
                q.e((h) obj, str);
                return xVar;
            case 5:
                q.e((h) obj, str);
                return xVar;
            case 6:
                J4.d dVar = (J4.d) obj;
                E4.k.f("it", dVar);
                return M4.l.w0(str, dVar);
            default:
                h hVar2 = (h) obj;
                q.e(hVar2, str);
                q.g(hVar2, 5);
                return xVar;
        }
    }
}
