package com.nanjoran.ilightshow.Services;

import B.AbstractC0013g0;
import N.C0208d;
import N.C0217h0;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.nanjoran.ilightshow.MainActivity;
import com.nanjoran.ilightshow.Model.Data.AuthRequest;
import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;
import com.spotify.android.appremote.api.SpotifyAppRemote;
import java.net.URLEncoder;
import java.util.Observable;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends Observable {
    public static final C0 i = new C0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f8234j = "https://api.ilightshow.app/ils/auth/spotify/client";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f8235k = "https://api.ilightshow.app/ils/auth/spotify/refresh";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f8236l = "lightshow://login";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f8237m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MainActivity f8238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f8239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f8240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f8241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0217h0 f8242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0217h0 f8243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0217h0 f8244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0217h0 f8245h;

    static {
        String strEncode = URLEncoder.encode("lightshow://login", M4.a.f3520a.name());
        E4.k.e("encode(...)", strEncode);
        f8237m = AbstractC0013g0.i("https://accounts.spotify.com/authorize?client_id=e4a02fee8b3f4dd09c9f2c460862d6ff&response_type=code&redirect_uri=", strEncode, "&show_dialog=true&scope=user-read-playback-state%20app-remote-control");
    }

    public C0() {
        N.U u6 = N.U.f3673m;
        this.f8242e = C0208d.K(null, u6);
        Boolean bool = Boolean.FALSE;
        this.f8243f = C0208d.K(bool, u6);
        this.f8244g = C0208d.K(bool, u6);
        this.f8245h = C0208d.K(bool, u6);
        D[] dArr = D.f8246h;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(30L, timeUnit).build();
        new OkHttpClient();
    }

    public static void a(C0 c6, p126x2.w wVar, p126x2.z zVar, F2.c cVar) {
        E4.k.f("this$0", c6);
        E4.k.f("<unused var>", wVar);
        E4.k.f("<unused var>", zVar);
        E4.k.f("result", cVar);
        AuthRequest authRequest = (AuthRequest) cVar.a();
        String access_token = authRequest != null ? authRequest.getAccess_token() : null;
        C0217h0 c0217h0 = c6.f8242e;
        if (access_token == null || authRequest.getIls_access_token() == null || authRequest.getRefresh_token() == null) {
            new Handler(Looper.getMainLooper()).post(new A0(c6, 1));
            c6.f8239b = null;
            c0217h0.setValue(null);
            c6.f8241d = null;
            c6.f8240c = 0L;
        } else {
            c6.f8239b = authRequest.getAccess_token();
            c0217h0.setValue(authRequest.getRefresh_token());
            c6.f8241d = authRequest.getIls_access_token();
            c6.f8240c = Long.valueOf(p012c.k.o() + ((long) 3300000));
            c6.f8243f.setValue(Boolean.FALSE);
            c6.d(false);
            H3.f.f1787d.d(MusicServiceType.Spotify);
        }
        c6.c();
        c6.setChanged();
        c6.notifyObservers(c6);
    }

    public final void b() {
        MainActivity mainActivity = this.f8238a;
        if (mainActivity != null) {
            SharedPreferences sharedPreferences = mainActivity.getSharedPreferences("prefsFile", 0);
            this.f8239b = sharedPreferences.getString("spt3_token", null);
            this.f8242e.setValue(sharedPreferences.getString("spt3_refresh", null));
        }
        setChanged();
        notifyObservers(this);
    }

    public final void c() {
        MainActivity mainActivity = this.f8238a;
        if (mainActivity != null) {
            SharedPreferences.Editor editorEdit = mainActivity.getSharedPreferences("prefsFile", 0).edit();
            if (this.f8239b != null) {
                C0217h0 c0217h0 = this.f8242e;
                if (((String) c0217h0.getValue()) != null) {
                    editorEdit.putString("spt3_token", this.f8239b);
                    editorEdit.putString("spt3_refresh", (String) c0217h0.getValue());
                    editorEdit.putString("ils_access_token", this.f8241d);
                    editorEdit.apply();
                    return;
                }
            }
            editorEdit.remove("spt3_token");
            editorEdit.remove("spt3_refresh");
            editorEdit.remove("spt_type");
            editorEdit.remove("ils_access_token");
            editorEdit.commit();
            setChanged();
            notifyObservers(this);
        }
    }

    public final void d(boolean z5) {
        this.f8244g.setValue(Boolean.valueOf(z5));
    }

    public final void e() {
        SpotifyAppRemote.disconnect(null);
        H3.f fVar = H3.f.f1787d;
        if (fVar.b() == MusicServiceType.Spotify) {
            H3.d dVarA = fVar.a();
            if (dVarA != null) {
                dVarA.f1781c.setValue("stopped");
            }
            H3.d dVarA2 = fVar.a();
            if (dVarA2 != null) {
                dVarA2.f(null);
            }
            M.f8305O.f8333t = false;
        }
    }
}
