package e5;

import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f extends E4.i implements D4.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f8761p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, Object obj, Class cls, String str, String str2, int i3, int i6) {
        super(i, obj, cls, str, str2, i3);
        this.f8761p = i6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f8761p) {
            case 0:
                a5.g gVar = (a5.g) obj;
                int iIntValue = ((Number) obj2).intValue();
                E4.k.f("p0", gVar);
                g gVar2 = (g) this.i;
                gVar2.getClass();
                boolean z5 = !gVar.l(iIntValue) && gVar.k(iIntValue).i();
                gVar2.f8763b = z5;
                return Boolean.valueOf(z5);
            default:
                return Boolean.valueOf(r.e((r) this.i, (p024e0.b) obj, (p030f0.d) obj2));
        }
    }
}
