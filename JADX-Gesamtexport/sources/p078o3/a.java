package p078o3;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f10663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f10664b;

    static {
        HashMap map = new HashMap();
        f10663a = map;
        HashMap map2 = new HashMap();
        f10664b = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }
}
