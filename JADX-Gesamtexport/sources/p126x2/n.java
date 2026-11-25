package p126x2;

import D4.c;
import E4.k;
import E4.l;
import com.spotify.sdk.android.auth.LoginActivity;

/* JADX INFO: loaded from: classes.dex */
public final class n extends l implements c {
    public static final n i = new n(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f14088j = new n(1, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14089h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i3, int i6) {
        super(i3);
        this.f14089h = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f14089h) {
            case 0:
                w wVar = (w) obj;
                k.f("r", wVar);
                return wVar;
            default:
                z zVar = (z) obj;
                k.f(LoginActivity.RESPONSE_KEY, zVar);
                int i3 = zVar.f14135b / 100;
                return Boolean.valueOf((i3 == 5 || i3 == 4) ? false : true);
        }
    }
}
