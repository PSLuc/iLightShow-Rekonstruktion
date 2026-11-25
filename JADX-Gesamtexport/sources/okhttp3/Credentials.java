package okhttp3;

import E4.k;
import h5.C0735m;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String str, String str2) {
        k.f("username", str);
        k.f("password", str2);
        return basic$default(str, str2, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            k.e("ISO_8859_1", charset);
        }
        return basic(str, str2, charset);
    }

    public static final String basic(String str, String str2, Charset charset) {
        k.f("username", str);
        k.f("password", str2);
        k.f("charset", charset);
        String str3 = str + ':' + str2;
        C0735m c0735m = C0735m.f9352k;
        k.f("<this>", str3);
        byte[] bytes = str3.getBytes(charset);
        k.e("this as java.lang.String).getBytes(charset)", bytes);
        return k.l("Basic ", new C0735m(bytes).a());
    }
}
