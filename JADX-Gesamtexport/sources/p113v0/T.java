package p113v0;

import D4.e;
import E4.l;
import N.C0208d;
import N.C0230o;
import Z.o;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class T extends l implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f13148h;
    public final /* synthetic */ e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f13149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13150k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(o oVar, e eVar, int i, int i3) {
        super(2);
        this.f13148h = oVar;
        this.i = eVar;
        this.f13149j = i;
        this.f13150k = i3;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0208d.V(this.f13149j | 1);
        e eVar = this.i;
        int i = this.f13150k;
        U.b(this.f13148h, eVar, (C0230o) obj, iV, i);
        return x.f10867a;
    }
}
