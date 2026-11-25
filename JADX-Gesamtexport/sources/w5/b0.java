package w5;

import B.AbstractC0013g0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements InterfaceC1067z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Q f13568b = new Q(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f13569a;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.f13569a);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 2;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 121;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            if (this.f13569a == ((b0) obj).f13569a) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return AbstractC0013g0.l(new StringBuilder("StateInfrared : brightness:"), this.f13569a, ", ");
    }
}
