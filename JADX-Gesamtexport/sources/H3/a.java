package H3;

import com.spotify.sdk.android.auth.AccountsQueryParameters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f1775h;
    public static final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a[] f1776j;

    static {
        a aVar = new a("fetching", 0);
        f1775h = aVar;
        a aVar2 = new a(AccountsQueryParameters.ERROR, 1);
        a aVar3 = new a("ok", 2);
        i = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f1776j = aVarArr;
        p081p0.c.i0(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1776j.clone();
    }
}
