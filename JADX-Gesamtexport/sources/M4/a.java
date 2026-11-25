package M4;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f3520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f3521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Charset f3522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Charset f3523d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        E4.k.e("forName(...)", charsetForName);
        f3520a = charsetForName;
        E4.k.e("forName(...)", Charset.forName("UTF-16"));
        E4.k.e("forName(...)", Charset.forName("UTF-16BE"));
        E4.k.e("forName(...)", Charset.forName("UTF-16LE"));
        Charset charsetForName2 = Charset.forName("US-ASCII");
        E4.k.e("forName(...)", charsetForName2);
        f3521b = charsetForName2;
        E4.k.e("forName(...)", Charset.forName("ISO-8859-1"));
    }
}
