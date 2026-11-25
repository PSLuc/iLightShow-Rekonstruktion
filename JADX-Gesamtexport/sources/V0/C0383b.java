package V0;

import N.C0208d;
import N.C0230o;
import p123x.AbstractC1070c;

/* JADX INFO: renamed from: V0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0383b extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5405h;
    public final /* synthetic */ V.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5409m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0383b(Object obj, Object obj2, V.a aVar, int i, int i3, int i6) {
        super(2);
        this.f5405h = i6;
        this.f5408l = obj;
        this.f5409m = obj2;
        this.i = aVar;
        this.f5406j = i;
        this.f5407k = i3;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f5405h) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0208d.V(this.f5406j | 1);
                V.a aVar = this.i;
                D4.a aVar2 = (D4.a) this.f5408l;
                p006b.a.a(aVar2, (s) this.f5409m, aVar, (C0230o) obj, iV, this.f5407k);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = C0208d.V(this.f5406j | 1);
                V.a aVar3 = this.i;
                Z.g gVar = (Z.g) this.f5409m;
                AbstractC1070c.a((Z.o) this.f5408l, gVar, aVar3, (C0230o) obj, iV2, this.f5407k);
                break;
        }
        return p084p4.x.f10867a;
    }
}
