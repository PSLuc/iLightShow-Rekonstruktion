package F1;

import B.AbstractC0013g0;
import S1.h0;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f1329b = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1330a = new LinkedHashMap();

    public final void a(U u6) {
        E4.k.f("navigator", u6);
        String strP = h0.p(u6.getClass());
        if (strP.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f1330a;
        U u7 = (U) linkedHashMap.get(strP);
        if (E4.k.a(u7, u6)) {
            return;
        }
        boolean z5 = false;
        if (u7 != null && u7.f1328b) {
            z5 = true;
        }
        if (z5) {
            throw new IllegalStateException(("Navigator " + u6 + " is replacing an already attached " + u7).toString());
        }
        if (!u6.f1328b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + u6 + " is already attached to another NavController").toString());
    }

    public final U b(String str) {
        E4.k.f("name", str);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        U u6 = (U) this.f1330a.get(str);
        if (u6 != null) {
            return u6;
        }
        throw new IllegalStateException(AbstractC0013g0.i("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
