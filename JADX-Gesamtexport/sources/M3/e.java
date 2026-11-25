package M3;

import E4.k;
import com.spotify.sdk.android.auth.LoginActivity;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import p105t3.m;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Callback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3498h;
    public final /* synthetic */ f i;

    public /* synthetic */ e(f fVar, int i) {
        this.f3498h = i;
        this.i = fVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        switch (this.f3498h) {
            case 0:
                k.f("call", call);
                k.f("e", iOException);
                f fVar = this.i;
                fVar.f3508t = 1;
                fVar.m();
                fVar.k();
                break;
            case 1:
                k.f("call", call);
                k.f("e", iOException);
                iOException.getMessage();
                K3.b bVar = K3.b.i;
                f fVar2 = this.i;
                fVar2.getClass();
                fVar2.f3504p = bVar;
                fVar2.k();
                break;
            case 2:
                k.f("call", call);
                k.f("e", iOException);
                iOException.getMessage();
                break;
            default:
                k.f("call", call);
                k.f("e", iOException);
                break;
        }
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        switch (this.f3498h) {
            case 0:
                f fVar = this.i;
                k.f("call", call);
                k.f(LoginActivity.RESPONSE_KEY, response);
                try {
                    ResponseBody responseBodyBody = response.body();
                    E3.f fVar2 = (E3.f) new m().d(responseBodyBody != null ? responseBodyBody.string() : null, E3.f.class);
                    if (fVar2 != null) {
                        fVar.f3508t = fVar2.a();
                    } else {
                        fVar.f3508t = 1;
                    }
                } catch (Exception e6) {
                    e6.getMessage();
                    fVar.f3508t = 1;
                }
                fVar.m();
                fVar.k();
                break;
            case 1:
                f fVar3 = this.i;
                k.f("call", call);
                k.f(LoginActivity.RESPONSE_KEY, response);
                try {
                    ResponseBody responseBodyBody2 = response.body();
                    E3.g gVar = (E3.g) new m().d(responseBodyBody2 != null ? responseBodyBody2.string() : null, E3.g.class);
                    if (gVar != null) {
                        fVar3.f3506r = gVar;
                        fVar3.f3504p = K3.b.f2128h;
                        fVar3.f800b = gVar.b();
                        f.i(fVar3);
                    }
                } catch (Exception e7) {
                    e7.getMessage();
                    return;
                }
                break;
            case 2:
                f fVar4 = this.i;
                k.f("call", call);
                k.f(LoginActivity.RESPONSE_KEY, response);
                try {
                    ResponseBody responseBodyBody3 = response.body();
                    String strString = responseBodyBody3 != null ? responseBodyBody3.string() : null;
                    if (strString != null) {
                        Object obj = new JSONObject(strString).get("auth_token");
                        k.d("null cannot be cast to non-null type kotlin.String", obj);
                        fVar4.f3503o = (String) obj;
                        K3.b bVar = K3.b.f2129j;
                        fVar4.getClass();
                        fVar4.f3504p = bVar;
                        fVar4.l();
                    }
                } catch (Exception unused) {
                    response.code();
                    return;
                }
                break;
            default:
                k.f("call", call);
                k.f(LoginActivity.RESPONSE_KEY, response);
                ResponseBody responseBodyBody4 = response.body();
                Integer numValueOf = Integer.valueOf(G4.a.G(responseBodyBody4 != null ? responseBodyBody4.string() : null));
                f fVar5 = this.i;
                fVar5.f3502n = numValueOf;
                fVar5.k();
                break;
        }
    }
}
