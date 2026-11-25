package H3;

import N.C0208d;
import N.C0217h0;
import N.U;
import android.content.Context;
import android.content.SharedPreferences;
import com.nanjoran.ilightshow.Services.C0;
import com.nanjoran.ilightshow.Services.D;
import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;
import com.spotify.protocol.types.MotionState;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f1787d = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0217h0 f1789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0217h0 f1790c;

    public f() {
        U u6 = U.f3673m;
        this.f1789b = C0208d.K(null, u6);
        this.f1790c = C0208d.K(null, u6);
    }

    public final d a() {
        return (d) this.f1790c.getValue();
    }

    public final MusicServiceType b() {
        return (MusicServiceType) this.f1789b.getValue();
    }

    public final void c(d dVar) {
        this.f1790c.setValue(dVar);
    }

    public final void d(MusicServiceType musicServiceType) {
        Context context;
        SharedPreferences sharedPreferences;
        Timer timer;
        int i = 0;
        if (musicServiceType != MusicServiceType.Spotify) {
            C0 c6 = C0.i;
            c6.f8243f.setValue(Boolean.FALSE);
            c6.d(false);
        }
        if (musicServiceType != null) {
            WeakReference weakReference = defpackage.f.f8806a;
            String tagKey = musicServiceType.getTagKey();
            E4.k.f("key", tagKey);
            LinkedHashMap linkedHashMap = defpackage.f.f8808c;
            if (!E4.k.a(linkedHashMap.get(tagKey), "1")) {
                linkedHashMap.put(tagKey, "1");
            }
        }
        d dVarA = a();
        if (dVarA != null && (timer = dVarA.f1784f) != null) {
            timer.cancel();
            dVarA.f1784f = null;
        }
        this.f1789b.setValue(musicServiceType);
        switch (musicServiceType == null ? -1 : e.f1786a[musicServiceType.ordinal()]) {
            case MotionState.UNKNOWN /* -1 */:
                c(null);
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                k kVar = new k();
                D[] dArr = D.f8246h;
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(30L, timeUnit).build();
                kVar.i = new OkHttpClient.Builder().connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(10L, timeUnit).build();
                c(kVar);
                break;
            case 2:
                c(new j());
                break;
            case 3:
                c(new b());
                break;
            case 4:
                c(new b());
                break;
            case 5:
                c(new b());
                break;
            case 6:
                c(new b());
                break;
            case 7:
                c(new b());
                break;
            case 8:
                c(new b());
                break;
        }
        d dVarA2 = a();
        if (dVarA2 != null) {
            dVarA2.f1779a = this.f1788a;
        }
        d dVarA3 = a();
        if (dVarA3 != null && dVarA3.f1784f == null) {
            Timer timer2 = new Timer();
            dVarA3.f1784f = timer2;
            timer2.scheduleAtFixedRate(new c(i, dVarA3), 1L, dVarA3.b());
        }
        if (musicServiceType == MusicServiceType.Sonos || (context = this.f1788a) == null || (sharedPreferences = context.getSharedPreferences("prefFile", 0)) == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("savedMusicService", musicServiceType != null ? musicServiceType.name() : null);
        editorEdit.apply();
    }
}
