package M4;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f3542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f3544c;

    public i(Matcher matcher, String str) {
        E4.k.f("input", str);
        this.f3542a = matcher;
        this.f3543b = str;
    }

    public final J4.d a() {
        Matcher matcher = this.f3542a;
        return p081p0.c.D0(matcher.start(), matcher.end());
    }
}
