package p130y0;

import D4.a;
import E4.k;
import E4.l;
import J1.e;
import p068n.f;
import p084p4.x;

/* JADX INFO: renamed from: y0.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1130f0 extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f14387h;
    public final /* synthetic */ e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f14388j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1130f0(boolean z5, e eVar, String str) {
        super(0);
        this.f14387h = z5;
        this.i = eVar;
        this.f14388j = str;
    }

    @Override // D4.a
    public final Object invoke() {
        if (this.f14387h) {
            e eVar = this.i;
            eVar.getClass();
            String str = this.f14388j;
            k.f("key", str);
            ((f) eVar.f1901e).d(str);
        }
        return x.f10867a;
    }
}
