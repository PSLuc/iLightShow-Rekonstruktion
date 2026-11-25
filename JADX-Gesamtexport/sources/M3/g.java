package M3;

import E3.i;
import E4.k;
import com.spotify.sdk.android.auth.LoginActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import p105t3.m;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Callback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3509h;
    public final /* synthetic */ h i;

    public /* synthetic */ g(h hVar, int i) {
        this.f3509h = i;
        this.i = hVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        int i = this.f3509h;
        k.f("call", call);
        k.f("e", iOException);
        switch (i) {
            case 0:
                OkHttpClient okHttpClient = h.f3510u;
                iOException.getMessage();
                K3.b bVar = K3.b.i;
                h hVar = this.i;
                hVar.getClass();
                hVar.f3515p = bVar;
                hVar.i();
                break;
            case 1:
                OkHttpClient okHttpClient2 = h.f3510u;
                break;
            default:
                OkHttpClient okHttpClient3 = h.f3510u;
                break;
        }
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        E3.e eVarA;
        List listA;
        h hVar = this.i;
        int i = this.f3509h;
        k.f("call", call);
        k.f(LoginActivity.RESPONSE_KEY, response);
        switch (i) {
            case 0:
                try {
                    try {
                        ResponseBody responseBodyBody = response.body();
                        E3.g gVar = (E3.g) new m().d(responseBodyBody != null ? responseBodyBody.string() : null, E3.g.class);
                        if (gVar != null) {
                            hVar.f3517r = gVar;
                            K3.b bVar = K3.b.f2128h;
                            hVar.f3515p = bVar;
                            hVar.f800b = gVar.b();
                            i iVarC = gVar.c();
                            if (iVarC != null && (eVarA = iVarC.a()) != null && (listA = eVarA.a()) != null) {
                                hVar.f3519t = new ArrayList(listA);
                                OkHttpClient okHttpClient = h.f3510u;
                                hVar.f3515p = bVar;
                                hVar.l();
                                hVar.i();
                                return;
                            }
                        }
                        OkHttpClient okHttpClient2 = h.f3510u;
                        return;
                    } catch (Exception unused) {
                        K3.b bVar2 = K3.b.f2128h;
                        ResponseBody responseBodyBody2 = response.body();
                        if (responseBodyBody2 != null) {
                            responseBodyBody2.string();
                            return;
                        }
                        return;
                    }
                } catch (Exception unused2) {
                    return;
                }
            case 1:
                try {
                    try {
                        ResponseBody responseBodyBody3 = response.body();
                        String strString = responseBodyBody3 != null ? responseBodyBody3.string() : null;
                        if (strString == null) {
                            OkHttpClient okHttpClient3 = h.f3510u;
                            throw new Exception("No body...");
                        }
                        Object obj = new JSONObject(strString).get("auth_token");
                        k.d("null cannot be cast to non-null type kotlin.String", obj);
                        OkHttpClient okHttpClient4 = h.f3510u;
                        hVar.f3514o = (String) obj;
                        K3.b bVar3 = K3.b.f2129j;
                        hVar.getClass();
                        hVar.f3515p = bVar3;
                        hVar.k();
                        return;
                    } catch (Exception unused3) {
                        OkHttpClient okHttpClient5 = h.f3510u;
                        response.code();
                        return;
                    }
                } catch (Exception unused4) {
                    ResponseBody responseBodyBody4 = response.body();
                    if (responseBodyBody4 != null) {
                        responseBodyBody4.string();
                    }
                    OkHttpClient okHttpClient6 = h.f3510u;
                    response.code();
                    return;
                }
            default:
                ResponseBody responseBodyBody5 = response.body();
                hVar.f3513n = Integer.valueOf(G4.a.G(responseBodyBody5 != null ? responseBodyBody5.string() : null));
                OkHttpClient okHttpClient7 = h.f3510u;
                hVar.i();
                return;
        }
    }
}
