package p000a;

import E4.k;
import com.spotify.sdk.android.auth.LoginActivity;
import java.io.InputStream;
import java.io.Reader;
import p020d2.n;
import p105t3.m;
import p126x2.A;
import p126x2.z;

/* JADX INFO: loaded from: classes.dex */
public final class h implements A {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6094h;
    public final /* synthetic */ m i;

    public /* synthetic */ h(m mVar, int i) {
        this.f6094h = i;
        this.i = mVar;
    }

    @Override // p126x2.A
    public final Object deserialize(InputStream inputStream) {
        switch (this.f6094h) {
            case 0:
                k.f("inputStream", inputStream);
                break;
            default:
                k.f("inputStream", inputStream);
                break;
        }
        return null;
    }

    @Override // p126x2.A
    public final Object deserialize(String str) {
        switch (this.f6094h) {
        }
        return null;
    }

    @Override // p126x2.A
    public final Object deserialize(byte[] bArr) {
        switch (this.f6094h) {
            case 0:
                k.f("bytes", bArr);
                break;
            default:
                k.f("bytes", bArr);
                break;
        }
        return null;
    }

    @Override // p126x2.h
    public final Object deserialize(z zVar) {
        switch (this.f6094h) {
            case 0:
                k.f(LoginActivity.RESPONSE_KEY, zVar);
                break;
            default:
                k.f(LoginActivity.RESPONSE_KEY, zVar);
                break;
        }
        return n.p(this, zVar);
    }

    @Override // p126x2.A
    public final Object deserialize(Reader reader) {
        switch (this.f6094h) {
            case 0:
                return this.i.b(reader, new g().getType());
            default:
                return this.i.b(reader, new i().getType());
        }
    }
}
