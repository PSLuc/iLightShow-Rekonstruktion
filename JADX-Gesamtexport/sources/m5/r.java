package m5;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public interface r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f10490a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f10491b = Charset.forName("US-ASCII");

    static {
        Charset.forName("ISO-8859-1");
    }
}
