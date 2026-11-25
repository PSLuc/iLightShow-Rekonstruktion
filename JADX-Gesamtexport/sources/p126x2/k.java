package p126x2;

import D4.f;
import E4.l;
import F2.a;
import F2.b;
import com.github.kittinunf.fuel.core.FuelError;
import com.spotify.sdk.android.auth.AccountsQueryParameters;
import com.spotify.sdk.android.auth.LoginActivity;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14082h;
    public final /* synthetic */ f i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(f fVar, int i) {
        super(3);
        this.f14082h = i;
        this.i = fVar;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        w wVar = (w) obj;
        z zVar = (z) obj2;
        switch (this.f14082h) {
            case 0:
                E4.k.f(LoginActivity.REQUEST_KEY, wVar);
                E4.k.f(LoginActivity.RESPONSE_KEY, zVar);
                E4.k.f("value", obj3);
                this.i.c(wVar, zVar, new b(obj3));
                break;
            default:
                FuelError fuelError = (FuelError) obj3;
                E4.k.f(LoginActivity.REQUEST_KEY, wVar);
                E4.k.f(LoginActivity.RESPONSE_KEY, zVar);
                E4.k.f(AccountsQueryParameters.ERROR, fuelError);
                this.i.c(wVar, zVar, new a(fuelError));
                break;
        }
        return x.f10867a;
    }
}
