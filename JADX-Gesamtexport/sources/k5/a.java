package k5;

import B.C0031p0;
import W2.g;
import java.net.InetSocketAddress;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f9949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0031p0 f9950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f9951c;

    public a(byte[] bArr, C0031p0 c0031p0, g gVar) {
        if (c0031p0 == null) {
            throw new NullPointerException("Peer's EndpointContext must not be null");
        }
        this.f9949a = bArr;
        this.f9950b = c0031p0;
        this.f9951c = gVar;
    }

    public final InetSocketAddress a() {
        return (InetSocketAddress) this.f9950b.i;
    }

    public final void b(Exception exc) {
        Object unknownError = exc;
        if (this.f9951c != null) {
            if (exc == null) {
                unknownError = new UnknownError();
            }
            Objects.toString(unknownError);
        }
    }
}
