package p130y0;

import E4.k;
import S0.m;
import S0.n;
import android.os.Parcel;
import com.spotify.sdk.android.auth.LoginActivity;
import java.nio.charset.Charset;
import p126x2.h;
import p126x2.z;

/* JADX INFO: renamed from: y0.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1136i0 implements h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f14396h;

    public C1136i0(Charset charset) {
        k.f("charset", charset);
        this.f14396h = charset;
    }

    public void a(byte b6) {
        ((Parcel) this.f14396h).writeByte(b6);
    }

    public void b(float f6) {
        ((Parcel) this.f14396h).writeFloat(f6);
    }

    public void c(long j4) {
        long jB = m.b(j4);
        byte b6 = 0;
        if (!n.a(jB, 0L)) {
            if (n.a(jB, 4294967296L)) {
                b6 = 1;
            } else if (n.a(jB, 8589934592L)) {
                b6 = 2;
            }
        }
        a(b6);
        if (n.a(m.b(j4), 0L)) {
            return;
        }
        b(m.c(j4));
    }

    @Override // p126x2.h
    public Object deserialize(z zVar) {
        k.f(LoginActivity.RESPONSE_KEY, zVar);
        return new String(zVar.f14139f.e(), (Charset) this.f14396h);
    }
}
