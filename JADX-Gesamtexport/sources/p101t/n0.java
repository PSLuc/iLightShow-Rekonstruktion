package p101t;

import D4.c;
import E0.d;
import E0.h;
import E0.o;
import E0.q;
import E0.r;
import E4.l;
import J4.a;
import K4.e;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f12385h;
    public final /* synthetic */ a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f12386j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(float f6, a aVar, int i) {
        super(1);
        this.f12385h = f6;
        this.i = aVar;
        this.f12386j = i;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        h hVar = (h) obj;
        Float fValueOf = Float.valueOf(this.f12385h);
        a aVar = this.i;
        float f6 = aVar.f1939a;
        float f7 = aVar.f1940b;
        if (f6 > f7) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + aVar + '.');
        }
        if (a.a(fValueOf, Float.valueOf(f6)) && !a.a(Float.valueOf(f6), fValueOf)) {
            fValueOf = Float.valueOf(f6);
        } else if (a.a(Float.valueOf(f7), fValueOf) && !a.a(fValueOf, Float.valueOf(f7))) {
            fValueOf = Float.valueOf(f7);
        }
        d dVar = new d(fValueOf.floatValue(), aVar, this.f12386j);
        e[] eVarArr = q.f997a;
        r rVar = o.f973c;
        e eVar = q.f997a[1];
        rVar.a(hVar, dVar);
        return x.f10867a;
    }
}
