package K3;

import com.nanjoran.outpost.outpost.Outpost;
import com.spotify.sdk.android.auth.AccountsQueryParameters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f2128h;
    public static final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f2129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f2130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ b[] f2131l;

    static {
        b bVar = new b(Outpost.StateConnected, 0);
        f2128h = bVar;
        b bVar2 = new b("notFound", 1);
        i = bVar2;
        b bVar3 = new b(Outpost.StateConnecting, 2);
        f2129j = bVar3;
        b bVar4 = new b("pairing", 3);
        b bVar5 = new b(AccountsQueryParameters.ERROR, 4);
        b bVar6 = new b("discovered", 5);
        f2130k = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        f2131l = bVarArr;
        p081p0.c.i0(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f2131l.clone();
    }
}
