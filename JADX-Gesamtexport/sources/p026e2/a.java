package p026e2;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import p009b2.l;
import p046i2.s;
import p046i2.z;
import p104t2.n;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final TimeZone f8679o = TimeZone.getTimeZone("UTC");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f8680h;
    public final s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z f8681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l f8682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DateFormat f8683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Locale f8684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final T1.a f8685n;

    public a(s sVar, z zVar, n nVar, DateFormat dateFormat, Locale locale, T1.a aVar, l lVar) {
        this.i = sVar;
        this.f8681j = zVar;
        this.f8680h = nVar;
        this.f8683l = dateFormat;
        this.f8684m = locale;
        this.f8685n = aVar;
        this.f8682k = lVar;
    }
}
