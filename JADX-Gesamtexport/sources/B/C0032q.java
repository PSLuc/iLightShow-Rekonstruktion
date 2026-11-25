package B;

import N.C0208d;
import N.C0230o;

/* JADX INFO: renamed from: B.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0032q extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f396h;
    public final /* synthetic */ Z.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G0.J f397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f401n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f403p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0032q(String str, Z.o oVar, G0.J j4, int i, boolean z5, int i3, int i6, int i7, int i8) {
        super(2);
        this.f396h = str;
        this.i = oVar;
        this.f397j = j4;
        this.f398k = i;
        this.f399l = z5;
        this.f400m = i3;
        this.f401n = i6;
        this.f402o = i7;
        this.f403p = i8;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0208d.V(this.f402o | 1);
        int i = this.f400m;
        AbstractC0029o0.b(this.f396h, this.i, this.f397j, this.f398k, this.f399l, i, this.f401n, (C0230o) obj, iV, this.f403p);
        return p084p4.x.f10867a;
    }
}
