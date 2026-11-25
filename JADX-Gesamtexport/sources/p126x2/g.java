package p126x2;

import E4.k;
import com.github.kittinunf.fuel.core.FuelError;
import com.spotify.sdk.android.auth.LoginActivity;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static FuelError a(Throwable th, z zVar) {
        k.f("it", th);
        k.f(LoginActivity.RESPONSE_KEY, zVar);
        if (th instanceof c) {
            return new c(((c) th).f14072j);
        }
        return th instanceof FuelError ? new c((FuelError) th) : new FuelError(th, zVar);
    }

    public static FuelError b(Throwable th) {
        return a(th, new z(new URL("http://.")));
    }
}
