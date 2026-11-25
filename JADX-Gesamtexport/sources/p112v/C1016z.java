package p112v;

import D4.c;
import D4.f;
import E4.k;
import E4.l;
import F2.a;
import F2.b;
import N.C0222k;
import N.C0230o;
import com.github.kittinunf.fuel.core.FuelError;
import com.spotify.sdk.android.auth.AccountsQueryParameters;
import p084p4.x;
import p091r0.q;
import p123x.C1092z;
import p126x2.w;
import p126x2.z;

/* JADX INFO: renamed from: v.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1016z extends l implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13103h;
    public final /* synthetic */ c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1016z(c cVar, int i) {
        super(3);
        this.f13103h = i;
        this.i = cVar;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f13103h) {
            case 0:
                long j4 = ((p030f0.c) obj3).f8837a;
                this.i.invoke(new p030f0.c(((q) obj2).f11510c));
                return x.f10867a;
            case 1:
                C0230o c0230o = (C0230o) obj2;
                ((Number) obj3).intValue();
                c0230o.V(-1608161351);
                c cVar = this.i;
                boolean zF = c0230o.f(cVar);
                Object objK = c0230o.K();
                if (zF || objK == C0222k.f3714a) {
                    objK = new C1092z(cVar);
                    c0230o.f0(objK);
                }
                C1092z c1092z = (C1092z) objK;
                c0230o.p(false);
                return c1092z;
            case 2:
                k.f("<anonymous parameter 0>", (w) obj);
                k.f("<anonymous parameter 1>", (z) obj2);
                k.f("value", obj3);
                this.i.invoke(new b(obj3));
                return x.f10867a;
            default:
                FuelError fuelError = (FuelError) obj3;
                k.f("<anonymous parameter 0>", (w) obj);
                k.f("<anonymous parameter 1>", (z) obj2);
                k.f(AccountsQueryParameters.ERROR, fuelError);
                this.i.invoke(new a(fuelError));
                return x.f10867a;
        }
    }
}
