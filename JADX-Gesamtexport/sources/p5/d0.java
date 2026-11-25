package p5;

import java.nio.charset.Charset;
import java.util.Arrays;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends m5.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d0 f11037g = new d0("");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11039f;

    public d0(String str) {
        super(str == null ? null : str.getBytes(m5.r.f10490a), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        this.f11039f = str;
        this.f11038e = true;
    }

    public static d0 c(byte[] bArr) {
        if (bArr.length == 0) {
            return f11037g;
        }
        Charset charset = m5.r.f10490a;
        String str = new String(bArr, charset);
        d0 d0Var = new d0(bArr, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        d0Var.f11039f = str;
        d0Var.f11038e = Arrays.equals(bArr, str.getBytes(charset));
        return d0Var;
    }

    public final String toString() {
        if (this.f11038e) {
            return this.f11039f;
        }
        return this.f11039f + "/" + a();
    }
}
