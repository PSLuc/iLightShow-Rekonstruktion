package p107u;

import D4.a;
import D4.e;
import E4.l;
import N.C0208d;
import N.C0230o;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class n extends l implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f12641h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f12642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f12643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f12644l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(String str, boolean z5, a aVar, a aVar2, int i) {
        super(2);
        this.f12641h = str;
        this.i = z5;
        this.f12642j = aVar;
        this.f12643k = (l) aVar2;
        this.f12644l = i;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [D4.a, E4.l] */
    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0208d.V(this.f12644l | 1);
        ?? r6 = this.f12643k;
        boolean z5 = this.i;
        a aVar = this.f12642j;
        o.b(this.f12641h, z5, aVar, r6, (C0230o) obj, iV);
        return x.f10867a;
    }
}
